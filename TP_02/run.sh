#! /bin/sh

javac StudentsForm.java -d ./build

java -cp ./build/ StudentsForm

rm ./build/ -rf
