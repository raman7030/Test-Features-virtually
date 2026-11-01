package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
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
public final class C4947 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f11263;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f11264;

    /* JADX INFO: renamed from: ܽ */
    public final C14553 f11265;

    /* JADX INFO: renamed from: ֫ */
    public static String m10485(int i) {
        return C19768.m44906(i, "patches[", "]");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Apply 1..200 equal-length raw byte patches to one existing regular local file. Copy targetVersion from mt_file_stat or mt_file_read_bytes; missing is not accepted. Each item contains a 0-based byteOffset plus non-empty, even-length expectedHex and replacementHex of the same size. Inputs are case-insensitive hex without separators. Each item is limited to 4096 bytes and the call to 65536 patched bytes. Ranges must not overlap; adjacent ranges are valid. All expected windows are checked before patched bytes are written. Large files are supported.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Patch File Bytes";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_patch_bytes";
    }

    public C4947(C14553 c14553) {
        this.f11265 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f11263 == null) {
            this.f11263 = C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Absolute path or path relative to the Home captured at call start.")).add("targetVersion", C3935.m7775("string", "Current 16-digit lowercase hex version token; missing is not accepted.")).add("patches", C9417.m21913("type", "array", "description", "Runtime accepts 1..200 non-overlapping items.").add("items", C20175.m45657(JSON.object().add("byteOffset", C3935.m7775("integer", "Zero-based byte offset in 0..9007199254740991.")).add("expectedHex", C3935.m7775("string", "Current non-empty bytes as even-length hexadecimal without separators.")), "string", "Equal-length replacement bytes as hexadecimal without separators.", "replacementHex", "One equal-length raw byte patch."))), "Arguments for mt_file_patch_bytes.");
        }
        return this.f11263;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f11264 == null) {
            this.f11264 = C3935.m7765("Result for mt_file_patch_bytes.", C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute target path.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether target bytes changed.")).add("warnings", C9417.m21913("type", "array", "description", "Non-fatal metadata, cleanup, or notification degradation.").add("items", C3935.m7775("string", "One warning message."))).add("size", C3935.m7775("integer", "Final raw byte size.")).add("targetVersion", C3935.m7775("string", "Final whole-file version token of 16 lowercase hex digits.")), "integer", "Total requested patch bytes, including no-op replacements.", "bytesPatched", "Successful local byte patch result."), C5595.m12396("mt_file_patch_bytes"), C3935.m7768("Success and expected-byte mismatch return a read_bytes action.", C3935.m7763(m10488(), "mt_file_read_bytes", "inspect"), C3935.m7763(m10488(), "mt_file_read_bytes", "retry")));
        }
        return this.f11264;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_patch_bytes", c5276);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:33:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:17:0x0033->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public static void m10486(C16564 c16564, BufferedOutputStream bufferedOutputStream, ArrayList arrayList) {
        long j;
        long j2;
        Iterator it;
        int length;
        C4001 c4001;
        try {
            C12719.m29243(c16564, arrayList);
            C12719.m29242(c16564, bufferedOutputStream, arrayList);
        } catch (C5276 e) {
            if ("FILE_PATCH_EXPECTED_MISMATCH".equals(e.f12413)) {
                JSONValue jSONValue = e.f12412.get("byteOffset");
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
                            c4001 = (C4001) it.next();
                            if (c4001.f8721 != j2) {
                                length = c4001.f8723.length;
                                throw e.m11412(JSON.array().add(m10484("retry", "Read the current bytes at the mismatched patch window before retrying.", c16564.f48646.mo25505(), c16564.f48648, j2, length)));
                            }
                        }
                        length = 1;
                        throw e.m11412(JSON.array().add(m10484("retry", "Read the current bytes at the mismatched patch window before retrying.", c16564.f48646.mo25505(), c16564.f48648, j2, length)));
                    }
                }
                j2 = j;
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c4001 = (C4001) it.next();
                    if (c4001.f8721 != j2) {
                        length = c4001.f8723.length;
                        throw e.m11412(JSON.array().add(m10484("retry", "Read the current bytes at the mismatched patch window before retrying.", c16564.f48646.mo25505(), c16564.f48648, j2, length)));
                    }
                }
                length = 1;
                throw e.m11412(JSON.array().add(m10484("retry", "Read the current bytes at the mismatched patch window before retrying.", c16564.f48646.mo25505(), c16564.f48648, j2, length)));
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m10487(int i, JSONObject jSONObject, String str) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        String strM53894 = C24420.m53894(new StringBuilder(), m10485(i), ".", str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid patch hex argument", strM53894, jSONValue, JSON.array().add("non-empty hexadecimal string"), m10489());
        }
        String strAsString = jSONValue.asString();
        if (strAsString.isEmpty()) {
            throw C5276.m11406("Patch hex must not be empty", strM53894, jSONValue, JSON.array().add("1..4096 bytes"), m10489());
        }
        if (strAsString.length() > 8192) {
            throw C5276.m11406("Patch item exceeds the 4096-byte limit", strM53894, JSON.value((((long) strAsString.length()) + 1) / 2), JSON.array().add("1..4096 bytes"), m10489());
        }
        try {
            return C15268.m34733(strAsString);
        } catch (IllegalArgumentException e) {
            throw C5276.m11407("FILE_INVALID_HEX", e.getMessage(), "warning", (JSONArray) null, C9417.m21913("operation", "parse_patches", "backendReason", "invalid_hex").add("failedPatchIndex", i));
        }
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
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
                        throw C5276.m11406(C21466.m48631("Missing parameter: ", str3), str3, (JSONValue) null, JSON.array(), m10489());
                    }
                }
                JSONObject jSONObjectM10489 = m10489();
                JSONValue jSONValue = jSONObject.get(MotionUtils.EASING_TYPE_PATH);
                if (jSONValue == null || !jSONValue.isString()) {
                    throw C5276.m11406("Invalid string argument", MotionUtils.EASING_TYPE_PATH, jSONValue, JSON.array().add("string"), jSONObjectM10489);
                }
                String strAsString = jSONValue.asString();
                JSONObject jSONObjectM104810 = m10489();
                JSONValue jSONValue2 = jSONObject.get("targetVersion");
                if (jSONValue2 == null || !jSONValue2.isString()) {
                    throw C5276.m11406("Invalid string argument", "targetVersion", jSONValue2, JSON.array().add("string"), jSONObjectM104810);
                }
                String strAsString2 = jSONValue2.asString();
                if ("missing".equals(strAsString2)) {
                    throw C5276.m11406("mt_file_patch_bytes cannot create a missing file", "targetVersion", jSONObject.get("targetVersion"), JSON.array().add("<16 lowercase hex digits>"), m10489());
                }
                JSONValue jSONValue3 = jSONObject.get("patches");
                if (jSONValue3 == null || !jSONValue3.isArray()) {
                    throw C5276.m11406("Invalid patches argument", "patches", jSONValue3, JSON.array().add("array"), m10489());
                }
                JSONArray jSONArrayAsArray = jSONValue3.asArray();
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C5276.m11406("patches must contain 1 through 200 items", "patches", JSON.value(jSONArrayAsArray.size()), JSON.array().add("1..200"), m10489());
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                int length = 0;
                int i2 = 0;
                while (i2 < jSONArrayAsArray.size()) {
                    JSONValue jSONValue4 = jSONArrayAsArray.get(i2);
                    if (jSONValue4 == null || !jSONValue4.isObject()) {
                        throw C5276.m11406("Invalid patch item", m10485(i2), jSONValue4, JSON.array().add("object"), m10489());
                    }
                    JSONObject jSONObjectAsObject = jSONValue4.asObject();
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        jSONArray = jSONArrayAsArray;
                        if (it2.hasNext()) {
                            String str4 = (String) it2.next();
                            if ((!"byteOffset".equals(str4) && !"expectedHex".equals(str4) && !"replacementHex".equals(str4)) || !hashSet2.add(str4)) {
                                throw C5276.m11406("Invalid patch item argument", C24420.m53894(new StringBuilder(), m10485(i2), ".", str4), jSONObjectAsObject.get(str4), JSON.array(), m10489());
                            }
                            jSONArrayAsArray = jSONArray;
                        }
                    }
                    String[] strArr2 = {"byteOffset", "expectedHex", "replacementHex"};
                    for (int i3 = 0; i3 < 3; i3++) {
                        String str5 = strArr2[i3];
                        if (!hashSet2.contains(str5)) {
                            throw C5276.m11406(C21466.m48631("Missing patch parameter: ", str5), C24420.m53894(new StringBuilder(), m10485(i2), ".", str5), (JSONValue) null, JSON.array(), m10489());
                        }
                    }
                    long jM50963 = C22777.m50963(jSONObjectAsObject, "byteOffset", 0L, 9007199254740991L);
                    byte[] bArrM10487 = m10487(i2, jSONObjectAsObject, "expectedHex");
                    byte[] bArrM10488 = m10487(i2, jSONObjectAsObject, "replacementHex");
                    if (bArrM10487.length != bArrM10488.length) {
                        throw C5276.m11406("expectedHex and replacementHex must contain the same byte count", C10965.m25286(new StringBuilder(), m10485(i2), ".replacementHex"), jSONObjectAsObject.get("replacementHex"), JSON.array().add("same byte count as expectedHex"), m10489());
                    }
                    if (bArrM10487.length > 4096) {
                        throw C5276.m11406("Patch item exceeds the 4096-byte limit", C10965.m25286(new StringBuilder(), m10485(i2), ".expectedHex"), JSON.value(bArrM10487.length), JSON.array().add("1..4096 bytes"), m10489());
                    }
                    length += bArrM10487.length;
                    if (length > 65536) {
                        throw C5276.m11406("Patch byte budget exceeds 65536 bytes", "patches", JSON.value(length), JSON.array().add("1..65536 bytes"), m10489());
                    }
                    arrayList.add(new C4001(i2, jM50963, C22777.m50964(C10965.m25286(new StringBuilder(), m10485(i2), ".byteOffset"), jM50963, bArrM10487.length), bArrM10487, bArrM10488));
                    i2++;
                    jSONArrayAsArray = jSONArray;
                    str2 = str2;
                }
                String str6 = str2;
                C8150.sort(arrayList, C10162.comparingLong(new C17686()));
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    C4001 c4001 = (C4001) arrayList.get(i4 - 1);
                    C4001 c4002 = (C4001) arrayList.get(i4);
                    if (c4002.f8721 < c4001.f8722) {
                        throw C5276.m11407("FILE_PATCH_OVERLAP", "Byte patch ranges must not overlap.", "warning", (JSONArray) null, C9417.m21913("operation", "parse_patches", "backendReason", "overlapping_ranges").add("failedPatchIndex", c4002.f8725).add("conflictingPatchIndex", c4001.f8725).add("byteOffset", c4002.f8721).add("endByteOffset", c4002.f8722));
                    }
                }
                C9859 c9859M33275 = this.f11265.m33275(strAsString, strAsString2, new C4407(arrayList));
                int length2 = 0;
                C4001 c4003 = (C4001) arrayList.get(0);
                JSONArray jSONArrayAdd = JSON.array().add(m10484("inspect", "Read back the first patched window using the new targetVersion.", c9859M33275.f27341, c9859M33275.f27344, c4003.f8721, c4003.f8723.length));
                JSONObject jSONObjectAdd = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c9859M33275.f27341).add("changed", c9859M33275.f27340).add("warnings", new JSONArray(c9859M33275.f27343)).add("size", c9859M33275.f27342).add(str6, c9859M33275.f27344);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    length2 += ((C4001) it3.next()).f8723.length;
                }
                return new C14663(C21370.m48410(jSONObjectAdd.add("bytesPatched", length2), jSONArrayAdd));
            }
            str = (String) it.next();
            if (!MotionUtils.EASING_TYPE_PATH.equals(str) && !"targetVersion".equals(str) && !"patches".equals(str)) {
                break;
            }
        } while (hashSet.add(str));
        throw C5276.m11406("Invalid file byte patch argument", str, jSONObject.get(str), JSON.array(), m10489());
    }

    /* JADX INFO: renamed from: ۜ */
    public static JSONObject m10488() {
        return C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute file path.")).add("targetVersion", C3935.m7775("string", "Whole-file targetVersion.")).add("byteOffset", C3935.m7775("integer", "Zero-based byte offset.")), "integer", "See mt_file_read_bytes.", "maxBytes", "Arguments for mt_file_read_bytes.");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m10484(String str, String str2, String str3, String str4, long j, int i) {
        return C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "targetVersion", str4).add("byteOffset", j).add("maxBytes", i), "mt_file_read_bytes", str, str2);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m10489() {
        return C9417.m21913(MotionUtils.EASING_TYPE_PATH, "file.bin", "targetVersion", "<copy current targetVersion>").add("patches", JSON.array().add(JSON.object().add("byteOffset", 0).add("expectedHex", ChipTextInputComboView.TextFormatter.DEFAULT_TEXT).add("replacementHex", "FF")));
    }
}
