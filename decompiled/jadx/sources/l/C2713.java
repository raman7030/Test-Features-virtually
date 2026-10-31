package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۖᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2713 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f8467;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f8468;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f8469;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m8439(int i) {
        return C18307.m42645(i, "patches[", "]");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Patch File Bytes";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_patch_bytes";
    }

    public C2713(C12821 c12821) {
        this.f8469 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f8467 == null) {
            this.f8467 = C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Current 16-digit lowercase hex version token; missing is not accepted.")).add("patches", C7416.m19939("type", "array", "description", "Runtime accepts 1..200 non-overlapping items.").add("items", C18736.m43390(JSON.object().add("byteOffset", C1648.m5545("integer", "Zero-based byte offset in 0..9007199254740991.")).add("expectedHex", C1648.m5545("string", "Current non-empty bytes as even-length hexadecimal without separators.")), "string", "Equal-length replacement bytes as hexadecimal without separators.", "replacementHex", "One equal-length raw byte patch."))), "Arguments for mt_file_patch_bytes.");
        }
        return this.f8467;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f8468 == null) {
            this.f8468 = C1648.m5535("Result for mt_file_patch_bytes.", C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute target path.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether target bytes changed.")).add("warnings", C7416.m19939("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C1648.m5545("string", "One warning message."))).add("size", C1648.m5545("integer", "Final raw byte size.")).add("targetVersion", C1648.m5545("string", "Final whole-file version token of 16 lowercase hex digits.")), "integer", "Total requested patch bytes, including no-op replacements.", "bytesPatched", "Successful local byte patch result."), C3395.m10357("mt_file_patch_bytes"), C1648.m5538("Success and expected-byte mismatch return a read_bytes action.", C1648.m5533(m8442(), "mt_file_read_bytes", "inspect"), C1648.m5533(m8442(), "mt_file_read_bytes", "retry")));
        }
        return this.f8468;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_patch_bytes", c3059);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:17:0x0033->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8440(C14937 c14937, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) {
        long j;
        long j2;
        Iterator it;
        int length;
        C1718 c1718;
        try {
            C10891.m27198(c14937, arrayList);
            C10891.m27197(c14937, bufferedOutputStream, arrayList);
        } catch (C3059 e) {
            if ("FILE_PATCH_EXPECTED_MISMATCH".equals(e.f9610)) {
                JSONValue jSONValue = e.f9609.get("byteOffset");
                if (jSONValue == null || !jSONValue.isNumber()) {
                    j = 0;
                } else {
                    try {
                        j = Long.parseLong(jSONValue.toString());
                    } catch (NumberFormatException unused) {
                        j = 0;
                        j2 = j;
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            c1718 = (C1718) it.next();
                            if (c1718.f5943 != j2) {
                                length = c1718.f5945.length;
                                throw e.m9370(JSON.array().add(m8438("retry", "Read the current bytes at the mismatched patch window before retrying.", c14937.f45531.mo23554(), c14937.f45533, j2, length)));
                            }
                        }
                        length = 1;
                        throw e.m9370(JSON.array().add(m8438("retry", "Read the current bytes at the mismatched patch window before retrying.", c14937.f45531.mo23554(), c14937.f45533, j2, length)));
                    }
                }
                j2 = j;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c1718 = (C1718) it.next();
                    if (c1718.f5943 != j2) {
                        length = c1718.f5945.length;
                        throw e.m9370(JSON.array().add(m8438("retry", "Read the current bytes at the mismatched patch window before retrying.", c14937.f45531.mo23554(), c14937.f45533, j2, length)));
                    }
                }
                length = 1;
                throw e.m9370(JSON.array().add(m8438("retry", "Read the current bytes at the mismatched patch window before retrying.", c14937.f45531.mo23554(), c14937.f45533, j2, length)));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m8441(int i, JSONObject jSONObject, String str) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM51498 = C23202.m51498(new StringBuilder(), m8439(i), ".", str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid patch hex argument", strM51498, jSONValue, JSON.array().add("non-empty hexadecimal string"), m8443());
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C3059.m9364("Patch hex must not be empty", strM51498, jSONValue, JSON.array().add("1..4096 bytes"), m8443());
        }
        if (strAsString.length() > 8192) {
            throw C3059.m9364("Patch item exceeds the 4096-byte limit", strM51498, JSON.value((((long) strAsString.length()) + 1) / 2), JSON.array().add("1..4096 bytes"), m8443());
        }
        try {
            return C13573.m32621(strAsString);
        } catch (IllegalArgumentException e) {
            throw C3059.m9365("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C7416.m19939("operation", "parse_patches", "backendReason", "invalid_hex").add("failedPatchIndex", i));
        }
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        JSONArray jSONArray;
        String str;
        HashSet hashSet = new HashSet();
        Iterator it = jSONObject.names().iterator();
        do {
            String str2 = "targetVersion";
            if (!it.hasNext()) {
                String[] strArr = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "patches"};
                for (int i = 0; i < 3; i++) {
                    String str3 = strArr[i];
                    if (!hashSet.contains(str3)) {
                        throw C3059.m9364(C20094.m46315("Missing parameter: ", str3), str3, (JSONValue) null, JSON.array(), m8443());
                    }
                }
                JSONObject jSONObjectM8443 = m8443();
                JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C3059.m9364("Invalid string argument", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array().add("string"), jSONObjectM8443);
                }
                String strAsString = jSONValue.asString();
                JSONObject jSONObjectM8444 = m8443();
                JSONValue jSONValue2 = jSONObject.get("targetVersion");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    throw C3059.m9364("Invalid string argument", "targetVersion", jSONValue2, JSON.array().add("string"), jSONObjectM8444);
                }
                String strAsString2 = jSONValue2.asString();
                if ("missing".equals(strAsString2)) {
                    throw C3059.m9364("mt_file_patch_bytes cannot create a missing file", "targetVersion", jSONObject.get("targetVersion"), JSON.array().add("<16 lowercase hex digits>"), m8443());
                }
                JSONValue jSONValue3 = jSONObject.get("patches");
                if (jSONValue3 == null || !jSONValue3.isArray()) {
                    throw C3059.m9364("Invalid patches argument", "patches", jSONValue3, JSON.array().add("array"), m8443());
                }
                JSONArray jSONArrayAsArray = jSONValue3.asArray();
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C3059.m9364("patches must contain 1 through 200 items", "patches", JSON.value(jSONArrayAsArray.size()), JSON.array().add("1..200"), m8443());
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                int length = 0;
                int i2 = 0;
                while (i2 < jSONArrayAsArray.size()) {
                    JSONValue jSONValue4 = jSONArrayAsArray.get(i2);
                    if (jSONValue4 == null || !jSONValue4.isObject()) {
                        throw C3059.m9364("Invalid patch item", m8439(i2), jSONValue4, JSON.array().add("object"), m8443());
                    }
                    JSONObject jSONObjectAsObject = jSONValue4.asObject();
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        jSONArray = jSONArrayAsArray;
                        if (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if ((!"byteOffset".equals(str4) && !"expectedHex".equals(str4) && !"replacementHex".equals(str4)) || !hashSet2.add(str4)) {
                                throw C3059.m9364("Invalid patch item argument", C23202.m51498(new StringBuilder(), m8439(i2), ".", str4), jSONObjectAsObject.get(str4), JSON.array(), m8443());
                            }
                            jSONArrayAsArray = jSONArray;
                        }
                    }
                    String[] strArr2 = {"byteOffset", "expectedHex", "replacementHex"};
                    for (int i3 = 0; i3 < 3; i3++) {
                        String str5 = strArr2[i3];
                        if (!hashSet2.contains(str5)) {
                            throw C3059.m9364(C20094.m46315("Missing patch parameter: ", str5), C23202.m51498(new StringBuilder(), m8439(i2), ".", str5), (JSONValue) null, JSON.array(), m8443());
                        }
                    }
                    long jM48626 = C21474.m48626(jSONObjectAsObject, "byteOffset", 0L, 9007199254740991L);
                    byte[] bArrM8441 = m8441(i2, jSONObjectAsObject, "expectedHex");
                    byte[] bArrM8442 = m8441(i2, jSONObjectAsObject, "replacementHex");
                    if (bArrM8441.length != bArrM8442.length) {
                        throw C3059.m9364("expectedHex and replacementHex must contain the same byte count", C9045.m23341(new StringBuilder(), m8439(i2), ".replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array().add("same byte count as expectedHex"), m8443());
                    }
                    if (bArrM8441.length > 4096) {
                        throw C3059.m9364("Patch item exceeds the 4096-byte limit", C9045.m23341(new StringBuilder(), m8439(i2), ".expectedHex"), JSON.value(bArrM8441.length), JSON.array().add("1..4096 bytes"), m8443());
                    }
                    length += bArrM8441.length;
                    if (length > 65536) {
                        throw C3059.m9364("Patch byte budget exceeds 65536 bytes", "patches", JSON.value(length), JSON.array().add("1..65536 bytes"), m8443());
                    }
                    arrayList.add(new C1718(i2, jM48626, C21474.m48627(C9045.m23341(new StringBuilder(), m8439(i2), ".byteOffset"), jM48626, bArrM8441.length), bArrM8441, bArrM8442));
                    i2++;
                    jSONArrayAsArray = jSONArray;
                    str2 = str2;
                }
                String str6 = str2;
                C6083.sort(arrayList, C8200.comparingLong(new C16117()));
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    C1718 c1718 = (C1718) arrayList.get(i4 - 1);
                    C1718 c1719 = (C1718) arrayList.get(i4);
                    if (c1719.f5943 < c1718.f5944) {
                        throw C3059.m9365("FILE_PATCH_OVERLAP", "Byte patch ranges must not overlap.", "warning", (JSONArray) null, C7416.m19939("operation", "parse_patches", "backendReason", "overlapping_ranges").add("failedPatchIndex", c1719.f5947).add("conflictingPatchIndex", c1718.f5947).add("byteOffset", c1719.f5943).add("endByteOffset", c1719.f5944));
                    }
                }
                C7882 c7882M31189 = this.f8469.m31189(strAsString, strAsString2, new C2144(arrayList));
                int length2 = 0;
                C1718 c17110 = (C1718) arrayList.get(0);
                JSONArray jSONArrayAdd = JSON.array().add(m8438("inspect", "Read back the first patched window using the new targetVersion.", c7882M31189.f24425, c7882M31189.f24428, c17110.f5943, c17110.f5945.length));
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c7882M31189.f24425).add("changed", c7882M31189.f24424).add("warnings", new JSONArray(c7882M31189.f24427)).add("size", c7882M31189.f24426).add(str6, c7882M31189.f24428);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    length2 += ((C1718) it3.next()).f5945.length;
                }
                return new C12936(C19993.m46095(jSONObjectAdd.add("bytesPatched", length2), jSONArrayAdd));
            }
            str = (String) it.next();
            if (!MotionUtils.EASING_TYPE_PATH.equals(str) && !"targetVersion".equals(str) && !"patches".equals(str)) {
                break;
            }
        } while (hashSet.add(str));
        throw C3059.m9364("Invalid file byte patch argument", str, jSONObject.get(str), JSON.array(), m8443());
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m8442() {
        return C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute file path.")).add("targetVersion", C1648.m5545("string", "Whole-file targetVersion.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m8438(String str, String str2, String str3, String str4, long j, int i) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m8443() {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "<copy current targetVersion>").add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "FF")));
    }
}
