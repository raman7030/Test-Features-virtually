package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.ܳۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C16111 {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicReference f47403 = new AtomicReference();

    /* JADX INFO: renamed from: ۧ */
    public static final char[] f47404 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ܽ */
    public static MessageDigest m36668() {
        try {
            return MessageDigest.getInstance(XMSSKeyParameters.SHA_256);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static MessageDigest m36666() {
        try {
            return MessageDigest.getInstance("SHA1");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static MessageDigest m36660() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36661(MessageDigest messageDigest, InputStream inputStream) {
        AtomicReference atomicReference = f47403;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i);
                }
            } catch (Throwable th) {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36663(MessageDigest messageDigest, MessageDigest messageDigest2, InputStream inputStream) {
        AtomicReference atomicReference = f47403;
        byte[] bArr = (byte[]) atomicReference.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[1024];
        }
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i);
                messageDigest2.update(bArr, 0, i);
            } catch (Throwable th) {
                while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        }
        while (!atomicReference.compareAndSet(null, bArr) && atomicReference.get() == null) {
        }
        try {
            inputStream.close();
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m36662(MessageDigest messageDigest, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0 && cCharAt < 128) {
                messageDigest.update((byte) cCharAt);
            } else if (cCharAt < 2048) {
                messageDigest.update((byte) (((cCharAt >> 6) & 31) | 192));
                messageDigest.update((byte) ((cCharAt & '?') | 128));
            } else {
                messageDigest.update((byte) (((cCharAt >> '\f') & 15) | BERTags.FLAGS));
                messageDigest.update((byte) (((cCharAt >> 6) & 63) | 128));
                messageDigest.update((byte) ((cCharAt & '?') | 128));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m36665(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f47404;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static byte[] m36669(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string length is not even.");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 16);
            int iDigit2 = Character.digit(str.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("Invalid hex digit in input.");
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m36667(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i = 0;
        for (byte b : bArr) {
            if (i > 0) {
                cArr[i] = ':';
                i++;
            }
            int i2 = i + 1;
            char[] cArr2 = f47404;
            cArr[i] = cArr2[(b >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36658(String str) {
        MessageDigest messageDigestM36660 = m36660();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            messageDigestM36660.update((byte) (str.charAt(i) & 255));
        }
        return m36665(messageDigestM36660.digest());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m36659(byte[] bArr) {
        MessageDigest messageDigestM36660 = m36660();
        messageDigestM36660.update(bArr);
        return m36665(messageDigestM36660.digest());
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m36664(String str) {
        MessageDigest messageDigestM36660 = m36660();
        messageDigestM36660.update(str.getBytes(StandardCharsets.UTF_8));
        return m36665(messageDigestM36660.digest());
    }
}
