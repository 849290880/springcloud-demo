package com.example.springclouddemodockerfile.controller;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

/**
 * @author created by hai on 2020/3/9
 */
public class Test {

    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int result = compiler.run(null, null, null, "G:\\test\\Test.java");
        System.out.println(result);
    }

}
