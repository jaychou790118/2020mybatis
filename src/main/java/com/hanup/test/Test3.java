package com.hanup.test;

import com.hanup.repository.ClassesRepository;
import com.hanup.repository.CustomerRepository;
import com.hanup.repository.GoodsRepository;
import com.hanup.repository.StudentRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class Test3 {

    public static void main(String[] args) {
        //加载MyBatis配置文件
        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        StudentRepository studentRepository=sqlSession.getMapper(StudentRepository.class);
//        System.out.println(studentRepository.findById(1L));

//        ClassesRepository classesRepository =sqlSession.getMapper(ClassesRepository.class);
//        System.out.println(classesRepository.findById(2L));



//        CustomerRepository customerRepository = sqlSession.getMapper(CustomerRepository.class);
//        System.out.println(customerRepository.findById(1L));

        GoodsRepository goodsRepository=sqlSession.getMapper(GoodsRepository.class);
        System.out.println(goodsRepository.findById(1L));

        sqlSession.close();






    }

}
