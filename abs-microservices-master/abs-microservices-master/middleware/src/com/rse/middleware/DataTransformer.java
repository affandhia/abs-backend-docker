package com.rse.middleware;

import java.util.ArrayList;

import abs.backend.java.lib.runtime.ABSObject;
import abs.backend.java.lib.types.ABSString;
import abs.backend.java.lib.types.ABSValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/*
 * ACKNOWLADGE: https://github.com/sir-muamua/ABSServer/blob/master/src/com/fmse/absserver/helper/DataTransformer.java
 */
public class DataTransformer {

    public static ArrayList<Object>
            convertABSListToJavaList(ABS.StdLib.List<ABSValue> target) throws Exception {
        ArrayList<Object> result = new ArrayList<Object>();

        do {
            ABSObject head = (ABSObject) ABS.StdLib.head_f.apply(target);
            result.add(head);

            target = ABS.StdLib.tail_f.apply(target);
        } while (!(target instanceof ABS.StdLib.List_Nil));

        return result;
    }

    public static String
            convertABSStringToJavaString(ABSString target) throws Exception {
        return target.toString().replaceAll("\"", "");
    }

    public static String convertObjectToJSON(ArrayList<Object> dataModels) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String json = "";
        if (dataModels.size() > 1) {
            int ii = 0;
            json = "[";
            for (Object obj : dataModels) {
                Class cls = obj.getClass();
                List<String> fields = (List<String>) cls.getDeclaredMethod("getFieldNames").invoke(obj);
                int jj = 0;
                json = json.concat("{");
                for (String field : fields) {
                    System.out.println(field);
                    json = json.concat("\"" + field + "\"" + " : ");
                    Method m = cls.getDeclaredMethod("getFieldValue", field.getClass());
                    m.setAccessible(true);
                    System.out.println(m.invoke(obj, field));
                    json = json.concat(m.invoke(obj, field).toString());
                    jj++;
                    if (jj < fields.size()) {
                        json = json.concat(",");
                    }
                }
                json = json.concat("}");
                ii++;
                if (ii < dataModels.size()) {
                    json = json.concat(",");
                }
            }
            json = json.concat("]");

        } else {
            Object obj = dataModels.get(0);
            Class cls = obj.getClass();
            List<String> fields = (List<String>) cls.getDeclaredMethod("getFieldNames").invoke(obj);
            int jj = 0;
            json = "{";
            for (String field : fields) {
                json = json.concat("\"" + field + "\"" + " : ");
                Method m = cls.getDeclaredMethod("getFieldValue", field.getClass());
                m.setAccessible(true);
                json = json.concat(m.invoke(obj, field).toString());
                jj++;
                if (jj < fields.size()) {
                    json = json.concat(",");
                }
            }
            json = json.concat("}");
        }
        //Appending Data Key, as requirement of IFML
        json = "{ \"data\": ".concat(json).concat("}");
        return json;
    }

    public static String convertAbsObjectToJSON(ABSValue obj) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (obj instanceof ABS.StdLib.List_Nil) {
            return "[]";
        }else if (obj instanceof ABS.StdLib.List) {
            return convertAbsListToJSON((ABS.StdLib.List) obj);
        } else {
            String json = "";
            int ii = 0;
            ABSObject absobj = (ABSObject) obj;
            Class cls = absobj.getClass();
            List<String> fields = (List<String>) cls.getDeclaredMethod("getFieldNames").invoke(obj);
            int jj = 0;
            json = json.concat("{");
            
            Boolean allFieldIsNull = true;
            
            for (String field : fields) {
                System.out.println(field);
                json = json.concat("\"" + field + "\"" + " : ");
                Method m = cls.getDeclaredMethod("getFieldValue", field.getClass());
                m.setAccessible(true);
                Object fieldValue = m.invoke(obj, field);
                
                if (fieldValue == null){
                    json = json.concat("null");
                }
                else{
                    allFieldIsNull = false;
                    json = json.concat(m.invoke(obj, field).toString());
                }
                jj++;
                if (jj < fields.size()) {
                    json = json.concat(",");
                }
            }
            if (allFieldIsNull){
                return "null";
            }
            json = json.concat("}");
            System.out.println(json);
            //Appending Data Key, as requirement of IFML
            json = "{ \"data\": ".concat(json).concat("}");
            return json;
        }
    }

    public static String convertAbsListToJSON(ABS.StdLib.List<ABSValue> dataModels) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String json = "[";
        do {
            int ii = 0;
            ABSObject obj = (ABSObject) ABS.StdLib.head_f.apply(dataModels);
            Class cls = obj.getClass();
            List<String> fields = (List<String>) cls.getDeclaredMethod("getFieldNames").invoke(obj);
            int jj = 0;
            json = json.concat("{");

            for (String field : fields) {
                System.out.println(field);
                json = json.concat("\"" + field + "\"" + " : ");
                Method m = cls.getDeclaredMethod("getFieldValue", field.getClass());
                m.setAccessible(true);
                System.out.println(m.invoke(obj, field));
                json = json.concat(m.invoke(obj, field).toString());
                jj++;
                if (jj < fields.size()) {
                    json = json.concat(",");
                }
            }

            json = json.concat("}");

            dataModels = ABS.StdLib.tail_f.apply(dataModels);
            if (!(dataModels instanceof ABS.StdLib.List_Nil)) {
                json = json.concat(",");
            }
        } while (!(dataModels instanceof ABS.StdLib.List_Nil));

        json = json.concat("]");
        //Appending Data Key, as requirement of IFML
        json = "{ \"data\": ".concat(json).concat("}");
        return json;
    }
}
