package config;

import org.jboss.resteasy.plugins.guice.GuiceResteasyBootstrapServletContextListener;

import javax.servlet.ServletContext;
import java.util.ArrayList;
import java.util.List;

public class GuiceContextListener extends GuiceResteasyBootstrapServletContextListener {

    private final String transferUnit;

    public GuiceContextListener(String transferUnit) {
        this.transferUnit = transferUnit;
    }

    @Override
    protected List<? extends TransferModule> getModules(final ServletContext context)
    {
        final List<TransferModule> result = new ArrayList<>();
        result.add(new TransferModule());
        return result;
    }
}
