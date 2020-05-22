import com.hyx.ioc.demo1.StudentService;
import com.hyx.ioc.demo1.impl.StudentServiceImpl;
import com.hyx.ioc.demo2.Bean;
import com.hyx.ioc.demo2.Bean2;
import com.hyx.ioc.demo3.CollectionBean;
import com.hyx.ioc.demo3.User;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDemo1 {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("user");
        System.out.println(user.sayHello("张三"));
    }
}
