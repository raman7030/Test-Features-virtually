package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
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
public final class C20250 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f62594;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f62595;

    /* JADX INFO: renamed from: ܽ */
    public final C21180 f62596;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Find stable references to one resources.arsc resource id. All input fields are required; use scopes=[\"dex\",\"axml\",\"resource_table\"] and limit=50 for a broad check. This tool reports only exact resource id/reference matches, not resource names, string values, or file-path weak matches. Each ref contains only fields applicable to its scope; inspect ref.scope and field presence.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Find APK Resource Xrefs";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_apk_resource_xref";
    }

    public C20250(C21180 c21180) {
        this.f62596 = c21180;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        JSONObject jSONObject = this.f62594;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM13958 = C6163.m13958("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session; pass an empty string to inspect the base workspace.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"Resource locator string such as resource:0x7f010000. The resource: prefix is required; hex input is case-insensitive and output is lowercase.\"\n  },\n  \"scopes\": {\n    \"type\": \"array\",\n    \"description\": \"Required non-empty scopes. Suggested value is [\\\"dex\\\",\\\"axml\\\",\\\"resource_table\\\"].\",\n    \"items\": {\n      \"type\": \"string\",\n      \"enum\": [\n        \"dex\",\n        \"axml\",\n        \"resource_table\"\n      ]\n    }\n  },\n  \"limit\": {\n    \"type\": \"integer\",\n    \"description\": \"Maximum refs on this page. Suggested value is 50; allowed range is 1..200.\"\n  }\n}\n");
        this.f62594 = jSONObjectM13958;
        return jSONObjectM13958;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        JSONObject jSONObject = this.f62595;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObjectM7765 = C3935.m7765("Result for mt_apk_resource_xref.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id.")).add("editSessionId", C3935.m7772("string", "Edit session id.")).add("targetLocator", C3935.m7772("string", "Target resource locator.")).add("refs", C9417.m21913("type", "array", "description", "Exact resource references.").add("items", JSON.object().add("description", "One exact resource xref hit. The branch is selected by scope and item field presence.").add("anyOf", JSON.array().add(C20175.m45657(JSON.object().add("scope", C3935.m7769("Scope that produced the hit.", "dex", "axml")).add("matchKind", C3935.m7769("Exact resource-id match.", "resource_id")).add("sourceLocator", C3935.m7775("string", "Non-null dex_method or axml locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_read_text.locator.")), "string", "Source snippet; empty string when unavailable.", "snippet", "Dex or decoded AXML resource-id reference.")).add(C20175.m45657(m45732(Name.REFER, "parent_reference").add("sourceType", C3935.m7775("string", "Source resource type.")).add("sourceName", C3935.m7775("string", "Source resource name.")), "string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.", "sourceVariant", "Top-level value or parent reference from the resource table.")).add(C3935.m7762(m45732(Name.REFER).add("sourceType", C3935.m7775("string", "Source resource type.")).add("sourceName", C3935.m7775("string", "Source resource name.")).add("sourceVariant", C3935.m7775("string", "Source resource variant. Use this as mt_apk_resource_read.reads[].variant.")).add("itemKey", C3935.m7772("string", "Source bag item key, or null for a default item.")).add("itemKeyLocator", C3935.m7772("string", "Resource locator for the source item key when addressable; null for default or non-resource keys.")).add("itemValueKind", C3935.m7769("Value kind of the source bag item, not of the xref target.", TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "null_value", "unparsed")), "Reference from one resource-table bag item."))))).add("pagination", C3935.m7774(C3935.m7767("Number of refs returned.", "Maximum accepted xref limit.", "Total available count when known, or null."))), "Successful mt_apk_resource_xref data."), C3935.m7770(C3935.m7762(JSON.object(), "No tool-specific diagnostics.")), C3935.m7768("Continuation or retry actions.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry")));
        this.f62595 = jSONObjectM7765;
        return jSONObjectM7765;
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
            return m45737(m45739(jSONObject), (String) null);
        } finally {
            int i = C10798.f29931;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14663 m45740(C4763 c4763, JSONObject jSONObject) throws C5276 {
        int i = c4763.f10791;
        int i2 = c4763.f10787;
        String string = jSONObject.getString("workspaceId", null);
        String string2 = jSONObject.getString("editSessionId", "");
        JSONValue jSONValue = jSONObject.get("limit");
        if (jSONValue == null) {
            throw C5276.m11406("Missing parameter: limit", "limit", (JSONValue) null, JSON.array(), JSON.object().add("limit", i));
        }
        if (jSONValue.isNull() || !jSONValue.isNumber()) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
        try {
            int iM5572 = C3223.m5572(jSONValue);
            if (iM5572 >= 1) {
                JSONObject jSONObject2 = c4763.f10788;
                if (iM5572 <= i2) {
                    try {
                        return m45737(new C18694(string, string2, m45734(jSONObject2.getString("targetLocator", null), jSONObject.get("nextCursor")), m45735(jSONObject2.getJSONArray("scopes"), jSONObject.get("nextCursor")), iM5572, C23112.m51541(c4763.f10789, jSONObject.get("nextCursor"))), jSONObject.getString("nextCursor", null));
                    } catch (C5276 unused) {
                        throw C5276.m11406("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                    }
                }
            }
            throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw C5276.m11406("Invalid limit", "limit", jSONValue, JSON.array(1, i2), JSON.object().add("limit", i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C18694 m45739(JSONObject jSONObject) throws C5276 {
        String[] strArr = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
        Iterator it = jSONObject.names().iterator();
        while (true) {
            if (!it.hasNext()) {
                String[] strArr2 = {"workspaceId", "editSessionId", "locator", "scopes", "limit"};
                for (int i = 0; i < 5; i++) {
                    String str = strArr2[i];
                    if (!jSONObject.contains(str)) {
                        throw C5276.m11406(C21466.m48631("Missing parameter: ", str), str, (JSONValue) null, JSON.array(), JSON.object().add(str, "<required>"));
                    }
                }
                String strM45733 = m45733(jSONObject, "workspaceId", false);
                String strM45734 = m45733(jSONObject, "editSessionId", true);
                JSONValue jSONValue = jSONObject.get("locator");
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C5276.m11406("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strAsString = jSONValue.asString();
                if (!"resource".equals(C14884.m34064(strAsString)) || C14884.m34096(strAsString) == null) {
                    throw C5276.m11406("Invalid locator", "locator", jSONObject.get("locator"), JSON.array("resource"), JSON.object().add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
                }
                String strM45735 = m45734(strAsString, jSONObject.get("locator"));
                ArrayList arrayListM45735 = m45735(jSONObject.getJSONArray("scopes"), jSONObject.get("scopes"));
                JSONValue jSONValue2 = jSONObject.get("limit");
                if (jSONValue2 == null || !jSONValue2.isNumber()) {
                    throw C5276.m11406("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
                }
                try {
                    int iM5572 = C3223.m5572(jSONValue2);
                    if (iM5572 < 1 || iM5572 > 200) {
                        throw C5276.m11406("Invalid limit", "limit", JSON.value(iM5572), JSON.array(1, 200), JSON.object().add("limit", 50));
                    }
                    return new C18694(strM45733, strM45734, strM45735, arrayListM45735, iM5572, new C23112(0, 0, 0, 0, 0, 0));
                } catch (ArithmeticException | NumberFormatException unused) {
                    throw C5276.m11406("Invalid limit", "limit", jSONValue2, JSON.array(1, 200), JSON.object().add("limit", 50));
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
                    throw C5276.m11406("Invalid resource_xref argument", str2, jSONValue3, jSONArrayArray, JSON.object());
                }
                if (strArr[i2].equals(str2)) {
                    break;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C14663 m45737(C18694 c18694, String str) throws Exception {
        String str2 = c18694.f55829;
        C21180 c21180 = this.f62596;
        c21180.m47848(str2);
        InterfaceC21173 interfaceC21173M47846 = c21180.m47846();
        try {
            C14663 c14663 = (C14663) c21180.m47822(str2, c18694.f55827, str, new C6168(this, c18694));
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
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    /* JADX INFO: renamed from: ֫ */
    public static p067l.C14663 m45738(
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

    /* JADX INFO: renamed from: ֫ */
    public static String m45733(JSONObject jSONObject, String str, boolean z) throws C5276 {
        if (!jSONObject.get(str).isString()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONObject.get(str), JSON.array(), JSON.object().add(str, z ? "" : "<value>"));
        }
        String string = jSONObject.getString(str, null);
        if (z || !string.isEmpty()) {
            return string;
        }
        throw C5276.m11406("Invalid ".concat(str), str, JSON.value(string), JSON.array(), JSON.object().add(str, "<value>"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m45735(JSONArray jSONArray, JSONValue jSONValue) throws C5276 {
        if (jSONArray == 0 || jSONArray.size() == 0) {
            throw C5276.m11406("Invalid scopes", "scopes", jSONArray, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONValue jSONValue2 = jSONArray.get(i);
            if (jSONValue2 == null || !jSONValue2.isString()) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m45736(jSONArray);
            }
            String strAsString = jSONValue2.asString();
            if (!"dex".equals(strAsString) && !"axml".equals(strAsString) && !"resource_table".equals(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m45736(jSONArray);
            }
            if (!hashSet.add(strAsString)) {
                if (jSONValue != null) {
                    jSONArray = jSONValue;
                }
                throw m45736(jSONArray);
            }
            arrayList.add(strAsString);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m45736(JSONValue jSONValue) {
        return C5276.m11406("Invalid scopes", "scopes", jSONValue, JSON.array("dex", "axml", "resource_table"), JSON.object().add("scopes", JSON.array("dex", "axml", "resource_table")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m45734(String str, JSONValue jSONValue) throws C5276 {
        try {
            return C10962.m25264(C14884.m34096(str), "locator");
        } catch (C5276 unused) {
            throw C5276.m11406("Invalid locator", "locator", jSONValue, JSON.array("0x00000000..0xffffffff"), JSON.object().add("locator", C14884.m34021("resource", (String) null, (String) null, (String) null, (String) null, "0x7f010000")));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m45732(String... strArr) {
        return JSON.object().add("scope", C3935.m7769("Scope that produced the hit.", "resource_table")).add("matchKind", C3935.m7769("Exact resource-table reference kind.", strArr)).add("sourceLocator", C3935.m7775("string", "Non-null source resource locator. Reuse data.workspaceId and data.editSessionId and pass this value to mt_apk_resource_read.reads[].locator, use sourceVariant as reads[].variant, and provide the required budget fields.")).add("snippet", C3935.m7775("string", "Source snippet; empty string when unavailable."));
    }
}
