package Singlton_and_prototype;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
//@Primary
@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class QuickSort_Scope implements Sorting_Scope {

    @Override
    public QuickSort_Scope sort() {

        return new QuickSort_Scope();
    }
}
