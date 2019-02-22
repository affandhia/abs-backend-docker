package MAccountDbImpl;
// AccountDb.abs:8:0: 
public interface AccountDb_i extends abs.backend.java.lib.types.ABSInterface {
    // AccountDb.abs:9:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_findAll(abs.backend.java.lib.types.ABSString className);
    // AccountDb.abs:9:1: 
    public  ABS.StdLib.List<MAccountModel.Account_i> findAll(abs.backend.java.lib.types.ABSString className);
    // AccountDb.abs:10:1: 
    public  abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AccountDb.abs:10:1: 
    public  ABS.StdLib.List<MAccountModel.Account_i> findAllByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AccountDb.abs:11:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_find(abs.backend.java.lib.types.ABSString className);
    // AccountDb.abs:11:1: 
    public  MAccountModel.Account_i find(abs.backend.java.lib.types.ABSString className);
    // AccountDb.abs:12:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AccountDb.abs:12:1: 
    public  MAccountModel.Account_i findByAttributes(abs.backend.java.lib.types.ABSString className, abs.backend.java.lib.types.ABSString query);
    // AccountDb.abs:13:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_save(MAccountModel.Account_i object);
    // AccountDb.abs:13:1: 
    public  abs.backend.java.lib.types.ABSUnit save(MAccountModel.Account_i object);
    // AccountDb.abs:14:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(MAccountModel.Account_i object);
    // AccountDb.abs:14:1: 
    public  abs.backend.java.lib.types.ABSUnit delete(MAccountModel.Account_i object);
    // AccountDb.abs:15:1: 
    public  abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(MAccountModel.Account_i object);
    // AccountDb.abs:15:1: 
    public  MAccountModel.Account_i update(MAccountModel.Account_i object);
    // AccountDb.abs:16:1: 
    public  abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_log(abs.backend.java.lib.types.ABSString log);
    // AccountDb.abs:16:1: 
    public  abs.backend.java.lib.types.ABSString log(abs.backend.java.lib.types.ABSString log);
}
