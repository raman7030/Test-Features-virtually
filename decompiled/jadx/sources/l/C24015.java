package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.SevenZip;

/* JADX INFO: renamed from: l.᩻᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QB6R */
/* JADX INFO: loaded from: classes.dex */
public final class C24015 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f77823 = new byte[32768];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final OutputStream f77824;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f77825;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f77826;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77827;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f77828;

    public C24015(OutputStream outputStream) {
        this.f77824 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m52855();
        int i2 = this.f77825;
        int i3 = i2 + 1;
        this.f77825 = i3;
        byte[] bArr = this.f77823;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m52856();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m52855();
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        while (i2 > 0) {
            int i3 = this.f77825;
            byte[] bArr2 = this.f77823;
            if (i3 == 0 && i2 >= bArr2.length) {
                try {
                    byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m52857(), bArr, i, bArr2.length);
                    if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                        this.f77824.write(bArrNativeWriteUltraDeflateCompressor);
                    }
                    i += bArr2.length;
                    i2 -= bArr2.length;
                } catch (IOException e) {
                    IOException iOException = this.f77828;
                    if (iOException == null) {
                        this.f77828 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f77826;
                    this.f77826 = 0L;
                    if (j != 0) {
                        SevenZip.nativeDestroyUltraDeflateCompressor(j);
                    }
                    throw e;
                }
            } else {
                int iMin = Math.min(i2, bArr2.length - i3);
                System.arraycopy(bArr, i, bArr2, this.f77825, iMin);
                int i4 = this.f77825 + iMin;
                this.f77825 = i4;
                i += iMin;
                i2 -= iMin;
                if (i4 == bArr2.length) {
                    m52856();
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f77827) {
            return;
        }
        m52855();
        try {
            m52856();
            byte[] bArrNativeFlushUltraDeflateCompressor = SevenZip.nativeFlushUltraDeflateCompressor(m52857());
            OutputStream outputStream = this.f77824;
            if (bArrNativeFlushUltraDeflateCompressor != null && bArrNativeFlushUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFlushUltraDeflateCompressor);
            }
            outputStream.flush();
        } catch (IOException e) {
            IOException iOException = this.f77828;
            if (iOException == null) {
                this.f77828 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f77826;
            this.f77826 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f77827) {
            return;
        }
        this.f77827 = true;
        IOException iOException = this.f77828;
        OutputStream outputStream = this.f77824;
        if (iOException == null) {
            m52856();
            byte[] bArrNativeFinishUltraDeflateCompressor = SevenZip.nativeFinishUltraDeflateCompressor(m52857());
            if (bArrNativeFinishUltraDeflateCompressor != null && bArrNativeFinishUltraDeflateCompressor.length != 0) {
                outputStream.write(bArrNativeFinishUltraDeflateCompressor);
            }
        }
        th = null;
        try {
            long j = this.f77826;
            this.f77826 = 0L;
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
            if (th2 != this.f77828) {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m52856() throws IOException {
        int i = this.f77825;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrNativeWriteUltraDeflateCompressor = SevenZip.nativeWriteUltraDeflateCompressor(m52857(), this.f77823, 0, i);
            if (bArrNativeWriteUltraDeflateCompressor != null && bArrNativeWriteUltraDeflateCompressor.length != 0) {
                this.f77824.write(bArrNativeWriteUltraDeflateCompressor);
            }
            this.f77825 = 0;
        } catch (IOException e) {
            IOException iOException = this.f77828;
            if (iOException == null) {
                this.f77828 = e;
            } else if (iOException != e) {
                iOException.addSuppressed(e);
            }
            long j = this.f77826;
            this.f77826 = 0L;
            if (j != 0) {
                SevenZip.nativeDestroyUltraDeflateCompressor(j);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m52857() throws IOException {
        if (this.f77826 == 0) {
            long jNativeCreateUltraDeflateCompressor = SevenZip.nativeCreateUltraDeflateCompressor();
            this.f77826 = jNativeCreateUltraDeflateCompressor;
            if (jNativeCreateUltraDeflateCompressor == 0) {
                throw new IOException("Failed to create Ultra Deflate compressor");
            }
        }
        return this.f77826;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52855() throws IOException {
        if (this.f77827) {
            throw new IOException("Stream closed");
        }
        IOException iOException = this.f77828;
        if (iOException != null) {
            throw iOException;
        }
    }
}
