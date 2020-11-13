#! /bin/sh

javac -sourcepath ./EX_01/src/ EX_01/src/AuthorTest.java -d ./build

java -cp ./build/ AuthorTest

rm ./build/ -rf
