package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7AT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18908 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f56436;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f56437;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f56438;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_list or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_list with view=dex_classes and prefix to discover classes first. Returned field and method locators can be passed with the same workspaceId and editSessionId to mt_apk_read_text. Continue pages via nextActions.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Outline APK Dex Class";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_dex_read_class_outline";
    }

    public C18908(C21180 c21180) {
        this.f56438 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f56436;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_list or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f56436 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f56437;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this outline result.")).add("editSessionId", C3935.m7772("string", "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls.")).add("locator", C3935.m7772("string", "dex_class locator for this outline result.")).add("javaName", C3935.m7772("string", "Java-style class name.")).add("classHeader", C3935.m7772("string", "Raw .class header line, or null.")).add("super", C3935.m7772("string", "Superclass descriptor, or null.")).add("implements", C3935.m7771("Implemented interfaces.")).add("source", C3935.m7772("string", "Smali .source debug file name, or null; not a ZIP entry locator.")).add("fields", C9417.m21913("type", "array", "description", "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member.").add("items", C20175.m45657(JSON.object().add("locator", C3935.m7775("string", "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C3935.m7775("string", "Field name.")).add("sig", C3935.m7775("string", "Field signature.")).add(C0655am.f2262Q, C3935.m7775("string", "Smali access flags text.")).add("constantValue", C3935.m7772("string", "Static final dex initial value preview, or null.")), ClassTransform.BOOLEAN, "Whether constantValue was truncated.", "constantValueTruncated", "One field outline item."))).add("methods", C9417.m21913("type", "array", "description", "Current class-outline method page with method features; pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_read_text to read the member.").add("items", C3935.m7762(JSON.object().add("locator", C3935.m7775("string", "dex_method locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C3935.m7775("string", "Method name.")).add("sig", C3935.m7775("string", "Method signature.")).add(C0655am.f2262Q, C3935.m7775("string", "Smali access flags text.")).add("instructionCount", C3935.m7775("integer", "Instruction count.")).add("stringRefCount", C3935.m7775("integer", "String reference count.")).add("resourceRefCount", C3935.m7775("integer", "Resource reference count.")).add("invokeCount", C3935.m7775("integer", "Invoke count.")).add("interestingStrings", C3935.m7771("Interesting string previews.")).add("interestingInvokes", C3935.m7771("Interesting invoke previews.")), "One method outline item."))).add("pagination", C3935.m7774(C3935.m7767("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_read_class_outline data."), C3935.m7770(C14214.m32686()), C3935.m7768("Executable continue or recovery actions; copy arguments directly.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue"), C3935.m7763(C12981.m29770(), "mt_apk_list", "verify_workspace"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
        this.f56437 = jSONObjectM7765;
        return jSONObjectM7765;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) {
        try {
            C13803 c13803M34043 = C14884.m34043(jSONObject);
            C17502 c17502 = new C17502();
            C21180 c21180 = this.f56438;
            String str = c13803M34043.f39006;
            C14663 c14663 = (C14663) c21180.m47822(str, c13803M34043.f39001, (String) null, new C19331(this, c13803M34043, c17502));
            c21180.m47844(str);
            return c14663;
        } finally {
            int i = C10798.f29931;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m43015(C4763 c4763, JSONObject jSONObject, C17502 c17502) throws C5276 {
        C13803 c13803M34060 = C14884.m34060(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c4763, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c13803M34060.f39006;
        String str2 = c13803M34060.f39001;
        C19331 c19331 = new C19331(this, c13803M34060, c17502);
        C21180 c21180 = this.f56438;
        C14663 c14663 = (C14663) c21180.m47822(str, str2, string, c19331);
        c21180.m47844(str);
        return c14663;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14663 m43014(C18908 c18908, C13803 c13803, C17502 c17502, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        C21377 c21377M47841 = c18908.f56438.m47841(c13803, c17502);
        int i2 = C10798.f29931;
        String str2 = c13803.f39001;
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c21377M47841.f67372;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str3).add("editSessionId", str2).add("locator", C14884.m34021("dex_class", (String) null, c21377M47841.f67369, (String) null, (String) null, (String) null)).add("javaName", c21377M47841.f67385);
        C5749 c5749 = c21377M47841.f67378;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("classHeader", c5749.f14097).add("super", c5749.f14100).add("implements", C3223.m5566(c5749.f14098)).add("source", c5749.f14101);
        String str4 = c21377M47841.f67369;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("fields", m43013(str4, c21377M47841.f67377)).add("methods", m43013(str4, c21377M47841.f67384)).add("nextActions", JSON.array());
        JSONObject jSONObjectObject2 = JSON.object();
        boolean z = c21377M47841.f67383;
        int i3 = c21377M47841.f67373;
        JSONObject jSONObjectAdd4 = jSONObjectObject2.add("hasMore", z).add("returnedCount", c21377M47841.f67379).add("limitMax", 1000).add("totalAvailableCount", c21377M47841.f67382);
        if (z) {
            str = "classHeader";
            jSONObject2 = jSONObjectAdd3;
            jSONObject = jSONObjectAdd4;
            String strM45665 = C20186.m45665("outline_class", c21377M47841.f67372, str2, i, JSON.object().add("locator", C14884.m34021("dex_class", (String) null, c21377M47841.f67369, (String) null, (String) null, (String) null)).add("recommendedLimit", i3).add("limitMax", 1000), JSON.object().add("memberOffset", c21377M47841.f67375));
            jSONObject.add("nextCursor", strM45665);
            jSONObject2.getJSONArray("nextActions").add(C11982.m27418(C14884.m34011(str3, i3, str2, strM45665), "mt_apk_continue", "continue", "Continue class outline next page"));
        } else {
            jSONObject = jSONObjectAdd4;
            jSONObject2 = jSONObjectAdd3;
            str = "classHeader";
        }
        jSONObject2.add("pagination", jSONObject);
        String str5 = str;
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", jSONObject2.getString("workspaceId", null)).add("editSessionId", jSONObject2.getString("editSessionId", "")).add("locator", C3223.m5573(jSONObject2.get("locator"))).add("javaName", jSONObject2.getString("javaName", null)).add(str5, jSONObject2.getString(str5, null)).add("super", jSONObject2.getString("super", null)).add("implements", C3223.m5565(jSONObject2.getJSONArray(r8))).add("source", jSONObject2.getString("source", null));
        JSONArray jSONArray = jSONObject2.getJSONArray("fields");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("locator", C3223.m5573(jSONObjectAsObject.get("locator"))).add("name", jSONObjectAsObject.getString("name", null)).add("sig", jSONObjectAsObject.getString("sig", null)).add(C0655am.f2262Q, jSONObjectAsObject.getString(C0655am.f2262Q, null)).add("constantValue", jSONObjectAsObject.getString("constantValue", null)).add("constantValueTruncated", jSONObjectAsObject.getBoolean("constantValueTruncated", false)));
            }
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("fields", jSONArrayArray);
        JSONArray jSONArray2 = jSONObject2.getJSONArray("methods");
        JSONArray jSONArrayArray2 = JSON.array();
        if (jSONArray2 != null) {
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it2.next()).asObject();
                jSONArrayArray2.add(JSON.object().add("locator", C3223.m5573(jSONObjectAsObject2.get("locator"))).add("name", jSONObjectAsObject2.getString("name", null)).add("sig", jSONObjectAsObject2.getString("sig", null)).add(C0655am.f2262Q, jSONObjectAsObject2.getString(C0655am.f2262Q, null)).add("instructionCount", C3223.m5574(jSONObjectAsObject2.get("instructionCount"))).add("stringRefCount", C3223.m5574(jSONObjectAsObject2.get("stringRefCount"))).add("resourceRefCount", C3223.m5574(jSONObjectAsObject2.get("resourceRefCount"))).add("invokeCount", C3223.m5574(jSONObjectAsObject2.get("invokeCount"))).add("interestingStrings", C3223.m5565(jSONObjectAsObject2.getJSONArray("interestingStrings"))).add("interestingInvokes", C3223.m5565(jSONObjectAsObject2.getJSONArray("interestingInvokes"))));
            }
        }
        return new C14663(C21370.m48410(jSONObjectAdd6.add("methods", jSONArrayArray2).add("pagination", C3223.m5567(jSONObject2.getJSONObject("pagination"))), jSONObject2.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m43013(String str, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21843 c21843 = (C21843) it.next();
            String str2 = "field".equals(c21843.f68740) ? "dex_field" : "dex_method";
            JSONObject jSONObjectAdd = JSON.object().add("name", c21843.f68737).add("sig", c21843.f68741).add(C0655am.f2262Q, c21843.f68734);
            if ("dex_field".equals(str2)) {
                jSONObjectAdd.add("locator", C14884.m34021(str2, (String) null, str, (String) null, c21843.f68741, (String) null));
                C23184 c23184 = c21843.f68736;
                if (c23184 != null) {
                    jSONObjectAdd.add("constantValue", c23184.f72827).add("constantValueTruncated", c21843.f68736.f72826);
                }
            } else {
                C7090 c7090 = c21843.f68739;
                jSONObjectAdd.add("instructionCount", c7090.f18487).add("stringRefCount", c7090.f18489).add("resourceRefCount", c7090.f18491).add("invokeCount", c7090.f18492).add("interestingStrings", C3223.m5566(c7090.f18490)).add("interestingInvokes", C3223.m5566(c7090.f18488));
                jSONObjectAdd.add("locator", C14884.m34021(str2, (String) null, str, c21843.f68741, (String) null, (String) null));
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C21370.m48411(c5276);
    }
}
