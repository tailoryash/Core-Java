#include "Main.h"
#include <string.h>
#include <iostream>
JNIEXPORT void JNICALL Java_Main_hello
  (JNIEnv * env, jobject myObj, jstring name){
    std::cout << "Like and Sub" << name << std::endl;
}
int main(){}