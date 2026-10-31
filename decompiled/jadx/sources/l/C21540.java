package l;

/* JADX INFO: renamed from: l.᩸ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8Q3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21540 extends C16079 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13312 f69226;

    public C21540(InterfaceC9731 interfaceC9731, C13312 c13312) {
        super(interfaceC9731);
        this.f69226 = c13312;
    }

    @Override // l.InterfaceC18903
    /* JADX INFO: renamed from: ܿ */
    public final C13312 mo2388() {
        return this.f69226;
    }

    @Override // l.InterfaceC18903
    /* JADX INFO: renamed from: ֫ */
    public final C8353 mo2377(int i) {
        return this.f69226.m32295(m37984().mo2384(i));
    }

    @Override // l.InterfaceC9731
    /* JADX INFO: renamed from: ۜ */
    public final C8353 mo2382() {
        return this.f69226.m32295(m37984().mo2390());
    }

    @Override // l.C16079
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof C21540)) {
            return this.f69226.equals(((C21540) obj).f69226);
        }
        return false;
    }

    @Override // l.C16079
    public final int hashCode() {
        return this.f69226.hashCode() + (super.hashCode() * 31);
    }
}
