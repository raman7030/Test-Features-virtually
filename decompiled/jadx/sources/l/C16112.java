package l;

/* JADX INFO: renamed from: l.ܺᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C16112 extends AbstractC2708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 f49647;

    public C16112(C14163 c14163) {
        this.f49647 = c14163;
    }

    public final String toString() {
        return "Uses[" + this.f49647 + "]";
    }

    @Override // l.InterfaceC11286
    /* JADX INFO: renamed from: ֫ */
    public final void mo24769(InterfaceC18341 interfaceC18341) {
        interfaceC18341.mo14068(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16112) && this.f49647 == ((C16112) obj).f49647;
    }

    public final int hashCode() {
        return this.f49647.hashCode() * 31;
    }
}
