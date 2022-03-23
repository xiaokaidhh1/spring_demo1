import com.kai.pojo.Stduent;
import com.kai.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest2 {
    @Test
    public void test1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Stduent stduent = (Stduent) applicationContext.getBean("student");
        System.out.println(stduent);
    }
    @Test
    public void test2(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }
    @Test
    public void test3(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = (User) applicationContext.getBean("user2");
        System.out.println(user);
    }
}
