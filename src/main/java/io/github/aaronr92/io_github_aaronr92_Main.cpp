#include "io_github_aaronr92_Main.h"

JNIEXPORT jint JNICALL Java_io_github_aaronr92_Main_addNum(JNIEnv *env, jobject obj, jint a, jint b)
{
    return a + b;
}