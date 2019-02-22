package ABS.Productline;
// abslang.abs:0:0: 
public final class Feature_Overdraft extends Feature {
    public Feature_Overdraft() {
    }
    protected abs.backend.java.lib.types.ABSValue[] getArgs() { return new abs.backend.java.lib.types.ABSValue[] {  }; }
    public java.lang.String getConstructorName() { return "Overdraft";} 
    public abs.backend.java.lib.types.ABSBool eq(abs.backend.java.lib.types.ABSValue o) {
        if (! (o instanceof Feature_Overdraft)) return abs.backend.java.lib.types.ABSBool.FALSE;
        Feature_Overdraft other = (Feature_Overdraft) o;
        return abs.backend.java.lib.types.ABSBool.TRUE;
    }
    public boolean match(abs.backend.java.lib.expr.PatternConstructor c, abs.backend.java.lib.expr.PatternBinding b) {
        if (!c.constructorClass.equals(this.getClass())) return false;
        return true;
    }
}
