JCC = javac
JFLAGS = -g

default: Name.class Main.class

Name.class: Name.java
	$(JCC) $(JFLAGS) Name.java

Main.class: Main.java
	$(JCC) $(JFLAGS) Main.java
	jar -cfv Name.jar Main.java Name.java Main.class Name.class

clean:
	rm *.class Name.jar