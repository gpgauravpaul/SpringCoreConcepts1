package Context_Packages;

import com.example.Dream.SpringConceptsBasics.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringConceptsBasicsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringConceptsBasicsApplication.class, args);
        BinarySearch bst1 = applicationContext.getBean(BinarySearch.class);




//		System.out.printf(String.valueOf(bst.Search()));
	}

}
