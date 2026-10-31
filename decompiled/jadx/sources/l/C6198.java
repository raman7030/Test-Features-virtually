package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۛܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79X */
/* JADX INFO: loaded from: classes3.dex */
public final class C6198 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13253 f19007;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C18815 f19008;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23047 f19009;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C19793 f19010;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f19011;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17403 f19012;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16697 f19013;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15184 f19014;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23652 f19015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5409 f19016;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C2587 f19017;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Continue a paged APK result, including search pages, native ELF item pages from mt_apk_native_list_items, and native xref scan pages from mt_apk_native_xref. Call this tool only for an action with tool=mt_apk_continue and purpose=continue, or a cursor page with data.pagination.hasMore=true. Prefer copying workspaceId, editSessionId, nextCursor, and limit from the matching nextActions[].arguments. If you only have data.pagination.nextCursor, reuse data.workspaceId and data.editSessionId from the same result. For search and native_xref, data.pagination.totalAvailableCount may be null; null means unknown and must not stop continuation. The presence of nextActions alone does not imply pagination; follow each action's tool and purpose. Native disassembly continuation calls mt_apk_native_disassemble directly. Treat nextCursor as opaque and copy it unchanged. For mt_apk_list_available_apks continuation, copy workspaceId=\"available_apks\" and editSessionId=\"\" exactly. Do not include the original tool's arguments such as prefix, namePrefix, demangle, locator, query, itemKind, address, scanKind, referenceKinds, maxScanBytes, or byte offsets.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Continue APK Cursor";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return null;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_continue";
    }

    public C6198(C19793 c19793, C16697 c16697, C17403 c17403, C2587 c2587, C5409 c5409, C23047 c23047, C18815 c18815, C13253 c13253, C23652 c23652, C15184 c15184) {
        this.f19010 = c19793;
        this.f19013 = c16697;
        this.f19012 = c17403;
        this.f19017 = c2587;
        this.f19016 = c5409;
        this.f19009 = c23047;
        this.f19008 = c18815;
        this.f19007 = c13253;
        this.f19015 = c23652;
        this.f19014 = c15184;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f19011;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id originally returned by mt_apk_workspace_open; copy it unchanged from nextActions[].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, pass the sentinel value available_apks exactly.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Copy nextActions[].arguments.editSessionId when available; otherwise use data.editSessionId from the result that produced data.pagination.nextCursor. For edited sessions this is the id returned by mt_apk_session_create; use an empty string for the base APK and for mt_apk_list_available_apks continuation.\"\n  },\n  \"nextCursor\": {\n    \"type\": \"string\",\n    \"description\": \"Opaque cursor copied unchanged from nextActions[].arguments.nextCursor or data.pagination.nextCursor. Do not parse, construct, concatenate, or modify the cursor.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the continuation. Copy nextActions[].arguments.limit by default. For text reads use 1..2000 lines; for byte reads use 1..65536 bytes; for other pages use data.pagination.limitMax.\"\n  }\n}\n");
        this.f19011 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C15285 c15285M31969 = C13169.m31969(jSONObject);
            String str = c15285M31969.f46888;
            String str2 = c15285M31969.f46887;
            String str3 = c15285M31969.f46889;
            if ("available_apks".equals(str3) && str2.isEmpty()) {
                C2519 c2519M43400 = C18747.m43400(str, 0, str3, str2);
                if (!"available_apks".equals(c2519M43400.f7998)) {
                    throw C3059.m9364("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C12936 c12936M32160 = this.f19007.m32160(c2519M43400, jSONObject);
                int i = C8869.f27007;
                return c12936M32160;
            }
            try {
                C2519 c2519M43401 = C18747.m43400(str, this.f19010.m45510(str3, str2), str3, str2);
                String str4 = c2519M43401.f7998;
                if ("list".equals(str4)) {
                    C12936 c12936M39252 = this.f19013.m39252(c2519M43401, jSONObject);
                    int i2 = C8869.f27007;
                    return c12936M39252;
                }
                if ("outline_class".equals(str4)) {
                    C12936 c12936M40758 = this.f19012.m40758(c2519M43401, jSONObject, new C15923());
                    int i3 = C8869.f27007;
                    return c12936M40758;
                }
                if ("read".equals(str4)) {
                    C12936 c12936M8198 = this.f19017.m8198(c2519M43401, jSONObject, new C15923());
                    int i4 = C8869.f27007;
                    return c12936M8198;
                }
                if ("search".equals(str4)) {
                    C12936 c12936M15493 = this.f19016.m15493(c2519M43401, jSONObject, new C15923());
                    int i5 = C8869.f27007;
                    return c12936M15493;
                }
                if ("xref".equals(str4)) {
                    C12936 c12936M51219 = this.f19009.m51219(c2519M43401, jSONObject);
                    int i6 = C8869.f27007;
                    return c12936M51219;
                }
                if ("resource_xref".equals(str4)) {
                    C12936 c12936M43471 = this.f19008.m43471(c2519M43401, jSONObject);
                    int i7 = C8869.f27007;
                    return c12936M43471;
                }
                if ("native_items".equals(str4)) {
                    C12936 c12936M52175 = this.f19015.m52175(c2519M43401, jSONObject);
                    int i8 = C8869.f27007;
                    return c12936M52175;
                }
                if (!"native_xref".equals(str4)) {
                    throw C3059.m9364("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C12936 c12936M35919 = this.f19014.m35919(c2519M43401, jSONObject);
                int i9 = C8869.f27007;
                return c12936M35919;
            } catch (C3059 e) {
                if (e.f9605) {
                    int i10 = C8869.f27007;
                }
                throw e;
            }
        } catch (Throwable th) {
            int i11 = C8869.f27007;
            throw th;
        }
    }
}
