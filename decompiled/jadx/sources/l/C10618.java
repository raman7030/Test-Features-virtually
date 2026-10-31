package l;

import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C10618 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f31889;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f31891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1654 f31892;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f31897 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31893 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f31896 = new byte[1];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte[] f31894 = new byte[1024];

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C6384 f31895 = new C6384();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31890 = 1;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10618(C1654 c1654, long j, byte[] bArr) {
        this.f31892 = c1654;
        this.f31891 = bArr;
        this.f31889 = j;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f31897) {
            byte[] bArr = this.f31896;
            if (read(bArr, 0, 1) != -1) {
                return bArr[0] & 255;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (this.f31897) {
            return -1;
        }
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        int length = i2;
        if (this.f31897) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || length < 0 || i + length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length == 0) {
            return 0;
        }
        int i3 = this.f31893;
        if (i3 > 0) {
            if (i3 <= length) {
                length = i3;
            }
            System.arraycopy(this.f31894, 0, bArr, i, length);
            int i4 = this.f31893;
            if (length != i4) {
                byte[] bArr3 = this.f31894;
                System.arraycopy(bArr3, length, bArr3, 0, i4 - length);
            }
            this.f31893 -= length;
            return length;
        }
        C1654 c1654 = this.f31892;
        if (c1654.f5774.f50016.length - 13 < length) {
            length = c1654.f5774.f50016.length - 13;
        }
        if (c1654.f5776 == 0 && length > 1024) {
            length = 1024;
        }
        c1654.f5779.getClass();
        int length2 = c1654.f5776 == 0 ? 1024 : c1654.f5774.f50016.length - 13;
        while (true) {
            int i5 = c1654.f5779.f24088;
            int i6 = this.f31890;
            bArr2 = this.f31891;
            if (i5 >= i6) {
                break;
            }
            try {
                C1654.m5561(c1654, bArr2, this.f31889, length2, c1654.f5779);
                this.f31889 += (long) length2;
            } catch (Exception unused) {
                throw new IOException(d.O);
            }
        }
        C16261 c16261 = c1654.f5774;
        C6384 c6384 = this.f31895;
        c1654.m5565(c16261, c6384);
        this.f31895 = c6384;
        this.f31893 = c6384.f19747;
        int i7 = c6384.f19749;
        try {
            C14144 c14144M20823 = c1654.f5779.m20823(this.f31895.f19748);
            if (i7 != 101 && i7 != 103) {
                throw new IOException(d.O);
            }
            if (i7 != 101) {
                c1654.f5774.f50018 = 0;
                c1654.m5551(0, 4, c1654.f5774.f50016);
                int iM38250 = c1654.f5774.m38250();
                int i8 = this.f31893 - 4;
                this.f31893 = i8;
                int i9 = i8 - iM38250;
                long j = iM38250;
                if (iM38250 <= 0) {
                    return 0;
                }
                if (iM38250 <= length) {
                    length = iM38250;
                }
                int i10 = c1654.f5769.read(bArr, i, length);
                if (i10 < 0) {
                    return -1;
                }
                int i11 = iM38250 - i10;
                this.f31893 = i11;
                if (i11 > 0) {
                    if (this.f31894.length < i11) {
                        this.f31894 = new byte[i11];
                    }
                    int i12 = 0;
                    while (i11 > 0) {
                        int i13 = c1654.f5769.read(this.f31894, i12, i11);
                        if (i13 <= 0) {
                            break;
                        }
                        i12 += i13;
                        i11 -= i13;
                    }
                }
                if (i9 > 0) {
                    c1654.f5769.skip(i9);
                }
                if (j < c14144M20823.f42690) {
                    c1654.f5779.m20824(c1654.f5774, this.f31895);
                    try {
                        C1654.m5561(c1654, bArr2, c14144M20823.f42691 + j, (int) (c14144M20823.f42690 - j), c1654.f5779);
                        this.f31889 = c14144M20823.f42691 + c14144M20823.f42690;
                    } catch (Exception unused2) {
                        throw new IOException(d.O);
                    }
                }
                if (this.f31890 < c1654.f5779.f24090.length) {
                    this.f31890++;
                }
                return i10;
            }
            c1654.m5564(c1654.f5774, this.f31893);
            int iM38251 = c1654.f5774.m38250();
            this.f31893 = 0;
            if (iM38251 == 1) {
                close();
                return -1;
            }
            throw new IOException(d.O);
        } catch (C16532 e) {
            throw new IOException("error: " + e.toString(), e);
        } catch (C23317 e2) {
            this.f31889 = e2.f74943;
            skip(this.f31895.f19747);
            c1654.f5779.m20824(c1654.f5774, this.f31895);
            return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f31897) {
            return;
        }
        this.f31897 = true;
        C1654 c1654 = this.f31892;
        c1654.f5779.m20824(c1654.f5774, this.f31895);
        try {
            C1654.m5562(c1654, this.f31891, this.f31895);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString(), e2);
        }
    }
}
