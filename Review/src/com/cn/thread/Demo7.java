package com.cn.thread;

public class Demo7 {
    public static void main(String[] args) {
          final PrinterB p = new PrinterB();
          new Thread(){
                 public void run() {
                        while(true){
                              try {
                                     p.print1();              //内部类在调用所在类的成员变量时，只能调用被final修饰的成员变量
                              } catch (InterruptedException e) {
                                     
                                     e.printStackTrace();
                              }         
                        }
                 };
          }.start();
          new Thread(){
                 public void run() {
                        while(true){
                              try {
                                     p.print2();              //内部类在调用所在类的成员变量时，只能调用被final修饰的成员变量
                              } catch (InterruptedException e) {
                                     
                                     e.printStackTrace();
                              }        
                        }
                 };
          }.start();
          new Thread(){
                 public void run() {
                        while(true){
                              try {
                                     p.print3();              //内部类在调用所在类的成员变量时，只能调用被final修饰的成员变量
                              } catch (InterruptedException e) {
                                     
                                     e.printStackTrace();
                              }        
                        }
                 };
          }.start();
    }
}
