package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes.dex */
public final class C23900 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77268;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77269;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final JSONArray f77270 = JSON.array();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C17550 f77271;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f77272;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f77273;

    public C23900(String str) {
        this.f77272 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52655(JSONArray jSONArray) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            JSONArray jSONArray2 = this.f77270;
            Iterator it2 = jSONArray2.iterator();
            do {
                if (!it2.hasNext()) {
                    jSONArray2.add(jSONValue);
                    break;
                }
            } while (!((JSONValue) it2.next()).equals(jSONValue));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52656(C3059 c3059) {
        JSONObject jSONObject = c3059.f9609;
        JSONValue jSONValue = jSONObject.get("createdDirectories");
        int iAsInt = this.f77269 + ((jSONValue == null || !jSONValue.isNumber()) ? 0 : jSONValue.asInt());
        JSONValue jSONValue2 = jSONObject.get("warnings");
        if (jSONValue2 != null && jSONValue2.isArray()) {
            m52655(jSONValue2.asArray());
        }
        JSONValue jSONValue3 = jSONObject.get("changed");
        JSONValue jSONValue4 = jSONObject.get("stateKnown");
        jSONObject.put(MotionUtils.EASING_TYPE_PATH, this.f77272).put("completedFiles", this.f77268).put("createdDirectories", iAsInt).put("changed", this.f77268 > 0 || iAsInt > 0 || (jSONValue3 != null && jSONValue3.isBoolean() && jSONValue3.asBoolean())).put("stateKnown", jSONValue4 == null || !jSONValue4.isBoolean() || jSONValue4.asBoolean()).put("operationMode", "non_atomic").put("warnings", new JSONArray(this.f77270));
        if (jSONObject.get("entryPaths") == null) {
            C17550 c17550 = this.f77271;
            jSONObject.put("entryPaths", c17550 == null ? JSON.array() : JSON.array(c17550.f53649));
        }
        if (jSONObject.get("operationIndexes") == null) {
            C17550 c17551 = this.f77271;
            jSONObject.put("operationIndexes", c17551 == null ? JSON.array() : JSON.array(c17551.f53648));
        }
        if (jSONObject.get("destinationPath") == null) {
            C17550 c17552 = this.f77271;
            jSONObject.put("destinationPath", c17552 == null ? JSON.NULL : JSON.value(c17552.f53645));
        }
    }
}
