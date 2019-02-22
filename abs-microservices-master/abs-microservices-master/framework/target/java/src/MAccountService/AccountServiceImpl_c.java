package MAccountService;
// AccountService.abs:19:0: 
public final class AccountServiceImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MAccountService.AccountService_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public AccountServiceImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountServiceImpl"; }
    public static final <T extends AccountServiceImpl_c> T createNewCOG() { return (T)AccountServiceImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountServiceImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountServiceImpl_c.class) : __ABS_runtime.createCOG(AccountServiceImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountServiceImpl_c __ABS_result = new AccountServiceImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountServiceImpl_c> T createNewObject() { return (T)AccountServiceImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountServiceImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountServiceImpl_c __ABS_result = new AccountServiceImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MAccountModel.Account_i>> async_list() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                    });
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init() {
                    return this;
                }
                public java.lang.String methodName() {
                    return "list";
                }
                public Object execute() {
                    return target.list();
                }
            }.init())
        ;
    }
    // AccountService.abs:0:0: 
    public final ABS.StdLib.List<MAccountModel.Account_i> list() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",24);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",26);
            ABS.StdLib.List<MAccountModel.Account_i> accounts = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("accounts",accounts);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",28);
            ABS.StdLib.List<MAccountModel.Account_i> account_list = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account_list",account_list);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",30);
            abs.backend.java.lib.types.ABSInteger index = abs.backend.java.lib.types.ABSInteger.fromString("0");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index",index);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",31);
            while (abs.backend.java.lib.expr.BinOp.lt(index,ABS.StdLib.length_f.apply(accounts)).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",31);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",32);
                MAccountModel.Account_i p = ABS.StdLib.nth_f.apply(accounts, index);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("p",p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",33);
                account_list = ABS.StdLib.appendright_f.apply(account_list, p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("account_list", account_list);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",34);
                index = index.add(abs.backend.java.lib.types.ABSInteger.fromString("1"));
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index", index);}
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",37);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return account_list;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_create(abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                abs.backend.java.lib.types.ABSString arg1;
                abs.backend.java.lib.types.ABSInteger arg2;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0,abs.backend.java.lib.types.ABSString _arg1,abs.backend.java.lib.types.ABSInteger _arg2) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    return this;
                }
                public java.lang.String methodName() {
                    return "create";
                }
                public Object execute() {
                    return target.create(arg0
                    .truncate(),arg1
                    ,arg2
                    .truncate());
                }
            }.init(balance, rekening, customerId))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i create(abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("balance",balance);
            __ABS_currentTask.setLocalVariable("rekening",rekening);
            __ABS_currentTask.setLocalVariable("customerId",customerId);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",42);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",44);
            MAccountModel.Account_i a = MAccountModel.AccountImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",45);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setBalance(balance);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",46);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setRekening(rekening);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",47);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setCustomerId(customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",48);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",49);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return a;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_retrieve(abs.backend.java.lib.types.ABSString id) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
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
            }.init(id))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i retrieve(abs.backend.java.lib.types.ABSString id) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "retrieve");
            __ABS_currentTask.setLocalVariable("id",id);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",55);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",56);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",57);
            MAccountModel.Account_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",58);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSInteger arg1;
                abs.backend.java.lib.types.ABSString arg2;
                abs.backend.java.lib.types.ABSInteger arg3;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2,arg3});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSInteger _arg1,abs.backend.java.lib.types.ABSString _arg2,abs.backend.java.lib.types.ABSInteger _arg3) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    arg3 = _arg3;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    ,arg1
                    .truncate(),arg2
                    ,arg3
                    .truncate());
                }
            }.init(id, balance, rekening, customerId))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger balance, abs.backend.java.lib.types.ABSString rekening, abs.backend.java.lib.types.ABSInteger customerId) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("id",id);
            __ABS_currentTask.setLocalVariable("balance",balance);
            __ABS_currentTask.setLocalVariable("rekening",rekening);
            __ABS_currentTask.setLocalVariable("customerId",customerId);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",63);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",64);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",66);
            MAccountModel.Account_i a = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",68);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setBalance(balance);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",69);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setRekening(rekening);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",70);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).setCustomerId(customerId);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",71);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",73);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return a;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_delete(abs.backend.java.lib.types.ABSString id) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0) {
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
            }.init(id))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i delete(abs.backend.java.lib.types.ABSString id) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("id",id);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",78);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",79);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",80);
            MAccountModel.Account_i a = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",81);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).delete(a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",82);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return a;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_withdraw(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSInteger arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSInteger _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "withdraw";
                }
                public Object execute() {
                    return target.withdraw(arg0
                    ,arg1
                    .truncate());
                }
            }.init(id, amount))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i withdraw(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "withdraw");
            __ABS_currentTask.setLocalVariable("id",id);
            __ABS_currentTask.setLocalVariable("amount",amount);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",87);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",88);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",89);
            MAccountModel.Account_i a = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",90);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).withdraw(amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",91);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",92);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return a;
        }
    }
    // AccountService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MAccountModel.Account_i> async_deposit(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountService.AccountServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSInteger arg1;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSInteger _arg1) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    return this;
                }
                public java.lang.String methodName() {
                    return "deposit";
                }
                public Object execute() {
                    return target.deposit(arg0
                    ,arg1
                    .truncate());
                }
            }.init(id, amount))
        ;
    }
    // AccountService.abs:0:0: 
    public final MAccountModel.Account_i deposit(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSInteger amount) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "deposit");
            __ABS_currentTask.setLocalVariable("id",id);
            __ABS_currentTask.setLocalVariable("amount",amount);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",97);
            MAccountDbImpl.AccountDb_i orm = MAccountDbImpl.AccountDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",98);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",99);
            MAccountModel.Account_i a = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MAccountModel.AccountImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("a",a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",100);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(a).deposit(amount);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",101);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(a);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\AccountService.abs",102);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return a;
        }
    }
}
