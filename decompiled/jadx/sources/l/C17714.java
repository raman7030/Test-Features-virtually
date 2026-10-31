package l;

import com.umeng.analytics.pro.bo;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ᩳ֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17714 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f54197;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f54200;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f54201;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54202;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final char[] f54199 = {'\r', '\n'};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final char[] f54198 = {'\n'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m41452(byte b) {
        return (b & 192) == 128;
    }

    static {
        Charset charset = StandardCharsets.US_ASCII;
        Charset charset2 = StandardCharsets.UTF_8;
        Charset charset3 = StandardCharsets.UTF_16;
        Charset charset4 = StandardCharsets.UTF_16BE;
        Charset charset5 = StandardCharsets.UTF_16LE;
        f54197 = AbstractC6079.m16994();
    }

    public C17714() {
        this.f54200 = C3603.f11423;
    }

    public C17714(int i) {
        this.f54200 = new byte[i];
        this.f54201 = i;
    }

    public C17714(byte[] bArr) {
        this.f54200 = bArr;
        this.f54201 = bArr.length;
    }

    public C17714(byte[] bArr, int i) {
        this.f54200 = bArr;
        this.f54201 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41462(int i, byte[] bArr) {
        this.f54200 = bArr;
        this.f54201 = i;
        this.f54202 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41457() {
        return Math.max(this.f54201 - this.f54202, 0);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m41483() {
        return this.f54201;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41486(int i) {
        C22632.m50631(i >= 0 && i <= this.f54200.length);
        this.f54201 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m41485() {
        return this.f54202;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41484(int i) {
        C22632.m50631(i >= 0 && i <= this.f54201);
        this.f54202 = i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m41482() {
        return this.f54200;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41460(int i) {
        byte[] bArr = this.f54200;
        if (i > bArr.length) {
            this.f54200 = Arrays.copyOf(bArr, i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m41472() {
        return this.f54200.length;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41481(int i) {
        byte[] bArr = this.f54200;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        m41462(i, bArr);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41478(int i) {
        m41484(this.f54202 + i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41461(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f54200, this.f54202, bArr, i, i2);
        this.f54202 += i2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m41477() {
        return this.f54200[this.f54202] & 255;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m41449(int i, ByteOrder byteOrder) {
        byte b;
        byte b2;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.f54200;
            int i2 = this.f54202 + i;
            b = bArr[i2];
            b2 = bArr[i2 + 1];
        } else {
            byte[] bArr2 = this.f54200;
            int i3 = this.f54202 + i;
            b = bArr2[i3 + 1];
            b2 = bArr2[i3];
        }
        return (char) ((b << 8) | (b2 & 255));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m41458(Charset charset) {
        int iM41454 = m41454(charset);
        if (iM41454 != 0) {
            return C13426.m32446(iM41454 >>> 8);
        }
        return 1114112;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m41456() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        this.f54202 = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m41464() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f54202 = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m41465() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = bArr[i] & 255;
        this.f54202 = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final short m41455() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f54202 = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final short m41470() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = bArr[i] & 255;
        this.f54202 = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m41491() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.f54202 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f54202 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m41468() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = ((bArr[i] & 255) << 24) >> 8;
        int i4 = i + 2;
        this.f54202 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.f54202 = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m41479() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i + 2;
        this.f54202 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i4 = i + 3;
        this.f54202 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        this.f54202 = i + 4;
        return (((long) bArr[i4]) & 255) | j3;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m41480() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f54202 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f54202 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        this.f54202 = i + 4;
        return ((((long) bArr[i4]) & 255) << 24) | j3;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m41493() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.f54202 = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.f54202 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f54202 = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m41490() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.f54202 = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.f54202 = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f54202 = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m41487() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i + 2;
        this.f54202 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i4 = i + 3;
        this.f54202 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i + 4;
        this.f54202 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i + 5;
        this.f54202 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i + 6;
        this.f54202 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i + 7;
        this.f54202 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        this.f54202 = i + 8;
        return (((long) bArr[i8]) & 255) | j7;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m41471() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        long j = ((long) bArr[i]) & 255;
        int i3 = i + 2;
        this.f54202 = i3;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i4 = i + 3;
        this.f54202 = i4;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i + 4;
        this.f54202 = i5;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i + 5;
        this.f54202 = i6;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i + 6;
        this.f54202 = i7;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i + 7;
        this.f54202 = i8;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        this.f54202 = i + 8;
        return ((((long) bArr[i8]) & 255) << 56) | j7;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m41469() {
        byte[] bArr = this.f54200;
        int i = this.f54202;
        int i2 = i + 1;
        this.f54202 = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.f54202 = i + 2;
        int i4 = (bArr[i2] & 255) | i3;
        this.f54202 = i + 4;
        return i4;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m41467() {
        return (m41456() << 21) | (m41456() << 14) | (m41456() << 7) | m41456();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m41492() {
        int iM41493 = m41493();
        if (iM41493 >= 0) {
            return iM41493;
        }
        throw new IllegalStateException(C19370.m44628(iM41493, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m41463() {
        int iM41490 = m41490();
        if (iM41490 >= 0) {
            return iM41490;
        }
        throw new IllegalStateException(C19370.m44628(iM41490, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m41466() {
        long jM41487 = m41487();
        if (jM41487 >= 0) {
            return jM41487;
        }
        throw new IllegalStateException(C16014.m37865(jM41487, "Top bit not zero: "));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41459(int i, Charset charset) {
        String str = new String(this.f54200, this.f54202, i, charset);
        this.f54202 += i;
        return str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41473(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f54202;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.f54201 || this.f54200[i3] != 0) ? i : i - 1;
        byte[] bArr = this.f54200;
        String str = C3603.f11424;
        String str2 = new String(bArr, i2, i4, StandardCharsets.UTF_8);
        this.f54202 += i;
        return str2;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m41488() {
        if (m41457() == 0) {
            return null;
        }
        int i = this.f54202;
        while (i < this.f54201 && this.f54200[i] != 0) {
            i++;
        }
        byte[] bArr = this.f54200;
        int i2 = this.f54202;
        String str = C3603.f11424;
        String str2 = new String(bArr, i2, i - i2, StandardCharsets.UTF_8);
        this.f54202 = i;
        if (i < this.f54201) {
            this.f54202 = i + 1;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m41474(Charset charset) {
        int i;
        byte[] bArr;
        C22632.m50630("Unsupported charset: " + charset, f54197.contains(charset));
        if (m41457() == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            m41475();
        }
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(charset2)) {
            i = 1;
        } else {
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.f54202;
        while (true) {
            int i3 = this.f54201;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && C3603.m11055(this.f54200[i2])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr2 = this.f54200;
                if (bArr2[i2] == 0 && C3603.m11055(bArr2[i2 + 1])) {
                    break;
                }
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f54200;
                    if (bArr[i2 + 1] == 0 && C3603.m11055(bArr[i2])) {
                        break;
                    }
                }
                i2 += i;
            } else {
                if (charset.equals(StandardCharsets.UTF_16LE)) {
                    bArr = this.f54200;
                    if (bArr[i2 + 1] == 0) {
                        continue;
                    }
                }
                i2 += i;
            }
        }
        String strM41459 = m41459(i2 - this.f54202, charset);
        if (this.f54202 != this.f54201 && m41450(charset, f54199) == '\r') {
            m41450(charset, f54198);
        }
        return strM41459;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long m41476() {
        int i;
        int i2;
        long j = this.f54200[this.f54202];
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
            throw new NumberFormatException(C16014.m37865(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i = 1; i < i2; i++) {
            byte b = this.f54200[this.f54202 + i];
            if ((b & 192) != 128) {
                throw new NumberFormatException(C16014.m37865(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b & 63));
        }
        this.f54202 += i2;
        return j;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int m41489() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.f54202 == this.f54201) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long jM41456 = m41456();
            j |= (127 & jM41456) << (i * 7);
            if ((jM41456 & 128) == 0) {
                break;
            }
        }
        return C13426.m32446(j);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Charset m41475() {
        if (m41457() >= 3) {
            byte[] bArr = this.f54200;
            int i = this.f54202;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.f54202 = i + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (m41457() < 2) {
            return null;
        }
        byte[] bArr2 = this.f54200;
        int i2 = this.f54202;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.f54202 = i2 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.f54202 = i2 + 2;
        return StandardCharsets.UTF_16LE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m41450(Charset charset, char[] cArr) {
        int iM41454;
        if (m41457() >= m41453(charset) && (iM41454 = m41454(charset)) != 0) {
            long j = iM41454 >>> 8;
            C4025.m12105(j, "out of range: %s", (j >> 32) == 0);
            int i = (int) j;
            if (!Character.isSupplementaryCodePoint(i)) {
                long j2 = i;
                char c = (char) j2;
                C4025.m12105(j2, "Out of range: %s", ((long) c) == j2);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.f54202 = C13426.m32446(iM41454 & 255) + this.f54202;
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m41454(Charset charset) {
        int i;
        int codePoint;
        int i2;
        int iM41451;
        C22632.m50630("Unsupported charset: " + charset, f54197.contains(charset));
        if (m41457() < m41453(charset)) {
            throw new IndexOutOfBoundsException("position=" + this.f54202 + ", limit=" + this.f54201);
        }
        int i3 = 1;
        if (charset.equals(StandardCharsets.US_ASCII)) {
            byte b = this.f54200[this.f54202];
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                codePoint = b & 255;
                return (codePoint << 8) | i3;
            }
            return 0;
        }
        if (!charset.equals(StandardCharsets.UTF_8)) {
            ByteOrder byteOrder = charset.equals(StandardCharsets.UTF_16LE) ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
            char cM41449 = m41449(0, byteOrder);
            if (!Character.isHighSurrogate(cM41449) || m41457() < 4) {
                i3 = 2;
                i = cM41449;
            } else {
                i3 = 4;
                codePoint = Character.toCodePoint(cM41449, m41449(2, byteOrder));
            }
            return (codePoint << 8) | i3;
        }
        byte b2 = this.f54200[this.f54202];
        if ((b2 & GCMSIVBlockCipher.MASK) == 0) {
            i2 = 1;
        } else if ((b2 & bo.k) == 192 && m41457() >= 2 && m41452(this.f54200[this.f54202 + 1])) {
            i2 = 2;
        } else if ((this.f54200[this.f54202] & 240) == 224 && m41457() >= 3 && m41452(this.f54200[this.f54202 + 1]) && m41452(this.f54200[this.f54202 + 2])) {
            i2 = 3;
        } else {
            i2 = ((this.f54200[this.f54202] & 248) == 240 && m41457() >= 4 && m41452(this.f54200[this.f54202 + 1]) && m41452(this.f54200[this.f54202 + 2]) && m41452(this.f54200[this.f54202 + 3])) ? 4 : 0;
        }
        if (i2 == 1) {
            iM41451 = this.f54200[this.f54202] & 255;
        } else if (i2 == 2) {
            byte[] bArr = this.f54200;
            int i4 = this.f54202;
            iM41451 = m41451(0, 0, bArr[i4], bArr[i4 + 1]);
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    byte[] bArr2 = this.f54200;
                    int i5 = this.f54202;
                    iM41451 = m41451(bArr2[i5], bArr2[i5 + 1], bArr2[i5 + 2], bArr2[i5 + 3]);
                }
                return 0;
            }
            byte[] bArr3 = this.f54200;
            int i6 = this.f54202;
            iM41451 = m41451(0, bArr3[i6] & 15, bArr3[i6 + 1], bArr3[i6 + 2]);
        }
        i3 = i2;
        i = iM41451;
        codePoint = i;
        return (codePoint << 8) | i3;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m41453(Charset charset) {
        C22632.m50630("Unsupported charset: " + charset, f54197.contains(charset));
        return (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41451(int i, int i2, int i3, int i4) {
        byte b = (byte) i3;
        return C13426.m32444((byte) 0, C12016.m29383(((i & 7) << 2) | ((i2 & 48) >> 4)), C12016.m29383(((((byte) i2) & 15) << 4) | ((b & 60) >> 2)), C12016.m29383(((b & 3) << 6) | (((byte) i4) & 63)));
    }
}
