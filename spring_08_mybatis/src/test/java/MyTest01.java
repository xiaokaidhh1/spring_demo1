import com.kai.mapper.DianYingMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    @Test
    public void Test01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DianYingMapper mapper = context.getBean("dianYingMapper", DianYingMapper.class);
        System.out.println(mapper.selectAll());
    }
}
