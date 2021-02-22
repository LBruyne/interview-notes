## Java

#### 垃圾回收机制

- 标记清除
- 复制算法

- 标记压缩
- 分代收集



#### volatile和synchronized

（1）volatile修饰的变量，jvm每次都从主存（主内存）中读取，而不会从寄存器（工作内存）中读取。

而synchronized则是锁住当前变量，同一时刻只有一个线程能够访问当前变量

（2）volatile仅能用在变量级别，而synchronized可用在变量和方法中

（3）volatie仅能实现变量的修改可见性，无法保证变量操作的原子性。而synchronized可以实现变量的修改可见性与原子性