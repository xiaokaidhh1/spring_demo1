import com.kai.service.UserService;
import com.kai.service.UserServicelmpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest02 {
    @Test
        public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            //动态代理代理的是接口
            UserService userService = (UserService) context.getBean("userService");
            userService.select();
        }
    }

