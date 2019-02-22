package MAccountModel;
// Account.abs:20:0: 
public final class AccountImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MAccountModel.Account_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "id", "balance", "rekening", "customerId", "interest" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // Account.abs:21:1: 
    private abs.backend.java.lib.types.ABSInteger id;
    // Account.abs:22:1: 
    private abs.backend.java.lib.types.ABSInteger balance;
    // Account.abs:23:1: 
    private abs.backend.java.lib.types.ABSString rekening;
    // Account.abs:24:1: 
    private abs.backend.java.lib.types.ABSInteger customerId;
    // DCheck.abs:5:6: 
    private abs.backend.java.lib.types.ABSInteger interest;
    public AccountImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.id = abs.backend.java.lib.types.ABSInteger.fromString("0");this.balance = abs.backend.java.lib.types.ABSInteger.fromString("0");this.rekening = abs.backend.java.lib.types.ABSString.fromString("");this.customerId = abs.backend.java.lib.types.ABSInteger.fromString("0");this.interest = abs.backend.java.lib.types.ABSInteger.fromString("0");getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("id".equals(__ABS_fieldName)) return id;
        if ("balance".equals(__ABS_fieldName)) return balance;
        if ("rekening".equals(__ABS_fieldName)) return rekening;
        if ("customerId".equals(__ABS_fieldName)) return customerId;
        if ("interest".equals(__ABS_fieldName)) return interest;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "AccountImpl"; }
    public static final <T extends AccountImpl_c> T createNewCOG() { return (T)AccountImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends AccountImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(AccountImpl_c.class) : __ABS_runtime.createCOG(AccountImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            AccountImpl_c __ABS_result = new AccountImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends AccountImpl_c> T createNewObject() { return (T)AccountImpl_c.__ABS_createNewObject(null); }
    public static final <T extends AccountImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        AccountImpl_c __ABS_result = new AccountImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setId(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setId";
                }
                public Object execute() {
                    return target.setId(arg0
                    .truncate());
                }
            }.init(x))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setId(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setId");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",26);
            AccountImpl_c.this.id = x;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setBalance(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setBalance";
                }
                public Object execute() {
                    return target.setBalance(arg0
                    .truncate());
                }
            }.init(x))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setBalance(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setBalance");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",27);
            AccountImpl_c.this.balance = x;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setRekening(abs.backend.java.lib.types.ABSString rekening) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "setRekening";
                }
                public Object execute() {
                    return target.setRekening(arg0
                    );
                }
            }.init(rekening))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setRekening(abs.backend.java.lib.types.ABSString rekening) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setRekening");
            __ABS_currentTask.setLocalVariable("rekening",rekening);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",28);
            AccountImpl_c.this.rekening = rekening;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setCustomerId(abs.backend.java.lib.types.ABSInteger customerId) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setCustomerId";
                }
                public Object execute() {
                    return target.setCustomerId(arg0
                    .truncate());
                }
            }.init(customerId))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setCustomerId(abs.backend.java.lib.types.ABSInteger customerId) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setCustomerId");
            __ABS_currentTask.setLocalVariable("customerId",customerId);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",29);
            AccountImpl_c.this.customerId = customerId;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getId() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "getId";
                }
                public Object execute() {
                    return target.getId();
                }
            }.init())
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getId() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getId");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",31);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.id;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getBalance() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "getBalance";
                }
                public Object execute() {
                    return target.getBalance();
                }
            }.init())
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getBalance() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getBalance");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",32);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.balance;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getRekening() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "getRekening";
                }
                public Object execute() {
                    return target.getRekening();
                }
            }.init())
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getRekening() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getRekening");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",33);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.rekening;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getCustomerId() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "getCustomerId";
                }
                public Object execute() {
                    return target.getCustomerId();
                }
            }.init())
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getCustomerId() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getCustomerId");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",34);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.customerId;
        }
    }
    // DFee.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_deposit(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "deposit";
                }
                public Object execute() {
                    return target.deposit(arg0
                    .truncate());
                }
            }.init(x))
        ;
    }
    // DFee.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger deposit(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "deposit");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",5);
            abs.backend.java.lib.types.ABSInteger result = x;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result",result);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",6);
            if (abs.backend.java.lib.expr.BinOp.gtEq(x,abs.backend.java.lib.types.ABSInteger.fromString("1")).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",6);
                result = deposit$ORIGIN_core(x.subtract(abs.backend.java.lib.types.ABSInteger.fromString("1")));
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("result", result);}
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",7);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return result;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_withdraw(abs.backend.java.lib.types.ABSInteger y) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "withdraw";
                }
                public Object execute() {
                    return target.withdraw(arg0
                    .truncate());
                }
            }.init(y))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger withdraw(abs.backend.java.lib.types.ABSInteger y) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "withdraw");
            __ABS_currentTask.setLocalVariable("y",y);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",42);
            if (abs.backend.java.lib.expr.BinOp.gtEq(AccountImpl_c.this.balance.subtract(y),abs.backend.java.lib.types.ABSInteger.fromString("0")).toBoolean()) {
                 {
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",42);
                    if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",42);
                    AccountImpl_c.this.balance = AccountImpl_c.this.balance.subtract(y);
                }
            }
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",43);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.balance;
        }
    }
    // DType.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setInterest(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "setInterest";
                }
                public Object execute() {
                    return target.setInterest(arg0
                    .truncate());
                }
            }.init(x))
        ;
    }
    // DType.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setInterest(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setInterest");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",7);
            AccountImpl_c.this.interest = x;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // DType.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getInterest() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
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
                    return "getInterest";
                }
                public Object execute() {
                    return target.getInterest();
                }
            }.init())
        ;
    }
    // DType.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getInterest() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getInterest");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",11);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.interest;
        }
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_deposit$ORIGIN_core(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MAccountModel.AccountImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSInteger arg0;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSInteger _arg0) {
                    arg0 = _arg0;
                    return this;
                }
                public java.lang.String methodName() {
                    return "deposit$ORIGIN_core";
                }
                public Object execute() {
                    return target.deposit$ORIGIN_core(arg0
                    .truncate());
                }
            }.init(x))
        ;
    }
    // Account.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger deposit$ORIGIN_core(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "deposit$ORIGIN_core");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",37);
            AccountImpl_c.this.balance = AccountImpl_c.this.balance.add(x);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Account.abs",38);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return AccountImpl_c.this.balance;
        }
    }
}
