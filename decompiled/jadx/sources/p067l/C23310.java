package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0655am;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23310 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C6905 f73352;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f73353;

    /* JADX INFO: renamed from: ܽ */
    public JSONObject f73354;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Query the current MCP file access policy before using local file paths. Call with {}. Returns the absolute Home path, path rules in descending priority order with targetType and active status, and permanently denied MT managed paths. Home is read_write except Android/data; elsewhere the first matching active rule applies. The final directory rule has path / and supplies the default access level. Only the user can change permissions in MT settings.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Get File Access Policy";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_get_access_policy";
    }

    public C23310(C6905 c6905) {
        this.f73352 = c6905;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f73353 == null) {
            this.f73353 = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", JSON.object()).add(AnnotationHandler.REQUIRED, JSON.array());
        }
        return this.f73353;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f73354 == null) {
            this.f73354 = C3935.m7765("Result for mt_file_get_access_policy.", C3935.m7762(JSON.object().add("homePath", C3935.m7775("string", "Normalized absolute Home path.")).add("rules", C9417.m21913("type", "array", "description", "Access rules in descending priority order. The first matching active rule wins; the final / directory rule is the default. Inactive rules are shadowed by Home or managed paths.").add("items", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute rule target.")).add("targetType", C3935.m7775("string", "file or directory.")).add(C0655am.f2262Q, C3935.m7775("string", "read_only, read_write, or deny.")), ClassTransform.BOOLEAN, "Whether the rule currently participates in matching.", "active", "Explicit path access rule."))).add("managedPaths", C9417.m21913("type", "array", "description", "Permanently denied MT managed roots.").add("items", C3935.m7775("string", "Normalized absolute path."))), "Current MCP file access policy."), C3935.m7770(C3935.m7762(JSON.object(), "No tool-specific diagnostics are emitted by this query.")), C3935.m7764("Always empty for this query."));
        }
        return this.f73354;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        if (!jSONObject.names().isEmpty()) {
            String str = (String) jSONObject.names().get(0);
            throw C5276.m11406("Invalid file access policy argument", str, jSONObject.get(str), JSON.array(), JSON.object());
        }
        C9385 c9385M43852 = ((C19247) this.f73352.f17975).m43852();
        JSONArray jSONArrayArray = JSON.array();
        for (C15419 c15419 : c9385M43852.f25640) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c15419.f44088).add("targetType", c15419.f44089.m20498()).add(C0655am.f2262Q, c15419.f44086.m18664()).add("active", c15419.f44087));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it = c9385M43852.f25639.iterator();
        while (it.hasNext()) {
            jSONArrayArray2.add((String) it.next());
        }
        return new C14663(C21370.m48410(JSON.object().add("homePath", c9385M43852.f25638).add("rules", jSONArrayArray).add("managedPaths", jSONArrayArray2), JSON.array()));
    }
}
