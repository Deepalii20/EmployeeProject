
package com.example.spring.SpringProj1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Student stobj=(Student)ctx.getBean("st");
        System.out.println(stobj);
        
        JavaTeacher javaobj=(JavaTeacher)ctx.getBean("j1");
        System.out.println(javaobj);
        
        SqlTeacher sqlobj=(SqlTeacher)ctx.getBean("s1");
        System.out.println(sqlobj);
        
        PythonTeacher pythonobj=(PythonTeacher)ctx.getBean("p1");
        System.out.println(pythonobj);
    }
}
