package p067l;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6Y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14924 {
    /* JADX INFO: renamed from: ֫ */
    public static C21631 m34145(String str, byte[] bArr) throws C23642, C5276 {
        C18615 c18615M36058;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.min(bArr.length, 32768));
        if (str.isEmpty()) {
            c18615M36058 = C15932.m36053("", bArrCopyOf);
        } else {
            c18615M36058 = C15932.m36058(str);
            if (!c18615M36058.m42357(bArrCopyOf)) {
                throw new C23642("Encoding token BOM does not match the current file");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c18615M36058.f55585.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i = c18615M36058.f55584;
        return new C21631(charsetDecoderOnUnmappableCharacter.decode(ByteBuffer.wrap(bArr, i, bArr.length - i)).toString(), c18615M36058.f55586);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6878 m34144(int i, String str, String str2) throws CharacterCodingException, C5276, C5537 {
        C18615 c18615M36058 = C15932.m36058(str2);
        Charset charset = c18615M36058.f55585;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] bArrM42358 = c18615M36058.m42358();
        long length = ((long) bArrM42358.length) + ((long) byteBufferEncode.remaining());
        if (length > i) {
            throw new C5537(length);
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        System.arraycopy(bArrM42358, 0, bArr, 0, bArrM42358.length);
        byteBufferEncode.get(bArr, bArrM42358.length, i2 - bArrM42358.length);
        return new C6878(bArr, charset.name());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34146(C6878 c6878) {
        C17953.m40869(c6878.f17883, Math.min(c6878.f17882.length, 32768), c6878.f17882);
    }
}
