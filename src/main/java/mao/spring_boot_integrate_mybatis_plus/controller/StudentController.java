package mao.spring_boot_integrate_mybatis_plus.controller;


import mao.spring_boot_integrate_mybatis_plus.entity.Student;
import mao.spring_boot_integrate_mybatis_plus.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author mao
 * @since 2022-04-10
 */
@Controller
@RequestMapping("")
public class StudentController
{
    @Autowired
    IStudentService iStudentService;

//    @RequestMapping("/select")
//    public String selectAll(Model model)
//    {
//        List<Student> list = iStudentService.list();
//        model.addAttribute("list", list);
//        return "display";
//    }
//
//    @RequestMapping("insert")
//    public String insert()
//    {
//        return "insert";
//    }
//
//    @RequestMapping(value = "insert_handler", method = RequestMethod.POST)
//    public String insert_handler(Student student)
//    {
//        //System.out.println(student);
//        boolean b = iStudentService.save(student);
//        if (b)
//        {
//            return "success";
//        }
//        else
//        {
//            return "error";
//        }
//    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(Model model)
    {
        return "测试成功";
    }

    @RequestMapping("/test1")

    public String test1(Model model)
    {
        return "test";
    }
}

