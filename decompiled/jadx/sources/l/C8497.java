package l;

/* JADX INFO: renamed from: l.۠᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: EAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8497 implements InterfaceC19081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19081 f25979;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f25980;

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4951() {
        return true;
    }

    public C8497(int i, InterfaceC19081 interfaceC19081) {
        this.f25980 = i;
        this.f25979 = interfaceC19081;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m22193() {
        return this.f25980;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19081 m22192() {
        return this.f25979;
    }

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4950(AbstractC23747 abstractC23747) {
        this.f25979.mo4950(abstractC23747);
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6874(C2093.m6876(0, this.f25980), this.f25979), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8497)) {
            return false;
        }
        C8497 c8497 = (C8497) obj;
        return this.f25980 == c8497.f25980 && this.f25979.equals(c8497.f25979);
    }
}
