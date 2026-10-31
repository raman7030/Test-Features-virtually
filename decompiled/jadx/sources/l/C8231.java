package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.d;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.core.AnnotationHandler;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۠ܳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S79P */
/* JADX INFO: loaded from: classes3.dex */
public final class C8231 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f25346 = {"smali", "native_symbols", "native_strings", "resource_table_file_paths"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m21782(JSONObject jSONObject) {
        JSONValue jSONValueAdd;
        JSONValue jSONValueAdd2;
        JSONObject jSONObjectAdd;
        JSONObject jSONObjectAdd2 = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("temporary", jSONObject.getBoolean("temporary", false)).add("apkFileName", jSONObject.getString("apkFileName", null)).add("packageName", jSONObject.getString("packageName", null)).add("versionName", jSONObject.getString("versionName", null)).add("versionCode", C0899.m3255(jSONObject.get("versionCode"))).add("minSdk", C0899.m3255(jSONObject.get("minSdk"))).add("targetSdk", C0899.m3255(jSONObject.get("targetSdk"))).add("appLabel", jSONObject.getString("appLabel", null));
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
            jSONObjectAdd = JSON.object().add("available", false).add("signaturePresent", false).add("schemes", JSON.array()).add("hasDifferentCertificates", false).add("certificates", JSON.array()).add(d.O, "Signature summary is unavailable.");
        } else {
            JSONObject jSONObjectAdd5 = JSON.object().add("available", jSONObject4.getBoolean("available", false)).add("signaturePresent", jSONObject4.getBoolean("signaturePresent", false)).add("schemes", m21788(jSONObject4.getJSONArray("schemes"))).add("hasDifferentCertificates", jSONObject4.getBoolean("hasDifferentCertificates", false));
            JSONArray jSONArray = jSONObject4.getJSONArray("certificates");
            JSONArray jSONArrayArray = JSON.array();
            if (jSONArray != null) {
                Iterator it = jSONArray.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                    jSONArrayArray.add(JSON.object().add("schemes", m21788(jSONObjectAsObject.getJSONArray("schemes"))).add("sha256", jSONObjectAsObject.getString("sha256", null)));
                }
            }
            jSONObjectAdd = jSONObjectAdd5.add("certificates", jSONArrayArray).add(d.O, jSONObject4.getString(d.O, null));
        }
        return C19993.m46095(jSONObjectAdd4.add("signature", jSONObjectAdd).add("resourceTableSummaryError", jSONObject.getString("resourceTableSummaryError", null)), jSONObject.getJSONArray("nextActions"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21786(JSONObject jSONObject, String str) {
        jSONObject.add("virtualAddress", C1648.m5542("string", "SO-local virtual address as lowercase 0x hex, or null.")).add("fileOffset", C1648.m5542("string", "SO-local file offset as lowercase 0x hex, or null.")).add("readBytesByteOffset", C1648.m5542("integer", "Decimal byteOffset safe to pass to mt_apk_read_bytes, or null when unavailable or outside the integer range.")).add("byteSize", C1648.m5545("integer", "Non-negative. ".concat(str))).add("xrefAddressKind", C1648.m5543("addressKind to pass to mt_apk_native_xref, or null when xref is not directly available.", "virtual", "file_offset")).add("xrefAddress", C1648.m5542("string", "Address string to pass to mt_apk_native_xref, or null when unavailable."));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21790(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject jSONObject2;
        String str = null;
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", ""));
        JSONArray jSONArray2 = jSONObject.getJSONArray(e.m);
        JSONArray jSONArrayArray = JSON.array();
        String str2 = "searchScope";
        if (jSONArray2 != null) {
            Iterator it = jSONArray2.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                JSONObject jSONObjectAdd2 = JSON.object().add("locator", C0899.m3254(jSONObjectAsObject.get("locator"))).add(str2, jSONObjectAsObject.getString(str2, str));
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
                JSONObject jSONObjectM19939 = C7416.m19939("kind", string, "matchKind", string2);
                if ("axml_text".equals(string) || "smali_text".equals(string)) {
                    jSONArray = jSONArrayArray;
                    jSONObject2 = jSONObjectAdd2;
                    jSONObjectM19939.add("snippet", jSONObject3.getString("snippet", null)).add("line", jSONObject3.getInt("line", 0)).add("column", jSONObject3.getInt("column", 0));
                    m21785(jSONObjectM19939, jSONObject3);
                } else {
                    jSONArray = jSONArrayArray;
                    if ("resource_table_name".equals(string)) {
                        String string3 = jSONObject3.getString("matchField", null);
                        if (string3 == null) {
                            string3 = "id".equals(string2) ? "resource_id" : "name";
                        }
                        jSONObjectM19939.add("type", jSONObject3.getString("type", null)).add("name", jSONObject3.getString("name", null)).add("matchField", string3);
                        m21785(jSONObjectM19939, jSONObject3);
                    } else if ("resource_table_value".equals(string)) {
                        jSONObjectM19939.add("type", jSONObject3.getString("type", null)).add("name", jSONObject3.getString("name", null)).add("variant", jSONObject3.getString("variant", null)).add("valueKind", jSONObject3.getString("valueKind", null)).add("valueSnippet", jSONObject3.getString("valueSnippet", null)).add("styled", jSONObject3.getBoolean("styled", false)).add("truncated", jSONObject3.getBoolean("truncated", false)).add("matchField", jSONObject3.getString("matchField", null)).add("fileLocator", C0899.m3254(jSONObject3.get("fileLocator"))).add("targetLocator", C0899.m3254(jSONObject3.get("targetLocator"))).add("itemKey", jSONObject3.getString("itemKey", null)).add("itemValueKind", jSONObject3.getString("itemValueKind", null)).add("itemKeyLocator", C0899.m3254(jSONObject3.get("itemKeyLocator")));
                        m21785(jSONObjectM19939, jSONObject3);
                    } else if ("dex_string_matches".equals(string)) {
                        jSONObjectM19939.add("snippet", jSONObject3.getString("snippet", null));
                        m21785(jSONObjectM19939, jSONObject3);
                        JSONObject jSONObjectAdd3 = jSONObjectM19939.add("matchCount", jSONObject3.getInt("matchCount", 0));
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
                            jSONObjectM19939.add("snippet", jSONObject3.getString("snippet", null));
                            m21785(jSONObjectM19939, jSONObject3);
                            JSONObject jSONObject6 = jSONObject3.getJSONObject("nativeLocation");
                            m21787(jSONObject6, "itemKind", "name", "demangledName", "imported", "virtualAddress", "fileOffset", "readBytesByteOffset", "byteSize", "xrefAddressKind", "xrefAddress");
                            jSONObjectM19939.add("nativeLocation", JSON.object().add("itemKind", jSONObject6.getString("itemKind", "")).add("name", jSONObject6.getString("name", "")).add("demangledName", jSONObject6.getString("demangledName", "")).add("imported", jSONObject6.getBoolean("imported", false)).add("virtualAddress", jSONObject6.getString("virtualAddress", null)).add("fileOffset", jSONObject6.getString("fileOffset", null)).add("readBytesByteOffset", C0899.m3255(jSONObject6.get("readBytesByteOffset"))).add("byteSize", jSONObject6.getLong("byteSize", 0L)).add("xrefAddressKind", jSONObject6.getString("xrefAddressKind", null)).add("xrefAddress", jSONObject6.getString("xrefAddress", null)));
                        } else if ("native_string".equals(string)) {
                            jSONObjectM19939.add("snippet", jSONObject3.getString("snippet", null));
                            m21785(jSONObjectM19939, jSONObject3);
                            JSONObject jSONObject7 = jSONObject3.getJSONObject("nativeLocation");
                            m21787(jSONObject7, "virtualAddress", "fileOffset", "readBytesByteOffset", "byteSize", "xrefAddressKind", "xrefAddress");
                            jSONObjectM19939.add("nativeLocation", JSON.object().add("virtualAddress", jSONObject7.getString("virtualAddress", null)).add("fileOffset", jSONObject7.getString("fileOffset", null)).add("readBytesByteOffset", C0899.m3255(jSONObject7.get("readBytesByteOffset"))).add("byteSize", jSONObject7.getLong("byteSize", 0L)).add("xrefAddressKind", jSONObject7.getString("xrefAddressKind", null)).add("xrefAddress", jSONObject7.getString("xrefAddress", null)));
                        } else {
                            m21785(jSONObjectM19939, jSONObject3);
                        }
                    }
                    jSONObject2 = jSONObjectAdd2;
                }
                JSONArray jSONArray4 = jSONArray;
                jSONArray4.add(jSONObject2.add("hit", jSONObjectM19939));
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
        JSONObject jSONObjectAdd6 = jSONObjectAdd5.add("filterHint", jSONObject8 == null ? C7416.m19939("code", "", "message", "") : JSON.object().add("code", jSONObject8.getString("code", "")).add("message", jSONObject8.getString("message", "")));
        String string4 = jSONObject.getString("searchTarget", "");
        JSONArray jSONArrayArray3 = JSON.array();
        if ("overview".equals(string4)) {
            for (int i = 0; i < 4; i++) {
                jSONArrayArray3.add(f25346[i]);
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
        return C19993.m46095(jSONObjectAdd7.add("skippedScopes", jSONArrayArray4).add("pagination", C0899.m3248(jSONObject.getJSONObject("pagination"))), m21780(jSONObject.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21793(JSONObject jSONObject) {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", jSONObject.getString("workspaceId", null)).add("editSessionId", jSONObject.getString("editSessionId", "")).add("targetLocator", C0899.m3254(jSONObject.get("targetLocator"))).add("referenceKind", jSONObject.getString("referenceKind", null)).add("methodResolution", jSONObject.getString("methodResolution", null));
        JSONArray jSONArray = jSONObject.getJSONArray(e.m);
        JSONArray jSONArrayArray = JSON.array();
        if (jSONArray != null) {
            Iterator it = jSONArray.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectAsObject = ((JSONValue) it.next()).asObject();
                jSONArrayArray.add(JSON.object().add("sourceLocator", C0899.m3254(jSONObjectAsObject.get("sourceLocator"))).add("referenceOperand", jSONObjectAsObject.getString("referenceOperand", null)).add("matchKind", jSONObjectAsObject.getString("matchKind", null)).add("dispatchCertainty", jSONObjectAsObject.getString("dispatchCertainty", null)).add("opcode", jSONObjectAsObject.getString("opcode", null)).add("instructionIndex", jSONObjectAsObject.getInt("instructionIndex", 0)));
            }
        }
        return C19993.m46095(jSONObjectAdd.add("refs", jSONArrayArray).add("pagination", C0899.m3248(jSONObject.getJSONObject("pagination"))), m21780(jSONObject.getJSONArray("nextActions")));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m21784(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, m21780(c3059.f9604));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21791(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, m21780(c3059.f9604));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONArray m21788(JSONArray jSONArray) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21785(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONValue jSONValueAdd;
        JSONObject jSONObject3 = jSONObject2.getJSONObject("matchOffsets");
        if (jSONObject3 == null) {
            jSONValueAdd = JSON.NULL;
        } else {
            jSONValueAdd = JSON.object().add(TextBundle.TEXT_ENTRY, jSONObject3.getString(TextBundle.TEXT_ENTRY, "")).add("textStartOffset", jSONObject3.getInt("textStartOffset", 0)).add("textTruncated", jSONObject3.getBoolean("textTruncated", false)).add("start", jSONObject3.getInt("start", 0)).add("end", jSONObject3.getInt("end", 0));
        }
        jSONObject.add("matchOffsets", jSONValueAdd);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21787(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("Native search hit is missing nativeLocation");
        }
        for (String str : strArr) {
            if (!jSONObject.contains(str)) {
                throw new IllegalArgumentException(C20094.m46315("Native search nativeLocation is missing ", str));
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONArray m21780(JSONArray jSONArray) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m21781() {
        return C1648.m5535("Result for mt_apk_list. data.items[] contains ZIP entries, dex classes, or resource table entries with locators. Pass data.workspaceId and data.editSessionId with follow-up calls; for resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant from previewValue.variant, and required budget fields; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. nextActions carries continuation or recovery calls.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this list result.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this list result; pass this value together with data.workspaceId to mt_apk_read_text, mt_apk_read_bytes, mt_apk_resource_read, or mt_apk_dex_read_class_outline.")).add("view", C1648.m5542("string", "List view that produced this result.")).add("prefix", C1648.m5542("string", "Actual prefix filter; empty string means no filter.")).add("items", C7416.m19939("type", "array", "description", "Current page items. Use item locators with data.workspaceId and data.editSessionId for follow-up calls; for dex_class items, pass the full locator to mt_apk_dex_read_class_outline.locator. For resource items, mt_apk_resource_read needs reads[0].locator, reads[0].variant, and required budget fields; use previewValue.variant when it is non-null.").add("items", JSON.object().add("anyOf", JSON.array().add(C1648.m5532(JSON.object().add("locator", C1648.m5545("string", "zip_entry locator. Pass data.workspaceId, data.editSessionId, and this locator to mt_apk_read_text or mt_apk_read_bytes.")).add("size", C1648.m5542("integer", "ZIP entry size in bytes, or null when an edited AXML overlay has not been encoded yet.")).add("referencedByResource", C1648.m5544(C1648.m5532(JSON.object().add("resourceLocator", C1648.m5545("string", "Resource locator.")).add("resourceName", C1648.m5545("string", "Resource name.")), "Resource table entry whose value points to this ZIP entry."))), "One ZIP entry item.")).add(C18736.m43390(JSON.object().add("locator", C1648.m5545("string", "dex_class locator. To call mt_apk_dex_read_class_outline, pass data.workspaceId, data.editSessionId, and this full locator.")).add("javaName", C1648.m5545("string", "Java-style class name.")).add("fieldCount", C1648.m5545("integer", "Field count for this class.")), "integer", "Method count for this class.", "methodCount", "One dex class item.")).add(C1648.m5532(JSON.object().add("locator", C1648.m5545("string", "resource locator. To read a value, call mt_apk_resource_read with data.workspaceId, data.editSessionId, reads[0].locator set to this locator, reads[0].variant set to previewValue.variant when non-null, and all required budget fields.")).add("type", C1648.m5545("string", "Resource table type name.")).add("name", C1648.m5545("string", "Resource entry name.")).add("variantCount", C1648.m5545("integer", "Number of real variants for this resource.")).add("valueShape", C1648.m5539("List-only value shape.", "single_value", "item_list", "mixed")).add("previewValue", C1648.m5544(C1648.m5532(JSON.object().add("variant", C1648.m5542("string", "Preview variant.")).add("valueKind", m21783("Preview value kind, or null.")).add("valueSnippet", C1648.m5542("string", "Plain value snippet up to 300 chars, or null.")).add("styled", C1648.m5545(ClassTransform.BOOLEAN, "Whether the preview value is styled.")).add("truncated", C1648.m5545(ClassTransform.BOOLEAN, "Whether the preview snippet was truncated.")).add("fileLocator", C1648.m5542("string", "ZIP entry locator for file_path values, or null.")).add("targetLocator", C1648.m5542("string", "Resource locator for reference/attribute values, or null.")), "Lightweight resource value preview."))), "One resource table entry item."))))).add("pagination", C1648.m5544(C1648.m5537("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_list data."), C1648.m5540(C12464.m30621()), C1648.m5538("Executable continue or recovery actions; copy arguments directly.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry"), C1648.m5533(C11166.m27708(), "mt_apk_list", "verify_workspace")));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21792() {
        JSONObject jSONObjectAdd = JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this search result.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this search result; pass this value together with data.workspaceId for follow-up reads, native follow-up tools, mt_apk_dex_read_class_outline for dex_class locators, mt_apk_resource_xref for resource locators, or mt_apk_dex_xref for dex locators."));
        JSONObject jSONObjectM19939 = C7416.m19939("type", "array", "description", "Current page search hits. Use mt_apk_read_text only for text-like locators with data.workspaceId and data.editSessionId. For resource value hits, mt_apk_resource_read needs reads[0].locator, reads[0].variant from hit.variant, and required budget fields. For dex_class hits, pass the full locator to mt_apk_dex_read_class_outline.locator. For native_symbol_name hits, use hit.nativeLocation with mt_apk_native_list_items or mt_apk_native_xref. For native_string hits, use mt_apk_native_xref data scan or mt_apk_read_bytes when hit.nativeLocation provides xref/read_bytes fields. snippet is readable context only; nativeLocation is the structured parameter source.");
        JSONObject jSONObjectAdd2 = JSON.object().add("locator", C1648.m5545("string", "Locator for follow-up reads. Copy data.workspaceId, data.editSessionId, and the full locator string when calling mt_apk_read_text; dex method/field targets are full Smali references. For resource value hits, build mt_apk_resource_read reads[] with this locator and hit.variant, plus required budget fields. For dex_class hits, pass this full locator to mt_apk_dex_read_class_outline.locator if you need fields and methods. For resource hits, pass the locator to mt_apk_resource_xref when resource references are needed; for dex_class, dex_method, or dex_field hits, pass the locator to mt_apk_dex_xref when incoming dex references are needed. For native hits, the locator is the SO zip_entry locator.")).add("searchScope", C1648.m5545("string", "Search scope that produced this hit."));
        JSONObject jSONObjectAdd3 = JSON.object().add("description", "Search hit details selected by hit.kind. Each branch contains only fields that apply to that hit kind.");
        JSONArray jSONArrayAdd = JSON.array().add(C1648.m5532(JSON.object().add("kind", C1648.m5539("Hit kind.", "zip_entry_path", "dex_class_name", "dex_field_name", "dex_method_name")).add("matchKind", C1648.m5542("string", "What part of the candidate matched, or null when unavailable.")).add("matchOffsets", C1648.m5544(m21789())), "ZIP entry or dex name hit.")).add(C1648.m5532(JSON.object().add("kind", C1648.m5539("Hit kind.", "axml_text", "smali_text")).add("matchKind", C1648.m5542("string", "What part of the candidate matched, or null when unavailable.")).add("snippet", C1648.m5542("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("line", C1648.m5545("integer", "0-based line containing the match.")).add("column", C1648.m5545("integer", "0-based column containing the match.")).add("matchOffsets", C1648.m5544(m21789())), "Decoded AXML or Smali text hit.")).add(C1648.m5532(JSON.object().add("kind", C1648.m5539("Hit kind.", "resource_table_name")).add("matchKind", C1648.m5542("string", "What part of the candidate matched, or null when unavailable.")).add("type", C1648.m5545("string", "Resource table type name.")).add("name", C1648.m5545("string", "Resource entry name.")).add("matchField", C1648.m5539("Matched resource field.", "resource_id", "name")).add("matchOffsets", C1648.m5544(m21789())), "Resource table id or name hit.")).add(C1648.m5532(JSON.object().add("kind", C1648.m5539("Hit kind.", "resource_table_value")).add("matchKind", C1648.m5542("string", "What part of the candidate matched, or null when unavailable.")).add("type", C1648.m5545("string", "Resource table type name.")).add("name", C1648.m5545("string", "Resource entry name.")).add("variant", C1648.m5542("string", "Variant containing the matched value, or null.")).add("valueKind", m21783("Top-level resource value kind, or null.")).add("valueSnippet", C1648.m5542("string", "Matched resource value preview up to 300 chars, or null.")).add("styled", C1648.m5545(ClassTransform.BOOLEAN, "Whether the matched resource value is styled text.")).add("truncated", C1648.m5545(ClassTransform.BOOLEAN, "Whether valueSnippet was truncated.")).add("matchField", C1648.m5543("Matched resource field, or null.", "resource_id", "name", b.d, "styledText", "file_path")).add("fileLocator", C1648.m5542("string", "Matched file locator, or null.")).add("targetLocator", C1648.m5542("string", "Matched target resource locator, or null.")).add("itemKey", C1648.m5542("string", "Item key for item value hits, or null.")).add("itemValueKind", m21783("Item value kind for item value hits, or null.")).add("itemKeyLocator", C1648.m5542("string", "Item key resource locator, or null.")).add("matchOffsets", C1648.m5544(m21789())), "Resource table value hit.")).add(C18736.m43390(JSON.object().add("kind", C1648.m5539("Hit kind.", "dex_string_matches")).add("matchKind", C1648.m5542("string", "What part of the candidate matched, or null when unavailable.")).add("snippet", C1648.m5542("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C1648.m5544(m21789())).add("matchCount", C1648.m5545("integer", "Total dex string match count for this locator.")).add("matchedStrings", C7416.m19939("type", "array", "description", "Bounded dex_string match previews.").add("items", C1648.m5532(JSON.object().add(TextBundle.TEXT_ENTRY, C1648.m5542("string", "Continuous window of the original matched string, limited to 120 Unicode code points.")).add("textStartOffset", C1648.m5545("integer", "Zero-based UTF-16 start offset of text in the original string.")).add("textTruncated", C1648.m5545(ClassTransform.BOOLEAN, "Whether text omits any part of the original string.")).add("matchOffsets", C1648.m5544(C1648.m5532(JSON.object().add("start", C1648.m5545("integer", "Inclusive match start in the original string.")).add("end", C1648.m5545("integer", "Exclusive match end in the original string; may extend beyond the text preview when truncated.")), "Matched dex string offsets when includeMatchOffsets=true. Zero-based UTF-16 positions in the original string; subtract the containing item's textStartOffset to locate the match within its text preview."))), "One matched dex string preview."))), ClassTransform.BOOLEAN, "Whether matchedStrings was truncated.", "matchedStringsTruncated", "Dex string matches grouped by one class, field, or method locator."));
        JSONObject jSONObjectAdd4 = JSON.object().add("kind", C1648.m5539("Hit kind.", "native_symbol_name")).add("matchKind", C1648.m5539("Matched ELF name field. Its prefix equals nativeLocation.itemKind; entries only use the raw entries.name field.", "imports.name", "imports.demangledName", "symbols.name", "symbols.demangledName", "entries.name", "relocations.name", "relocations.demangledName")).add("snippet", C1648.m5542("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C1648.m5544(m21789()));
        JSONObject jSONObjectAdd5 = JSON.object().add("itemKind", C1648.m5539("ELF list containing this raw name. Copy it to mt_apk_native_list_items.itemKind.", "imports", "symbols", "entries", "relocations")).add("name", C1648.m5545("string", "Non-empty raw ELF name. Copy it to mt_apk_native_list_items.namePrefix; that tool has no name parameter.")).add("demangledName", C1648.m5545("string", "Readable C++ name when available; entries always use an empty string.")).add("imported", C1648.m5545(ClassTransform.BOOLEAN, "Whether the symbol is imported. imports always use true; relocations use false."));
        m21786(jSONObjectAdd5, "Symbol byte size when known; 0 for imports, relocations, or unknown. It is not a guaranteed function boundary.");
        JSONArray jSONArrayAdd2 = jSONArrayAdd.add(C1648.m5532(jSONObjectAdd4.add("nativeLocation", C1648.m5532(jSONObjectAdd5, "Structured native symbol follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null.")), "Native ELF symbol-like name hit with structured follow-up values."));
        JSONObject jSONObjectAdd6 = JSON.object().add("kind", C1648.m5539("Hit kind.", "native_string")).add("matchKind", C1648.m5539("Matched native string field.", "strings.text")).add("snippet", C1648.m5542("string", "Bounded readable preview, or null when disabled or omitted by the preview budget.")).add("matchOffsets", C1648.m5544(m21789()));
        JSONObject jSONObjectObject = JSON.object();
        m21786(jSONObjectObject, "ELF string byte length when known, otherwise 0.");
        return C1648.m5535("Result for mt_apk_search. data.hits[] contains search hits with locators for follow-up calls; copy data.workspaceId and data.editSessionId into follow-up calls. data.notSearchedTargets lists public targets not covered by target=overview. data.filterHint is a non-blocking hint for likely filter misuse. Search is streamed: data.pagination.totalAvailableCount may be null, meaning unknown rather than zero. Continue while data.pagination.hasMore=true or nextActions includes mt_apk_continue. For native hits, data.hits[i].locator identifies the SO entry and data.hits[i].hit.nativeLocation contains structured values for mt_apk_native_list_items, mt_apk_native_xref, or mt_apk_read_bytes; snippet is readable context only. nextActions carries continuation or retry calls.", C1648.m5532(jSONObjectAdd.add("hits", jSONObjectM19939.add("items", C1648.m5532(jSONObjectAdd2.add("hit", jSONObjectAdd3.add("anyOf", jSONArrayAdd2.add(C1648.m5532(jSONObjectAdd6.add("nativeLocation", C1648.m5532(jSONObjectObject, "Structured native string follow-up values. xrefAddressKind and xrefAddress are either both non-null or both null.")), "Native ELF printable string hit with structured follow-up values.")))), "One search hit. locator is the follow-up read target; hit contains fields for the specific hit.kind."))).add("filterHint", C18736.m43390(JSON.object().add("code", C1648.m5545("string", "Stable hint code, or empty string when no hint applies.")), "string", "Short hint message, or empty string when no hint applies.", "message", "Non-blocking filter hint. code=native_prefix_no_so_candidates means target=native_symbols/native_strings used a non-empty SO ZIP entry prefix that matched no lib/**/*.so candidate. Empty code/message means no hint applies.")).add("notSearchedTargets", C7416.m19939("type", "array", "description", "Public mt_apk_search target values not searched by target=overview. Empty for non-overview searches. This is a coverage hint, not an error list.").add("items", C1648.m5545("string", "A public mt_apk_search target value to call explicitly when needed."))).add("skippedScopes", C7416.m19939("type", "array", "description", "Scopes skipped because a partial search error did not fail the whole overview search.").add("items", C18736.m43390(JSON.object().add("searchScope", C1648.m5545("string", "Skipped search scope.")).add("code", C1648.m5545("string", "Business error code for this skipped scope.")), "string", "Human-readable skipped scope message.", "message", "One skipped search scope error."))).add("pagination", C1648.m5544(C1648.m5537("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_search data."), C1648.m5540(C12464.m30621()), m21795());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21794() {
        return C1648.m5535("Result for mt_apk_dex_xref. data.refs[] contains incoming instruction references; pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator to mt_apk_read_text to inspect containing methods; nextActions carries continuation or retry calls.", C1648.m5532(JSON.object().add("workspaceId", C1648.m5542("string", "Workspace id used for this xref result.")).add("editSessionId", C1648.m5542("string", "Edit session id used for this xref result; pass this value together with data.workspaceId when reading refs[i].sourceLocator.")).add("targetLocator", C1648.m5542("string", "Queried dex_method, dex_field, or dex_class locator.")).add("referenceKind", C1648.m5539("Reference kind for this result.", "method_call", "field_access", "type_reference")).add("methodResolution", C1648.m5539("Method resolution mode used for method scans; field and type scans return not_applicable.", "exact", "slot", "dispatch", "not_applicable")).add("refs", C7416.m19939("type", "array", "description", "Current page incoming instruction references. Pass data.workspaceId, data.editSessionId, and refs[i].sourceLocator as mt_apk_read_text.locator to inspect the containing method.").add("items", C18736.m43390(JSON.object().add("sourceLocator", C1648.m5545("string", "Containing dex_method locator. Pass data.workspaceId, data.editSessionId, and this string as mt_apk_read_text.locator to inspect the method body.")).add("referenceOperand", C1648.m5545("string", "Raw bytecode reference operand at the instruction; method and field operands are smali references, type operands are descriptors. It may differ from the target part after the first colon in data.targetLocator for slot/dispatch method matches or array type references.")).add("matchKind", C1648.m5539("Match category: exact_reference means the instruction operand exactly matched the target reference or class component; same_virtual_slot means method operand shares the target virtual slot; possible_virtual_dispatch means runtime method dispatch may reach the target; super_call means invoke-super matched the target under the selected methodResolution while referenceOperand remains the raw bytecode owner.", "exact_reference", "same_virtual_slot", "possible_virtual_dispatch", "super_call")).add("dispatchCertainty", C1648.m5539("Method dispatch certainty; field and type references return not_applicable.", "exact", "possible", "not_applicable")).add("opcode", C1648.m5545("string", "Instruction opcode name.")), "integer", "0-based instruction index within the caller method implementation.", "instructionIndex", "One incoming instruction reference."))).add("pagination", C1648.m5544(C1648.m5537("Number of items returned on this page.", "Hard maximum limit accepted by mt_apk_continue for this cursor; keep nextActions[0].arguments.limit within this value.", "Total available count when cheaply known; null means unknown, not zero. For streamed results such as search, continue based on hasMore, nextCursor, or nextActions."))), "Successful mt_apk_dex_xref data."), C1648.m5540(C12464.m30621()), m21795());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21789() {
        return C18736.m43390(JSON.object().add(TextBundle.TEXT_ENTRY, C1648.m5545("string", "Continuous window of the actual searched candidate, including decoded text or normalized name aliases. Limited to 240 Unicode code points and the response preview budget; may be empty when that budget is exhausted. For native follow-up calls use hit.nativeLocation, not this preview.")).add("textStartOffset", C1648.m5545("integer", "Start offset of text in the original candidate.")).add("textTruncated", C1648.m5545(ClassTransform.BOOLEAN, "Whether text omits any part of the original candidate, including response budget truncation.")).add("start", C1648.m5545("integer", "Inclusive match start in the original candidate.")), "integer", "Exclusive match end in the original candidate; may exceed textStartOffset plus text length when truncated.", "end", "Match offsets and a bounded candidate text window when includeMatchOffsets=true. All offsets are zero-based UTF-16 positions in the original searched candidate, not byte offsets or edit ranges. Subtract textStartOffset from start/end to locate the match within text; a truncated window may omit part or all of the match.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m21783(String str) {
        return C1648.m5543(str, TextBundle.TEXT_ENTRY, "styled_text", "number", ClassTransform.BOOLEAN, ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "dimension", "fraction", Name.REFER, AnnotationHandler.ATTRIBUTE, "file_path", "item_list", "null_value", "unparsed");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static JSONObject m21795() {
        return C1648.m5538("Executable continue or retry actions; copy arguments directly.", C1648.m5533(C11166.m27691(), "mt_apk_continue", "continue"), C1648.m5533(C11166.m27702(), "mt_apk_workspace_open", "retry"));
    }
}
