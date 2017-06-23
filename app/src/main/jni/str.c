#include <stdio.h>
#include "str.h"
#include <jni.h>

JNIEXPORT jstring JNICALL Java_com_bwie_chenxin20170623_MainActivity_getKey
(JNIEnv *env, jclass obj,jint str)
{
	switch (str) {
		case 1:
		//返回的字符串
			 return (*env)->NewStringUTF(env, "1111111");
			break;
		case 2:
			return (*env)->NewStringUTF(env, "2222222");
			break;
		default:
			 return (*env)->NewStringUTF(env, "3333333");
			break;
	}

}
