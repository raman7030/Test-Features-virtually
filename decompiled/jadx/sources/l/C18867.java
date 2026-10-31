package l;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;

/* JADX INFO: renamed from: l.ᩴܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: LCCE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18867 extends AbstractC5461 implements InterfaceC8283 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59480;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f59481;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f59482;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f59483;

    /* JADX WARN: Multi-variable type inference failed */
    public C18867(InputStream inputStream, byte[] bArr) {
        this.f59481 = inputStream;
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException(C19370.m44628(length, "Illegal buffer size: "));
        }
        this.f59483 = bArr;
        if (inputStream instanceof InterfaceC8283) {
        }
        if (inputStream instanceof InterfaceC1227) {
        }
        try {
        } catch (ClassCastException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }

    static {
        EnumSet.allOf(EnumC4050.class);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f59482 == 0) {
            int i = this.f59481.read(this.f59483);
            this.f59482 = i;
            if (i <= 0) {
                this.f59482 = 0;
                return -1;
            }
            this.f59480 = 0;
        }
        this.f59482--;
        byte[] bArr = this.f59483;
        int i2 = this.f59480;
        this.f59480 = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f59482;
        if (i2 <= i3) {
            System.arraycopy(this.f59483, this.f59480, bArr, i, i2);
            this.f59480 += i2;
            this.f59482 -= i2;
            return i2;
        }
        System.arraycopy(this.f59483, this.f59480, bArr, i, i3);
        this.f59482 = 0;
        this.f59480 = 0;
        byte[] bArr2 = this.f59483;
        if (i2 <= bArr2.length) {
            int i4 = this.f59481.read(bArr2);
            this.f59482 = i4;
            if (i4 <= 0) {
                this.f59482 = 0;
                if (i3 == 0) {
                    return -1;
                }
            } else {
                this.f59480 = 0;
                int iMin = Math.min(i2 - i3, this.f59482);
                System.arraycopy(this.f59483, 0, bArr, i + i3, iMin);
                this.f59480 = iMin;
                this.f59482 -= iMin;
                return iMin + i3;
            }
        } else {
            int i5 = this.f59481.read(bArr, i + i3, i2 - i3);
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
        int i = this.f59482;
        long j2 = i;
        if (j <= j2) {
            int i2 = (int) j;
            this.f59480 += i2;
            this.f59482 = i - i2;
            return j;
        }
        long j3 = j - j2;
        this.f59482 = 0;
        long jSkip = 0;
        while (j3 != 0) {
            InputStream inputStream = this.f59481;
            if (inputStream == System.in) {
                long j4 = j3;
                while (j4 > 0) {
                    InputStream inputStream2 = this.f59481;
                    byte[] bArr = this.f59483;
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
                this.f59481.read();
                throw null;
            }
            j3 -= jSkip;
        }
        return j - (j3 - jSkip);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(((long) this.f59481.available()) + ((long) this.f59482), 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f59481;
        if (inputStream == null) {
            return;
        }
        if (inputStream != System.in) {
            inputStream.close();
        }
        this.f59481 = null;
        this.f59483 = null;
    }

    @Override // java.io.InputStream
    @Deprecated
    public final void reset() {
        if (this.f59481 == null) {
            return;
        }
        this.f59480 = 0;
        this.f59482 = 0;
    }
}
