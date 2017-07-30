all: compile run
	@echo No errors

compile:
	kotlinc template-string.kt -include-runtime -d template-string.jar

run:
	java -jar template-string.jar
