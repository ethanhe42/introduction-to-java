## 第4次作业：
### 1. 类、抽象类和接口有什么区别？

#### 普通类
1. 普通类关键字可以是public , private 等；
2. 普通类的方法可以有主体。
3. 普通类不需要被继承时、子类必须实现它的所有方法。
4. 普通类不应用多态

#### 抽象类
1. 抽象方法，只有行为的概念，没有具体的行为实现。
2. 包含抽象方法的类，就一定是抽象类。
3. 抽象类不能直接创建实例。可以定义引用变量。
4. 抽象类只能被继承，一个具体类继承一个抽象类，必须实现所有抽象方法。  
5. 抽象方法和抽象类非常适合作为系统的分析和设计的工具。

#### 接口
1. 全部的方法都是抽象方法，全部的属性都是常量。接口用来表示纯抽象概念，没有任何具体的方法和属性。
2. 不能实例化，可以定义变量。
3. 接口变量可以引用具体实现类的实例。
4. 接口只能被实现(继承)，一个具体类实现接口，必须使用全部的抽象方法。
5. 接口之间可以继承。
6. 一个具体类可以实现多个接口，实现多继承现象，表示：
7. 接口中的属性，默认是常量 public static final 
8. 接中的方法一定是:public abstract 
9. 实现一个接口，使用关键字implements, 实现实际上是一种继承关系。接口和实现类是父子类型的关系
   
### 2. 类与类、类与抽象类、抽象类与类、接口与接口之间如何继承？
1. 接口可以继承接口，但是不能实现接口，原因就是接口不能有实体方法，
2. 抽象类可以实现接口，抽象类可以有实体方法，
3. 抽象类也可以继承实体类，实体类不能是final类型
4. 类可以继承类,抽象类,实现接口，被继承的实体类不能是final类型

### 3. 类与接口、抽象类与接口之间如何实现？
- 接口和实现类通过implements关键字关联起来。 public class A implements interfaceA
- 想用接口中个别方法的时候, 那么可以用抽象类先实现这个接口.

```java
interface i{
       public void a();
       public void b();
       public void c();
}
abstract class ac implements i{
       public void a(){}
       public void b(){}
}
```

### 4.线程是什么？
线程是进程中的一个实体，是被系统独立调度和分派的基本单位，线程自己不拥有系统资源，只拥有一点在运行中必不可少的资源，但它可与同属一个进程的其它线程共享进程所拥有的全部资源。一个线程可以创建和撤消另一个线程，同一进程中的多个线程之间可以并发执行。由于线程之间的相互制约，致使线程在运行中呈现出间断性。线程也有就绪、阻塞和运行三种基本状态。 

### 5.线程程序与普通程序有何主要区别？
一个程序至少有一个进程,一个进程至少有一个线程. 普通程序是单线程的，一个一个语句执行。而线程开了之后，几个线程是可以平行工作的。

### 6. 什么是文件输入输出流？
文件输入与输出以流的形式进行，同时根据内容不同分为字节和字符两种 字节流的读取与写入
读取步骤：File→FileInputStream→f.read(bytes) 写入步骤：File→FileOutputStream→f.write(bytes)
字符的读取和写入 
文件字符流：FileReader→f.read(c);  FileReader→BufferedReader→f.readLine();  File→FileReader→BufferedReader→reader.readLine();
### 7. 什么是字节输入输出流、字符输入输出流？
##### 字节输入输出流
字节和二进制文件用字节类
字节流中的两个顶层类为：InputStream(输入字节流）和OutputStream(输出字节流）， 其下有两个子类FileInputStream(文件输入流），FileOutputStream(文件输出流）。
##### 字符输入输出流
处理字符和字符串用字符流类， 字符流层主要有Reader和Writer两个顶层的抽象类，其中有两个字类，即FileReader和FileWriter类。

### 8. 什么是结点输入输出流、过滤输入输出流？
- 节点流用于直接操作目标设备的流， 
- 过滤流是对一个已存在的流的链接和封装，通过对数据进行处理为程序提供功能强大、灵活的读写功能。

### 9. 读文本文件的常用类和方法有哪些？写文本文件的常用类和方法有哪些？
##### 读取
- FileInputStream， 以字节为单位的流处理。 Read（），read（byte[] b），read（byte[],int off,int len）,available();
- FileReader， read
- BufferedReader， readLine
- InputStreamReader，  getEncoding()，read(); 

##### 写文件
- FileWriter， write， 追加内容：new FileWriter(fileName,true);
- BufferedWriter， write
- FileOutputStream, write
- OutputStreamWriter, write

