package p067l;

/* JADX INFO: renamed from: l.᩶᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ASJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21844 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final int f68743;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return false;
    }

    public C21844(int i) {
        this.f68743 = i;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(0, EnumC3067.PUSH_MODE.ordinal()), this.f68743), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21844) {
            return this.f68743 == ((C21844) obj).f68743;
        }
        return false;
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f68743));
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        abstractC24937.f79641.m43357(abstractC24937.f79633);
        abstractC24937.f79633 = this.f68743;
    }
}
