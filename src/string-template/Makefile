all: compile run
	@echo No errors

compile:
	kotlinc string-template.kt -include-runtime -d string-template.jar

run:
	java -jar string-template.jar
