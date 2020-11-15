#! /bin/sh

javac -sourcepath ./EX_01_02/src/ EX_01_02/src/Book/Test.java -d ./build

java -cp ./build/ Book.Test

rm ./build/ -rf
