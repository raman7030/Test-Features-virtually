package p067l;

/* JADX INFO: renamed from: l.ܺᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C17681 extends AbstractC4942 {

    /* JADX INFO: renamed from: ֫ */
    public final C15828 f52813;

    public C17681(C15828 c15828) {
        this.f52813 = c15828;
    }

    public final String toString() {
        return "Uses[" + this.f52813 + "]";
    }

    @Override // p067l.InterfaceC13095
    /* JADX INFO: renamed from: ֫ */
    public final void mo26783(InterfaceC19800 interfaceC19800) {
        interfaceC19800.mo15948(this);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17681) && this.f52813 == ((C17681) obj).f52813;
    }

    public final int hashCode() {
        return this.f52813.hashCode() * 31;
    }
}
