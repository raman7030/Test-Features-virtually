package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܰۤ */
/* JADX INFO: compiled from: B5JX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524 {
    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m35167(C16681 c16681) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c16681.f49089).add("editSessionId", c16681.f49090).add("runBuildChecks", c16681.f49095).add("pendingCompileCount", c16681.f49091).add("failedCount", c16681.f49099);
        ArrayList<C2600> arrayList = c16681.f49092;
        JSONArray jSONArrayArray = JSON.array();
        for (C2600 c2600 : arrayList) {
            JSONObject jSONObjectAdd2 = JSON.object().add("locator", C14884.m34055(c2600.f4300, c2600.f4307)).add("className", c2600.f4299).add("errorCode", c2600.f4305).add("message", c2600.f4302);
            Integer num = c2600.f4304;
            JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("line", num == null ? JSON.NULL : JSON.value(num.intValue()));
            Integer num2 = c2600.f4301;
            jSONArrayArray.add(jSONObjectAdd3.add("column", num2 == null ? JSON.NULL : JSON.value(num2.intValue())));
        }
        return C21370.m48410(jSONObjectAdd.add("failures", jSONArrayArray).add("buildCheckStatus", c16681.f49093).add("changedDexEntries", C3223.m5566(c16681.f49098)).add("changedClassCount", c16681.f49096).add("deletedClassCount", c16681.f49094).add("addedZipEntries", C3223.m5566(c16681.f49088)).add("changedZipEntries", C3223.m5566(c16681.f49097)).add("deletedZipEntries", C3223.m5566(c16681.f49100)), JSON.array());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35170(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m35171() {
        return C3935.m7765("Result for mt_apk_session_check. data returns edit session status and optional pre-build content checks without producing an APK.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id used for this edit check.")).add("editSessionId", C3935.m7775("string", "Edit session id used for this edit check.")).add("runBuildChecks", C3935.m7775(ClassTransform.BOOLEAN, "Whether this call ran pre-build content checks.")).add("pendingCompileCount", C3935.m7775("integer", "Number of edited Smali or AXML targets still awaiting validation.")).add("failedCount", C3935.m7775("integer", "Current Smali compile or AXML encode failure count.")).add("failures", m35166()).add("buildCheckStatus", C3935.m7775("string", "not_run means status only; passed means edited content preparation, changed entry reads, and Dex merge passed. This does not validate output paths, signing configuration, final APK packaging, or installability. Failed checks return an error envelope.")).add("changedDexEntries", C3935.m7771("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C3935.m7775("integer", "Modified or deleted class count included in the check.")).add("deletedClassCount", C3935.m7775("integer", "Deleted class count included in the check.")).add("addedZipEntries", C3935.m7771("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C3935.m7771("Existing AXML or ordinary ZIP entries replaced by the edit session; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C3935.m7771("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful mt_apk_session_check data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null.")).add("editSessionId", C3935.m7772("string", "Edit session id, or null.")).add("runBuildChecks", C3935.m7775(ClassTransform.BOOLEAN, "Whether this request was accepted for pre-build content checks. Parameter parsing failures always return false.")).add("overlaySaved", C3935.m7775(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", m35166()), "mt_apk_session_check diagnostics.")), C3935.m7768("mt_apk_session_check success emits no follow-up actions; errors may return retry or workspace verification actions.", C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry"), C3935.m7763(C12981.m29761(), "mt_apk_read_text", "retry"), C3935.m7763(C12981.m29760(), "mt_apk_read_bytes", "retry"), C3935.m7763(C12981.m29770(), "mt_apk_list", "verify_workspace"), C3935.m7763(C12981.m29774(), "mt_apk_dex_read_class_outline", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m35166() {
        return C9417.m21913("type", "array", "description", "Edit session prepare failures bound to locator. Success data describes current saved session failures. Error diagnostics describe prepare failures; use overlaySaved to distinguish saved text from rejected edits.").add("items", C3935.m7762(JSON.object().add("locator", C3935.m7772("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C3935.m7772("string", "Dex class descriptor.")).add("errorCode", C3935.m7772("string", "Failure code.")).add("message", C3935.m7772("string", "Compiler error message.")).add("line", C3935.m7772("integer", "0-based line, or null.")).add("column", C3935.m7772("integer", "0-based column, or null.")), "One edit session prepare failure."));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35169(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35168(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }
}
