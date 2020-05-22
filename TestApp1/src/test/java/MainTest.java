import com.jnshu.entity.Student;
import com.jnshu.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MainTest {
    @Resource
    private StudentService studentService;
    @Test
    public void findAll(){
        List<Student> list = studentService.findAll();
        System.out.println(list);
    }
}
