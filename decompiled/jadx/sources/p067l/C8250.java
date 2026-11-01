package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8250 extends AbstractC9510 {

    /* JADX INFO: renamed from: c */
    public double[] f21853c;

    /* JADX INFO: renamed from: d */
    public int f21854d;

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21853c = new double[(int) j];
    }

    @Override // p067l.AbstractC8765, p067l.InterfaceC2925
    public final void end() {
        int i = 0;
        Arrays.sort(this.f21853c, 0, this.f21854d);
        long j = this.f21854d;
        InterfaceC2925 interfaceC2925 = this.f23785a;
        interfaceC2925.mo4231c(j);
        if (!this.f26036b) {
            while (i < this.f21854d) {
                interfaceC2925.accept(this.f21853c[i]);
                i++;
            }
        } else {
            while (i < this.f21854d && !interfaceC2925.mo4233f()) {
                interfaceC2925.accept(this.f21853c[i]);
                i++;
            }
        }
        interfaceC2925.end();
        this.f21853c = null;
    }

    @Override // p067l.InterfaceC7580, p067l.InterfaceC2925
    public final void accept(double d) {
        double[] dArr = this.f21853c;
        int i = this.f21854d;
        this.f21854d = i + 1;
        dArr[i] = d;
    }
}
