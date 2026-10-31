package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩻֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAH9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23340 implements InterfaceC0345 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51749(double d) {
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw new IllegalArgumentException("Invalid number: " + d);
        }
        return C3395.m10362(Float.toString((float) d));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51750(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51751(String str) {
        return m51750(str).trim();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m51748(C3773 c3773) {
        JSONArray jSONArrayArray = JSON.array();
        String str = c3773.f11905;
        if (str != null) {
            jSONArrayArray.add(C10115.m25398(JSON.object().add(MotionUtils.EASING_TYPE_PATH, str).add("temporary", true), "mt_apk_workspace_open", "inspect", "Open built APK as a temporary workspace for one-time inspection"));
        }
        return C19993.m46095(JSON.object().add("workspaceId", c3773.f11904).add("editSessionId", c3773.f11895).add("outputPath", c3773.f11897).add("apkFileName", c3773.f11898).add("size", c3773.f11894).add("signingPerformed", c3773.f11893).add("signSchemes", C0899.m3247(c3773.f11896)).add("signatureSummary", C1175.m3976(c3773.f11900, false)).add("changedDexEntries", C0899.m3247(c3773.f11903)).add("changedClassCount", c3773.f11901).add("deletedClassCount", c3773.f11899).add("addedZipEntries", C0899.m3247(c3773.f11892)).add("changedZipEntries", C0899.m3247(c3773.f11902)).add("deletedZipEntries", C0899.m3247(c3773.f11906)), jSONArrayArray);
    }
}
