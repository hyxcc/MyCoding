import com.hyx.entity.Student;
import com.hyx.service.StudentService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class TestApp {
    private static final Logger logger = Logger.getLogger(TestApp.class.getName());

    @Resource(name = "studentService")
    private StudentService studentService;
    @Test
    public void findAll() {
        List<Student> list = studentService.findAll();
//            System.out.println(list);
            logger.info(studentService.findAll().toString());
    }
    @Test
    public void findOne() {
        List<Student> student = studentService.findOne(1);
        System.out.println(student);
        logger.info("查找到一个");
    }
    @Ignore
    public void update(){

        String university= "华东理大";
        studentService.updateById(university,1L);
        logger.info("大学信息修改成功");
    }
    @Test
    public void insert(){
        Student stu = new Student();
        stu.setNumber(458);
        stu.setName("周星星");
        stu.setQq("1131023043");
        stu.setUniversity("西南财经大学");
        stu.setBrother("周正华");
        stu.setJob("PM工程师");
        stu.setLink("www.jnshu.com");
        stu.setTarget("不入IT誓不还");
        Long s = Long.valueOf(new Date().getTime());
        stu.setCreateTime(s);
        stu.setUpdateTime(s);
        studentService.insert(stu);
        logger.info("新增成功" + stu.getName());
    }
    @Ignore
    public void delete(){
        studentService.deleteById(3);
    }

}
