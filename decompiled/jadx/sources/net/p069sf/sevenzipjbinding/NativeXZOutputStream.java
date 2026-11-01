package net.p069sf.sevenzipjbinding;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.CRC32;
import p067l.C12826;

/* JADX INFO: loaded from: classes.dex */
public final class NativeXZOutputStream extends OutputStream {

    /* JADX INFO: renamed from: ۛ */
    public static final /* synthetic */ int f80644 = 0;

    /* JADX INFO: renamed from: ۨ */
    public static final byte[] f80645 = {-3, 55, 122, 88, 90, 0};

    /* JADX INFO: renamed from: ۗ */
    public boolean f80646;

    /* JADX INFO: renamed from: ۙ */
    public IOException f80647;

    /* JADX INFO: renamed from: ۫ */
    public final OutputStream f80649;

    /* JADX INFO: renamed from: ۬ */
    public long f80650;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f80651;

    /* JADX INFO: renamed from: ᩹ */
    public int f80653;

    /* JADX INFO: renamed from: ᩸ */
    public final byte[] f80652 = new byte[1048576];

    /* JADX INFO: renamed from: ۤ */
    public final byte[] f80648 = new byte[1];

    public static native long nativeCreate(int i, int i2);

    public static native void nativeDestroy(long j);

    public static native byte[] nativeEncodeChunk(long j, byte[] bArr, int i, int i2);

    public static native byte[] nativeFinish(long j);

    public static native int nativeGetApiVersion();

    public NativeXZOutputStream(OutputStream outputStream, int i) throws IOException {
        C12826.requireNonNull(outputStream, "outputStream");
        this.f80649 = outputStream;
        if (i < 0 || i > 9) {
            throw new IOException("Unsupported native XZ compression options");
        }
        if (!m55289()) {
            throw new IOException("Native XZ encoder is unavailable");
        }
        long jNativeCreate = nativeCreate(i, 4);
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ encoder");
        }
        try {
            outputStream.write(m55288());
            this.f80650 = jNativeCreate;
        } catch (IOException | Error | RuntimeException e) {
            nativeDestroy(jNativeCreate);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m55289() {
        try {
            return nativeGetApiVersion() == 2;
        } catch (LinkageError unused) {
            return false;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f80648;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m55287();
        while (i2 > 0) {
            int i3 = this.f80653;
            OutputStream outputStream = this.f80649;
            if (i3 != 0 || i2 < 1048576) {
                int iMin = Math.min(i2, 1048576 - i3);
                int i4 = this.f80653;
                byte[] bArr2 = this.f80652;
                System.arraycopy(bArr, i, bArr2, i4, iMin);
                int i5 = this.f80653 + iMin;
                this.f80653 = i5;
                i += iMin;
                i2 -= iMin;
                if (i5 == 1048576 && i5 != 0) {
                    try {
                        byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f80650, bArr2, 0, i5);
                        if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                            throw new IOException("Invalid native XZ chunk result");
                        }
                        outputStream.write(bArrNativeEncodeChunk);
                        this.f80653 = 0;
                    } catch (IOException e) {
                        IOException iOException = this.f80647;
                        if (iOException == null) {
                            this.f80647 = e;
                        } else if (iOException != e) {
                            iOException.addSuppressed(e);
                        }
                        long j = this.f80650;
                        this.f80650 = 0L;
                        if (j != 0) {
                            nativeDestroy(j);
                        }
                        throw this.f80647;
                    }
                }
            } else {
                try {
                    byte[] bArrNativeEncodeChunk2 = nativeEncodeChunk(this.f80650, bArr, i, 1048576);
                    if (bArrNativeEncodeChunk2 == null || bArrNativeEncodeChunk2.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk2);
                    i += 1048576;
                    i2 -= 1048576;
                } catch (IOException e2) {
                    IOException iOException2 = this.f80647;
                    if (iOException2 == null) {
                        this.f80647 = e2;
                    } else if (iOException2 != e2) {
                        iOException2.addSuppressed(e2);
                    }
                    long j2 = this.f80650;
                    this.f80650 = 0L;
                    if (j2 != 0) {
                        nativeDestroy(j2);
                    }
                    throw this.f80647;
                }
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m55287();
        try {
            int i = this.f80653;
            OutputStream outputStream = this.f80649;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f80650, this.f80652, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f80653 = 0;
                } catch (IOException e) {
                    IOException iOException = this.f80647;
                    if (iOException == null) {
                        this.f80647 = e;
                    } else if (iOException != e) {
                        iOException.addSuppressed(e);
                    }
                    long j = this.f80650;
                    this.f80650 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f80647;
                }
            }
            outputStream.flush();
        } catch (IOException e2) {
            IOException iOException2 = this.f80647;
            if (iOException2 == null) {
                this.f80647 = e2;
            } else if (iOException2 != e2) {
                iOException2.addSuppressed(e2);
            }
            long j2 = this.f80650;
            this.f80650 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
            throw this.f80647;
        }
    }

    public final void finish() throws IOException {
        IOException iOException = this.f80647;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f80646) {
            return;
        }
        if (this.f80651) {
            throw new IOException("Stream closed");
        }
        try {
            int i = this.f80653;
            OutputStream outputStream = this.f80649;
            if (i != 0) {
                try {
                    byte[] bArrNativeEncodeChunk = nativeEncodeChunk(this.f80650, this.f80652, 0, i);
                    if (bArrNativeEncodeChunk == null || bArrNativeEncodeChunk.length == 0) {
                        throw new IOException("Invalid native XZ chunk result");
                    }
                    outputStream.write(bArrNativeEncodeChunk);
                    this.f80653 = 0;
                } catch (IOException e) {
                    IOException iOException2 = this.f80647;
                    if (iOException2 == null) {
                        this.f80647 = e;
                    } else if (iOException2 != e) {
                        iOException2.addSuppressed(e);
                    }
                    long j = this.f80650;
                    this.f80650 = 0L;
                    if (j != 0) {
                        nativeDestroy(j);
                    }
                    throw this.f80647;
                }
            }
            byte[] bArrNativeFinish = nativeFinish(this.f80650);
            if (bArrNativeFinish == null || bArrNativeFinish.length == 0) {
                throw new IOException("Invalid native XZ footer result");
            }
            outputStream.write(bArrNativeFinish);
            this.f80646 = true;
            long j2 = this.f80650;
            this.f80650 = 0L;
            if (j2 != 0) {
                nativeDestroy(j2);
            }
        } catch (IOException e2) {
            IOException iOException3 = this.f80647;
            if (iOException3 == null) {
                this.f80647 = e2;
            } else if (iOException3 != e2) {
                iOException3.addSuppressed(e2);
            }
            long j3 = this.f80650;
            this.f80650 = 0L;
            if (j3 != 0) {
                nativeDestroy(j3);
            }
            throw this.f80647;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f80651) {
            return;
        }
        if (this.f80647 == null) {
            try {
                finish();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        this.f80651 = true;
        long j = this.f80650;
        this.f80650 = 0L;
        if (j != 0) {
            nativeDestroy(j);
        }
        try {
            this.f80649.close();
        } catch (IOException e2) {
            if (e2 != this.f80647) {
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

    /* JADX INFO: renamed from: ֫ */
    private void m55287() throws IOException {
        IOException iOException = this.f80647;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f80651) {
            throw new IOException("Stream closed");
        }
        if (this.f80646) {
            throw new IOException("Stream finished");
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static byte[] m55288() {
        byte[] bArr = new byte[12];
        System.arraycopy(f80645, 0, bArr, 0, 6);
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
