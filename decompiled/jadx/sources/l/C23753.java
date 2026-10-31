package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.᩻ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 779S */
/* JADX INFO: loaded from: classes.dex */
public final class C23753 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f76896;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f76897;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2587 f76898;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Use this when you need raw bytes from a known zip_entry locator, whether the entry is text or binary, in the base workspace or an edit session. It returns uppercase hex bytes in data.byteWindow.hex. It accepts only zip_entry: locator strings; AXML and resources.arsc bytes include edits from the selected session. Do not use this for dex smali text, resource table values, virtual addresses, or ELF section addresses. Continue byte pages via nextActions.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Read APK Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_read_bytes";
    }

    public C23753(C2587 c2587) {
        this.f76898 = c2587;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f76896;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to keep reading in the edited session context; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:classes.dex. The zip_entry: prefix is required.\"\n  },\n  \"byteOffset\": {\n    \"type\": \"integer\",\n    \"description\": \"Byte offset for the first page. Pass 0 by default.\"\n  },\n  \"maxBytes\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum bytes to return on this page. Pass 256 by default; maximum 65536.\"\n  }\n}\n");
        this.f76896 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f76897;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM18499 = C6820.m18499();
        this.f76897 = jSONObjectM18499;
        return jSONObjectM18499;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.object().add("failures", C12464.m30620(c3059.f9609.getJSONArray("failures"))), c3059.f9604);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            return this.f76898.m8197(C13169.m31994(jSONObject), new C15923());
        } finally {
            int i = C8869.f27007;
        }
    }
}
