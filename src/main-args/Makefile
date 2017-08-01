all: compile run
	@echo No errors

compile:
	kotlinc main-args.kt -include-runtime -d main-args.jar

run:
	java -jar main-args.jar hallo 42 welt "spannende Folge" 1.2
