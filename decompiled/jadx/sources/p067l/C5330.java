package p067l;

/* JADX INFO: renamed from: l.ۗ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5330 implements InterfaceC3326, InterfaceC15785 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23435 f12541;

    public C5330(C23435 c23435) {
        this.f12541 = c23435;
    }

    public final int hashCode() {
        return this.f12541.hashCode();
    }

    @Override // p067l.InterfaceC15785
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC17797 mo11316() {
        return this.f12541;
    }

    @Override // p067l.InterfaceC3326
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4017(Object obj) {
        this.f12541.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC3326) || !(obj instanceof InterfaceC15785)) {
            return false;
        }
        return this.f12541.equals(((InterfaceC15785) obj).mo11316());
    }
}
