package MAccountResource;
// AccountResource.abs:17:0: 
public final class AccountResourceImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MAccountResource.AccountResource_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public AccountResourceImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountResourceImpl"; }
    public static final <T extends AccountResourceImpl_c> T createNewCOG() { return (T)AccountResourceImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountResourceImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountResourceImpl_c.class) : __ABS_runtime.createCOG(AccountResourceImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountResourceImpl_c __ABS_result = new AccountResourceImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountResourceImpl_c> T createNewObject() { return (T)AccountResourceImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountResourceImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountResourceImpl_c __ABS_result = new AccountResourceImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_list(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "list";
                }
                public Object execute() {
                    return target.list(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final ABS.StdLib.List<MAccountModel.Account_i> list(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",21);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",22);
            ABS.StdLib.List<MAccountModel.Account_i> accounts = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).list();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accounts",accounts);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",23);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return accounts;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_create(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "create";
                }
                public Object execute() {
                    return target.create(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final MAccountModel.Account_i create(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",28);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",29);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",31);
            abs.backend.java.lib.types.ABSString b = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("balance"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("b",b);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",32);
            abs.backend.java.lib.types.ABSInteger balance = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(b);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("balance",balance);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",34);
            abs.backend.java.lib.types.ABSString rekening = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("rekening"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("rekening",rekening);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",36);
            abs.backend.java.lib.types.ABSString cId = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("customerId"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("cId",cId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",37);
            abs.backend.java.lib.types.ABSInteger customerId = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(cId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerId",customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",39);
            MAccountModel.Account_i acc = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).create(balance, rekening, customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("acc",acc);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",41);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return acc;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_retrieve(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "retrieve";
                }
                public Object execute() {
                    return target.retrieve(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final MAccountModel.Account_i retrieve(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "retrieve");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",46);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",48);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",49);
            MAccountModel.Account_i acc = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).retrieve(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("acc",acc);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",51);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return acc;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final MAccountModel.Account_i update(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",56);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",57);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",59);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",61);
            abs.backend.java.lib.types.ABSString b = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("balance"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("b",b);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",62);
            abs.backend.java.lib.types.ABSInteger balance = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(b);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("balance",balance);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",64);
            abs.backend.java.lib.types.ABSString rekening = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("rekening"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("rekening",rekening);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",66);
            abs.backend.java.lib.types.ABSString cId = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("customerId"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("cId",cId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",67);
            abs.backend.java.lib.types.ABSInteger customerId = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(cId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerId",customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",69);
            MAccountModel.Account_i acc = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).update(id, balance, rekening, customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("acc",acc);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",71);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return acc;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "delete";
                }
                public Object execute() {
                    return target.delete(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",76);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",78);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",79);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).delete(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_withdraw(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "withdraw";
                }
                public Object execute() {
                    return target.withdraw(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final MAccountModel.Account_i withdraw(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "withdraw");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",84);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",85);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",87);
            abs.backend.java.lib.types.ABSString amnt = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("amount"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("amnt",amnt);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",88);
            abs.backend.java.lib.types.ABSInteger amount = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(amnt);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("amount",amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",90);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",91);
            MAccountModel.Account_i acc = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).withdraw(id, amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("acc",acc);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",93);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return acc;
        }
    }
    // AccountResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_deposit(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountResource.AccountResourceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                ABS.Framework.Http.ABSHttpRequest_i arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(ABS.Framework.Http.ABSHttpRequest_i _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "deposit";
                }
                public Object execute() {
                    return target.deposit(arg0
                    );
                }
            }.init(request))
        ;
    }
    // AccountResource.abs:0:0: 
    public final MAccountModel.Account_i deposit(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "deposit");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",98);
            MAccountService.AccountService_i accountService = MAccountService.AccountServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accountService",accountService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",99);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",101);
            abs.backend.java.lib.types.ABSString amnt = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("amount"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("amnt",amnt);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",102);
            abs.backend.java.lib.types.ABSInteger amount = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(utility).stringToInteger(amnt);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("amount",amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",104);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",105);
            MAccountModel.Account_i acc = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(accountService).deposit(id, amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("acc",acc);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\AccountResource.abs",107);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return acc;
        }
    }
}
