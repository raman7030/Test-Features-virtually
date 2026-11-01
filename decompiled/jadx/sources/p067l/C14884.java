package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
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
public final class C14884 {

    /* JADX INFO: renamed from: ֡ */
    public static final String f42438;

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f42440 = 0;

    /* JADX INFO: renamed from: ᩴ */
    public static final String[] f42453;

    /* JADX INFO: renamed from: ۘ */
    public static final String[] f42442 = {"workspaceId", "editSessionId", "target", "query", "queryType", "caseSensitive", "matchMode", "prefix", "includeMatchOffsets", "limit", "snippetMaxChars"};

    /* JADX INFO: renamed from: ᩵ */
    public static final String[] f42454 = {"overview", "files", "resource_table_names", "resource_table_values", "resource_table_file_paths", "dex_names", "dex_strings", "dex_string_members", "smali", "native_symbols", "native_strings"};

    /* JADX INFO: renamed from: ܺ */
    public static final String[] f42449 = {"workspaceId", "editSessionId", "reads", "maxValueChars", "maxValueXmlChars", "maxItemsPerValue", "resolveDepth"};

    /* JADX INFO: renamed from: ۖ */
    public static final String[] f42441 = {"locator", "variant"};

    /* JADX INFO: renamed from: ۚ */
    public static final String[] f42443 = {"workspaceId", "editSessionId", "locator", "methodResolution", "limit"};

    /* JADX INFO: renamed from: ֨ */
    public static final String[] f42439 = {"exact", "slot", "dispatch", "not_applicable"};

    /* JADX INFO: renamed from: ᩻ */
    public static final String[] f42456 = {"workspaceId", "editSessionId", "locator", "targetVersion", "edits"};

    /* JADX INFO: renamed from: ܽ */
    public static final String[] f42450 = {"workspaceId", "editSessionId", "locator"};

    /* JADX INFO: renamed from: ۢ */
    public static final String[] f42446 = {"workspaceId", "editSessionId", "locator", "patches"};

    /* JADX INFO: renamed from: ۡ */
    public static final String[] f42445 = {"byteOffset", "expectedHex", "replacementHex"};

    /* JADX INFO: renamed from: ܿ */
    public static final String[] f42451 = {"workspaceId", "editSessionId", "edits"};

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f42452 = {"workspaceId", "editSessionId", "runBuildChecks"};

    /* JADX INFO: renamed from: ۜ */
    public static final String[] f42444 = {"mode", "matchText", "writeText"};

    /* JADX INFO: renamed from: ܳ */
    public static final String[] f42448 = {"locator", "variant", "targetVersion", "valueXml"};

    /* JADX INFO: renamed from: ۧ */
    public static final String[] f42447 = {"workspaceId", "editSessionId", "outputName", "overwrite", "sign"};

    /* JADX INFO: renamed from: ᩷ */
    public static final String[] f42455 = {"workspaceId", "editSessionId", "outputName", "overwrite"};

