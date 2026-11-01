package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ᩳ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C19203 {

    /* JADX INFO: renamed from: ܳ */
    public static final AbstractC8146 f57389;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f57392;

    /* JADX INFO: renamed from: ۧ */
    public int f57393;

    /* JADX INFO: renamed from: ܽ */
    public int f57394;

    /* JADX INFO: renamed from: ᩳ */
    public static final char[] f57391 = {'\r', '\n'};

    /* JADX INFO: renamed from: ܿ */
    public static final char[] f57390 = {'\n'};

    /* JADX INFO: renamed from: ֫ */
    public static boolean m43698(byte b) {
        return (b & 192) == 128;
    }

    static {
        Charset charset = StandardCharsets.US_ASCII;
        Charset charset2 = StandardCharsets.UTF_8;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        f57389 = AbstractC8146.m18925();
    }

    public C19203() {
        this.f57392 = C5792.f14227;
    }

    public C19203(int i) {
        this.f57392 = new byte[i];
        this.f57393 = i;
    }

    public C19203(byte[] bArr) {
        this.f57392 = bArr;
        this.f57393 = bArr.length;
    }

    public C19203(byte[] bArr, int i) {
        this.f57392 = bArr;
        this.f57393 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43708(int i, byte[] bArr) {
        this.f57392 = bArr;
        this.f57393 = i;
        this.f57394 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43703() {
        return Math.max(this.f57393 - this.f57394, 0);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m43729() {
        return this.f57393;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m43732(int i) {
        C23877.m52957(i >= 0 && i <= this.f57392.length);
        this.f57393 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m43731() {
        return this.f57394;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m43730(int i) {
        C23877.m52957(i >= 0 && i <= this.f57393);
        this.f57394 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m43728() {
        return this.f57392;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43706(int i) {
        byte[] bArr = this.f57392;
        if (i > bArr.length) {
            this.f57392 = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m43718() {
        return this.f57392.length;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43727(int i) {
        byte[] bArr = this.f57392;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m43708(i, bArr);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m43724(int i) {
        m43730(this.f57394 + i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43707(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f57392, this.f57394, bArr, i, i2);
        this.f57394 += i2;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m43723() {
        return this.f57392[this.f57394] & 255;
    }

    /* JADX INFO: renamed from: ֫ */
    private char m43695(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f57392;
            int i2 = this.f57394 + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.f57392;
            int i3 = this.f57394 + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m43704(Charset charset) {
        int iM43700 = m43700(charset);
        if (iM43700 != 0) {
            return C15129.m34548(iM43700 >>> 8);
        }
        return 1114112;
    }

    /* JADX INFO: renamed from: ֨ */
    public final int m43702() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        this.f57394 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۗ */
    public final int m43710() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f57394 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: ۘ */
    public final int m43711() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = bArr[i] & 255;
        this.f57394 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: ֡ */
    public final short m43701() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f57394 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: ۡ */
    public final short m43716() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = bArr[i] & 255;
        this.f57394 = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: ᩸ */
    public final int m43737() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f57394 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f57394 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m43714() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f57394 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f57394 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ܶ */
    public final long m43725() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f57394 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f57394 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f57394 = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: ܺ */
    public final long m43726() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f57394 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f57394 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f57394 = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m43739() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f57394 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f57394 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f57394 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final int m43736() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f57394 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f57394 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f57394 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final long m43733() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f57394 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f57394 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f57394 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f57394 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f57394 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f57394 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f57394 = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: ۢ */
    public final long m43717() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f57394 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f57394 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f57394 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f57394 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f57394 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f57394 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f57394 = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: ۠ */
    public final int m43715() {
        byte[] bArr = this.f57392;
        int i = this.f57394;
        int i2 = i + 1;
        this.f57394 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f57394 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f57394 = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: ۚ */
    public final int m43713() {
        return (m43702() << 21) | (m43702() << 14) | (m43702() << 7) | m43702();
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m43738() {
        int iM43739 = m43739();
        if (iM43739 >= 0) {
            return iM43739;
        }
        throw new IllegalStateException(C20778.m46922(iM43739, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۖ */
    public final int m43709() {
        int iM43736 = m43736();
        if (iM43736 >= 0) {
            return iM43736;
        }
        throw new IllegalStateException(C20778.m46922(iM43736, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۙ */
    public final long m43712() {
        long jM43733 = m43733();
        if (jM43733 >= 0) {
            return jM43733;
        }
        throw new IllegalStateException(C17588.m40051(jM43733, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43705(int i, Charset charset) {
        String str = new String(this.f57392, this.f57394, i, charset);
        this.f57394 += i;
        return str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m43719(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f57394;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f57393 || this.f57392[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f57392;
        String str = C5792.f14228;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f57394 += i;
        return str2;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m43734() {
        if (m43703() == 0) {
            return null;
        }
        int i = this.f57394;
        while (i < this.f57393 && this.f57392[i] != 0) {
            i++;
        }
        byte[] bArr = this.f57392;
        int i2 = this.f57394;
        String str = C5792.f14228;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f57394 = i;
        if (i < this.f57393) {
            this.f57394 = i + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ */
    public final String m43720(Charset charset) {
        int i;
        byte[] bArr;
        C23877.m52956("Unsupported charset: " + charset, f57389.contains(charset));
        if (m43703() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m43721();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f57394;
        while (true) {
            int i3 = this.f57393;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && C5792.m13031(this.f57392[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f57392;
                if (bArr2[i2] == 0 && C5792.m13031(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f57392;
                    if (bArr[i2 + 1] == 0 && C5792.m13031(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f57392;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM43705 = m43705(i2 - this.f57394, charset);
        if (this.f57394 != this.f57393 && m43696(charset, f57391) == '\r') {
            m43696(charset, f57390);
        }
        return strM43705;
    }

    /* JADX INFO: renamed from: ۬ */
    public final long m43722() {
        int i;
        int i2;
        long j = this.f57392[this.f57394];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new NumberFormatException(C17588.m40051(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f57392[this.f57394 + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(C17588.m40051(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f57394 += i2;
        return j;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final int m43735() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f57394 == this.f57393) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM43702 = m43702();
            j |= (127 & jM43702) << (i * 7);
            if ((jM43702 & 128) == 0) {
                break;
            }
        }
        return C15129.m34548(j);
    }

    /* JADX INFO: renamed from: ۫ */
    public final Charset m43721() {
        if (m43703() >= 3) {
            byte[] bArr = this.f57392;
            int i = this.f57394;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f57394 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m43703() < 2) {
            return null;
        }
        byte[] bArr2 = this.f57392;
        int i2 = this.f57394;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f57394 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f57394 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: ֫ */
    private char m43696(Charset charset, char[] cArr) {
        int iM43700;
        if (m43703() >= m43699(charset) && (iM43700 = m43700(charset)) != 0) {
            long j = iM43700 >>> 8;
            C6194.m14025(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                C6194.m14025(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f57394 = C15129.m34548(iM43700 & 255) + this.f57394;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m43700(Charset charset) {
        int i;
        int codePoint;
        int i2;
        int iM43697;
        C23877.m52956("Unsupported charset: " + charset, f57389.contains(charset));
        if (m43703() < m43699(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f57394 + ", limit=" + this.f57393);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f57392[this.f57394];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i3;
            }
            return 0;
        }
        if (!charset.equals(StandardCharsets.UTF_8)) {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM43695 = m43695(0, byteOrder);
            if (!Character.isHighSurrogate(cM43695) || m43703() < 4) {
                i3 = 2;
                i = cM43695;
            } else {
                i3 = 4;
                codePoint = Character.toCodePoint(cM43695, m43695(2, byteOrder));
            }
            return (codePoint << 8) | i3;
        }
        byte b2 = this.f57392[this.f57394];
        if ((b2 & GCMSIVBlockCipher.MASK) == 0) {
            i2 = 1;
        } else if ((b2 & C0684bo.f2506k) == 192 && m43703() >= 2 && m43698(this.f57392[this.f57394 + 1])) {
            i2 = 2;
        } else if ((this.f57392[this.f57394] & 240) == 224 && m43703() >= 3 && m43698(this.f57392[this.f57394 + 1]) && m43698(this.f57392[this.f57394 + 2])) {
            i2 = 3;
        } else {
            i2 = ((this.f57392[this.f57394] & 248) == 240 && m43703() >= 4 && m43698(this.f57392[this.f57394 + 1]) && m43698(this.f57392[this.f57394 + 2]) && m43698(this.f57392[this.f57394 + 3])) ? 4 : 0;
        }
        if (i2 == 1) {
            iM43697 = this.f57392[this.f57394] & 255;
        } else if (i2 == 2) {
            byte[] bArr = this.f57392;
            int i4 = this.f57394;
            iM43697 = m43697(0, 0, bArr[i4], bArr[i4 + 1]);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    byte[] bArr2 = this.f57392;
                    int i5 = this.f57394;
                    iM43697 = m43697(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                }
                return 0;
            }
            byte[] bArr3 = this.f57392;
            int i6 = this.f57394;
            iM43697 = m43697(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
        }
        i3 = i2;
        i = iM43697;
        codePoint = i;
        return (codePoint << 8) | i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m43699(Charset charset) {
        C23877.m52956("Unsupported charset: " + charset, f57389.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43697(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return C15129.m34546((byte) 0, C13789.m31443(((i & 7) << 2) | ((i2 & 48) >> 4)), C13789.m31443(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), C13789.m31443(((b & 3) << 6) | (((byte) i4) & 63)));
    }
}
