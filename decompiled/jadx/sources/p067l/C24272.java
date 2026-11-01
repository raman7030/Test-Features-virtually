package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D77Z */
/* JADX INFO: loaded from: classes.dex */
public final class C24272 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f76900;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f76901;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f76902;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Use when you have a dex_method locator, dex_field locator, or dex_class locator and need incoming instruction references. All input fields are required; for dex_method use methodResolution=dispatch and limit=50 unless the user asks otherwise; for dex_field or dex_class use methodResolution=not_applicable. exact matches bytecode MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target implementation or method contract. Field and class xrefs are exact instruction references only. Results are read-only; to inspect the containing method, pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Find APK Dex Xrefs";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_dex_xref";
    }

    public C24272(C21180 c21180) {
        this.f76902 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f76900;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to xref the edited session; pass an empty string to xref the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Target locator string. Accepted prefixes: dex_method:, dex_field:, dex_class:. For dex_method use a full smali method reference such as dex_method:Lcom/example/Foo;->bar()V; for dex_field use a smali field reference such as dex_field:Lcom/example/Foo;->flag:Z; for dex_class use a class descriptor such as dex_class:Lcom/example/Foo;.\"\n  },\n  \"methodResolution\": {\n    \"type\": \"string\",\n    \"enum\": [\n      \"exact\",\n      \"slot\",\n      \"dispatch\",\n      \"not_applicable\"\n    ],\n    \"description\": \"Required. For dex_method use dispatch unless the user asks for exact bytecode references or slot override family; exact matches MethodReference equality, slot finds the visible override family, and dispatch finds calls that may reach the target. For dex_field and dex_class use not_applicable.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Required page size. Use 50 unless the user asks otherwise; maximum 200 is enforced at runtime. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f76900 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f76901;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM23763 = C10191.m23763();
        this.f76901 = jSONObjectM23763;
        return jSONObjectM23763;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C10191.m23760(c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            return m53610(C14884.m34066(jSONObject), false, (String) null);
        } finally {
            int i = C10798.f29931;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m53612(C4763 c4763, JSONObject jSONObject) {
        return m53610(C14884.m34079(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c4763, jSONObject), true, jSONObject.getString("nextCursor", null));
    }

    /* JADX INFO: renamed from: ֫ */
    private C14663 m53610(C11319 c11319, boolean z, String str) throws Exception {
        String str2 = c11319.f31513;
        C21180 c21180 = this.f76902;
        c21180.m47848(str2);
        try {
            InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
            try {
                C14663 c14663 = (C14663) c21180.m47822(str2, c11319.f31514, str, new C13544(this, c11319));
                interfaceC21173M47846.close();
                return c14663;
            } catch (Throwable th) {
                try {
                    interfaceC21173M47846.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (OutOfMemoryError e) {
            try {
                C21306.m48193("MT MCP xref out of memory: workspaceId=" + str2 + ", methodResolution=" + c11319.f31517 + ", continuation=" + z + ", error=" + e.getMessage());
            } catch (OutOfMemoryError unused) {
            }
            throw C19553.m44411();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14663 m53611(C24272 c24272, C11319 c11319, int i) {
        String str;
        String str2 = c11319.f31514;
        C5007 c5007M47826 = c24272.f76902.m47826(c11319, new C17502());
        int i2 = C10798.f29931;
        String str3 = c5007M47826.f11445;
        ArrayList arrayList = c5007M47826.f11444;
        C4021 c4021 = c5007M47826.f11442;
        String strM34072 = C14884.m34072(str3, c5007M47826.f11446, c5007M47826.f11443);
        if ("dex_field".equals(str3)) {
            str = "field_access";
        } else {
            str = "dex_class".equals(str3) ? "type_reference" : "method_call";
        }
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", c5007M47826.f11447);
        int i3 = c11319.f31516;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("editSessionId", str2).add("targetLocator", strM34072).add("referenceKind", str).add("methodResolution", c5007M47826.f11441);
        JSONArray jSONArrayArray = JSON.array();
        for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
            C17746 c17746 = (C17746) it.next();
            jSONArrayArray.add(JSON.object().add("sourceLocator", C14884.m34021("dex_method", (String) null, c17746.f52999, c17746.f53003, (String) null, (String) null)).add("referenceOperand", c17746.f53001).add("matchKind", c17746.f53000).add("dispatchCertainty", c17746.f52997).add("opcode", c17746.f53002).add("instructionIndex", c17746.f52998));
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add(AbstractC0213e.f989m, jSONArrayArray).add("nextActions", JSON.array());
        JSONObject jSONObjectAdd4 = JSON.object().add("hasMore", c4021 != null).add("returnedCount", arrayList.size()).add("limitMax", 200).add("totalAvailableCount", (String) null);
        if (c4021 != null) {
            String strM45665 = C20186.m45665("xref", c5007M47826.f11447, c11319.f31514, i, JSON.object().add("targetLocator", C14884.m34072(c11319.f31519, c11319.f31512, c11319.f31518)).add("methodResolution", c11319.f31517).add("recommendedLimit", i3).add("limitMax", 200), JSON.object().add("classIndex", c4021.f8789).add("memberIndex", c4021.f8791).add("instructionIndex", c4021.f8790));
            jSONObjectAdd4.add("nextCursor", strM45665);
            jSONObjectAdd3.getJSONArray("nextActions").add(C11982.m27418(C14884.m34011(c11319.f31513, i3, str2, strM45665), "mt_apk_continue", "continue", "Continue xref next page"));
        }
        jSONObjectAdd3.add("pagination", jSONObjectAdd4);
        return new C14663(C10191.m23762(jSONObjectAdd3));
    }
}
