package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۨܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4D9 */
/* JADX INFO: loaded from: classes3.dex */
public class C11816 implements Serializable, Comparable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final char[] f35247 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C11816 f35248 = m28897(new byte[0]);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient String f35249;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f35250;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient int f35251;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11816 m28901(String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C11816(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11816 m28896(String str) {
        int i;
        char cCharAt;
        if (str != null) {
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i2 = (int) ((((long) length) * 6) / 8);
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i3 < length) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                        i = cCharAt2 - 'A';
                    } else if (cCharAt2 >= 'a' && cCharAt2 <= 'z') {
                        i = cCharAt2 - 'G';
                    } else if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                        i = cCharAt2 + 4;
                    } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                        i = 62;
                    } else {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                break;
                            }
                        } else {
                            i = 63;
                        }
                        i3++;
                    }
                    i5 = (i5 << 6) | ((byte) i);
                    i4++;
                    if (i4 % 4 == 0) {
                        bArr[i6] = (byte) (i5 >> 16);
                        int i7 = i6 + 2;
                        bArr[i6 + 1] = (byte) (i5 >> 8);
                        i6 += 3;
                        bArr[i7] = (byte) i5;
                    }
                    i3++;
                } else {
                    int i8 = i4 % 4;
                    if (i8 == 1) {
                        break;
                    }
                    if (i8 == 2) {
                        bArr[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i8 == 3) {
                        int i9 = i5 << 6;
                        int i10 = i6 + 1;
                        bArr[i6] = (byte) (i9 >> 16);
                        i6 += 2;
                        bArr[i10] = (byte) (i9 >> 8);
                    }
                    if (i6 != i2) {
                        byte[] bArr2 = new byte[i6];
                        System.arraycopy(bArr, 0, bArr2, 0, i6);
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        return new C11816(bArr);
                    }
                    return null;
                }
            }
            bArr = null;
            if (bArr != null) {
                return new C11816(bArr);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C11816 c11816 = (C11816) obj;
        int iMo2336 = mo2336();
        int iMo2337 = c11816.mo2336();
        int iMin = Math.min(iMo2336, iMo2337);
        for (int i = 0; i < iMin; i++) {
            int iMo2325 = mo2325(i) & 255;
            int iMo2326 = c11816.mo2325(i) & 255;
            if (iMo2325 != iMo2326) {
                return iMo2325 < iMo2326 ? -1 : 1;
            }
        }
        if (iMo2336 == iMo2337) {
            return 0;
        }
        return iMo2336 < iMo2337 ? -1 : 1;
    }

    public C11816(byte[] bArr) {
        this.f35250 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11816 m28897(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new C11816((byte[]) bArr.clone());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11816 m28900(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C11816 c11816 = new C11816(str.getBytes(C21736.f69703));
        c11816.f35249 = str;
        return c11816;
    }

    /* JADX INFO: renamed from: ᩴ */
    public String mo2335() {
        String str = this.f35249;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f35250, C21736.f69703);
        this.f35249 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo2326() {
        return C3349.m10248(this.f35250);
    }

    /* JADX INFO: renamed from: ܿ */
    public C11816 mo2334() {
        return m28899("MD5");
    }

    /* JADX INFO: renamed from: ᩻ */
    public C11816 mo2337() {
        return m28899(XMSSKeyParameters.SHA_256);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C11816 m28899(String str) {
        try {
            return m28897(MessageDigest.getInstance(str).digest(this.f35250));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo2332() {
        byte[] bArr = this.f35250;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f35247;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11816 m28898(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m28895(str.charAt(i2)) << 4) + m28895(str.charAt(i2 + 1)));
        }
        return m28897(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28895(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: ۡ */
    public C11816 mo2330() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f35250;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + UTF8.S_CS3);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + UTF8.S_CS3);
                    }
                }
                return new C11816(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public C11816 mo2331() {
        byte[] bArr = this.f35250;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(C3200.m9831(this.f35250.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("endIndex > length(")));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C11816(bArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public byte mo2325(int i) {
        return this.f35250[i];
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo2336() {
        return this.f35250.length;
    }

    /* JADX INFO: renamed from: ܺ */
    public byte[] mo2333() {
        return (byte[]) this.f35250.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo2327(C12521 c12521) {
        byte[] bArr = this.f35250;
        c12521.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo2329(C11816 c11816, int i) {
        return c11816.mo2328(0, this.f35250, 0, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo2328(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f35250;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = C21736.f69703;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11816) {
            C11816 c11816 = (C11816) obj;
            int iMo2336 = c11816.mo2336();
            byte[] bArr = this.f35250;
            if (iMo2336 == bArr.length && c11816.mo2328(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f35251;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f35250);
        this.f35251 = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.f35250.length == 0) {
            return "[size=0]";
        }
        String strMo2335 = mo2335();
        int length = strMo2335.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strMo2335.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strMo2335.codePointAt(length2);
                if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                    length2 = -1;
                    break;
                }
                i++;
                length2 += Character.charCount(iCodePointAt);
            } else {
                break;
            }
        }
        if (length2 != -1) {
            String strReplace = strMo2335.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (length2 >= strMo2335.length()) {
                return C4860.m14172("[text=", strReplace, "]");
            }
            return "[size=" + this.f35250.length + " text=" + strReplace + "…]";
        }
        if (this.f35250.length <= 64) {
            return "[hex=" + mo2332() + "]";
        }
        return "[size=" + this.f35250.length + " hex=" + mo2331().mo2332() + "…]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        C11816 c11816 = new C11816(bArr);
        try {
            Field declaredField = C11816.class.getDeclaredField("᩸");
            declaredField.setAccessible(true);
            declaredField.set(this, c11816.f35250);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f35250.length);
        objectOutputStream.write(this.f35250);
    }
}
