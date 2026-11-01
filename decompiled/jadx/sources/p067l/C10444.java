package p067l;

/* JADX INFO: renamed from: l.۠᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: EAS0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10444 implements InterfaceC20503 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20503 f28894;

    /* JADX INFO: renamed from: ۧ */
    public final int f28895;

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7194() {
        return true;
    }

    public C10444(int i, InterfaceC20503 interfaceC20503) {
        this.f28895 = i;
        this.f28894 = interfaceC20503;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m24161() {
        return this.f28895;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC20503 m24160() {
        return this.f28894;
    }

    @Override // p067l.InterfaceC20503
    /* JADX INFO: renamed from: ֫ */
    public final void mo7193(AbstractC24937 abstractC24937) {
        this.f28894.mo7193(abstractC24937);
    }

    public final int hashCode() {
        return C4358.m8999(C4358.m9000(C4358.m9002(0, this.f28895), this.f28894), 2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10444)) {
            return false;
        }
        C10444 c10444 = (C10444) obj;
        return this.f28895 == c10444.f28895 && this.f28894.equals(c10444.f28894);
    }
}
