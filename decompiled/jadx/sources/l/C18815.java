package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.color.ColorResourcesTableCreator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ᩴܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 776Z */
/* JADX INFO: loaded from: classes5.dex */
public final class C18815 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f59367;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f59368;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19793 f59369;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Find stable references to one resources.arsc resource id. All input fields are required; use scopes=[\"dex\",\"axml\",\"resource_table\"] and limit=50 for a broad check. This tool reports only exact resource id/reference matches, not resource names, string values, or file-path weak matches. Each ref contains only fields applicable to its scope; inspect ref.scope and field presence.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Find APK Resource Xrefs";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_resource_xref";
    }

    public C18815(C19793 c19793) {
        this.f59369 = c19793;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f59367;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session; pass an empty string to inspect the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n  },\n  \"scopes\": {\n    \"type\": \"array\",\n    \"description\": \"Required non-empty scopes. Suggested value is [\\\"dex\\\",\\\"axml\\\",\\\"resource_table\\\"].\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\n        \"dex\",\n        \"axml\",\n        \"resource_table\"\n      ]\n    }\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs on this page. Suggested value is 50; allowed range is 1..200.\"\n  }\n}\n");
        this.f59367 = jSONObjectM12038;
        return jSONObjectM12038;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f59368;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM5535 = C1648.m5535("Result for mt_apk_resource_xref.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id.")).add("editSessionId", C1648.m5542("string", "Edit session id.")).add("targetLocator", C1648.m5542("string", "Target resource locator.")).add("refs", C7416.m19939("type", "array", "description", "Exact resource references.").add("items", JSON.object().add("description", "One exact resource xref hit. The branch is selected by scope and item field presence.").add("anyOf", JSON.array().add(C18736.m43390(JSON.object().add("scope", C1648.m5539("Scope that produced the hit.", "dex", "axml")).add("matchKind", C1648.m5539("Exact resource-id match.", "resource_id")).add("sourceLocator", C1648.m5545("string", "Non-null dex_method or axml locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_read_text.locator.")), "string", "Source snippet; empty string when unavailable.", "snippet", "Dex or decoded AXML resource-id reference.")).add(C18736.m43390(m43463(Name.REFER, "parent_reference").add("sourceType", C1648.m5545("string", "Source resource type.")).add("sourceName", C1648.m5545("string", "Source resource name.")), "string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.", "sourceVariant", "Top-level value or parent reference from the resource table.")).add(C1648.m5532(m43463(Name.REFER).add("sourceType", C1648.m5545("string", "Source resource type.")).add("sourceName", C1648.m5545("string", "Source resource name.")).add("sourceVariant", C1648.m5545("string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.")).add("itemKey", C1648.m5542("string", "Source bag item key, or null for a default item.")).add("itemKeyLocator", C1648.m5542("string", "Resource locator for the source item key when addressable; null for default or non-resource keys.")).add("itemValueKind", C1648.m5539("Value kind of the source bag item, not of the xref target.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "null_value", "unparsed")), "Reference from one resource-table bag item."))))).add("pagination", C1648.m5544(C1648.m5537("Number of refs returned.", "Maximum accepted xref limit.", "Total available count when known, or null."))), "Successful mt_apk_resource_xref data."), C1648.m5540(C1648.m5532(JSON.object(), "No tool-specific diagnostics.")), C1648.m5538("Continuation or retry actions.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry")));
        this.f59368 = jSONObjectM5535;
        return jSONObjectM5535;
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
            return m43468(m43470(jSONObject), (String) null);
        } finally {
            int i = C8869.f27007;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12936 m43471(C2519 c2519, JSONObject jSONObject) throws C3059 {
        int i = c2519.f7999;
        int i2 = c2519.f7995;
        String string = jSONObject.getString("workspaceId", null);
        String string2 = jSONObject.getString("editSessionId", "");
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null) {
            throw C3059.m9364("Missing parameter: limit", "limit", (JSONValue) null, JSON.array(), JSON.object().add("limit", i));
        }
        if (jSONValue.isNull() || !jSONValue.isNumber()) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
        try {
            int iM3253 = C0899.m3253(jSONValue);
            if (iM3253 >= 1) {
                JSONObject jSONObject2 = c2519.f7996;
                if (iM3253 <= i2) {
                    try {
                        return m43468(new C17178(string, string2, m43465(jSONObject2.getString("targetLocator", null), jSONObject.get("nextCursor")), m43466(jSONObject2.getJSONArray("scopes"), jSONObject.get("nextCursor")), iM3253, C21826.m49191(c2519.f7997, jSONObject.get("nextCursor"))), jSONObject.getString("nextCursor", null));
                    } catch (C3059 unused) {
                        throw C3059.m9364("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                    }
                }
            }
            throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw C3059.m9364("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17178 m43470(JSONObject jSONObject) throws C3059 {
        String[] strArr = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
        Iterator it = jSONObject.names().iterator();
        while (true) {
            if (!it.hasNext()) {
                String[] strArr2 = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    if (!jSONObject.contains(str)) {
                        throw C3059.m9364(C20094.m46315("Missing parameter: ", str), str, (JSONValue) null, JSON.array(), JSON.object().add(str, "<required>"));
                    }
                }
                String strM43464 = m43464(jSONObject, "workspaceId", false);
                String strM43465 = m43464(jSONObject, "editSessionId", true);
                JSONValue jSONValue = jSONObject.get("locator");
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C3059.m9364("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strAsString = jSONValue.asString();
                if (!"resource".equals(C13169.m31968(strAsString)) || C13169.m32000(strAsString) == null) {
                    throw C3059.m9364("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strM43466 = m43465(strAsString, jSONObject.get("locator"));
                ArrayList arrayListM43466 = m43466(jSONObject.getJSONArray("scopes"), jSONObject.get("scopes"));
                JSONValue jSONValue2 = jSONObject.get("limit");
                if (jSONValue2 == null || !jSONValue2.isNumber()) {
                    throw C3059.m9364("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
                try {
                    int iM3253 = C0899.m3253(jSONValue2);
                    if (iM3253 < 1 || iM3253 > 200) {
                        throw C3059.m9364("Invalid limit", "limit", JSON.value(iM3253), JSON.array(1, 200), JSON.object().add("limit", 50));
                    }
                    return new C17178(strM43464, strM43465, strM43466, arrayListM43466, iM3253, new C21826(0, 0, 0, 0, 0, 0));
                } catch (ArithmeticException | NumberFormatException unused) {
                    throw C3059.m9364("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
            }
            String str2 = (String) it.next();
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    JSONValue jSONValue3 = jSONObject.get(str2);
                    JSONArray jSONArrayArray = JSON.array();
                    for (int i3 = 0; i3 < 5; i3++) {
                        jSONArrayArray.add(strArr[i3]);
                    }
                    throw C3059.m9364("Invalid resource_xref argument", str2, jSONValue3, jSONArrayArray, JSON.object());
                }
                if (strArr[i2].equals(str2)) {
                    break;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12936 m43468(C17178 c17178, String str) throws Exception {
        String str2 = c17178.f52648;
        C19793 c19793 = this.f59369;
        c19793.m45537(str2);
        InterfaceC19785 interfaceC19785M45535 = c19793.m45535();
        try {
            C12936 c12936 = (C12936) c19793.m45511(str2, c17178.f52646, str, new C3998(this, c17178));
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
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static l.C12936 m43469(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43464(JSONObject jSONObject, String str, boolean z) throws C3059 {
        if (!jSONObject.get(str).isString()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONObject.get(str), JSON.array(), JSON.object().add(str, z ? "" : "<value>"));
        }
        String string = jSONObject.getString(str, null);
        if (z || !string.isEmpty()) {
            return string;
        }
        throw C3059.m9364("Invalid ".concat(str), str, JSON.value(string), JSON.array(), JSON.object().add(str, "<value>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43466(JSONArray jSONArray, JSONValue jSONValue) throws C3059 {
        if (jSONArray == 0 || jSONArray.size() == 0) {
            throw C3059.m9364("Invalid scopes", "scopes", jSONArray, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONValue jSONValue2 = jSONArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43467(jSONArray);
            }
            String strAsString = jSONValue2.asString();
            if (!"dex".equals(strAsString) && !"axml".equals(strAsString) && !"resource_table".equals(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43467(jSONArray);
            }
            if (!hashSet.add(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m43467(jSONArray);
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m43467(JSONValue jSONValue) {
        return C3059.m9364("Invalid scopes", "scopes", jSONValue, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43465(String str, JSONValue jSONValue) throws C3059 {
        try {
            return C9042.m23319(C13169.m32000(str), "locator");
        } catch (C3059 unused) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, JSON.array("0x00000000..0xffffffff"), JSON.object().add("locator", C13169.m31925("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m43463(String... strArr) {
        return JSON.object().add("scope", C1648.m5539("Scope that produced the hit.", "resource_table")).add("matchKind", C1648.m5539("Exact resource-table reference kind.", strArr)).add("sourceLocator", C1648.m5545("string", "Non-null source resource locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_resource_read.reads[].locator, use sourceVariant as reads[].variant, and provide the required budget fields.")).add("snippet", C1648.m5545("string", "Source snippet; empty string when unavailable."));
    }
}
