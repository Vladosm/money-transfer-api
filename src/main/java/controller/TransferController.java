package controller;

import com.google.inject.Inject;
import service.TransferService;

import javax.ws.rs.*;

@Path("/money-transfer-api")
public class TransferController {

    @Inject
    private TransferService transferService;

    @POST
    @Path("/transfer/{from}/{to}/{amount}")
    public String transfer(@PathParam("from") int from, @PathParam("to") int to, @PathParam("amount") int amount) {
        transferService.transfer(from, to, amount);
        return String.format("Money successfully transfered! \nAccount #%d balance is : %d\nAccount #%d balance is : %d\n",
                from, transferService.getAccount(from).getBalance(), to, transferService.getAccount(to).getBalance());
    }
}
