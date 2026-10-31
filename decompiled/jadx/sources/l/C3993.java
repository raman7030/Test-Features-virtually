package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۘܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B5C */
/* JADX INFO: loaded from: classes2.dex */
public class C3993 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f12656;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f12657;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m12038(String str) {
        JSONObject jSONObject = new JSONObject(str);
        JSONObject jSONObjectAdd = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", jSONObject);
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = jSONObject.names().iterator();
        while (it.hasNext()) {
            jSONArrayArray.add((String) it.next());
        }
        return jSONObjectAdd.add(AnnotationHandler.REQUIRED, jSONArrayArray);
    }
}
