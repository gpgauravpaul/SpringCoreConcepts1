package Context_Packages;

import Singlton_and_prototype.BinarySearch_Scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("Singlton_and_prototype")
public class SpringConceptsBasicsApplication_Scope {

	private static Logger log = LoggerFactory.getLogger(SpringConceptsBasicsApplication_Scope.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringConceptsBasicsApplication_Scope.class, args);

		BinarySearch_Scope bst1 = applicationContext.getBean(BinarySearch_Scope.class);
		System.out.println(bst1);
//		bst1.Search();

		BinarySearch_Scope bst2 = applicationContext.getBean(BinarySearch_Scope.class);
		System.out.println(bst2);
//		bst2.Search();



//		System.out.printf(String.valueOf(bst.Search()));
	}

}
