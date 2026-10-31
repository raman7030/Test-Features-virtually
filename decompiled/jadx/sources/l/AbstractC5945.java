package l;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5945 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f18241;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f18243;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18245;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f18244 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18242 = -1;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract byte[] mo16671();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16670(int i) {
        int i2 = this.f18242;
        ArrayList arrayList = this.f18244;
        if (i2 < arrayList.size() - 1) {
            this.f18241 += this.f18243.length;
            int i3 = this.f18242 + 1;
            this.f18242 = i3;
            this.f18243 = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f18243;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.f18241 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f18241);
            this.f18241 += this.f18243.length;
        }
        this.f18242++;
        byte[] bArr2 = C22194.f71991;
        byte[] bArr3 = new byte[i];
        this.f18243 = bArr3;
        arrayList.add(bArr3);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m16673() {
        int i = this.f18245;
        if (i == 0) {
            return C22194.f71991;
        }
        byte[] bArr = C22194.f71991;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : this.f18244) {
            int iMin = Math.min(bArr3.length, i);
            System.arraycopy(bArr3, 0, bArr2, i2, iMin);
            i2 += iMin;
            i -= iMin;
            if (i == 0) {
                break;
            }
        }
        return bArr2;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        m16672(i);
    }

    @Deprecated
    public final String toString() {
        return new String(mo16671(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m16674(int i, int i2, byte[] bArr) {
        int i3 = this.f18245;
        int i4 = i3 + i2;
        int i5 = i3 - this.f18241;
        int i6 = i2;
        while (i6 > 0) {
            int iMin = Math.min(i6, this.f18243.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.f18243, i5, iMin);
            i6 -= iMin;
            if (i6 > 0) {
                m16670(i4);
                i5 = 0;
            }
        }
        this.f18245 = i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16672(int i) {
        int i2 = this.f18245;
        int i3 = i2 - this.f18241;
        if (i3 == this.f18243.length) {
            m16670(i2 + 1);
            i3 = 0;
        }
        this.f18243[i3] = (byte) i;
        this.f18245++;
    }
}
