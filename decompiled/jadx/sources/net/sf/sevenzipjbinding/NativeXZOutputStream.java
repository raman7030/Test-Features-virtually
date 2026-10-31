package net.sf.sevenzipjbinding;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import l.C11003;

/* JADX INFO: loaded from: classes.dex */
public final class NativeXZOutputStream extends OutputStream {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f77882 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f77883 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f77884;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f77885;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final OutputStream f77887;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f77888;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77889;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f77891;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f77890 = new byte[1048576];

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f77886 = new byte[1];

    public static native long nativeCreate(int i, int i2);

    public static native void nativeDestroy(long j);

    public static native byte[] nativeEncodeChunk(long j, byte[] bArr, int i, int i2);

    public static native byte[] nativeFinish(long j);

    public static native int nativeGetApiVersion();

    public NativeXZOutputStream(OutputStream outputStream, int i) throws IOException {
        C11003.requireNonNull(outputStream, "outputStream");
        this.f77887 = outputStream;
        if (i < 0 || i > 9) {
            throw new IOException("Unsupported native XZ compression options");
        }
        if (!m52883()) {
            throw new IOException("Native XZ encoder is unavailable");
        }
        long jNativeCreate = nativeCreate(i, 4);
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ encoder");
        }
        try {
            outputStream.write(m52882());
            this.f77888 = jNativeCreate;
        } catch (IOException | Error | RuntimeException e) {
            nativeDestroy(jNativeCreate);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m52883() {
        try {
            return nativeGetApiVersion() == 2;
        } catch (LinkageError unused) {
            return false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f77886;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m52881();
        while (i2 > 0) {
            int i3 = this.f77891;
            OutputStream outputStream = this.f77887;
            if (i3 != 0 || i2 < 1048576) {
                int iMin = Math.min(i2, 1048576 - i3);
                int i4 = this.f77891;
                byte[] bArr2 = this.f77890;
                System.arraycopy(bArr, i, bArr2, i4, iMin);
                int i5 = this.f77891 + iMin;
                this.f77891 = i5;
                i += iMin;
                i2 -= iMin;
                if (i5 == 1048576 && i5 != 0) {
                    try {
                        byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f77888, bArr2, 0, i5);
                        if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                            throw new IOException("Invalid native XZ chunk result");
                        }
                        outputStream.write(bArrNativeEncodeChunk);
                        this.f77891 = 0;
                    } catch (IOException e) {
                        IOException iOException = this.f77885;
                        if (iOException == null) {
                            this.f77885 = e;
                        } else if (iOException != e) {
                            iOException.addSuppressed(e);
                        }
                        long j = this.f77888;
                        this.f77888 = 0L;
                        if (j != 0) {
                            nativeDestroy(j);
                        }
                        throw this.f77885;
                    }
                }
            } else {
                try {
                    byte[] bArrNativeEncodeChunk2 = nativeEncodeChunk(this.f77888, bArr, i, 1048576);
                    if (bArrNativeEncodeChunk2 == null || bArrNativeEncodeChunk2.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk2);
                    i += 1048576;
                    i2 -= 1048576;
                } catch (IOException e2) {
                    IOException iOException2 = this.f77885;
                    if (iOException2 == null) {
                        this.f77885 = e2;
                    } else if (iOException2 != e2) {
                        iOException2.addSuppressed(e2);
                    }
                    long j2 = this.f77888;
                    this.f77888 = 0L;
                    if (j2 != 0) {
                        nativeDestroy(j2);
                    }
                    throw this.f77885;
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m52881();
        try {
            int i = this.f77891;
            OutputStream outputStream = this.f77887;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f77888, this.f77890, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f77891 = 0;
                } catch (IOException e) {
                    IOException iOException = this.f77885;
                    if (iOException == null) {
                        this.f77885 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f77888;
                    this.f77888 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f77885;
                }
            }
            outputStream.flush();
        } catch (IOException e2) {
            IOException iOException2 = this.f77885;
            if (iOException2 == null) {
                this.f77885 = e2;
            } else if (iOException2 != e2) {
                iOException2.addSuppressed(e2);
            }
            long j2 = this.f77888;
            this.f77888 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
            throw this.f77885;
        }
    }

    public final void finish() throws IOException {
        IOException iOException = this.f77885;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f77884) {
            return;
        }
        if (this.f77889) {
            throw new IOException("Stream closed");
        }
        try {
            int i = this.f77891;
            OutputStream outputStream = this.f77887;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f77888, this.f77890, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f77891 = 0;
                } catch (IOException e) {
                    IOException iOException2 = this.f77885;
                    if (iOException2 == null) {
                        this.f77885 = e;
                    } else if (iOException2 != e) {
                        iOException2.addSuppressed(e);
                    }
                    long j = this.f77888;
                    this.f77888 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f77885;
                }
            }
            byte[] bArrNativeFinish = nativeFinish(this.f77888);
            if (bArrNativeFinish == null || bArrNativeFinish.length == 0) {
                throw new IOException("Invalid native XZ footer result");
            }
            outputStream.write(bArrNativeFinish);
            this.f77884 = true;
            long j2 = this.f77888;
            this.f77888 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
        } catch (IOException e2) {
            IOException iOException3 = this.f77885;
            if (iOException3 == null) {
                this.f77885 = e2;
            } else if (iOException3 != e2) {
                iOException3.addSuppressed(e2);
            }
            long j3 = this.f77888;
            this.f77888 = 0L;
            if (j3 != 0) {
                nativeDestroy(j3);
            }
            throw this.f77885;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f77889) {
            return;
        }
        if (this.f77885 == null) {
            try {
                finish();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        this.f77889 = true;
        long j = this.f77888;
        this.f77888 = 0L;
        if (j != 0) {
            nativeDestroy(j);
        }
        try {
            this.f77887.close();
        } catch (IOException e2) {
            if (e2 != this.f77885) {
                if (e == null) {
                    e = e2;
                } else {
                    e.addSuppressed(e2);
                }
            }
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52881() throws IOException {
        IOException iOException = this.f77885;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f77889) {
            throw new IOException("Stream closed");
        }
        if (this.f77884) {
            throw new IOException("Stream finished");
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m52882() {
        byte[] bArr = new byte[12];
        System.arraycopy(f77883, 0, bArr, 0, 6);
        bArr[6] = 0;
        bArr[7] = (byte) 4;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 6, 2);
        long value = crc32.getValue();
        for (int i = 0; i < 4; i++) {
            bArr[i + 8] = (byte) (value >>> (i * 8));
        }
        return bArr;
    }
}
