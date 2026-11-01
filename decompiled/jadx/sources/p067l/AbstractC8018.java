package p067l;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7JV */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8018 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public int f21096;

    /* JADX INFO: renamed from: ᩶ */
    public byte[] f21098;

    /* JADX INFO: renamed from: ᩹ */
    public int f21100;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f21099 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public int f21097 = -1;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream
    public abstract void write(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: ֫ */
    public abstract byte[] mo18597();

    /* JADX INFO: renamed from: ֫ */
    public final void m18596(int i) {
        int i2 = this.f21097;
        ArrayList arrayList = this.f21099;
        if (i2 < arrayList.size() - 1) {
            this.f21096 += this.f21098.length;
            int i3 = this.f21097 + 1;
            this.f21097 = i3;
            this.f21098 = (byte[]) arrayList.get(i3);
            return;
        }
        byte[] bArr = this.f21098;
        if (bArr == null) {
            if (i <= 0) {
                i = 1024;
            }
            this.f21096 = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f21096);
            this.f21096 += this.f21098.length;
        }
        this.f21097++;
        byte[] bArr2 = C23461.f74712;
        byte[] bArr3 = new byte[i];
        this.f21098 = bArr3;
        arrayList.add(bArr3);
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m18599() {
        int i = this.f21100;
        if (i == 0) {
            return C23461.f74712;
        }
        byte[] bArr = C23461.f74712;
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : this.f21099) {
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
        m18598(i);
    }

    @Deprecated
    public final String toString() {
        return new String(mo18597(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m18600(int i, int i2, byte[] bArr) {
        int i3 = this.f21100;
        int i4 = i3 + i2;
        int i5 = i3 - this.f21096;
        int i6 = i2;
        while (i6 > 0) {
            int iMin = Math.min(i6, this.f21098.length - i5);
            System.arraycopy(bArr, (i + i2) - i6, this.f21098, i5, iMin);
            i6 -= iMin;
            if (i6 > 0) {
                m18596(i4);
                i5 = 0;
            }
        }
        this.f21100 = i4;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m18598(int i) {
        int i2 = this.f21100;
        int i3 = i2 - this.f21096;
        if (i3 == this.f21098.length) {
            m18596(i2 + 1);
            i3 = 0;
        }
        this.f21098[i3] = (byte) i;
        this.f21100++;
    }
}
