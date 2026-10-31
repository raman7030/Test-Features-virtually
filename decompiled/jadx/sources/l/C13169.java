package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: l.۬ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: J79S */
/* JADX INFO: loaded from: classes3.dex */
public final class C13169 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final String f39376;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39378 = 0;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final String[] f39391;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final String[] f39380 = {"workspaceId", "editSessionId", "target", "query", "queryType", "caseSensitive", "matchMode", "prefix", "includeMatchOffsets", "limit", "snippetMaxChars"};

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final String[] f39392 = {"overview", "files", "resource_table_names", "resource_table_values", "resource_table_file_paths", "dex_names", "dex_strings", "dex_string_members", "smali", "native_symbols", "native_strings"};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final String[] f39387 = {"workspaceId", "editSessionId", "reads", "maxValueChars", "maxValueXmlChars", "maxItemsPerValue", "resolveDepth"};

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f39379 = {"locator", "variant"};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final String[] f39381 = {"workspaceId", "editSessionId", "locator", "methodResolution", "limit"};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String[] f39377 = {"exact", "slot", "dispatch", "not_applicable"};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final String[] f39394 = {"workspaceId", "editSessionId", "locator", "targetVersion", "edits"};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String[] f39388 = {"workspaceId", "editSessionId", "locator"};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final String[] f39384 = {"workspaceId", "editSessionId", "locator", "patches"};

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final String[] f39383 = {"byteOffset", "expectedHex", "replacementHex"};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f39389 = {"workspaceId", "editSessionId", "edits"};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39390 = {"workspaceId", "editSessionId", "runBuildChecks"};

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String[] f39382 = {"mode", "matchText", "writeText"};

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f39386 = {"locator", "variant", "targetVersion", "valueXml"};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f39385 = {"workspaceId", "editSessionId", "outputName", "overwrite", "sign"};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String[] f39393 = {"workspaceId", "editSessionId", "outputName", "overwrite"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31909(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31919(int i) {
        return C18307.m42645(i, "edits[", "]");
    }

    static {
        String[] strArr = {"zip_entries", "axml", "resource_table_id", "resource_table_name", "resource_table_value", "resource_table_file_path", "dex_class", "dex_field", "dex_method", "dex_string", "smali", "native_symbol", "native_string"};
        f39391 = strArr;
        StringBuilder sb = new StringBuilder("Valid scopes are: ");
        StringBuilder sb2 = new StringBuilder();
        if (strArr.length > 0) {
            sb2.append((CharSequence) strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb2.append((CharSequence) ", ");
                sb2.append((CharSequence) strArr[i]);
            }
        }
        sb.append(sb2.toString());
        sb.append(". Pass scopes as a JSON array even for one scope, for example [\"dex_class\"] or [\"dex_string\", \"smali\", \"resource_table_value\", \"axml\"]. Single strings and comma-separated strings such as \"dex_string,smali\" are invalid.");
        f39376 = sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31915(String str, int i, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("nextCursor", str3).add("limit", i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31973(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(m31925(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C23319 m31945(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "open", MotionUtils.EASING_TYPE_PATH, "temporary");
        String strM31967 = m31967(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("temporary");
        if (jSONValue != null && jSONValue.isNull()) {
            throw C3059.m9364("Invalid temporary", "temporary", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        boolean zM31942 = m31942(jSONObject, "temporary");
        if ("mt://current-apk".equals(strM31967)) {
            return new C23319(null, null, !zM31942, zM31942);
        }
        if (strM31967.startsWith("mt://workspace/")) {
            String strSubstring = strM31967.substring(15);
            if (strSubstring.isEmpty()) {
                throw C3059.m9364("Invalid path", MotionUtils.EASING_TYPE_PATH, JSON.value(strM31967), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            if (zM31942) {
                throw C3059.m9364("temporary is invalid when reopening a workspace", "temporary", JSON.value(true), JSON.array(false), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            return new C23319(null, strSubstring, true, false);
        }
        C7383 c7383M48690 = C22233.m49903().m48690();
        String strM29843 = C12301.m29843(c7383M48690, strM31967, MotionUtils.EASING_TYPE_PATH, false);
        c7383M48690.m19883(strM29843);
        return new C23319(strM29843, null, !zM31942, zM31942);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String m31948(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "read_signature", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return m31967(jSONObject, "workspaceId");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C22614 m31984(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "close", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return new C22614(m31967(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C12031 m31972(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "list", "workspaceId", "editSessionId", "view", "prefix", "limit");
        m31938(jSONObject, "workspaceId", "editSessionId", "view");
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        String strM31968 = m31967(jSONObject, "view");
        if ("zip_entries".equals(strM31968) || "dex_classes".equals(strM31968) || "resource_table".equals(strM31968)) {
            String strM31922 = m31922(jSONObject, "prefix", "");
            int iM31910 = m31910(200, jSONObject, "limit");
            m31935(iM31910, 1, 1000, "limit");
            return new C12031(strM31967, strM31999, strM31968, strM31922, null, iM31910, 0, 0, 200);
        }
        throw C3059.m9364("Unsupported view", "view", JSON.value(strM31968), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static C12031 m31947(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "mt_apk_dex_read_class_outline", "workspaceId", "editSessionId", "locator", "limit");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator", "limit");
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        String strM31971 = m31971(m31975(jSONObject));
        int iM31981 = m31981(jSONObject, "limit");
        m31935(iM31981, 1, 1000, "limit");
        return new C12031(strM31967, strM31999, "dex_class_outline", "", strM31971, iM31981, 0, 0, iM31981);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C1656 m31908(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "read_text", "workspaceId", "editSessionId", "locator", "limit", "maxChars", "startLine", "startColumn");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        C17884 c17884M31995 = m31995(m31975(jSONObject));
        String str = c17884M31995.f54616;
        if (!"entry_text".equals(str) && !"axml".equals(str) && !"dex_class_smali".equals(str) && !"dex_method_smali".equals(str) && !"dex_field_smali".equals(str)) {
            throw C3059.m9364("mt_apk_read_text accepts only text locators", "locator", JSON.value(m31968(m31926(c17884M31995))), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field"), JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM31957 = m31957(49152, jSONObject, "maxChars");
        m31935(iM31957, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM31958 = m31957(500, jSONObject, "limit");
        m31935(iM31958, 1, 2000, "limit");
        int iM31959 = m31957(0, jSONObject, "startLine");
        m31935(iM31959, 0, Integer.MAX_VALUE, "startLine");
        int iM319510 = m31957(0, jSONObject, "startColumn");
        m31935(iM319510, 0, Integer.MAX_VALUE, "startColumn");
        return new C1656(strM31967, strM31999, c17884M31995, TextBundle.TEXT_ENTRY, iM31959, iM319510, iM31958, iM31957, 0, 256, "startColumn", JSON.value(iM319510));
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C1656 m31994(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "read_bytes", "workspaceId", "editSessionId", "locator", "byteOffset", "maxBytes");
        m31938(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        C17884 c17884M31995 = m31995(m31975(jSONObject));
        if (!"entry_text".equals(c17884M31995.f54616)) {
            throw C3059.m9364("mt_apk_read_bytes accepts only zip_entry locators", "locator", JSON.value(m31968(m31926(c17884M31995))), JSON.array("zip_entry"), JSON.object().add("locator", m31925("zip_entry", "classes.dex", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM31957 = m31957(0, jSONObject, "byteOffset");
        m31935(iM31957, 0, Integer.MAX_VALUE, "byteOffset");
        int iM31958 = m31957(256, jSONObject, "maxBytes");
        m31935(iM31958, 1, 65536, "maxBytes");
        return new C1656(strM31967, strM31999, c17884M31995, "hex", 0, 0, 500, 49152, iM31957, iM31958, null, null);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static C16472 m31907(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39387;
        m31937(jSONObject, "resource_read", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        String str = "locator";
        JSONObject jSONObjectAdd = C7416.m19939("workspaceId", strM31967, "editSessionId", strM31999).add("reads", JSON.array().add(JSON.object().add("locator", m31925("resource", (String) null, (String) null, (String) null, (String) null, "0x7F010000")).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
        JSONArray jSONArrayM31912 = m31912(jSONObject, "reads", jSONObjectAdd);
        if (jSONArrayM31912.size() == 0 || jSONArrayM31912.size() > 200) {
            throw C3059.m9364("Invalid reads", "reads", JSON.value(jSONArrayM31912.size()), JSON.array(1, 200), jSONObjectAdd);
        }
        ArrayList arrayList = new ArrayList(jSONArrayM31912.size());
        int i = 0;
        while (i < jSONArrayM31912.size()) {
            JSONValue jSONValue = jSONArrayM31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid reads item", C18307.m42645(i, "reads[", "]"), jSONValue, JSON.array(), jSONObjectAdd);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f39379);
            for (String str2 : jSONObjectAsObject.names()) {
                JSONArray jSONArray = jSONArrayM31912;
                if (!listAsList.contains(str2)) {
                    throw C3059.m9364("Invalid resource_read item argument", m31974(i, str2), jSONObjectAsObject.get(str2), C0899.m3247(listAsList), jSONObjectAdd);
                }
                jSONArrayM31912 = jSONArray;
            }
            JSONArray jSONArray2 = jSONArrayM31912;
            String strM31974 = m31974(i, str);
            JSONValue jSONValue2 = jSONObjectAsObject.get(str);
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m31949(jSONObjectAdd, strM31974);
            }
            C22342 c22342M31933 = m31933(jSONObjectAdd, jSONValue2, strM31974);
            String str3 = str;
            String str4 = c22342M31933.f72399;
            String str5 = strM31999;
            if (!"resource".equals(str4)) {
                throw C3059.m9364("mt_apk_resource_read accepts only resource locators", strM31974, JSON.value(str4), JSON.array("resource"), jSONObjectAdd);
            }
            String strM23319 = C9042.m23319(c22342M31933.f72400, strM31974);
            String strM31975 = m31974(i, "variant");
            JSONValue jSONValue3 = jSONObjectAsObject.get("variant");
            if (jSONValue3 == null || jSONValue3.isNull()) {
                throw m31949(jSONObjectAdd, strM31975);
            }
            if (!jSONValue3.isString()) {
                throw C3059.m9364(C20094.m46315("Invalid ", strM31975), strM31975, jSONValue3, (JSONArray) null, jSONObjectAdd);
            }
            String strAsString = jSONValue3.asString();
            if (strAsString.isEmpty()) {
                throw C3059.m9364(C20094.m46315("Invalid ", strM31975), strM31975, JSON.value(strAsString), (JSONArray) null, jSONObjectAdd);
            }
            if ("*".equals(strAsString)) {
                throw C3059.m9364("Invalid reads item variant", m31974(i, "variant"), JSON.value(strAsString), JSON.array("default"), jSONObjectAdd);
            }
            arrayList.add(new C10829(strM23319, strAsString));
            i++;
            str = str3;
            strM31999 = str5;
            jSONArrayM31912 = jSONArray2;
        }
        int iM31981 = m31981(jSONObject, "maxValueChars");
        m31935(iM31981, 1, 32768, "maxValueChars");
        int iM31982 = m31981(jSONObject, "maxValueXmlChars");
        m31935(iM31982, 1, 1048576, "maxValueXmlChars");
        int iM31983 = m31981(jSONObject, "maxItemsPerValue");
        m31935(iM31983, 0, 2000, "maxItemsPerValue");
        int iM31984 = m31981(jSONObject, "resolveDepth");
        m31935(iM31984, 0, 1, "resolveDepth");
        return new C16472(strM31967, strM31999, arrayList, iM31981, iM31982, iM31983, iM31984);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31974(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("reads[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23528 m31934(C20226 c20226, C14769 c14769) throws C3059 {
        String str;
        ArrayList arrayListM31928;
        String str2 = c20226.f65427;
        String str3 = c14769.f45093;
        String str4 = c20226.f65431;
        String str5 = c20226.f65429;
        String str6 = c20226.f65425;
        if (!str3.equals(str4)) {
            throw C3059.m9364("Invalid workspaceId", "workspaceId", JSON.value(str4), (JSONArray) null, (JSONObject) null);
        }
        if ("overview".equals(str6)) {
            str = str4;
            arrayListM31928 = m31927((JSONArray) null, c14769.f45090, c14769.f45091, c14769.f45092);
        } else {
            str = str4;
            if ("files".equals(str6)) {
                arrayListM31928 = m31928("zip_entries", "axml");
            } else if ("resource_table_names".equals(str6)) {
                arrayListM31928 = m31928("resource_table_id", "resource_table_name");
            } else if ("resource_table_values".equals(str6)) {
                arrayListM31928 = m31928("resource_table_value");
            } else if ("resource_table_file_paths".equals(str6)) {
                arrayListM31928 = m31928("resource_table_file_path");
            } else if ("dex_names".equals(str6)) {
                arrayListM31928 = m31928("dex_class", "dex_field", "dex_method");
            } else if ("dex_strings".equals(str6) || "dex_string_members".equals(str6)) {
                arrayListM31928 = m31928("dex_string");
            } else if ("smali".equals(str6)) {
                arrayListM31928 = m31928("smali");
            } else if ("native_symbols".equals(str6)) {
                arrayListM31928 = m31928("native_symbol");
            } else if ("native_strings".equals(str6)) {
                arrayListM31928 = m31928("native_string");
            } else {
                throw C3059.m9364("Invalid target", "target", JSON.value(str6), C0899.m3247(Arrays.asList(f39392)), m31987("overview", "AndroidManifest"));
            }
        }
        ArrayList arrayList = arrayListM31928;
        String str7 = c20226.f65424;
        String str8 = c20226.f65425;
        int i = c20226.f65428;
        int i2 = c20226.f65432;
        return new C23528(str, str7, str8, str2, arrayList, i, i2 > 0, i2, !"overview".equals(str8), c20226.f65426, (("files".equals(str6) || "native_symbols".equals(str6) || "native_strings".equals(str6)) && !str5.isEmpty()) ? str5 : null, ("resource_table_names".equals(str6) || "resource_table_values".equals(str6) || "resource_table_file_paths".equals(str6)) ? m31953(str5) : null, (!m31966(str6) || str5.isEmpty()) ? C14355.f43284 : m31998(m31987(str6, str2).put("prefix", "com.example."), str5), "dex_string_members".equals(str6) ? "member" : Name.LABEL, c20226.f65430, new C18193(0, 0, 0, -1, 0));
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static C9418 m31970(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39381;
        m31937(jSONObject, "dex_xref", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        C3292 c3292M31988 = m31988(m31975(jSONObject), jSONObject.get("locator"));
        String strM31968 = m31967(jSONObject, "methodResolution");
        m31978(strM31968, jSONObject.get("methodResolution"));
        m31941(c3292M31988, strM31968, jSONObject.get("methodResolution"));
        int iM31981 = m31981(jSONObject, "limit");
        m31935(iM31981, 1, 200, "limit");
        return new C9418(strM31967, strM31999, c3292M31988.f10331, c3292M31988.f10330, c3292M31988.f10332, strM31968, iM31981, new C1739(0, 0, 0));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C3564 m31997(JSONObject jSONObject) throws C3059 {
        m31937(jSONObject, "mt_apk_session_create", "workspaceId");
        m31938(jSONObject, "workspaceId");
        return new C3564(m31967(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C20498 m32001(JSONObject jSONObject) throws C3059 {
        C21637 c21637;
        String[] strArr = f39388;
        m31937(jSONObject, "mt_apk_delete_target", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31968 = m31967(jSONObject, "editSessionId");
        if (strM31968.isEmpty()) {
            throw C3059.m9364("mt_apk_delete_target requires a non-empty editSessionId", "editSessionId", JSON.value(strM31968), JSON.array("edit session id returned by mt_apk_session_create"), m31916(strM31967, "edit1234", "dex_class"));
        }
        C22342 c22342M31933 = m31933(m31916("<workspaceId>", "<editSessionId>", "smali_class"), JSON.value(m31975(jSONObject)), "locator");
        String str = c22342M31933.f72400;
        String str2 = c22342M31933.f72399;
        if ("dex_class".equals(str2)) {
            c21637 = new C21637("smali_class", m31996(str));
        } else if ("dex_method".equals(str2)) {
            C4703 c4703M31963 = m31963(str, e.s, true);
            c21637 = new C21637("smali_method", m31982(c4703M31963.f14932, c4703M31963.f14933));
        } else {
            if (!"axml".equals(str2) && !"zip_entry".equals(str2)) {
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), m31916("<workspaceId>", "<editSessionId>", "smali_class"));
            }
            if (str == null || !str.endsWith("/")) {
                m31956(str);
            } else {
                m31956(C15472.m36561(1, 0, str));
            }
            c21637 = new C21637(str2, str);
        }
        return new C20498(strM31967, strM31968, c21637.f69463, c21637.f69462);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C7797 m31993(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39384;
        m31937(jSONObject, "patch_bytes", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31968 = m31967(jSONObject, "editSessionId");
        if (strM31968.isEmpty()) {
            throw C3059.m9364("mt_apk_patch_bytes requires a non-empty editSessionId", "editSessionId", JSON.value(strM31968), JSON.array("edit session id returned by mt_apk_session_create"), m31958(strM31967, "edit1234", "assets/data.bin"));
        }
        C22342 c22342M31933 = m31933(m31958(strM31967, strM31968, "assets/data.bin"), JSON.value(m31975(jSONObject)), "locator");
        String str = c22342M31933.f72399;
        if (!"zip_entry".equals(str)) {
            throw C3059.m9364("mt_apk_patch_bytes accepts only zip_entry locators", "locator", JSON.value(str), JSON.array("zip_entry"), m31958(strM31967, strM31968, "assets/data.bin"));
        }
        String str2 = c22342M31933.f72400;
        m31956(str2);
        JSONArray jSONArrayM31912 = m31912(jSONObject, "patches", m31958(strM31967, strM31968, str2));
        JSONObject jSONObjectM31958 = m31958(strM31967, strM31968, str2);
        if (jSONArrayM31912.size() == 0) {
            throw C3059.m9364("patches must contain at least one item", "patches", jSONArrayM31912, JSON.array("1..200"), jSONObjectM31958);
        }
        if (jSONArrayM31912.size() > 200) {
            throw C3059.m9364("patches must contain at most 200 items", "patches", JSON.value(jSONArrayM31912.size()), JSON.array("1..200"), jSONObjectM31958);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = 0;
        while (i < jSONArrayM31912.size()) {
            JSONValue jSONValue = jSONArrayM31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid patches item", C18307.m42645(i, "patches[", "]"), jSONValue, JSON.array(), jSONObjectM31958);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f39383);
            for (String str3 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str3)) {
                    throw C3059.m9364("Invalid patch item argument", m31960(i, str3), jSONObjectAsObject.get(str3), C0899.m3247(listAsList), jSONObjectM31958);
                }
            }
            String strM31960 = m31960(i, "byteOffset");
            JSONValue jSONValue2 = jSONObjectAsObject.get("byteOffset");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m31949(jSONObjectM31958, strM31960);
            }
            if (!jSONValue2.isNumber()) {
                throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, jSONValue2, (JSONArray) null, jSONObjectM31958);
            }
            try {
                int iM3253 = C0899.m3253(jSONValue2);
                if (iM3253 < 0) {
                    throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, jSONValue2, JSON.array(0, Integer.MAX_VALUE), jSONObjectM31958);
                }
                byte[] bArrM31943 = m31943(jSONObjectAsObject, i, "expectedHex", jSONObjectM31958);
                byte[] bArrM31944 = m31943(jSONObjectAsObject, i, "replacementHex", jSONObjectM31958);
                JSONArray jSONArray = jSONArrayM31912;
                if (bArrM31943.length != bArrM31944.length) {
                    throw C3059.m9364("expectedHex and replacementHex must contain the same byte count", m31960(i, "replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array("same byte count as expectedHex"), jSONObjectM31958);
                }
                if (bArrM31943.length > 4096) {
                    throw C3059.m9364("Patch item is too large", m31960(i, "replacementHex"), JSON.value(bArrM31943.length), JSON.array("1..4096"), jSONObjectM31958);
                }
                length += bArrM31943.length;
                if (length > 65536) {
                    throw C3059.m9364("Patch byte budget exceeded", "patches", JSON.value(length), JSON.array("1..65536"), jSONObjectM31958);
                }
                arrayList.add(new C14146(iM3253, bArrM31943, bArrM31944));
                i++;
                jSONArrayM31912 = jSONArray;
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, jSONValue2, (JSONArray) null, jSONObjectM31958);
            }
        }
        return new C7797(strM31967, strM31968, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C12736 m31955(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39389;
        m31937(jSONObject, "mt_apk_resource_edit", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31968 = m31967(jSONObject, "editSessionId");
        String str = "default";
        JSONArray jSONArrayM31912 = m31912(jSONObject, "edits", m31917(strM31967, strM31968, "0x7f010000", "default"));
        JSONObject jSONObjectM31917 = m31917(strM31967, strM31968, "0x7f010000", "default");
        if (jSONArrayM31912.size() == 0) {
            C3059 c3059M9364 = C3059.m9364("edits must contain at least one item", "edits", jSONArrayM31912, JSON.array("1..200"), jSONObjectM31917);
            m31939(c3059M9364, strM31967, strM31968);
            throw c3059M9364;
        }
        if (jSONArrayM31912.size() > 200) {
            C3059 c3059M9365 = C3059.m9364("edits must contain at most 200 items", "edits", JSON.value(jSONArrayM31912.size()), JSON.array("1..200"), jSONObjectM31917);
            m31939(c3059M9365, strM31967, strM31968);
            throw c3059M9365;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < jSONArrayM31912.size()) {
            JSONValue jSONValue = jSONArrayM31912.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                C3059 c3059M9366 = C3059.m9364("Invalid edits item", m31919(i), jSONValue, JSON.array(), jSONObjectM31917);
                m31940(c3059M9366, strM31967, strM31968, i, (String) null, (String) null);
                throw c3059M9366;
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f39386);
            for (String str2 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str2)) {
                    C3059 c3059M9367 = C3059.m9364("Invalid edit resource item argument", m31920(i, str2), jSONObjectAsObject.get(str2), C0899.m3247(listAsList), jSONObjectM31917);
                    m31940(c3059M9367, strM31967, strM31968, i, (String) null, (String) null);
                    throw c3059M9367;
                }
            }
            JSONValue jSONValue2 = jSONObjectAsObject.get("locator");
            String strM31920 = m31920(i, "locator");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                C3059 c3059M31949 = m31949(jSONObjectM31917, strM31920);
                m31940(c3059M31949, strM31967, strM31968, i, (String) null, (String) null);
                throw c3059M31949;
            }
            try {
                C22342 c22342M31933 = m31933(jSONObjectM31917, jSONValue2, strM31920);
                String str3 = c22342M31933.f72399;
                if (!"resource".equals(str3)) {
                    C3059 c3059M9368 = C3059.m9364("mt_apk_resource_edit accepts only resource locators", strM31920, JSON.value(str3), JSON.array("resource"), jSONObjectM31917);
                    m31940(c3059M9368, strM31967, strM31968, i, (String) null, (String) null);
                    throw c3059M9368;
                }
                try {
                    String strM23319 = C9042.m23319(c22342M31933.f72400, strM31920);
                    JSONObject jSONObjectM31918 = m31917(strM31967, strM31968, strM23319, str);
                    JSONArray jSONArray = jSONArrayM31912;
                    String strM31923 = m31923(jSONObjectAsObject, strM31967, strM31968, i, strM23319, null, "variant", jSONObjectM31918);
                    if ("*".equals(strM31923)) {
                        C3059 c3059M9369 = C3059.m9364("Invalid variant", m31920(i, "variant"), JSON.value(strM31923), JSON.array(str), jSONObjectM31918);
                        m31940(c3059M9369, strM31967, strM31968, i, strM23319, strM31923);
                        throw c3059M9369;
                    }
                    int i2 = i;
                    JSONObject jSONObject2 = jSONObjectM31917;
                    String strM31924 = m31923(jSONObjectAsObject, strM31967, strM31968, i2, strM23319, strM31923, "targetVersion", m31917(strM31967, strM31968, strM23319, strM31923));
                    String str4 = str;
                    String strM31925 = m31923(jSONObjectAsObject, strM31967, strM31968, i2, strM23319, strM31923, "valueXml", m31917(strM31967, strM31968, strM23319, strM31923));
                    if (strM31925.trim().isEmpty()) {
                        C3059 c3059M93610 = C3059.m9364("valueXml is required", m31920(i, "valueXml"), JSON.value(strM31925), JSON.array(), m31917(strM31967, strM31968, strM23319, strM31923));
                        m31940(c3059M93610, strM31967, strM31968, i, strM23319, strM31923);
                        throw c3059M93610;
                    }
                    if (!linkedHashSet.add(strM23319 + '\n' + strM31923)) {
                        C3059 c3059M93611 = C3059.m9364("Duplicate resource edit target", m31920(i, "locator"), JSON.value(m31925("resource", (String) null, (String) null, (String) null, (String) null, strM23319)), JSON.array(), m31917(strM31967, strM31968, strM23319, strM31923));
                        m31940(c3059M93611, strM31967, strM31968, i, strM23319, strM31923);
                        throw c3059M93611;
                    }
                    arrayList.add(new C13441(strM23319, strM31923, strM31924, strM31925));
                    i++;
                    str = str4;
                    jSONArrayM31912 = jSONArray;
                    jSONObjectM31917 = jSONObject2;
                } catch (C3059 e) {
                    m31940(e, strM31967, strM31968, i, (String) null, (String) null);
                    throw e;
                }
            } catch (C3059 e2) {
                m31940(e2, strM31967, strM31968, i, (String) null, (String) null);
                throw e2;
            }
        }
        return new C12736(strM31967, strM31968, arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31923(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str5);
        String strM31920 = m31920(i, str5);
        if (jSONValue == null || jSONValue.isNull()) {
            C3059 c3059M31949 = m31949(jSONObject2, strM31920);
            m31940(c3059M31949, str, str2, i, str3, str4);
            throw c3059M31949;
        }
        if (!jSONValue.isString()) {
            C3059 c3059M9364 = C3059.m9364(C20094.m46315("Invalid ", strM31920), strM31920, jSONValue, (JSONArray) null, jSONObject2);
            m31940(c3059M9364, str, str2, i, str3, str4);
            throw c3059M9364;
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.isEmpty()) {
            return strAsString;
        }
        C3059 c3059M9365 = C3059.m9364(C20094.m46315("Invalid ", strM31920), strM31920, JSON.value(strAsString), (JSONArray) null, jSONObject2);
        m31940(c3059M9365, str, str2, i, str3, str4);
        throw c3059M9365;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31940(C3059 c3059, String str, String str2, int i, String str3, String str4) {
        JSONValue jSONValueValue;
        JSONObject jSONObjectPut = c3059.f9609.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i);
        if (str3 == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(m31925("resource", (String) null, (String) null, (String) null, (String) null, str3));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("locator", jSONValueValue).put("variant", str4 == null ? JSON.NULL : JSON.value(str4));
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut2.put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31939(C3059 c3059, String str, String str2) {
        JSONObject jSONObjectPut = c3059.f9609.put("workspaceId", str).put("editSessionId", str2);
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut.put("failedEditIndex", jSONValue).put("locator", jSONValue).put("variant", jSONValue).put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31921(JSONObject jSONObject, int i, String str, boolean z, JSONObject jSONObject2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM31920 = m31920(i, str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31949(jSONObject2, strM31920);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", strM31920), strM31920, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (z || !strAsString.isEmpty()) {
            return strAsString;
        }
        throw C3059.m9364(C20094.m46315("Invalid ", strM31920), strM31920, JSON.value(strAsString), (JSONArray) null, jSONObject2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31980(String str) {
        return "write_target".equals(str) || "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31920(int i, String str) {
        return C23202.m51498(new StringBuilder(), m31919(i), ".", str);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C6386 m31954(JSONObject jSONObject) throws C3059 {
        C21637 c21637;
        String[] strArr = f39394;
        List listAsList = Arrays.asList(strArr);
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str)) {
                throw C3059.m9364("Invalid edit_text argument", str, jSONObject.get(str), C0899.m3247(listAsList), m31914(jSONObject));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            String str2 = strArr[i];
            if (!jSONObject.contains(str2)) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            JSONObject jSONObjectM31914 = m31914(jSONObject);
            if (arrayList.size() == 1) {
                throw m31949(jSONObjectM31914, (String) arrayList.get(0));
            }
            StringBuilder sb = new StringBuilder("Missing parameters: ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) arrayList.get(i2));
            }
            throw C3059.m9364(sb.toString(), "parameters", (JSONValue) null, C0899.m3247(arrayList), jSONObjectM31914);
        }
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31968 = m31967(jSONObject, "editSessionId");
        C22342 c22342M31933 = m31933(JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)), JSON.value(m31975(jSONObject)), "locator");
        String str3 = c22342M31933.f72399;
        String str4 = c22342M31933.f72400;
        if ("dex_class".equals(str3)) {
            c21637 = new C21637("smali_class", m31996(str4));
        } else if ("dex_method".equals(str3)) {
            C4703 c4703M31963 = m31963(str4, e.s, true);
            c21637 = new C21637("smali_method", m31982(c4703M31963.f14932, c4703M31963.f14933));
        } else {
            if (!"axml".equals(str3) && !"zip_entry".equals(str3)) {
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str3), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
            }
            m31956(str4);
            c21637 = new C21637(str3, str4);
        }
        String strM31999 = m31999(jSONObject, "targetVersion");
        boolean zIsEmpty = strM31999.isEmpty();
        String str5 = c21637.f69463;
        String str6 = c21637.f69462;
        if (zIsEmpty) {
            throw C3059.m9364("targetVersion is required", "targetVersion", JSON.value(strM31999), JSON.array(), m31918(strM31967, strM31968, str5, m31961(jSONObject), str6));
        }
        JSONArray jSONArrayM31912 = m31912(jSONObject, "edits", m31918(strM31967, strM31968, str5, "replace_match", str6));
        if (jSONArrayM31912.size() == 0) {
            throw C3059.m9364("edits must contain at least one item", "edits", jSONArrayM31912, JSON.array(), m31918(strM31967, strM31968, str5, "replace_match", str6));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        while (i4 < jSONArrayM31912.size()) {
            JSONObject jSONObjectM31918 = m31918(strM31967, strM31968, str5, "replace_match", str6);
            JSONValue jSONValue = jSONArrayM31912.get(i4);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C3059.m9364("Invalid edits item", m31919(i4), jSONValue, JSON.array(), jSONObjectM31918);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            JSONArray jSONArray = jSONArrayM31912;
            List listAsList2 = Arrays.asList(f39382);
            for (String str7 : jSONObjectAsObject.names()) {
                String str8 = strM31999;
                if (!listAsList2.contains(str7)) {
                    throw C3059.m9364("Invalid edit item argument", m31920(i4, str7), jSONObjectAsObject.get(str7), C0899.m3247(listAsList2), jSONObjectM31918);
                }
                strM31999 = str8;
            }
            String str9 = strM31999;
            String strM31921 = m31921(jSONObjectAsObject, i4, "mode", false, jSONObjectM31918);
            if (m31980(strM31921)) {
                jSONObjectM31918 = m31918(strM31967, strM31968, str5, strM31921, str6);
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            String strM31922 = m31921(jSONObjectAsObject, i4, "matchText", true, jSONObjectM31918);
            String strM31923 = m31921(jSONObjectAsObject, i4, "writeText", true, jSONObjectM31918);
            if ("write_target".equals(strM31921)) {
                if (!strM31922.isEmpty()) {
                    throw C3059.m9364("write_target requires empty matchText", m31920(i4, "matchText"), JSON.value(strM31922), JSON.array(""), m31918(strM31967, strM31968, str5, strM31921, str6));
                }
                if (strM31923.isEmpty() && !"zip_entry".equals(str5)) {
                    throw C3059.m9364("write_target requires non-empty writeText", m31920(i4, "writeText"), JSON.value(strM31923), JSON.array(), m31918(strM31967, strM31968, str5, strM31921, str6));
                }
            } else if (!"replace_match".equals(strM31921)) {
                if (!"insert_before_match".equals(strM31921) && !"insert_after_match".equals(strM31921)) {
                    throw C3059.m9364("Invalid mode", m31920(i4, "mode"), JSON.value(strM31921), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), m31918(strM31967, strM31968, str5, "replace_match", str6));
                }
                if (strM31922.isEmpty()) {
                    throw C3059.m9364(C16014.m37867(strM31921, " requires non-empty matchText"), m31920(i4, "matchText"), JSON.value(strM31922), JSON.array(), m31918(strM31967, strM31968, str5, strM31921, str6));
                }
                if (strM31923.isEmpty()) {
                    throw C3059.m9364(C16014.m37867(strM31921, " requires non-empty writeText"), m31920(i4, "writeText"), JSON.value(strM31923), JSON.array(), m31918(strM31967, strM31968, str5, strM31921, str6));
                }
            } else if (strM31922.isEmpty()) {
                throw C3059.m9364("replace_match requires non-empty matchText", m31920(i4, "matchText"), JSON.value(strM31922), JSON.array(), m31918(strM31967, strM31968, str5, strM31921, str6));
            }
            if ("write_target".equals(strM31921)) {
                i5 = i4;
            }
            C10620 c10620 = new C10620(strM31921, strM31922, strM31923);
            arrayList2 = arrayList3;
            arrayList2.add(c10620);
            i4++;
            jSONArrayM31912 = jSONArray;
            i3 = i5;
            strM31999 = str9;
        }
        int i6 = i3;
        String str10 = strM31999;
        if (arrayList2.size() <= 1 || i6 < 0) {
            return new C6386(strM31967, strM31968, str5, str6, str10, arrayList2);
        }
        throw C3059.m9364("write_target must be the only edit", m31920(i6, "mode"), JSON.value(((C10620) arrayList2.get(i6)).f31899), JSON.array("replace_match", "insert_before_match", "insert_after_match"), m31918(strM31967, strM31968, str5, "replace_match", str6));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m31943(JSONObject jSONObject, int i, String str, JSONObject jSONObject2) throws C3059 {
        String strM31960 = m31960(i, str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31949(jSONObject2, strM31960);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty() || (strAsString.length() & 1) != 0) {
            throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, JSON.value(strAsString), JSON.array("non-empty even-length hex"), jSONObject2);
        }
        int length = strAsString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iM31909 = m31909(strAsString.charAt(i3));
            int iM319010 = m31909(strAsString.charAt(i3 + 1));
            if (iM31909 < 0 || iM319010 < 0) {
                throw C3059.m9364(C20094.m46315("Invalid ", strM31960), strM31960, JSON.value(strAsString), JSON.array("hex characters 0-9, a-f, A-F"), jSONObject2);
            }
            bArr[i2] = (byte) (iM319010 | (iM31909 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31960(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("patches[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31914(JSONObject jSONObject) {
        C21637 c21637;
        C21637 c21638;
        JSONValue jSONValue = jSONObject.get("workspaceId");
        String strAsString = (jSONValue == null || !jSONValue.isString() || jSONValue.asString().isEmpty()) ? "<workspaceId>" : jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("editSessionId");
        String strAsString2 = (jSONValue2 == null || !jSONValue2.isString() || jSONValue2.asString().isEmpty()) ? "<editSessionId>" : jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("locator");
        String strM37341 = "Lcom/example/EditTarget;";
        if (jSONValue3 == null || !jSONValue3.isString()) {
            c21637 = new C21637("smali_class", "Lcom/example/EditTarget;");
        } else {
            String strAsString3 = jSONValue3.asString();
            String strM31968 = m31968(strAsString3);
            String strM32000 = m32000(strAsString3);
            if (strM31968 == null || strM32000 == null) {
                c21637 = new C21637("smali_class", "Lcom/example/EditTarget;");
            } else if ("dex_method".equals(strM31968)) {
                if (strM32000.isEmpty()) {
                    strM32000 = "Lcom/example/EditTarget;->target()V";
                }
                c21638 = new C21637("smali_method", strM32000);
            } else if ("axml".equals(strM31968)) {
                if (strM32000.isEmpty()) {
                    strM32000 = "AndroidManifest.xml";
                }
                c21638 = new C21637("axml", strM32000);
            } else if ("zip_entry".equals(strM31968)) {
                if (strM32000.isEmpty()) {
                    strM32000 = "assets/example.txt";
                }
                c21638 = new C21637("zip_entry", strM32000);
            } else {
                if (!strM32000.isEmpty()) {
                    try {
                        strM37341 = C15799.m37341(strM32000);
                    } catch (RuntimeException | C3059 unused) {
                    }
                }
                c21638 = new C21637("smali_class", strM37341);
            }
            return m31918(strAsString, strAsString2, c21638.f69463, m31961(jSONObject), c21638.f69462);
        }
        c21638 = c21637;
        return m31918(strAsString, strAsString2, c21638.f69463, m31961(jSONObject), c21638.f69462);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m31961(JSONObject jSONObject) {
        JSONValue jSONValue;
        JSONValue jSONValue2 = jSONObject.get("mode");
        if (jSONValue2 != null && jSONValue2.isString() && m31980(jSONValue2.asString())) {
            return jSONValue2.asString();
        }
        JSONValue jSONValue3 = jSONObject.get("edits");
        return (jSONValue3 != null && jSONValue3.isArray() && jSONValue3.asArray().size() > 0 && jSONValue3.asArray().get(0).isObject() && (jSONValue = jSONValue3.asArray().get(0).asObject().get("mode")) != null && jSONValue.isString() && m31980(jSONValue.asString())) ? jSONValue.asString() : "replace_match";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31918(String str, String str2, String str3, String str4, String str5) {
        String strM14172;
        String str6;
        String str7;
        String str8 = ".class public ";
        String strM14173 = "";
        if ("write_target".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n.super Ljava/lang/Object;\n";
                strM14172 = C4860.m14172(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                StringBuilder sb = new StringBuilder(".method public ");
                int iIndexOf = str5.indexOf("->");
                strM14172 = C9045.m23341(sb, iIndexOf < 0 ? "method()V" : str5.substring(iIndexOf + 2), "\n    .registers 1\n    return-void\n.end method");
            } else {
                strM14172 = "axml".equals(str3) ? "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" />\n" : "text\n";
            }
        } else if ("replace_match".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n";
                strM14173 = C4860.m14172(".class public ", str5, "\n");
                str8 = ".class public final ";
                strM14172 = C4860.m14172(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                str6 = "    # inserted marker\n    return-void\n";
                strM14172 = str6;
                strM14173 = "    return-void\n";
            } else {
                strM14173 = "old";
                strM14172 = "new";
            }
        } else if (!"insert_before_match".equals(str4) && !"insert_after_match".equals(str4)) {
            strM14172 = "";
        } else if ("smali_class".equals(str3)) {
            strM14173 = ".super Ljava/lang/Object;\n";
            strM14172 = "# inserted comment\n";
        } else if ("smali_method".equals(str3)) {
            str6 = "    # inserted marker\n";
            strM14172 = str6;
            strM14173 = "    return-void\n";
        } else {
            strM14173 = "</";
            strM14172 = "inserted";
        }
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31924(str3, str5)).add("targetVersion", "<copy data.targetVersion from mt_apk_read_text>").add("edits", JSON.array().add(C7416.m19939("mode", str4, "matchText", strM14173).add("writeText", strM14172)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31916(String str, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31924(str3, "Lcom/example/EditTarget;"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31958(String str, String str2, String str3) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("locator", m31925("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "01")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31917(String str, String str2, String str3, String str4) {
        return C7416.m19939("workspaceId", str, "editSessionId", str2).add("edits", JSON.array().add(JSON.object().add("locator", m31925("resource", (String) null, (String) null, (String) null, (String) null, str3)).add("variant", str4).add("targetVersion", "<copy results[0].targetVersion from mt_apk_resource_read>").add("valueXml", "<string name=\"example\">text</string>")));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C4975 m31951(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39390;
        m31937(jSONObject, "mt_apk_session_check", strArr);
        m31938(jSONObject, strArr);
        return new C4975(m31967(jSONObject, "workspaceId"), m31967(jSONObject, "editSessionId"), m31979(jSONObject, "runBuildChecks"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C21909 m31989(JSONObject jSONObject) throws C3059 {
        String strM29847;
        m31937(jSONObject, "build", f39385);
        m31938(jSONObject, f39393);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31968 = m31967(jSONObject, "editSessionId");
        String strM31999 = m31999(jSONObject, "outputName");
        if (strM31999.isEmpty()) {
            strM29847 = strM31999;
        } else if (strM31999.startsWith("/")) {
            strM29847 = C12301.m29847(strM31999, "outputName");
        } else {
            if (!".".equals(strM31999) && !"..".equals(strM31999) && strM31999.indexOf(47) < 0 && strM31999.indexOf(92) < 0) {
                int i = 0;
                if (strM31999.indexOf(0) < 0) {
                    int iIndexOf = strM31999.indexOf(58);
                    if (iIndexOf > 0) {
                        while (true) {
                            if (i < iIndexOf) {
                                char cCharAt = strM31999.charAt(i);
                                if (i == 0) {
                                    if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                                        break;
                                    }
                                    i++;
                                } else {
                                    if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '+' || cCharAt == '-' || cCharAt == '.'))) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    strM29847 = strM31999;
                }
            }
            throw C3059.m9364("Invalid outputName", "outputName", JSON.value(strM31999), JSON.array(), JSON.object().add("outputName", "built.apk"));
        }
        return new C21909(strM31967, strM31968, strM29847, m31979(jSONObject, "overwrite"), jSONObject.contains("sign") ? m31979(jSONObject, "sign") : true);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m31956(String str) throws C3059 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0 || str.endsWith("/")) {
            throw C3059.m9364("Invalid locator", "locator", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("locator", m31925("zip_entry", "res/layout/activity_main.xml", (String) null, (String) null, (String) null, (String) null)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31926(C17884 c17884) {
        String str = c17884.f54616;
        String str2 = c17884.f54616;
        if ("entry_text".equals(str)) {
            return m31925("zip_entry", c17884.f54612, (String) null, (String) null, (String) null, (String) null);
        }
        if ("axml".equals(str2)) {
            return m31925("axml", c17884.f54612, (String) null, (String) null, (String) null, (String) null);
        }
        if ("dex_class_smali".equals(str2)) {
            return m31925("dex_class", (String) null, c17884.f54611, (String) null, (String) null, (String) null);
        }
        if ("dex_method_smali".equals(str2)) {
            return m31925("dex_method", (String) null, c17884.f54611, c17884.f54615, (String) null, (String) null);
        }
        if ("dex_field_smali".equals(str2)) {
            return m31925("dex_field", (String) null, c17884.f54611, (String) null, c17884.f54614, (String) null);
        }
        return m31925("resource", (String) null, (String) null, (String) null, (String) null, c17884.f54613);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31925(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!"zip_entry".equals(str) && !"axml".equals(str)) {
            if ("dex_class".equals(str)) {
                str2 = C18373.m42807(str3);
            } else if ("dex_method".equals(str)) {
                str2 = m31982(str3, str4);
            } else if ("dex_field".equals(str)) {
                str2 = m31982(str3, str5);
            } else {
                if (!"resource".equals(str)) {
                    throw new IllegalArgumentException(C20094.m46315("Unsupported target kind: ", str));
                }
                str2 = str6 == null ? null : str6.toLowerCase(Locale.ROOT);
            }
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException(C20094.m46315("Empty target for locator kind: ", str));
        }
        return str + ':' + str2;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static String m31944(String str) throws C3059 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m31925("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null));
        C22342 c22342M31933 = m31933(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c22342M31933.f72399;
        if (!"zip_entry".equals(str2)) {
            throw C3059.m9364("Only zip_entry locators are accepted", "locator", JSON.value(str2), JSON.array("zip_entry"), jSONObjectAdd);
        }
        String str3 = c22342M31933.f72400;
        if (str3 == null || !str3.endsWith("/")) {
            m31956(str3);
        } else {
            m31956(C15472.m36561(1, 0, str3));
        }
        return str3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m31968(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m32000(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONValue m31959(String str, String str2) {
        if (str == null || str2 == null) {
            return JSON.NULL;
        }
        if ("axml".equals(str) || "zip_entry".equals(str) || "smali_method".equals(str) || "smali_class".equals(str)) {
            return JSON.value(m31924(str, str2));
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31924(String str, String str2) {
        if ("axml".equals(str)) {
            return m31925("axml", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("zip_entry".equals(str)) {
            return m31925("zip_entry", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("smali_method".equals(str)) {
            return C20094.m46315("dex_method:", str2);
        }
        if ("smali_class".equals(str)) {
            return m31925("dex_class", (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported edit target type: ", str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31976(String str, String str2, String str3) {
        if ("dex_method".equals(str)) {
            return m31925(str, (String) null, str2, str3, (String) null, (String) null);
        }
        if ("dex_field".equals(str)) {
            return m31925(str, (String) null, str2, (String) null, str3, (String) null);
        }
        if ("dex_class".equals(str)) {
            return m31925(str, (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C20094.m46315("Unsupported xref target kind: ", str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12031 m31932(String str, String str2, C2519 c2519, JSONObject jSONObject) throws C3059 {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        String strM31967 = m31967(jSONObject2, "view");
        if ("zip_entries".equals(strM31967) || "dex_classes".equals(strM31967) || "resource_table".equals(strM31967)) {
            if (!jSONObject2.contains("prefix")) {
                throw m31950("prefix");
            }
            String strM31922 = m31922(jSONObject2, "prefix", "");
            int iM31911 = m31911(c2519, jSONObject);
            int iM31986 = m31986(jSONObject3, "offset");
            m31935(iM31986, 0, Integer.MAX_VALUE, "offset");
            return new C12031(str, str2, strM31967, strM31922, null, iM31911, iM31986, 0, 200);
        }
        throw C3059.m9364("Unsupported view", "view", JSON.value(strM31967), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12031 m31964(String str, String str2, C2519 c2519, JSONObject jSONObject) throws C3059 {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        String strM31971 = m31971(m31967(jSONObject2, "locator"));
        int iM31911 = m31911(c2519, jSONObject);
        int iM31986 = m31986(jSONObject3, "memberOffset");
        m31935(iM31986, 0, Integer.MAX_VALUE, "memberOffset");
        return new C12031(str, str2, "dex_class_outline", "", strM31971, iM31911, 0, iM31986, iM31911);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C1656 m31977(String str, String str2, C2519 c2519, JSONObject jSONObject) throws C3059 {
        JSONObject jSONObject2 = c2519.f7996;
        JSONObject jSONObject3 = c2519.f7997;
        C17884 c17884M31995 = m31995(m31967(jSONObject2, "target"));
        String str3 = c17884M31995.f54616;
        String strM31922 = m31922(jSONObject2, "format", TextBundle.TEXT_ENTRY);
        if ("hex".equals(strM31922)) {
            if (!"entry_text".equals(str3)) {
                throw C3059.m9364("Byte read cursor is valid only for zip_entry locators", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            int iM31911 = m31911(c2519, jSONObject);
            int iM31986 = m31986(jSONObject3, "hexOffset");
            m31935(iM31986, 0, Integer.MAX_VALUE, "hexOffset");
            return new C1656(str, str2, c17884M31995, strM31922, 0, 0, 500, 49152, iM31986, iM31911, null, null);
        }
        if (!TextBundle.TEXT_ENTRY.equals(strM31922)) {
            throw C3059.m9364("Invalid read cursor format", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        if ("resource_item".equals(str3)) {
            throw C3059.m9364("Resource read cursors are no longer supported", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        int iM31912 = m31911(c2519, jSONObject);
        int iM31987 = m31986(jSONObject2, "maxChars");
        m31935(iM31987, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM31988 = m31986(jSONObject3, "lineOffset");
        m31935(iM31988, 0, Integer.MAX_VALUE, "lineOffset");
        int iM31989 = m31986(jSONObject3, "lineCharOffset");
        m31935(iM31989, 0, Integer.MAX_VALUE, "lineCharOffset");
        return new C1656(str, str2, c17884M31995, strM31922, iM31988, iM31989, iM31912, iM31987, 0, 256, "nextCursor", jSONObject.get("nextCursor"));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C23528 m31990(String str, String str2, C2519 c2519, JSONObject jSONObject) throws C3059 {
        String str3;
        C14355 c14355;
        JSONObject jSONObject2 = c2519.f7996;
        String strM31967 = m31967(jSONObject2, "query");
        String strM31968 = m31967(jSONObject2, "queryType");
        boolean zM31965 = m31965(jSONObject2, "caseSensitive");
        String strM31969 = m31967(jSONObject2, "matchMode");
        C16781 c16781M39514 = C16781.m39514(strM31967, strM31968, strM31969, zM31965);
        JSONValue jSONValue = jSONObject2.get("scopes");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962("scopes", jSONValue);
        }
        String str4 = null;
        if (!jSONValue.isArray()) {
            throw C3059.m9364("Invalid scopes", "scopes", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        int i = 0;
        ArrayList arrayListM31927 = m31927(jSONValue.asArray(), false, false, false);
        if ("exact".equals(strM31969)) {
            Iterator it = arrayListM31927.iterator();
            while (it.hasNext()) {
                if ("smali".equals((String) it.next())) {
                    throw C3059.m9364("matchMode=exact is invalid for smali scope", "matchMode", JSON.value(strM31969), JSON.array("contains"), JSON.object().add("scopes", JSON.array("smali")).add("matchMode", "contains"));
                }
            }
        }
        int iM31911 = m31911(c2519, jSONObject);
        boolean zM31966 = m31965(jSONObject2, "includeSnippet");
        int iM31986 = m31986(jSONObject2, "snippetMaxChars");
        m31935(iM31986, 0, 1000, "snippetMaxChars");
        boolean zM31967 = m31965(jSONObject2, "explicitScopes");
        JSONValue jSONValue2 = jSONObject.get("nextCursor");
        String strM31922 = m31922(jSONObject2, "target", (String) null);
        if (strM31922 == null) {
            str3 = zM31967 ? "" : "overview";
        } else {
            while (true) {
                if (i >= 11) {
                    throw C3059.m9364("Invalid cursor", "nextCursor", jSONValue2, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                if (f39392[i].equals(strM31922)) {
                    str3 = strM31922;
                    break;
                }
                i++;
                str4 = null;
            }
        }
        boolean zM31968 = m31965(jSONObject2, "includeMatchOffsets");
        String strM31923 = m31922(jSONObject2, "zipEntryPrefix", str4);
        String strM31924 = m31922(jSONObject2, "resourcePrefix", str4);
        String strM31953 = strM31924 == null ? str4 : m31953(strM31924);
        String strM319610 = m31967(jSONObject2, "classPrefixMode");
        String strM31925 = m31922(jSONObject2, "classPrefix", str4);
        if ("none".equals(strM319610)) {
            if (strM31925 != null) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(strM31925), (JSONArray) null, (JSONObject) null);
            }
            c14355 = C14355.f43284;
        } else {
            if (strM31925 == null || strM31925.isEmpty()) {
                throw C3059.m9364("Invalid prefix", "prefix", strM31925 == null ? null : JSON.value(strM31925), (JSONArray) null, (JSONObject) null);
            }
            if (!"prefix".equals(strM319610) && !"descriptorExact".equals(strM319610)) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(strM31925), (JSONArray) null, (JSONObject) null);
            }
            c14355 = new C14355(strM319610, strM31925);
        }
        String strM319611 = m31967(jSONObject2, "dexStringResultMode");
        if (Name.LABEL.equals(strM319611) || "member".equals(strM319611)) {
            return new C23528(str, str2, str3, strM31967, arrayListM31927, iM31911, zM31966, iM31986, zM31967, zM31968, strM31923, strM31953, c14355, strM319611, c16781M39514, C18193.m42416(c2519.f7997, jSONObject.get("nextCursor")));
        }
        throw C3059.m9364("Invalid cursor", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C9418 m31983(String str, String str2, C2519 c2519, JSONObject jSONObject) throws C3059 {
        JSONObject jSONObject2 = c2519.f7996;
        int iM31911 = m31911(c2519, jSONObject);
        try {
            C3292 c3292M31988 = m31988(m31967(jSONObject2, "targetLocator"), jSONObject.get("nextCursor"));
            String strM31967 = m31967(jSONObject2, "methodResolution");
            m31978(strM31967, jSONObject.get("nextCursor"));
            m31941(c3292M31988, strM31967, jSONObject.get("nextCursor"));
            return new C9418(str, str2, c3292M31988.f10331, c3292M31988.f10330, c3292M31988.f10332, strM31967, iM31911, C1739.m5814(c2519.f7997, jSONObject.get("nextCursor")));
        } catch (C3059 unused) {
            throw C3059.m9364("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C3292 m31988(String str, JSONValue jSONValue) throws C3059 {
        C22342 c22342M31933 = m31933(m31906("dex_method"), JSON.value(str), "locator");
        String str2 = c22342M31933.f72399;
        try {
            String str3 = c22342M31933.f72400;
            if (!"dex_method".equals(str2)) {
                if (!"dex_field".equals(str2)) {
                    if ("dex_class".equals(str2)) {
                        return new C3292(str2, m31996(str3), null);
                    }
                    throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_method", "dex_field", "dex_class"), m31906("dex_method"));
                }
                C4703 c4703M31963 = m31963(str3, "field", true);
                return new C3292(str2, c4703M31963.f14932, c4703M31963.f14933);
            }
            C4703 c4703M31964 = m31963(str3, e.s, true);
            return new C3292(str2, c4703M31964.f14932, c4703M31964.f14933);
        } catch (C3059 unused) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, JSON.array(), m31906(str2));
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m31978(String str, JSONValue jSONValue) throws C3059 {
        int i = 0;
        while (true) {
            String[] strArr = f39377;
            if (i < 4) {
                if (strArr[i].equals(str)) {
                    return;
                } else {
                    i++;
                }
            } else {
                throw C3059.m9364("Invalid methodResolution", "methodResolution", jSONValue, C0899.m3247(Arrays.asList(strArr)), JSON.object().add("methodResolution", "dispatch"));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31941(C3292 c3292, String str, JSONValue jSONValue) throws C3059 {
        if ("dex_method".equals(c3292.f10331)) {
            if ("not_applicable".equals(str)) {
                throw C3059.m9364("Invalid methodResolution for dex_method", "methodResolution", jSONValue, C0899.m3247(Arrays.asList("exact", "slot", "dispatch")), JSON.object().add("methodResolution", "dispatch"));
            }
        } else if (!"not_applicable".equals(str)) {
            throw C3059.m9364("Invalid methodResolution for xref target", "methodResolution", jSONValue, JSON.array("not_applicable"), JSON.object().add("methodResolution", "not_applicable"));
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static C17884 m31995(String str) throws C3059 {
        C22342 c22342M31933 = m31933(JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)), JSON.value(str), "locator");
        String str2 = c22342M31933.f72399;
        String str3 = c22342M31933.f72400;
        if ("zip_entry".equals(str2)) {
            return C17884.m41854(str3);
        }
        if ("axml".equals(str2)) {
            return C17884.m41850(str3);
        }
        if ("dex_class".equals(str2)) {
            return C17884.m41852(m31996(str3));
        }
        if (!"dex_method".equals(str2)) {
            if (!"dex_field".equals(str2)) {
                if ("resource".equals(str2)) {
                    return C17884.m41855(C9042.m23319(str3, "locator"));
                }
                throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field", "resource"), JSON.object().add("locator", m31925("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
            }
            C4703 c4703M31963 = m31963(str3, "field", true);
            return C17884.m41851(c4703M31963.f14932, c4703M31963.f14933);
        }
        C4703 c4703M31964 = m31963(str3, e.s, true);
        return C17884.m41853(c4703M31964.f14932, c4703M31964.f14933);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static String m31971(String str) throws C3059 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        C22342 c22342M31933 = m31933(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c22342M31933.f72399;
        if (!"dex_class".equals(str2)) {
            throw C3059.m9364("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class"), jSONObjectAdd);
        }
        return m31996(c22342M31933.f72400);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m31975(JSONObject jSONObject) throws C3059 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962("locator", jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C3059.m9364("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return strAsString;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22342 m31933(JSONObject jSONObject, JSONValue jSONValue, String str) throws C3059 {
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364(C20094.m46315("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        String strAsString = jSONValue.asString();
        int iIndexOf = strAsString.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == strAsString.length() - 1) {
            throw C3059.m9364(C20094.m46315("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        return new C22342(strAsString.substring(0, iIndexOf), strAsString.substring(iIndexOf + 1));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m31957(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) ? i : m31910(i, jSONObject, str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static String m31946(String str) {
        return m31963(str, e.s, false).f14932;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m31992(String str) {
        return m31963(str, e.s, false).f14933;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m31982(String str, String str2) {
        return C18373.m42807(str) + "->" + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C4703 m31963(String str, String str2, boolean z) throws C3059 {
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw m31931(str, str2, z);
        }
        boolean zM31985 = false;
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 2);
        if (!strSubstring.startsWith("L") || !strSubstring.endsWith(l.b) || strSubstring.length() <= 2 || strSubstring2.isEmpty()) {
            throw m31931(str, str2, z);
        }
        if (e.s.equals(str2)) {
            int iIndexOf2 = strSubstring2.indexOf(40);
            int iIndexOf3 = strSubstring2.indexOf(41, iIndexOf2 + 1);
            if (iIndexOf2 <= 0 || iIndexOf3 <= iIndexOf2 || iIndexOf3 >= strSubstring2.length() - 1) {
                throw m31931(str, str2, z);
            }
        } else {
            if ("field".equals(str2)) {
                int iIndexOf4 = strSubstring2.indexOf(58);
                if (iIndexOf4 > 0 && iIndexOf4 < strSubstring2.length() - 1 && strSubstring2.indexOf(40) < 0 && strSubstring2.indexOf(41) < 0) {
                    String strSubstring3 = strSubstring2.substring(iIndexOf4 + 1);
                    if (strSubstring3 != null && !strSubstring3.isEmpty()) {
                        int i = 0;
                        while (i < strSubstring3.length() && strSubstring3.charAt(i) == '[') {
                            i++;
                        }
                        if (i < strSubstring3.length()) {
                            zM31985 = m31985(strSubstring3.substring(i));
                        }
                    }
                }
                throw m31931(str, str2, z);
            }
            throw new IllegalArgumentException("Unsupported smali reference kind: ".concat(str2));
        }
        return new C4703(strSubstring, strSubstring2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m31985(String str) {
        if (str.length() == 1) {
            return "ZBCSIJFD".indexOf(str.charAt(0)) >= 0;
        }
        return str.startsWith("L") && str.endsWith(l.b) && str.length() > 2 && str.indexOf(91) < 0 && str.indexOf(58) < 0 && str.indexOf(40) < 0 && str.indexOf(41) < 0 && str.indexOf(59) == str.length() - 1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m31996(String str) throws C3059 {
        if (!m31985(str) || str.indexOf(46) >= 0 || str.indexOf(59) != str.length() - 1) {
            throw C3059.m9364("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
        }
        return C18373.m42807(str);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static JSONObject m31906(String str) {
        if ("dex_field".equals(str)) {
            return JSON.object().add("locator", m31925("dex_field", (String) null, "Lcom/example/Foo;", (String) null, "fieldFlag:Z", (String) null));
        }
        if ("dex_class".equals(str)) {
            return JSON.object().add("locator", m31925("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        }
        return JSON.object().add("locator", m31925("dex_method", (String) null, "Lcom/example/Foo;", "onCreate(Landroid/os/Bundle;)V", (String) null, (String) null));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31931(String str, String str2, boolean z) {
        String str3 = e.s.equals(str2) ? "Lcom/example/Foo;->onCreate(Landroid/os/Bundle;)V" : "Lcom/example/Foo;->fieldFlag:Z";
        if (z) {
            return C3059.m9364("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", "dex_" + str2 + ':' + str3));
        }
        return C3059.m9364("Invalid target", "target", JSON.value(str), JSON.array(), JSON.object().add("target", "Lcom/example/Foo;->bar()V"));
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C20226 m31952(JSONObject jSONObject) throws C3059 {
        String[] strArr = f39380;
        m31937(jSONObject, "search", strArr);
        m31938(jSONObject, strArr);
        String strM31967 = m31967(jSONObject, "workspaceId");
        String strM31999 = m31999(jSONObject, "editSessionId");
        String strM319910 = m31999(jSONObject, "target");
        int i = 0;
        while (true) {
            String[] strArr2 = f39392;
            if (i >= 11) {
                throw C3059.m9364("Invalid target", "target", JSON.value(strM319910), C0899.m3247(Arrays.asList(strArr2)), m31987("overview", "AndroidManifest"));
            }
            if (strArr2[i].equals(strM319910)) {
                String strM319911 = m31999(jSONObject, "query");
                if (strM319911.isEmpty()) {
                    throw C3059.m9364("Invalid query", "query", JSON.value(strM319911), (JSONArray) null, m31987(strM319910, "AndroidManifest"));
                }
                String strM319912 = m31999(jSONObject, "queryType");
                boolean zM31979 = m31979(jSONObject, "caseSensitive");
                String strM319913 = m31999(jSONObject, "matchMode");
                String strM319914 = m31999(jSONObject, "prefix");
                boolean zM319710 = m31979(jSONObject, "includeMatchOffsets");
                int iM31981 = m31981(jSONObject, "limit");
                m31936(iM31981, 1, 200, "limit", m31987(strM319910, strM319911));
                int iM31982 = m31981(jSONObject, "snippetMaxChars");
                m31936(iM31982, 0, 1000, "snippetMaxChars", m31987(strM319910, strM319911));
                if ("overview".equals(strM319910) && !strM319914.isEmpty()) {
                    throw C3059.m9364("prefix must be empty for target=overview", "prefix", JSON.value(strM319914), JSON.array(""), m31987("overview", "AndroidManifest"));
                }
                if ("smali".equals(strM319910) && "exact".equals(strM319913)) {
                    throw C3059.m9364("matchMode=exact is invalid for target=smali", "matchMode", JSON.value(strM319913), JSON.array("contains"), m31987("smali", "onCreate"));
                }
                if ("resource_table_names".equals(strM319910) || "resource_table_values".equals(strM319910) || "resource_table_file_paths".equals(strM319910)) {
                    m31953(strM319914);
                } else if (m31966(strM319910) && !strM319914.isEmpty()) {
                    m31998(m31987(strM319910, "Outer").put("prefix", "com.example."), strM319914);
                }
                try {
                    return new C20226(strM31967, strM31999, strM319910, strM319911, strM319914, zM319710, iM31981, iM31982, C16781.m39514(strM319911, strM319912, strM319913, zM31979));
                } catch (C3059 e) {
                    if (!e.f9605) {
                        throw e;
                    }
                    JSONObject jSONObject2 = e.f9609;
                    String string = jSONObject2.getString("argument", null);
                    if (!"query".equals(string) && !"queryType".equals(string) && !"matchMode".equals(string)) {
                        throw e;
                    }
                    throw C3059.m9364(e.getMessage(), string, e.f9608, jSONObject2.getJSONArray("allowedValues"), m31987(strM319910, "query".equals(string) ? "AndroidManifest" : strM319911));
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31966(String str) {
        return "dex_names".equals(str) || "dex_strings".equals(str) || "dex_string_members".equals(str) || "smali".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m31928(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return m31927(jSONArrayArray, false, false, false);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m31953(String str) throws C3059 {
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("/") || str.contains("//")) {
            throw m31929(str);
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0 || iIndexOf != str.lastIndexOf(47)) {
                throw m31929(str);
            }
            if (str.substring(0, iIndexOf).isEmpty()) {
                throw m31929(str);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31929(String str) {
        return C3059.m9364("Invalid prefix", "prefix", JSON.value(str), JSON.array("", "0x7f", "string", "string/app_", "app_"), m31987("resource_table_names", "app_name").put("prefix", "string/"));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14355 m31998(JSONObject jSONObject, String str) throws C3059 {
        if (str == null) {
            return C14355.f43284;
        }
        if (!str.contains(l.b)) {
            String strReplace = (str.startsWith("L") ? str.substring(1) : str).replace('.', '/');
            if (strReplace.isEmpty()) {
                throw C3059.m9364("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
            }
            return new C14355("prefix", strReplace);
        }
        if (str.startsWith("L") && str.endsWith(l.b) && str.indexOf(59) == str.length() - 1 && str.length() > 3 && C7416.m19937(2, str) != '/') {
            return new C14355("descriptorExact", str);
        }
        throw C3059.m9364("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m31927(JSONArray jSONArray, boolean z, boolean z2, boolean z3) throws C3059 {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = f39391;
        String str2 = "resource_table_value";
        String str3 = f39376;
        if (jSONArray == null || jSONArray.isNull()) {
            linkedHashSet.add("zip_entries");
            linkedHashSet.add("axml");
            if (z3) {
                linkedHashSet.add("resource_table_id");
                linkedHashSet.add("resource_table_name");
                linkedHashSet.add("resource_table_value");
            }
            if (z) {
                linkedHashSet.add("dex_class");
                linkedHashSet.add("dex_field");
                linkedHashSet.add("dex_method");
            }
            if (z2) {
                linkedHashSet.add("dex_string");
            }
        } else {
            if (!jSONArray.isArray()) {
                throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONArray, C0899.m3247(Arrays.asList(strArr)), m31913());
            }
            Iterator it = jSONArray.asArray().iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                JSONValue jSONValue = (JSONValue) it.next();
                if (!jSONValue.isString()) {
                    throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONValue, C0899.m3247(Arrays.asList(strArr)), m31913());
                }
                String strAsString = jSONValue.asString();
                if ("zip_entries".equals(strAsString) || "axml".equals(strAsString) || "resource_table_id".equals(strAsString) || "resource_table_name".equals(strAsString) || str2.equals(strAsString)) {
                    str = str2;
                } else {
                    str = str2;
                    if (!"resource_table_file_path".equals(strAsString) && !"dex_class".equals(strAsString) && !"dex_field".equals(strAsString) && !"dex_method".equals(strAsString) && !"dex_string".equals(strAsString) && !"smali".equals(strAsString) && !"native_symbol".equals(strAsString) && !"native_string".equals(strAsString)) {
                        throw C3059.m9364(C19462.m44858("Invalid scope: ", strAsString, ". ", str3), "scopes", JSON.value(strAsString), C0899.m3247(Arrays.asList(strArr)), m31913());
                    }
                }
                linkedHashSet.add(strAsString);
                it = it2;
                str2 = str;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 13; i++) {
            String str4 = strArr[i];
            if (linkedHashSet.contains(str4)) {
                arrayList.add(str4);
            }
        }
        if (arrayList.isEmpty()) {
            throw C3059.m9364(C20094.m46315("Invalid scopes. ", str3), "scopes", jSONArray, C0899.m3247(Arrays.asList(strArr)), m31913());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m31991(String str) {
        return "resource_table_id".equals(str) || "resource_table_name".equals(str) || "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31937(JSONObject jSONObject, String str, String... strArr) throws C3059 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw C3059.m9364(C4860.m14172("Invalid ", str, " argument"), str2, jSONObject.get(str2), C0899.m3247(listAsList), JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31938(JSONObject jSONObject, String... strArr) throws C3059 {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!jSONObject.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            throw m31950((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("Missing parameters: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i));
        }
        throw C3059.m9364(sb.toString(), "parameters", (JSONValue) null, C0899.m3247(arrayList), JSON.object());
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C15285 m31969(JSONObject jSONObject) throws C3059 {
        for (String str : jSONObject.names()) {
            if (!"workspaceId".equals(str) && !"editSessionId".equals(str) && !"nextCursor".equals(str) && !"limit".equals(str)) {
                throw C3059.m9364("Invalid continue continuation argument", str, jSONObject.get(str), JSON.array("workspaceId", "editSessionId", "nextCursor", "limit"), JSON.object().add("nextCursor", "<cursor>"));
            }
        }
        m31938(jSONObject, "workspaceId", "editSessionId", "nextCursor", "limit");
        return new C15285(m31967(jSONObject, "workspaceId"), m31999(jSONObject, "editSessionId"), m31967(jSONObject, "nextCursor"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31911(C2519 c2519, JSONObject jSONObject) throws C3059 {
        int iM31981 = m31981(jSONObject, "limit");
        m31935(iM31981, 1, c2519.f7995, "limit");
        return iM31981;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m31987(String str, String str2) {
        return C7416.m19939("workspaceId", "ab12cd34", "editSessionId", "").add("target", str).add("query", str2).add("queryType", "literal").add("caseSensitive", false).add("matchMode", "contains").add("prefix", "").add("includeMatchOffsets", false).add("limit", 50).add("snippetMaxChars", 240);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m31967(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962(str, jSONValue);
        }
        String strM31922 = m31922(jSONObject, str, (String) null);
        if (strM31922.isEmpty()) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(strM31922), (JSONArray) null, (JSONObject) null);
        }
        return strM31922;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m31999(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m31962(str, jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m31912(JSONObject jSONObject, String str, JSONObject jSONObject2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw C3059.m9364("Missing ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        if (!jSONValue.isArray()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m31922(JSONObject jSONObject, String str, String str2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return str2;
        }
        if (!jSONValue.isString()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31910(int i, JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return i;
        }
        if (!jSONValue.isNumber()) {
            throw m31930(str, jSONValue);
        }
        try {
            return C0899.m3253(jSONValue);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m31930(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m31986(JSONObject jSONObject, String str) throws C3059 {
        if (!jSONObject.contains(str)) {
            throw m31950(str);
        }
        return m31910(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m31981(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m31950(str);
        }
        if (jSONValue.isNull()) {
            throw m31930(str, jSONValue);
        }
        return m31910(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31942(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return false;
        }
        if (!jSONValue.isBoolean()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31965(JSONObject jSONObject, String str) throws C3059 {
        if (!jSONObject.contains(str)) {
            throw m31950(str);
        }
        return m31942(jSONObject, str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31979(JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m31950(str);
        }
        if (jSONValue.isNull()) {
            throw C3059.m9364("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return m31942(jSONObject, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31935(int i, int i2, int i3, String str) throws C3059 {
        if (i < i2 || i > i3) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31936(int i, int i2, int i3, String str, JSONObject jSONObject) throws C3059 {
        if (i < i2 || i > i3) {
            throw C3059.m9364("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), jSONObject);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31930(String str, JSONValue jSONValue) {
        return C3059.m9364(C4860.m14172("Invalid ", str, ": expected a 32-bit integer JSON number"), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m31950(String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m31962(String str, JSONValue jSONValue) {
        return C3059.m9364("Missing ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static C3059 m31949(JSONObject jSONObject, String str) {
        return C3059.m9364(C20094.m46315("Missing ", str), str, (JSONValue) null, (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m31913() {
        return JSON.object().add("scopes", JSON.array("dex_string", "smali"));
    }
}
