package MAccountService;
// AccountService.abs:8:0: 
public interface AccountService_i extends abs.backend.java.lib.types.ABSInterface {
    // AccountService.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_list();
    // AccountService.abs:10:1: 
    public  ABS.StdLib.List<MAccountModel.Account_i> list();
    // AccountService.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_create(abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId);
    // AccountService.abs:11:1: 
    public  MAccountModel.Account_i create(abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId);
    // AccountService.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_retrieve(abs.backend.java.lib.types.ABSString id);
    // AccountService.abs:12:1: 
    public  MAccountModel.Account_i retrieve(abs.backend.java.lib.types.ABSString id);
    // AccountService.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId);
    // AccountService.abs:13:1: 
    public  MAccountModel.Account_i update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId);
    // AccountService.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_delete(abs.backend.java.lib.types.ABSString id);
    // AccountService.abs:14:1: 
    public  MAccountModel.Account_i delete(abs.backend.java.lib.types.ABSString id);
    // AccountService.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_withdraw(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount);
    // AccountService.abs:15:1: 
    public  MAccountModel.Account_i withdraw(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount);
    // AccountService.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_deposit(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount);
    // AccountService.abs:16:1: 
    public  MAccountModel.Account_i deposit(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount);
}
