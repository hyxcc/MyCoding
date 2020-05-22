
import com.hyx.dao.demo2.StudentDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
//@RunWith是声明一个运行器， @RunWith(SpringJUnit4ClassRunner.class)就是指使用Spring的JUnit4来运行
//@ContextConfiguration这个注解通常与@RunWith(SpringJUnit4ClassRunner.class)联合使用用来测试，用来注入测试需要的spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class UserTest {

    @Resource(name="studentProxy")
    private StudentDao studentDao;
    @Test
    public void test(){
        studentDao.update();
        studentDao.save();
        studentDao.find();
        studentDao.delete();
    }

}
