package MCustomerService;
// CustomerService.abs:8:0: 
public interface CustomerService_i extends abs.backend.java.lib.types.ABSInterface {
    // CustomerService.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_list();
    // CustomerService.abs:10:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> list();
    // CustomerService.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_create(abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address);
    // CustomerService.abs:11:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> create(abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address);
    // CustomerService.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_retrieve(abs.backend.java.lib.types.ABSString id);
    // CustomerService.abs:12:1: 
    public  MCustomerModel.Customer_i retrieve(abs.backend.java.lib.types.ABSString id);
    // CustomerService.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address);
    // CustomerService.abs:13:1: 
    public  MCustomerModel.Customer_i update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address);
    // CustomerService.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_delete(abs.backend.java.lib.types.ABSString id);
    // CustomerService.abs:14:1: 
    public  MCustomerModel.Customer_i delete(abs.backend.java.lib.types.ABSString id);
}
