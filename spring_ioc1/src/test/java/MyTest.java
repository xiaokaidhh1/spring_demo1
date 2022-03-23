import com.kai.user.User;
import com.kai.user.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  @Test
        public void test01(){
      //获取上下文对象
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      //从容器中取对象
      UserT user= (UserT) context.getBean("usert");
      System.out.println(user);

  }

}
