package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ܿܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7AT */
/* JADX INFO: loaded from: classes5.dex */
public final class C17403 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f53249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f53250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f53251;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Read one dex class outline from an opened APK workspace. Copy one exact dex_class locator, such as dex_class:Lcom/example/Foo;, from mt_apk_list or mt_apk_search into locator. Java names such as com.example.Foo are invalid. This is not a prefix search; use mt_apk_list with view=dex_classes and prefix to discover classes first. Returned field and method locators can be passed with the same workspaceId and editSessionId to mt_apk_read_text. Continue pages via nextActions.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Outline APK Dex Class";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_dex_read_class_outline";
    }

    public C17403(C19793 c19793) {
        this.f53251 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f53249;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to outline the edited session; pass an empty string to read the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Exact dex_class locator to outline, such as dex_class:Lcom/example/Foo;. Copy the full locator from mt_apk_list or mt_apk_search. Java names, package prefixes, search queries, dex_method:, and dex_field: are invalid.\"\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum fields plus methods to return on this page. Pass 200 by default unless you need a smaller page; maximum 1000. Use mt_apk_continue for later pages.\"\n  }\n}\n");
        this.f53249 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f53250;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_dex_read_class_outline. data returns class metadata plus paged fields[] and methods[] locators for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and the member locator with follow-up reads; nextActions carries continuation or recovery calls.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this outline result.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this outline result; pass this value together with data.workspaceId for member read calls.")).add("locator", C1648.m5542("string", "dex_class locator for this outline result.")).add("javaName", C1648.m5542("string", "Java-style class name.")).add("classHeader", C1648.m5542("string", "Raw .class header line, or null.")).add("super", C1648.m5542("string", "Superclass descriptor, or null.")).add("implements", C1648.m5541("Implemented interfaces.")).add("source", C1648.m5542("string", "Smali .source debug file name, or null; not a ZIP entry locator.")).add("fields", C7416.m19939("type", "array", "description", "Current class-outline field page; pass data.workspaceId, data.editSessionId, and fields[i].locator to mt_apk_read_text to read the member.").add("items", C18736.m43390(JSON.object().add("locator", C1648.m5545("string", "dex_field locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C1648.m5545("string", "Field name.")).add("sig", C1648.m5545("string", "Field signature.")).add(am.Q, C1648.m5545("string", "Smali access flags text.")).add("constantValue", C1648.m5542("string", "Static final dex initial value preview, or null.")), ClassTransform.BOOLEAN, "Whether constantValue was truncated.", "constantValueTruncated", "One field outline item."))).add("methods", C7416.m19939("type", "array", "description", "Current class-outline method page with method features; pass data.workspaceId, data.editSessionId, and methods[i].locator to mt_apk_read_text to read the member.").add("items", C1648.m5532(JSON.object().add("locator", C1648.m5545("string", "dex_method locator for mt_apk_read_text; pass data.workspaceId, data.editSessionId, and this locator.")).add("name", C1648.m5545("string", "Method name.")).add("sig", C1648.m5545("string", "Method signature.")).add(am.Q, C1648.m5545("string", "Smali access flags text.")).add("instructionCount", C1648.m5545("integer", "Instruction count.")).add("stringRefCount", C1648.m5545("integer", "String reference count.")).add("resourceRefCount", C1648.m5545("integer", "Resource reference count.")).add("invokeCount", C1648.m5545("integer", "Invoke count.")).add("interestingStrings", C1648.m5541("Interesting string previews.")).add("interestingInvokes", C1648.m5541("Interesting invoke previews.")), "One method outline item."))).add("pagination", C1648.m5544(C1648.m5537("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_read_class_outline data."), C1648.m5540(C12464.m30621()), C1648.m5538("Executable continue or recovery actions; copy arguments directly.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
        this.f53250 = jSONObjectM5535;
        return jSONObjectM5535;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        try {
            C12031 c12031M31947 = C13169.m31947(jSONObject);
            C15923 c15923 = new C15923();
            C19793 c19793 = this.f53251;
            String str = c12031M31947.f35995;
            C12936 c12936 = (C12936) c19793.m45511(str, c12031M31947.f35990, (String) null, new C17848(this, c12031M31947, c15923));
            c19793.m45533(str);
            return c12936;
        } finally {
            int i = C8869.f27007;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m40758(C2519 c2519, JSONObject jSONObject, C15923 c15923) throws C3059 {
        C12031 c12031M31964 = C13169.m31964(jSONObject.getString("workspaceId", null), jSONObject.getString("editSessionId", ""), c2519, jSONObject);
        String string = jSONObject.getString("nextCursor", null);
        String str = c12031M31964.f35995;
        String str2 = c12031M31964.f35990;
        C17848 c17848 = new C17848(this, c12031M31964, c15923);
        C19793 c19793 = this.f53251;
        C12936 c12936 = (C12936) c19793.m45511(str, str2, string, c17848);
        c19793.m45533(str);
        return c12936;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12936 m40757(C17403 c17403, C12031 c12031, C15923 c15923, int i) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        C20001 c20001M45530 = c17403.f53251.m45530(c12031, c15923);
        int i2 = C8869.f27007;
        String str2 = c12031.f35990;
        JSONObject jSONObjectObject = JSON.object();
        String str3 = c20001M45530.f64730;
        JSONObject jSONObjectAdd = jSONObjectObject.add("workspaceId", str3).add("editSessionId", str2).add("locator", C13169.m31925("dex_class", (String) null, c20001M45530.f64727, (String) null, (String) null, (String) null)).add("javaName", c20001M45530.f64743);
        C3556 c3556 = c20001M45530.f64736;
        JSONObject jSONObjectAdd2 = jSONObjectAdd.add("classHeader", c3556.f11291).add("super", c3556.f11294).add("implements", C0899.m3247(c3556.f11292)).add("source", c3556.f11295);
        String str4 = c20001M45530.f64727;
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("fields", m40756(str4, c20001M45530.f64735)).add("methods", m40756(str4, c20001M45530.f64742)).add("nextActions", JSON.array());
        JSONObject jSONObjectObject2 = JSON.object();
        boolean z = c20001M45530.f64741;
        int i3 = c20001M45530.f64731;
        JSONObject jSONObjectAdd4 = jSONObjectObject2.add("hasMore", z).add("returnedCount", c20001M45530.f64737).add("limitMax", 1000).add("totalAvailableCount", c20001M45530.f64740);
        if (z) {
            str = "classHeader";
            jSONObject2 = jSONObjectAdd3;
            jSONObject = jSONObjectAdd4;
            String strM43398 = C18747.m43398("outline_class", c20001M45530.f64730, str2, i, JSON.object().add("locator", C13169.m31925("dex_class", (String) null, c20001M45530.f64727, (String) null, (String) null, (String) null)).add("recommendedLimit", i3).add("limitMax", 1000), JSON.object().add("memberOffset", c20001M45530.f64733));
            jSONObject.add("nextCursor", strM43398);
            jSONObject2.getJSONArray("nextActions").add(C10115.m25398(C13169.m31915(str3, i3, str2, strM43398), "mt_apk_continue", "continue", "Continue class outline next page"));
        } else {
            jSONObject = jSONObjectAdd4;
            jSONObject2 = jSONObjectAdd3;
            str = "classHeader";
        }
        jSONObject2.add("pagination", jSONObject);
        String str5 = str;
        JSONObject jSONObjectAdd5 = JSON.object().add("workspaceId", jSONObject2.getString("workspaceId", null)).add("editSessionId", jSONObject2.getString("editSessionId", "")).add("locator", C0899.m3254(jSONObject2.get("locator"))).add("javaName", jSONObject2.getString("javaName", null)).add(str5, jSONObject2.getString(str5, null)).add("super", jSONObject2.getString("super", null)).add("implements", C0899.m3246(jSONObject2.getJSONArray(r8))).add("source", jSONObject2.getString("source", null));
        JSONArray jSONArray = jSONObject2.getJSONArray("fields");
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("locator", C0899.m3254(jSONObjectAsObject.get("locator"))).add("name", jSONObjectAsObject.getString("name", null)).add("sig", jSONObjectAsObject.getString("sig", null)).add(am.Q, jSONObjectAsObject.getString(am.Q, null)).add("constantValue", jSONObjectAsObject.getString("constantValue", null)).add("constantValueTruncated", jSONObjectAsObject.getBoolean("constantValueTruncated", false)));
            }
        }
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("fields", jSONArrayArray);
        JSONArray jSONArray2 = jSONObject2.getJSONArray("methods");
        JSONArray jSONArrayArray2 = JSON.array();
        if (jSONArray2 != null) {
            Iterator it2 = jSONArray2.iterator();
            while (it2.hasNext()) {
                JSONObject jSONObjectAsObject2 = ((JSONValue) it2.next()).asObject();
                jSONArrayArray2.add(JSON.object().add("locator", C0899.m3254(jSONObjectAsObject2.get("locator"))).add("name", jSONObjectAsObject2.getString("name", null)).add("sig", jSONObjectAsObject2.getString("sig", null)).add(am.Q, jSONObjectAsObject2.getString(am.Q, null)).add("instructionCount", C0899.m3255(jSONObjectAsObject2.get("instructionCount"))).add("stringRefCount", C0899.m3255(jSONObjectAsObject2.get("stringRefCount"))).add("resourceRefCount", C0899.m3255(jSONObjectAsObject2.get("resourceRefCount"))).add("invokeCount", C0899.m3255(jSONObjectAsObject2.get("invokeCount"))).add("interestingStrings", C0899.m3246(jSONObjectAsObject2.getJSONArray("interestingStrings"))).add("interestingInvokes", C0899.m3246(jSONObjectAsObject2.getJSONArray("interestingInvokes"))));
            }
        }
        return new C12936(C19993.m46095(jSONObjectAdd6.add("methods", jSONArrayArray2).add("pagination", C0899.m3248(jSONObject2.getJSONObject("pagination"))), jSONObject2.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m40756(String str, ArrayList arrayList) {
        JSONArray jSONArrayArray = JSON.array();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20490 c20490 = (C20490) it.next();
            String str2 = "field".equals(c20490.f66061) ? "dex_field" : "dex_method";
            JSONObject jSONObjectAdd = JSON.object().add("name", c20490.f66058).add("sig", c20490.f66062).add(am.Q, c20490.f66055);
            if ("dex_field".equals(str2)) {
                jSONObjectAdd.add("locator", C13169.m31925(str2, (String) null, str, (String) null, c20490.f66062, (String) null));
                C21901 c21901 = c20490.f66057;
                if (c21901 != null) {
                    jSONObjectAdd.add("constantValue", c21901.f70113).add("constantValueTruncated", c20490.f66057.f70112);
                }
            } else {
                C4967 c4967 = c20490.f66060;
                jSONObjectAdd.add("instructionCount", c4967.f15653).add("stringRefCount", c4967.f15655).add("resourceRefCount", c4967.f15657).add("invokeCount", c4967.f15658).add("interestingStrings", C0899.m3247(c4967.f15656)).add("interestingInvokes", C0899.m3247(c4967.f15654));
                jSONObjectAdd.add("locator", C13169.m31925(str2, (String) null, str, c20490.f66062, (String) null, (String) null));
            }
            jSONArrayArray.add(jSONObjectAdd);
        }
        return jSONArrayArray;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46096(c3059);
    }
}
