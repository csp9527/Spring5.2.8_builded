import com.csp.beans.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @description:
 * @author: csp
 * @email:chengsipeng@ebaolife.com
 * @createDate: 2022-09-20 9:00
 * @version: 1.0
 */
public class Main {
	public static void main(String[] args) {
		testBeanFactory();
	}

	private static void testCtx() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = ctx.getBean(User.class);
		System.out.println("user = " + user);
	}

	private static void testBeanFactory() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		User user = (User) bf.getBean("user");
		System.out.println("user = " + user);
	}
}
