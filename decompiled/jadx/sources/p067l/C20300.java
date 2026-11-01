package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ᩴܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCCE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20300 extends AbstractC7559 implements InterfaceC10241 {

    /* JADX INFO: renamed from: ۙ */
    public int f62709;

    /* JADX INFO: renamed from: ᩶ */
    public InputStream f62710;

    /* JADX INFO: renamed from: ᩸ */
    public int f62711;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f62712;

    /* JADX WARN: Multi-variable type inference failed */
    public C20300(InputStream inputStream, byte[] bArr) {
        this.f62710 = inputStream;
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException(C20778.m46922(length, "Illegal buffer size: "));
        }
        this.f62712 = bArr;
        if (inputStream instanceof InterfaceC10241) {
        }
        if (inputStream instanceof InterfaceC3535) {
        }
        try {
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    static {
        EnumSet.allOf(EnumC6218.class);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f62711 == 0) {
            int i = this.f62710.read(this.f62712);
            this.f62711 = i;
            if (i <= 0) {
                this.f62711 = 0;
                return -1;
            }
            this.f62709 = 0;
        }
        this.f62711--;
        byte[] bArr = this.f62712;
        int i2 = this.f62709;
        this.f62709 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f62711;
        if (i2 <= i3) {
            System.arraycopy(this.f62712, this.f62709, bArr, i, i2);
            this.f62709 += i2;
            this.f62711 -= i2;
            return i2;
        }
        System.arraycopy(this.f62712, this.f62709, bArr, i, i3);
        this.f62711 = 0;
        this.f62709 = 0;
        byte[] bArr2 = this.f62712;
        if (i2 <= bArr2.length) {
            int i4 = this.f62710.read(bArr2);
            this.f62711 = i4;
            if (i4 <= 0) {
                this.f62711 = 0;
                if (i3 == 0) {
                    return -1;
                }
            } else {
                this.f62709 = 0;
                int iMin = Math.min(i2 - i3, this.f62711);
                System.arraycopy(this.f62712, 0, bArr, i + i3, iMin);
                this.f62709 = iMin;
                this.f62711 -= iMin;
                return iMin + i3;
            }
        } else {
            int i5 = this.f62710.read(bArr, i + i3, i2 - i3);
            if (i5 >= 0) {
                return i5 + i3;
            }
            if (i3 == 0) {
                return -1;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        int i = this.f62711;
        long j2 = i;
        if (j <= j2) {
            int i2 = (int) j;
            this.f62709 += i2;
            this.f62711 = i - i2;
            return j;
        }
        long j3 = j - j2;
        this.f62711 = 0;
        long jSkip = 0;
        while (j3 != 0) {
            InputStream inputStream = this.f62710;
            if (inputStream == System.in) {
                long j4 = j3;
                while (j4 > 0) {
                    InputStream inputStream2 = this.f62710;
                    byte[] bArr = this.f62712;
                    int i3 = inputStream2.read(bArr, 0, (int) Math.min(bArr.length, j4));
                    if (i3 <= 0) {
                        break;
                    }
                    j4 -= (long) i3;
                }
                jSkip = j3 - j4;
            } else {
                jSkip = inputStream.skip(j3);
            }
            if (jSkip >= j3) {
                break;
            }
            if (jSkip == 0) {
                this.f62710.read();
                throw null;
            }
            j3 -= jSkip;
        }
        return j - (j3 - jSkip);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(((long) this.f62710.available()) + ((long) this.f62711), 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f62710;
        if (inputStream == null) {
            return;
        }
        if (inputStream != System.in) {
            inputStream.close();
        }
        this.f62710 = null;
        this.f62712 = null;
    }

    @Override // java.io.InputStream
    @Deprecated
    public final void reset() {
        if (this.f62710 == null) {
            return;
        }
        this.f62709 = 0;
        this.f62711 = 0;
    }
}
