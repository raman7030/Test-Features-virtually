package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۘᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6262 implements InterfaceC8233 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3579 f15842;

    /* JADX INFO: renamed from: ᩸ */
    public final C14268 f15843 = new C14268();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f15844;

    public C6262(InterfaceC3579 interfaceC3579) {
        if (interfaceC3579 == null) {
            throw new NullPointerException("source == null");
        }
        this.f15842 = interfaceC3579;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ᩷ */
    public final C14268 mo14220() {
        return this.f15843;
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
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        C14268 c14269 = this.f15843;
        if (c14269.f40649 == 0 && this.f15842.mo6580(c14269, 8192L) == -1) {
            return -1L;
        }
        return c14269.mo6580(c14268, Math.min(j, c14269.f40649));
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۢۧ */
    public final boolean mo14213() {
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        C14268 c14268 = this.f15843;
        return c14268.mo14213() && this.f15842.mo6580(c14268, 8192L) == -1;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ܿ */
    public final void mo14218(long j) throws EOFException {
        if (!m14215(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m14215(long j) {
        C14268 c14268;
        if (j < 0) {
            throw new IllegalArgumentException(C17588.m40051(j, "byteCount < 0: "));
        }
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        do {
            c14268 = this.f15843;
            if (c14268.f40649 >= j) {
                return true;
            }
        } while (this.f15842.mo6580(c14268, 8192L) != -1);
        return false;
    }

    @Override // p067l.InterfaceC8233
    public final byte readByte() throws EOFException {
        mo14218(1L);
        return this.f15843.readByte();
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۜ */
    public final C13598 mo14210(long j) throws EOFException {
        mo14218(j);
        return this.f15843.mo14210(j);
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۜۧ */
    public final byte[] mo14211() {
        InterfaceC3579 interfaceC3579 = this.f15842;
        C14268 c14268 = this.f15843;
        c14268.m32783(interfaceC3579);
        return c14268.mo14211();
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ܽ */
    public final byte[] mo14217(long j) throws EOFException {
        mo14218(j);
        return this.f15843.mo14217(j);
    }

    @Override // p067l.InterfaceC8233
    public final void readFully(byte[] bArr) throws EOFException {
        C14268 c14268 = this.f15843;
        try {
            mo14218(bArr.length);
            c14268.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c14268.f40649;
                if (j > 0) {
                    int i2 = c14268.read(bArr, i, (int) j);
                    if (i2 == -1) {
                        throw new AssertionError();
                    }
                    i += i2;
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C14268 c14268 = this.f15843;
        if (c14268.f40649 == 0 && this.f15842.mo6580(c14268, 8192L) == -1) {
            return -1;
        }
        return c14268.read(byteBuffer);
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final long mo14207(InterfaceC7603 interfaceC7603) {
        C14268 c14268;
        long j = 0;
        while (true) {
            InterfaceC3579 interfaceC3579 = this.f15842;
            c14268 = this.f15843;
            if (interfaceC3579.mo6580(c14268, 8192L) == -1) {
                break;
            }
            long jM32790 = c14268.m32790();
            if (jM32790 > 0) {
                j += jM32790;
                interfaceC7603.mo10979(c14268, jM32790);
            }
        }
        long j2 = c14268.f40649;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC7603.mo10979(c14268, j2);
        return j3;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ֫ */
    public final String mo14209(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        InterfaceC3579 interfaceC3579 = this.f15842;
        C14268 c14268 = this.f15843;
        c14268.m32783(interfaceC3579);
        return c14268.mo14209(charset);
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
        long j2 = j == C14849.FOREVER_NS ? Long.MAX_VALUE : j + 1;
        long jM14206 = m14206((byte) 10, 0L, j2);
        C14268 c14268 = this.f15843;
        if (jM14206 != -1) {
            return c14268.m32792(jM14206);
        }
        if (j2 < C14849.FOREVER_NS && m14215(j2) && c14268.m32787(j2 - 1) == 13 && m14215(1 + j2) && c14268.m32787(j2) == 10) {
            return c14268.m32792(j2);
        }
        C14268 c14269 = new C14268();
        c14268.m32785(c14269, 0L, Math.min(32L, c14268.f40649));
        throw new EOFException("\\n not found: limit=" + Math.min(c14268.f40649, j) + " content=" + c14269.m32793().mo4703() + (char) 8230);
    }

    @Override // p067l.InterfaceC8233
    public final short readShort() throws EOFException {
        mo14218(2L);
        return this.f15843.readShort();
    }

    @Override // p067l.InterfaceC8233
    public final int readInt() throws EOFException {
        mo14218(4L);
        return this.f15843.readInt();
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ᩵ۧ */
    public final long mo14219() throws EOFException {
        C14268 c14268;
        mo14218(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM14215 = m14215(i2);
            c14268 = this.f15843;
            if (!zM14215) {
                break;
            }
            byte bM32787 = c14268.m32787(i);
            if ((bM32787 < 48 || bM32787 > 57) && !(i == 0 && bM32787 == 45)) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM32787)));
            }
            i = i2;
        }
        return c14268.mo14219();
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۢܽ */
    public final long mo14214() throws EOFException {
        C14268 c14268;
        mo14218(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM14215 = m14215(i2);
            c14268 = this.f15843;
            if (!zM14215) {
                break;
            }
            byte bM32787 = c14268.m32787(i);
            if ((bM32787 < 48 || bM32787 > 57) && ((bM32787 < 97 || bM32787 > 102) && (bM32787 < 65 || bM32787 > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM32787)));
            }
            i = i2;
        }
        return c14268.mo14214();
    }

    @Override // p067l.InterfaceC8233
    public final void skip(long j) throws EOFException {
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C14268 c14268 = this.f15843;
            if (c14268.f40649 == 0 && this.f15842.mo6580(c14268, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c14268.f40649);
            c14268.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m14206(byte b, long j, long j2) {
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(C17588.m40051(j2, "fromIndex=0 toIndex="));
        }
        while (jMax < j2) {
            long jM32777 = this.f15843.m32777(b, jMax, j2);
            if (jM32777 != -1) {
                return jM32777;
            }
            C14268 c14268 = this.f15843;
            long j3 = c14268.f40649;
            if (j3 >= j2 || this.f15842.mo6580(c14268, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo14216(C13598 c13598) {
        int iMo4707 = c13598.mo4707();
        if (this.f15844) {
            throw new IllegalStateException("closed");
        }
        if (iMo4707 >= 0 && c13598.mo4707() >= iMo4707) {
            for (int i = 0; i < iMo4707; i++) {
                long j = i;
                if (m14215(1 + j) && this.f15843.m32787(j) == c13598.mo4696(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p067l.InterfaceC8233
    /* JADX INFO: renamed from: ۡܽ */
    public final InputStream mo14212() {
        return new C4921(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f15844;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f15844) {
            return;
        }
        this.f15844 = true;
        this.f15842.close();
        this.f15843.m32780();
    }

    @Override // p067l.InterfaceC3579
    /* JADX INFO: renamed from: ۢ */
    public final C16989 mo6579() {
        return this.f15842.mo6579();
    }

    public final String toString() {
        return "buffer(" + this.f15842 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
