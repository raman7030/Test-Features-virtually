package l;

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
public final class C13211 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20268 m32047(String str, byte[] bArr) throws C22384, C3059 {
        C17095 c17095M33925;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.min(bArr.length, 32768));
        if (str.isEmpty()) {
            c17095M33925 = C14272.m33920("", bArrCopyOf);
        } else {
            c17095M33925 = C14272.m33925(str);
            if (!c17095M33925.m40112(bArrCopyOf)) {
                throw new C22384("Encoding token BOM does not match the current file");
            }
        }
        CharsetDecoder charsetDecoderNewDecoder = c17095M33925.f52402.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        CharsetDecoder charsetDecoderOnUnmappableCharacter = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        int i = c17095M33925.f52401;
        return new C20268(charsetDecoderOnUnmappableCharacter.decode(ByteBuffer.wrap(bArr, i, bArr.length - i)).toString(), c17095M33925.f52403);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4745 m32046(int i, String str, String str2) throws CharacterCodingException, C3059, C3334 {
        C17095 c17095M33925 = C14272.m33925(str2);
        Charset charset = c17095M33925.f52402;
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str));
        byte[] bArrM40113 = c17095M33925.m40113();
        long length = ((long) bArrM40113.length) + ((long) byteBufferEncode.remaining());
        if (length > i) {
            throw new C3334(length);
        }
        int i2 = (int) length;
        byte[] bArr = new byte[i2];
        System.arraycopy(bArrM40113, 0, bArr, 0, bArrM40113.length);
        byteBufferEncode.get(bArr, bArrM40113.length, i2 - bArrM40113.length);
        return new C4745(bArr, charset.name());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32048(C4745 c4745) {
        C16398.m38653(c4745.f15052, Math.min(c4745.f15051.length, 32768), c4745.f15051);
    }
}
