package l;

/* JADX INFO: renamed from: l.֨᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: AARL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1441 implements InterfaceC19081 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f5146;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5147;

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo4951() {
        return true;
    }

    public C1441(int i, int i2) {
        this.f5147 = i;
        this.f5146 = i2;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6876(C2093.m6876(C2093.m6876(0, EnumC0735.CUSTOM.ordinal()), this.f5147), this.f5146), 3);
    }

    @Override // l.InterfaceC19081
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo4950(AbstractC23747 abstractC23747) {
        abstractC23747.mo1327(this.f5147, this.f5146);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1441)) {
            return false;
        }
        C1441 c1441 = (C1441) obj;
        return this.f5147 == c1441.f5147 && this.f5146 == c1441.f5146;
    }
}
