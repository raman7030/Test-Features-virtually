package l;

/* JADX INFO: renamed from: l.ۢۛۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9399 extends AbstractC3754 {
    public C9399(int i, InterfaceC2343 interfaceC2343) {
        super(new C18571[i], interfaceC2343);
        if (i == 0 || i >= 10000) {
            throw new IllegalArgumentException(C19370.m44628(i, "count="));
        }
        int i2 = 10000 / i;
        int i3 = i - 1;
        int i4 = 10000 - (i2 * i3);
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 == i3) {
                this.f11845[i5] = new C18571(this, i4);
            } else {
                this.f11845[i5] = new C18571(this, i2);
            }
        }
    }
}
