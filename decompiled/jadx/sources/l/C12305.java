package l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12305 extends AbstractC15126 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f36635 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f36637 = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f36636 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // l.AbstractC15126
    /* JADX INFO: renamed from: ֫ */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f36636;
        CharsetDecoder charsetDecoder2 = this.f36637;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C23896(new C5955(null, bArr, null));
        }
        Matcher matcher = f36635.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM35799 = C15107.m35799(strGroup);
                strM35799.getClass();
                if (strM35799.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM35799.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C23896(new C5955(str, bArr, str2));
    }
}
