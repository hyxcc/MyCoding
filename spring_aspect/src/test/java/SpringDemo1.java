import com.hyx.aspectJ.demo1.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo1 {
    @Resource(name = "productDao")
    private ProductDao productDao;
    @Test
    public void demo1(){
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.find();
        productDao.findAll();
    }
}
