package p067l;

import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12460 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public long f34861;

    /* JADX INFO: renamed from: ۛ */
    public final /* synthetic */ byte[] f34863;

    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ C3940 f34864;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f34869 = false;

    /* JADX INFO: renamed from: ۫ */
    public int f34865 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f34868 = new byte[1];

    /* JADX INFO: renamed from: ۬ */
    public byte[] f34866 = new byte[1024];

    /* JADX INFO: renamed from: ᩶ */
    public C8436 f34867 = new C8436();

    /* JADX INFO: renamed from: ۙ */
    public int f34862 = 1;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12460(C3940 c3940, long j, byte[] bArr) {
        this.f34864 = c3940;
        this.f34863 = bArr;
        this.f34861 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f34869) {
            byte[] bArr = this.f34868;
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f34869) {
            return -1;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int length = i2;
        if (this.f34869) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || length < 0 || i + length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length == 0) {
            return 0;
        }
        int i3 = this.f34865;
        if (i3 > 0) {
            if (i3 <= length) {
                length = i3;
            }
            System.arraycopy(this.f34866, 0, bArr, i, length);
            int i4 = this.f34865;
            if (length != i4) {
                byte[] bArr3 = this.f34866;
                System.arraycopy(bArr3, length, bArr3, 0, i4 - length);
            }
            this.f34865 -= length;
            return length;
        }
        C3940 c3940 = this.f34864;
        if (c3940.f8554.f53185.length - 13 < length) {
            length = c3940.f8554.f53185.length - 13;
        }
        if (c3940.f8556 == 0 && length > 1024) {
            length = 1024;
        }
        c3940.f8559.getClass();
        int length2 = c3940.f8556 == 0 ? 1024 : c3940.f8554.f53185.length - 13;
        while (true) {
            int i5 = c3940.f8559.f27005;
            int i6 = this.f34862;
            bArr2 = this.f34863;
            if (i5 >= i6) {
                break;
            }
            try {
                C3940.m7791(c3940, bArr2, this.f34861, length2, c3940.f8559);
                this.f34861 += (long) length2;
            } catch (Exception unused) {
                throw new IOException(C0708d.f2599O);
            }
        }
        C17823 c17823 = c3940.f8554;
        C8436 c8436 = this.f34867;
        c3940.m7795(c17823, c8436);
        this.f34867 = c8436;
        this.f34865 = c8436.f22620;
        int i7 = c8436.f22622;
        try {
            C15811 c15811M22804 = c3940.f8559.m22804(this.f34867.f22621);
            if (i7 != 101 && i7 != 103) {
                throw new IOException(C0708d.f2599O);
            }
            if (i7 != 101) {
                c3940.f8554.f53187 = 0;
                c3940.m7781(0, 4, c3940.f8554.f53185);
                int iM40464 = c3940.f8554.m40464();
                int i8 = this.f34865 - 4;
                this.f34865 = i8;
                int i9 = i8 - iM40464;
                long j = iM40464;
                if (iM40464 <= 0) {
                    return 0;
                }
                if (iM40464 <= length) {
                    length = iM40464;
                }
                int i10 = c3940.f8549.read(bArr, i, length);
                if (i10 < 0) {
                    return -1;
                }
                int i11 = iM40464 - i10;
                this.f34865 = i11;
                if (i11 > 0) {
                    if (this.f34866.length < i11) {
                        this.f34866 = new byte[i11];
                    }
                    int i12 = 0;
                    while (i11 > 0) {
                        int i13 = c3940.f8549.read(this.f34866, i12, i11);
                        if (i13 <= 0) {
                            break;
                        }
                        i12 += i13;
                        i11 -= i13;
                    }
                }
                if (i9 > 0) {
                    c3940.f8549.skip(i9);
                }
                if (j < c15811M22804.f45779) {
                    c3940.f8559.m22805(c3940.f8554, this.f34867);
                    try {
                        C3940.m7791(c3940, bArr2, c15811M22804.f45780 + j, (int) (c15811M22804.f45779 - j), c3940.f8559);
                        this.f34861 = c15811M22804.f45780 + c15811M22804.f45779;
                    } catch (Exception unused2) {
                        throw new IOException(C0708d.f2599O);
                    }
                }
                if (this.f34862 < c3940.f8559.f27007.length) {
                    this.f34862++;
                }
                return i10;
            }
            c3940.m7794(c3940.f8554, this.f34865);
            int iM40465 = c3940.f8554.m40464();
            this.f34865 = 0;
            if (iM40465 == 1) {
                close();
                return -1;
            }
            throw new IOException(C0708d.f2599O);
        } catch (C18080 e) {
            throw new IOException("error: " + e.toString(), e);
        } catch (C24529 e2) {
            this.f34861 = e2.f77690;
            skip(this.f34867.f22620);
            c3940.f8559.m22805(c3940.f8554, this.f34867);
            return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34869) {
            return;
        }
        this.f34869 = true;
        C3940 c3940 = this.f34864;
        c3940.f8559.m22805(c3940.f8554, this.f34867);
        try {
            C3940.m7792(c3940, this.f34863, this.f34867);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
