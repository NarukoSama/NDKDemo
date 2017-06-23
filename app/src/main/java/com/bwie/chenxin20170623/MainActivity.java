package com.bwie.chenxin20170623;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//cd app/   cd src/   cd main/   cd jni/   ndk-build


//LOCAL_SRC_FILES := str.c  指定要编译的C文件
//LOCAL_MODULE := str1   生成so文件名称



//build.gradel 中 ， 加两个 ：jniLibs.srcDirs=['libs']   和  ndk（libs下编译了，可以不用加）


//JNIEXPORT jstring JNICALL Java_xunqaing_bwie_com_ndkdemo_MainActivity_getKey  改成自己的包名

//gradle.properties 里粘贴 android.useDeprecatedNdk=true

//app --- src 下的libs 复制出来粘贴在 app 下的 libs编译

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);

//        Toast.makeText(this, ""+getKey(0), Toast.LENGTH_SHORT).show();
        tv.setText(getKey(0));

    }

    static{

        System.loadLibrary("str");

    }

    public native String getKey(int key);
}
