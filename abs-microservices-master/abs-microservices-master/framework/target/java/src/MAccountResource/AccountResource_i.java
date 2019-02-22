package MAccountResource;
// AccountResource.abs:8:0: 
public interface AccountResource_i extends abs.backend.java.lib.types.ABSInterface {
    // AccountResource.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_list(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:10:1: 
    public  ABS.StdLib.List<MAccountModel.Account_i> list(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_retrieve(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:11:1: 
    public  MAccountModel.Account_i retrieve(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:12:1: 
    public  MAccountModel.Account_i update(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_create(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:13:1: 
    public  MAccountModel.Account_i create(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(ABS.Framework.Http.ABSHttpRequest_i request);
    // AccountResource.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(ABS.Framework.Http.ABSHttpRequest_i request);
}
