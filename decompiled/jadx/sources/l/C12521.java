package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۫ܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04CR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12521 implements InterfaceC6171, InterfaceC10405, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f37623 = {UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18914 f37624;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f37625;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, l.InterfaceC5508
    public final void close() {
    }

    @Override // l.InterfaceC10405, l.InterfaceC5508, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫ */
    public final long mo12302(InterfaceC5508 interfaceC5508) {
        throw null;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC10405 mo26248() {
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܳܽ */
    public final OutputStream mo26250() {
        throw null;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ᩷ */
    public final C12521 mo12315() {
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeByte(int i) {
        m30720writeByte(i);
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeInt(int i) {
        m30721writeInt(i);
        return this;
    }

    @Override // l.InterfaceC10405
    public final /* bridge */ /* synthetic */ InterfaceC10405 writeShort(int i) {
        m30722writeShort(i);
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26246(C11816 c11816) {
        m30710(c11816);
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ۡ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26247(long j) {
        m30712(j);
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܳ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26249(long j) {
        m30715(j);
        return this;
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ InterfaceC10405 mo26252(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    public final long size() {
        return this.f37625;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۢۧ */
    public final boolean mo12308() {
        return this.f37625 == 0;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ܿ */
    public final void mo12313(long j) throws EOFException {
        if (this.f37625 < j) {
            throw new EOFException();
        }
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۡܽ */
    public final InputStream mo12307() {
        return new C13226(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30711(C12521 c12521, long j, long j2) {
        if (c12521 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C21736.m49060(this.f37625, j, j2);
        if (j2 == 0) {
            return;
        }
        c12521.f37625 += j2;
        C18914 c18914 = this.f37624;
        while (true) {
            long j3 = c18914.f59597 - c18914.f59600;
            if (j < j3) {
                break;
            }
            j -= j3;
            c18914 = c18914.f59599;
        }
        while (j2 > 0) {
            C18914 c18914M43659 = c18914.m43659();
            int i = (int) (((long) c18914M43659.f59600) + j);
            c18914M43659.f59600 = i;
            c18914M43659.f59597 = Math.min(i + ((int) j2), c18914M43659.f59597);
            C18914 c18915 = c12521.f37624;
            if (c18915 == null) {
                c18914M43659.f59598 = c18914M43659;
                c18914M43659.f59599 = c18914M43659;
                c12521.f37624 = c18914M43659;
            } else {
                c18915.f59598.m43657(c18914M43659);
            }
            j2 -= (long) (c18914M43659.f59597 - c18914M43659.f59600);
            c18914 = c18914.f59599;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m30716() {
        long j = this.f37625;
        if (j == 0) {
            return 0L;
        }
        C18914 c18914 = this.f37624.f59598;
        int i = c18914.f59597;
        return (i >= 8192 || !c18914.f59601) ? j : j - ((long) (i - c18914.f59600));
    }

    @Override // l.InterfaceC6171
    public final byte readByte() {
        long j = this.f37625;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        int i3 = i + 1;
        byte b = c18914.f59596[i];
        this.f37625 = j - 1;
        if (i3 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
            return b;
        }
        c18914.f59600 = i3;
        return b;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte m30713(long j) {
        int i;
        C21736.m49060(this.f37625, j, 1L);
        long j2 = this.f37625;
        if (j2 - j > j) {
            C18914 c18914 = this.f37624;
            while (true) {
                int i2 = c18914.f59597;
                int i3 = c18914.f59600;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    c18914 = c18914.f59599;
                } else {
                    return c18914.f59596[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            C18914 c18915 = this.f37624;
            do {
                c18915 = c18915.f59598;
                int i4 = c18915.f59597;
                i = c18915.f59600;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return c18915.f59596[i + ((int) j4)];
        }
    }

    @Override // l.InterfaceC6171
    public final short readShort() {
        long j = this.f37625;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f37625);
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c18914.f59596;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f37625 = j - 2;
        if (i5 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        } else {
            c18914.f59600 = i5;
        }
        return (short) i6;
    }

    @Override // l.InterfaceC6171
    public final int readInt() {
        long j = this.f37625;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f37625);
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        int i2 = c18914.f59597;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c18914.f59596;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f37625 = j - 4;
        if (i5 == i2) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
            return i6;
        }
        c18914.f59600 = i5;
        return i6;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ᩵ۧ */
    public final long mo12314() {
        long j = 0;
        if (this.f37625 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        boolean z = false;
        boolean z2 = false;
        do {
            C18914 c18914 = this.f37624;
            byte[] bArr = c18914.f59596;
            int i2 = c18914.f59600;
            int i3 = c18914.f59597;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        C12521 c12521 = new C12521();
                        c12521.m30715(j);
                        c12521.m30720writeByte((int) b);
                        if (!z) {
                            c12521.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c12521.m30714()));
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        if (i == 0) {
                            throw new NumberFormatException(C13540.m32584(new StringBuilder("Expected leading [0-9] or '-' character but was 0x"), b));
                        }
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                this.f37624 = c18914.m43656();
                C19620.m45064(c18914);
            } else {
                c18914.f59600 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f37624 != null);
        this.f37625 -= (long) i;
        return z ? j : -j;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۢܽ */
    public final long mo12309() {
        int i;
        if (this.f37625 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C18914 c18914 = this.f37624;
            byte[] bArr = c18914.f59596;
            int i3 = c18914.f59600;
            int i4 = c18914.f59597;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException(C13540.m32584(new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x"), b));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C12521 c12521 = new C12521();
                    c12521.m30712(j);
                    c12521.m30720writeByte((int) b);
                    throw new NumberFormatException("Number too large: ".concat(c12521.m30714()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f37624 = c18914.m43656();
                C19620.m45064(c18914);
            } else {
                c18914.f59600 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f37624 != null);
        this.f37625 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11816 m30719() {
        return new C11816(mo12306());
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۜ */
    public final C11816 mo12305(long j) {
        return new C11816(mo12312(j));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m30714() {
        try {
            return m30704(this.f37625, C21736.f69703);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫ */
    public final String mo12304(Charset charset) {
        try {
            return m30704(this.f37625, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30704(long j, Charset charset) {
        C21736.m49060(this.f37625, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C18914 c18914 = this.f37624;
        int i = c18914.f59600;
        if (((long) i) + j > c18914.f59597) {
            return new String(mo12312(j), charset);
        }
        String str = new String(c18914.f59596, i, (int) j, charset);
        int i2 = (int) (((long) c18914.f59600) + j);
        c18914.f59600 = i2;
        this.f37625 -= j;
        if (i2 == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return str;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֡֫ */
    public final String mo12300() {
        return mo12303(C13132.FOREVER_NS);
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫ */
    public final String mo12303(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "limit < 0: "));
        }
        long j2 = C13132.FOREVER_NS;
        if (j != C13132.FOREVER_NS) {
            j2 = j + 1;
        }
        long jM30703 = m30703((byte) 10, 0L, j2);
        if (jM30703 != -1) {
            return m30718(jM30703);
        }
        if (j2 < this.f37625 && m30713(j2 - 1) == 13 && m30713(j2) == 10) {
            return m30718(j2);
        }
        C12521 c12521 = new C12521();
        m30711(c12521, 0L, Math.min(32L, this.f37625));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f37625, j) + " content=" + c12521.m30719().mo2332() + (char) 8230);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m30718(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m30713(j2) == 13) {
                String strM30704 = m30704(j2, C21736.f69703);
                skip(2L);
                return strM30704;
            }
        }
        String strM30705 = m30704(j, C21736.f69703);
        skip(1L);
        return strM30705;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۜۧ */
    public final byte[] mo12306() {
        try {
            return mo12312(this.f37625);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo12312(long j) throws EOFException {
        C21736.m49060(this.f37625, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // l.InterfaceC6171
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                throw new EOFException();
            }
            i += i2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        C21736.m49060(bArr.length, i, i2);
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c18914.f59597 - c18914.f59600);
        System.arraycopy(c18914.f59596, c18914.f59600, bArr, i, iMin);
        int i3 = c18914.f59600 + iMin;
        c18914.f59600 = i3;
        this.f37625 -= (long) iMin;
        if (i3 == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c18914.f59597 - c18914.f59600);
        byteBuffer.put(c18914.f59596, c18914.f59600, iMin);
        int i = c18914.f59600 + iMin;
        c18914.f59600 = i;
        this.f37625 -= (long) iMin;
        if (i == c18914.f59597) {
            this.f37624 = c18914.m43656();
            C19620.m45064(c18914);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30706() {
        try {
            skip(this.f37625);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // l.InterfaceC6171
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C18914 c18914 = this.f37624;
            if (c18914 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c18914.f59597 - c18914.f59600);
            long j2 = iMin;
            this.f37625 -= j2;
            j -= j2;
            C18914 c18915 = this.f37624;
            int i = c18915.f59600 + iMin;
            c18915.f59600 = i;
            if (i == c18915.f59597) {
                this.f37624 = c18915.m43656();
                C19620.m45064(c18915);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30710(C11816 c11816) {
        if (c11816 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c11816.mo2327(this);
    }

    @Override // l.InterfaceC10405
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC10405 mo26251(String str) {
        m30707(0, str.length(), str);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30707(int i, int i2, String str) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM32308 = C13325.m32308(i2, "endIndex > string.length: ", " > ");
            sbM32308.append(str.length());
            throw new IllegalArgumentException(sbM32308.toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C18914 c18914M30705 = m30705(1);
                byte[] bArr = c18914M30705.f59596;
                int i3 = c18914M30705.f59597 - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = c18914M30705.f59597;
                int i6 = (i3 + i) - i5;
                c18914M30705.f59597 = i5 + i6;
                this.f37625 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    m30720writeByte((cCharAt2 >> 6) | 192);
                    m30720writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m30720writeByte((cCharAt2 >> '\f') | BERTags.FLAGS);
                    m30720writeByte(((cCharAt2 >> 6) & 63) | 128);
                    m30720writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m30720writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m30720writeByte((i8 >> 18) | 240);
                        m30720writeByte(((i8 >> 12) & 63) | 128);
                        m30720writeByte(((i8 >> 6) & 63) | 128);
                        m30720writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30717(int i) {
        if (i < 128) {
            m30720writeByte(i);
            return;
        }
        if (i < 2048) {
            m30720writeByte((i >> 6) | 192);
            m30720writeByte((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(C13540.m32584(new StringBuilder("Unexpected code point: "), i));
            }
            m30720writeByte((i >> 18) | 240);
            m30720writeByte(((i >> 12) & 63) | 128);
            m30720writeByte(((i >> 6) & 63) | 128);
            m30720writeByte((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            m30720writeByte(63);
            return;
        }
        m30720writeByte((i >> 12) | BERTags.FLAGS);
        m30720writeByte(((i >> 6) & 63) | 128);
        m30720writeByte((i & 63) | 128);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30708(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C19370.m44628(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM32308 = C13325.m32308(i2, "endIndex > string.length: ", " > ");
            sbM32308.append(str.length());
            throw new IllegalArgumentException(sbM32308.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C21736.f69703)) {
            m30707(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Override // l.InterfaceC10405
    public final InterfaceC10405 write(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        C21736.m49060(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C18914 c18914M30705 = m30705(1);
            int iMin = Math.min(i3 - i, 8192 - c18914M30705.f59597);
            System.arraycopy(bArr, i, c18914M30705.f59596, c18914M30705.f59597, iMin);
            i += iMin;
            c18914M30705.f59597 += iMin;
        }
        this.f37625 += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C18914 c18914M30705 = m30705(1);
            int iMin = Math.min(i, 8192 - c18914M30705.f59597);
            byteBuffer.get(c18914M30705.f59596, c18914M30705.f59597, iMin);
            i -= iMin;
            c18914M30705.f59597 += iMin;
        }
        this.f37625 += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30709(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (interfaceC1274.mo4334(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: writeByte, reason: collision with other method in class */
    public final void m30720writeByte(int i) {
        C18914 c18914M30705 = m30705(1);
        byte[] bArr = c18914M30705.f59596;
        int i2 = c18914M30705.f59597;
        c18914M30705.f59597 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f37625++;
    }

    /* JADX INFO: renamed from: writeShort, reason: collision with other method in class */
    public final void m30722writeShort(int i) {
        C18914 c18914M30705 = m30705(2);
        byte[] bArr = c18914M30705.f59596;
        int i2 = c18914M30705.f59597;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c18914M30705.f59597 = i2 + 2;
        this.f37625 += 2;
    }

    /* JADX INFO: renamed from: writeInt, reason: collision with other method in class */
    public final void m30721writeInt(int i) {
        C18914 c18914M30705 = m30705(4);
        byte[] bArr = c18914M30705.f59596;
        int i2 = c18914M30705.f59597;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c18914M30705.f59597 = i2 + 4;
        this.f37625 += 4;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30715(long j) {
        if (j == 0) {
            m30720writeByte(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m30707(0, 20, "-9223372036854775808");
                return;
            }
            z = true;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j >= 100) {
                    i = j < 1000 ? 3 : 4;
                } else if (j >= 10) {
                    i = 2;
                }
            } else if (j < 1000000) {
                i = j < 100000 ? 5 : 6;
            } else {
                i = j < 10000000 ? 7 : 8;
            }
        } else if (j < BasicLabelFormatter.TRILLION) {
            if (j < 10000000000L) {
                i = j < 1000000000 ? 9 : 10;
            } else {
                i = j < 100000000000L ? 11 : 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i = 13;
            } else {
                i = j < 100000000000000L ? 14 : 15;
            }
        } else if (j < 100000000000000000L) {
            i = j < 10000000000000000L ? 16 : 17;
        } else {
            i = j < 1000000000000000000L ? 18 : 19;
        }
        if (z) {
            i++;
        }
        C18914 c18914M30705 = m30705(i);
        byte[] bArr = c18914M30705.f59596;
        int i2 = c18914M30705.f59597 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f37623[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c18914M30705.f59597 += i;
        this.f37625 += (long) i;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30712(long j) {
        if (j == 0) {
            m30720writeByte(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C18914 c18914M30705 = m30705(iNumberOfTrailingZeros);
        byte[] bArr = c18914M30705.f59596;
        int i = c18914M30705.f59597;
        int i2 = i + iNumberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = f37623[(int) (15 & j)];
                j >>>= 4;
            } else {
                c18914M30705.f59597 += iNumberOfTrailingZeros;
                this.f37625 += (long) iNumberOfTrailingZeros;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18914 m30705(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            C18914 c18914M45063 = C19620.m45063();
            this.f37624 = c18914M45063;
            c18914M45063.f59598 = c18914M45063;
            c18914M45063.f59599 = c18914M45063;
            return c18914M45063;
        }
        C18914 c18915 = c18914.f59598;
        if (c18915.f59597 + i <= 8192 && c18915.f59601) {
            return c18915;
        }
        C18914 c18914M45064 = C19620.m45063();
        c18915.m43657(c18914M45064);
        return c18914M45064;
    }

    @Override // l.InterfaceC5508
    /* JADX INFO: renamed from: ֫ */
    public final void mo8911(C12521 c12521, long j) {
        C18914 c18914M45063;
        if (c12521 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c12521 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C21736.m49060(c12521.f37625, 0L, j);
        while (j > 0) {
            C18914 c18914 = c12521.f37624;
            int i = c18914.f59597 - c18914.f59600;
            if (j < i) {
                C18914 c18915 = this.f37624;
                C18914 c18916 = c18915 != null ? c18915.f59598 : null;
                if (c18916 != null && c18916.f59601) {
                    if ((((long) c18916.f59597) + j) - ((long) (c18916.f59602 ? 0 : c18916.f59600)) <= 8192) {
                        c18914.m43658(c18916, (int) j);
                        c12521.f37625 -= j;
                        this.f37625 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    c18914M45063 = c18914.m43659();
                } else {
                    c18914M45063 = C19620.m45063();
                    System.arraycopy(c18914.f59596, c18914.f59600, c18914M45063.f59596, 0, i2);
                }
                c18914M45063.f59597 = c18914M45063.f59600 + i2;
                c18914.f59600 += i2;
                c18914.f59598.m43657(c18914M45063);
                c12521.f37624 = c18914M45063;
            }
            C18914 c18917 = c12521.f37624;
            long j2 = c18917.f59597 - c18917.f59600;
            c12521.f37624 = c18917.m43656();
            C18914 c18918 = this.f37624;
            if (c18918 == null) {
                this.f37624 = c18917;
                c18917.f59598 = c18917;
                c18917.f59599 = c18917;
            } else {
                c18918.f59598.m43657(c18917);
                C18914 c18919 = c18917.f59598;
                if (c18919 == c18917) {
                    throw new IllegalStateException();
                }
                if (c18919.f59601) {
                    int i3 = c18917.f59597 - c18917.f59600;
                    if (i3 <= (8192 - c18919.f59597) + (c18919.f59602 ? 0 : c18919.f59600)) {
                        c18917.m43658(c18919, i3);
                        c18917.m43656();
                        C19620.m45064(c18917);
                    }
                }
            }
            c12521.f37625 -= j2;
            this.f37625 += j2;
            j -= j2;
        }
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۧ */
    public final long mo4334(C12521 c12521, long j) {
        if (c12521 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount < 0: "));
        }
        long j2 = this.f37625;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c12521.mo8911(this, j);
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m30703(byte b, long j, long j2) {
        C18914 c18914;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            StringBuilder sbM31106 = C12803.m31106("size=", " fromIndex=", this.f37625);
            sbM31106.append(j);
            sbM31106.append(" toIndex=");
            sbM31106.append(j2);
            throw new IllegalArgumentException(sbM31106.toString());
        }
        long j4 = this.f37625;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c18914 = this.f37624) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c18914 = c18914.f59598;
                j4 -= (long) (c18914.f59597 - c18914.f59600);
            }
        } else {
            while (true) {
                long j5 = ((long) (c18914.f59597 - c18914.f59600)) + j3;
                if (j5 >= j) {
                    break;
                }
                c18914 = c18914.f59599;
                j3 = j5;
            }
            j4 = j3;
        }
        while (j4 < j2) {
            byte[] bArr = c18914.f59596;
            int iMin = (int) Math.min(c18914.f59597, (((long) c18914.f59600) + j2) - j4);
            for (int i = (int) ((((long) c18914.f59600) + j) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c18914.f59600)) + j4;
                }
            }
            j4 += (long) (c18914.f59597 - c18914.f59600);
            c18914 = c18914.f59599;
            j = j4;
        }
        return -1L;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo12311(C11816 c11816) {
        int iMo2336 = c11816.mo2336();
        if (iMo2336 >= 0 && this.f37625 >= iMo2336 && c11816.mo2336() >= iMo2336) {
            for (int i = 0; i < iMo2336; i++) {
                if (m30713(i) == c11816.mo2325(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return C15384.f47109;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12521)) {
            return false;
        }
        C12521 c12521 = (C12521) obj;
        long j = this.f37625;
        if (j != c12521.f37625) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C18914 c18914 = this.f37624;
        C18914 c18915 = c12521.f37624;
        int i = c18914.f59600;
        int i2 = c18915.f59600;
        while (j2 < this.f37625) {
            long jMin = Math.min(c18914.f59597 - i, c18915.f59597 - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c18914.f59596[i] != c18915.f59596[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c18914.f59597) {
                c18914 = c18914.f59599;
                i = c18914.f59600;
            }
            if (i2 == c18915.f59597) {
                c18915 = c18915.f59599;
                i2 = c18915.f59600;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C18914 c18914 = this.f37624;
        if (c18914 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c18914.f59597;
            for (int i3 = c18914.f59600; i3 < i2; i3++) {
                i = (i * 31) + c18914.f59596[i3];
            }
            c18914 = c18914.f59599;
        } while (c18914 != this.f37624);
        return i;
    }

    public final Object clone() {
        C12521 c12521 = new C12521();
        if (this.f37625 == 0) {
            return c12521;
        }
        C18914 c18914M43659 = this.f37624.m43659();
        c12521.f37624 = c18914M43659;
        c18914M43659.f59598 = c18914M43659;
        c18914M43659.f59599 = c18914M43659;
        C18914 c18914 = this.f37624;
        while (true) {
            c18914 = c18914.f59599;
            if (c18914 != this.f37624) {
                c12521.f37624.f59598.m43657(c18914.m43659());
            } else {
                c12521.f37625 = this.f37625;
                return c12521;
            }
        }
    }

    public final String toString() {
        C11816 c0568;
        long j = this.f37625;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c0568 = C11816.f35248;
            } else {
                c0568 = new C0568(this, i);
            }
            return c0568.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f37625);
    }
}
