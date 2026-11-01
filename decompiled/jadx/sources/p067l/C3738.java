package p067l;

/* JADX INFO: renamed from: l.֨᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: AARL */
/* JADX INFO: loaded from: classes2.dex */
public final class C3738 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final int f7919;

    /* JADX INFO: renamed from: ۧ */
    public final int f7920;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return true;
    }

    public C3738(int i, int i2) {
        this.f7920 = i;
        this.f7919 = i2;
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9002(C4358.m9002(C4358.m9002(0, EnumC3067.CUSTOM.ordinal()), this.f7920), this.f7919), 3);
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        abstractC24937.mo3735(this.f7920, this.f7919);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3738)) {
            return false;
        }
        C3738 c3738 = (C3738) obj;
        return this.f7920 == c3738.f7920 && this.f7919 == c3738.f7919;
    }
}
