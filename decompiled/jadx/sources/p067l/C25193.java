package p067l;

import java.io.IOException;
import java.io.OutputStream;
import net.p069sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.᩻᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes.dex */
public final class C25193 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f80575 = new byte[32768];

    /* JADX INFO: renamed from: ۙ */
    public final OutputStream f80576;

    /* JADX INFO: renamed from: ۬ */
    public int f80577;

    /* JADX INFO: renamed from: ᩶ */
    public long f80578;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f80579;

    /* JADX INFO: renamed from: ᩹ */
    public IOException f80580;

    public C25193(OutputStream outputStream) {
        this.f80576 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m55261();
        int i2 = this.f80577;
        int i3 = i2 + 1;
        this.f80577 = i3;
        byte[] bArr = this.f80575;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m55262();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m55261();
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int i3 = this.f80577;
            byte[] bArr2 = this.f80575;
            if (i3 == 0 && i2 >= bArr2.length) {
                try {
                    byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m55263(), bArr, i, bArr2.length);
                    if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                        this.f80576.write(bArrNativeWriteUltraDeflateCompressor);
                    }
                    i += bArr2.length;
                    i2 -= bArr2.length;
                } catch (IOException e) {
                    IOException iOException = this.f80580;
                    if (iOException == null) {
                        this.f80580 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f80578;
                    this.f80578 = 0L;
                    if (j != 0) {
                        SevenZip.nativeDestroyUltraDeflateCompressor(j);
                    }
                    throw e;
                }
            } else {
                int iMin = Math.min(i2, bArr2.length - i3);
                System.arraycopy(bArr, i, bArr2, this.f80577, iMin);
                int i4 = this.f80577 + iMin;
                this.f80577 = i4;
                i += iMin;
                i2 -= iMin;
                if (i4 == bArr2.length) {
                    m55262();
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f80579) {
            return;
        }
        m55261();
        try {
            m55262();
            byte[] bArrNativeFlushUltraDeflateCompressor = SevenZip.nativeFlushUltraDeflateCompressor(m55263());
            OutputStream outputStream = this.f80576;
            if (bArrNativeFlushUltraDeflateCompressor != null && bArrNativeFlushUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFlushUltraDeflateCompressor);
            }
            outputStream.flush();
        } catch (IOException e) {
            IOException iOException = this.f80580;
            if (iOException == null) {
                this.f80580 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f80578;
            this.f80578 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f80579) {
            return;
        }
        this.f80579 = true;
        IOException iOException = this.f80580;
        OutputStream outputStream = this.f80576;
        if (iOException == null) {
            m55262();
            byte[] bArrNativeFinishUltraDeflateCompressor = SevenZip.nativeFinishUltraDeflateCompressor(m55263());
            if (bArrNativeFinishUltraDeflateCompressor != null && bArrNativeFinishUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFinishUltraDeflateCompressor);
            }
        }
        th = null;
        try {
            long j = this.f80578;
            this.f80578 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            } else if (th != th) {
                th.addSuppressed(th);
            }
        }
        try {
            outputStream.close();
        } catch (Throwable th2) {
            if (th2 != this.f80580) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            if (th instanceof Error) {
                throw ((Error) th);
            }
            throw new IOException("Failed to close Ultra Deflate stream", th);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m55262() throws IOException {
        int i = this.f80577;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m55263(), this.f80575, 0, i);
            if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                this.f80576.write(bArrNativeWriteUltraDeflateCompressor);
            }
            this.f80577 = 0;
        } catch (IOException e) {
            IOException iOException = this.f80580;
            if (iOException == null) {
                this.f80580 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f80578;
            this.f80578 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private long m55263() throws IOException {
        if (this.f80578 == 0) {
            long jNativeCreateUltraDeflateCompressor = SevenZip.nativeCreateUltraDeflateCompressor();
            this.f80578 = jNativeCreateUltraDeflateCompressor;
            if (jNativeCreateUltraDeflateCompressor == 0) {
                throw new IOException("Failed to create Ultra Deflate compressor");
            }
        }
        return this.f80578;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55261() throws IOException {
        if (this.f80579) {
            throw new IOException("Stream closed");
        }
        IOException iOException = this.f80580;
        if (iOException != null) {
            throw iOException;
        }
    }
}
