package p067l;

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
public class C13598 implements Serializable, Comparable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public static final char[] f38249 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: ۙ */
    public static final C13598 f38250 = m30946(new byte[0]);

    /* JADX INFO: renamed from: ᩶ */
    public transient String f38251;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f38252;

    /* JADX INFO: renamed from: ᩹ */
    public transient int f38253;

    /* JADX INFO: renamed from: ᩳ */
    public static C13598 m30950(String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        if (charset != null) {
            return new C13598(str.getBytes(charset));
        }
        throw new IllegalArgumentException("charset == null");
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static C13598 m30945(String str) {
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
                        return new C13598(bArr);
                    }
                    return null;
                }
            }
            bArr = null;
            if (bArr != null) {
                return new C13598(bArr);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C13598 c13598 = (C13598) obj;
        int iMo4707 = mo4707();
        int iMo4708 = c13598.mo4707();
        int iMin = Math.min(iMo4707, iMo4708);
        for (int i = 0; i < iMin; i++) {
            int iMo4696 = mo4696(i) & 255;
            int iMo4697 = c13598.mo4696(i) & 255;
            if (iMo4696 != iMo4697) {
                return iMo4696 < iMo4697 ? -1 : 1;
            }
        }
        if (iMo4707 == iMo4708) {
            return 0;
        }
        return iMo4707 < iMo4708 ? -1 : 1;
    }

    public C13598(byte[] bArr) {
        this.f38252 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13598 m30946(byte... bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new C13598((byte[]) bArr.clone());
    }

    /* JADX INFO: renamed from: ܿ */
    public static C13598 m30949(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C13598 c13598 = new C13598(str.getBytes(C23026.f72410));
        c13598.f38251 = str;
        return c13598;
    }

    /* JADX INFO: renamed from: ᩴ */
    public String mo4706() {
        String str = this.f38251;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f38252, C23026.f72410);
        this.f38251 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public String mo4697() {
        return C5551.m12284(this.f38252);
    }

    /* JADX INFO: renamed from: ܿ */
    public C13598 mo4705() {
        return m30948("MD5");
    }

    /* JADX INFO: renamed from: ᩻ */
    public C13598 mo4708() {
        return m30948(XMSSKeyParameters.SHA_256);
    }

    /* JADX INFO: renamed from: ܽ */
    private C13598 m30948(String str) {
        try {
            return m30946(MessageDigest.getInstance(str).digest(this.f38252));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public String mo4703() {
        byte[] bArr = this.f38252;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f38249;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C13598 m30947(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m30944(str.charAt(i2)) << 4) + m30944(str.charAt(i2 + 1)));
        }
        return m30946(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30944(char c) {
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
    public C13598 mo4701() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f38252;
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
                return new C13598(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۢ */
    public C13598 mo4702() {
        byte[] bArr = this.f38252;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(C5410.m11876(this.f38252.length, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder("endIndex > length(")));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C13598(bArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public byte mo4696(int i) {
        return this.f38252[i];
    }

    /* JADX INFO: renamed from: ᩷ */
    public int mo4707() {
        return this.f38252.length;
    }

    /* JADX INFO: renamed from: ܺ */
    public byte[] mo4704() {
        return (byte[]) this.f38252.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo4698(C14268 c14268) {
        byte[] bArr = this.f38252;
        c14268.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo4700(C13598 c13598, int i) {
        return c13598.mo4699(0, this.f38252, 0, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo4699(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f38252;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = C23026.f72410;
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
        if (obj instanceof C13598) {
            C13598 c13598 = (C13598) obj;
            int iMo4707 = c13598.mo4707();
            byte[] bArr = this.f38252;
            if (iMo4707 == bArr.length && c13598.mo4699(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f38253;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f38252);
        this.f38253 = iHashCode;
        return iHashCode;
    }

    public String toString() {
        if (this.f38252.length == 0) {
            return "[size=0]";
        }
        String strMo4706 = mo4706();
        int length = strMo4706.length();
        int length2 = 0;
        int i = 0;
        while (true) {
            if (length2 >= length) {
                length2 = strMo4706.length();
                break;
            }
            if (i != 64) {
                int iCodePointAt = strMo4706.codePointAt(length2);
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
            String strReplace = strMo4706.substring(0, length2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (length2 >= strMo4706.length()) {
                return C6988.m16053("[text=", strReplace, "]");
            }
            return "[size=" + this.f38252.length + " text=" + strReplace + "…]";
        }
        if (this.f38252.length <= 64) {
            return "[hex=" + mo4703() + "]";
        }
        return "[size=" + this.f38252.length + " hex=" + mo4702().mo4703() + "…]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "byteCount < 0: "));
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
        C13598 c13598 = new C13598(bArr);
        try {
            Field declaredField = C13598.class.getDeclaredField("᩸");
            declaredField.setAccessible(true);
            declaredField.set(this, c13598.f38252);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f38252.length);
        objectOutputStream.write(this.f38252);
    }
}
