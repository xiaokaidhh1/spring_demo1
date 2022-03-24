import com.kai.service.Printer;
import com.kai.service.impl.HpPrinter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Printer pt =context.getBean(Printer.class);
        pt.print("好思政课,习近平这样强调全国人大常委会对环境保护法开展执法检查汪洋会见阿曼协商会议主席马瓦利赵乐际:高质量完成巡视全覆盖任务 巡视对象中办国办:构建更高水平全民健身公共服务体系");
    }
}
