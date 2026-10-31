package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.util.Iterator;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩹ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76Y3 */
/* JADX INFO: loaded from: classes.dex */
public final class C22035 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4773 f70635;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f70636;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public JSONObject f70637;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Query the current MCP file access policy before using local file paths. Call with {}. Returns the absolute Home path, path rules in descending priority order with targetType and active status, and permanently denied MT managed paths. Home is read_write except Android/data; elsewhere the first matching active rule applies. The final directory rule has path / and supplies the default access level. Only the user can change permissions in MT settings.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Get File Access Policy";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_get_access_policy";
    }

    public C22035(C4773 c4773) {
        this.f70635 = c4773;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f70636 == null) {
            this.f70636 = JSON.object().add("type", "object").add("additionalProperties", false).add("properties", JSON.object()).add(AnnotationHandler.REQUIRED, JSON.array());
        }
        return this.f70636;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f70637 == null) {
            this.f70637 = C1648.m5535("Result for mt_file_get_access_policy.", C1648.m5532(JSON.object().add("homePath", C1648.m5545("string", "Normalized absolute Home path.")).add("rules", C7416.m19939("type", "array", "description", "Access rules in descending priority order. The first matching active rule wins; the final / directory rule is the default. Inactive rules are shadowed by Home or managed paths.").add("items", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute rule target.")).add("targetType", C1648.m5545("string", "file or directory.")).add(am.Q, C1648.m5545("string", "read_only, read_write, or deny.")), ClassTransform.BOOLEAN, "Whether the rule currently participates in matching.", "active", "Explicit path access rule."))).add("managedPaths", C7416.m19939("type", "array", "description", "Permanently denied MT managed roots.").add("items", C1648.m5545("string", "Normalized absolute path."))), "Current MCP file access policy."), C1648.m5540(C1648.m5532(JSON.object(), "No tool-specific diagnostics are emitted by this query.")), C1648.m5534("Always empty for this query."));
        }
        return this.f70637;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        if (!jSONObject.names().isEmpty()) {
            String str = (String) jSONObject.names().get(0);
            throw C3059.m9364("Invalid file access policy argument", str, jSONObject.get(str), JSON.array(), JSON.object());
        }
        C7383 c7383M41607 = ((C17760) this.f70635.f15145).m41607();
        JSONArray jSONArrayArray = JSON.array();
        for (C13732 c13732 : c7383M41607.f22728) {
            jSONArrayArray.add(JSON.object().add(MotionUtils.EASING_TYPE_PATH, c13732.f41009).add("targetType", c13732.f41010.m18549()).add(am.Q, c13732.f41007.m16738()).add("active", c13732.f41008));
        }
        JSONArray jSONArrayArray2 = JSON.array();
        Iterator it = c7383M41607.f22727.iterator();
        while (it.hasNext()) {
            jSONArrayArray2.add((String) it.next());
        }
        return new C12936(C19993.m46095(JSON.object().add("homePath", c7383M41607.f22726).add("rules", jSONArrayArray).add("managedPaths", jSONArrayArray2), JSON.array()));
    }
}
