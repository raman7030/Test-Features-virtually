package l;

/* JADX INFO: renamed from: l.᩶᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 2ASJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20492 implements InterfaceC19081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f66064;

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4951() {
        return false;
    }

    public C20492(int i) {
        this.f66064 = i;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(0, EnumC0735.PUSH_MODE.ordinal()), this.f66064), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20492) {
            return this.f66064 == ((C20492) obj).f66064;
        }
        return false;
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f66064));
    }

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫ */
    public final void mo4950(AbstractC23747 abstractC23747) {
        abstractC23747.f76889.m41111(abstractC23747.f76881);
        abstractC23747.f76881 = this.f66064;
    }
}
