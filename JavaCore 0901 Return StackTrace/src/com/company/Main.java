package com.company;

/*

0901 Return StackTrace
Write five methods that call each other.
Each method should return its StackTrace.

Requirements:
1. There should be 5 methods in the class (do not take into account the main method).
2. Each method should call the following: main call method1, method1 call method2, etc.
3. Each method should return its StackTrace.
4. Use Thread.currentThread (). GetStackTrace () to get StackTrace.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        method1();
    }
    public static StackTraceElement[] method1() {
        method2();
        return Thread.currentThread().getStackTrace();
    }
    public static StackTraceElement[] method2() {
        method3();
        return Thread.currentThread().getStackTrace();
    }
    public static StackTraceElement[] method3() {
        method4();
        return Thread.currentThread().getStackTrace();
    }
    public static StackTraceElement[] method4() {
        method5();
        return Thread.currentThread().getStackTrace();
    }
    public static StackTraceElement[] method5() {
        return Thread.currentThread().getStackTrace();
    }
}
