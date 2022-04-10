package mao.spring_boot_integrate_mybatis_plus.mapper;

import mao.spring_boot_integrate_mybatis_plus.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author mao
 * @since 2022-04-10
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student>
{

}
