package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0780 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12548 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f37675;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f37676;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f37677;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Build the current edit session into a new APK without modifying the source APK. For pre-build content checks without producing an APK, use mt_apk_session_check with runBuildChecks=true; passing them does not guarantee this build will succeed. All saved text, resource, byte edits, and deletions are included. Existing ZIP entries keep their compression method; new entries use APK compression rules. sign=true uses the signing key configured in MT MCP settings. sign=false skips signing but may preserve original signature data; it does not guarantee a valid signature on the changed APK. outputName is a file name in Home or an absolute path. The output file and its existing parent directory must have read-write access under the MCP file policy. An empty name selects <sourceBase>_mcp_<editSessionId>_sign.apk or <sourceBase>_mcp_<editSessionId>_unsigned.apk with the same overwrite policy as an explicit name. overwrite=false rejects an existing file; pass true only to allow replacement. Use nextActions to inspect the built APK.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Build APK";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_build";
    }

    public C12548(C19793 c19793) {
        this.f37677 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f37675;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Non-empty edit session id returned by mt_apk_session_create.\"\n  },\n  \"outputName\": {\n    \"type\": \"string\",\n    \"description\": \"Output APK file name in Home or an absolute path. The file and its existing parent directory must have MCP read-write access. Relative directory paths and URIs are not accepted. Use an empty string for the default name.\"\n  },\n  \"overwrite\": {\n    \"type\": \"boolean\",\n    \"description\": \"Applies to both default and explicit output names. If the output exists and overwrite=false, returns OUTPUT_ALREADY_EXISTS. Pass true only to allow replacement.\"\n  },\n  \"sign\": {\n    \"type\": \"boolean\",\n    \"description\": \"Required. Pass true normally to sign the output APK, or false to skip signing.\"\n  }\n}\n");
        this.f37675 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        JSONObject jSONObjectObject = JSON.object();
        JSONObject jSONObject = c3059.f9609;
        return C19993.m46097(c3059, C16895.m39755(jSONObject, "outputPath", C16895.m39755(jSONObject, "editSessionId", C16895.m39755(jSONObject, "workspaceId", jSONObjectObject, "workspaceId"), "editSessionId"), "outputPath").add("overlaySaved", jSONObject.getBoolean("overlaySaved", false)).add("failures", C12464.m30620(jSONObject.getJSONArray("failures"))), c3059.f9604);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f37676;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id used for this build.")).add("editSessionId", C1648.m5545("string", "Edit session id used for this build.")).add("outputPath", C1648.m5542("string", "Absolute path of the published APK output file.")).add("apkFileName", C1648.m5542("string", "Published APK file name.")).add("size", C1648.m5545("integer", "Published APK size in bytes.")).add("signingPerformed", C1648.m5545(ClassTransform.BOOLEAN, "Whether this build performed APK signing; false does not imply that preserved original signature data is absent.")).add("signSchemes", C1648.m5541("Signing schemes requested by MT MCP settings when signingPerformed=true; empty when signingPerformed=false."));
        JSONObject jSONObjectM3977 = C1175.m3977(false);
        jSONObjectM3977.put("description", "Signature data summary read without full verification. When build signingPerformed=false, this may still report original V1 entries or preserved V2/V3 data. Use mt_apk_read_signature after opening the built APK for full certificate attributes.");
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_build. data describes the published APK output, including signing results and changed dex/class counts.", C1648.m5532(jSONObjectAdd.add("signatureSummary", jSONObjectM3977).add("changedDexEntries", C1648.m5541("Dex entries rewritten or created during dex merge.")).add("changedClassCount", C1648.m5545("integer", "Modified or deleted class count applied to the build.")).add("deletedClassCount", C1648.m5545("integer", "Deleted class count applied to the build.")).add("addedZipEntries", C1648.m5541("New AXML or ordinary ZIP entries added by the edit session.")).add("changedZipEntries", C1648.m5541("Existing AXML or ordinary ZIP entries replaced by the edit session, including raw byte patches; resource patches appear here as resources.arsc.")).add("deletedZipEntries", C1648.m5541("Existing AXML or ordinary ZIP entries deleted by the edit session.")), "Successful build data."), C1648.m5540(C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id, or null.")).add("editSessionId", C1648.m5542("string", "Edit session id, or null.")).add("outputPath", C1648.m5542("string", "Output path related to the error, or null.")).add("overlaySaved", C1648.m5545(ClassTransform.BOOLEAN, "Only interpret for SMALI_COMPILE_FAILED_IN_SESSION or EDIT_TEXT_PREPARE_FAILED_IN_SESSION; true means the failing text was already saved in the edit session.")).add("failures", C7416.m19939("type", "array", "description", "Edit session prepare failures when build stops before packaging.").add("items", C1648.m5532(JSON.object().add("locator", C1648.m5542("string", "Failure text locator. Smali compile failures use dex_class because line and column are class-smali coordinates.")).add("className", C1648.m5542("string", "Dex class descriptor.")).add("errorCode", C1648.m5542("string", "Failure code.")).add("message", C1648.m5542("string", "Compiler error message.")).add("line", C1648.m5542("integer", "0-based line, or null.")).add("column", C1648.m5542("integer", "0-based column, or null.")), "One edit session prepare failure."))), "Build diagnostics.")), C1648.m5538("Successful build returns mt_apk_workspace_open with temporary=true for the published APK.", C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "inspect")));
        this.f37676 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        C19793 c19793 = this.f37677;
        try {
            C16629.m39164();
            C21909 c21909M31989 = C13169.m31989(jSONObject);
            String str = c21909M31989.f70152;
            C7383 c7383M48690 = C22233.m49903().m48690();
            String parent = str.startsWith("/") ? C16999.m39866(str, new String[0]).getParent() : c7383M48690.f22726;
            if (parent == null) {
                parent = str;
            }
            if (str.startsWith("/")) {
                c7383M48690.m19884(str);
                c7383M48690.m19882(str);
            }
            c7383M48690.m19884(parent);
            C10000 c10000M16223 = C22233.m49904().m16223(parent);
            try {
                InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
                try {
                    C3773 c3773M45518 = c19793.m45518(c21909M31989, c7383M48690.f22726);
                    int i = C8869.f27007;
                    C12936 c12936 = new C12936(C23340.m51748(c3773M45518));
                    interfaceC19785M45535.close();
                    c10000M16223.close();
                    return c12936;
                } catch (Throwable th) {
                    try {
                        interfaceC19785M45535.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c10000M16223.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            int i2 = C8869.f27007;
            throw th5;
        }
    }
}
