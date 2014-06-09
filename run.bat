javac -Xlint:unchecked -cp .;lib/* -d bin %1.java
java  -cp .;lib/*;bin/ %1
pause