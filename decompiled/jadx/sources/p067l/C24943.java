package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 779S */
/* JADX INFO: loaded from: classes.dex */
public final class C24943 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f79648;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f79649;

    /* JADX INFO: renamed from: ܽ */
    public final C4827 f79650;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Use this when you need raw bytes from a known zip_entry locator, whether the entry is text or binary, in the base workspace or an edit session. It returns uppercase hex bytes in data.byteWindow.hex. It accepts only zip_entry: locator strings; AXML and resources.arsc bytes include edits from the selected session. Do not use this for dex smali text, resource table values, virtual addresses, or ELF section addresses. Continue byte pages via nextActions.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Read APK Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_read_bytes";
    }

    public C24943(C4827 c4827) {
        this.f79650 = c4827;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f79648;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to keep reading in the edited session context; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:classes.dex. The zip_entry: prefix is required.\"\n  },\n  \"byteOffset\": {\n    \"type\": \"integer\",\n    \"description\": \"Byte offset for the first page. Pass 0 by default.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes to return on this page. Pass 256 by default; maximum 65536.\"\n  }\n}\n");
        this.f79648 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f79649;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM20448 = C8850.m20448();
        this.f79649 = jSONObjectM20448;
        return jSONObjectM20448;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48412(c5276, JSON.object().add("failures", C14214.m32685(c5276.f12412.getJSONArray("failures"))), c5276.f12407);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            return this.f79650.m10236(C14884.m34090(jSONObject), new C17502());
        } finally {
            int i = C10798.f29931;
        }
    }
}
