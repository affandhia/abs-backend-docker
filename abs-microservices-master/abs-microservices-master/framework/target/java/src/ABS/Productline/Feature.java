package ABS.Productline;
// abslang.abs:1110:0: 
public abstract class Feature extends abs.backend.java.lib.types.ABSDataType {
    public final boolean isFee() { return this instanceof Feature_Fee; }
    public final Feature_Fee toFee() { return (Feature_Fee) this; }
    public final boolean isOverdraft() { return this instanceof Feature_Overdraft; }
    public final Feature_Overdraft toOverdraft() { return (Feature_Overdraft) this; }
    public final boolean isCheck() { return this instanceof Feature_Check; }
    public final Feature_Check toCheck() { return (Feature_Check) this; }
    public final boolean isSave() { return this instanceof Feature_Save; }
    public final Feature_Save toSave() { return (Feature_Save) this; }
    public final boolean isType() { return this instanceof Feature_Type; }
    public final Feature_Type toType() { return (Feature_Type) this; }
}
