package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C14471 extends OutputStream {

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ long[] f41333;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C3940 f41334;

    /* JADX INFO: renamed from: ۨ */
    public final /* synthetic */ byte[] f41335;

    /* JADX INFO: renamed from: ۗ */
    public boolean f41331 = true;

    /* JADX INFO: renamed from: ۬ */
    public boolean f41337 = false;

    /* JADX INFO: renamed from: ᩶ */
    public int[] f41338 = new int[1];

    /* JADX INFO: renamed from: ۫ */
    public int f41336 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public int f41340 = 0;

    /* JADX INFO: renamed from: ᩺ */
    public int f41341 = 0;

    /* JADX INFO: renamed from: ۙ */
    public C8436 f41332 = new C8436();

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f41339 = new byte[1];

    public C14471(C3940 c3940, byte[] bArr, long[] jArr) {
        this.f41334 = c3940;
        this.f41335 = bArr;
        this.f41333 = jArr;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f41331) {
            this.f41336 = this.f41334.f8558;
            int unused = this.f41334.f8558;
            this.f41331 = false;
        }
        if (this.f41337) {
            throw new IOException("stream already closed");
        }
        while (i2 > 0) {
            try {
                if (this.f41334.f8548 && this.f41334.f66559 < C20780.m46927(this.f41335.length, 21, i2, 4)) {
                    flush();
                }
                int iM7782 = C3940.m7782(this.f41334, this.f41335, this.f41333[0], bArr, i, i2);
                this.f41341++;
                long[] jArr = this.f41333;
                jArr[0] = jArr[0] + ((long) iM7782);
                i += iM7782;
                i2 -= iM7782;
                if (this.f41334.f8558 - 1 == this.f41336 || this.f41334.f8549.available() >= 1024) {
                    while (this.f41334.f8549.available() > 0) {
                        this.f41334.m7799(this.f41338, this.f41332);
                        int i3 = this.f41338[0];
                        if (this.f41336 > i3 || i3 > this.f41334.f8558 - 1) {
                            throw new C18080(4, "");
                        }
                        this.f41340++;
                    }
                }
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(e2.toString(), e2);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f41339;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        if (this.f41337) {
            throw new IOException("stream already closed");
        }
        if (this.f41331) {
            return;
        }
        while (this.f41341 > this.f41340) {
            try {
                this.f41334.m7799((int[]) null, this.f41332);
                this.f41340++;
            } catch (C18080 e) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f41337) {
            return;
        }
        flush();
        try {
            C3940.m7792(this.f41334, this.f41335, this.f41332);
            this.f41337 = true;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
