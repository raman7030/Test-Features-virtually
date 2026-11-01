package p067l;

/* JADX INFO: renamed from: l.ۗ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: UASO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5750 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final int f14104;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return false;
    }

    public C5750(int i) {
        this.f14104 = i;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(0, EnumC3067.TYPE.ordinal()), this.f14104), 2);
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        abstractC24937.f79640 = this.f14104;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5750) {
            return this.f14104 == ((C5750) obj).f14104;
        }
        return false;
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f14104));
    }
}
