import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorldActivator implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.printf("HelloWorld Bundle Start!");
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.printf("HelloWorld Bundle Stop!");
    }
}
