package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ۘܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 2B5C */
/* JADX INFO: loaded from: classes2.dex */
public class C6163 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f15472;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f15473;

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m13958(String str) {
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
