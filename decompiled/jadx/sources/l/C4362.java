package l;

import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۙۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAQ4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4362 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AtomicReferenceFieldUpdater f14025 = AtomicReferenceFieldUpdater.newUpdater(C4362.class, byte[].class, "buf");

    @InterfaceC4801
    public volatile byte[] buf;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f14026;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f14027;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14028;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f14029;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m13077() throws IOException {
        byte[] bArr = this.buf;
        if (bArr != null) {
            return bArr;
        }
        throw new IOException("Stream closed");
    }

    public C4362(GZIPInputStream gZIPInputStream) {
        super(gZIPInputStream);
        this.f14027 = -1;
        this.buf = new byte[8192];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13076() throws IOException {
        byte[] bArrM13077 = m13077();
        int i = this.f14027;
        if (i < 0) {
            this.f14026 = 0;
        } else {
            int i2 = this.f14026;
            if (i2 >= bArrM13077.length) {
                if (i > 0) {
                    int i3 = i2 - i;
                    System.arraycopy(bArrM13077, i, bArrM13077, 0, i3);
                    this.f14026 = i3;
                    this.f14027 = 0;
                } else {
                    int length = bArrM13077.length;
                    int i4 = this.f14029;
                    if (length >= i4) {
                        this.f14027 = -1;
                        this.f14026 = 0;
                    } else {
                        if (bArrM13077.length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i5 = i2 <= 2147483639 - i2 ? i2 * 2 : 2147483639;
                        if (i5 <= i4) {
                            i4 = i5;
                        }
                        byte[] bArr = new byte[i4];
                        System.arraycopy(bArrM13077, 0, bArr, 0, i2);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14025;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, bArrM13077, bArr)) {
                            if (atomicReferenceFieldUpdater.get(this) != bArrM13077) {
                                throw new IOException("Stream closed");
                            }
                        }
                        bArrM13077 = bArr;
                    }
                }
            }
        }
        this.f14028 = this.f14026;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int i6 = this.f14026;
        int i7 = inputStream.read(bArrM13077, i6, bArrM13077.length - i6);
        if (i7 > 0) {
            this.f14028 = i7 + this.f14026;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f14026 >= this.f14028) {
            m13076();
            if (this.f14026 >= this.f14028) {
                return -1;
            }
        }
        byte[] bArrM13077 = m13077();
        int i = this.f14026;
        this.f14026 = i + 1;
        return bArrM13077[i] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT, PHI: r3
      0x0044: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x001a, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        InputStream inputStream;
        m13077();
        int i4 = i + i2;
        if ((i | i2 | i4 | (bArr.length - i4)) < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i5 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (true) {
            int i6 = i + i5;
            int i7 = i2 - i5;
            int i8 = this.f14028 - this.f14026;
            if (i8 <= 0) {
                if (i7 >= m13077().length && this.f14027 < 0) {
                    InputStream inputStream2 = ((FilterInputStream) this).in;
                    if (inputStream2 == null) {
                        throw new IOException("Stream closed");
                    }
                    i3 = inputStream2.read(bArr, i6, i7);
                } else {
                    m13076();
                    i8 = this.f14028 - this.f14026;
                    if (i8 <= 0) {
                        i3 = -1;
                    } else {
                        if (i8 < i7) {
                            i7 = i8;
                        }
                        System.arraycopy(m13077(), this.f14026, bArr, i6, i7);
                        this.f14026 += i7;
                        i3 = i7;
                    }
                }
            } else {
                if (i8 < i7) {
                    i7 = i8;
                }
                System.arraycopy(m13077(), this.f14026, bArr, i6, i7);
                this.f14026 += i7;
                i3 = i7;
            }
            if (i3 <= 0) {
                return i5 == 0 ? i3 : i5;
            }
            i5 += i3;
            if (i5 >= i2 || ((inputStream = ((FilterInputStream) this).in) != null && inputStream.available() <= 0)) {
                return i5;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r2 <= 0) goto L17;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long skip(long j) throws IOException {
        m13077();
        if (j > 0) {
            long j2 = this.f14028 - this.f14026;
            if (j2 <= 0) {
                if (this.f14027 < 0) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    if (inputStream == null) {
                        throw new IOException("Stream closed");
                    }
                    return inputStream.skip(j);
                }
                m13076();
                j2 = this.f14028 - this.f14026;
            }
            if (j2 < j) {
                j = j2;
            }
            this.f14026 = (int) (((long) this.f14026) + j);
            return j;
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f14028 - this.f14026;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int iAvailable = inputStream.available();
        if (i > Integer.MAX_VALUE - iAvailable) {
            return Integer.MAX_VALUE;
        }
        return i + iAvailable;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        this.f14029 = i;
        this.f14027 = this.f14026;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        m13077();
        int i = this.f14027;
        if (i < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f14026 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            byte[] bArr = this.buf;
            if (bArr == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14025;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, bArr, null)) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    ((FilterInputStream) this).in = null;
                    if (inputStream != null) {
                        inputStream.close();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == bArr);
        }
    }

    public final int readInt() throws IOException {
        byte[] bArrM13077 = m13077();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f14026 >= this.f14028) {
                m13076();
                if (this.f14026 >= this.f14028) {
                    throw new EOFException();
                }
            }
            int i3 = this.f14026;
            this.f14026 = i3 + 1;
            i |= (bArrM13077[i3] & 255) << (i2 * 8);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m13078(byte[] bArr) throws IOException {
        int i = readInt();
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i2 = 0;
        while (i2 < i) {
            int i3 = read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return new String(bArr, 0, i, StandardCharsets.UTF_8);
    }
}
