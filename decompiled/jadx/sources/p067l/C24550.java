package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C24550 implements InterfaceC2696 {
    /* JADX INFO: renamed from: ֫ */
    public static String m54146(double d) {
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid number: " + d);
        }
        return C5595.m12401(Float.toString((float) d));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54147(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m54148(String str) {
        return m54147(str).trim();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54145(C5954 c5954) {
        JSONArray jSONArrayArray = JSON.array();
        String str = c5954.f14711;
        if (str != null) {
            jSONArrayArray.add(C11982.m27418(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("temporary", true), "mt_apk_workspace_open", "inspect", "Open built APK as a temporary workspace for one-time inspection"));
        }
        return C21370.m48410(JSON.object().add("workspaceId", c5954.f14710).add("editSessionId", c5954.f14701).add("outputPath", c5954.f14703).add("apkFileName", c5954.f14704).add("size", c5954.f14700).add("signingPerformed", c5954.f14699).add("signSchemes", C3223.m5566(c5954.f14702)).add("signatureSummary", C3485.m6218(c5954.f14706, false)).add("changedDexEntries", C3223.m5566(c5954.f14709)).add("changedClassCount", c5954.f14707).add("deletedClassCount", c5954.f14705).add("addedZipEntries", C3223.m5566(c5954.f14698)).add("changedZipEntries", C3223.m5566(c5954.f14708)).add("deletedZipEntries", C3223.m5566(c5954.f14712)), jSONArrayArray);
    }
}
