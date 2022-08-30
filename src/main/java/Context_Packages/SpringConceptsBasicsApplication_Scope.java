package Context_Packages;
import Singlton_and_prototype.BinarySearch_Scope;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Singlton_and_prototype")
public class SpringConceptsBasicsApplication_Scope {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConceptsBasicsApplication_Scope.class);

		BinarySearch_Scope bst1 = applicationContext.getBean(BinarySearch_Scope.class);
		System.out.println(bst1);
//		bst1.Search();

		BinarySearch_Scope bst2 = applicationContext.getBean(BinarySearch_Scope.class);
		System.out.println(bst2);
//		bst2.Search();



//		System.out.printf(String.valueOf(bst.Search()));
	}

}
