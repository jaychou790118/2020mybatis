package com.hanup.test;

import com.hanup.entity.Account;
import com.hanup.repository.AccountRepository;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.sound.midi.Soundbank;
import java.io.InputStream;
import java.sql.SQLOutput;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        InputStream inputStream = Test.class.getClassLoader().getResourceAsStream("config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //获取实现接口的代理对象
        AccountRepository accountRepository =sqlSession.getMapper(AccountRepository.class);
//        List<Account> list = accountRepository.findAll();
//        for (Account account:list){
//            System.out.println(account);
//        }

//        添加对象
//        Account account = new Account(2L,"李四","12323",23);
//        accountRepository.save(account);
//        sqlSession.commit();
//        sqlSession.close();

//        通过id查询
//        Account account=accountRepository.findById(1L);
//        System.out.println(account);
//        sqlSession.close();
//
        //修改对象
//        Account account = accountRepository.findById(1L);
//        account.setUsername("小强");
//        account.setPassword("000");
//        account.setAge(18);
//        int result = accountRepository.update(account);
//        System.out.println(result);
//        sqlSession.close();


//        // 通过Id删除
//        int result = accountRepository.deleteById(3L);
//        System.out.println(result);
//        sqlSession.commit();
//        sqlSession.close();

//         String类，通过name查找Account
//        System.out.println(accountRepository.findByName("张三"));
//        sqlSession.close();

//          包装类，通过id查找Account
//        Long id =Long.parseLong("1");
//        System.out.println(accountRepository.findById2(id));
//        sqlSession.close();


//        System.out.println(accountRepository.findByNameAndAge("张三",22));
//        sqlSession.close();

//        基本类型，统计Account 总数
//        System.out.println(accountRepository.count());
//        sqlSession.close();

//        包装类统计Account 总数
//        System.out.println(accountRepository.count2());
//        sqlSession.close();

//        String类型，通过Id查找Name
//        System.out.println(accountRepository.findNameById(1L));
//        sqlSession.close();


    }
}
