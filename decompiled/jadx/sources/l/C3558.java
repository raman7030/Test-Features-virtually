package l;

/* JADX INFO: renamed from: l.ۗ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UASO */
/* JADX INFO: loaded from: classes2.dex */
public final class C3558 implements InterfaceC19081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f11298;

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4951() {
        return false;
    }

    public C3558(int i) {
        this.f11298 = i;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(0, EnumC0735.TYPE.ordinal()), this.f11298), 2);
    }

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4950(AbstractC23747 abstractC23747) {
        abstractC23747.f76888 = this.f11298;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3558) {
            return this.f11298 == ((C3558) obj).f11298;
        }
        return false;
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f11298));
    }
}
