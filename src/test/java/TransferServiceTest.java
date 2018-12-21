import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TransferServiceTest {

    @Inject
    private TransferServiceImpl service;


    @Before
    public void setUp() {
        Injector injector = Guice.createInjector(new TransferModule());
        injector.injectMembers(this);
    }

    @Test
    public void testCorrectMoneyTransfer() {
        service.transfer(1, 2, 200);
        Assert.assertEquals(service.getAccount(1).getBalance(), 800);
        Assert.assertEquals(service.getAccount(2).getBalance(), 1200);
    }

    @Test
    public void testCorrectMoneyTransferAllAccount1Money() {
        service.transfer(1, 2, service.getAccount(1).getBalance());
        Assert.assertEquals(service.getAccount(1).getBalance(), 0);
        Assert.assertEquals(service.getAccount(2).getBalance(), 2000);
    }

    @Test(expected = NotEnoughMoney.class)
    public void testCatchNotEnoughMoneyException() {
        service.transfer(1, 2, 1300);
    }
}
