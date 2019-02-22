package MCustomerDbImpl;
// CustomerDb.abs:8:0: 
public interface CustomerDb_i extends abs.backend.java.lib.types.ABSInterface {
    // CustomerDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // CustomerDb.abs:9:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> findAll(abs.backend.java.lib.types.ABSString className);
    // CustomerDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // CustomerDb.abs:10:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // CustomerDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_find(abs.backend.java.lib.types.ABSString className);
    // CustomerDb.abs:11:1: 
    public  MCustomerModel.Customer_i find(abs.backend.java.lib.types.ABSString className);
    // CustomerDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // CustomerDb.abs:12:1: 
    public  MCustomerModel.Customer_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // CustomerDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MCustomerModel.Customer_i object);
    // CustomerDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MCustomerModel.Customer_i object);
    // CustomerDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MCustomerModel.Customer_i object);
    // CustomerDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MCustomerModel.Customer_i object);
    // CustomerDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_update(MCustomerModel.Customer_i object);
    // CustomerDb.abs:15:1: 
    public  MCustomerModel.Customer_i update(MCustomerModel.Customer_i object);
    // CustomerDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // CustomerDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
