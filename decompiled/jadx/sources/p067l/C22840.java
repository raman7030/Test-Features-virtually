package p067l;

/* JADX INFO: renamed from: l.᩸ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22840 extends C17650 {

    /* JADX INFO: renamed from: ۧ */
    public final C15020 f71926;

    public C22840(InterfaceC11617 interfaceC11617, C15020 c15020) {
        super(interfaceC11617);
        this.f71926 = c15020;
    }

    @Override // p067l.InterfaceC20334
    /* JADX INFO: renamed from: ܿ */
    public final C15020 mo4759() {
        return this.f71926;
    }

    @Override // p067l.InterfaceC20334
    /* JADX INFO: renamed from: ֫ */
    public final C10307 mo4748(int i) {
        return this.f71926.m34395(m40173().mo4755(i));
    }

    @Override // p067l.InterfaceC11617
    /* JADX INFO: renamed from: ۜ */
    public final C10307 mo4753() {
        return this.f71926.m34395(m40173().mo4761());
    }

    @Override // p067l.C17650
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C22840)) {
            return this.f71926.equals(((C22840) obj).f71926);
        }
        return false;
    }

    @Override // p067l.C17650
    public final int hashCode() {
        return this.f71926.hashCode() + (super.hashCode() * 31);
    }
}
