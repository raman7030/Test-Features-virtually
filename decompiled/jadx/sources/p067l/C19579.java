package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7AG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19579 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f59579;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f59580;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f59581;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Use first. Open a read-only APK workspace. Inputs are path and temporary: use \"mt://current-apk\" for the current APK file, data.items[].path (\"mt://workspace/<workspaceId>\") returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, or an allowed absolute path or Home-relative APK path. mt_apk_list_available_apks returns Home-relative paths that can be passed directly. Set temporary=true for one-time workspaces that may be inspected, edited, built, then deleted as a whole. Temporary workspaces are intended for targeted verification; prefer a reusable workspace for extensive Smali analysis or searches. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later. Returns workspaceId, temporary, apkFileName, compact manifest/count/capability/signature summaries, and inspect nextActions.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Open APK";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_workspace_open";
    }

    public C19579(C21180 c21180) {
        this.f59581 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f59579;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"path\": {\n    \"type\": \"string\",\n    \"description\": \"Path target for mt_apk_workspace_open. Use ${CURRENT_APK_PATH} exactly when the user asks to analyze the current APK or current app. Pass items[i].path (${WORKSPACE_PATH_PREFIX}<workspaceId>) returned by mt_apk_workspace_list with temporary=false when reopening an existing non-temporary workspace. Otherwise pass items[i].path returned by mt_apk_list_available_apks, another Home-relative APK path, or an allowed absolute APK path. Relative paths are resolved against the current Home and may contain dot segments only when the normalized result remains inside Home. URI forms, backslashes, and empty paths are rejected.\"\n  },\n  \"temporary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. temporary=true always creates a fresh workspace, is not reused by path, cannot be reopened with ${WORKSPACE_PATH_PREFIX}<workspaceId>, and may later be deleted by mt_apk_workspace_delete. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.\"\n  }\n}\n".replace("${CURRENT_APK_PATH}", "mt://current-apk").replace("${WORKSPACE_PATH_PREFIX}", "mt://workspace/"));
        this.f59579 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f59580;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_workspace_open. data returns workspaceId, temporary status, compact APK summaries, capability flags, and signing certificate summaries; nextActions carries executable inspect, retry, or optional temporary cleanup calls.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id to pass to mt_apk_list, mt_apk_dex_read_class_outline, mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, mt_apk_search, mt_apk_dex_xref, mt_apk_resource_xref, or mt_apk_continue.")).add("temporary", C3935.m7775(ClassTransform.BOOLEAN, "Whether this workspace was opened as a one-time temporary workspace. Delete temporary workspaces with mt_apk_workspace_delete after they are no longer needed. Keep ordinary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed.")).add("apkFileName", C3935.m7772("string", "Opened APK file name.")).add("packageName", C3935.m7772("string", "Manifest package name when available.")).add("versionName", C3935.m7772("string", "Manifest versionName when available.")).add("versionCode", C3935.m7772("integer", "Manifest versionCode when available.")).add("minSdk", C3935.m7772("integer", "Manifest minSdk when available.")).add("targetSdk", C3935.m7772("integer", "Manifest targetSdk when available.")).add("appLabel", C3935.m7772("string", "Resolved or raw application label when available.")).add("counts", C3935.m7774(C3935.m7762(JSON.object().add("zipEntries", C3935.m7775("integer", "ZIP entry count.")).add("dexEntries", C3935.m7775("integer", "DEX entry count.")).add("xmlEntries", C3935.m7775("integer", "XML-looking entry count.")).add("classes", C3935.m7775("integer", "DEX class count when a dex summary is available.")), "Compact counts for major APK structures."))).add("capabilities", C3935.m7774(C3935.m7762(JSON.object().add("canReadAxml", C3935.m7775(ClassTransform.BOOLEAN, "AXML decode/read support.")).add("canSearchDexNames", C3935.m7775(ClassTransform.BOOLEAN, "Whether dex name search is available.")).add("canSearchDexStrings", C3935.m7775(ClassTransform.BOOLEAN, "Whether dex string search is available.")).add("canReadResourceTable", C3935.m7775(ClassTransform.BOOLEAN, "Whether resource table listing and reading are available.")), "Available APK analysis features for follow-up calls."))).add("signature", C3485.m6219(false)).add("resourceTableSummaryError", C3935.m7772("string", "resources.arsc summary error, or null.")), "Successful mt_apk_workspace_open data."), C3935.m7770(C3935.m7762(JSON.object(), "No mt_apk_workspace_open-specific diagnostics; call mt_apk_list_available_apks from nextActions to inspect available APK files.")), C3935.m7768("Executable inspect, retry, or optional temporary cleanup actions; copy arguments directly.", C3935.m7763(C12981.m29761(), "mt_apk_read_text", "inspect"), C3935.m7763(C20175.m45657(JSON.object().add("prefix", C3935.m7775("string", "Relative APK path prefix; empty string means no filter and may include the current APK sentinel.")), "integer", "Page size; recommended value is 50 and maximum is 200.", "limit", "Arguments for mt_apk_list_available_apks."), "mt_apk_list_available_apks", "inspect"), C3935.m7763(C12981.m29770(), "mt_apk_list", "inspect"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry"), C3935.m7763(C20175.m45657(JSON.object(), "string", "Temporary workspace id to close only when this workspace is no longer needed; close deletes the temporary workspace and associated state, including edit sessions.", "workspaceId", "Arguments for mt_apk_workspace_delete."), "mt_apk_workspace_delete", "cleanup")));
        this.f59580 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C5283 c5283M44488 = m44488(C14884.m34041(jSONObject));
            int i = C10798.f29931;
            JSONObject jSONObjectM23751 = C10191.m23751(m44487(c5283M44488));
            this.f59581.m47844(c5283M44488.f12420);
            return new C14663(jSONObjectM23751);
        } catch (Throwable th) {
            int i2 = C10798.f29931;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C5283 m44488(C24531 c24531) {
        String str = c24531.f77691;
        String strM29354 = (str == null && c24531.f77694 == null) ? C12810.m29354() : str;
        C21180 c21180 = this.f59581;
        if (strM29354 == null) {
            return c21180.m47828(c24531);
        }
        String strM31907 = C14059.m31907(strM29354, MotionUtils.EASING_TYPE_PATH);
        if (str == null) {
            c24531 = new C24531(strM31907, null, c24531.f77692, c24531.f77693);
        }
        C11872 c11872M18139 = C23499.m52232().m18139(strM31907);
        try {
            C5283 c5283M47828 = c21180.m47828(c24531);
            c11872M18139.close();
            return c5283M47828;
        } catch (Throwable th) {
            try {
                c11872M18139.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m44487(C5283 c5283) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList arrayList = c5283.f12423;
        boolean z = c5283.f12421;
        String str = c5283.f12420;
        JSONObject jSONObjectAdd = jSONObjectObject.add("zipEntries", arrayList.size()).add("dexEntries", c5283.f12427.size()).add("xmlEntries", c5283.f12424).add("classes", c5283.f12426.f25793);
        JSONObject jSONObjectAdd2 = JSON.object().add("canReadAxml", true);
        boolean z2 = c5283.f12422;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("canSearchDexNames", z2).add("canSearchDexStrings", c5283.f12425);
        C20350 c20350 = c5283.f12419;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("canReadResourceTable", c20350.f62838);
        JSONArray jSONArrayArray = JSON.array();
        C21527 c21527 = c5283.f12429;
        if (c21527.f67918) {
            jSONArrayArray.add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", "").add("locator", C14884.m34021("axml", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "inspect", "Read decoded AndroidManifest.xml"));
        }
        jSONArrayArray.add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", "").add("view", "zip_entries").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List APK ZIP entries"));
        if (z2) {
            jSONArrayArray.add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", "").add("view", "dex_classes").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List dex classes"));
        }
        if (c20350.f62838) {
            jSONArrayArray.add(C11982.m27418(C9417.m21913("workspaceId", str, "editSessionId", "").add("view", "resource_table").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List resource table"));
        }
        if (z) {
            jSONArrayArray.add(C11982.m27418(JSON.object().add("workspaceId", str), "mt_apk_workspace_delete", "cleanup", "Clean up this temporary workspace only after it is no longer needed"));
        }
        String str2 = c21527.f67913;
        if (str2 == null) {
            str2 = c21527.f67916;
        }
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", str).add("temporary", z);
        String str3 = c5283.f12418;
        if (str3 != null) {
            jSONObjectAdd5.add("apkFileName", str3);
        }
        String str4 = c21527.f67922;
        if (str4 != null) {
            jSONObjectAdd5.add("packageName", str4);
        }
        String str5 = c21527.f67915;
        if (str5 != null) {
            jSONObjectAdd5.add("versionName", str5);
        }
        m44489(jSONObjectAdd5, "versionCode", c21527.f67921);
        m44489(jSONObjectAdd5, "minSdk", c21527.f67917);
        m44489(jSONObjectAdd5, "targetSdk", c21527.f67914);
        if (str2 != null) {
            jSONObjectAdd5.add("appLabel", str2);
        }
        jSONObjectAdd5.add("counts", jSONObjectAdd).add("capabilities", jSONObjectAdd4).add("signature", C3485.m6218(c5283.f12428, false)).add("nextActions", jSONArrayArray);
        String str6 = c20350.f62839;
        if (str6 != null) {
            jSONObjectAdd5.add("resourceTableSummaryError", str6);
        }
        return jSONObjectAdd5;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.NULL, c5276.f12407);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44489(JSONObject jSONObject, String str, String str2) {
        Long lValueOf = null;
        if (str2 != null && !str2.isEmpty()) {
            int i = 0;
            while (true) {
                if (i < str2.length()) {
                    char cCharAt = str2.charAt(i);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    try {
                        lValueOf = Long.valueOf(Long.parseLong(str2));
                        break;
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        if (lValueOf != null) {
            jSONObject.add(str, lValueOf.longValue());
        }
    }
}
