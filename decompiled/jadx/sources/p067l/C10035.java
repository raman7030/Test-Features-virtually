package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10035 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public int f27783;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22776 f27784;

    public C10035(C22776 c22776, int i) {
        this.f27784 = c22776;
        this.f27783 = i;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.f27783 + 1;
        C22776 c22776 = this.f27784;
        C22776.m50956(c22776, i2);
        byte[] bArr = c22776.f71793;
        int i3 = this.f27783;
        this.f27783 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        int length = this.f27783 + bArr.length;
        C22776 c22776 = this.f27784;
        C22776.m50956(c22776, length);
        System.arraycopy(bArr, 0, c22776.f71793, this.f27783, bArr.length);
        this.f27783 += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3 = this.f27783 + i2;
        C22776 c22776 = this.f27784;
        C22776.m50956(c22776, i3);
        System.arraycopy(bArr, i, c22776.f71793, this.f27783, i2);
        this.f27783 += i2;
    }
}
