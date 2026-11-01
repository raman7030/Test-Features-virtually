package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONArray;
import bin.p000mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.CharacterCodingException;

/* JADX INFO: renamed from: l.۫ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C13922 extends AbstractC6617 {

    /* JADX INFO: renamed from: ֫ */
    public final C14553 f39274;

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ۧ */
    public final String mo5349() {
        return "Append literal text using the existing file's exact encoding from mt_file_read_text. Preserves every original byte and the physical BOM; never transcodes or inserts another BOM. No automatic newline or replacement-template expansion. A trailing CR followed by an appended LF forms CRLF. Validates the entire original text, including EOF: invalid text, incomplete characters, unencodable appended text or a change to the physical BOM rejects the operation before publication. Empty writeText is a no-op after validation. ISO-2022 encodings are not supported. Appended text is limited to 524288 Unicode code points and 524288 encoded bytes; the existing file has no text-size cap and the final file is limited to 9007199254740991 bytes. Only existing regular files are supported; no creation or automatic backup. Copy the current targetVersion before calling. Large files are streamed but require whole-file reads and space for the resulting file. Publication guarantees depend on the file backend; inspect error state before retrying. After a lost response, read the file before repeating an append with a refreshed version.";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܳ */
    public final String mo5350() {
        return "Append File Text";
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5353() {
        return "mt_file_append_text";
    }

    public C13922(C14553 c14553) {
        this.f39274 = c14553;
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5346() {
        return JSON.object().add("readOnlyHint", false).add("destructiveHint", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܽ */
    public final JSONObject mo5351() {
        return C20175.m45657(C8299.m19113().add("encoding", C3935.m7775("string", "Copy the non-empty encoding returned by mt_file_read_text, including any BOM suffix. ISO-2022 is unsupported.")), "string", "Literal text to append; at most 524288 Unicode code points and encoded bytes. Include any desired newline explicitly. Empty is a no-op.", "writeText", "Arguments for mt_file_append_text.");
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ܿ */
    public final JSONObject mo5352() {
        return C8299.m19114("mt_file_append_text", true);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final JSONObject mo5347(C5276 c5276) {
        return C5595.m12391("mt_file_append_text", c5276);
    }

    @Override // p067l.AbstractC6617
    /* JADX INFO: renamed from: ֫ */
    public final C14663 mo5348(JSONObject jSONObject) throws C5276 {
        C7887.m18222(jSONObject, new C12323(), "Invalid file tail argument", MotionUtils.EASING_TYPE_PATH, "targetVersion", "encoding", "writeText");
        String strM19116 = C8299.m19116(jSONObject, MotionUtils.EASING_TYPE_PATH);
        String strM19115 = C8299.m19115(jSONObject);
        String strM19117 = C8299.m19116(jSONObject, "encoding");
        C18615 c18615M36058 = C15932.m36058(strM19117);
        String strM51295 = C22972.m51295(strM19117);
        String strM19118 = C8299.m19116(jSONObject, "writeText");
        if (strM19118.codePointCount(0, strM19118.length()) > 524288) {
            throw C5276.m11406("writeText exceeds 524288 Unicode code points", "writeText", jSONObject.get("writeText"), JSON.array(), JSON.object());
        }
        int i = 0;
        while (i < strM19118.length()) {
            try {
                char cCharAt = strM19118.charAt(i);
                if (Character.isHighSurrogate(cCharAt)) {
                    i++;
                    if (i == strM19118.length() || !Character.isLowSurrogate(strM19118.charAt(i))) {
                        throw new CharacterCodingException();
                    }
                } else if (Character.isLowSurrogate(cCharAt)) {
                    throw new CharacterCodingException();
                }
                i++;
            } catch (CharacterCodingException unused) {
                throw C5276.m11407("FILE_TEXT_ENCODE_FAILED", "The appended text cannot be represented as valid text in the selected encoding.", "warning", (JSONArray) null, JSON.object());
            } catch (C5537 e) {
                throw C8299.m19117("Appended text exceeds the 524288-byte limit.", 524288L, e.f13347);
            }
        }
        byte[] bArr = C14924.m34144(524288, strM19118, strM51295).f17882;
        C22972.m51297();
        C16935[] c16935Arr = {null};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C9859 c9859M33275 = this.f39274.m33275(strM19116, strM19115, new C14592(bArr, byteArrayOutputStream, c16935Arr, c18615M36058));
        if (c9859M33275.f27340) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C17953.m40869(c18615M36058.f55585.name(), byteArray.length, byteArray);
        }
        return C8299.m19118(c9859M33275, strM19117, c16935Arr[0].m38517(), c16935Arr[0].m38516());
    }
}
