import com.xue.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();

    }
}
