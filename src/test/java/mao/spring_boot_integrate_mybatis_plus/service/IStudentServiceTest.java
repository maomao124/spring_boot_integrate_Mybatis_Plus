package mao.spring_boot_integrate_mybatis_plus.service;

import mao.spring_boot_integrate_mybatis_plus.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：spring_boot_integrate_Mybatis_Plus
 * Package(包名): mao.spring_boot_integrate_mybatis_plus.service
 * Class(测试类名): IStudentServiceTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/10
 * Time(创建时间)： 13:26
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class IStudentServiceTest
{
    @Autowired
    private IStudentService iStudentService;

    @Test
    public void test1()
    {
        List<Student> list = iStudentService.list();
        for (Student student : list)
        {
            System.out.println(student);
        }
    }
}