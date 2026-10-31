package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: l.ۘᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 34CP */
/* JADX INFO: loaded from: classes3.dex */
public final class C4097 implements InterfaceC6171 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1274 f13028;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12521 f13029 = new C12521();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f13030;

    public C4097(InterfaceC1274 interfaceC1274) {
        if (interfaceC1274 == null) {
            throw new NullPointerException("source == null");
        }
        this.f13028 = interfaceC1274;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12521 mo12315() {
        return this.f13029;
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
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        C12521 c12522 = this.f13029;
        if (c12522.f37625 == 0 && this.f13028.mo4334(c12522, 8192L) == -1) {
            return -1L;
        }
        return c12522.mo4334(c12521, Math.min(j, c12522.f37625));
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo12308() {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        C12521 c12521 = this.f13029;
        return c12521.mo12308() && this.f13028.mo4334(c12521, 8192L) == -1;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo12313(long j) throws EOFException {
        if (!m12310(j)) {
            throw new EOFException();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m12310(long j) {
        C12521 c12521;
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "byteCount < 0: "));
        }
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        do {
            c12521 = this.f13029;
            if (c12521.f37625 >= j) {
                return true;
            }
        } while (this.f13028.mo4334(c12521, 8192L) != -1);
        return false;
    }

    @Override // l.InterfaceC6171
    public final byte readByte() throws EOFException {
        mo12313(1L);
        return this.f13029.readByte();
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11816 mo12305(long j) throws EOFException {
        mo12313(j);
        return this.f13029.mo12305(j);
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final byte[] mo12306() {
        InterfaceC1274 interfaceC1274 = this.f13028;
        C12521 c12521 = this.f13029;
        c12521.m30709(interfaceC1274);
        return c12521.mo12306();
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] mo12312(long j) throws EOFException {
        mo12313(j);
        return this.f13029.mo12312(j);
    }

    @Override // l.InterfaceC6171
    public final void readFully(byte[] bArr) throws EOFException {
        C12521 c12521 = this.f13029;
        try {
            mo12313(bArr.length);
            c12521.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = c12521.f37625;
                if (j > 0) {
                    int i2 = c12521.read(bArr, i, (int) j);
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
        C12521 c12521 = this.f13029;
        if (c12521.f37625 == 0 && this.f13028.mo4334(c12521, 8192L) == -1) {
            return -1;
        }
        return c12521.read(byteBuffer);
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo12302(InterfaceC5508 interfaceC5508) {
        C12521 c12521;
        long j = 0;
        while (true) {
            InterfaceC1274 interfaceC1274 = this.f13028;
            c12521 = this.f13029;
            if (interfaceC1274.mo4334(c12521, 8192L) == -1) {
                break;
            }
            long jM30716 = c12521.m30716();
            if (jM30716 > 0) {
                j += jM30716;
                interfaceC5508.mo8911(c12521, jM30716);
            }
        }
        long j2 = c12521.f37625;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        interfaceC5508.mo8911(c12521, j2);
        return j3;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12304(Charset charset) {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        InterfaceC1274 interfaceC1274 = this.f13028;
        C12521 c12521 = this.f13029;
        c12521.m30709(interfaceC1274);
        return c12521.mo12304(charset);
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String mo12300() {
        return mo12303(C13132.FOREVER_NS);
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12303(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "limit < 0: "));
        }
        long j2 = j == C13132.FOREVER_NS ? Long.MAX_VALUE : j + 1;
        long jM12301 = m12301((byte) 10, 0L, j2);
        C12521 c12521 = this.f13029;
        if (jM12301 != -1) {
            return c12521.m30718(jM12301);
        }
        if (j2 < C13132.FOREVER_NS && m12310(j2) && c12521.m30713(j2 - 1) == 13 && m12310(1 + j2) && c12521.m30713(j2) == 10) {
            return c12521.m30718(j2);
        }
        C12521 c12522 = new C12521();
        c12521.m30711(c12522, 0L, Math.min(32L, c12521.f37625));
        throw new EOFException("\\n not found: limit=" + Math.min(c12521.f37625, j) + " content=" + c12522.m30719().mo2332() + (char) 8230);
    }

    @Override // l.InterfaceC6171
    public final short readShort() throws EOFException {
        mo12313(2L);
        return this.f13029.readShort();
    }

    @Override // l.InterfaceC6171
    public final int readInt() throws EOFException {
        mo12313(4L);
        return this.f13029.readInt();
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final long mo12314() throws EOFException {
        C12521 c12521;
        mo12313(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM12310 = m12310(i2);
            c12521 = this.f13029;
            if (!zM12310) {
                break;
            }
            byte bM30713 = c12521.m30713(i);
            if ((bM30713 < 48 || bM30713 > 57) && !(i == 0 && bM30713 == 45)) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(bM30713)));
            }
            i = i2;
        }
        return c12521.mo12314();
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final long mo12309() throws EOFException {
        C12521 c12521;
        mo12313(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zM12310 = m12310(i2);
            c12521 = this.f13029;
            if (!zM12310) {
                break;
            }
            byte bM30713 = c12521.m30713(i);
            if ((bM30713 < 48 || bM30713 > 57) && ((bM30713 < 97 || bM30713 > 102) && (bM30713 < 65 || bM30713 > 70))) {
                if (i != 0) {
                    break;
                }
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bM30713)));
            }
            i = i2;
        }
        return c12521.mo12309();
    }

    @Override // l.InterfaceC6171
    public final void skip(long j) throws EOFException {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C12521 c12521 = this.f13029;
            if (c12521.f37625 == 0 && this.f13028.mo4334(c12521, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c12521.f37625);
            c12521.skip(jMin);
            j -= jMin;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m12301(byte b, long j, long j2) {
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException(C16014.m37865(j2, "fromIndex=0 toIndex="));
        }
        while (jMax < j2) {
            long jM30703 = this.f13029.m30703(b, jMax, j2);
            if (jM30703 != -1) {
                return jM30703;
            }
            C12521 c12521 = this.f13029;
            long j3 = c12521.f37625;
            if (j3 >= j2 || this.f13028.mo4334(c12521, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j3);
        }
        return -1L;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo12311(C11816 c11816) {
        int iMo2336 = c11816.mo2336();
        if (this.f13030) {
            throw new IllegalStateException("closed");
        }
        if (iMo2336 >= 0 && c11816.mo2336() >= iMo2336) {
            for (int i = 0; i < iMo2336; i++) {
                long j = i;
                if (m12310(1 + j) && this.f13029.m30713(j) == c11816.mo2325(i)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC6171
    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public final InputStream mo12307() {
        return new C2686(this);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13030;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f13030) {
            return;
        }
        this.f13030 = true;
        this.f13028.close();
        this.f13029.m30706();
    }

    @Override // l.InterfaceC1274
    /* JADX INFO: renamed from: ۢ */
    public final C15384 mo4333() {
        return this.f13028.mo4333();
    }

    public final String toString() {
        return "buffer(" + this.f13028 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
