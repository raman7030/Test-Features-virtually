package p067l;

import java.io.EOFException;

/* JADX INFO: renamed from: l.ۢܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1W7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11622 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f32440;

    /* JADX INFO: renamed from: ۧ */
    public int f32441;

    /* JADX INFO: renamed from: ܽ */
    public int f32442;

    public C11622(byte[] bArr, int i, int i2) {
        this.f32440 = bArr;
        this.f32442 = i;
        this.f32441 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26740(int i, byte[] bArr) throws EOFException {
        int i2 = this.f32442;
        if (i2 + i > this.f32441) {
            throw new EOFException();
        }
        System.arraycopy(bArr, 0, this.f32440, i2, i);
        this.f32442 += i;
    }
}
