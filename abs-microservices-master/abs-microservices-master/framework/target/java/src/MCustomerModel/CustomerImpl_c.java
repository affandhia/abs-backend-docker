package MCustomerModel;
// Customer.abs:17:0: 
public final class CustomerImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MCustomerModel.Customer_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] { "id", "name", "email", "phone", "address" };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    // Customer.abs:19:1: 
    private abs.backend.java.lib.types.ABSInteger id;
    // Customer.abs:20:1: 
    private abs.backend.java.lib.types.ABSString name;
    // Customer.abs:21:1: 
    private abs.backend.java.lib.types.ABSString email;
    // Customer.abs:22:1: 
    private abs.backend.java.lib.types.ABSString phone;
    // Customer.abs:23:1: 
    private abs.backend.java.lib.types.ABSString address;
    public CustomerImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        this.id = abs.backend.java.lib.types.ABSInteger.fromString("0");this.name = abs.backend.java.lib.types.ABSString.fromString("");this.email = abs.backend.java.lib.types.ABSString.fromString("");this.phone = abs.backend.java.lib.types.ABSString.fromString("");this.address = abs.backend.java.lib.types.ABSString.fromString("");getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        if ("id".equals(__ABS_fieldName)) return id;
        if ("name".equals(__ABS_fieldName)) return name;
        if ("email".equals(__ABS_fieldName)) return email;
        if ("phone".equals(__ABS_fieldName)) return phone;
        if ("address".equals(__ABS_fieldName)) return address;
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "CustomerImpl"; }
    public static final <T extends CustomerImpl_c> T createNewCOG() { return (T)CustomerImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends CustomerImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(CustomerImpl_c.class) : __ABS_runtime.createCOG(CustomerImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            CustomerImpl_c __ABS_result = new CustomerImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends CustomerImpl_c> T createNewObject() { return (T)CustomerImpl_c.__ABS_createNewObject(null); }
    public static final <T extends CustomerImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        CustomerImpl_c __ABS_result = new CustomerImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setId(abs.backend.java.lib.types.ABSInteger x) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setId(abs.backend.java.lib.types.ABSInteger x) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setId");
            __ABS_currentTask.setLocalVariable("x",x);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",25);
            CustomerImpl_c.this.id = x;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSInteger> async_getId() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSInteger getId() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getId");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",26);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return CustomerImpl_c.this.id;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setName(abs.backend.java.lib.types.ABSString name) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "setName";
                }
                public Object execute() {
                    return target.setName(arg0
                    );
                }
            }.init(name))
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setName(abs.backend.java.lib.types.ABSString name) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setName");
            __ABS_currentTask.setLocalVariable("name",name);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",28);
            CustomerImpl_c.this.name = name;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getName() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "getName";
                }
                public Object execute() {
                    return target.getName();
                }
            }.init())
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getName() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getName");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",29);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return CustomerImpl_c.this.name;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setEmail(abs.backend.java.lib.types.ABSString email) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "setEmail";
                }
                public Object execute() {
                    return target.setEmail(arg0
                    );
                }
            }.init(email))
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setEmail(abs.backend.java.lib.types.ABSString email) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setEmail");
            __ABS_currentTask.setLocalVariable("email",email);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",31);
            CustomerImpl_c.this.email = email;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getEmail() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "getEmail";
                }
                public Object execute() {
                    return target.getEmail();
                }
            }.init())
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getEmail() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getEmail");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",32);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return CustomerImpl_c.this.email;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setPhone(abs.backend.java.lib.types.ABSString phone) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "setPhone";
                }
                public Object execute() {
                    return target.setPhone(arg0
                    );
                }
            }.init(phone))
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setPhone(abs.backend.java.lib.types.ABSString phone) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setPhone");
            __ABS_currentTask.setLocalVariable("phone",phone);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",34);
            CustomerImpl_c.this.phone = phone;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getPhone() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "getPhone";
                }
                public Object execute() {
                    return target.getPhone();
                }
            }.init())
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getPhone() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getPhone");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",35);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return CustomerImpl_c.this.phone;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_setAddress(abs.backend.java.lib.types.ABSString address) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "setAddress";
                }
                public Object execute() {
                    return target.setAddress(arg0
                    );
                }
            }.init(address))
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit setAddress(abs.backend.java.lib.types.ABSString address) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "setAddress");
            __ABS_currentTask.setLocalVariable("address",address);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",37);
            CustomerImpl_c.this.address = address;
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSString> async_getAddress() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerModel.CustomerImpl_c>(
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
                    return "getAddress";
                }
                public Object execute() {
                    return target.getAddress();
                }
            }.init())
        ;
    }
    // Customer.abs:0:0: 
    public final abs.backend.java.lib.types.ABSString getAddress() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "getAddress");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\model\\Customer.abs",38);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return CustomerImpl_c.this.address;
        }
    }
}
