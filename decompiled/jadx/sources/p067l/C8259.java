package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;

/* JADX INFO: renamed from: l.ۛܿۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79X */
/* JADX INFO: loaded from: classes3.dex */
public final class C8259 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C14964 f21868;

    /* JADX INFO: renamed from: ۜ */
    public final C20250 f21869;

    /* JADX INFO: renamed from: ۡ */
    public final C24272 f21870;

    /* JADX INFO: renamed from: ۢ */
    public final C21180 f21871;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f21872;

    /* JADX INFO: renamed from: ܳ */
    public final C18908 f21873;

    /* JADX INFO: renamed from: ܽ */
    public final C18237 f21874;

    /* JADX INFO: renamed from: ܿ */
    public final C16799 f21875;

    /* JADX INFO: renamed from: ᩳ */
    public final C24847 f21876;

    /* JADX INFO: renamed from: ᩷ */
    public final C7509 f21877;

    /* JADX INFO: renamed from: ᩻ */
    public final C4827 f21878;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Continue a paged APK result, including search pages, native ELF item pages from mt_apk_native_list_items, and native xref scan pages from mt_apk_native_xref. Call this tool only for an action with tool=mt_apk_continue and purpose=continue, or a cursor page with data.pagination.hasMore=true. Prefer copying workspaceId, editSessionId, nextCursor, and limit from the matching nextActions[].arguments. If you only have data.pagination.nextCursor, reuse data.workspaceId and data.editSessionId from the same result. For search and native_xref, data.pagination.totalAvailableCount may be null; null means unknown and must not stop continuation. The presence of nextActions alone does not imply pagination; follow each action's tool and purpose. Native disassembly continuation calls mt_apk_native_disassemble directly. Treat nextCursor as opaque and copy it unchanged. For mt_apk_list_available_apks continuation, copy workspaceId=\"available_apks\" and editSessionId=\"\" exactly. Do not include the original tool's arguments such as prefix, namePrefix, demangle, locator, query, itemKind, address, scanKind, referenceKinds, maxScanBytes, or byte offsets.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Continue APK Cursor";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return null;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_continue";
    }

    public C8259(C21180 c21180, C18237 c18237, C18908 c18908, C4827 c4827, C7509 c7509, C24272 c24272, C20250 c20250, C14964 c14964, C24847 c24847, C16799 c16799) {
        this.f21871 = c21180;
        this.f21874 = c18237;
        this.f21873 = c18908;
        this.f21878 = c4827;
        this.f21877 = c7509;
        this.f21870 = c24272;
        this.f21869 = c20250;
        this.f21868 = c14964;
        this.f21876 = c24847;
        this.f21875 = c16799;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f21872;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id originally returned by mt_apk_workspace_open; copy it unchanged from nextActions[].arguments.workspaceId, or use data.workspaceId from the result that produced data.pagination.nextCursor. For mt_apk_list_available_apks continuation, pass the sentinel value available_apks exactly.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Copy nextActions[].arguments.editSessionId when available; otherwise use data.editSessionId from the result that produced data.pagination.nextCursor. For edited sessions this is the id returned by mt_apk_session_create; use an empty string for the base APK and for mt_apk_list_available_apks continuation.\"\n  },\n  \"nextCursor\": {\n    \"type\": \"string\",\n    \"description\": \"Opaque cursor copied unchanged from nextActions[].arguments.nextCursor or data.pagination.nextCursor. Do not parse, construct, concatenate, or modify the cursor.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Page size for the continuation. Copy nextActions[].arguments.limit by default. For text reads use 1..2000 lines; for byte reads use 1..65536 bytes; for other pages use data.pagination.limitMax.\"\n  }\n}\n");
        this.f21872 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C16895 c16895M34065 = C14884.m34065(jSONObject);
            String str = c16895M34065.f50015;
            String str2 = c16895M34065.f50014;
            String str3 = c16895M34065.f50016;
            if ("available_apks".equals(str3) && str2.isEmpty()) {
                C4763 c4763M45667 = C20186.m45667(str, 0, str3, str2);
                if (!"available_apks".equals(c4763M45667.f10790)) {
                    throw C5276.m11406("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C14663 c14663M34259 = this.f21868.m34259(c4763M45667, jSONObject);
                int i = C10798.f29931;
                return c14663M34259;
            }
            try {
                C4763 c4763M45668 = C20186.m45667(str, this.f21871.m47821(str3, str2), str3, str2);
                String str4 = c4763M45668.f10790;
                if ("list".equals(str4)) {
                    C14663 c14663M41488 = this.f21874.m41488(c4763M45668, jSONObject);
                    int i2 = C10798.f29931;
                    return c14663M41488;
                }
                if ("outline_class".equals(str4)) {
                    C14663 c14663M43015 = this.f21873.m43015(c4763M45668, jSONObject, new C17502());
                    int i3 = C10798.f29931;
                    return c14663M43015;
                }
                if ("read".equals(str4)) {
                    C14663 c14663M10237 = this.f21878.m10237(c4763M45668, jSONObject, new C17502());
                    int i4 = C10798.f29931;
                    return c14663M10237;
                }
                if ("search".equals(str4)) {
                    C14663 c14663M17404 = this.f21877.m17404(c4763M45668, jSONObject, new C17502());
                    int i5 = C10798.f29931;
                    return c14663M17404;
                }
                if ("xref".equals(str4)) {
                    C14663 c14663M53612 = this.f21870.m53612(c4763M45668, jSONObject);
                    int i6 = C10798.f29931;
                    return c14663M53612;
                }
                if ("resource_xref".equals(str4)) {
                    C14663 c14663M45740 = this.f21869.m45740(c4763M45668, jSONObject);
                    int i7 = C10798.f29931;
                    return c14663M45740;
                }
                if ("native_items".equals(str4)) {
                    C14663 c14663M54578 = this.f21876.m54578(c4763M45668, jSONObject);
                    int i8 = C10798.f29931;
                    return c14663M54578;
                }
                if (!"native_xref".equals(str4)) {
                    throw C5276.m11406("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                C14663 c14663M38079 = this.f21875.m38079(c4763M45668, jSONObject);
                int i9 = C10798.f29931;
                return c14663M38079;
            } catch (C5276 e) {
                if (e.f12408) {
                    int i10 = C10798.f29931;
                }
                throw e;
            }
        } catch (Throwable th) {
            int i11 = C10798.f29931;
            throw th;
        }
    }
}
