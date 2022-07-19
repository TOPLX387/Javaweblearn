package cn.itcast.reflect;

import cn.itcast.domain.Person;

import javax.sound.midi.Synthesizer;

public class ReflectDemo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forname("全类名")
        Class cls1 = Class.forName("cn.itcast.domain.Person");
        System.out.println(cls1);
        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3.类名.getclass
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);


        //用==去比较三个对象
        System.out.println(cls1==cls2);//true
        System.out.println(cls1==cls3);//true
//        结论：同一个字节码文件一次程序运行中只会被加载一次，不论哪一种方式获取的对象都是同一个
    }
}
