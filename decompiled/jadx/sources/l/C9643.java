package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۢܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6WN */
/* JADX INFO: loaded from: classes3.dex */
public final class C9643 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f29218;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f29219;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f29220;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Read full signing certificate metadata for the original APK saved in a workspace: certificate digests, subject, issuer, validity dates, and algorithms. This detects signature data without verifying signature validity or installability. Edit-session changes are not included. To inspect a built APK, first open that output with mt_apk_workspace_open, then pass its workspaceId. For a compact summary, use mt_apk_workspace_open or mt_apk_build results.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Read APK Signature Details";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_read_signature";
    }

    public C9643(C19793 c19793) {
        this.f29220 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f29218 == null) {
            this.f29218 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open. Reads that workspace's original APK, excluding edit-session changes.\"\n  }\n}\n");
        }
        return this.f29218;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f29219 == null) {
            this.f29219 = C1648.m5535("Result for mt_apk_read_signature.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id used for this read.")).add("signature", C1175.m3977(true)), "Original APK certificate metadata."), C1648.m5540(C12464.m30621()), C1648.m5538("Empty on success; workspace errors may offer reopening the source APK.", C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
        }
        return this.f29219;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        String strM31948 = C13169.m31948(jSONObject);
        return new C12936(C19993.m46095(JSON.object().add("workspaceId", strM31948).add("signature", C1175.m3976(this.f29220.m45534(strM31948), true)), JSON.array()));
    }
}
