package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻᩵ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes.dex */
public final class C25083 {

    /* JADX INFO: renamed from: ֫ */
    public int f80019;

    /* JADX INFO: renamed from: ۧ */
    public int f80020;

    /* JADX INFO: renamed from: ܳ */
    public final JSONArray f80021 = JSON.array();

    /* JADX INFO: renamed from: ܽ */
    public C19048 f80022;

    /* JADX INFO: renamed from: ܿ */
    public final String f80023;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f80024;

    public C25083(String str) {
        this.f80023 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55064(JSONArray jSONArray) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            JSONArray jSONArray2 = this.f80021;
            Iterator it2 = jSONArray2.iterator();
            do {
                if (!it2.hasNext()) {
                    jSONArray2.add(jSONValue);
                    break;
                }
            } while (!((JSONValue) it2.next()).equals(jSONValue));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55065(C5276 c5276) {
        JSONObject jSONObject = c5276.f12412;
        JSONValue jSONValue = jSONObject.get("createdDirectories");
        int iAsInt = this.f80020 + ((jSONValue == null || !jSONValue.isNumber()) ? 0 : jSONValue.asInt());
        JSONValue jSONValue2 = jSONObject.get("warnings");
        if (jSONValue2 != null && jSONValue2.isArray()) {
            m55064(jSONValue2.asArray());
        }
        JSONValue jSONValue3 = jSONObject.get("changed");
        JSONValue jSONValue4 = jSONObject.get("stateKnown");
        jSONObject.put(MotionUtils.EASING_TYPE_PATH, this.f80023).put("completedFiles", this.f80019).put("createdDirectories", iAsInt).put("changed", this.f80019 > 0 || iAsInt > 0 || (jSONValue3 != null && jSONValue3.isBoolean() && jSONValue3.asBoolean())).put("stateKnown", jSONValue4 == null || !jSONValue4.isBoolean() || jSONValue4.asBoolean()).put("operationMode", "non_atomic").put("warnings", new JSONArray(this.f80021));
        if (jSONObject.get("entryPaths") == null) {
            C19048 c19048 = this.f80022;
            jSONObject.put("entryPaths", c19048 == null ? JSON.array() : JSON.array(c19048.f56839));
        }
        if (jSONObject.get("operationIndexes") == null) {
            C19048 c19049 = this.f80022;
            jSONObject.put("operationIndexes", c19049 == null ? JSON.array() : JSON.array(c19049.f56838));
        }
        if (jSONObject.get("destinationPath") == null) {
            C19048 c190410 = this.f80022;
            jSONObject.put("destinationPath", c190410 == null ? JSON.NULL : JSON.value(c190410.f56835));
        }
    }
}
