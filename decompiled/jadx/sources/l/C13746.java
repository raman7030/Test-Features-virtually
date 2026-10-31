package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13746 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m33053(C15060 c15060) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c15060.f45971).add("editSessionId", c15060.f45972).add("runBuildChecks", c15060.f45977).add("pendingCompileCount", c15060.f45973).add("failedCount", c15060.f45981);
        ArrayList<C0244> arrayList = c15060.f45974;
        JSONArray jSONArrayArray = JSON.array();
        for (C0244 c0244 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add("locator", C13169.m31959(c0244.f1522, c0244.f1529)).add("className", c0244.f1521).add("errorCode", c0244.f1527).add("message", c0244.f1524);
            Integer num = c0244.f1526;
            JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c0244.f1523;
            jSONArrayArray.add(jSONObjectAdd3.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return C19993.m46095(jSONObjectAdd.add("failures", jSONArrayArray).add("buildCheckStatus", c15060.f45975).add("changedDexEntries", C0899.m3247(c15060.f45980)).add("changedClassCount", c15060.f45978).add("deletedClassCount", c15060.f45976).add("addedZipEntries", C0899.m3247(c15060.f45970)).add("changedZipEntries", C0899.m3247(c15060.f45979)).add("deletedZipEntries", C0899.m3247(c15060.f45982)), JSON.array());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33056(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m33057() {
        return C1648.m5535("Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id used for this edit check.")).add("editSessionId", C1648.m5545("string", "Edit session id used for this edit check.")).add("runBuildChecks", C1648.m5545(ClassTransform.BOOLEAN, "Whether this call ran pre-build content checks.")).add("pendingCompileCount", C1648.m5545("integer", "Number of edited Smali or AXML targets still awaiting validation.")).add("failedCount", C1648.m5545("integer", "Current Smali compile or AXML encode failure count.")).add("failures", m33052()).add("buildCheckStatus", C1648.m5545("string", "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope.")).add("changedDexEntries", C1648.m5541("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C1648.m5545("integer", "Modified or deleted class count included in the check.")).add("deletedClassCount", C1648.m5545("integer", "Deleted class count included in the check.")).add("addedZipEntries", C1648.m5541("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C1648.m5541("Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C1648.m5541("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful mt_apk_session_check data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null.")).add("editSessionId", C1648.m5542("string", "Edit session id, or null.")).add("runBuildChecks", C1648.m5545(ClassTransform.BOOLEAN, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false.")).add("overlaySaved", C1648.m5545(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", m33052()), "mt_apk_session_check diagnostics.")), C1648.m5538("mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions.", C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry"), C1648.m5533(C11166.m27699(), "mt_apk_read_text", "retry"), C1648.m5533(C11166.m27698(), "mt_apk_read_bytes", "retry"), C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace"), C1648.m5533(C11166.m27712(), "mt_apk_dex_read_class_outline", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m33052() {
        return C7416.m19939("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits.").add("items", C1648.m5532(JSON.object().add("locator", C1648.m5542("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C1648.m5542("string", "Dex class descriptor.")).add("errorCode", C1648.m5542("string", "Failure code.")).add("message", C1648.m5542("string", "Compiler error message.")).add("line", C1648.m5542("integer", "0-based line, or null.")).add("column", C1648.m5542("integer", "0-based column, or null.")), "One edit session prepare failure."));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33055(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33054(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }
}
