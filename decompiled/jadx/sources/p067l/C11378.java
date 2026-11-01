package p067l;

import android.util.Base64;
import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۢۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6Y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11378 {
    /* JADX INFO: renamed from: ֫ */
    public static String m26329(String str, boolean z, int i, String str2, C22107 c22107, String str3) {
        JSONObject jSONObjectAdd = JSON.object().add("version", str3.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").add("directoryPath", str).add("recursive", z).add("limit", i).add("order", "normalized-name-asc-depth-first-v1").add("policyRevision", str2).add("lastPath", c22107.f69959).add("traversalId", c22107.f69960);
        if (!str3.isEmpty()) {
            jSONObjectAdd.add("queryKey", str3);
        }
        byte[] bytes = jSONObjectAdd.toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(C16111.m36668().digest(bytes), 11);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22107 m26331(String str, String str2, boolean z, int i, String str3, String str4) {
        if (str.isEmpty()) {
            return new C22107("", UUID.randomUUID().toString());
        }
        if (str.length() > 65536) {
            throw m26330(str2, str3);
        }
        try {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46) || iIndexOf == str.length() - 1) {
                throw m26330(str2, str3);
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(C16111.m36668().digest(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw m26330(str2, str3);
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            m26332(jSONObjectAsObject, str2, str3, !str4.isEmpty());
            if ((str4.isEmpty() ? "mcp-file-list-v2" : "mcp-file-search-v1").equals(m26328(jSONObjectAsObject, "version")) && ((str4.isEmpty() || str4.equals(m26328(jSONObjectAsObject, "queryKey"))) && str2.equals(m26328(jSONObjectAsObject, "directoryPath")))) {
                JSONValue jSONValue = jSONObjectAsObject.get("recursive");
                if (jSONValue == null || !jSONValue.isBoolean()) {
                    throw new IllegalArgumentException("Invalid cursor boolean field");
                }
                if (z == jSONValue.asBoolean()) {
                    JSONValue jSONValue2 = jSONObjectAsObject.get("limit");
                    if (jSONValue2 == null || !jSONValue2.isNumber()) {
                        throw new IllegalArgumentException("Invalid cursor integer field");
                    }
                    if (i == jSONValue2.asInt() && "normalized-name-asc-depth-first-v1".equals(m26328(jSONObjectAsObject, "order")) && str3.equals(m26328(jSONObjectAsObject, "policyRevision"))) {
                        String strM26328 = m26328(jSONObjectAsObject, "lastPath");
                        String strM26329 = m26328(jSONObjectAsObject, "traversalId");
                        if (strM26328.isEmpty() || strM26329.isEmpty()) {
                            throw m26330(str2, str3);
                        }
                        for (String str5 : strM26328.split("/", -1)) {
                            if (str5.isEmpty() || str5.equals(".") || str5.equals("..")) {
                                throw m26330(str2, str3);
                            }
                        }
                        if (!z && strM26328.indexOf(47) >= 0) {
                            throw m26330(str2, str3);
                        }
                        return new C22107(strM26328, strM26329);
                    }
                }
            }
            throw m26330(str2, str3);
        } catch (RuntimeException unused) {
            throw m26330(str2, str3);
        } catch (C5276 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26332(JSONObject jSONObject, String str, String str2, boolean z) throws C5276 {
        Object[] objArr = {"version", "directoryPath", "recursive", "limit", "order", "policyRevision", "lastPath", "traversalId"};
        HashSet hashSet = new HashSet(8);
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C21562.unmodifiableSet(hashSet));
        if (z) {
            linkedHashSet.add("queryKey");
        }
        HashSet hashSet2 = new HashSet();
        for (String str3 : jSONObject.names()) {
            if (!linkedHashSet.contains(str3) || !hashSet2.add(str3)) {
                throw m26330(str, str2);
            }
        }
        if (!hashSet2.equals(linkedHashSet)) {
            throw m26330(str, str2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m26328(JSONObject jSONObject, String str) {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw new IllegalArgumentException("Invalid cursor string field");
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m26330(String str, String str2) {
        JSONObject jSONObjectAdd = JSON.object().add("operation", "list_cursor");
        if (str != null) {
            jSONObjectAdd.add(MotionUtils.EASING_TYPE_PATH, str);
        }
        if (str2 != null) {
            jSONObjectAdd.add("policyRevision", str2);
        }
        return C5276.m11407("FILE_INVALID_CURSOR", "The file cursor is invalid or no longer matches this request. Restart the traversal with cursor=\"\".", "warning", (JSONArray) null, jSONObjectAdd);
    }
}
