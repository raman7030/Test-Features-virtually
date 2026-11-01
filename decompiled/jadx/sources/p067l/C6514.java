package p067l;

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
public final class C6514 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public static final AtomicReferenceFieldUpdater f16840 = AtomicReferenceFieldUpdater.newUpdater(C6514.class, byte[].class, "buf");

    @InterfaceC1080
    public volatile byte[] buf;

    /* JADX INFO: renamed from: ۙ */
    public int f16841;

    /* JADX INFO: renamed from: ᩶ */
    public int f16842;

    /* JADX INFO: renamed from: ᩸ */
    public int f16843;

    /* JADX INFO: renamed from: ᩹ */
    public int f16844;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    /* JADX INFO: renamed from: ܽ */
    private byte[] m14941() throws IOException {
        byte[] bArr = this.buf;
        if (bArr != null) {
            return bArr;
        }
        throw new IOException("Stream closed");
    }

    public C6514(GZIPInputStream gZIPInputStream) {
        super(gZIPInputStream);
        this.f16842 = -1;
        this.buf = new byte[8192];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private void m14940() throws IOException {
        byte[] bArrM14941 = m14941();
        int i = this.f16842;
        if (i < 0) {
            this.f16841 = 0;
        } else {
            int i2 = this.f16841;
            if (i2 >= bArrM14941.length) {
                if (i > 0) {
                    int i3 = i2 - i;
                    System.arraycopy(bArrM14941, i, bArrM14941, 0, i3);
                    this.f16841 = i3;
                    this.f16842 = 0;
                } else {
                    int length = bArrM14941.length;
                    int i4 = this.f16844;
                    if (length >= i4) {
                        this.f16842 = -1;
                        this.f16841 = 0;
                    } else {
                        if (bArrM14941.length >= 2147483639) {
                            throw new OutOfMemoryError("Required array size too large");
                        }
                        int i5 = i2 <= 2147483639 - i2 ? i2 * 2 : 2147483639;
                        if (i5 <= i4) {
                            i4 = i5;
                        }
                        byte[] bArr = new byte[i4];
                        System.arraycopy(bArrM14941, 0, bArr, 0, i2);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16840;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, bArrM14941, bArr)) {
                            if (atomicReferenceFieldUpdater.get(this) != bArrM14941) {
                                throw new IOException("Stream closed");
                            }
                        }
                        bArrM14941 = bArr;
                    }
                }
            }
        }
        this.f16843 = this.f16841;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw new IOException("Stream closed");
        }
        int i6 = this.f16841;
        int i7 = inputStream.read(bArrM14941, i6, bArrM14941.length - i6);
        if (i7 > 0) {
            this.f16843 = i7 + this.f16841;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f16841 >= this.f16843) {
            m14940();
            if (this.f16841 >= this.f16843) {
                return -1;
            }
        }
        byte[] bArrM14941 = m14941();
        int i = this.f16841;
        this.f16841 = i + 1;
        return bArrM14941[i] & 255;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[DONT_INVERT, PHI: r3
      0x0044: PHI (r3v2 int) = (r3v1 int), (r3v7 int) binds: [B:8:0x001a, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        InputStream inputStream;
        m14941();
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
            int i8 = this.f16843 - this.f16841;
            if (i8 <= 0) {
                if (i7 >= m14941().length && this.f16842 < 0) {
                    InputStream inputStream2 = ((FilterInputStream) this).in;
                    if (inputStream2 == null) {
                        throw new IOException("Stream closed");
                    }
                    i3 = inputStream2.read(bArr, i6, i7);
                } else {
                    m14940();
                    i8 = this.f16843 - this.f16841;
                    if (i8 <= 0) {
                        i3 = -1;
                    } else {
                        if (i8 < i7) {
                            i7 = i8;
                        }
                        System.arraycopy(m14941(), this.f16841, bArr, i6, i7);
                        this.f16841 += i7;
                        i3 = i7;
                    }
                }
            } else {
                if (i8 < i7) {
                    i7 = i8;
                }
                System.arraycopy(m14941(), this.f16841, bArr, i6, i7);
                this.f16841 += i7;
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
        m14941();
        if (j > 0) {
            long j2 = this.f16843 - this.f16841;
            if (j2 <= 0) {
                if (this.f16842 < 0) {
                    InputStream inputStream = ((FilterInputStream) this).in;
                    if (inputStream == null) {
                        throw new IOException("Stream closed");
                    }
                    return inputStream.skip(j);
                }
                m14940();
                j2 = this.f16843 - this.f16841;
            }
            if (j2 < j) {
                j = j2;
            }
            this.f16841 = (int) (((long) this.f16841) + j);
            return j;
        }
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        int i = this.f16843 - this.f16841;
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
        this.f16844 = i;
        this.f16842 = this.f16841;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        m14941();
        int i = this.f16842;
        if (i < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f16841 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        while (true) {
            byte[] bArr = this.buf;
            if (bArr == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16840;
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
        byte[] bArrM14941 = m14941();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (this.f16841 >= this.f16843) {
                m14940();
                if (this.f16841 >= this.f16843) {
                    throw new EOFException();
                }
            }
            int i3 = this.f16841;
            this.f16841 = i3 + 1;
            i |= (bArrM14941[i3] & 255) << (i2 * 8);
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m14942(byte[] bArr) throws IOException {
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
