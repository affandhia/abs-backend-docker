package MCustomerResource;
// CustomerResource.abs:17:0: 
public final class CustomerResourceImpl_c extends abs.backend.java.lib.runtime.ABSObject implements abs.backend.java.lib.types.ABSClass, MCustomerResource.CustomerResource_i {
    private static final java.lang.String[] __fieldNames = new java.lang.String[] {  };
    public final java.util.List<java.lang.String> getFieldNames() { return java.util.Arrays.asList(__fieldNames); }
    public CustomerResourceImpl_c() {
        getCOG().objectCreated(this);
    }
    protected final void __ABS_init() {
        getCOG().objectInitialized(this);
    }
    protected final abs.backend.java.lib.types.ABSValue getFieldValue(java.lang.String __ABS_fieldName) throws java.lang.NoSuchFieldException {
        return super.getFieldValue(__ABS_fieldName);
    }
    public final java.lang.String getClassName() { return "CustomerResourceImpl"; }
    public static final <T extends CustomerResourceImpl_c> T createNewCOG() { return (T)CustomerResourceImpl_c.__ABS_createNewCOG(null, null); }
    public static final <T extends CustomerResourceImpl_c> T __ABS_createNewCOG(abs.backend.java.lib.runtime.ABSObject __ABS_source, abs.backend.java.scheduling.UserSchedulingStrategy strategy) {
        final abs.backend.java.lib.runtime.ABSRuntime __ABS_runtime = abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime();
        final abs.backend.java.lib.runtime.COG __ABS_cog = strategy == null ? __ABS_runtime.createCOG(CustomerResourceImpl_c.class) : __ABS_runtime.createCOG(CustomerResourceImpl_c.class, strategy);
        final abs.backend.java.lib.runtime.ABSThread __ABS_thread = abs.backend.java.lib.runtime.ABSRuntime.getCurrentThread();
        final abs.backend.java.lib.runtime.COG __ABS_oldCOG = abs.backend.java.lib.runtime.ABSRuntime.getCurrentCOG();
        final abs.backend.java.lib.runtime.Task __ABS_sendingTask = abs.backend.java.lib.runtime.ABSRuntime.getCurrentTask();
        __ABS_thread.setCOG(__ABS_cog);
        try {
            CustomerResourceImpl_c __ABS_result = new CustomerResourceImpl_c();
            ;
            __ABS_runtime.cogCreated(__ABS_result);
            __ABS_cog.getScheduler().addTask(new abs.backend.java.lib.runtime.Task(new abs.backend.java.lib.runtime.ABSInitObjectCall(__ABS_sendingTask,__ABS_source,__ABS_result)));
            return (T)__ABS_result;
        } finally {
            __ABS_thread.setCOG(__ABS_oldCOG);
        }
    }
    public static final <T extends CustomerResourceImpl_c> T createNewObject() { return (T)CustomerResourceImpl_c.__ABS_createNewObject(null); }
    public static final <T extends CustomerResourceImpl_c> T __ABS_createNewObject(abs.backend.java.lib.runtime.ABSObject __ABS_source) {
        CustomerResourceImpl_c __ABS_result = new CustomerResourceImpl_c();
        __ABS_result.__ABS_init();
        return (T)__ABS_result;
    }
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_list(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerResource.CustomerResourceImpl_c>(
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
    // CustomerResource.abs:0:0: 
    public final ABS.StdLib.List<MCustomerModel.Customer_i> list(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "list");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",21);
            MCustomerService.CustomerService_i customerService = MCustomerService.CustomerServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerService",customerService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",22);
            ABS.StdLib.List<MCustomerModel.Customer_i> dataModel = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(customerService).list();
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("dataModel",dataModel);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",23);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return dataModel;
        }
    }
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_retrieve(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerResource.CustomerResourceImpl_c>(
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
    // CustomerResource.abs:0:0: 
    public final MCustomerModel.Customer_i retrieve(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "retrieve");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",29);
            MCustomerService.CustomerService_i customerService = MCustomerService.CustomerServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerService",customerService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",30);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",31);
            MCustomerModel.Customer_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(customerService).retrieve(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",32);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<ABS.StdLib.List<MCustomerModel.Customer_i>> async_create(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerResource.CustomerResourceImpl_c>(
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
    // CustomerResource.abs:0:0: 
    public final ABS.StdLib.List<MCustomerModel.Customer_i> create(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "create");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",38);
            MCustomerService.CustomerService_i customerService = MCustomerService.CustomerServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerService",customerService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",39);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",41);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",42);
            abs.backend.java.lib.types.ABSString email = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("email"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("email",email);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",43);
            abs.backend.java.lib.types.ABSString phone = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("phone"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("phone",phone);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",44);
            abs.backend.java.lib.types.ABSString address = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("address"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("address",address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",46);
            ABS.StdLib.List<MCustomerModel.Customer_i> c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(customerService).create(name, email, phone, address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",48);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<MCustomerModel.Customer_i> async_update(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerResource.CustomerResourceImpl_c>(
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
    // CustomerResource.abs:0:0: 
    public final MCustomerModel.Customer_i update(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "update");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",53);
            MCustomerService.CustomerService_i customerService = MCustomerService.CustomerServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerService",customerService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",54);
            ABS.Framework.Utility.Utility_i utility = ABS.Framework.Utility.UtilityImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("utility",utility);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",56);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",57);
            abs.backend.java.lib.types.ABSString name = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("name"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("name",name);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",58);
            abs.backend.java.lib.types.ABSString email = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("email"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("email",email);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",59);
            abs.backend.java.lib.types.ABSString phone = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("phone"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("phone",phone);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",60);
            abs.backend.java.lib.types.ABSString address = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("address"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("address",address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",62);
            MCustomerModel.Customer_i c = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(customerService).update(id, name, email, phone, address);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("c",c);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",64);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return c;
        }
    }
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.runtime.ABSFut<abs.backend.java.lib.types.ABSUnit> async_delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        return (abs.backend.java.lib.runtime.ABSFut)abs.backend.java.lib.runtime.ABSRuntime.getCurrentRuntime().asyncCall(new abs.backend.java.lib.runtime.AbstractAsyncCallRT<MCustomerResource.CustomerResourceImpl_c>(
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
    // CustomerResource.abs:0:0: 
    public final abs.backend.java.lib.types.ABSUnit delete(ABS.Framework.Http.ABSHttpRequest_i request) {
        __ABS_checkSameCOG(); 
        if (__ABS_getRuntime().debuggingEnabled()) {
            abs.backend.java.lib.runtime.Task<?> __ABS_currentTask = __ABS_getRuntime().getCurrentTask();
            __ABS_currentTask.newStackFrame(this, "delete");
            __ABS_currentTask.setLocalVariable("request",request);
        }
         {
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",69);
            MCustomerService.CustomerService_i customerService = MCustomerService.CustomerServiceImpl_c.__ABS_createNewObject(this);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("customerService",customerService);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",71);
            abs.backend.java.lib.types.ABSString id = abs.backend.java.lib.runtime.ABSRuntime.checkForNull(request).getInput(abs.backend.java.lib.types.ABSString.fromString("id"));
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().setLocalVariable("id",id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",72);
            abs.backend.java.lib.runtime.ABSRuntime.checkForNull(customerService).delete(id);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().nextStep("D:\\Kerja\\Thesis\\abs-microservices-framework\\src\\abs\\resource\\CustomerResource.abs",0);
            if (__ABS_getRuntime().debuggingEnabled()) __ABS_getRuntime().getCurrentTask().popStackFrame();
            return abs.backend.java.lib.types.ABSUnit.UNIT;
        }
    }
}
