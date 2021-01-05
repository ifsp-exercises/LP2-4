#! /bin/sh

javac -sourcepath ./Calculadora Calculadora/Calculadora.java -d ./build

java -cp ./build/ Calculadora/Calculadora

rm ./build/ -rf
