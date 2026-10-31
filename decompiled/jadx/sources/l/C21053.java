package l;

/* JADX INFO: renamed from: l.᩷ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C7LA */
/* JADX INFO: loaded from: classes5.dex */
public final class C21053 extends AbstractC2708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 f67911;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14163 f67912;

    public C21053(C14163 c14163, C2609 c2609) {
        this.f67912 = c14163;
        this.f67911 = c2609;
    }

    public final String toString() {
        return "Provides[" + this.f67912 + "," + this.f67911 + "]";
    }

    @Override // l.InterfaceC11286
    /* JADX INFO: renamed from: ֫ */
    public final void mo24769(InterfaceC18341 interfaceC18341) {
        interfaceC18341.mo14070(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21053)) {
            return false;
        }
        C21053 c21053 = (C21053) obj;
        return this.f67912 == c21053.f67912 && this.f67911.equals(c21053.f67911);
    }

    public final int hashCode() {
        return (this.f67911.hashCode() * 37) + (this.f67912.hashCode() * 31);
    }
}
