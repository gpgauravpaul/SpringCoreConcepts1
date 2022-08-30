package Singlton_and_prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch_Scope {

    @Autowired
    Sorting_Scope sorting;

    public void Search()
    {
        System.out.println(sorting);
    }

    @PostConstruct
    public void postConstruct()
    {
        System.out.println("postConstruct");
    }
    @PreDestroy
    public void preDestroy()
    {
        System.out.println("preDestroy");
    }
}
