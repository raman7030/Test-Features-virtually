package p067l;

/* JADX INFO: renamed from: l.ܶ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: CAT9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17148 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final int f51075;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return false;
    }

    public C17148(int i) {
        this.f51075 = i;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(0, EnumC3067.MODE.ordinal()), this.f51075), 2);
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        abstractC24937.f79633 = this.f51075;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17148) {
            return this.f51075 == ((C17148) obj).f51075;
        }
        return false;
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f51075));
    }
}
