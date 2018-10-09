package config;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import controller.TransferController;
import service.TransferService;
import service.TransferServiceImpl;

public class TransferModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(TransferService.class)
            .to(TransferServiceImpl.class)
            .in(Scopes.SINGLETON);
        bind(TransferController.class);
    }
}
