package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
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
public final class C25063 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public JSONObject f79961;

    /* JADX INFO: renamed from: ۧ */
    public JSONObject f79962;

    /* JADX INFO: renamed from: ܽ */
    public final C14553 f79963;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Create or edit one regular local text file with strict decoding and encoding while preserving its real LF, CRLF, and CR characters. For an existing file, first call mt_file_read_text and copy its exact absolute path, encoding, and targetVersion. For creation pass targetVersion=\"missing\", a non-empty encoding such as \"utf-8\", and one write_target edit. edits[] accepts 1..200 items with mode, matchText, and writeText. write_target must be the only edit. Local replace_match, insert_before_match, and insert_after_match modes require a non-empty matchText that occurs exactly once in the same original text; matched ranges cannot overlap. No mode adds a newline automatically. The existing raw file and encoded result are each limited to 10485760 bytes (10 MiB); all request matchText plus writeText total at most 524288 Unicode code points. The same encoding is used for strict decode and encode, so this tool does not transcode and never replaces malformed or unmappable text. The encoding token preserves or creates its declared BOM exactly. The tool creates no backup file; inspect the reported state after a failed write.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Edit File Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_edit_text";
    }

    public C25063(C14553 c14553) {
        this.f79963 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        if (this.f79961 == null) {
            this.f79961 = C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Non-empty absolute path or path relative to the Home captured at call start.")).add("targetVersion", C3935.m7775("string", "Copy the exact version returned by mt_file_read_text, or pass \"missing\" only to create a new file.")).add("encoding", C3935.m7775("string", "For existing files copy the actual lowercase token from mt_file_read_text; for creation pass \"utf-8\" normally (no BOM), or \"utf-8-bom\" when a BOM is needed.")).add("edits", C9417.m21913("type", "array", "description", "1..200 edits; all matchText and writeText values total at most 524288 Unicode code points.").add("items", C20175.m45657(JSON.object().add("mode", C3935.m7769("write_target, replace_match, insert_before_match, or insert_after_match.", "write_target", "replace_match", "insert_before_match", "insert_after_match")).add("matchText", C3935.m7775("string", "Empty for write_target; otherwise exact non-empty text occurring once in the original file.")), "string", "Exact text to write; no newline is added. May be empty for write_target or replace_match.", "writeText", "One edit against the same original text."))), "Arguments for mt_file_edit_text.");
        }
        return this.f79961;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        if (this.f79962 == null) {
            this.f79962 = C3935.m7765("Result for mt_file_edit_text.", C3935.m7762(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute path fixed for this operation.")).add("encoding", C3935.m7775("string", "Actual lowercase editor encoding token used for decode and encode.")).add("size", C3935.m7775("integer", "Final raw file size in bytes.")).add("targetVersion", C3935.m7775("string", "Final raw-byte version as 16 lowercase hex digits.")).add("changed", C3935.m7775(ClassTransform.BOOLEAN, "Whether final bytes differ from the pre-operation state.")).add("warnings", C3935.m7771("Metadata or publication guarantee limitations; empty when none.")), "Final state after the complete text edit was published."), C5595.m12396("mt_file_edit_text"), m55002());
        }
        return this.f79962;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_edit_text", c5276);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55000(String str, String[] strArr, ArrayList arrayList, C6878[] c6878Arr, C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
        String str2;
        String strM25286;
        String str3;
        String str4;
        boolean z = c16564.f48645;
        String str5 = c16564.f48648;
        AbstractC17043 abstractC17043 = c16564.f48646;
        if (z) {
            try {
                C21631 c21631M34145 = C14924.m34145(str, m55001(c16564, 10485760));
                str2 = c21631M34145.f68178;
                strArr[0] = c21631M34145.f68177;
            } catch (CharacterCodingException unused) {
                String strMo25505 = abstractC17043.mo25505();
                throw C5276.m11407("FILE_TEXT_DECODE_FAILED", "The file is not valid in the selected text encoding.", "warning", JSON.array().add(C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, strMo25505, "targetVersion", str5).add("byteOffset", 0).add("maxBytes", 256), "mt_file_read_bytes", "inspect", "Inspect the current raw bytes before choosing another text encoding.")), m54993(strMo25505, "decode_failed"));
            } catch (C23642 unused2) {
                throw m54999("FILE_TEXT_ENCODING_MISMATCH", "The encoding token BOM does not match the current file. Re-read the file and copy its returned encoding.", abstractC17043.mo25505(), c16564.f48648, "bom_mismatch", "");
            }
        } else {
            strArr[0] = str;
            str2 = "";
        }
        try {
            try {
                C6878 c6878M34144 = C14924.m34144(10485760, C17944.m40803(str2, arrayList), strArr[0]);
                c6878Arr[0] = c6878M34144;
                bufferedOutputStream.write(c6878M34144.f17882);
            } catch (CharacterCodingException unused3) {
                throw m54999("FILE_TEXT_ENCODE_FAILED", "The edited text contains characters that cannot be represented in the selected encoding.", abstractC17043.mo25505(), c16564.f48648, "unmappable_text", strArr[0]);
            } catch (C5537 e) {
                throw m54998("FILE_TEXT_RESULT_TOO_LARGE", "The encoded text exceeds the 10485760-byte result limit.", abstractC17043.mo25505(), "encoded_result", 10485760L, e.f13347, strArr[0], c16564.f48648);
            }
        } catch (C15223 e2) {
            String strMo25506 = abstractC17043.mo25505();
            String str6 = strArr[0];
            int i = C16345.f48027[e2.f43412.ordinal()];
            int i2 = e2.f43413;
            int i3 = e2.f43414;
            if (i == 1) {
                strM25286 = C10965.m25286(new StringBuilder(), m54996(i3, "matchText"), " was not found in the current text. Re-read and retry with current text.");
                str3 = "FILE_TEXT_MATCH_NOT_FOUND";
                str4 = "match_not_found";
            } else if (i == 2) {
                strM25286 = C10965.m25286(new StringBuilder(), m54996(i3, "matchText"), " appears multiple times. Use longer surrounding context that appears once.");
                str3 = "FILE_TEXT_MATCH_AMBIGUOUS";
                str4 = "match_ambiguous";
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(e2);
                }
                strM25286 = C20780.m46928("edits[", i3, "] overlaps edits[", "]; matched ranges cannot overlap.", i2);
                str3 = "FILE_TEXT_MATCH_OVERLAP";
                str4 = "match_overlap";
            }
            throw C5276.m11407(str3, strM25286, "warning", JSON.array().add(m54995("retry", "Re-read the current file from the beginning; continue pagination if needed.", strMo25506, str6, str5)), m54993(strMo25506, str4).add("failedEditIndex", i3).add("conflictingEditIndex", i2 < 0 ? JSON.NULL : JSON.value(i2)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m55001(C16564 c16564, int i) throws C5276, IOException {
        long j = c16564.f48647;
        AbstractC17043 abstractC17043 = c16564.f48646;
        long j2 = i;
        if (j > j2) {
            throw m54998("FILE_TEXT_TARGET_TOO_LARGE", C19768.m44906(i, "The existing file exceeds the ", "-byte text edit limit."), abstractC17043.mo25505(), "target_too_large", j2, c16564.f48647, "", c16564.f48648);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(j >= 0 ? (int) j : Math.min(i, 8192));
        byte[] bArr = new byte[8192];
        InputStream inputStreamM37544 = c16564.m37544();
        do {
            try {
                int i2 = inputStreamM37544.read(bArr, 0, Math.min(8192, (i + 1) - byteArrayOutputStream.size()));
                if (i2 >= 0) {
                    if (i2 == 0) {
                        int i3 = inputStreamM37544.read();
                        if (i3 >= 0) {
                            byteArrayOutputStream.write(i3);
                        }
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i2);
                    }
                }
                inputStreamM37544.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                if (inputStreamM37544 != null) {
                    try {
                        inputStreamM37544.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } while (byteArrayOutputStream.size() <= i);
        throw m54998("FILE_TEXT_TARGET_TOO_LARGE", "The existing file exceeds the " + i + "-byte text edit limit.", abstractC17043.mo25505(), "target_too_large", j2, byteArrayOutputStream.size(), "", c16564.f48648);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
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
                        throw C5276.m11406(C21466.m48631("Missing parameter: ", str6), str6, (JSONValue) null, JSON.array(), m55003());
                    }
                }
                String strM54997 = m54997(jSONObject, MotionUtils.EASING_TYPE_PATH, m55003(), MotionUtils.EASING_TYPE_PATH);
                String strM54998 = m54997(jSONObject, "targetVersion", m55003(), "targetVersion");
                String strM54999 = m54997(jSONObject, "encoding", m55003(), "encoding");
                JSONObject jSONObjectM55003 = m55003();
                JSONValue jSONValue = jSONObject.get("edits");
                if (jSONValue == null || !jSONValue.isArray()) {
                    throw C5276.m11406("Invalid array argument", "edits", jSONValue, JSON.array(), jSONObjectM55003);
                }
                JSONArray jSONArrayAsArray = jSONValue.asArray();
                JSONObject jSONObjectM54994 = m54994(strM54997, strM54998, strM54999);
                if (jSONArrayAsArray.size() < 1 || jSONArrayAsArray.size() > 200) {
                    throw C5276.m11406("edits must contain 1..200 items", "edits", jSONArrayAsArray, JSON.array("1..200"), jSONObjectM54994);
                }
                ArrayList arrayList = new ArrayList(jSONArrayAsArray.size());
                long jCodePointCount = 0;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    String str7 = str5;
                    String str8 = strM54997;
                    String str9 = str4;
                    final String str10 = strM54999;
                    if (i3 >= jSONArrayAsArray.size()) {
                        String str11 = strM54998;
                        final ArrayList arrayList2 = arrayList;
                        int i5 = i4;
                        if (arrayList2.size() > 1 && i5 >= 0) {
                            throw C5276.m11406("write_target must be the only edit", m54996(i5, "mode"), JSON.value("write_target"), JSON.array("replace_match", "insert_before_match", "insert_after_match"), jSONObjectM54994);
                        }
                        if ("missing".equals(str11)) {
                            if (str10.isEmpty()) {
                                throw C5276.m11406("Creating a text file requires a non-empty encoding token", str9, JSON.value(str10), JSON.array(), m55003());
                            }
                            if (arrayList2.size() != 1 || !"write_target".equals(((C23941) arrayList2.get(0)).f76062)) {
                                throw C5276.m11406("targetVersion=missing requires one write_target edit", str3, jSONObject.get(str3), JSON.array("one write_target"), m55003());
                            }
                        }
                        if (!str10.isEmpty()) {
                            C15932.m36058(str10);
                        }
                        final String[] strArr2 = {str10};
                        final C6878[] c6878Arr = new C6878[1];
                        C9859 c9859M33275 = this.f79963.m33275(str8, str11, new InterfaceC11201() { // from class: l.ܿᩴۜ
                            @Override // p067l.InterfaceC11201
                            /* JADX INFO: renamed from: ֫ */
                            public final /* synthetic */ void mo9169() {
                            }

                            @Override // p067l.InterfaceC11201
                            /* JADX INFO: renamed from: ֫ */
                            public final void mo9172(C16564 c16564, BufferedOutputStream bufferedOutputStream) throws C5276, IOException {
                                C25063.m55000(str10, strArr2, arrayList2, c6878Arr, c16564, bufferedOutputStream);
                            }
                        });
                        String str12 = c9859M33275.f27344;
                        String str13 = c9859M33275.f27341;
                        C14924.m34146(c6878Arr[0]);
                        return new C14663(C21370.m48410(JSON.object().add(str7, str13).add(str9, strArr2[0]).add("size", c9859M33275.f27342).add("targetVersion", str12).add("changed", c9859M33275.f27340).add("warnings", c9859M33275.f27343), JSON.array().add(m54995("inspect", "Verify text from the published file version.", str13, strArr2[0], str12))));
                    }
                    JSONValue jSONValue2 = jSONArrayAsArray.get(i3);
                    if (jSONValue2 == null || !jSONValue2.isObject()) {
                        throw C5276.m11406("Invalid edits item", C19768.m44906(i3, "edits[", "]"), jSONValue2, JSON.array(), jSONObjectM54994);
                    }
                    JSONObject jSONObjectAsObject = jSONValue2.asObject();
                    JSONArray jSONArray = jSONArrayAsArray;
                    HashSet hashSet2 = new HashSet();
                    Iterator it2 = jSONObjectAsObject.names().iterator();
                    while (true) {
                        str = strM54998;
                        i = i4;
                        if (it2.hasNext()) {
                            String str14 = str3;
                            String str15 = (String) it2.next();
                            if ((!"mode".equals(str15) && !"matchText".equals(str15) && !"writeText".equals(str15)) || !hashSet2.add(str15)) {
                                throw C5276.m11406("Unknown edit item argument", m54996(i3, str15), jSONObjectAsObject.get(str15), JSON.array(), jSONObjectM54994);
                            }
                            strM54998 = str;
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
                            throw C5276.m11406("Missing parameter: " + m54996(i3, str17), m54996(i3, str17), (JSONValue) null, JSON.array(), jSONObjectM54994);
                        }
                    }
                    String strM549910 = m54997(jSONObjectAsObject, "mode", jSONObjectM54994, m54996(i3, "mode"));
                    String strM549911 = m54997(jSONObjectAsObject, "matchText", jSONObjectM54994, m54996(i3, "matchText"));
                    String strM549912 = m54997(jSONObjectAsObject, "writeText", jSONObjectM54994, m54996(i3, "writeText"));
                    if ("write_target".equals(strM549910)) {
                        if (!strM549911.isEmpty()) {
                            throw C5276.m11406("write_target requires empty matchText", m54996(i3, "matchText"), JSON.value(strM549911), JSON.array(""), jSONObjectM54994);
                        }
                    } else if (!"replace_match".equals(strM549910)) {
                        if (!"insert_before_match".equals(strM549910) && !"insert_after_match".equals(strM549910)) {
                            throw C5276.m11406("Invalid text edit mode", m54996(i3, "mode"), JSON.value(strM549910), JSON.array("write_target", "replace_match", "insert_before_match", "insert_after_match"), jSONObjectM54994);
                        }
                        if (strM549911.isEmpty()) {
                            throw C5276.m11406(C17588.m40053(strM549910, " requires non-empty matchText"), m54996(i3, "matchText"), JSON.value(strM549911), JSON.array(), jSONObjectM54994);
                        }
                        if (strM549912.isEmpty()) {
                            throw C5276.m11406(C17588.m40053(strM549910, " requires non-empty writeText"), m54996(i3, "writeText"), JSON.value(strM549912), JSON.array(), jSONObjectM54994);
                        }
                    } else if (strM549911.isEmpty()) {
                        throw C5276.m11406("replace_match requires non-empty matchText", m54996(i3, "matchText"), JSON.value(strM549911), JSON.array(), jSONObjectM54994);
                    }
                    i4 = "write_target".equals(strM549910) ? i3 : i;
                    jCodePointCount = j + ((long) strM549911.codePointCount(0, strM549911.length())) + ((long) strM549912.codePointCount(0, strM549912.length()));
                    if (jCodePointCount > 524288) {
                        throw C5276.m11406("All matchText and writeText values may contain at most 524288 Unicode code points in total", str16, JSON.value(jCodePointCount), JSON.array("0..524288"), jSONObjectM54994);
                    }
                    arrayList3.add(new C23941(strM549910, strM549911, strM549912));
                    i3++;
                    arrayList = arrayList3;
                    str5 = str7;
                    strM54997 = str8;
                    str4 = str9;
                    strM54999 = str10;
                    jSONArrayAsArray = jSONArray;
                    strM54998 = str;
                    str3 = str16;
                }
            }
        } while (hashSet.add(str2));
        throw C5276.m11406("Unknown file text edit argument", str2, jSONObject.get(str2), JSON.array(), m55003());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54997(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2) throws C5276 {
        JSONValue jSONValue = jSONObject.get(str);
        if (jSONValue == null || !jSONValue.isString()) {
            throw C5276.m11406("Invalid string argument", str2, jSONValue, JSON.array(), jSONObject2);
        }
        return jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m54999(String str, String str2, String str3, String str4, String str5, String str6) {
        JSONArray jSONArrayArray = "missing".equals(str4) ? JSON.array() : JSON.array().add(m54995("retry", "Re-read the current file from the beginning; continue pagination if needed.", str3, str6, str4));
        JSONObject jSONObjectM54993 = m54993(str3, str5);
        JSONValue jSONValue = JSON.NULL;
        return C5276.m11407(str, str2, "warning", jSONArrayArray, jSONObjectM54993.add("limit", jSONValue).add("actual", jSONValue));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5276 m54998(String str, String str2, String str3, String str4, long j, long j2, String str5, String str6) {
        JSONObject jSONObjectAdd = m54993(str3, str4).add("limit", j).add("actual", j2 < 0 ? JSON.NULL : JSON.value(j2));
        JSONArray jSONArrayArray = (str6 == null || str6.isEmpty() || "missing".equals(str6)) ? JSON.array() : JSON.array().add(m54995("inspect", "Read the file in pages.", str3, str5, str6));
        if ("FILE_TEXT_RESULT_TOO_LARGE".equals(str)) {
            return C5276.m11407(str, str2, "warning", jSONArrayArray, jSONObjectAdd);
        }
        return C5276.m11411(str, str2, "fatal", jSONArrayArray, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54993(String str, String str2) {
        return C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "operation", "edit_text").add("backendReason", str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54995(String str, String str2, String str3, String str4, String str5) {
        return C11982.m27418(C9417.m21913(MotionUtils.EASING_TYPE_PATH, str3, "encoding", str4).add("targetVersion", str5).add("limit", 500).add("maxChars", 49152).add("startLine", 0).add("startColumn", 0), "mt_file_read_text", str, str2);
    }

    /* JADX INFO: renamed from: ۜ */
    public static JSONObject m55002() {
        JSONObject jSONObjectM45657 = C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute path.")).add("encoding", C3935.m7775("string", "Exact token for verification or empty string to auto-detect.")).add("targetVersion", C3935.m7775("string", "Exact current version bound to this read.")).add("limit", C3935.m7775("integer", "Logical line limit.")).add("maxChars", C3935.m7775("integer", "Unicode code-point limit.")).add("startLine", C3935.m7775("integer", "Zero-based line.")), "integer", "Zero-based column.", "startColumn", "Arguments for mt_file_read_text.");
        return C3935.m7768("Contains a text verification read after success, a current-file retry read after a recoverable match error, or a raw-byte inspection after decode failure.", C3935.m7763(jSONObjectM45657, "mt_file_read_text", "inspect"), C3935.m7763(jSONObjectM45657, "mt_file_read_text", "retry"), C3935.m7763(C20175.m45657(JSON.object().add(MotionUtils.EASING_TYPE_PATH, C3935.m7775("string", "Normalized absolute path.")).add("targetVersion", C3935.m7775("string", "Exact current version bound to this read.")).add("byteOffset", C3935.m7775("integer", "Zero-based byte offset.")), "integer", "Maximum raw bytes.", "maxBytes", "Arguments for mt_file_read_bytes."), "mt_file_read_bytes", "inspect"));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54996(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("edits[" + i + "]");
        sb.append(".");
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public static JSONObject m55003() {
        return m54994("file.txt", "<copy from mt_file_read_text>", "utf-8");
    }

    /* JADX INFO: renamed from: ֫ */
    public static JSONObject m54994(String str, String str2, String str3) {
        return C9417.m21913(MotionUtils.EASING_TYPE_PATH, str, "targetVersion", str2).add("encoding", str3).add("edits", JSON.array().add(C9417.m21913("mode", "replace_match", "matchText", "old text").add("writeText", "new text")));
    }
}
