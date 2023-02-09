CLASSES=.:`ls /cucumber/*.jar | tr '\n' ':'`

javac \
  --class-path $CLASSES  \
  --enable-preview \
  --release 14 \
  -Xlint:unchecked \
    *.java

if [ $? -eq 0 ]; then
  # run test classes even if they are inner classes
  java \
    --class-path $CLASSES \
    --enable-preview \
    org.junit.runner.JUnitCore \
    `ls -1 *Test*.class | grep -v '\\$' | sed 's/\(.*\)\..*/\1/'`
fi
