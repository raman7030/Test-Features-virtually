package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩻ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C25054 extends AbstractC10677 {

    /* JADX INFO: renamed from: c */
    public int[] f79942c;

    /* JADX INFO: renamed from: d */
    public int f79943d;

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    /* JADX INFO: renamed from: c */
    public final void mo4231c(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f79942c = new int[(int) j];
    }

    @Override // p067l.AbstractC3400, p067l.InterfaceC2925
    public final void end() {
        int i = 0;
        Arrays.sort(this.f79942c, 0, this.f79943d);
        long j = this.f79943d;
        InterfaceC2925 interfaceC2925 = this.f6750a;
        interfaceC2925.mo4231c(j);
        if (!this.f29563b) {
            while (i < this.f79943d) {
                interfaceC2925.accept(this.f79942c[i]);
                i++;
            }
        } else {
            while (i < this.f79943d && !interfaceC2925.mo4233f()) {
                interfaceC2925.accept(this.f79942c[i]);
                i++;
            }
        }
        interfaceC2925.end();
        this.f79942c = null;
    }

    @Override // p067l.InterfaceC12274, p067l.InterfaceC2925
    public final void accept(int i) {
        int[] iArr = this.f79942c;
        int i2 = this.f79943d;
        this.f79943d = i2 + 1;
        iArr[i2] = i;
    }
}
