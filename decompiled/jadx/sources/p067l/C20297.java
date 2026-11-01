package p067l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩴܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19TR */
/* JADX INFO: loaded from: classes4.dex */
public final class C20297 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f62705;

    /* JADX INFO: renamed from: ۧ */
    public int f62706;

    /* JADX INFO: renamed from: ܽ */
    public int f62707 = 0;

    public C20297() {
        byte[] bArr = new byte[65536];
        this.f62705 = bArr;
        this.f62706 = bArr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m45839() {
        return this.f62705;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m45840() {
        return this.f62707;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m45842() {
        return this.f62706 == this.f62707;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m45841(InputStream inputStream) throws IOException {
        this.f62707 = 0;
        byte[] bArr = this.f62705;
        int i = this.f62706;
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                break;
            }
            i2 += i3;
        }
        this.f62707 = i2;
        return i2 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45838(InputStream inputStream) throws IOException {
        int i = this.f62706;
        if (i >= 524288) {
            return false;
        }
        int i2 = i * 2;
        byte[] bArr = this.f62705;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, this.f62707);
            this.f62705 = bArr2;
        }
        this.f62706 = i2;
        byte[] bArr3 = this.f62705;
        int i3 = this.f62707;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr3, i3, i2 - i3);
            if (i4 < 0) {
                break;
            }
            i3 += i4;
        }
        this.f62707 = i3;
        return true;
    }
}
