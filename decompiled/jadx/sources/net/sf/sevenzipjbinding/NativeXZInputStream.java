package net.sf.sevenzipjbinding;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import l.C0794;
import l.C11003;
import l.InterfaceC14905;

/* JADX INFO: loaded from: classes.dex */
public final class NativeXZInputStream extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f77870;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f77871;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f77872;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f77874;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f77875;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public InputStream f77876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f77878;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77879;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f77880;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public IOException f77881;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final byte[] f77873 = new byte[65536];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f77877 = new byte[1];

    public static native long nativeCreate();

    public static native long nativeDecode(long j, byte[] bArr, int i, int i2, boolean z, byte[] bArr2, int i3, int i4);

    public static native void nativeDestroy(long j);

    public static native int nativeGetApiVersion();

    public static native void nativeValidateHeader(byte[] bArr);

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public NativeXZInputStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        this.f77880 = bArr;
        C11003.requireNonNull(inputStream, "inputStream");
        this.f77876 = inputStream;
        long jNativeCreate = nativeCreate();
        this.f77875 = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ decoder");
        }
        try {
            new DataInputStream(inputStream).readFully(bArr, 0, 12);
            nativeValidateHeader(bArr);
            this.f77871 = 12;
        } catch (Throwable th) {
            m52878();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m52879() {
        try {
            return nativeGetApiVersion() == 1;
        } catch (LinkageError unused) {
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f77877;
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int iMin;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f77876 != null) {
            IOException iOException = this.f77881;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f77879) {
                return -1;
            }
            int i4 = 0;
            while (i2 > 0) {
                try {
                    int i5 = this.f77874;
                    int i6 = this.f77872;
                    byte[] bArr2 = this.f77873;
                    if (i5 != i6) {
                        iMin = Math.min(i2, this.f77872 - this.f77874);
                        System.arraycopy(bArr2, this.f77874, bArr, i, iMin);
                        this.f77874 += iMin;
                    } else if (i2 >= 65536) {
                        iMin = m52880(i, 65536, bArr);
                        if (iMin < 0) {
                            break;
                        }
                    } else {
                        this.f77874 = 0;
                        int iM52880 = m52880(0, bArr2.length, bArr2);
                        this.f77872 = iM52880;
                        if (iM52880 < 0) {
                            this.f77872 = 0;
                            break;
                        }
                        iMin = Math.min(i2, this.f77872 - this.f77874);
                        System.arraycopy(bArr2, this.f77874, bArr, i, iMin);
                        this.f77874 += iMin;
                    }
                    i += iMin;
                    i2 -= iMin;
                    i4 += iMin;
                } catch (IOException e) {
                    this.f77881 = e;
                    m52878();
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            if (i4 == 0 && this.f77879) {
                return -1;
            }
            return i4;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f77876;
        if (inputStream == null) {
            return;
        }
        this.f77876 = null;
        try {
            m52878();
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m52880(int i, int i2, byte[] bArr) throws IOException {
        while (!this.f77879) {
            if (this.f77870 == this.f77871 && !this.f77878) {
                this.f77870 = 0;
                InputStream inputStream = this.f77876;
                byte[] bArr2 = this.f77880;
                int i3 = inputStream.read(bArr2);
                this.f77871 = i3;
                if (i3 < 0) {
                    this.f77871 = 0;
                    this.f77878 = true;
                } else if (i3 == 0) {
                    int i4 = this.f77876.read();
                    if (i4 < 0) {
                        this.f77878 = true;
                    } else {
                        bArr2[0] = (byte) i4;
                        this.f77871 = 1;
                    }
                }
            }
            int i5 = this.f77870;
            int i6 = this.f77871 - i5;
            long jNativeDecode = nativeDecode(this.f77875, this.f77880, i5, i6, this.f77878, bArr, i, i2);
            if (((-1125899906842624L) & jNativeDecode) != 0) {
                throw new IOException("Invalid native XZ decoder result flags");
            }
            int i7 = (int) (jNativeDecode & 16777215);
            int i8 = (int) (16777215 & (jNativeDecode >>> 24));
            if (i7 > i6 || i8 > i2) {
                throw new IOException("Invalid native XZ decoder result size");
            }
            int i9 = this.f77870 + i7;
            this.f77870 = i9;
            boolean z = (281474976710656L & jNativeDecode) != 0;
            boolean z2 = (jNativeDecode & 562949953421312L) != 0;
            if (z && i9 != this.f77871) {
                throw new IOException("Native XZ decoder requested input before consuming the current buffer");
            }
            if (i8 > 0) {
                return i8;
            }
            if (this.f77878 && i9 == this.f77871 && z) {
                if (!z2) {
                    throw new EOFException("Unexpected end of XZ input");
                }
                this.f77879 = true;
                m52878();
                return -1;
            }
            if (i9 == i5 && (!z || i9 != this.f77871)) {
                throw new IOException("Native XZ decoder made no progress");
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f77876 != null) {
            IOException iOException = this.f77881;
            if (iOException != null) {
                throw iOException;
            }
            return this.f77872 - this.f77874;
        }
        throw new IOException("Stream closed");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52878() {
        long j = this.f77875;
        if (j != 0) {
            nativeDestroy(j);
            this.f77875 = 0L;
        }
    }
}
