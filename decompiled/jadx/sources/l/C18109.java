package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩳܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: U7AG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18109 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f56366;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f56367;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f56368;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Use first. Open a read-only APK workspace. Inputs are path and temporary: use \"mt://current-apk\" for the current APK file, data.items[].path (\"mt://workspace/<workspaceId>\") returned by mt_apk_workspace_list with temporary=false to reopen an existing non-temporary workspace, or an allowed absolute path or Home-relative APK path. mt_apk_list_available_apks returns Home-relative paths that can be passed directly. Set temporary=true for one-time workspaces that may be inspected, edited, built, then deleted as a whole. Temporary workspaces are intended for targeted verification; prefer a reusable workspace for extensive Smali analysis or searches. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later. Returns workspaceId, temporary, apkFileName, compact manifest/count/capability/signature summaries, and inspect nextActions.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Open APK";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_workspace_open";
    }

    public C18109(C19793 c19793) {
        this.f56368 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f56366;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"path\": {\n    \"type\": \"string\",\n    \"description\": \"Path target for mt_apk_workspace_open. Use ${CURRENT_APK_PATH} exactly when the user asks to analyze the current APK or current app. Pass items[i].path (${WORKSPACE_PATH_PREFIX}<workspaceId>) returned by mt_apk_workspace_list with temporary=false when reopening an existing non-temporary workspace. Otherwise pass items[i].path returned by mt_apk_list_available_apks, another Home-relative APK path, or an allowed absolute APK path. Relative paths are resolved against the current Home and may contain dot segments only when the normalized result remains inside Home. URI forms, backslashes, and empty paths are rejected.\"\n  },\n  \"temporary\": {\n    \"type\": \"boolean\",\n    \"description\": \"Set true for one-time generated, candidate, comparison, or diagnostic APK workspaces that may be inspected, edited, built, then deleted as a whole. temporary=true always creates a fresh workspace, is not reused by path, cannot be reopened with ${WORKSPACE_PATH_PREFIX}<workspaceId>, and may later be deleted by mt_apk_workspace_delete. Set false when the same workspace may need to be reused, reopened, kept long-term, or revisited later.\"\n  }\n}\n".replace("${CURRENT_APK_PATH}", "mt://current-apk").replace("${WORKSPACE_PATH_PREFIX}", "mt://workspace/"));
        this.f56366 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f56367;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_workspace_open. data returns workspaceId, temporary status, compact APK summaries, capability flags, and signing certificate summaries; nextActions carries executable inspect, retry, or optional temporary cleanup calls.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id to pass to mt_apk_list, mt_apk_dex_read_class_outline, mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, mt_apk_search, mt_apk_dex_xref, mt_apk_resource_xref, or mt_apk_continue.")).add("temporary", C1648.m5545(ClassTransform.BOOLEAN, "Whether this workspace was opened as a one-time temporary workspace. Delete temporary workspaces with mt_apk_workspace_delete after they are no longer needed. Keep ordinary workspaces because they are reusable; delete an ordinary workspace only when the user explicitly asks or clearly confirms it is no longer needed.")).add("apkFileName", C1648.m5542("string", "Opened APK file name.")).add("packageName", C1648.m5542("string", "Manifest package name when available.")).add("versionName", C1648.m5542("string", "Manifest versionName when available.")).add("versionCode", C1648.m5542("integer", "Manifest versionCode when available.")).add("minSdk", C1648.m5542("integer", "Manifest minSdk when available.")).add("targetSdk", C1648.m5542("integer", "Manifest targetSdk when available.")).add("appLabel", C1648.m5542("string", "Resolved or raw application label when available.")).add("counts", C1648.m5544(C1648.m5532(JSON.object().add("zipEntries", C1648.m5545("integer", "ZIP entry count.")).add("dexEntries", C1648.m5545("integer", "DEX entry count.")).add("xmlEntries", C1648.m5545("integer", "XML-looking entry count.")).add("classes", C1648.m5545("integer", "DEX class count when a dex summary is available.")), "Compact counts for major APK structures."))).add("capabilities", C1648.m5544(C1648.m5532(JSON.object().add("canReadAxml", C1648.m5545(ClassTransform.BOOLEAN, "AXML decode/read support.")).add("canSearchDexNames", C1648.m5545(ClassTransform.BOOLEAN, "Whether dex name search is available.")).add("canSearchDexStrings", C1648.m5545(ClassTransform.BOOLEAN, "Whether dex string search is available.")).add("canReadResourceTable", C1648.m5545(ClassTransform.BOOLEAN, "Whether resource table listing and reading are available.")), "Available APK analysis features for follow-up calls."))).add("signature", C1175.m3977(false)).add("resourceTableSummaryError", C1648.m5542("string", "resources.arsc summary error, or null.")), "Successful mt_apk_workspace_open data."), C1648.m5540(C1648.m5532(JSON.object(), "No mt_apk_workspace_open-specific diagnostics; call mt_apk_list_available_apks from nextActions to inspect available APK files.")), C1648.m5538("Executable inspect, retry, or optional temporary cleanup actions; copy arguments directly.", C1648.m5533(C11166.m27699(), "mt_apk_read_text", "inspect"), C1648.m5533(C18736.m43390(JSON.object().add("prefix", C1648.m5545("string", "Relative APK path prefix; empty string means no filter and may include the current APK sentinel.")), "integer", "Page size; recommended value is 50 and maximum is 200.", "limit", "Arguments for mt_apk_list_available_apks."), "mt_apk_list_available_apks", "inspect"), C1648.m5533(C11166.m27708(), "mt_apk_list", "inspect"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry"), C1648.m5533(C18736.m43390(JSON.object(), "string", "Temporary workspace id to close only when this workspace is no longer needed; close deletes the temporary workspace and associated state, including edit sessions.", "workspaceId", "Arguments for mt_apk_workspace_delete."), "mt_apk_workspace_delete", "cleanup")));
        this.f56367 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C3067 c3067M42229 = m42229(C13169.m31945(jSONObject));
            int i = C8869.f27007;
            JSONObject jSONObjectM21782 = C8231.m21782(m42228(c3067M42229));
            this.f56368.m45533(c3067M42229.f9617);
            return new C12936(jSONObjectM21782);
        } catch (Throwable th) {
            int i2 = C8869.f27007;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3067 m42229(C23319 c23319) {
        String str = c23319.f74944;
        String strM27292 = (str == null && c23319.f74947 == null) ? C10986.m27292() : str;
        C19793 c19793 = this.f56368;
        if (strM27292 == null) {
            return c19793.m45517(c23319);
        }
        String strM29847 = C12301.m29847(strM27292, MotionUtils.EASING_TYPE_PATH);
        if (str == null) {
            c23319 = new C23319(strM29847, null, c23319.f74945, c23319.f74946);
        }
        C10000 c10000M16220 = C22233.m49904().m16220(strM29847);
        try {
            C3067 c3067M45517 = c19793.m45517(c23319);
            c10000M16220.close();
            return c3067M45517;
        } catch (Throwable th) {
            try {
                c10000M16220.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m42228(C3067 c3067) {
        JSONObject jSONObjectObject = JSON.object();
        ArrayList arrayList = c3067.f9620;
        boolean z = c3067.f9618;
        String str = c3067.f9617;
        JSONObject jSONObjectAdd = jSONObjectObject.add("zipEntries", arrayList.size()).add("dexEntries", c3067.f9624.size()).add("xmlEntries", c3067.f9621).add("classes", c3067.f9623.f22880);
        JSONObject jSONObjectAdd2 = JSON.object().add("canReadAxml", true);
        boolean z2 = c3067.f9619;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("canSearchDexNames", z2).add("canSearchDexStrings", c3067.f9622);
        C18920 c18920 = c3067.f9616;
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("canReadResourceTable", c18920.f59607);
        JSONArray jSONArrayArray = JSON.array();
        C20158 c20158 = c3067.f9626;
        if (c20158.f65275) {
            jSONArrayArray.add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", "").add("locator", C13169.m31925("axml", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_apk_read_text", "inspect", "Read decoded AndroidManifest.xml"));
        }
        jSONArrayArray.add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", "").add("view", "zip_entries").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List APK ZIP entries"));
        if (z2) {
            jSONArrayArray.add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", "").add("view", "dex_classes").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List dex classes"));
        }
        if (c18920.f59607) {
            jSONArrayArray.add(C10115.m25398(C7416.m19939("workspaceId", str, "editSessionId", "").add("view", "resource_table").add("prefix", "").add("limit", 200), "mt_apk_list", "inspect", "List resource table"));
        }
        if (z) {
            jSONArrayArray.add(C10115.m25398(JSON.object().add("workspaceId", str), "mt_apk_workspace_delete", "cleanup", "Clean up this temporary workspace only after it is no longer needed"));
        }
        String str2 = c20158.f65270;
        if (str2 == null) {
            str2 = c20158.f65273;
        }
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", str).add("temporary", z);
        String str3 = c3067.f9615;
        if (str3 != null) {
            jSONObjectAdd5.add("apkFileName", str3);
        }
        String str4 = c20158.f65279;
        if (str4 != null) {
            jSONObjectAdd5.add("packageName", str4);
        }
        String str5 = c20158.f65272;
        if (str5 != null) {
            jSONObjectAdd5.add("versionName", str5);
        }
        m42230(jSONObjectAdd5, "versionCode", c20158.f65278);
        m42230(jSONObjectAdd5, "minSdk", c20158.f65274);
        m42230(jSONObjectAdd5, "targetSdk", c20158.f65271);
        if (str2 != null) {
            jSONObjectAdd5.add("appLabel", str2);
        }
        jSONObjectAdd5.add("counts", jSONObjectAdd).add("capabilities", jSONObjectAdd4).add("signature", C1175.m3976(c3067.f9625, false)).add("nextActions", jSONArrayArray);
        String str6 = c18920.f59608;
        if (str6 != null) {
            jSONObjectAdd5.add("resourceTableSummaryError", str6);
        }
        return jSONObjectAdd5;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, c3059.f9604);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42230(JSONObject jSONObject, String str, String str2) {
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
