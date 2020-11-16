#! /bin/sh

javac -sourcepath ./EX_03/src/ EX_03/src/Person/Test.java -d ./build

java -cp ./build/ Person.Test

rm ./build/ -rf
