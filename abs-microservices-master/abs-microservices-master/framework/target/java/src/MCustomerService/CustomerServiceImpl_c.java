package MCustomerService;
// CustomerService.abs:17:0: 
public final class CustomerServiceImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MCustomerService.CustomerService_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public CustomerServiceImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "CustomerServiceImpl"; }
    public static final <T extends CustomerServiceImpl_c> T createNewCOG() { return (T)CustomerServiceImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends CustomerServiceImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(CustomerServiceImpl_c.class) : __ABS_runtime.createCOG(CustomerServiceImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            CustomerServiceImpl_c __ABS_result = new CustomerServiceImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends CustomerServiceImpl_c> T createNewObject() { return (T)CustomerServiceImpl_c.__ABS_createNewObject(null); }
    public static final <T extends CustomerServiceImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        CustomerServiceImpl_c __ABS_result = new CustomerServiceImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // CustomerService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_list() {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerService.CustomerServiceImpl_c>(
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
    // CustomerService.abs:0:0: 
    public final ABS.StdLib.List<MCustomerModel.Customer_i> list() {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",21);
            MCustomerDbImpl.CustomerDb_i orm = MCustomerDbImpl.CustomerDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",23);
            ABS.StdLib.List<MCustomerModel.Customer_i> customers = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MCustomerModel.CustomerImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customers",customers);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",25);
            ABS.StdLib.List<MCustomerModel.Customer_i> customer_list = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customer_list",customer_list);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",27);
            abs.backend.java.lib.types.ABSInteger index = abs.backend.java.lib.types.ABSInteger.fromString("0");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index",index);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",28);
            while (abs.backend.java.lib.expr.BinOp.lt(index,ABS.StdLib.length_f.apply(customers)).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",28);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",29);
                MCustomerModel.Customer_i p = ABS.StdLib.nth_f.apply(customers, index);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("p",p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",30);
                customer_list = ABS.StdLib.appendright_f.apply(customer_list, p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customer_list", customer_list);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",31);
                index = index.add(abs.backend.java.lib.types.ABSInteger.fromString("1"));
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index", index);}
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",33);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return customer_list;
        }
    }
    // CustomerService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_create(abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerService.CustomerServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                abs.backend.java.lib.types.ABSString arg2;
                abs.backend.java.lib.types.ABSString arg3;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2,arg3});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1,abs.backend.java.lib.types.ABSString _arg2,abs.backend.java.lib.types.ABSString _arg3) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    arg3 = _arg3;
                    return this;
                }
                public java.lang.String methodName() {
                    return "create";
                }
                public Object execute() {
                    return target.create(arg0
                    ,arg1
                    ,arg2
                    ,arg3
                    );
                }
            }.init(name, email, phone, address))
        ;
    }
    // CustomerService.abs:0:0: 
    public final ABS.StdLib.List<MCustomerModel.Customer_i> create(abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("name",name);
            __ABS_currentTask.setLocalVariable("email",email);
            __ABS_currentTask.setLocalVariable("phone",phone);
            __ABS_currentTask.setLocalVariable("address",address);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",38);
            MCustomerDbImpl.CustomerDb_i orm = MCustomerDbImpl.CustomerDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",40);
            MCustomerModel.Customer_i c = MCustomerModel.CustomerImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",41);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",42);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setEmail(email);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",43);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setPhone(phone);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",44);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setAddress(address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",45);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).save(c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",47);
            ABS.StdLib.List<MCustomerModel.Customer_i> customers = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findAll(abs.backend.java.lib.types.ABSString.fromString("MCustomerModel.CustomerImpl_c"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customers",customers);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",49);
            ABS.StdLib.List<MCustomerModel.Customer_i> customer_list = new ABS.StdLib.List_Nil();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customer_list",customer_list);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",51);
            abs.backend.java.lib.types.ABSInteger index = abs.backend.java.lib.types.ABSInteger.fromString("0");
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index",index);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",52);
            while (abs.backend.java.lib.expr.BinOp.lt(index,ABS.StdLib.length_f.apply(customers)).toBoolean()) {
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",52);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",53);
                MCustomerModel.Customer_i p = ABS.StdLib.nth_f.apply(customers, index);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("p",p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",54);
                customer_list = ABS.StdLib.appendright_f.apply(customer_list, p);
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customer_list", customer_list);if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",55);
                index = index.add(abs.backend.java.lib.types.ABSInteger.fromString("1"));
                if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("index", index);}
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",57);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return customer_list;
        }
    }
    // CustomerService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_retrieve(abs.backend.java.lib.types.ABSString id) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerService.CustomerServiceImpl_c>(
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
    // CustomerService.abs:0:0: 
    public final MCustomerModel.Customer_i retrieve(abs.backend.java.lib.types.ABSString id) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "retrieve");
            __ABS_currentTask.setLocalVariable("id",id);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",62);
            MCustomerDbImpl.CustomerDb_i orm = MCustomerDbImpl.CustomerDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",63);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",64);
            MCustomerModel.Customer_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MCustomerModel.CustomerImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",65);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // CustomerService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerService.CustomerServiceImpl_c>(
            this,
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(this),
            new ABS.StdLib.Duration_InfDuration(),
            new ABS.StdLib.Duration_InfDuration(),
            abs.backend.java.lib.types.ABSBool.FALSE) {
                abs.backend.java.lib.types.ABSString arg0;
                abs.backend.java.lib.types.ABSString arg1;
                abs.backend.java.lib.types.ABSString arg2;
                abs.backend.java.lib.types.ABSString arg3;
                abs.backend.java.lib.types.ABSString arg4;
                public java.util.List<abs.backend.java.lib.types.ABSValue> getArgs() {
                    return java.util.Arrays.asList(new abs.backend.java.lib.types.ABSValue[] {
                        arg0,arg1,arg2,arg3,arg4});
                }
                public abs.backend.java.lib.runtime.AsyncCall<?> init(abs.backend.java.lib.types.ABSString _arg0,abs.backend.java.lib.types.ABSString _arg1,abs.backend.java.lib.types.ABSString _arg2,abs.backend.java.lib.types.ABSString _arg3,abs.backend.java.lib.types.ABSString _arg4) {
                    arg0 = _arg0;
                    arg1 = _arg1;
                    arg2 = _arg2;
                    arg3 = _arg3;
                    arg4 = _arg4;
                    return this;
                }
                public java.lang.String methodName() {
                    return "update";
                }
                public Object execute() {
                    return target.update(arg0
                    ,arg1
                    ,arg2
                    ,arg3
                    ,arg4
                    );
                }
            }.init(id, name, email, phone, address))
        ;
    }
    // CustomerService.abs:0:0: 
    public final MCustomerModel.Customer_i update(abs.backend.java.lib.types.ABSString id, abs.backend.java.lib.types.ABSString name, abs.backend.java.lib.types.ABSString email, abs.backend.java.lib.types.ABSString phone, abs.backend.java.lib.types.ABSString address) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("id",id);
            __ABS_currentTask.setLocalVariable("name",name);
            __ABS_currentTask.setLocalVariable("email",email);
            __ABS_currentTask.setLocalVariable("phone",phone);
            __ABS_currentTask.setLocalVariable("address",address);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",70);
            MCustomerDbImpl.CustomerDb_i orm = MCustomerDbImpl.CustomerDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",71);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",73);
            MCustomerModel.Customer_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MCustomerModel.CustomerImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",75);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setName(name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",76);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setEmail(email);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",77);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setPhone(phone);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",78);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(c).setAddress(address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",79);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).update(c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",80);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // CustomerService.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_delete(abs.backend.java.lib.types.ABSString id) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerService.CustomerServiceImpl_c>(
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
    // CustomerService.abs:0:0: 
    public final MCustomerModel.Customer_i delete(abs.backend.java.lib.types.ABSString id) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("id",id);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",85);
            MCustomerDbImpl.CustomerDb_i orm = MCustomerDbImpl.CustomerDbImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("orm",orm);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",86);
            abs.backend.java.lib.types.ABSString condition = abs.backend.java.lib.types.ABSString.fromString("id=").add(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("condition",condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",87);
            MCustomerModel.Customer_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).findByAttributes(abs.backend.java.lib.types.ABSString.fromString("MCustomerModel.CustomerImpl_c"), condition);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",88);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(orm).delete(c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\service\\CustomerService.abs",89);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
}
