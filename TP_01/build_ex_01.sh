#! /bin/sh

javac -sourcepath ./EX_01_02/src/ EX_01_02/src/Author/Test.java -d ./build

java -cp ./build/ Author.Test

rm ./build/ -rf
