学习笔记
一、了解字节码指令，通过javac -verbose，了解每行指令的含义
二、JVM加载器
    1、掌握类的加载过程、三种类加载器及类加载器的特点
    2、学会使用自定义加载器，可以在模块化或者加密的使用场景下使用
    3、了解添加引用类的集中方式
三、内存模型，了解栈、堆的结构，熟悉栈、堆、非堆的组成部分
四、了解JVM参数
    -启动参数,-server/-client
    -D环境变量
    -X标准参数，-XMS/-XMX/-XMN/-XSS
    -XX,GC相关参数等
五、jdk内置命令
    jps -mlv，进程参数
    jstat -gc pid 1000 1000，查看堆、GC的情况
    jmap -head pid
    jstack
六、jdk图形化工具
    了解并使用jmc
七、GC
    1、引用计数法和可达性算法判断对象是否存在
    2、GC的三种收集方法，标记清楚、标记复制、标记清楚压缩
    3、串行与并行GC和常用参数、内存分配
    4、CMS和G1区别及特点，GC选择
