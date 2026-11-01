package net.p069sf.sevenzipjbinding;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p067l.C12826;
import p067l.C3123;
import p067l.InterfaceC16534;

/* JADX INFO: loaded from: classes.dex */
public final class NativeXZInputStream extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public int f80632;

    /* JADX INFO: renamed from: ۙ */
    public int f80633;

    /* JADX INFO: renamed from: ۛ */
    public int f80634;

    /* JADX INFO: renamed from: ۨ */
    public int f80636;

    /* JADX INFO: renamed from: ۫ */
    public long f80637;

    /* JADX INFO: renamed from: ۬ */
    public InputStream f80638;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f80640;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f80641;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f80642;

    /* JADX INFO: renamed from: ᩺ */
    public IOException f80643;

    /* JADX INFO: renamed from: ۤ */
    public final byte[] f80635 = new byte[65536];

    /* JADX INFO: renamed from: ܰ */
    public final byte[] f80639 = new byte[1];

    public static native long nativeCreate();

    public static native long nativeDecode(long j, byte[] bArr, int i, int i2, boolean z, byte[] bArr2, int i3, int i4);

    public static native void nativeDestroy(long j);

    public static native int nativeGetApiVersion();

    public static native void nativeValidateHeader(byte[] bArr);

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public NativeXZInputStream(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[65536];
        this.f80642 = bArr;
        C12826.requireNonNull(inputStream, "inputStream");
        this.f80638 = inputStream;
        long jNativeCreate = nativeCreate();
        this.f80637 = jNativeCreate;
        if (jNativeCreate == 0) {
            throw new IOException("Failed to create native XZ decoder");
        }
        try {
            new DataInputStream(inputStream).readFully(bArr, 0, 12);
            nativeValidateHeader(bArr);
            this.f80633 = 12;
        } catch (Throwable th) {
            m55284();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m55285() {
        try {
            return nativeGetApiVersion() == 1;
        } catch (LinkageError unused) {
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f80639;
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
        if (this.f80638 != null) {
            IOException iOException = this.f80643;
            if (iOException != null) {
                throw iOException;
            }
            if (this.f80641) {
                return -1;
            }
            int i4 = 0;
            while (i2 > 0) {
                try {
                    int i5 = this.f80636;
                    int i6 = this.f80634;
                    byte[] bArr2 = this.f80635;
                    if (i5 != i6) {
                        iMin = Math.min(i2, this.f80634 - this.f80636);
                        System.arraycopy(bArr2, this.f80636, bArr, i, iMin);
                        this.f80636 += iMin;
                    } else if (i2 >= 65536) {
                        iMin = m55286(i, 65536, bArr);
                        if (iMin < 0) {
                            break;
                        }
                    } else {
                        this.f80636 = 0;
                        int iM55286 = m55286(0, bArr2.length, bArr2);
                        this.f80634 = iM55286;
                        if (iM55286 < 0) {
                            this.f80634 = 0;
                            break;
                        }
                        iMin = Math.min(i2, this.f80634 - this.f80636);
                        System.arraycopy(bArr2, this.f80636, bArr, i, iMin);
                        this.f80636 += iMin;
                    }
                    i += iMin;
                    i2 -= iMin;
                    i4 += iMin;
                } catch (IOException e) {
                    this.f80643 = e;
                    m55284();
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            if (i4 == 0 && this.f80641) {
                return -1;
            }
            return i4;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f80638;
        if (inputStream == null) {
            return;
        }
        this.f80638 = null;
        try {
            m55284();
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private int m55286(int i, int i2, byte[] bArr) throws IOException {
        while (!this.f80641) {
            if (this.f80632 == this.f80633 && !this.f80640) {
                this.f80632 = 0;
                InputStream inputStream = this.f80638;
                byte[] bArr2 = this.f80642;
                int i3 = inputStream.read(bArr2);
                this.f80633 = i3;
                if (i3 < 0) {
                    this.f80633 = 0;
                    this.f80640 = true;
                } else if (i3 == 0) {
                    int i4 = this.f80638.read();
                    if (i4 < 0) {
                        this.f80640 = true;
                    } else {
                        bArr2[0] = (byte) i4;
                        this.f80633 = 1;
                    }
                }
            }
            int i5 = this.f80632;
            int i6 = this.f80633 - i5;
            long jNativeDecode = nativeDecode(this.f80637, this.f80642, i5, i6, this.f80640, bArr, i, i2);
            if (((-1125899906842624L) & jNativeDecode) != 0) {
                throw new IOException("Invalid native XZ decoder result flags");
            }
            int i7 = (int) (jNativeDecode & 16777215);
            int i8 = (int) (16777215 & (jNativeDecode >>> 24));
            if (i7 > i6 || i8 > i2) {
                throw new IOException("Invalid native XZ decoder result size");
            }
            int i9 = this.f80632 + i7;
            this.f80632 = i9;
            boolean z = (281474976710656L & jNativeDecode) != 0;
            boolean z2 = (jNativeDecode & 562949953421312L) != 0;
            if (z && i9 != this.f80633) {
                throw new IOException("Native XZ decoder requested input before consuming the current buffer");
            }
            if (i8 > 0) {
                return i8;
            }
            if (this.f80640 && i9 == this.f80633 && z) {
                if (!z2) {
                    throw new EOFException("Unexpected end of XZ input");
                }
                this.f80641 = true;
                m55284();
                return -1;
            }
            if (i9 == i5 && (!z || i9 != this.f80633)) {
                throw new IOException("Native XZ decoder made no progress");
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f80638 != null) {
            IOException iOException = this.f80643;
            if (iOException != null) {
                throw iOException;
            }
            return this.f80634 - this.f80636;
        }
        throw new IOException("Stream closed");
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55284() {
        long j = this.f80637;
        if (j != 0) {
            nativeDestroy(j);
            this.f80637 = 0L;
        }
    }
}
