package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.۫ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C12157 extends AbstractC4470 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12821 f36263;

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ۧ */
    public final String mo3036() {
        return "Append literal text using the existing file's exact encoding from mt_file_read_text. Preserves every original byte and the physical BOM; never transcodes or inserts another BOM. No automatic newline or replacement-template expansion. A trailing CR followed by an appended LF forms CRLF. Validates the entire original text, including EOF: invalid text, incomplete characters, unencodable appended text or a change to the physical BOM rejects the operation before publication. Empty writeText is a no-op after validation. ISO-2022 encodings are not supported. Appended text is limited to 524288 Unicode code points and 524288 encoded bytes; the existing file has no text-size cap and the final file is limited to 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܳ */
    public final String mo3037() {
        return "Append File Text";
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ᩳ */
    public final String mo3040() {
        return "mt_file_append_text";
    }

    public C12157(C12821 c12821) {
        this.f36263 = c12821;
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo3038() {
        return C18736.m43390(C6240.m17175().add("encoding", C1648.m5545("string", "Copy the non-empty encoding returned by mt_file_read_text, including any BOM suffix. ISO-2022 is unsupported.")), "string", "Literal text to append; at most 524288 Unicode code points and encoded bytes. Include any desired newline explicitly. Empty is a no-op.", "writeText", "Arguments for mt_file_append_text.");
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo3039() {
        return C6240.m17176("mt_file_append_text", true);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C3395.m10352("mt_file_append_text", c3059);
    }

    @Override // l.AbstractC4470
    /* JADX INFO: renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) throws C3059 {
        C5807.m16297(jSONObject, new C10474(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "writeText");
        String strM17178 = C6240.m17178(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM17177 = C6240.m17177(jSONObject);
        String strM17179 = C6240.m17178(jSONObject, "encoding");
        C17095 c17095M33925 = C14272.m33925(strM17179);
        String strM48946 = C21679.m48946(strM17179);
        String strM171710 = C6240.m17178(jSONObject, "writeText");
        if (strM171710.codePointCount(0, strM171710.length()) > 524288) {
            throw C3059.m9364("writeText exceeds 524288 Unicode code points", "writeText", jSONObject.get("writeText"), JSON.array(), JSON.object());
        }
        int i = 0;
        while (i < strM171710.length()) {
            try {
                char cCharAt = strM171710.charAt(i);
                if (Character.isHighSurrogate(cCharAt)) {
                    i++;
                    if (i == strM171710.length() || !Character.isLowSurrogate(strM171710.charAt(i))) {
                        throw new CharacterCodingException();
                    }
                } else if (Character.isLowSurrogate(cCharAt)) {
                    throw new CharacterCodingException();
                }
                i++;
            } catch (CharacterCodingException unused) {
                throw C3059.m9365("FILE_TEXT_ENCODE_FAILED", "The appended text cannot be represented as valid text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
            } catch (C3334 e) {
                throw C6240.m17179("Appended text exceeds the 524288-byte limit.", 524288L, e.f10537);
            }
        }
        byte[] bArr = C13211.m32046(524288, strM171710, strM48946).f15051;
        C21679.m48948();
        C15327[] c15327Arr = {null};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C7882 c7882M31189 = this.f36263.m31189(strM17178, strM17177, new C12862(bArr, byteArrayOutputStream, c15327Arr, c17095M33925));
        if (c7882M31189.f24424) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C16398.m38653(c17095M33925.f52402.name(), byteArray.length, byteArray);
        }
        return C6240.m17180(c7882M31189, strM17179, c15327Arr[0].m36359(), c15327Arr[0].m36358());
    }
}
