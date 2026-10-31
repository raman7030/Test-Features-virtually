package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.᩻ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23879 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public JSONObject f77209;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f77210;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12821 f77211;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Edit File Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_edit_text";
    }

    public C23879(C12821 c12821) {
        this.f77211 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        if (this.f77209 == null) {
            this.f77209 = C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("targetVersion", C1648.m5545("string", "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file.")).add("encoding", C1648.m5545("string", "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed.")).add("edits", C7416.m19939("type", "array", "description", "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points.").add("items", C18736.m43390(JSON.object().add("mode", C1648.m5539("write_target, replace_match, insert_before_match, or insert_after_match.", "write_target", "replace_match", "insert_before_match", "insert_after_match")).add("matchText", C1648.m5545("string", "Empty for write_target; otherwise exact non-empty text occurring once in the original file.")), "string", "Exact text to write; no newline is added. May be empty for write_target or replace_match.", "writeText", "One edit against the same original text."))), "Arguments for mt_file_edit_text.");
        }
        return this.f77209;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        if (this.f77210 == null) {
            this.f77210 = C1648.m5535("Result for mt_file_edit_text.", C1648.m5532(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path fixed for this operation.")).add("encoding", C1648.m5545("string", "Actual lowercase editor encoding token used for decode and encode.")).add("size", C1648.m5545("integer", "Final raw file size in bytes.")).add("targetVersion", C1648.m5545("string", "Final raw-byte version as 16 lowercase hex digits.")).add("changed", C1648.m5545(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation state.")).add("warnings", C1648.m5541("Metadata or publication guarantee limitations; empty when none.")), "Final state after the complete text edit was published."), C3395.m10357("mt_file_edit_text"), m52593());
        }
        return this.f77210;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_edit_text", c3059);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52591(String str, String[] strArr, ArrayList arrayList, C4745[] c4745Arr, C14937 c14937, BufferedOutputStream bufferedOutputStream) throws C3059, IOException {
        String str2;
        String strM23341;
        String str3;
        String str4;
        boolean z = c14937.f45530;
        String str5 = c14937.f45533;
        AbstractC15440 abstractC15440 = c14937.f45531;
        if (z) {
            try {
                C20268 c20268M32047 = C13211.m32047(str, m52592(c14937, 10485760));
                str2 = c20268M32047.f65503;
                strArr[0] = c20268M32047.f65502;
            } catch (CharacterCodingException unused) {
                String strMo23554 = abstractC15440.mo23554();
                throw C3059.m9365("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", JSON.array().add(C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, strMo23554, "targetVersion", str5).add("byteOffset", 0).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Inspect the current raw bytes before choosing another text encoding.")), m52584(strMo23554, "decode_failed"));
            } catch (C22384 unused2) {
                throw m52590("FILE_TEXT_ENCODING_MISMATCH", "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding.", abstractC15440.mo23554(), c14937.f45533, "bom_mismatch", "");
            }
        } else {
            strArr[0] = str;
            str2 = "";
        }
        try {
            try {
                C4745 c4745M32046 = C13211.m32046(10485760, C16389.m38586(str2, arrayList), strArr[0]);
                c4745Arr[0] = c4745M32046;
                bufferedOutputStream.write(c4745M32046.f15051);
            } catch (CharacterCodingException unused3) {
                throw m52590("FILE_TEXT_ENCODE_FAILED", "The edited text contains characters that cannot be represented in the selected encoding.", abstractC15440.mo23554(), c14937.f45533, "unmappable_text", strArr[0]);
            } catch (C3334 e) {
                throw m52589("FILE_TEXT_RESULT_TOO_LARGE", "The encoded text exceeds the 10485760-byte result limit.", abstractC15440.mo23554(), "encoded_result", 10485760L, e.f10537, strArr[0], c14937.f45533);
            }
        } catch (C13526 e2) {
            String strMo23555 = abstractC15440.mo23554();
            String str6 = strArr[0];
            int i = C14706.f44913[e2.f40342.ordinal()];
            int i2 = e2.f40343;
            int i3 = e2.f40344;
            if (i == 1) {
                strM23341 = C9045.m23341(new StringBuilder(), m52587(i3, "matchText"), " was not found in the current text. Re-read and retry with current text.");
                str3 = "FILE_TEXT_MATCH_NOT_FOUND";
                str4 = "match_not_found";
            } else if (i == 2) {
                strM23341 = C9045.m23341(new StringBuilder(), m52587(i3, "matchText"), " appears multiple times. Use longer surrounding context that appears once.");
                str3 = "FILE_TEXT_MATCH_AMBIGUOUS";
                str4 = "match_ambiguous";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(e2);
                }
                strM23341 = C19373.m44634("edits[", i3, "] overlaps edits[", "]; matched ranges cannot overlap.", i2);
                str3 = "FILE_TEXT_MATCH_OVERLAP";
                str4 = "match_overlap";
            }
            throw C3059.m9365(str3, strM23341, "warning", JSON.array().add(m52586("retry", "Re-read the current file from the beginning; continue pagination if needed.", strMo23555, str6, str5)), m52584(strMo23555, str4).add("failedEditIndex", i3).add("conflictingEditIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m52592(C14937 c14937, int i) throws C3059, IOException {
        long j = c14937.f45532;
        AbstractC15440 abstractC15440 = c14937.f45531;
        long j2 = i;
        if (j > j2) {
            throw m52589("FILE_TEXT_TARGET_TOO_LARGE", C18307.m42645(i, "The existing file exceeds the ", "-byte text edit limit."), abstractC15440.mo23554(), "target_too_large", j2, c14937.f45532, "", c14937.f45533);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j >= 0 ? (int) j : Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        InputStream inputStreamM35392 = c14937.m35392();
        do {
            try {
                int i2 = inputStreamM35392.read(bArr, 0, Math.min(8192, (i + 1) - byteArrayOutputStream.size()));
                if (i2 >= 0) {
                    if (i2 == 0) {
                        int i3 = inputStreamM35392.read();
                        if (i3 >= 0) {
                            byteArrayOutputStream.write(i3);
                        }
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                inputStreamM35392.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                if (inputStreamM35392 != null) {
                    try {
                        inputStreamM35392.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (byteArrayOutputStream.size() <= i);
        throw m52589("FILE_TEXT_TARGET_TOO_LARGE", "The existing file exceeds the " + i + "-byte text edit limit.", abstractC15440.mo23554(), "target_too_large", j2, byteArrayOutputStream.size(), "", c14937.f45533);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        String str;
        int i;
        String str2;
        HashSet hashSet = new HashSet();
        Iterator it = jSONObject.names().iterator();
        do {
            boolean zHasNext = it.hasNext();
            String str3 = "edits";
            String str4 = "encoding";
            String str5 = MotionUtils.EASING_TYPE_PATH;
            if (zHasNext) {
                str2 = (String) it.next();
                if (!MotionUtils.EASING_TYPE_PATH.equals(str2) && !"targetVersion".equals(str2) && !"encoding".equals(str2) && !"edits".equals(str2)) {
                    break;
                }
            } else {
                String[] strArr = {MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "edits"};
                for (int i2 = 0; i2 < 4; i2++) {
                    String str6 = strArr[i2];
                    if (!hashSet.contains(str6)) {
                        throw C3059.m9364(C20094.m46315("Missing parameter: ", str6), str6, (JSONValue) null, JSON.array(), m52594());
                    }
                }
                String strM52588 = m52588(jSONObject, MotionUtils.EASING_TYPE_PATH, m52594(), MotionUtils.EASING_TYPE_PATH);
                String strM52589 = m52588(jSONObject, "targetVersion", m52594(), "targetVersion");
                String strM525810 = m52588(jSONObject, "encoding", m52594(), "encoding");
                JSONObject jSONObjectM52594 = m52594();
                JSONValue jSONValue = jSONObject.get("edits");
                if (jSONValue == null || !jSONValue.isArray()) {
                    throw C3059.m9364("Invalid array argument", "edits", jSONValue, JSON.array(), jSONObjectM52594);
                }
                JSONArray jSONArrayAsArray = jSONValue.asArray();
                JSONObject jSONObjectM52585 = m52585(strM52588, strM52589, strM525810);
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C3059.m9364("edits must contain 1..200 items", "edits", jSONArrayAsArray, JSON.array("1..200"), jSONObjectM52585);
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                long jCodePointCount = 0;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    String str7 = str5;
                    String str8 = strM52588;
                    String str9 = str4;
                    final String str10 = strM525810;
                    if (i3 >= jSONArrayAsArray.size()) {
                        String str11 = strM52589;
                        final ArrayList arrayList2 = arrayList;
                        int i5 = i4;
                        if (arrayList2.size() > 1 && i5 >= 0) {
                            throw C3059.m9364("write_target must be the only edit", m52587(i5, "mode"), JSON.value("write_target"), JSON.array("replace_match", "insert_before_match", "insert_after_match"), jSONObjectM52585);
                        }
                        if ("missing".equals(str11)) {
                            if (str10.isEmpty()) {
                                throw C3059.m9364("Creating a text file requires a non-empty encoding token", str9, JSON.value(str10), JSON.array(), m52594());
                            }
                            if (arrayList2.size() != 1 || !"write_target".equals(((C22699) arrayList2.get(0)).f73336)) {
                                throw C3059.m9364("targetVersion=missing requires one write_target edit", str3, jSONObject.get(str3), JSON.array("one write_target"), m52594());
                            }
                        }
                        if (!str10.isEmpty()) {
                            C14272.m33925(str10);
                        }
                        final String[] strArr2 = {str10};
                        final C4745[] c4745Arr = new C4745[1];
                        C7882 c7882M31189 = this.f77211.m31189(str8, str11, new InterfaceC9294() { // from class: l.ܿᩴۜ
                            @Override // l.InterfaceC9294
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ void mo7074() {
                            }

                            @Override // l.InterfaceC9294
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo7077(C14937 c14937, BufferedOutputStream bufferedOutputStream) throws C3059, IOException {
                                C23879.m52591(str10, strArr2, arrayList2, c4745Arr, c14937, bufferedOutputStream);
                            }
                        });
                        String str12 = c7882M31189.f24428;
                        String str13 = c7882M31189.f24425;
                        C13211.m32048(c4745Arr[0]);
                        return new C12936(C19993.m46095(JSON.object().add(str7, str13).add(str9, strArr2[0]).add("size", c7882M31189.f24426).add("targetVersion", str12).add("changed", c7882M31189.f24424).add("warnings", c7882M31189.f24427), JSON.array().add(m52586("inspect", "Verify text from the published file version.", str13, strArr2[0], str12))));
                    }
                    JSONValue jSONValue2 = jSONArrayAsArray.get(i3);
                    if (jSONValue2 == null || !jSONValue2.isObject()) {
                        throw C3059.m9364("Invalid edits item", C18307.m42645(i3, "edits[", "]"), jSONValue2, JSON.array(), jSONObjectM52585);
                    }
                    JSONObject jSONObjectAsObject = jSONValue2.asObject();
                    JSONArray jSONArray = jSONArrayAsArray;
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        str = strM52589;
                        i = i4;
                        if (it2.hasNext()) {
                            String str14 = str3;
                            String str15 = (String) it2.next();
                            if ((!"mode".equals(str15) && !"matchText".equals(str15) && !"writeText".equals(str15)) || !hashSet2.add(str15)) {
                                throw C3059.m9364("Unknown edit item argument", m52587(i3, str15), jSONObjectAsObject.get(str15), JSON.array(), jSONObjectM52585);
                            }
                            strM52589 = str;
                            i4 = i;
                            str3 = str14;
                        }
                    }
                    String str16 = str3;
                    String[] strArr3 = {"mode", "matchText", "writeText"};
                    ArrayList arrayList3 = arrayList;
                    long j = jCodePointCount;
                    for (int i6 = 0; i6 < 3; i6++) {
                        String str17 = strArr3[i6];
                        if (!hashSet2.contains(str17)) {
                            throw C3059.m9364("Missing parameter: " + m52587(i3, str17), m52587(i3, str17), (JSONValue) null, JSON.array(), jSONObjectM52585);
                        }
                    }
                    String strM525811 = m52588(jSONObjectAsObject, "mode", jSONObjectM52585, m52587(i3, "mode"));
                    String strM525812 = m52588(jSONObjectAsObject, "matchText", jSONObjectM52585, m52587(i3, "matchText"));
                    String strM525813 = m52588(jSONObjectAsObject, "writeText", jSONObjectM52585, m52587(i3, "writeText"));
                    if ("write_target".equals(strM525811)) {
                        if (!strM525812.isEmpty()) {
                            throw C3059.m9364("write_target requires empty matchText", m52587(i3, "matchText"), JSON.value(strM525812), JSON.array(""), jSONObjectM52585);
                        }
                    } else if (!"replace_match".equals(strM525811)) {
                        if (!"insert_before_match".equals(strM525811) && !"insert_after_match".equals(strM525811)) {
                            throw C3059.m9364("Invalid text edit mode", m52587(i3, "mode"), JSON.value(strM525811), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), jSONObjectM52585);
                        }
                        if (strM525812.isEmpty()) {
                            throw C3059.m9364(C16014.m37867(strM525811, " requires non-empty matchText"), m52587(i3, "matchText"), JSON.value(strM525812), JSON.array(), jSONObjectM52585);
                        }
                        if (strM525813.isEmpty()) {
                            throw C3059.m9364(C16014.m37867(strM525811, " requires non-empty writeText"), m52587(i3, "writeText"), JSON.value(strM525813), JSON.array(), jSONObjectM52585);
                        }
                    } else if (strM525812.isEmpty()) {
                        throw C3059.m9364("replace_match requires non-empty matchText", m52587(i3, "matchText"), JSON.value(strM525812), JSON.array(), jSONObjectM52585);
                    }
                    i4 = "write_target".equals(strM525811) ? i3 : i;
                    jCodePointCount = j + ((long) strM525812.codePointCount(0, strM525812.length())) + ((long) strM525813.codePointCount(0, strM525813.length()));
                    if (jCodePointCount > 524288) {
                        throw C3059.m9364("All matchText and writeText values may contain at most 524288 Unicode code points in total", str16, JSON.value(jCodePointCount), JSON.array("0..524288"), jSONObjectM52585);
                    }
                    arrayList3.add(new C22699(strM525811, strM525812, strM525813));
                    i3++;
                    arrayList = arrayList3;
                    str5 = str7;
                    strM52588 = str8;
                    str4 = str9;
                    strM525810 = str10;
                    jSONArrayAsArray = jSONArray;
                    strM52589 = str;
                    str3 = str16;
                }
            }
        } while (hashSet.add(str2));
        throw C3059.m9364("Unknown file text edit argument", str2, jSONObject.get(str2), JSON.array(), m52594());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52588(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) throws C3059 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C3059.m9364("Invalid string argument", str2, jSONValue, JSON.array(), jSONObject2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m52590(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONArray jSONArrayArray = "missing".equals(str4) ? JSON.array() : JSON.array().add(m52586("retry", "Re-read the current file from the beginning; continue pagination if needed.", str3, str6, str4));
        JSONObject jSONObjectM52584 = m52584(str3, str5);
        JSONValue jSONValue = JSON.NULL;
        return C3059.m9365(str, str2, "warning", jSONArrayArray, jSONObjectM52584.add("limit", jSONValue).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m52589(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        JSONObject jSONObjectAdd = m52584(str3, str4).add("limit", j).add("actual", j2 < 0 ? JSON.NULL : JSON.value(j2));
        JSONArray jSONArrayArray = (str6 == null || str6.isEmpty() || "missing".equals(str6)) ? JSON.array() : JSON.array().add(m52586("inspect", "Read the file in pages.", str3, str5, str6));
        if ("FILE_TEXT_RESULT_TOO_LARGE".equals(str)) {
            return C3059.m9365(str, str2, "warning", jSONArrayArray, jSONObjectAdd);
        }
        return C3059.m9369(str, str2, "fatal", jSONArrayArray, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52584(String str, String str2) {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "edit_text").add("backendReason", str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52586(String str, String str2, String str3, String str4, String str5) {
        return C10115.m25398(C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static JSONObject m52593() {
        JSONObject jSONObjectM43390 = C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path.")).add("encoding", C1648.m5545("string", "Exact token for verification or empty string to auto-detect.")).add("targetVersion", C1648.m5545("string", "Exact current version bound to this read.")).add("limit", C1648.m5545("integer", "Logical line limit.")).add("maxChars", C1648.m5545("integer", "Unicode code-point limit.")).add("startLine", C1648.m5545("integer", "Zero-based line.")), "integer", "Zero-based column.", "startColumn", "Arguments for mt_file_read_text.");
        return C1648.m5538("Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure.", C1648.m5533(jSONObjectM43390, "mt_file_read_text", "inspect"), C1648.m5533(jSONObjectM43390, "mt_file_read_text", "retry"), C1648.m5533(C18736.m43390(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C1648.m5545("string", "Normalized absolute path.")).add("targetVersion", C1648.m5545("string", "Exact current version bound to this read.")).add("byteOffset", C1648.m5545("integer", "Zero-based byte offset.")), "integer", "Maximum raw bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect"));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52587(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("edits[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static JSONObject m52594() {
        return m52585("file.txt", "<copy from mt_file_read_text>", "utf-8");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m52585(String str, String str2, String str3) {
        return C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "targetVersion", str2).add("encoding", str3).add("edits", JSON.array().add(C7416.m19939("mode", "replace_match", "matchText", "old text").add("writeText", "new text")));
    }
}
