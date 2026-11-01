package p067l;

/* JADX INFO: renamed from: l.ۚ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: PARF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7762 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20376;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return false;
    }

    public C7762(int i) {
        this.f20376 = i;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(0, EnumC3067.CHANNEL.ordinal()), this.f20376), 2);
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        abstractC24937.f79639 = this.f20376;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7762) {
            return this.f20376 == ((C7762) obj).f20376;
        }
        return false;
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f20376));
    }
}