    /* JADX INFO: renamed from: ֫ */
    public static int m34005(char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m34015(int i) {
        return C19768.m44906(i, "edits[", "]");
    }

    static {
        String[] strArr = {"zip_entries", "axml", "resource_table_id", "resource_table_name", "resource_table_value", "resource_table_file_path", "dex_class", "dex_field", "dex_method", "dex_string", "smali", "native_symbol", "native_string"};
        f42453 = strArr;
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
        f42438 = sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34011(String str, int i, String str2, String str3) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("nextCursor", str3).add("limit", i);
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONValue m34069(String str, String str2) {
        if (str2 == null) {
            return JSON.NULL;
        }
        return JSON.value(m34021(str, "zip_entry".equals(str) ? str2 : null, (String) null, (String) null, (String) null, "resource".equals(str) ? str2 : null));
    }

    /* JADX INFO: renamed from: ۖ */
    public static C24531 m34041(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "open", MotionUtils.EASING_TYPE_PATH, "temporary");
        String strM34063 = m34063(jSONObject, MotionUtils.EASING_TYPE_PATH);
        JSONValue jSONValue = jSONObject.get("temporary");
        if (jSONValue != null && jSONValue.isNull()) {
            throw C5276.m11406("Invalid temporary", "temporary", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        boolean zM34038 = m34038(jSONObject, "temporary");
        if ("mt://current-apk".equals(strM34063)) {
            return new C24531(null, null, !zM34038, zM34038);
        }
        if (strM34063.startsWith("mt://workspace/")) {
            String strSubstring = strM34063.substring(15);
            if (strSubstring.isEmpty()) {
                throw C5276.m11406("Invalid path", MotionUtils.EASING_TYPE_PATH, JSON.value(strM34063), JSON.array(), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            if (zM34038) {
                throw C5276.m11406("temporary is invalid when reopening a workspace", "temporary", JSON.value(true), JSON.array(false), JSON.object().add(MotionUtils.EASING_TYPE_PATH, "mt://workspace/ab12cd34").add("temporary", false));
            }
            return new C24531(null, strSubstring, true, false);
        }
        C9385 c9385M51035 = C23499.m52231().m51035();
        String strM31903 = C14059.m31903(c9385M51035, strM34063, MotionUtils.EASING_TYPE_PATH, false);
        c9385M51035.m21856(strM31903);
        return new C24531(strM31903, null, !zM34038, zM34038);
    }

    /* JADX INFO: renamed from: ۚ */
    public static String m34044(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "read_signature", "workspaceId");
        m34034(jSONObject, "workspaceId");
        return m34063(jSONObject, "workspaceId");
    }

    /* JADX INFO: renamed from: ܿ */
    public static C23861 m34080(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "close", "workspaceId");
        m34034(jSONObject, "workspaceId");
        return new C23861(m34063(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ܺ */
    public static C13803 m34068(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "list", "workspaceId", "editSessionId", "view", "prefix", "limit");
        m34034(jSONObject, "workspaceId", "editSessionId", "view");
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        String strM34064 = m34063(jSONObject, "view");
        if ("zip_entries".equals(strM34064) || "dex_classes".equals(strM34064) || "resource_table".equals(strM34064)) {
            String strM34018 = m34018(jSONObject, "prefix", "");
            int iM34006 = m34006(200, jSONObject, "limit");
            m34031(iM34006, 1, 1000, "limit");
            return new C13803(strM34063, strM34095, strM34064, strM34018, null, iM34006, 0, 0, 200);
        }
        throw C5276.m11406("Unsupported view", "view", JSON.value(strM34064), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ۘ */
    public static C13803 m34043(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "mt_apk_dex_read_class_outline", "workspaceId", "editSessionId", "locator", "limit");
        m34034(jSONObject, "workspaceId", "editSessionId", "locator", "limit");
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        String strM34067 = m34067(m34071(jSONObject));
        int iM34077 = m34077(jSONObject, "limit");
        m34031(iM34077, 1, 1000, "limit");
        return new C13803(strM34063, strM34095, "dex_class_outline", "", strM34067, iM34077, 0, 0, iM34077);
    }

    /* JADX INFO: renamed from: ֨ */
    public static C3942 m34004(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "read_text", "workspaceId", "editSessionId", "locator", "limit", "maxChars", "startLine", "startColumn");
        m34034(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        C19365 c19365M34091 = m34091(m34071(jSONObject));
        String str = c19365M34091.f57813;
        if (!"entry_text".equals(str) && !"axml".equals(str) && !"dex_class_smali".equals(str) && !"dex_method_smali".equals(str) && !"dex_field_smali".equals(str)) {
            throw C5276.m11406("mt_apk_read_text accepts only text locators", "locator", JSON.value(m34064(m34022(c19365M34091))), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field"), JSON.object().add("locator", m34021("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM34053 = m34053(49152, jSONObject, "maxChars");
        m34031(iM34053, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM34054 = m34053(500, jSONObject, "limit");
        m34031(iM34054, 1, 2000, "limit");
        int iM34055 = m34053(0, jSONObject, "startLine");
        m34031(iM34055, 0, Integer.MAX_VALUE, "startLine");
        int iM34056 = m34053(0, jSONObject, "startColumn");
        m34031(iM34056, 0, Integer.MAX_VALUE, "startColumn");
        return new C3942(strM34063, strM34095, c19365M34091, TextBundle.TEXT_ENTRY, iM34055, iM34056, iM34054, iM34053, 0, 256, "startColumn", JSON.value(iM34056));
    }

    /* JADX INFO: renamed from: ᩵ */
    public static C3942 m34090(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "read_bytes", "workspaceId", "editSessionId", "locator", "byteOffset", "maxBytes");
        m34034(jSONObject, "workspaceId", "editSessionId", "locator");
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        C19365 c19365M34091 = m34091(m34071(jSONObject));
        if (!"entry_text".equals(c19365M34091.f57813)) {
            throw C5276.m11406("mt_apk_read_bytes accepts only zip_entry locators", "locator", JSON.value(m34064(m34022(c19365M34091))), JSON.array("zip_entry"), JSON.object().add("locator", m34021("zip_entry", "classes.dex", (String) null, (String) null, (String) null, (String) null)));
        }
        int iM34053 = m34053(0, jSONObject, "byteOffset");
        m34031(iM34053, 0, Integer.MAX_VALUE, "byteOffset");
        int iM34054 = m34053(256, jSONObject, "maxBytes");
        m34031(iM34054, 1, 65536, "maxBytes");
        return new C3942(strM34063, strM34095, c19365M34091, "hex", 0, 0, 500, 49152, iM34053, iM34054, null, null);
    }

    /* JADX INFO: renamed from: ֡ */
    public static C18023 m34003(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42449;
        m34033(jSONObject, "resource_read", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        String str = "locator";
        JSONObject jSONObjectAdd = C9417.m21913("workspaceId", strM34063, "editSessionId", strM34095).add("reads", JSON.array().add(JSON.object().add("locator", m34021("resource", (String) null, (String) null, (String) null, (String) null, "0x7F010000")).add("variant", "default"))).add("maxValueChars", 4096).add("maxValueXmlChars", 32768).add("maxItemsPerValue", 50).add("resolveDepth", 0);
        JSONArray jSONArrayM34008 = m34008(jSONObject, "reads", jSONObjectAdd);
        if (jSONArrayM34008.size() == 0 || jSONArrayM34008.size() > 200) {
            throw C5276.m11406("Invalid reads", "reads", JSON.value(jSONArrayM34008.size()), JSON.array(1, 200), jSONObjectAdd);
        }
        ArrayList arrayList = new ArrayList(jSONArrayM34008.size());
        int i = 0;
        while (i < jSONArrayM34008.size()) {
            JSONValue jSONValue = jSONArrayM34008.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C5276.m11406("Invalid reads item", C19768.m44906(i, "reads[", "]"), jSONValue, JSON.array(), jSONObjectAdd);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f42441);
            for (String str2 : jSONObjectAsObject.names()) {
                JSONArray jSONArray = jSONArrayM34008;
                if (!listAsList.contains(str2)) {
                    throw C5276.m11406("Invalid resource_read item argument", m34070(i, str2), jSONObjectAsObject.get(str2), C3223.m5566(listAsList), jSONObjectAdd);
                }
                jSONArrayM34008 = jSONArray;
            }
            JSONArray jSONArray2 = jSONArrayM34008;
            String strM34070 = m34070(i, str);
            JSONValue jSONValue2 = jSONObjectAsObject.get(str);
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m34045(jSONObjectAdd, strM34070);
            }
            C23602 c23602M34029 = m34029(jSONObjectAdd, jSONValue2, strM34070);
            String str3 = str;
            String str4 = c23602M34029.f75125;
            String str5 = strM34095;
            if (!"resource".equals(str4)) {
                throw C5276.m11406("mt_apk_resource_read accepts only resource locators", strM34070, JSON.value(str4), JSON.array("resource"), jSONObjectAdd);
            }
            String strM25264 = C10962.m25264(c23602M34029.f75126, strM34070);
            String strM34071 = m34070(i, "variant");
            JSONValue jSONValue3 = jSONObjectAsObject.get("variant");
            if (jSONValue3 == null || jSONValue3.isNull()) {
                throw m34045(jSONObjectAdd, strM34071);
            }
            if (!jSONValue3.isString()) {
                throw C5276.m11406(C21466.m48631("Invalid ", strM34071), strM34071, jSONValue3, (JSONArray) null, jSONObjectAdd);
            }
            String strAsString = jSONValue3.asString();
            if (strAsString.isEmpty()) {
                throw C5276.m11406(C21466.m48631("Invalid ", strM34071), strM34071, JSON.value(strAsString), (JSONArray) null, jSONObjectAdd);
            }
            if ("*".equals(strAsString)) {
                throw C5276.m11406("Invalid reads item variant", m34070(i, "variant"), JSON.value(strAsString), JSON.array("default"), jSONObjectAdd);
            }
            arrayList.add(new C12660(strM25264, strAsString));
            i++;
            str = str3;
            strM34095 = str5;
            jSONArrayM34008 = jSONArray2;
        }
        int iM34077 = m34077(jSONObject, "maxValueChars");
        m34031(iM34077, 1, 32768, "maxValueChars");
        int iM34078 = m34077(jSONObject, "maxValueXmlChars");
        m34031(iM34078, 1, 1048576, "maxValueXmlChars");
        int iM34079 = m34077(jSONObject, "maxItemsPerValue");
        m34031(iM34079, 0, 2000, "maxItemsPerValue");
        int iM340710 = m34077(jSONObject, "resolveDepth");
        m34031(iM340710, 0, 1, "resolveDepth");
        return new C18023(strM34063, strM34095, arrayList, iM34077, iM34078, iM34079, iM340710);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m34070(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("reads[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24729 m34030(C21591 c21591, C16405 c16405) throws C5276 {
        String str;
        ArrayList arrayListM34024;
        String str2 = c21591.f68075;
        String str3 = c16405.f48207;
        String str4 = c21591.f68079;
        String str5 = c21591.f68077;
        String str6 = c21591.f68073;
        if (!str3.equals(str4)) {
            throw C5276.m11406("Invalid workspaceId", "workspaceId", JSON.value(str4), (JSONArray) null, (JSONObject) null);
        }
        if ("overview".equals(str6)) {
            str = str4;
            arrayListM34024 = m34023((JSONArray) null, c16405.f48204, c16405.f48205, c16405.f48206);
        } else {
            str = str4;
            if ("files".equals(str6)) {
                arrayListM34024 = m34024("zip_entries", "axml");
            } else if ("resource_table_names".equals(str6)) {
                arrayListM34024 = m34024("resource_table_id", "resource_table_name");
            } else if ("resource_table_values".equals(str6)) {
                arrayListM34024 = m34024("resource_table_value");
            } else if ("resource_table_file_paths".equals(str6)) {
                arrayListM34024 = m34024("resource_table_file_path");
            } else if ("dex_names".equals(str6)) {
                arrayListM34024 = m34024("dex_class", "dex_field", "dex_method");
            } else if ("dex_strings".equals(str6) || "dex_string_members".equals(str6)) {
                arrayListM34024 = m34024("dex_string");
            } else if ("smali".equals(str6)) {
                arrayListM34024 = m34024("smali");
            } else if ("native_symbols".equals(str6)) {
                arrayListM34024 = m34024("native_symbol");
            } else if ("native_strings".equals(str6)) {
                arrayListM34024 = m34024("native_string");
            } else {
                throw C5276.m11406("Invalid target", "target", JSON.value(str6), C3223.m5566(Arrays.asList(f42454)), m34083("overview", "AndroidManifest"));
            }
        }
        ArrayList arrayList = arrayListM34024;
        String str7 = c21591.f68072;
        String str8 = c21591.f68073;
        int i = c21591.f68076;
        int i2 = c21591.f68080;
        return new C24729(str, str7, str8, str2, arrayList, i, i2 > 0, i2, !"overview".equals(str8), c21591.f68074, (("files".equals(str6) || "native_symbols".equals(str6) || "native_strings".equals(str6)) && !str5.isEmpty()) ? str5 : null, ("resource_table_names".equals(str6) || "resource_table_values".equals(str6) || "resource_table_file_paths".equals(str6)) ? m34049(str5) : null, (!m34062(str6) || str5.isEmpty()) ? C16011.f46375 : m34094(m34083(str6, str2).put("prefix", "com.example."), str5), "dex_string_members".equals(str6) ? "member" : Name.LABEL, c21591.f68078, new C19659(0, 0, 0, -1, 0));
    }

    /* JADX INFO: renamed from: ܶ */
    public static C11319 m34066(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42443;
        m34033(jSONObject, "dex_xref", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        C5497 c5497M34084 = m34084(m34071(jSONObject), jSONObject.get("locator"));
        String strM34064 = m34063(jSONObject, "methodResolution");
        m34074(strM34064, jSONObject.get("methodResolution"));
        m34037(c5497M34084, strM34064, jSONObject.get("methodResolution"));
        int iM34077 = m34077(jSONObject, "limit");
        m34031(iM34077, 1, 200, "limit");
        return new C11319(strM34063, strM34095, c5497M34084.f13139, c5497M34084.f13138, c5497M34084.f13140, strM34064, iM34077, new C4021(0, 0, 0));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C5756 m34093(JSONObject jSONObject) throws C5276 {
        m34033(jSONObject, "mt_apk_session_create", "workspaceId");
        m34034(jSONObject, "workspaceId");
        return new C5756(m34063(jSONObject, "workspaceId"));
    }

    /* JADX INFO: renamed from: ᩻ */
    public static C21850 m34097(JSONObject jSONObject) throws C5276 {
        C22932 c22932;
        String[] strArr = f42450;
        m34033(jSONObject, "mt_apk_delete_target", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34064 = m34063(jSONObject, "editSessionId");
        if (strM34064.isEmpty()) {
            throw C5276.m11406("mt_apk_delete_target requires a non-empty editSessionId", "editSessionId", JSON.value(strM34064), JSON.array("edit session id returned by mt_apk_session_create"), m34012(strM34063, "edit1234", "dex_class"));
        }
        C23602 c23602M34029 = m34029(m34012("<workspaceId>", "<editSessionId>", "smali_class"), JSON.value(m34071(jSONObject)), "locator");
        String str = c23602M34029.f75126;
        String str2 = c23602M34029.f75125;
        if ("dex_class".equals(str2)) {
            c22932 = new C22932("smali_class", m34092(str));
        } else if ("dex_method".equals(str2)) {
            C6838 c6838M34059 = m34059(str, AbstractC0213e.f995s, true);
            c22932 = new C22932("smali_method", m34078(c6838M34059.f17762, c6838M34059.f17763));
        } else {
            if (!"axml".equals(str2) && !"zip_entry".equals(str2)) {
                throw C5276.m11406("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), m34012("<workspaceId>", "<editSessionId>", "smali_class"));
            }
            if (str == null || !str.endsWith("/")) {
                m34052(str);
            } else {
                m34052(C17073.m38720(1, 0, str));
            }
            c22932 = new C22932(str2, str);
        }
        return new C21850(strM34063, strM34064, c22932.f72166, c22932.f72165);
    }

    /* JADX INFO: renamed from: ᩴ */
    public static C9779 m34089(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42446;
        m34033(jSONObject, "patch_bytes", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34064 = m34063(jSONObject, "editSessionId");
        if (strM34064.isEmpty()) {
            throw C5276.m11406("mt_apk_patch_bytes requires a non-empty editSessionId", "editSessionId", JSON.value(strM34064), JSON.array("edit session id returned by mt_apk_session_create"), m34054(strM34063, "edit1234", "assets/data.bin"));
        }
        C23602 c23602M34029 = m34029(m34054(strM34063, strM34064, "assets/data.bin"), JSON.value(m34071(jSONObject)), "locator");
        String str = c23602M34029.f75125;
        if (!"zip_entry".equals(str)) {
            throw C5276.m11406("mt_apk_patch_bytes accepts only zip_entry locators", "locator", JSON.value(str), JSON.array("zip_entry"), m34054(strM34063, strM34064, "assets/data.bin"));
        }
        String str2 = c23602M34029.f75126;
        m34052(str2);
        JSONArray jSONArrayM34008 = m34008(jSONObject, "patches", m34054(strM34063, strM34064, str2));
        JSONObject jSONObjectM34054 = m34054(strM34063, strM34064, str2);
        if (jSONArrayM34008.size() == 0) {
            throw C5276.m11406("patches must contain at least one item", "patches", jSONArrayM34008, JSON.array("1..200"), jSONObjectM34054);
        }
        if (jSONArrayM34008.size() > 200) {
            throw C5276.m11406("patches must contain at most 200 items", "patches", JSON.value(jSONArrayM34008.size()), JSON.array("1..200"), jSONObjectM34054);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = 0;
        while (i < jSONArrayM34008.size()) {
            JSONValue jSONValue = jSONArrayM34008.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C5276.m11406("Invalid patches item", C19768.m44906(i, "patches[", "]"), jSONValue, JSON.array(), jSONObjectM34054);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f42445);
            for (String str3 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str3)) {
                    throw C5276.m11406("Invalid patch item argument", m34056(i, str3), jSONObjectAsObject.get(str3), C3223.m5566(listAsList), jSONObjectM34054);
                }
            }
            String strM34056 = m34056(i, "byteOffset");
            JSONValue jSONValue2 = jSONObjectAsObject.get("byteOffset");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                throw m34045(jSONObjectM34054, strM34056);
            }
            if (!jSONValue2.isNumber()) {
                throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, jSONValue2, (JSONArray) null, jSONObjectM34054);
            }
            try {
                int iM5572 = C3223.m5572(jSONValue2);
                if (iM5572 < 0) {
                    throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, jSONValue2, JSON.array(0, Integer.MAX_VALUE), jSONObjectM34054);
                }
                byte[] bArrM34039 = m34039(jSONObjectAsObject, i, "expectedHex", jSONObjectM34054);
                byte[] bArrM340310 = m34039(jSONObjectAsObject, i, "replacementHex", jSONObjectM34054);
                JSONArray jSONArray = jSONArrayM34008;
                if (bArrM34039.length != bArrM340310.length) {
                    throw C5276.m11406("expectedHex and replacementHex must contain the same byte count", m34056(i, "replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array("same byte count as expectedHex"), jSONObjectM34054);
                }
                if (bArrM34039.length > 4096) {
                    throw C5276.m11406("Patch item is too large", m34056(i, "replacementHex"), JSON.value(bArrM34039.length), JSON.array("1..4096"), jSONObjectM34054);
                }
                length += bArrM34039.length;
                if (length > 65536) {
                    throw C5276.m11406("Patch byte budget exceeded", "patches", JSON.value(length), JSON.array("1..65536"), jSONObjectM34054);
                }
                arrayList.add(new C15813(iM5572, bArrM34039, bArrM340310));
                i++;
                jSONArrayM34008 = jSONArray;
            } catch (ArithmeticException | NumberFormatException unused) {
                throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, jSONValue2, (JSONArray) null, jSONObjectM34054);
            }
        }
        return new C9779(strM34063, strM34064, str2, arrayList);
    }

    /* JADX INFO: renamed from: ۢ */
    public static C14473 m34051(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42451;
        m34033(jSONObject, "mt_apk_resource_edit", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34064 = m34063(jSONObject, "editSessionId");
        String str = "default";
        JSONArray jSONArrayM34008 = m34008(jSONObject, "edits", m34013(strM34063, strM34064, "0x7f010000", "default"));
        JSONObject jSONObjectM34013 = m34013(strM34063, strM34064, "0x7f010000", "default");
        if (jSONArrayM34008.size() == 0) {
            C5276 c5276M11406 = C5276.m11406("edits must contain at least one item", "edits", jSONArrayM34008, JSON.array("1..200"), jSONObjectM34013);
            m34035(c5276M11406, strM34063, strM34064);
            throw c5276M11406;
        }
        if (jSONArrayM34008.size() > 200) {
            C5276 c5276M11407 = C5276.m11406("edits must contain at most 200 items", "edits", JSON.value(jSONArrayM34008.size()), JSON.array("1..200"), jSONObjectM34013);
            m34035(c5276M11407, strM34063, strM34064);
            throw c5276M11407;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        while (i < jSONArrayM34008.size()) {
            JSONValue jSONValue = jSONArrayM34008.get(i);
            if (jSONValue == null || !jSONValue.isObject()) {
                C5276 c5276M11408 = C5276.m11406("Invalid edits item", m34015(i), jSONValue, JSON.array(), jSONObjectM34013);
                m34036(c5276M11408, strM34063, strM34064, i, (String) null, (String) null);
                throw c5276M11408;
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            List listAsList = Arrays.asList(f42448);
            for (String str2 : jSONObjectAsObject.names()) {
                if (!listAsList.contains(str2)) {
                    C5276 c5276M11409 = C5276.m11406("Invalid edit resource item argument", m34016(i, str2), jSONObjectAsObject.get(str2), C3223.m5566(listAsList), jSONObjectM34013);
                    m34036(c5276M11409, strM34063, strM34064, i, (String) null, (String) null);
                    throw c5276M11409;
                }
            }
            JSONValue jSONValue2 = jSONObjectAsObject.get("locator");
            String strM34016 = m34016(i, "locator");
            if (jSONValue2 == null || jSONValue2.isNull()) {
                C5276 c5276M34045 = m34045(jSONObjectM34013, strM34016);
                m34036(c5276M34045, strM34063, strM34064, i, (String) null, (String) null);
                throw c5276M34045;
            }
            try {
                C23602 c23602M34029 = m34029(jSONObjectM34013, jSONValue2, strM34016);
                String str3 = c23602M34029.f75125;
                if (!"resource".equals(str3)) {
                    C5276 c5276M114010 = C5276.m11406("mt_apk_resource_edit accepts only resource locators", strM34016, JSON.value(str3), JSON.array("resource"), jSONObjectM34013);
                    m34036(c5276M114010, strM34063, strM34064, i, (String) null, (String) null);
                    throw c5276M114010;
                }
                try {
                    String strM25264 = C10962.m25264(c23602M34029.f75126, strM34016);
                    JSONObject jSONObjectM34014 = m34013(strM34063, strM34064, strM25264, str);
                    JSONArray jSONArray = jSONArrayM34008;
                    String strM34019 = m34019(jSONObjectAsObject, strM34063, strM34064, i, strM25264, null, "variant", jSONObjectM34014);
                    if ("*".equals(strM34019)) {
                        C5276 c5276M114011 = C5276.m11406("Invalid variant", m34016(i, "variant"), JSON.value(strM34019), JSON.array(str), jSONObjectM34014);
                        m34036(c5276M114011, strM34063, strM34064, i, strM25264, strM34019);
                        throw c5276M114011;
                    }
                    int i2 = i;
                    JSONObject jSONObject2 = jSONObjectM34013;
                    String strM340110 = m34019(jSONObjectAsObject, strM34063, strM34064, i2, strM25264, strM34019, "targetVersion", m34013(strM34063, strM34064, strM25264, strM34019));
                    String str4 = str;
                    String strM340111 = m34019(jSONObjectAsObject, strM34063, strM34064, i2, strM25264, strM34019, "valueXml", m34013(strM34063, strM34064, strM25264, strM34019));
                    if (strM340111.trim().isEmpty()) {
                        C5276 c5276M114012 = C5276.m11406("valueXml is required", m34016(i, "valueXml"), JSON.value(strM340111), JSON.array(), m34013(strM34063, strM34064, strM25264, strM34019));
                        m34036(c5276M114012, strM34063, strM34064, i, strM25264, strM34019);
                        throw c5276M114012;
                    }
                    if (!linkedHashSet.add(strM25264 + '\n' + strM34019)) {
                        C5276 c5276M114013 = C5276.m11406("Duplicate resource edit target", m34016(i, "locator"), JSON.value(m34021("resource", (String) null, (String) null, (String) null, (String) null, strM25264)), JSON.array(), m34013(strM34063, strM34064, strM25264, strM34019));
                        m34036(c5276M114013, strM34063, strM34064, i, strM25264, strM34019);
                        throw c5276M114013;
                    }
                    arrayList.add(new C15143(strM25264, strM34019, strM340110, strM340111));
                    i++;
                    str = str4;
                    jSONArrayM34008 = jSONArray;
                    jSONObjectM34013 = jSONObject2;
                } catch (C5276 e) {
                    m34036(e, strM34063, strM34064, i, (String) null, (String) null);
                    throw e;
                }
            } catch (C5276 e2) {
                m34036(e2, strM34063, strM34064, i, (String) null, (String) null);
                throw e2;
            }
        }
        return new C14473(strM34063, strM34064, arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34019(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, JSONObject jSONObject2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str5);
        String strM34016 = m34016(i, str5);
        if (jSONValue == null || jSONValue.isNull()) {
            C5276 c5276M34045 = m34045(jSONObject2, strM34016);
            m34036(c5276M34045, str, str2, i, str3, str4);
            throw c5276M34045;
        }
        if (!jSONValue.isString()) {
            C5276 c5276M11406 = C5276.m11406(C21466.m48631("Invalid ", strM34016), strM34016, jSONValue, (JSONArray) null, jSONObject2);
            m34036(c5276M11406, str, str2, i, str3, str4);
            throw c5276M11406;
        }
        String strAsString = jSONValue.asString();
        if (!strAsString.isEmpty()) {
            return strAsString;
        }
        C5276 c5276M11407 = C5276.m11406(C21466.m48631("Invalid ", strM34016), strM34016, JSON.value(strAsString), (JSONArray) null, jSONObject2);
        m34036(c5276M11407, str, str2, i, str3, str4);
        throw c5276M11407;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34036(C5276 c5276, String str, String str2, int i, String str3, String str4) {
        JSONValue jSONValueValue;
        JSONObject jSONObjectPut = c5276.f12412.put("workspaceId", str).put("editSessionId", str2).put("failedEditIndex", i);
        if (str3 == null) {
            jSONValueValue = JSON.NULL;
        } else {
            jSONValueValue = JSON.value(m34021("resource", (String) null, (String) null, (String) null, (String) null, str3));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("locator", jSONValueValue).put("variant", str4 == null ? JSON.NULL : JSON.value(str4));
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut2.put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34035(C5276 c5276, String str, String str2) {
        JSONObject jSONObjectPut = c5276.f12412.put("workspaceId", str).put("editSessionId", str2);
        JSONValue jSONValue = JSON.NULL;
        jSONObjectPut.put("failedEditIndex", jSONValue).put("locator", jSONValue).put("variant", jSONValue).put("currentTargetVersion", jSONValue).put("resourceNamePolicy", jSONValue);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34017(JSONObject jSONObject, int i, String str, boolean z, JSONObject jSONObject2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM34016 = m34016(i, str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34045(jSONObject2, strM34016);
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406(C21466.m48631("Invalid ", strM34016), strM34016, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (z || !strAsString.isEmpty()) {
            return strAsString;
        }
        throw C5276.m11406(C21466.m48631("Invalid ", strM34016), strM34016, JSON.value(strAsString), (JSONArray) null, jSONObject2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m34076(String str) {
        return "write_target".equals(str) || "replace_match".equals(str) || "insert_before_match".equals(str) || "insert_after_match".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34016(int i, String str) {
        return C24420.m53894(new StringBuilder(), m34015(i), ".", str);
    }

    /* JADX INFO: renamed from: ۡ */
    public static C8438 m34050(JSONObject jSONObject) throws C5276 {
        C22932 c22932;
        String[] strArr = f42456;
        List listAsList = Arrays.asList(strArr);
        for (String str : jSONObject.names()) {
            if (!listAsList.contains(str)) {
                throw C5276.m11406("Invalid edit_text argument", str, jSONObject.get(str), C3223.m5566(listAsList), m34010(jSONObject));
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
            JSONObject jSONObjectM34010 = m34010(jSONObject);
            if (arrayList.size() == 1) {
                throw m34045(jSONObjectM34010, (String) arrayList.get(0));
            }
            StringBuilder sb = new StringBuilder("Missing parameters: ");
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append((String) arrayList.get(i2));
            }
            throw C5276.m11406(sb.toString(), "parameters", (JSONValue) null, C3223.m5566(arrayList), jSONObjectM34010);
        }
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34064 = m34063(jSONObject, "editSessionId");
        C23602 c23602M34029 = m34029(JSON.object().add("locator", m34021("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)), JSON.value(m34071(jSONObject)), "locator");
        String str3 = c23602M34029.f75125;
        String str4 = c23602M34029.f75126;
        if ("dex_class".equals(str3)) {
            c22932 = new C22932("smali_class", m34092(str4));
        } else if ("dex_method".equals(str3)) {
            C6838 c6838M34059 = m34059(str4, AbstractC0213e.f995s, true);
            c22932 = new C22932("smali_method", m34078(c6838M34059.f17762, c6838M34059.f17763));
        } else {
            if (!"axml".equals(str3) && !"zip_entry".equals(str3)) {
                throw C5276.m11406("Unsupported locator", "locator", JSON.value(str3), JSON.array("dex_class", "dex_method", "axml", "zip_entry"), JSON.object().add("locator", m34021("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
            }
            m34052(str4);
            c22932 = new C22932(str3, str4);
        }
        String strM34095 = m34095(jSONObject, "targetVersion");
        boolean zIsEmpty = strM34095.isEmpty();
        String str5 = c22932.f72166;
        String str6 = c22932.f72165;
        if (zIsEmpty) {
            throw C5276.m11406("targetVersion is required", "targetVersion", JSON.value(strM34095), JSON.array(), m34014(strM34063, strM34064, str5, m34057(jSONObject), str6));
        }
        JSONArray jSONArrayM34008 = m34008(jSONObject, "edits", m34014(strM34063, strM34064, str5, "replace_match", str6));
        if (jSONArrayM34008.size() == 0) {
            throw C5276.m11406("edits must contain at least one item", "edits", jSONArrayM34008, JSON.array(), m34014(strM34063, strM34064, str5, "replace_match", str6));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = -1;
        int i4 = 0;
        while (i4 < jSONArrayM34008.size()) {
            JSONObject jSONObjectM34014 = m34014(strM34063, strM34064, str5, "replace_match", str6);
            JSONValue jSONValue = jSONArrayM34008.get(i4);
            if (jSONValue == null || !jSONValue.isObject()) {
                throw C5276.m11406("Invalid edits item", m34015(i4), jSONValue, JSON.array(), jSONObjectM34014);
            }
            JSONObject jSONObjectAsObject = jSONValue.asObject();
            JSONArray jSONArray = jSONArrayM34008;
            List listAsList2 = Arrays.asList(f42444);
            for (String str7 : jSONObjectAsObject.names()) {
                String str8 = strM34095;
                if (!listAsList2.contains(str7)) {
                    throw C5276.m11406("Invalid edit item argument", m34016(i4, str7), jSONObjectAsObject.get(str7), C3223.m5566(listAsList2), jSONObjectM34014);
                }
                strM34095 = str8;
            }
            String str9 = strM34095;
            String strM34017 = m34017(jSONObjectAsObject, i4, "mode", false, jSONObjectM34014);
            if (m34076(strM34017)) {
                jSONObjectM34014 = m34014(strM34063, strM34064, str5, strM34017, str6);
            }
            int i5 = i3;
            ArrayList arrayList3 = arrayList2;
            String strM34018 = m34017(jSONObjectAsObject, i4, "matchText", true, jSONObjectM34014);
            String strM34019 = m34017(jSONObjectAsObject, i4, "writeText", true, jSONObjectM34014);
            if ("write_target".equals(strM34017)) {
                if (!strM34018.isEmpty()) {
                    throw C5276.m11406("write_target requires empty matchText", m34016(i4, "matchText"), JSON.value(strM34018), JSON.array(""), m34014(strM34063, strM34064, str5, strM34017, str6));
                }
                if (strM34019.isEmpty() && !"zip_entry".equals(str5)) {
                    throw C5276.m11406("write_target requires non-empty writeText", m34016(i4, "writeText"), JSON.value(strM34019), JSON.array(), m34014(strM34063, strM34064, str5, strM34017, str6));
                }
            } else if (!"replace_match".equals(strM34017)) {
                if (!"insert_before_match".equals(strM34017) && !"insert_after_match".equals(strM34017)) {
                    throw C5276.m11406("Invalid mode", m34016(i4, "mode"), JSON.value(strM34017), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), m34014(strM34063, strM34064, str5, "replace_match", str6));
                }
                if (strM34018.isEmpty()) {
                    throw C5276.m11406(C17588.m40053(strM34017, " requires non-empty matchText"), m34016(i4, "matchText"), JSON.value(strM34018), JSON.array(), m34014(strM34063, strM34064, str5, strM34017, str6));
                }
                if (strM34019.isEmpty()) {
                    throw C5276.m11406(C17588.m40053(strM34017, " requires non-empty writeText"), m34016(i4, "writeText"), JSON.value(strM34019), JSON.array(), m34014(strM34063, strM34064, str5, strM34017, str6));
                }
            } else if (strM34018.isEmpty()) {
                throw C5276.m11406("replace_match requires non-empty matchText", m34016(i4, "matchText"), JSON.value(strM34018), JSON.array(), m34014(strM34063, strM34064, str5, strM34017, str6));
            }
            if ("write_target".equals(strM34017)) {
                i5 = i4;
            }
            C12462 c12462 = new C12462(strM34017, strM34018, strM34019);
            arrayList2 = arrayList3;
            arrayList2.add(c12462);
            i4++;
            jSONArrayM34008 = jSONArray;
            i3 = i5;
            strM34095 = str9;
        }
        int i6 = i3;
        String str10 = strM34095;
        if (arrayList2.size() <= 1 || i6 < 0) {
            return new C8438(strM34063, strM34064, str5, str6, str10, arrayList2);
        }
        throw C5276.m11406("write_target must be the only edit", m34016(i6, "mode"), JSON.value(((C12462) arrayList2.get(i6)).f34871), JSON.array("replace_match", "insert_before_match", "insert_after_match"), m34014(strM34063, strM34064, str5, "replace_match", str6));
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m34039(JSONObject jSONObject, int i, String str, JSONObject jSONObject2) throws C5276 {
        String strM34056 = m34056(i, str);
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34045(jSONObject2, strM34056);
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, jSONValue, (JSONArray) null, jSONObject2);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty() || (strAsString.length() & 1) != 0) {
            throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, JSON.value(strAsString), JSON.array("non-empty even-length hex"), jSONObject2);
        }
        int length = strAsString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iM34005 = m34005(strAsString.charAt(i3));
            int iM34006 = m34005(strAsString.charAt(i3 + 1));
            if (iM34005 < 0 || iM34006 < 0) {
                throw C5276.m11406(C21466.m48631("Invalid ", strM34056), strM34056, JSON.value(strAsString), JSON.array("hex characters 0-9, a-f, A-F"), jSONObject2);
            }
            bArr[i2] = (byte) (iM34006 | (iM34005 << 4));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m34056(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("patches[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34010(JSONObject jSONObject) {
        C22932 c22932;
        C22932 c22933;
        JSONValue jSONValue = jSONObject.get("workspaceId");
        String strAsString = (jSONValue == null || !jSONValue.isString() || jSONValue.asString().isEmpty()) ? "<workspaceId>" : jSONValue.asString();
        JSONValue jSONValue2 = jSONObject.get("editSessionId");
        String strAsString2 = (jSONValue2 == null || !jSONValue2.isString() || jSONValue2.asString().isEmpty()) ? "<editSessionId>" : jSONValue2.asString();
        JSONValue jSONValue3 = jSONObject.get("locator");
        String strM39512 = "Lcom/example/EditTarget;";
        if (jSONValue3 == null || !jSONValue3.isString()) {
            c22932 = new C22932("smali_class", "Lcom/example/EditTarget;");
        } else {
            String strAsString3 = jSONValue3.asString();
            String strM34064 = m34064(strAsString3);
            String strM34096 = m34096(strAsString3);
            if (strM34064 == null || strM34096 == null) {
                c22932 = new C22932("smali_class", "Lcom/example/EditTarget;");
            } else if ("dex_method".equals(strM34064)) {
                if (strM34096.isEmpty()) {
                    strM34096 = "Lcom/example/EditTarget;->target()V";
                }
                c22933 = new C22932("smali_method", strM34096);
            } else if ("axml".equals(strM34064)) {
                if (strM34096.isEmpty()) {
                    strM34096 = "AndroidManifest.xml";
                }
                c22933 = new C22932("axml", strM34096);
            } else if ("zip_entry".equals(strM34064)) {
                if (strM34096.isEmpty()) {
                    strM34096 = "assets/example.txt";
                }
                c22933 = new C22932("zip_entry", strM34096);
            } else {
                if (!strM34096.isEmpty()) {
                    try {
                        strM39512 = C17384.m39512(strM34096);
                    } catch (RuntimeException | C5276 unused) {
                    }
                }
                c22933 = new C22932("smali_class", strM39512);
            }
            return m34014(strAsString, strAsString2, c22933.f72166, m34057(jSONObject), c22933.f72165);
        }
        c22933 = c22932;
        return m34014(strAsString, strAsString2, c22933.f72166, m34057(jSONObject), c22933.f72165);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m34057(JSONObject jSONObject) {
        JSONValue jSONValue;
        JSONValue jSONValue2 = jSONObject.get("mode");
        if (jSONValue2 != null && jSONValue2.isString() && m34076(jSONValue2.asString())) {
            return jSONValue2.asString();
        }
        JSONValue jSONValue3 = jSONObject.get("edits");
        return (jSONValue3 != null && jSONValue3.isArray() && jSONValue3.asArray().size() > 0 && jSONValue3.asArray().get(0).isObject() && (jSONValue = jSONValue3.asArray().get(0).asObject().get("mode")) != null && jSONValue.isString() && m34076(jSONValue.asString())) ? jSONValue.asString() : "replace_match";
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34014(String str, String str2, String str3, String str4, String str5) {
        String strM16053;
        String str6;
        String str7;
        String str8 = ".class public ";
        String strM16054 = "";
        if ("write_target".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n.super Ljava/lang/Object;\n";
                strM16053 = C6988.m16053(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                StringBuilder sb = new StringBuilder(".method public ");
                int iIndexOf = str5.indexOf("->");
                strM16053 = C10965.m25286(sb, iIndexOf < 0 ? "method()V" : str5.substring(iIndexOf + 2), "\n    .registers 1\n    return-void\n.end method");
            } else {
                strM16053 = "axml".equals(str3) ? "<manifest xmlns:android=\"http://schemas.android.com/apk/res/android\" />\n" : "text\n";
            }
        } else if ("replace_match".equals(str4)) {
            if ("smali_class".equals(str3)) {
                str7 = "\n";
                strM16054 = C6988.m16053(".class public ", str5, "\n");
                str8 = ".class public final ";
                strM16053 = C6988.m16053(str8, str5, str7);
            } else if ("smali_method".equals(str3)) {
                str6 = "    # inserted marker\n    return-void\n";
                strM16053 = str6;
                strM16054 = "    return-void\n";
            } else {
                strM16054 = "old";
                strM16053 = "new";
            }
        } else if (!"insert_before_match".equals(str4) && !"insert_after_match".equals(str4)) {
            strM16053 = "";
        } else if ("smali_class".equals(str3)) {
            strM16054 = ".super Ljava/lang/Object;\n";
            strM16053 = "# inserted comment\n";
        } else if ("smali_method".equals(str3)) {
            str6 = "    # inserted marker\n";
            strM16053 = str6;
            strM16054 = "    return-void\n";
        } else {
            strM16054 = "</";
            strM16053 = "inserted";
        }
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", m34020(str3, str5)).add("targetVersion", "<copy data.targetVersion from mt_apk_read_text>").add("edits", JSON.array().add(C9417.m21913("mode", str4, "matchText", strM16054).add("writeText", strM16053)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34012(String str, String str2, String str3) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", m34020(str3, "Lcom/example/EditTarget;"));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m34054(String str, String str2, String str3) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("locator", m34021("zip_entry", str3, (String) null, (String) null, (String) null, (String) null)).add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "01")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34013(String str, String str2, String str3, String str4) {
        return C9417.m21913("workspaceId", str, "editSessionId", str2).add("edits", JSON.array().add(JSON.object().add("locator", m34021("resource", (String) null, (String) null, (String) null, (String) null, str3)).add("variant", str4).add("targetVersion", "<copy results[0].targetVersion from mt_apk_resource_read>").add("valueXml", "<string name=\"example\">text</string>")));
    }

    /* JADX INFO: renamed from: ۜ */
    public static C7097 m34047(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42452;
        m34033(jSONObject, "mt_apk_session_check", strArr);
        m34034(jSONObject, strArr);
        return new C7097(m34063(jSONObject, "workspaceId"), m34063(jSONObject, "editSessionId"), m34075(jSONObject, "runBuildChecks"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C23191 m34085(JSONObject jSONObject) throws C5276 {
        String strM31907;
        m34033(jSONObject, "build", f42447);
        m34034(jSONObject, f42455);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34064 = m34063(jSONObject, "editSessionId");
        String strM34095 = m34095(jSONObject, "outputName");
        if (strM34095.isEmpty()) {
            strM31907 = strM34095;
        } else if (strM34095.startsWith("/")) {
            strM31907 = C14059.m31907(strM34095, "outputName");
        } else {
            if (!".".equals(strM34095) && !"..".equals(strM34095) && strM34095.indexOf(47) < 0 && strM34095.indexOf(92) < 0) {
                int i = 0;
                if (strM34095.indexOf(0) < 0) {
                    int iIndexOf = strM34095.indexOf(58);
                    if (iIndexOf > 0) {
                        while (true) {
                            if (i < iIndexOf) {
                                char cCharAt = strM34095.charAt(i);
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
                    strM31907 = strM34095;
                }
            }
            throw C5276.m11406("Invalid outputName", "outputName", JSON.value(strM34095), JSON.array(), JSON.object().add("outputName", "built.apk"));
        }
        return new C23191(strM34063, strM34064, strM31907, m34075(jSONObject, "overwrite"), jSONObject.contains("sign") ? m34075(jSONObject, "sign") : true);
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m34052(String str) throws C5276 {
        if (str == null || str.isEmpty() || str.indexOf(0) >= 0 || str.endsWith("/")) {
            throw C5276.m11406("Invalid locator", "locator", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("locator", m34021("zip_entry", "res/layout/activity_main.xml", (String) null, (String) null, (String) null, (String) null)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34022(C19365 c19365) {
        String str = c19365.f57813;
        String str2 = c19365.f57813;
        if ("entry_text".equals(str)) {
            return m34021("zip_entry", c19365.f57809, (String) null, (String) null, (String) null, (String) null);
        }
        if ("axml".equals(str2)) {
            return m34021("axml", c19365.f57809, (String) null, (String) null, (String) null, (String) null);
        }
        if ("dex_class_smali".equals(str2)) {
            return m34021("dex_class", (String) null, c19365.f57808, (String) null, (String) null, (String) null);
        }
        if ("dex_method_smali".equals(str2)) {
            return m34021("dex_method", (String) null, c19365.f57808, c19365.f57812, (String) null, (String) null);
        }
        if ("dex_field_smali".equals(str2)) {
            return m34021("dex_field", (String) null, c19365.f57808, (String) null, c19365.f57811, (String) null);
        }
        return m34021("resource", (String) null, (String) null, (String) null, (String) null, c19365.f57810);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34021(String str, String str2, String str3, String str4, String str5, String str6) {
        if (!"zip_entry".equals(str) && !"axml".equals(str)) {
            if ("dex_class".equals(str)) {
                str2 = C19831.m45079(str3);
            } else if ("dex_method".equals(str)) {
                str2 = m34078(str3, str4);
            } else if ("dex_field".equals(str)) {
                str2 = m34078(str3, str5);
            } else {
                if (!"resource".equals(str)) {
                    throw new IllegalArgumentException(C21466.m48631("Unsupported target kind: ", str));
                }
                str2 = str6 == null ? null : str6.toLowerCase(Locale.ROOT);
            }
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException(C21466.m48631("Empty target for locator kind: ", str));
        }
        return str + ':' + str2;
    }

    /* JADX INFO: renamed from: ۖ */
    public static String m34040(String str) throws C5276 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m34021("zip_entry", "assets/data.bin", (String) null, (String) null, (String) null, (String) null));
        C23602 c23602M34029 = m34029(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c23602M34029.f75125;
        if (!"zip_entry".equals(str2)) {
            throw C5276.m11406("Only zip_entry locators are accepted", "locator", JSON.value(str2), JSON.array("zip_entry"), jSONObjectAdd);
        }
        String str3 = c23602M34029.f75126;
        if (str3 == null || !str3.endsWith("/")) {
            m34052(str3);
        } else {
            m34052(C17073.m38720(1, 0, str3));
        }
        return str3;
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m34064(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m34096(String str) {
        int iIndexOf = str == null ? -1 : str.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONValue m34055(String str, String str2) {
        if (str == null || str2 == null) {
            return JSON.NULL;
        }
        if ("axml".equals(str) || "zip_entry".equals(str) || "smali_method".equals(str) || "smali_class".equals(str)) {
            return JSON.value(m34020(str, str2));
        }
        return JSON.NULL;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34020(String str, String str2) {
        if ("axml".equals(str)) {
            return m34021("axml", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("zip_entry".equals(str)) {
            return m34021("zip_entry", str2, (String) null, (String) null, (String) null, (String) null);
        }
        if ("smali_method".equals(str)) {
            return C21466.m48631("dex_method:", str2);
        }
        if ("smali_class".equals(str)) {
            return m34021("dex_class", (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C21466.m48631("Unsupported edit target type: ", str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m34072(String str, String str2, String str3) {
        if ("dex_method".equals(str)) {
            return m34021(str, (String) null, str2, str3, (String) null, (String) null);
        }
        if ("dex_field".equals(str)) {
            return m34021(str, (String) null, str2, (String) null, str3, (String) null);
        }
        if ("dex_class".equals(str)) {
            return m34021(str, (String) null, str2, (String) null, (String) null, (String) null);
        }
        throw new IllegalArgumentException(C21466.m48631("Unsupported xref target kind: ", str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13803 m34028(String str, String str2, C4763 c4763, JSONObject jSONObject) throws C5276 {
        JSONObject jSONObject2 = c4763.f10788;
        JSONObject jSONObject3 = c4763.f10789;
        String strM34063 = m34063(jSONObject2, "view");
        if ("zip_entries".equals(strM34063) || "dex_classes".equals(strM34063) || "resource_table".equals(strM34063)) {
            if (!jSONObject2.contains("prefix")) {
                throw m34046("prefix");
            }
            String strM34018 = m34018(jSONObject2, "prefix", "");
            int iM34007 = m34007(c4763, jSONObject);
            int iM34082 = m34082(jSONObject3, "offset");
            m34031(iM34082, 0, Integer.MAX_VALUE, "offset");
            return new C13803(str, str2, strM34063, strM34018, null, iM34007, iM34082, 0, 200);
        }
        throw C5276.m11406("Unsupported view", "view", JSON.value(strM34063), JSON.array("zip_entries", "dex_classes", "resource_table"), JSON.object().add("view", "zip_entries"));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13803 m34060(String str, String str2, C4763 c4763, JSONObject jSONObject) throws C5276 {
        JSONObject jSONObject2 = c4763.f10788;
        JSONObject jSONObject3 = c4763.f10789;
        String strM34067 = m34067(m34063(jSONObject2, "locator"));
        int iM34007 = m34007(c4763, jSONObject);
        int iM34082 = m34082(jSONObject3, "memberOffset");
        m34031(iM34082, 0, Integer.MAX_VALUE, "memberOffset");
        return new C13803(str, str2, "dex_class_outline", "", strM34067, iM34007, 0, iM34082, iM34007);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C3942 m34073(String str, String str2, C4763 c4763, JSONObject jSONObject) throws C5276 {
        JSONObject jSONObject2 = c4763.f10788;
        JSONObject jSONObject3 = c4763.f10789;
        C19365 c19365M34091 = m34091(m34063(jSONObject2, "target"));
        String str3 = c19365M34091.f57813;
        String strM34018 = m34018(jSONObject2, "format", TextBundle.TEXT_ENTRY);
        if ("hex".equals(strM34018)) {
            if (!"entry_text".equals(str3)) {
                throw C5276.m11406("Byte read cursor is valid only for zip_entry locators", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            }
            int iM34007 = m34007(c4763, jSONObject);
            int iM34082 = m34082(jSONObject3, "hexOffset");
            m34031(iM34082, 0, Integer.MAX_VALUE, "hexOffset");
            return new C3942(str, str2, c19365M34091, strM34018, 0, 0, 500, 49152, iM34082, iM34007, null, null);
        }
        if (!TextBundle.TEXT_ENTRY.equals(strM34018)) {
            throw C5276.m11406("Invalid read cursor format", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        if ("resource_item".equals(str3)) {
            throw C5276.m11406("Resource read cursors are no longer supported", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
        int iM34008 = m34007(c4763, jSONObject);
        int iM34083 = m34082(jSONObject2, "maxChars");
        m34031(iM34083, 1, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, "maxChars");
        int iM34084 = m34082(jSONObject3, "lineOffset");
        m34031(iM34084, 0, Integer.MAX_VALUE, "lineOffset");
        int iM34085 = m34082(jSONObject3, "lineCharOffset");
        m34031(iM34085, 0, Integer.MAX_VALUE, "lineCharOffset");
        return new C3942(str, str2, c19365M34091, strM34018, iM34084, iM34085, iM34008, iM34083, 0, 256, "nextCursor", jSONObject.get("nextCursor"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C24729 m34086(String str, String str2, C4763 c4763, JSONObject jSONObject) throws C5276 {
        String str3;
        C16011 c16011;
        JSONObject jSONObject2 = c4763.f10788;
        String strM34063 = m34063(jSONObject2, "query");
        String strM34064 = m34063(jSONObject2, "queryType");
        boolean zM34061 = m34061(jSONObject2, "caseSensitive");
        String strM34065 = m34063(jSONObject2, "matchMode");
        C18317 c18317M41750 = C18317.m41750(strM34063, strM34064, strM34065, zM34061);
        JSONValue jSONValue = jSONObject2.get("scopes");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34058("scopes", jSONValue);
        }
        String str4 = null;
        if (!jSONValue.isArray()) {
            throw C5276.m11406("Invalid scopes", "scopes", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        int i = 0;
        ArrayList arrayListM34023 = m34023(jSONValue.asArray(), false, false, false);
        if ("exact".equals(strM34065)) {
            Iterator it = arrayListM34023.iterator();
            while (it.hasNext()) {
                if ("smali".equals((String) it.next())) {
                    throw C5276.m11406("matchMode=exact is invalid for smali scope", "matchMode", JSON.value(strM34065), JSON.array("contains"), JSON.object().add("scopes", JSON.array("smali")).add("matchMode", "contains"));
                }
            }
        }
        int iM34007 = m34007(c4763, jSONObject);
        boolean zM34062 = m34061(jSONObject2, "includeSnippet");
        int iM34082 = m34082(jSONObject2, "snippetMaxChars");
        m34031(iM34082, 0, 1000, "snippetMaxChars");
        boolean zM34063 = m34061(jSONObject2, "explicitScopes");
        JSONValue jSONValue2 = jSONObject.get("nextCursor");
        String strM34018 = m34018(jSONObject2, "target", (String) null);
        if (strM34018 == null) {
            str3 = zM34063 ? "" : "overview";
        } else {
            while (true) {
                if (i >= 11) {
                    throw C5276.m11406("Invalid cursor", "nextCursor", jSONValue2, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                if (f42454[i].equals(strM34018)) {
                    str3 = strM34018;
                    break;
                }
                i++;
                str4 = null;
            }
        }
        boolean zM34064 = m34061(jSONObject2, "includeMatchOffsets");
        String strM34019 = m34018(jSONObject2, "zipEntryPrefix", str4);
        String strM340110 = m34018(jSONObject2, "resourcePrefix", str4);
        String strM34049 = strM340110 == null ? str4 : m34049(strM340110);
        String strM34066 = m34063(jSONObject2, "classPrefixMode");
        String strM340111 = m34018(jSONObject2, "classPrefix", str4);
        if ("none".equals(strM34066)) {
            if (strM340111 != null) {
                throw C5276.m11406("Invalid prefix", "prefix", JSON.value(strM340111), (JSONArray) null, (JSONObject) null);
            }
            c16011 = C16011.f46375;
        } else {
            if (strM340111 == null || strM340111.isEmpty()) {
                throw C5276.m11406("Invalid prefix", "prefix", strM340111 == null ? null : JSON.value(strM340111), (JSONArray) null, (JSONObject) null);
            }
            if (!"prefix".equals(strM34066) && !"descriptorExact".equals(strM34066)) {
                throw C5276.m11406("Invalid prefix", "prefix", JSON.value(strM340111), (JSONArray) null, (JSONObject) null);
            }
            c16011 = new C16011(strM34066, strM340111);
        }
        String strM34067 = m34063(jSONObject2, "dexStringResultMode");
        if (Name.LABEL.equals(strM34067) || "member".equals(strM34067)) {
            return new C24729(str, str2, str3, strM34063, arrayListM34023, iM34007, zM34062, iM34082, zM34063, zM34064, strM34019, strM34049, c16011, strM34067, c18317M41750, C19659.m44677(c4763.f10789, jSONObject.get("nextCursor")));
        }
        throw C5276.m11406("Invalid cursor", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ܿ */
    public static C11319 m34079(String str, String str2, C4763 c4763, JSONObject jSONObject) throws C5276 {
        JSONObject jSONObject2 = c4763.f10788;
        int iM34007 = m34007(c4763, jSONObject);
        try {
            C5497 c5497M34084 = m34084(m34063(jSONObject2, "targetLocator"), jSONObject.get("nextCursor"));
            String strM34063 = m34063(jSONObject2, "methodResolution");
            m34074(strM34063, jSONObject.get("nextCursor"));
            m34037(c5497M34084, strM34063, jSONObject.get("nextCursor"));
            return new C11319(str, str2, c5497M34084.f13139, c5497M34084.f13138, c5497M34084.f13140, strM34063, iM34007, C4021.m8024(c4763.f10789, jSONObject.get("nextCursor")));
        } catch (C5276 unused) {
            throw C5276.m11406("Invalid cursor", "nextCursor", jSONObject.get("nextCursor"), JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C5497 m34084(String str, JSONValue jSONValue) throws C5276 {
        C23602 c23602M34029 = m34029(m34002("dex_method"), JSON.value(str), "locator");
        String str2 = c23602M34029.f75125;
        try {
            String str3 = c23602M34029.f75126;
            if (!"dex_method".equals(str2)) {
                if (!"dex_field".equals(str2)) {
                    if ("dex_class".equals(str2)) {
                        return new C5497(str2, m34092(str3), null);
                    }
                    throw C5276.m11406("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_method", "dex_field", "dex_class"), m34002("dex_method"));
                }
                C6838 c6838M34059 = m34059(str3, "field", true);
                return new C5497(str2, c6838M34059.f17762, c6838M34059.f17763);
            }
            C6838 c6838M340510 = m34059(str3, AbstractC0213e.f995s, true);
            return new C5497(str2, c6838M340510.f17762, c6838M340510.f17763);
        } catch (C5276 unused) {
            throw C5276.m11406("Invalid locator", "locator", jSONValue, JSON.array(), m34002(str2));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m34074(String str, JSONValue jSONValue) throws C5276 {
        int i = 0;
        while (true) {
            String[] strArr = f42439;
            if (i < 4) {
                if (strArr[i].equals(str)) {
                    return;
                } else {
                    i++;
                }
            } else {
                throw C5276.m11406("Invalid methodResolution", "methodResolution", jSONValue, C3223.m5566(Arrays.asList(strArr)), JSON.object().add("methodResolution", "dispatch"));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34037(C5497 c5497, String str, JSONValue jSONValue) throws C5276 {
        if ("dex_method".equals(c5497.f13139)) {
            if ("not_applicable".equals(str)) {
                throw C5276.m11406("Invalid methodResolution for dex_method", "methodResolution", jSONValue, C3223.m5566(Arrays.asList("exact", "slot", "dispatch")), JSON.object().add("methodResolution", "dispatch"));
            }
        } else if (!"not_applicable".equals(str)) {
            throw C5276.m11406("Invalid methodResolution for xref target", "methodResolution", jSONValue, JSON.array("not_applicable"), JSON.object().add("methodResolution", "not_applicable"));
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    public static C19365 m34091(String str) throws C5276 {
        C23602 c23602M34029 = m34029(JSON.object().add("locator", m34021("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)), JSON.value(str), "locator");
        String str2 = c23602M34029.f75125;
        String str3 = c23602M34029.f75126;
        if ("zip_entry".equals(str2)) {
            return C19365.m44101(str3);
        }
        if ("axml".equals(str2)) {
            return C19365.m44097(str3);
        }
        if ("dex_class".equals(str2)) {
            return C19365.m44099(m34092(str3));
        }
        if (!"dex_method".equals(str2)) {
            if (!"dex_field".equals(str2)) {
                if ("resource".equals(str2)) {
                    return C19365.m44102(C10962.m25264(str3, "locator"));
                }
                throw C5276.m11406("Unsupported locator", "locator", JSON.value(str2), JSON.array("zip_entry", "axml", "dex_class", "dex_method", "dex_field", "resource"), JSON.object().add("locator", m34021("zip_entry", "AndroidManifest.xml", (String) null, (String) null, (String) null, (String) null)));
            }
            C6838 c6838M34059 = m34059(str3, "field", true);
            return C19365.m44098(c6838M34059.f17762, c6838M34059.f17763);
        }
        C6838 c6838M340510 = m34059(str3, AbstractC0213e.f995s, true);
        return C19365.m44100(c6838M340510.f17762, c6838M340510.f17763);
    }

    /* JADX INFO: renamed from: ܺ */
    public static String m34067(String str) throws C5276 {
        JSONObject jSONObjectAdd = JSON.object().add("locator", m34021("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        C23602 c23602M34029 = m34029(jSONObjectAdd, JSON.value(str), "locator");
        String str2 = c23602M34029.f75125;
        if (!"dex_class".equals(str2)) {
            throw C5276.m11406("Unsupported locator", "locator", JSON.value(str2), JSON.array("dex_class"), jSONObjectAdd);
        }
        return m34092(c23602M34029.f75126);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m34071(JSONObject jSONObject) throws C5276 {
        JSONValue jSONValue = jSONObject.get("locator");
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34058("locator", jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C5276.m11406("Invalid locator", "locator", jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return strAsString;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23602 m34029(JSONObject jSONObject, JSONValue jSONValue, String str) throws C5276 {
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406(C21466.m48631("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        String strAsString = jSONValue.asString();
        int iIndexOf = strAsString.indexOf(58);
        if (iIndexOf <= 0 || iIndexOf == strAsString.length() - 1) {
            throw C5276.m11406(C21466.m48631("Invalid ", str), str, jSONValue, JSON.array(), jSONObject);
        }
        return new C23602(strAsString.substring(0, iIndexOf), strAsString.substring(iIndexOf + 1));
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m34053(int i, JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        return (jSONValue != null && jSONValue.isString() && jSONValue.asString().isEmpty()) ? i : m34006(i, jSONObject, str);
    }

    /* JADX INFO: renamed from: ۘ */
    public static String m34042(String str) {
        return m34059(str, AbstractC0213e.f995s, false).f17762;
    }

    /* JADX INFO: renamed from: ᩴ */
    public static String m34088(String str) {
        return m34059(str, AbstractC0213e.f995s, false).f17763;
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m34078(String str, String str2) {
        return C19831.m45079(str) + "->" + str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b1, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX INFO: renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6838 m34059(String str, String str2, boolean z) throws C5276 {
        int iIndexOf = str.indexOf("->");
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf("->")) {
            throw m34027(str, str2, z);
        }
        boolean zM34081 = false;
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 2);
        if (!strSubstring.startsWith("L") || !strSubstring.endsWith(C0249l.f1196b) || strSubstring.length() <= 2 || strSubstring2.isEmpty()) {
            throw m34027(str, str2, z);
        }
        if (AbstractC0213e.f995s.equals(str2)) {
            int iIndexOf2 = strSubstring2.indexOf(40);
            int iIndexOf3 = strSubstring2.indexOf(41, iIndexOf2 + 1);
            if (iIndexOf2 <= 0 || iIndexOf3 <= iIndexOf2 || iIndexOf3 >= strSubstring2.length() - 1) {
                throw m34027(str, str2, z);
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
                            zM34081 = m34081(strSubstring3.substring(i));
                        }
                    }
                }
                throw m34027(str, str2, z);
            }
            throw new IllegalArgumentException("Unsupported smali reference kind: ".concat(str2));
        }
        return new C6838(strSubstring, strSubstring2);
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m34081(String str) {
        if (str.length() == 1) {
            return "ZBCSIJFD".indexOf(str.charAt(0)) >= 0;
        }
        return str.startsWith("L") && str.endsWith(C0249l.f1196b) && str.length() > 2 && str.indexOf(91) < 0 && str.indexOf(58) < 0 && str.indexOf(40) < 0 && str.indexOf(41) < 0 && str.indexOf(59) == str.length() - 1;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static String m34092(String str) throws C5276 {
        if (!m34081(str) || str.indexOf(46) >= 0 || str.indexOf(59) != str.length() - 1) {
            throw C5276.m11406("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", m34021("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null)));
        }
        return C19831.m45079(str);
    }

    /* JADX INFO: renamed from: ֡ */
    public static JSONObject m34002(String str) {
        if ("dex_field".equals(str)) {
            return JSON.object().add("locator", m34021("dex_field", (String) null, "Lcom/example/Foo;", (String) null, "fieldFlag:Z", (String) null));
        }
        if ("dex_class".equals(str)) {
            return JSON.object().add("locator", m34021("dex_class", (String) null, "Lcom/example/Foo;", (String) null, (String) null, (String) null));
        }
        return JSON.object().add("locator", m34021("dex_method", (String) null, "Lcom/example/Foo;", "onCreate(Landroid/os/Bundle;)V", (String) null, (String) null));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m34027(String str, String str2, boolean z) {
        String str3 = AbstractC0213e.f995s.equals(str2) ? "Lcom/example/Foo;->onCreate(Landroid/os/Bundle;)V" : "Lcom/example/Foo;->fieldFlag:Z";
        if (z) {
            return C5276.m11406("Invalid locator", "locator", JSON.value(str), JSON.array(), JSON.object().add("locator", "dex_" + str2 + ':' + str3));
        }
        return C5276.m11406("Invalid target", "target", JSON.value(str), JSON.array(), JSON.object().add("target", "Lcom/example/Foo;->bar()V"));
    }

    /* JADX INFO: renamed from: ۠ */
    public static C21591 m34048(JSONObject jSONObject) throws C5276 {
        String[] strArr = f42442;
        m34033(jSONObject, "search", strArr);
        m34034(jSONObject, strArr);
        String strM34063 = m34063(jSONObject, "workspaceId");
        String strM34095 = m34095(jSONObject, "editSessionId");
        String strM34096 = m34095(jSONObject, "target");
        int i = 0;
        while (true) {
            String[] strArr2 = f42454;
            if (i >= 11) {
                throw C5276.m11406("Invalid target", "target", JSON.value(strM34096), C3223.m5566(Arrays.asList(strArr2)), m34083("overview", "AndroidManifest"));
            }
            if (strArr2[i].equals(strM34096)) {
                String strM34097 = m34095(jSONObject, "query");
                if (strM34097.isEmpty()) {
                    throw C5276.m11406("Invalid query", "query", JSON.value(strM34097), (JSONArray) null, m34083(strM34096, "AndroidManifest"));
                }
                String strM34098 = m34095(jSONObject, "queryType");
                boolean zM34075 = m34075(jSONObject, "caseSensitive");
                String strM34099 = m34095(jSONObject, "matchMode");
                String strM340910 = m34095(jSONObject, "prefix");
                boolean zM34076 = m34075(jSONObject, "includeMatchOffsets");
                int iM34077 = m34077(jSONObject, "limit");
                m34032(iM34077, 1, 200, "limit", m34083(strM34096, strM34097));
                int iM34078 = m34077(jSONObject, "snippetMaxChars");
                m34032(iM34078, 0, 1000, "snippetMaxChars", m34083(strM34096, strM34097));
                if ("overview".equals(strM34096) && !strM340910.isEmpty()) {
                    throw C5276.m11406("prefix must be empty for target=overview", "prefix", JSON.value(strM340910), JSON.array(""), m34083("overview", "AndroidManifest"));
                }
                if ("smali".equals(strM34096) && "exact".equals(strM34099)) {
                    throw C5276.m11406("matchMode=exact is invalid for target=smali", "matchMode", JSON.value(strM34099), JSON.array("contains"), m34083("smali", "onCreate"));
                }
                if ("resource_table_names".equals(strM34096) || "resource_table_values".equals(strM34096) || "resource_table_file_paths".equals(strM34096)) {
                    m34049(strM340910);
                } else if (m34062(strM34096) && !strM340910.isEmpty()) {
                    m34094(m34083(strM34096, "Outer").put("prefix", "com.example."), strM340910);
                }
                try {
                    return new C21591(strM34063, strM34095, strM34096, strM34097, strM340910, zM34076, iM34077, iM34078, C18317.m41750(strM34097, strM34098, strM34099, zM34075));
                } catch (C5276 e) {
                    if (!e.f12408) {
                        throw e;
                    }
                    JSONObject jSONObject2 = e.f12412;
                    String string = jSONObject2.getString("argument", null);
                    if (!"query".equals(string) && !"queryType".equals(string) && !"matchMode".equals(string)) {
                        throw e;
                    }
                    throw C5276.m11406(e.getMessage(), string, e.f12411, jSONObject2.getJSONArray("allowedValues"), m34083(strM34096, "query".equals(string) ? "AndroidManifest" : strM34097));
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m34062(String str) {
        return "dex_names".equals(str) || "dex_strings".equals(str) || "dex_string_members".equals(str) || "smali".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m34024(String... strArr) {
        JSONArray jSONArrayArray = JSON.array();
        for (String str : strArr) {
            jSONArrayArray.add(str);
        }
        return m34023(jSONArrayArray, false, false, false);
    }

    /* JADX INFO: renamed from: ۡ */
    public static String m34049(String str) throws C5276 {
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("/") || str.contains("//")) {
            throw m34025(str);
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0 || iIndexOf != str.lastIndexOf(47)) {
                throw m34025(str);
            }
            if (str.substring(0, iIndexOf).isEmpty()) {
                throw m34025(str);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m34025(String str) {
        return C5276.m11406("Invalid prefix", "prefix", JSON.value(str), JSON.array("", "0x7f", "string", "string/app_", "app_"), m34083("resource_table_names", "app_name").put("prefix", "string/"));
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C16011 m34094(JSONObject jSONObject, String str) throws C5276 {
        if (str == null) {
            return C16011.f46375;
        }
        if (!str.contains(C0249l.f1196b)) {
            String strReplace = (str.startsWith("L") ? str.substring(1) : str).replace('.', '/');
            if (strReplace.isEmpty()) {
                throw C5276.m11406("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
            }
            return new C16011("prefix", strReplace);
        }
        if (str.startsWith("L") && str.endsWith(C0249l.f1196b) && str.indexOf(59) == str.length() - 1 && str.length() > 3 && C9417.m21911(2, str) != '/') {
            return new C16011("descriptorExact", str);
        }
        throw C5276.m11406("Invalid prefix", "prefix", JSON.value(str), (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m34023(JSONArray jSONArray, boolean z, boolean z2, boolean z3) throws C5276 {
        String str;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] strArr = f42453;
        String str2 = "resource_table_value";
        String str3 = f42438;
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
                throw C5276.m11406(C21466.m48631("Invalid scopes. ", str3), "scopes", jSONArray, C3223.m5566(Arrays.asList(strArr)), m34009());
            }
            Iterator it = jSONArray.asArray().iterator();
            while (it.hasNext()) {
                Iterator it2 = it;
                JSONValue jSONValue = (JSONValue) it.next();
                if (!jSONValue.isString()) {
                    throw C5276.m11406(C21466.m48631("Invalid scopes. ", str3), "scopes", jSONValue, C3223.m5566(Arrays.asList(strArr)), m34009());
                }
                String strAsString = jSONValue.asString();
                if ("zip_entries".equals(strAsString) || "axml".equals(strAsString) || "resource_table_id".equals(strAsString) || "resource_table_name".equals(strAsString) || str2.equals(strAsString)) {
                    str = str2;
                } else {
                    str = str2;
                    if (!"resource_table_file_path".equals(strAsString) && !"dex_class".equals(strAsString) && !"dex_field".equals(strAsString) && !"dex_method".equals(strAsString) && !"dex_string".equals(strAsString) && !"smali".equals(strAsString) && !"native_symbol".equals(strAsString) && !"native_string".equals(strAsString)) {
                        throw C5276.m11406(C20865.m47154("Invalid scope: ", strAsString, ". ", str3), "scopes", JSON.value(strAsString), C3223.m5566(Arrays.asList(strArr)), m34009());
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
            throw C5276.m11406(C21466.m48631("Invalid scopes. ", str3), "scopes", jSONArray, C3223.m5566(Arrays.asList(strArr)), m34009());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m34087(String str) {
        return "resource_table_id".equals(str) || "resource_table_name".equals(str) || "resource_table_value".equals(str) || "resource_table_file_path".equals(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34033(JSONObject jSONObject, String str, String... strArr) throws C5276 {
        List listAsList = Arrays.asList(strArr);
        for (String str2 : jSONObject.names()) {
            if (!listAsList.contains(str2)) {
                throw C5276.m11406(C6988.m16053("Invalid ", str, " argument"), str2, jSONObject.get(str2), C3223.m5566(listAsList), JSON.object());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34034(JSONObject jSONObject, String... strArr) throws C5276 {
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
            throw m34046((String) arrayList.get(0));
        }
        StringBuilder sb = new StringBuilder("Missing parameters: ");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append((String) arrayList.get(i));
        }
        throw C5276.m11406(sb.toString(), "parameters", (JSONValue) null, C3223.m5566(arrayList), JSON.object());
    }

    /* JADX INFO: renamed from: ܳ */
    public static C16895 m34065(JSONObject jSONObject) throws C5276 {
        for (String str : jSONObject.names()) {
            if (!"workspaceId".equals(str) && !"editSessionId".equals(str) && !"nextCursor".equals(str) && !"limit".equals(str)) {
                throw C5276.m11406("Invalid continue continuation argument", str, jSONObject.get(str), JSON.array("workspaceId", "editSessionId", "nextCursor", "limit"), JSON.object().add("nextCursor", "<cursor>"));
            }
        }
        m34034(jSONObject, "workspaceId", "editSessionId", "nextCursor", "limit");
        return new C16895(m34063(jSONObject, "workspaceId"), m34095(jSONObject, "editSessionId"), m34063(jSONObject, "nextCursor"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34007(C4763 c4763, JSONObject jSONObject) throws C5276 {
        int iM34077 = m34077(jSONObject, "limit");
        m34031(iM34077, 1, c4763.f10787, "limit");
        return iM34077;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m34083(String str, String str2) {
        return C9417.m21913("workspaceId", "ab12cd34", "editSessionId", "").add("target", str).add("query", str2).add("queryType", "literal").add("caseSensitive", false).add("matchMode", "contains").add("prefix", "").add("includeMatchOffsets", false).add("limit", 50).add("snippetMaxChars", 240);
    }

    /* JADX INFO: renamed from: ܳ */
    public static String m34063(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34058(str, jSONValue);
        }
        String strM34018 = m34018(jSONObject, str, (String) null);
        if (strM34018.isEmpty()) {
            throw C5276.m11406("Invalid ".concat(str), str, JSON.value(strM34018), (JSONArray) null, (JSONObject) null);
        }
        return strM34018;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static String m34095(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw m34058(str, jSONValue);
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m34008(JSONObject jSONObject, String str, JSONObject jSONObject2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            throw C5276.m11406("Missing ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        if (!jSONValue.isArray()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, jSONObject2);
        }
        return jSONValue.asArray();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34018(JSONObject jSONObject, String str, String str2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return str2;
        }
        if (!jSONValue.isString()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m34006(int i, JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return i;
        }
        if (!jSONValue.isNumber()) {
            throw m34026(str, jSONValue);
        }
        try {
            return C3223.m5572(jSONValue);
        } catch (ArithmeticException | NumberFormatException unused) {
            throw m34026(str, jSONValue);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m34082(JSONObject jSONObject, String str) throws C5276 {
        if (!jSONObject.contains(str)) {
            throw m34046(str);
        }
        return m34006(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m34077(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m34046(str);
        }
        if (jSONValue.isNull()) {
            throw m34026(str, jSONValue);
        }
        return m34006(0, jSONObject, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m34038(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || jSONValue.isNull()) {
            return false;
        }
        if (!jSONValue.isBoolean()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return jSONValue.asBoolean();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m34061(JSONObject jSONObject, String str) throws C5276 {
        if (!jSONObject.contains(str)) {
            throw m34046(str);
        }
        return m34038(jSONObject, str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m34075(JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null) {
            throw m34046(str);
        }
        if (jSONValue.isNull()) {
            throw C5276.m11406("Invalid ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
        }
        return m34038(jSONObject, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34031(int i, int i2, int i3, String str) throws C5276 {
        if (i < i2 || i > i3) {
            throw C5276.m11406("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), JSON.object());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34032(int i, int i2, int i3, String str, JSONObject jSONObject) throws C5276 {
        if (i < i2 || i > i3) {
            throw C5276.m11406("Invalid ".concat(str), str, JSON.value(i), JSON.array(i2, i3), jSONObject);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m34026(String str, JSONValue jSONValue) {
        return C5276.m11406(C6988.m16053("Invalid ", str, ": expected a 32-bit integer JSON number"), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۜ */
    public static C5276 m34046(String str) {
        return C5276.m11406(C21466.m48631("Missing ", str), str, (JSONValue) null, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m34058(String str, JSONValue jSONValue) {
        return C5276.m11406("Missing ".concat(str), str, jSONValue, (JSONArray) null, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ۜ */
    public static C5276 m34045(JSONObject jSONObject, String str) {
        return C5276.m11406(C21466.m48631("Missing ", str), str, (JSONValue) null, (JSONArray) null, jSONObject);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m34009() {
        return JSON.object().add("scopes", JSON.array("dex_string", "smali"));
    }
}
