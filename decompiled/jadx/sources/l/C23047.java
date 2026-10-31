package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.alipay.sdk.m.t.e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes.dex */
public final class C23047 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f74158;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f74159;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f74160;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only; to inspect the containing method, pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Find APK Dex Xrefs";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_dex_xref";
    }

    public C23047(C19793 c19793) {
        this.f74160 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f74158;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f74158 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f74159;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM21794 = C8231.m21794();
        this.f74159 = jSONObjectM21794;
        return jSONObjectM21794;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C8231.m21791(c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            return m51217(C13169.m31970(jSONObject), false, (String) null);
        } finally {
            int i = C8869.f27007;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m51219(C2519 c2519, JSONObject jSONObject) {
        return m51217(C13169.m31983(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject), true, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12936 m51217(C9418 c9418, boolean z, String str) throws Exception {
        String str2 = c9418.f28566;
        C19793 c19793 = this.f74160;
        c19793.m45537(str2);
        try {
            InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
            try {
                C12936 c12936 = (C12936) c19793.m45511(str2, c9418.f28567, str, new C11759(this, c9418));
                interfaceC19785M45535.close();
                return c12936;
            } catch (Throwable th) {
                try {
                    interfaceC19785M45535.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (OutOfMemoryError e) {
            try {
                C19926.m45880("MT MCP xref out of memory: workspaceId=" + str2 + ", methodResolution=" + c9418.f28570 + ", continuation=" + z + ", error=" + e.getMessage());
            } catch (OutOfMemoryError unused) {
            }
            throw C18081.m42152();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m51218(C23047 c23047, C9418 c9418, int i) {
        String str;
        String str2 = c9418.f28567;
        C2776 c2776M45515 = c23047.f74160.m45515(c9418, new C15923());
        int i2 = C8869.f27007;
        String str3 = c2776M45515.f8651;
        ArrayList arrayList = c2776M45515.f8650;
        C1739 c1739 = c2776M45515.f8648;
        String strM31976 = C13169.m31976(str3, c2776M45515.f8652, c2776M45515.f8649);
        if ("dex_field".equals(str3)) {
            str = "field_access";
        } else {
            str = "dex_class".equals(str3) ? "type_reference" : "method_call";
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c2776M45515.f8653);
        int i3 = c9418.f28569;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("targetLocator", strM31976).add("referenceKind", str).add("methodResolution", c2776M45515.f8647);
        JSONArray jSONArrayArray = JSON.array();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C16180 c16180 = (C16180) it.next();
            jSONArrayArray.add(JSON.object().add("sourceLocator", C13169.m31925("dex_method", (String) null, c16180.f49833, c16180.f49837, (String) null, (String) null)).add("referenceOperand", c16180.f49835).add("matchKind", c16180.f49834).add("dispatchCertainty", c16180.f49831).add("opcode", c16180.f49836).add("instructionIndex", c16180.f49832));
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add(e.m, jSONArrayArray).add("nextActions", JSON.array());
        JSONObject jSONObjectAdd4 = JSON.object().add("hasMore", c1739 != null).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", (String) null);
        if (c1739 != null) {
            String strM43398 = C18747.m43398("xref", c2776M45515.f8653, c9418.f28567, i, JSON.object().add("targetLocator", C13169.m31976(c9418.f28572, c9418.f28565, c9418.f28571)).add("methodResolution", c9418.f28570).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("classIndex", c1739.f6012).add("memberIndex", c1739.f6014).add("instructionIndex", c1739.f6013));
            jSONObjectAdd4.add("nextCursor", strM43398);
            jSONObjectAdd3.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(c9418.f28566, i3, str2, strM43398), "mt_apk_continue", "continue", "Continue xref next page"));
        }
        jSONObjectAdd3.add("pagination", jSONObjectAdd4);
        return new C12936(C8231.m21793(jSONObjectAdd3));
    }
}
