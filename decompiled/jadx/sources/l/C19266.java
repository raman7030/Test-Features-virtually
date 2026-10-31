package l;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.᩵ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2F */
/* JADX INFO: loaded from: classes4.dex */
public final class C19266 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f60640 = {75, 71, 83, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 35, 36, 37};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44449(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestM12977 = C4324.m12977();
        messageDigestM12977.update(C9969.m25130(str));
        return messageDigestM12977.digest();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m44453(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestM12979 = C4324.m12979();
        messageDigestM12979.update(bArr2);
        messageDigestM12979.update(bArr3, 0, 8);
        System.arraycopy(messageDigestM12979.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m44448(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44450(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws DigestException {
        byte[] bArr4 = new byte[24];
        MessageDigest messageDigestM12981 = C4324.m12981(bArr);
        messageDigestM12981.update(C9969.m25130(str2.toUpperCase()));
        messageDigestM12981.update(C9969.m25130(str.toUpperCase()));
        MessageDigest messageDigestM12982 = C4324.m12981(messageDigestM12981.digest());
        messageDigestM12982.update(bArr2);
        messageDigestM12982.update(bArr3);
        messageDigestM12982.digest(bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 8);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44452(byte[] bArr, byte[] bArr2) throws ShortBufferException {
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        m44448(bArr3, bArr2, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44451(InterfaceC18663 interfaceC18663, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrM25128 = C9969.m25128(str, interfaceC18663.mo27540());
        int length = bArrM25128.length;
        System.arraycopy(bArrM25128, 0, bArr2, 0, length <= 14 ? length : 14);
        m44448(bArr2, f60640, bArr3);
        m44448(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44448(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C4324.m12980(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
