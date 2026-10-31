package l;

/* JADX INFO: renamed from: l.ܶ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: CAT9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15551 implements InterfaceC19081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f47943;

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4951() {
        return false;
    }

    public C15551(int i) {
        this.f47943 = i;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(0, EnumC0735.MODE.ordinal()), this.f47943), 2);
    }

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4950(AbstractC23747 abstractC23747) {
        abstractC23747.f76881 = this.f47943;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C15551) {
            return this.f47943 == ((C15551) obj).f47943;
        }
        return false;
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f47943));
    }
}
