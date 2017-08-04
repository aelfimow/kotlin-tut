all: compile run
	@echo No errors

compile:
	kotlinc when-expr.kt -include-runtime -d when-expr.jar

run:
	java -jar when-expr.jar A B C D E F G
