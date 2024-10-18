import com.spring.annotation.bean.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoTypeAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.spring.annotation.bean");
        Robot robot = applicationContext.getBean("android", Robot.class);
        robot.walk(20, "Left");
    }
}
