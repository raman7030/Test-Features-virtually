package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0780 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14294 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f40701;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f40702;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f40703;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Build the current edit session into a new APK without modifying the source APK. For pre-build content checks without producing an APK, use mt_apk_session_check with runBuildChecks=true; passing them does not guarantee this build will succeed. All saved text, resource, byte edits, and deletions are included. Existing ZIP entries keep their compression method; new entries use APK compression rules. sign=true uses the signing key configured in MT MCP settings. sign=false skips signing but may preserve original signature data; it does not guarantee a valid signature on the changed APK. outputName is a file name in Home or an absolute path. The output file and its existing parent directory must have read-write access under the MCP file policy. An empty name selects <sourceBase>_mcp_<editSessionId>_sign.apk or <sourceBase>_mcp_<editSessionId>_unsigned.apk with the same overwrite policy as an explicit name. overwrite=false rejects an existing file; pass true only to allow replacement. Use nextActions to inspect the built APK.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Build APK";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_build";
    }

    public C14294(C21180 c21180) {
        this.f40703 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f40701;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"outputName\": {\n    \"type\": \"string\",\n    \"description\": \"Output APK file name in Home or an absolute path. The file and its existing parent directory must have MCP read-write access. Relative directory paths and URIs are not accepted. Use an empty string for the default name.\"\n  },\n  \"overwrite\": {\n    \"type\": \"boolean\",\n    \"description\": \"Applies to both default and explicit output names. If the output exists and overwrite=false, returns OUTPUT_ALREADY_EXISTS. Pass true only to allow replacement.\"\n  },\n  \"sign\": {\n    \"type\": \"boolean\",\n    \"description\": \"Required. Pass true normally to sign the output APK, or false to skip signing.\"\n  }\n}\n");
        this.f40701 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c5276.f12412;
        return C21370.m48412(c5276, C18426.m41996(jSONObject, "outputPath", C18426.m41996(jSONObject, "editSessionId", C18426.m41996(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId"), "outputPath").add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C14214.m32685(jSONObject.getJSONArray("failures"))), c5276.f12407);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f40702;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id used for this build.")).add("editSessionId", C3935.m7775("string", "Edit session id used for this build.")).add("outputPath", C3935.m7772("string", "Absolute path of the published APK output file.")).add("apkFileName", C3935.m7772("string", "Published APK file name.")).add("size", C3935.m7775("integer", "Published APK size in bytes.")).add("signingPerformed", C3935.m7775(ClassTransform.BOOLEAN, "Whether this build performed APK signing; false does not imply that preserved original signature data is absent.")).add("signSchemes", C3935.m7771("Signing schemes requested by MT MCP settings when signingPerformed=true; empty when signingPerformed=false."));
        JSONObject jSONObjectM6219 = C3485.m6219(false);
        jSONObjectM6219.put("description", "Signature data summary read without full verification. When build signingPerformed=false, this may still report original V1 entries or preserved V2/V3 data. Use mt_apk_read_signature after opening the built APK for full certificate attributes.");
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_build. data describes the published APK output, including signing results and changed dex/class counts.", C3935.m7762(jSONObjectAdd.add("signatureSummary", jSONObjectM6219).add("changedDexEntries", C3935.m7771("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C3935.m7775("integer", "Modified or deleted class count applied to the build.")).add("deletedClassCount", C3935.m7775("integer", "Deleted class count applied to the build.")).add("addedZipEntries", C3935.m7771("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C3935.m7771("Existing AXML or ordinary ZIP entries replaced by the edit session, including raw byte patches; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C3935.m7771("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful build data."), C3935.m7770(C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id, or null.")).add("editSessionId", C3935.m7772("string", "Edit session id, or null.")).add("outputPath", C3935.m7772("string", "Output path related to the error, or null.")).add("overlaySaved", C3935.m7775(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", C9417.m21913("type", "array", "description", "Edit session prepare failures when build stops before packaging.").add("items", C3935.m7762(JSON.object().add("locator", C3935.m7772("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C3935.m7772("string", "Dex class descriptor.")).add("errorCode", C3935.m7772("string", "Failure code.")).add("message", C3935.m7772("string", "Compiler error message.")).add("line", C3935.m7772("integer", "0-based line, or null.")).add("column", C3935.m7772("integer", "0-based column, or null.")), "One edit session prepare failure."))), "Build diagnostics.")), C3935.m7768("Successful build returns mt_apk_workspace_open with temporary=true for the published APK.", C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "inspect")));
        this.f40702 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        C21180 c21180 = this.f40703;
        try {
            C18173.m41392();
            C23191 c23191M34085 = C14884.m34085(jSONObject);
            String str = c23191M34085.f72866;
            C9385 c9385M51035 = C23499.m52231().m51035();
            String parent = str.startsWith("/") ? C18524.m42109(str, new String[0]).getParent() : c9385M51035.f25638;
            if (parent == null) {
                parent = str;
            }
            if (str.startsWith("/")) {
                c9385M51035.m21857(str);
                c9385M51035.m21855(str);
            }
            c9385M51035.m21857(parent);
            C11872 c11872M18142 = C23499.m52232().m18142(parent);
            try {
                InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
                try {
                    C5954 c5954M47829 = c21180.m47829(c23191M34085, c9385M51035.f25638);
                    int i = C10798.f29931;
                    C14663 c14663 = new C14663(C24550.m54145(c5954M47829));
                    interfaceC21173M47846.close();
                    c11872M18142.close();
                    return c14663;
                } catch (Throwable th) {
                    try {
                        interfaceC21173M47846.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c11872M18142.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            int i2 = C10798.f29931;
            throw th5;
        }
    }
}
