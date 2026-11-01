package p067l;

/* JADX INFO: renamed from: l.᩷ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C22377 extends AbstractC4942 {

    /* JADX INFO: renamed from: ֫ */
    public final C4848 f70595;

    /* JADX INFO: renamed from: ۧ */
    public final C15828 f70596;

    public C22377(C15828 c15828, C4848 c4848) {
        this.f70596 = c15828;
        this.f70595 = c4848;
    }

    public final String toString() {
        return "Provides[" + this.f70596 + "," + this.f70595 + "]";
    }

    @Override // p067l.InterfaceC13095
    /* JADX INFO: renamed from: ֫ */
    public final void mo26783(InterfaceC19800 interfaceC19800) {
        interfaceC19800.mo15950(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22377)) {
            return false;
        }
        C22377 c22377 = (C22377) obj;
        return this.f70596 == c22377.f70596 && this.f70595.equals(c22377.f70595);
    }

    public final int hashCode() {
        return (this.f70595.hashCode() * 37) + (this.f70596.hashCode() * 31);
    }
}
