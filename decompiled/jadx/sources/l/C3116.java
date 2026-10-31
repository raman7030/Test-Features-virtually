package l;

/* JADX INFO: renamed from: l.ۗ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3116 implements InterfaceC1008, InterfaceC14116 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22166 f9738;

    public C3116(C22166 c22166) {
        this.f9738 = c22166;
    }

    public final int hashCode() {
        return this.f9738.hashCode();
    }

    @Override // l.InterfaceC14116
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16233 mo9274() {
        return this.f9738;
    }

    @Override // l.InterfaceC1008
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo1617(Object obj) {
        this.f9738.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1008) || !(obj instanceof InterfaceC14116)) {
            return false;
        }
        return this.f9738.equals(((InterfaceC14116) obj).mo9274());
    }
}
