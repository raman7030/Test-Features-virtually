package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p052u0.C0226b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0708d;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S79P */
/* JADX INFO: loaded from: classes3.dex */
public final class C10191 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f28256 = {"smali", "native_symbols", "native_strings", "resource_table_file_paths"};

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m23751(JSONObject jSONObject) {
        JSONValue jSONValueAdd;
        JSONValue jSONValueAdd2;
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("temporary", jSONObject.getBoolean("temporary", false)).add("apkFileName", jSONObject.getString("apkFileName", null)).add("packageName", jSONObject.getString("packageName", null)).add("versionName", jSONObject.getString("versionName", null)).add("versionCode", C3223.m5574(jSONObject.get("versionCode"))).add("minSdk", C3223.m5574(jSONObject.get("minSdk"))).add("targetSdk", C3223.m5574(jSONObject.get("targetSdk"))).add("appLabel", jSONObject.getString("appLabel", null));
        JSONObject jSONObject2 = jSONObject.getJSONObject("counts");
        if (jSONObject2 == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = JSON.object().add("zipEntries", jSONObject2.getInt("zipEntries", 0)).add("dexEntries", jSONObject2.getInt("dexEntries", 0)).add("xmlEntries", jSONObject2.getInt("xmlEntries", 0)).add("classes", jSONObject2.getInt("classes", 0));
        }
        JSONObject jSONObjectAdd3 = jSONObjectAdd2.add("counts", jSONValueAdd);
        JSONObject jSONObject3 = jSONObject.getJSONObject("capabilities");
        if (jSONObject3 == null) {
            jSONValueAdd2 = JSON.NULL;
        } else {
            jSONValueAdd2 = JSON.object().add("canReadAxml", jSONObject3.getBoolean("canReadAxml", false)).add("canSearchDexNames", jSONObject3.getBoolean("canSearchDexNames", false)).add("canSearchDexStrings", jSONObject3.getBoolean("canSearchDexStrings", false)).add("canReadResourceTable", jSONObject3.getBoolean("canReadResourceTable", false));
        }
        JSONObject jSONObjectAdd4 = jSONObjectAdd3.add("capabilities", jSONValueAdd2);
        JSONObject jSONObject4 = jSONObject.getJSONObject("signature");
        if (jSONObject4 == null) {
            jSONObjectAdd = JSON.object().add("available", false).add("signaturePresent", false).add("schemes", JSON.array()).add("hasDifferentCertificates", false).add("certificates", JSON.array()).add(C0708d.f2599O, "Signature summary is unavailable.");
        } else {
            JSONObject jSONObjectAdd5 = JSON.object().add("available", jSONObject4.getBoolean("available", false)).add("signaturePresent", jSONObject4.getBoolean("signaturePresent", false)).add("schemes", m23757(jSONObject4.getJSONArray("schemes"))).add("hasDifferentCertificates", jSONObject4.getBoolean("hasDifferentCertificates", false));
            JSONArray jSONArray = jSONObject4.getJSONArray("certificates");
            JSONArray jSONArrayArray = JSON.array();
            if (jSONArray != null) {
                Iterator it = jSONArray.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                    jSONArrayArray.add(JSON.object().add("schemes", m23757(jSONObjectAsObject.getJSONArray("schemes"))).add("sha256", jSONObjectAsObject.getString("sha256", null)));
                }
            }
            jSONObjectAdd = jSONObjectAdd5.add("certificates", jSONArrayArray).add(C0708d.f2599O, jSONObject4.getString(C0708d.f2599O, null));
        }
        return C21370.m48410(jSONObjectAdd4.add("signature", jSONObjectAdd).add("resourceTableSummaryError", jSONObject.getString("resourceTableSummaryError", null)), jSONObject.getJSONArray("nextActions"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23755(JSONObject jSONObject, String str) {
        jSONObject.add("virtualAddress", C3935.m7772("string", "SO-local virtual address as lowercase 0x hex, or null.")).add("fileOffset", C3935.m7772("string", "SO-local file offset as lowercase 0x hex, or null.")).add("readBytesByteOffset", C3935.m7772("integer", "Decimal byteOffset safe to pass to mt_apk_read_bytes, or null when unavailable or outside the integer range.")).add("byteSize", C3935.m7775("integer", "Non-negative. ".concat(str))).add("xrefAddressKind", C3935.m7773("addressKind to pass to mt_apk_native_xref, or null when xref is not directly available.", "virtual", "file_offset")).add("xrefAddress", C3935.m7772("string", "Address string to pass to mt_apk_native_xref, or null when unavailable."));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m23759(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        String str = null;
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", ""));
        JSONArray jSONArray2 = jSONObject.getJSONArray(AbstractC0213e.f989m);
        JSONArray jSONArrayArray = JSON.array();
        String str2 = "searchScope";
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONObject jSONObjectAdd2 = JSON.object().add("locator", C3223.m5573(jSONObjectAsObject.get("locator"))).add(str2, jSONObjectAsObject.getString(str2, str));
                JSONObject jSONObject3 = jSONObjectAsObject.getJSONObject("hit");
                if (jSONObject3 == null) {
                    jSONObject3 = JSON.object();
                }
                String string = jSONObject3.getString("kind", str);
                Iterator it2 = it;
                String str3 = str2;
                if (!"zip_entry_path".equals(string) && !"axml_text".equals(string) && !"resource_table_name".equals(string) && !"resource_table_value".equals(string) && !"dex_class_name".equals(string) && !"dex_field_name".equals(string) && !"dex_method_name".equals(string) && !"dex_string_matches".equals(string) && !"smali_text".equals(string) && !"native_symbol_name".equals(string) && !"native_string".equals(string)) {
                    string = "zip_entry_path";
                }
                JSONObject jSONObject4 = jSONObjectAdd;
                String string2 = jSONObject3.getString("matchKind", null);
                JSONObject jSONObjectM21913 = C9417.m21913("kind", string, "matchKind", string2);
                if ("axml_text".equals(string) || "smali_text".equals(string)) {
                    jSONArray = jSONArrayArray;
                    jSONObject2 = jSONObjectAdd2;
                    jSONObjectM21913.add("snippet", jSONObject3.getString("snippet", null)).add("line", jSONObject3.getInt("line", 0)).add("column", jSONObject3.getInt("column", 0));
                    m23754(jSONObjectM21913, jSONObject3);
                } else {
                    jSONArray = jSONArrayArray;
                    if ("resource_table_name".equals(string)) {
                        String string3 = jSONObject3.getString("matchField", null);
                        if (string3 == null) {
                            string3 = "id".equals(string2) ? "resource_id" : "name";
                        }
                        jSONObjectM21913.add("type", jSONObject3.getString("type", null)).add("name", jSONObject3.getString("name", null)).add("matchField", string3);
                        m23754(jSONObjectM21913, jSONObject3);
                    } else if ("resource_table_value".equals(string)) {
                        jSONObjectM21913.add("type", jSONObject3.getString("type", null)).add("name", jSONObject3.getString("name", null)).add("variant", jSONObject3.getString("variant", null)).add("valueKind", jSONObject3.getString("valueKind", null)).add("valueSnippet", jSONObject3.getString("valueSnippet", null)).add("styled", jSONObject3.getBoolean("styled", false)).add("truncated", jSONObject3.getBoolean("truncated", false)).add("matchField", jSONObject3.getString("matchField", null)).add("fileLocator", C3223.m5573(jSONObject3.get("fileLocator"))).add("targetLocator", C3223.m5573(jSONObject3.get("targetLocator"))).add("itemKey", jSONObject3.getString("itemKey", null)).add("itemValueKind", jSONObject3.getString("itemValueKind", null)).add("itemKeyLocator", C3223.m5573(jSONObject3.get("itemKeyLocator")));
                        m23754(jSONObjectM21913, jSONObject3);
                    } else if ("dex_string_matches".equals(string)) {
                        jSONObjectM21913.add("snippet", jSONObject3.getString("snippet", null));
                        m23754(jSONObjectM21913, jSONObject3);
                        JSONObject jSONObjectAdd3 = jSONObjectM21913.add("matchCount", jSONObject3.getInt("matchCount", 0));
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("matchedStrings");
                        JSONArray jSONArrayArray2 = JSON.array();
                        if (jSONArray3 != null) {
                            Iterator it3 = jSONArray3.iterator();
                            while (it3.hasNext()) {
                                JSONObject jSONObjectAsObject2 = ((JSONValue) it3.next()).asObject();
                                JSONObject jSONObjectAdd4 = JSON.object().add(TextBundle.TEXT_ENTRY, jSONObjectAsObject2.getString(TextBundle.TEXT_ENTRY, null)).add("textStartOffset", jSONObjectAsObject2.getInt("textStartOffset", 0)).add("textTruncated", jSONObjectAsObject2.getBoolean("textTruncated", false));
                                JSONObject jSONObject5 = jSONObjectAsObject2.getJSONObject("matchOffsets");
                                jSONArrayArray2.add(jSONObjectAdd4.add("matchOffsets", jSONObject5 == null ? JSON.NULL : JSON.object().add("start", jSONObject5.getInt("start", 0)).add("end", jSONObject5.getInt("end", 0))));
                            }
                        }
                        jSONObjectAdd3.add("matchedStrings", jSONArrayArray2).add("matchedStringsTruncated", jSONObject3.getBoolean("matchedStringsTruncated", false));
                    } else {
                        jSONObject2 = jSONObjectAdd2;
                        if ("native_symbol_name".equals(string)) {
                            jSONObjectM21913.add("snippet", jSONObject3.getString("snippet", null));
                            m23754(jSONObjectM21913, jSONObject3);
                            JSONObject jSONObject6 = jSONObject3.getJSONObject("nativeLocation");
                            m23756(jSONObject6, "itemKind", "name", "demangledName", "imported", "virtualAddress", "fileOffset", "readBytesByteOffset", "byteSize", "xrefAddressKind", "xrefAddress");
                            jSONObjectM21913.add("nativeLocation", JSON.object().add("itemKind", jSONObject6.getString("itemKind", "")).add("name", jSONObject6.getString("name", "")).add("demangledName", jSONObject6.getString("demangledName", "")).add("imported", jSONObject6.getBoolean("imported", false)).add("virtualAddress", jSONObject6.getString("virtualAddress", null)).add("fileOffset", jSONObject6.getString("fileOffset", null)).add("readBytesByteOffset", C3223.m5574(jSONObject6.get("readBytesByteOffset"))).add("byteSize", jSONObject6.getLong("byteSize", 0L)).add("xrefAddressKind", jSONObject6.getString("xrefAddressKind", null)).add("xrefAddress", jSONObject6.getString("xrefAddress", null)));
                        } else if ("native_string".equals(string)) {
                            jSONObjectM21913.add("snippet", jSONObject3.getString("snippet", null));
                            m23754(jSONObjectM21913, jSONObject3);
                            JSONObject jSONObject7 = jSONObject3.getJSONObject("nativeLocation");
                            m23756(jSONObject7, "virtualAddress", "fileOffset", "readBytesByteOffset", "byteSize", "xrefAddressKind", "xrefAddress");
                            jSONObjectM21913.add("nativeLocation", JSON.object().add("virtualAddress", jSONObject7.getString("virtualAddress", null)).add("fileOffset", jSONObject7.getString("fileOffset", null)).add("readBytesByteOffset", C3223.m5574(jSONObject7.get("readBytesByteOffset"))).add("byteSize", jSONObject7.getLong("byteSize", 0L)).add("xrefAddressKind", jSONObject7.getString("xrefAddressKind", null)).add("xrefAddress", jSONObject7.getString("xrefAddress", null)));
                        } else {
                            m23754(jSONObjectM21913, jSONObject3);
                        }
                    }
                    jSONObject2 = jSONObjectAdd2;
                }
                JSONArray jSONArray4 = jSONArray;
                jSONArray4.add(jSONObject2.add("hit", jSONObjectM21913));
                str = null;
                jSONArrayArray = jSONArray4;
                it = it2;
                jSONObjectAdd = jSONObject4;
                str2 = str3;
            }
        }
        String str4 = str2;
        JSONObject jSONObjectAdd5 = jSONObjectAdd.add("hits", jSONArrayArray);
        JSONObject jSONObject8 = jSONObject.getJSONObject("filterHint");
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("filterHint", jSONObject8 == null ? C9417.m21913("code", "", "message", "") : JSON.object().add("code", jSONObject8.getString("code", "")).add("message", jSONObject8.getString("message", "")));
        String string4 = jSONObject.getString("searchTarget", "");
        JSONArray jSONArrayArray3 = JSON.array();
        if ("overview".equals(string4)) {
            for (int i = 0; i < 4; i++) {
                jSONArrayArray3.add(f28256[i]);
            }
        }
        JSONObject jSONObjectAdd7 = jSONObjectAdd6.add("notSearchedTargets", jSONArrayArray3);
        JSONArray jSONArray5 = jSONObject.getJSONArray("skippedScopeErrors");
        JSONArray jSONArrayArray4 = JSON.array();
        if (jSONArray5 != null) {
            Iterator it4 = jSONArray5.iterator();
            while (it4.hasNext()) {
                JSONObject jSONObjectAsObject3 = ((JSONValue) it4.next()).asObject();
                jSONArrayArray4.add(JSON.object().add(str4, jSONObjectAsObject3.getString(str4, null)).add("code", jSONObjectAsObject3.getString("errorCode", null)).add("message", jSONObjectAsObject3.getString("message", null)));
            }
        }
        return C21370.m48410(jSONObjectAdd7.add("skippedScopes", jSONArrayArray4).add("pagination", C3223.m5567(jSONObject.getJSONObject("pagination"))), m23749(jSONObject.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m23762(JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", "")).add("targetLocator", C3223.m5573(jSONObject.get("targetLocator"))).add("referenceKind", jSONObject.getString("referenceKind", null)).add("methodResolution", jSONObject.getString("methodResolution", null));
        JSONArray jSONArray = jSONObject.getJSONArray(AbstractC0213e.f989m);
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("sourceLocator", C3223.m5573(jSONObjectAsObject.get("sourceLocator"))).add("referenceOperand", jSONObjectAsObject.getString("referenceOperand", null)).add("matchKind", jSONObjectAsObject.getString("matchKind", null)).add("dispatchCertainty", jSONObjectAsObject.getString("dispatchCertainty", null)).add("opcode", jSONObjectAsObject.getString("opcode", null)).add("instructionIndex", jSONObjectAsObject.getInt("instructionIndex", 0)));
            }
        }
        return C21370.m48410(jSONObjectAdd.add("refs", jSONArrayArray).add("pagination", C3223.m5567(jSONObject.getJSONObject("pagination"))), m23749(jSONObject.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m23753(C5276 c5276) {
        return C21370.m48412(c5276, JSON.NULL, m23749(c5276.f12407));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m23760(C5276 c5276) {
        return C21370.m48412(c5276, JSON.NULL, m23749(c5276.f12407));
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONArray m23757(JSONArray jSONArray) {
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONValue jSONValue = (JSONValue) it.next();
                if (jSONValue != null && jSONValue.isString()) {
                    jSONArrayArray.add(jSONValue.asString());
                }
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23754(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONValue jSONValueAdd;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("matchOffsets");
        if (jSONObject3 == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = JSON.object().add(TextBundle.TEXT_ENTRY, jSONObject3.getString(TextBundle.TEXT_ENTRY, "")).add("textStartOffset", jSONObject3.getInt("textStartOffset", 0)).add("textTruncated", jSONObject3.getBoolean("textTruncated", false)).add("start", jSONObject3.getInt("start", 0)).add("end", jSONObject3.getInt("end", 0));
        }
        jSONObject.add("matchOffsets", jSONValueAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m23756(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("Native search hit is missing nativeLocation");
        }
        for (String str : strArr) {
            if (!jSONObject.contains(str)) {
                throw new IllegalArgumentException(C21466.m48631("Native search nativeLocation is missing ", str));
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONArray m23749(JSONArray jSONArray) {
        String[] strArr = {"mt_apk_continue", "mt_apk_workspace_open"};
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                String string = jSONObjectAsObject.getString("tool", null);
                for (int i = 0; i < 2; i++) {
                    if (strArr[i].equals(string)) {
                        jSONArrayArray.add(new JSONObject(jSONObjectAsObject));
                        break;
                    }
                }
            }
        }
        return jSONArrayArray;
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m23750() {
        return C3935.m7765("Result for mt_apk_list. data.items[] contains ZIP entries, dex classes, or resource table entries with locators. Pass data.workspaceId and data.editSessionId with follow-up calls; for resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant from previewValue.variant, and required budget fields; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. nextActions carries continuation or recovery calls.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this list result.")).add("editSessionId", C3935.m7772("string", "Edit session id used for this list result; pass this value together with data.workspaceId to mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, or mt_apk_dex_read_class_outline.")).add("view", C3935.m7772("string", "List view that produced this result.")).add("prefix", C3935.m7772("string", "Actual prefix filter; empty string means no filter.")).add("items", C9417.m21913("type", "array", "description", "Current page items. Use item locators with data.workspaceId and data.editSessionId for follow-up calls; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. For resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant, and required budget fields; use previewValue.variant when it is non-null.").add("items", JSON.object().add("anyOf", JSON.array().add(C3935.m7762(JSON.object().add("locator", C3935.m7775("string", "zip_entry locator. Pass data.workspaceId, data.editSessionId, and this locator to mt_apk_read_text or mt_apk_read_bytes.")).add("size", C3935.m7772("integer", "ZIP entry size in bytes, or null when an edited AXML overlay has not been encoded yet.")).add("referencedByResource", C3935.m7774(C3935.m7762(JSON.object().add("resourceLocator", C3935.m7775("string", "Resource locator.")).add("resourceName", C3935.m7775("string", "Resource name.")), "Resource table entry whose value points to this ZIP entry."))), "One ZIP entry item.")).add(C20175.m45657(JSON.object().add("locator", C3935.m7775("string", "dex_class locator. To call mt_apk_dex_read_class_outline, pass data.workspaceId, data.editSessionId, and this full locator.")).add("javaName", C3935.m7775("string", "Java-style class name.")).add("fieldCount", C3935.m7775("integer", "Field count for this class.")), "integer", "Method count for this class.", "methodCount", "One dex class item.")).add(C3935.m7762(JSON.object().add("locator", C3935.m7775("string", "resource locator. To read a value, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator set to this locator, reads[0].variant set to previewValue.variant when non-null, and all required budget fields.")).add("type", C3935.m7775("string", "Resource table type name.")).add("name", C3935.m7775("string", "Resource entry name.")).add("variantCount", C3935.m7775("integer", "Number of real variants for this resource.")).add("valueShape", C3935.m7769("List-only value shape.", "single_value", "item_list", "mixed")).add("previewValue", C3935.m7774(C3935.m7762(JSON.object().add("variant", C3935.m7772("string", "Preview variant.")).add("valueKind", m23752("Preview value kind, or null.")).add("valueSnippet", C3935.m7772("string", "Plain value snippet up to 300 chars, or null.")).add("styled", C3935.m7775(ClassTransform.BOOLEAN, "Whether the preview value is styled.")).add("truncated", C3935.m7775(ClassTransform.BOOLEAN, "Whether the preview snippet was truncated.")).add("fileLocator", C3935.m7772("string", "ZIP entry locator for file_path values, or null.")).add("targetLocator", C3935.m7772("string", "Resource locator for reference/attribute values, or null.")), "Lightweight resource value preview."))), "One resource table entry item."))))).add("pagination", C3935.m7774(C3935.m7767("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_list data."), C3935.m7770(C14214.m32686()), C3935.m7768("Executable continue or recovery actions; copy arguments directly.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry"), C3935.m7763(C12981.m29770(), "mt_apk_list", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ܽ */
    public static JSONObject m23761() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this search result.")).add("editSessionId", C3935.m7772("string", "Edit session id used for this search result; pass this value together with data.workspaceId for follow-up reads, native follow-up tools, mt_apk_dex_read_class_outline for dex_class locators, mt_apk_resource_xref for resource locators, or mt_apk_dex_xref for dex locators."));
        JSONObject jSONObjectM21913 = C9417.m21913("type", "array", "description", "Current page search hits. Use mt_apk_read_text only for text-like locators with data.workspaceId and data.editSessionId. For resource value hits, mt_apk_resource_read needs reads[0].locator, reads[0].variant from hit.variant, and required budget fields. For dex_class hits, pass the full locator to mt_apk_dex_read_class_outline.locator. For native_symbol_name hits, use hit.nativeLocation with mt_apk_native_list_items or mt_apk_native_xref. For native_string hits, use mt_apk_native_xref data scan or mt_apk_read_bytes when hit.nativeLocation provides xref/read_bytes fields. snippet is readable context only; nativeLocation is the structured parameter source.");
        JSONObject jSONObjectAdd2 = JSON.object().add("locator", C3935.m7775("string", "Locator for follow-up reads. Copy data.workspaceId, data.editSessionId, and the full locator string when calling mt_apk_read_text; dex method/field targets are full Smali references. For resource value hits, build mt_apk_resource_read reads[] with this locator and hit.variant, plus required budget fields. For dex_class hits, pass this full locator to mt_apk_dex_read_class_outline.locator if you need fields and methods. For resource hits, pass the locator to mt_apk_resource_xref when resource references are needed; for dex_class, dex_method, or dex_field hits, pass the locator to mt_apk_dex_xref when incoming dex references are needed. For native hits, the locator is the SO zip_entry locator.")).add("searchScope", C3935.m7775("string", "Search scope that produced this hit."));
        JSONObject jSONObjectAdd3 = JSON.object().add("description", "Search hit details selected by hit.kind. Each branch contains only fields that apply to that hit kind.");
        JSONArray jSONArrayAdd = JSON.array().add(C3935.m7762(JSON.object().add("kind", C3935.m7769("Hit kind.", "zip_entry_path", "dex_class_name", "dex_field_name", "dex_method_name")).add("matchKind", C3935.m7772("string", "What part of the candidate matched, or null when unavailable.")).add("matchOffsets", C3935.m7774(m23758())), "ZIP entry or dex name hit.")).add(C3935.m7762(JSON.object().add("kind", C3935.m7769("Hit kind.", "axml_text", "smali_text")).add("matchKind", C3935.m7772("string", "What part of the candidate matched, or null when unavailable.")).add("snippet", C3935.m7772("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("line", C3935.m7775("integer", "0-based line containing the match.")).add("column", C3935.m7775("integer", "0-based column containing the match.")).add("matchOffsets", C3935.m7774(m23758())), "Decoded AXML or Smali text hit.")).add(C3935.m7762(JSON.object().add("kind", C3935.m7769("Hit kind.", "resource_table_name")).add("matchKind", C3935.m7772("string", "What part of the candidate matched, or null when unavailable.")).add("type", C3935.m7775("string", "Resource table type name.")).add("name", C3935.m7775("string", "Resource entry name.")).add("matchField", C3935.m7769("Matched resource field.", "resource_id", "name")).add("matchOffsets", C3935.m7774(m23758())), "Resource table id or name hit.")).add(C3935.m7762(JSON.object().add("kind", C3935.m7769("Hit kind.", "resource_table_value")).add("matchKind", C3935.m7772("string", "What part of the candidate matched, or null when unavailable.")).add("type", C3935.m7775("string", "Resource table type name.")).add("name", C3935.m7775("string", "Resource entry name.")).add("variant", C3935.m7772("string", "Variant containing the matched value, or null.")).add("valueKind", m23752("Top-level resource value kind, or null.")).add("valueSnippet", C3935.m7772("string", "Matched resource value preview up to 300 chars, or null.")).add("styled", C3935.m7775(ClassTransform.BOOLEAN, "Whether the matched resource value is styled text.")).add("truncated", C3935.m7775(ClassTransform.BOOLEAN, "Whether valueSnippet was truncated.")).add("matchField", C3935.m7773("Matched resource field, or null.", "resource_id", "name", C0226b.f1011d, "styledText", "file_path")).add("fileLocator", C3935.m7772("string", "Matched file locator, or null.")).add("targetLocator", C3935.m7772("string", "Matched target resource locator, or null.")).add("itemKey", C3935.m7772("string", "Item key for item value hits, or null.")).add("itemValueKind", m23752("Item value kind for item value hits, or null.")).add("itemKeyLocator", C3935.m7772("string", "Item key resource locator, or null.")).add("matchOffsets", C3935.m7774(m23758())), "Resource table value hit.")).add(C20175.m45657(JSON.object().add("kind", C3935.m7769("Hit kind.", "dex_string_matches")).add("matchKind", C3935.m7772("string", "What part of the candidate matched, or null when unavailable.")).add("snippet", C3935.m7772("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C3935.m7774(m23758())).add("matchCount", C3935.m7775("integer", "Total dex string match count for this locator.")).add("matchedStrings", C9417.m21913("type", "array", "description", "Bounded dex_string match previews.").add("items", C3935.m7762(JSON.object().add(TextBundle.TEXT_ENTRY, C3935.m7772("string", "Continuous window of the original matched string, limited to 120 Unicode code points.")).add("textStartOffset", C3935.m7775("integer", "Zero-based UTF-16 start offset of text in the original string.")).add("textTruncated", C3935.m7775(ClassTransform.BOOLEAN, "Whether text omits any part of the original string.")).add("matchOffsets", C3935.m7774(C3935.m7762(JSON.object().add("start", C3935.m7775("integer", "Inclusive match start in the original string.")).add("end", C3935.m7775("integer", "Exclusive match end in the original string; may extend beyond the text preview when truncated.")), "Matched dex string offsets when includeMatchOffsets=true. Zero-based UTF-16 positions in the original string; subtract the containing item's textStartOffset to locate the match within its text preview."))), "One matched dex string preview."))), ClassTransform.BOOLEAN, "Whether matchedStrings was truncated.", "matchedStringsTruncated", "Dex string matches grouped by one class, field, or method locator."));
        JSONObject jSONObjectAdd4 = JSON.object().add("kind", C3935.m7769("Hit kind.", "native_symbol_name")).add("matchKind", C3935.m7769("Matched ELF name field. Its prefix equals nativeLocation.itemKind; entries only use the raw entries.name field.", "imports.name", "imports.demangledName", "symbols.name", "symbols.demangledName", "entries.name", "relocations.name", "relocations.demangledName")).add("snippet", C3935.m7772("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C3935.m7774(m23758()));
        JSONObject jSONObjectAdd5 = JSON.object().add("itemKind", C3935.m7769("ELF list containing this raw name. Copy it to mt_apk_native_list_items.itemKind.", "imports", "symbols", "entries", "relocations")).add("name", C3935.m7775("string", "Non-empty raw ELF name. Copy it to mt_apk_native_list_items.namePrefix; that tool has no name parameter.")).add("demangledName", C3935.m7775("string", "Readable C++ name when available; entries always use an empty string.")).add("imported", C3935.m7775(ClassTransform.BOOLEAN, "Whether the symbol is imported. imports always use true; relocations use false."));
        m23755(jSONObjectAdd5, "Symbol byte size when known; 0 for imports, relocations, or unknown. It is not a guaranteed function boundary.");
        JSONArray jSONArrayAdd2 = jSONArrayAdd.add(C3935.m7762(jSONObjectAdd4.add("nativeLocation", C3935.m7762(jSONObjectAdd5, "Structured native symbol follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null.")), "Native ELF symbol-like name hit with structured follow-up values."));
        JSONObject jSONObjectAdd6 = JSON.object().add("kind", C3935.m7769("Hit kind.", "native_string")).add("matchKind", C3935.m7769("Matched native string field.", "strings.text")).add("snippet", C3935.m7772("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C3935.m7774(m23758()));
        JSONObject jSONObjectObject = JSON.object();
        m23755(jSONObjectObject, "ELF string byte length when known, otherwise 0.");
        return C3935.m7765("Result for mt_apk_search. data.hits[] contains search hits with locators for follow-up calls; copy data.workspaceId and data.editSessionId into follow-up calls. data.notSearchedTargets lists public targets not covered by target=overview. data.filterHint is a non-blocking hint for likely filter misuse. Search is streamed: data.pagination.totalAvailableCount may be null, meaning unknown rather than zero. Continue while data.pagination.hasMore=true or nextActions includes mt_apk_continue. For native hits, data.hits[i].locator identifies the SO entry and data.hits[i].hit.nativeLocation contains structured values for mt_apk_native_list_items, mt_apk_native_xref, or mt_apk_read_bytes; snippet is readable context only. nextActions carries continuation or retry calls.", C3935.m7762(jSONObjectAdd.add("hits", jSONObjectM21913.add("items", C3935.m7762(jSONObjectAdd2.add("hit", jSONObjectAdd3.add("anyOf", jSONArrayAdd2.add(C3935.m7762(jSONObjectAdd6.add("nativeLocation", C3935.m7762(jSONObjectObject, "Structured native string follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null.")), "Native ELF printable string hit with structured follow-up values.")))), "One search hit. locator is the follow-up read target; hit contains fields for the specific hit.kind."))).add("filterHint", C20175.m45657(JSON.object().add("code", C3935.m7775("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=native_prefix_no_so_candidates means target=native_symbols/native_strings used a non-empty SO ZIP entry prefix that matched no lib/**/*.so candidate. Empty code/message means no hint applies.")).add("notSearchedTargets", C9417.m21913("type", "array", "description", "Public mt_apk_search target values not searched by target=overview. Empty for non-overview searches. This is a coverage hint, not an error list.").add("items", C3935.m7775("string", "A public mt_apk_search target value to call explicitly when needed."))).add("skippedScopes", C9417.m21913("type", "array", "description", "Scopes skipped because a partial search error did not fail the whole overview search.").add("items", C20175.m45657(JSON.object().add("searchScope", C3935.m7775("string", "Skipped search scope.")).add("code", C3935.m7775("string", "Business error code for this skipped scope.")), "string", "Human-readable skipped scope message.", "message", "One skipped search scope error."))).add("pagination", C3935.m7774(C3935.m7767("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_search data."), C3935.m7770(C14214.m32686()), m23764());
    }

    /* JADX INFO: renamed from: ܿ */
    public static JSONObject m23763() {
        return C3935.m7765("Result for mt_apk_dex_xref. data.refs[] contains incoming instruction references; pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator to mt_apk_read_text to inspect containing methods; nextActions carries continuation or retry calls.", C3935.m7762(JSON.object().add("workspaceId", C3935.m7772("string", "Workspace id used for this xref result.")).add("editSessionId", C3935.m7772("string", "Edit session id used for this xref result; pass this value together with data.workspaceId when reading refs[i].sourceLocator.")).add("targetLocator", C3935.m7772("string", "Queried dex_method, dex_field, or dex_class locator.")).add("referenceKind", C3935.m7769("Reference kind for this result.", "method_call", "field_access", "type_reference")).add("methodResolution", C3935.m7769("Method resolution mode used for method scans; field and type scans return not_applicable.", "exact", "slot", "dispatch", "not_applicable")).add("refs", C9417.m21913("type", "array", "description", "Current page incoming instruction references. Pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator to inspect the containing method.").add("items", C20175.m45657(JSON.object().add("sourceLocator", C3935.m7775("string", "Containing dex_method locator. Pass data.workspaceId, data.editSessionId, and this string as mt_apk_read_text.locator to inspect the method body.")).add("referenceOperand", C3935.m7775("string", "Raw bytecode reference operand at the instruction; method and field operands are smali references, type operands are descriptors. It may differ from the target part after the first colon in data.targetLocator for slot/dispatch method matches or array type references.")).add("matchKind", C3935.m7769("Match category: exact_reference means the instruction operand exactly matched the target reference or class component; same_virtual_slot means method operand shares the target virtual slot; possible_virtual_dispatch means runtime method dispatch may reach the target; super_call means invoke-super matched the target under the selected methodResolution while referenceOperand remains the raw bytecode owner.", "exact_reference", "same_virtual_slot", "possible_virtual_dispatch", "super_call")).add("dispatchCertainty", C3935.m7769("Method dispatch certainty; field and type references return not_applicable.", "exact", "possible", "not_applicable")).add("opcode", C3935.m7775("string", "Instruction opcode name.")), "integer", "0-based instruction index within the caller method implementation.", "instructionIndex", "One incoming instruction reference."))).add("pagination", C3935.m7774(C3935.m7767("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_xref data."), C3935.m7770(C14214.m32686()), m23764());
    }

    /* JADX INFO: renamed from: ۧ */
    public static JSONObject m23758() {
        return C20175.m45657(JSON.object().add(TextBundle.TEXT_ENTRY, C3935.m7775("string", "Continuous window of the actual searched candidate, including decoded text or normalized name aliases. Limited to 240 Unicode code points and the response preview budget; may be empty when that budget is exhausted. For native follow-up calls use hit.nativeLocation, not this preview.")).add("textStartOffset", C3935.m7775("integer", "Start offset of text in the original candidate.")).add("textTruncated", C3935.m7775(ClassTransform.BOOLEAN, "Whether text omits any part of the original candidate, including response budget truncation.")).add("start", C3935.m7775("integer", "Inclusive match start in the original candidate.")), "integer", "Exclusive match end in the original candidate; may exceed textStartOffset plus text length when truncated.", "end", "Match offsets and a bounded candidate text window when includeMatchOffsets=true. All offsets are zero-based UTF-16 positions in the original searched candidate, not byte offsets or edit ranges. Subtract textStartOffset from start/end to locate the match within text; a truncated window may omit part or all of the match.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m23752(String str) {
        return C3935.m7773(str, TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "item_list", "null_value", "unparsed");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static JSONObject m23764() {
        return C3935.m7768("Executable continue or retry actions; copy arguments directly.", C3935.m7763(C12981.m29753(), "mt_apk_continue", "continue"), C3935.m7763(C12981.m29764(), "mt_apk_workspace_open", "retry"));
    }
}
