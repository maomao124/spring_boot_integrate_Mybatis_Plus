package mao.spring_boot_integrate_mybatis_plus.service.impl;

import mao.spring_boot_integrate_mybatis_plus.entity.Student;
import mao.spring_boot_integrate_mybatis_plus.mapper.StudentMapper;
import mao.spring_boot_integrate_mybatis_plus.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author mao
 * @since 2022-04-10
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService
{

}
