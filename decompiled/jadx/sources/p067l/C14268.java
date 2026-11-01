package p067l;

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
public final class C14268 implements InterfaceC8233, InterfaceC12257, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: ᩶ */
    public static final byte[] f40647 = {UTF8.S_P3A, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: ᩸ */
    public C20344 f40648;

    /* JADX INFO: renamed from: ᩹ */
    public long f40649;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p067l.InterfaceC7603
    public final void close() {
    }

    @Override // p067l.InterfaceC12257, p067l.InterfaceC7603, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final long mo14207(InterfaceC7603 interfaceC7603) {
        throw null;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC12257 mo28277() {
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܳܽ */
    public final OutputStream mo28279() {
        throw null;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ᩷ */
    public final C14268 mo14220() {
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final /* bridge */ /* synthetic */ InterfaceC12257 writeByte(int i) {
        m56480writeByte(i);
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final /* bridge */ /* synthetic */ InterfaceC12257 writeInt(int i) {
        m56481writeInt(i);
        return this;
    }

    @Override // p067l.InterfaceC12257
    public final /* bridge */ /* synthetic */ InterfaceC12257 writeShort(int i) {
        m56482writeShort(i);
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC12257 mo28275(C13598 c13598) {
        m32784(c13598);
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ۡ */
    public final /* bridge */ /* synthetic */ InterfaceC12257 mo28276(long j) {
        m32786(j);
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܳ */
    public final /* bridge */ /* synthetic */ InterfaceC12257 mo28278(long j) {
        m32789(j);
        return this;
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ InterfaceC12257 mo28281(int i, int i2, byte[] bArr) {
        write(bArr, i, i2);
        return this;
    }

    public final long size() {
        return this.f40649;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۢۧ */
    public final boolean mo14213() {
        return this.f40649 == 0;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ܿ */
    public final void mo14218(long j) throws EOFException {
        if (this.f40649 < j) {
            throw new EOFException();
        }
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۡܽ */
    public final InputStream mo14212() {
        return new C14938(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32785(C14268 c14268, long j, long j2) {
        if (c14268 == null) {
            throw new IllegalArgumentException("out == null");
        }
        C23026.m51409(this.f40649, j, j2);
        if (j2 == 0) {
            return;
        }
        c14268.f40649 += j2;
        C20344 c20344 = this.f40648;
        while (true) {
            long j3 = c20344.f62828 - c20344.f62831;
            if (j < j3) {
                break;
            }
            j -= j3;
            c20344 = c20344.f62830;
        }
        while (j2 > 0) {
            C20344 c20344M45925 = c20344.m45925();
            int i = (int) (((long) c20344M45925.f62831) + j);
            c20344M45925.f62831 = i;
            c20344M45925.f62828 = Math.min(i + ((int) j2), c20344M45925.f62828);
            C20344 c20345 = c14268.f40648;
            if (c20345 == null) {
                c20344M45925.f62829 = c20344M45925;
                c20344M45925.f62830 = c20344M45925;
                c14268.f40648 = c20344M45925;
            } else {
                c20345.f62829.m45923(c20344M45925);
            }
            j2 -= (long) (c20344M45925.f62828 - c20344M45925.f62831);
            c20344 = c20344.f62830;
            j = 0;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m32790() {
        long j = this.f40649;
        if (j == 0) {
            return 0L;
        }
        C20344 c20344 = this.f40648.f62829;
        int i = c20344.f62828;
        return (i >= 8192 || !c20344.f62832) ? j : j - ((long) (i - c20344.f62831));
    }

    @Override // p067l.InterfaceC8233
    public final byte readByte() {
        long j = this.f40649;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        C20344 c20344 = this.f40648;
        int i = c20344.f62831;
        int i2 = c20344.f62828;
        int i3 = i + 1;
        byte b = c20344.f62827[i];
        this.f40649 = j - 1;
        if (i3 == i2) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
            return b;
        }
        c20344.f62831 = i3;
        return b;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m32787(long j) {
        int i;
        C23026.m51409(this.f40649, j, 1L);
        long j2 = this.f40649;
        if (j2 - j > j) {
            C20344 c20344 = this.f40648;
            while (true) {
                int i2 = c20344.f62828;
                int i3 = c20344.f62831;
                long j3 = i2 - i3;
                if (j >= j3) {
                    j -= j3;
                    c20344 = c20344.f62830;
                } else {
                    return c20344.f62827[i3 + ((int) j)];
                }
            }
        } else {
            long j4 = j - j2;
            C20344 c20345 = this.f40648;
            do {
                c20345 = c20345.f62829;
                int i4 = c20345.f62828;
                i = c20345.f62831;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return c20345.f62827[i + ((int) j4)];
        }
    }

    @Override // p067l.InterfaceC8233
    public final short readShort() {
        long j = this.f40649;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f40649);
        }
        C20344 c20344 = this.f40648;
        int i = c20344.f62831;
        int i2 = c20344.f62828;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = c20344.f62827;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.f40649 = j - 2;
        if (i5 == i2) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
        } else {
            c20344.f62831 = i5;
        }
        return (short) i6;
    }

    @Override // p067l.InterfaceC8233
    public final int readInt() {
        long j = this.f40649;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f40649);
        }
        C20344 c20344 = this.f40648;
        int i = c20344.f62831;
        int i2 = c20344.f62828;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = c20344.f62827;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.f40649 = j - 4;
        if (i5 == i2) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
            return i6;
        }
        c20344.f62831 = i5;
        return i6;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ᩵ۧ */
    public final long mo14219() {
        long j = 0;
        if (this.f40649 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i = 0;
        long j2 = -7;
        boolean z = false;
        boolean z2 = false;
        do {
            C20344 c20344 = this.f40648;
            byte[] bArr = c20344.f62827;
            int i2 = c20344.f62831;
            int i3 = c20344.f62828;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        C14268 c14268 = new C14268();
                        c14268.m32789(j);
                        c14268.m56480writeByte((int) b);
                        if (!z) {
                            c14268.readByte();
                        }
                        throw new NumberFormatException("Number too large: ".concat(c14268.m32788()));
                    }
                    j = (j * 10) + ((long) i4);
                } else {
                    if (b != 45 || i != 0) {
                        if (i == 0) {
                            throw new NumberFormatException(C1514.m34687(new StringBuilder("Expected leading [0-9] or '-' character but was 0x"), b));
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
                this.f40648 = c20344.m45922();
                C21015.m47360(c20344);
            } else {
                c20344.f62831 = i2;
            }
            if (z2) {
                break;
            }
        } while (this.f40648 != null);
        this.f40649 -= (long) i;
        return z ? j : -j;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۢܽ */
    public final long mo14214() {
        int i;
        if (this.f40649 == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            C20344 c20344 = this.f40648;
            byte[] bArr = c20344.f62827;
            int i3 = c20344.f62831;
            int i4 = c20344.f62828;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        if (i2 == 0) {
                            throw new NumberFormatException(C1514.m34687(new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x"), b));
                        }
                        z = true;
                        break;
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    C14268 c14268 = new C14268();
                    c14268.m32786(j);
                    c14268.m56480writeByte((int) b);
                    throw new NumberFormatException("Number too large: ".concat(c14268.m32788()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.f40648 = c20344.m45922();
                C21015.m47360(c20344);
            } else {
                c20344.f62831 = i3;
            }
            if (z) {
                break;
            }
        } while (this.f40648 != null);
        this.f40649 -= (long) i2;
        return j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C13598 m32793() {
        return new C13598(mo14211());
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۜ */
    public final C13598 mo14210(long j) {
        return new C13598(mo14217(j));
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m32788() {
        try {
            return m32778(this.f40649, C23026.f72410);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final String mo14209(Charset charset) {
        try {
            return m32778(this.f40649, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m32778(long j, Charset charset) {
        C23026.m51409(this.f40649, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C17588.m40051(j, "byteCount > Integer.MAX_VALUE: "));
        }
        if (j == 0) {
            return "";
        }
        C20344 c20344 = this.f40648;
        int i = c20344.f62831;
        if (((long) i) + j > c20344.f62828) {
            return new String(mo14217(j), charset);
        }
        String str = new String(c20344.f62827, i, (int) j, charset);
        int i2 = (int) (((long) c20344.f62831) + j);
        c20344.f62831 = i2;
        this.f40649 -= j;
        if (i2 == c20344.f62828) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
        }
        return str;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֡֫ */
    public final String mo14205() {
        return mo14208(C14849.FOREVER_NS);
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final String mo14208(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "limit < 0: "));
        }
        long j2 = C14849.FOREVER_NS;
        if (j != C14849.FOREVER_NS) {
            j2 = j + 1;
        }
        long jM32777 = m32777((byte) 10, 0L, j2);
        if (jM32777 != -1) {
            return m32792(jM32777);
        }
        if (j2 < this.f40649 && m32787(j2 - 1) == 13 && m32787(j2) == 10) {
            return m32792(j2);
        }
        C14268 c14268 = new C14268();
        m32785(c14268, 0L, Math.min(32L, this.f40649));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f40649, j) + " content=" + c14268.m32793().mo4703() + (char) 8230);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m32792(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (m32787(j2) == 13) {
                String strM32778 = m32778(j2, C23026.f72410);
                skip(2L);
                return strM32778;
            }
        }
        String strM32779 = m32778(j, C23026.f72410);
        skip(1L);
        return strM32779;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۜۧ */
    public final byte[] mo14211() {
        try {
            return mo14217(this.f40649);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo14217(long j) throws EOFException {
        C23026.m51409(this.f40649, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException(C17588.m40051(j, "byteCount > Integer.MAX_VALUE: "));
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    @Override // p067l.InterfaceC8233
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
        C23026.m51409(bArr.length, i, i2);
        C20344 c20344 = this.f40648;
        if (c20344 == null) {
            return -1;
        }
        int iMin = Math.min(i2, c20344.f62828 - c20344.f62831);
        System.arraycopy(c20344.f62827, c20344.f62831, bArr, i, iMin);
        int i3 = c20344.f62831 + iMin;
        c20344.f62831 = i3;
        this.f40649 -= (long) iMin;
        if (i3 == c20344.f62828) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
        }
        return iMin;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C20344 c20344 = this.f40648;
        if (c20344 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), c20344.f62828 - c20344.f62831);
        byteBuffer.put(c20344.f62827, c20344.f62831, iMin);
        int i = c20344.f62831 + iMin;
        c20344.f62831 = i;
        this.f40649 -= (long) iMin;
        if (i == c20344.f62828) {
            this.f40648 = c20344.m45922();
            C21015.m47360(c20344);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32780() {
        try {
            skip(this.f40649);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p067l.InterfaceC8233
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            C20344 c20344 = this.f40648;
            if (c20344 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, c20344.f62828 - c20344.f62831);
            long j2 = iMin;
            this.f40649 -= j2;
            j -= j2;
            C20344 c20345 = this.f40648;
            int i = c20345.f62831 + iMin;
            c20345.f62831 = i;
            if (i == c20345.f62828) {
                this.f40648 = c20345.m45922();
                C21015.m47360(c20345);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32784(C13598 c13598) {
        if (c13598 == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        c13598.mo4698(this);
    }

    @Override // p067l.InterfaceC12257
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC12257 mo28280(String str) {
        m32781(0, str.length(), str);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32781(int i, int i2, String str) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C19768.m44907("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM34408 = C15033.m34408(i2, "endIndex > string.length: ", " > ");
            sbM34408.append(str.length());
            throw new IllegalArgumentException(sbM34408.toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                C20344 c20344M32779 = m32779(1);
                byte[] bArr = c20344M32779.f62827;
                int i3 = c20344M32779.f62828 - i;
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
                int i5 = c20344M32779.f62828;
                int i6 = (i3 + i) - i5;
                c20344M32779.f62828 = i5 + i6;
                this.f40649 += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    m56480writeByte((cCharAt2 >> 6) | 192);
                    m56480writeByte((cCharAt2 & '?') | 128);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    m56480writeByte((cCharAt2 >> '\f') | BERTags.FLAGS);
                    m56480writeByte(((cCharAt2 >> 6) & 63) | 128);
                    m56480writeByte((cCharAt2 & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt2 > 56319 || cCharAt3 < 56320 || cCharAt3 > 57343) {
                        m56480writeByte(63);
                        i = i7;
                    } else {
                        int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                        m56480writeByte((i8 >> 18) | 240);
                        m56480writeByte(((i8 >> 12) & 63) | 128);
                        m56480writeByte(((i8 >> 6) & 63) | 128);
                        m56480writeByte((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m32791(int i) {
        if (i < 128) {
            m56480writeByte(i);
            return;
        }
        if (i < 2048) {
            m56480writeByte((i >> 6) | 192);
            m56480writeByte((i & 63) | 128);
            return;
        }
        if (i >= 65536) {
            if (i > 1114111) {
                throw new IllegalArgumentException(C1514.m34687(new StringBuilder("Unexpected code point: "), i));
            }
            m56480writeByte((i >> 18) | 240);
            m56480writeByte(((i >> 12) & 63) | 128);
            m56480writeByte(((i >> 6) & 63) | 128);
            m56480writeByte((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            m56480writeByte(63);
            return;
        }
        m56480writeByte((i >> 12) | BERTags.FLAGS);
        m56480writeByte(((i >> 6) & 63) | 128);
        m56480writeByte((i & 63) | 128);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32782(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError(C20778.m46922(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C19768.m44907("endIndex < beginIndex: ", i2, i, " < "));
        }
        if (i2 > str.length()) {
            StringBuilder sbM34408 = C15033.m34408(i2, "endIndex > string.length: ", " > ");
            sbM34408.append(str.length());
            throw new IllegalArgumentException(sbM34408.toString());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(C23026.f72410)) {
            m32781(i, i2, str);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
        }
    }

    @Override // p067l.InterfaceC12257
    public final InterfaceC12257 write(byte[] bArr) {
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
        C23026.m51409(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C20344 c20344M32779 = m32779(1);
            int iMin = Math.min(i3 - i, 8192 - c20344M32779.f62828);
            System.arraycopy(bArr, i, c20344M32779.f62827, c20344M32779.f62828, iMin);
            i += iMin;
            c20344M32779.f62828 += iMin;
        }
        this.f40649 += j;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            C20344 c20344M32779 = m32779(1);
            int iMin = Math.min(i, 8192 - c20344M32779.f62828);
            byteBuffer.get(c20344M32779.f62827, c20344M32779.f62828, iMin);
            i -= iMin;
            c20344M32779.f62828 += iMin;
        }
        this.f40649 += (long) iRemaining;
        return iRemaining;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32783(InterfaceC3579 interfaceC3579) {
        if (interfaceC3579 == null) {
            throw new IllegalArgumentException("source == null");
        }
        while (interfaceC3579.mo6580(this, 8192L) != -1) {
        }
    }

    /* JADX INFO: renamed from: writeByte, reason: collision with other method in class */
    public final void m56480writeByte(int i) {
        C20344 c20344M32779 = m32779(1);
        byte[] bArr = c20344M32779.f62827;
        int i2 = c20344M32779.f62828;
        c20344M32779.f62828 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f40649++;
    }

    /* JADX INFO: renamed from: writeShort, reason: collision with other method in class */
    public final void m56482writeShort(int i) {
        C20344 c20344M32779 = m32779(2);
        byte[] bArr = c20344M32779.f62827;
        int i2 = c20344M32779.f62828;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        c20344M32779.f62828 = i2 + 2;
        this.f40649 += 2;
    }

    /* JADX INFO: renamed from: writeInt, reason: collision with other method in class */
    public final void m56481writeInt(int i) {
        C20344 c20344M32779 = m32779(4);
        byte[] bArr = c20344M32779.f62827;
        int i2 = c20344M32779.f62828;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        c20344M32779.f62828 = i2 + 4;
        this.f40649 += 4;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m32789(long j) {
        if (j == 0) {
            m56480writeByte(48);
            return;
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                m32781(0, 20, "-9223372036854775808");
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
        C20344 c20344M32779 = m32779(i);
        byte[] bArr = c20344M32779.f62827;
        int i2 = c20344M32779.f62828 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = f40647[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        c20344M32779.f62828 += i;
        this.f40649 += (long) i;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m32786(long j) {
        if (j == 0) {
            m56480writeByte(48);
            return;
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C20344 c20344M32779 = m32779(iNumberOfTrailingZeros);
        byte[] bArr = c20344M32779.f62827;
        int i = c20344M32779.f62828;
        int i2 = i + iNumberOfTrailingZeros;
        while (true) {
            i2--;
            if (i2 >= i) {
                bArr[i2] = f40647[(int) (15 & j)];
                j >>>= 4;
            } else {
                c20344M32779.f62828 += iNumberOfTrailingZeros;
                this.f40649 += (long) iNumberOfTrailingZeros;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20344 m32779(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C20344 c20344 = this.f40648;
        if (c20344 == null) {
            C20344 c20344M47359 = C21015.m47359();
            this.f40648 = c20344M47359;
            c20344M47359.f62829 = c20344M47359;
            c20344M47359.f62830 = c20344M47359;
            return c20344M47359;
        }
        C20344 c20345 = c20344.f62829;
        if (c20345.f62828 + i <= 8192 && c20345.f62832) {
            return c20345;
        }
        C20344 c20344M473510 = C21015.m47359();
        c20345.m45923(c20344M473510);
        return c20344M473510;
    }

    @Override // p067l.InterfaceC7603
    /* JADX INFO: renamed from: ֫ */
    public final void mo10979(C14268 c14268, long j) {
        C20344 c20344M47359;
        if (c14268 == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c14268 == this) {
            throw new IllegalArgumentException("source == this");
        }
        C23026.m51409(c14268.f40649, 0L, j);
        while (j > 0) {
            C20344 c20344 = c14268.f40648;
            int i = c20344.f62828 - c20344.f62831;
            if (j < i) {
                C20344 c20345 = this.f40648;
                C20344 c20346 = c20345 != null ? c20345.f62829 : null;
                if (c20346 != null && c20346.f62832) {
                    if ((((long) c20346.f62828) + j) - ((long) (c20346.f62833 ? 0 : c20346.f62831)) <= 8192) {
                        c20344.m45924(c20346, (int) j);
                        c14268.f40649 -= j;
                        this.f40649 += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    c20344M47359 = c20344.m45925();
                } else {
                    c20344M47359 = C21015.m47359();
                    System.arraycopy(c20344.f62827, c20344.f62831, c20344M47359.f62827, 0, i2);
                }
                c20344M47359.f62828 = c20344M47359.f62831 + i2;
                c20344.f62831 += i2;
                c20344.f62829.m45923(c20344M47359);
                c14268.f40648 = c20344M47359;
            }
            C20344 c20347 = c14268.f40648;
            long j2 = c20347.f62828 - c20347.f62831;
            c14268.f40648 = c20347.m45922();
            C20344 c20348 = this.f40648;
            if (c20348 == null) {
                this.f40648 = c20347;
                c20347.f62829 = c20347;
                c20347.f62830 = c20347;
            } else {
                c20348.f62829.m45923(c20347);
                C20344 c20349 = c20347.f62829;
                if (c20349 == c20347) {
                    throw new IllegalStateException();
                }
                if (c20349.f62832) {
                    int i3 = c20347.f62828 - c20347.f62831;
                    if (i3 <= (8192 - c20349.f62828) + (c20349.f62833 ? 0 : c20349.f62831)) {
                        c20347.m45924(c20349, i3);
                        c20347.m45922();
                        C21015.m47360(c20347);
                    }
                }
            }
            c14268.f40649 -= j2;
            this.f40649 += j2;
            j -= j2;
        }
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۧ */
    public final long mo6580(C14268 c14268, long j) {
        if (c14268 == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "byteCount < 0: "));
        }
        long j2 = this.f40649;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c14268.mo10979(this, j);
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m32777(byte b, long j, long j2) {
        C20344 c20344;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            StringBuilder sbM33191 = C14536.m33191("size=", " fromIndex=", this.f40649);
            sbM33191.append(j);
            sbM33191.append(" toIndex=");
            sbM33191.append(j2);
            throw new IllegalArgumentException(sbM33191.toString());
        }
        long j4 = this.f40649;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (c20344 = this.f40648) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                c20344 = c20344.f62829;
                j4 -= (long) (c20344.f62828 - c20344.f62831);
            }
        } else {
            while (true) {
                long j5 = ((long) (c20344.f62828 - c20344.f62831)) + j3;
                if (j5 >= j) {
                    break;
                }
                c20344 = c20344.f62830;
                j3 = j5;
            }
            j4 = j3;
        }
        while (j4 < j2) {
            byte[] bArr = c20344.f62827;
            int iMin = (int) Math.min(c20344.f62828, (((long) c20344.f62831) + j2) - j4);
            for (int i = (int) ((((long) c20344.f62831) + j) - j4); i < iMin; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - c20344.f62831)) + j4;
                }
            }
            j4 += (long) (c20344.f62828 - c20344.f62831);
            c20344 = c20344.f62830;
            j = j4;
        }
        return -1L;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14216(C13598 c13598) {
        int iMo4707 = c13598.mo4707();
        if (iMo4707 >= 0 && this.f40649 >= iMo4707 && c13598.mo4707() >= iMo4707) {
            for (int i = 0; i < iMo4707; i++) {
                if (m32787(i) == c13598.mo4696(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return C16989.f50239;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14268)) {
            return false;
        }
        C14268 c14268 = (C14268) obj;
        long j = this.f40649;
        if (j != c14268.f40649) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C20344 c20344 = this.f40648;
        C20344 c20345 = c14268.f40648;
        int i = c20344.f62831;
        int i2 = c20345.f62831;
        while (j2 < this.f40649) {
            long jMin = Math.min(c20344.f62828 - i, c20345.f62828 - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c20344.f62827[i] != c20345.f62827[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c20344.f62828) {
                c20344 = c20344.f62830;
                i = c20344.f62831;
            }
            if (i2 == c20345.f62828) {
                c20345 = c20345.f62830;
                i2 = c20345.f62831;
            }
            j2 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C20344 c20344 = this.f40648;
        if (c20344 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c20344.f62828;
            for (int i3 = c20344.f62831; i3 < i2; i3++) {
                i = (i * 31) + c20344.f62827[i3];
            }
            c20344 = c20344.f62830;
        } while (c20344 != this.f40648);
        return i;
    }

    public final Object clone() {
        C14268 c14268 = new C14268();
        if (this.f40649 == 0) {
            return c14268;
        }
        C20344 c20344M45925 = this.f40648.m45925();
        c14268.f40648 = c20344M45925;
        c20344M45925.f62829 = c20344M45925;
        c20344M45925.f62830 = c20344M45925;
        C20344 c20344 = this.f40648;
        while (true) {
            c20344 = c20344.f62830;
            if (c20344 != this.f40648) {
                c14268.f40648.f62829.m45923(c20344.m45925());
            } else {
                c14268.f40649 = this.f40649;
                return c14268;
            }
        }
    }

    public final String toString() {
        C13598 c2908;
        long j = this.f40649;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                c2908 = C13598.f38250;
            } else {
                c2908 = new C2908(this, i);
            }
            return c2908.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f40649);
    }
}
