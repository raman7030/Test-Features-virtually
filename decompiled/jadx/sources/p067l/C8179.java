package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8179 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f21589;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f21590;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f21591;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "List saved non-temporary APK workspaces that can be reopened. Pass data.items[].path to mt_apk_workspace_open.path with temporary=false. sourcePath is the recorded absolute source path and may no longer exist; do not pass sourcePath to mt_apk_workspace_open. Results are sorted by lastAccessedAt descending. Corrupt or unavailable saved workspaces are skipped and counted in data.unavailableCount.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "List APK Workspaces";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_workspace_list";
    }

    public C8179(C21180 c21180) {
        this.f21591 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f21589;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{}");
        this.f21589 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f21590;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_workspace_list. data.items[] contains saved non-temporary APK workspaces; pass items[i].path to mt_apk_workspace_open.path with temporary=false. sourcePath is informational and may no longer exist; nextActions is always empty.", C20175.m45657(JSON.object().add("items", C9417.m21913("type", "array", "description", "Saved non-temporary APK workspaces sorted by lastAccessedAt descending.").add("items", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id used by MT MCP tools after opening.")).add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Workspace URI beginning with mt://workspace/ to pass directly to mt_apk_workspace_open.path with temporary=false.")).add("sourcePath", C3935.m7772("string", "Absolute source APK path recorded when the workspace was created. It is informational, may no longer exist, and must not be passed to mt_apk_workspace_open; pass path instead.")).add("sourceExists", C3935.m7775(ClassTransform.BOOLEAN, "Whether sourcePath currently points to an ordinary file.")).add("temporary", C3935.m7775(ClassTransform.BOOLEAN, "Always false because this tool excludes temporary workspaces.")).add("apkFileName", C3935.m7772("string", "Source APK file name when available.")).add("appLabel", C3935.m7772("string", "Resolved or raw application label when available.")).add("packageName", C3935.m7772("string", "Manifest package name when available.")).add("versionName", C3935.m7772("string", "Manifest versionName when available.")).add("versionCode", C3935.m7772("integer", "Manifest versionCode when available.")).add("createdAt", C3935.m7775("integer", "Workspace creation time as epoch milliseconds.")).add("lastAccessedAt", C3935.m7775("integer", "Last recorded workspace access time as epoch milliseconds.")).add("manifestAvailable", C3935.m7775(ClassTransform.BOOLEAN, "Whether AndroidManifest.xml was parsed successfully.")).add("manifestError", C3935.m7772("string", "Manifest parse error, or null.")), "Existing non-temporary APK workspace."))).add("returnedCount", C3935.m7775("integer", "Number of non-temporary workspaces returned.")), "integer", "Number of saved workspaces skipped because their data was unavailable or corrupt.", "unavailableCount", "Successful mt_apk_workspace_list data."), C3935.m7770(C14214.m32686()), C3935.m7764("No follow-up action is required; use data.items[].path directly with mt_apk_workspace_open."));
        this.f21590 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        int i;
        Iterator it = jSONObject.names().iterator();
        if (!it.hasNext()) {
            try {
                return new C14663(C12203.m28175(this.f21591.m47835()));
            } finally {
                i = C10798.f29931;
            }
        }
        String str = (String) it.next();
        throw C5276.m11406("Invalid list_workspaces argument", str, jSONObject.get(str), JSON.array(), JSON.object());
    }
}
