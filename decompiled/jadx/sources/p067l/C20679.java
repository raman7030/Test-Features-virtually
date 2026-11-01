package p067l;

import java.security.DigestException;
import java.security.MessageDigest;
import javax.crypto.ShortBufferException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: l.᩵ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA2F */
/* JADX INFO: loaded from: classes4.dex */
public final class C20679 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f63870 = {75, 71, 83, PublicSuffixDatabase.EXCEPTION_MARKER, 64, 35, 36, 37};

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46743(String str) {
        if (str == null) {
            throw new NullPointerException("Password parameter is required");
        }
        MessageDigest messageDigestM14841 = C6478.m14841();
        messageDigestM14841.update(C11843.m27147(str));
        return messageDigestM14841.digest();
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m46747(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[8];
        MessageDigest messageDigestM14843 = C6478.m14843();
        messageDigestM14843.update(bArr2);
        messageDigestM14843.update(bArr3, 0, 8);
        System.arraycopy(messageDigestM14843.digest(), 0, bArr4, 0, 8);
        byte[] bArr5 = new byte[21];
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        byte[] bArr6 = new byte[24];
        m46742(bArr5, bArr4, bArr6);
        return bArr6;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46744(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3) throws DigestException {
        byte[] bArr4 = new byte[24];
        MessageDigest messageDigestM14845 = C6478.m14845(bArr);
        messageDigestM14845.update(C11843.m27147(str2.toUpperCase()));
        messageDigestM14845.update(C11843.m27147(str.toUpperCase()));
        MessageDigest messageDigestM14846 = C6478.m14845(messageDigestM14845.digest());
        messageDigestM14846.update(bArr2);
        messageDigestM14846.update(bArr3);
        messageDigestM14846.digest(bArr4, 0, 16);
        System.arraycopy(bArr3, 0, bArr4, 16, 8);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46746(byte[] bArr, byte[] bArr2) throws ShortBufferException {
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, 0, bArr3, 0, 16);
        m46742(bArr3, bArr2, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46745(InterfaceC20106 interfaceC20106, String str, byte[] bArr) throws ShortBufferException {
        byte[] bArr2 = new byte[14];
        byte[] bArr3 = new byte[21];
        byte[] bArr4 = new byte[24];
        byte[] bArrM27145 = C11843.m27145(str, interfaceC20106.mo29602());
        int length = bArrM27145.length;
        System.arraycopy(bArrM27145, 0, bArr2, 0, length <= 14 ? length : 14);
        m46742(bArr2, f63870, bArr3);
        m46742(bArr3, bArr, bArr4);
        return bArr4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46742(byte[] bArr, byte[] bArr2, byte[] bArr3) throws ShortBufferException {
        byte[] bArr4 = new byte[7];
        byte[] bArr5 = new byte[8];
        for (int i = 0; i < bArr.length / 7; i++) {
            System.arraycopy(bArr, i * 7, bArr4, 0, 7);
            C6478.m14844(bArr4).update(bArr2, 0, bArr2.length, bArr5);
            System.arraycopy(bArr5, 0, bArr3, i * 8, 8);
        }
    }
}
