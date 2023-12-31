package commands;

import services.AccountDatabaseService;
import services.DatabaseService;
import services.OperationDatabaseService;
import services.UserDatabaseService;

public class AddAdmin implements Command{

    AccountDatabaseService accountDb = AccountDatabaseService.getInstance();
    UserDatabaseService userDb = UserDatabaseService.getInstance();
    OperationDatabaseService operationDb = OperationDatabaseService.getInstance();
    DatabaseService db = DatabaseService.getInstance();

    @Override
    public String execute(String email, String[] params) {
        try {
            userDb.addAdmin(params[0], params[1], params[2], params[3]);
            return ("Operation completed");
        } catch (Exception e) {
            return ("The entered data is incorrect, please use the format 'name surname email password'");
        }
    }
}
