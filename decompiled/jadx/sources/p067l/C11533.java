package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۢܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6WN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11533 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f32167;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f32168;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f32169;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read full signing certificate metadata for the original APK saved in a workspace: certificate digests, subject, issuer, validity dates, and algorithms. This detects signature data without verifying signature validity or installability. Edit-session changes are not included. To inspect a built APK, first open that output with mt_apk_workspace_open, then pass its workspaceId. For a compact summary, use mt_apk_workspace_open or mt_apk_build results.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read APK Signature Details";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_read_signature";
    }

    public C11533(C21180 c21180) {
        this.f32169 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f32167 == null) {
            this.f32167 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Reads that workspace's original APK, excluding edit-session changes.\"\n  }\n}\n");
        }
        return this.f32167;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f32168 == null) {
            this.f32168 = C3935.m7765("Result for mt_apk_read_signature.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7775("string", "Workspace id used for this read.")).add("signature", C3485.m6219(true)), "Original APK certificate metadata."), C3935.m7770(C14214.m32686()), C3935.m7768("Empty on success; workspace errors may offer reopening the source APK.", C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
        }
        return this.f32168;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        String strM34044 = C14884.m34044(jSONObject);
        return new C14663(C21370.m48410(JSON.object().add("workspaceId", strM34044).add("signature", C3485.m6218(this.f32169.m47845(strM34044), true)), JSON.array()));
    }
}
