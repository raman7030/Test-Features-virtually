package p067l;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۫ۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14063 extends AbstractC16744 {

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f39650 = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: ۧ */
    public final CharsetDecoder f39652 = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: ֫ */
    public final CharsetDecoder f39651 = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p067l.AbstractC16744
    /* JADX INFO: renamed from: ֫ */
    public final C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f39651;
        CharsetDecoder charsetDecoder2 = this.f39652;
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
            return new C25079(new C8028(null, bArr, null));
        }
        Matcher matcher = f39650.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM37957 = C16726.m37957(strGroup);
                strM37957.getClass();
                if (strM37957.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM37957.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C25079(new C8028(str, bArr, str2));
    }
}
