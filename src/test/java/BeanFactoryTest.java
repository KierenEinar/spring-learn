import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import spring.learn.beans.MyTestBean;
/**
 * Created by kieren on 18/1/22.
 */
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad () {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("BeanFactoryTest.xml"));
        MyTestBean myTestBean =(MyTestBean) beanFactory.getBean("myTestBean");
        System.out.println(myTestBean.getName());
    }
}
