package MCustomerResource;
// CustomerResource.abs:8:0: 
public interface CustomerResource_i extends abs.backend.java.lib.types.ABSInterface {
    // CustomerResource.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_list(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:10:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> list(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_retrieve(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:11:1: 
    public  MCustomerModel.Customer_i retrieve(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_update(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:12:1: 
    public  MCustomerModel.Customer_i update(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_create(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:13:1: 
    public  ABS.StdLib.List<MCustomerModel.Customer_i> create(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(ABS.Framework.Http.ABSHttpRequest_i request);
    // CustomerResource.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(ABS.Framework.Http.ABSHttpRequest_i request);
}
