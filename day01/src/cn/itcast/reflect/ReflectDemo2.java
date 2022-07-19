package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        //1.获取Person的Class对象
        Class personClass =  Person.class;
//    1.获取成员变量们
//    1.field[] getfields 获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for(Field field : fields){
            System.out.println(field);
        }
//    2.getfield(String name)
        System.out.println("-----------");
        Field a = personClass.getField("a");

//        成员变量操作
//        get和set方法
        Person p = new Person();
        Object value = a.get(p);
        System.out.println(value);
        //设置a的值
        a.set(p, "张三");
        System.out.println(p);
        System.out.println("============");
//   3.Field[] getDeclaredFields() 获取所有的成员变量，不考虑修饰付
        Field[] declaredFields = personClass.getDeclaredFields();
        for(Field declaredField:declaredFields){
            System.out.println(declaredField);
        }
//    4.Field getDeclareFields(String name) 获取单个的成员变量，可以湖绿访问权限修饰符的安全检查
        Field d = personClass.getDeclaredField("d");
//        私有被访问报错，访问前湖绿访问权限修饰符的安全检查
        d.setAccessible(true);//暴力反射
        Object value2 = d.get(p);
        System.out.println(value2);


    }

}
