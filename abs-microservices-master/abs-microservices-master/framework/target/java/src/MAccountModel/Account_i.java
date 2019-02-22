package MAccountModel;
// Account.abs:5:0: 
public interface Account_i extends abs.backend.java.lib.types.ABSInterface {
    // Account.abs:6:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_deposit(abs.backend.java.lib.types.ABSInteger x);
    // Account.abs:6:1: 
    public  abs.backend.java.lib.types.ABSInteger deposit(abs.backend.java.lib.types.ABSInteger x);
    // Account.abs:7:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_withdraw(abs.backend.java.lib.types.ABSInteger y);
    // Account.abs:7:1: 
    public  abs.backend.java.lib.types.ABSInteger withdraw(abs.backend.java.lib.types.ABSInteger y);
    // Account.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getId();
    // Account.abs:9:1: 
    public  abs.backend.java.lib.types.ABSInteger getId();
    // Account.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getBalance();
    // Account.abs:10:1: 
    public  abs.backend.java.lib.types.ABSInteger getBalance();
    // Account.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getCustomerId();
    // Account.abs:11:1: 
    public  abs.backend.java.lib.types.ABSInteger getCustomerId();
    // Account.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getRekening();
    // Account.abs:12:1: 
    public  abs.backend.java.lib.types.ABSString getRekening();
    // Account.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setId(abs.backend.java.lib.types.ABSInteger id);
    // Account.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit setId(abs.backend.java.lib.types.ABSInteger id);
    // Account.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setBalance(abs.backend.java.lib.types.ABSInteger balance);
    // Account.abs:15:1: 
    public  abs.backend.java.lib.types.ABSUnit setBalance(abs.backend.java.lib.types.ABSInteger balance);
    // Account.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setRekening(abs.backend.java.lib.types.ABSString rekening);
    // Account.abs:16:1: 
    public  abs.backend.java.lib.types.ABSUnit setRekening(abs.backend.java.lib.types.ABSString rekening);
    // Account.abs:17:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setCustomerId(abs.backend.java.lib.types.ABSInteger customerId);
    // Account.abs:17:1: 
    public  abs.backend.java.lib.types.ABSUnit setCustomerId(abs.backend.java.lib.types.ABSInteger customerId);
    // DType.abs:16:6: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setInterest(abs.backend.java.lib.types.ABSInteger x);
    // DType.abs:16:6: 
    public  abs.backend.java.lib.types.ABSUnit setInterest(abs.backend.java.lib.types.ABSInteger x);
    // DType.abs:17:6: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getInterest();
    // DType.abs:17:6: 
    public  abs.backend.java.lib.types.ABSInteger getInterest();
}
