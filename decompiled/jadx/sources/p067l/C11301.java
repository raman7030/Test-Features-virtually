package p067l;

/* JADX INFO: renamed from: l.ۢۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11301 extends AbstractC5936 {
    public C11301(int i, InterfaceC4595 interfaceC4595) {
        super(new C20018[i], interfaceC4595);
        if (i == 0 || i >= 10000) {
            throw new IllegalArgumentException(C20778.m46922(i, "count="));
        }
        int i2 = 10000 / i;
        int i3 = i - 1;
        int i4 = 10000 - (i2 * i3);
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == i3) {
                this.f14651[i5] = new C20018(this, i4);
            } else {
                this.f14651[i5] = new C20018(this, i2);
            }
        }
    }
}
