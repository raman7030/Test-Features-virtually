package p067l;

/* JADX INFO: renamed from: l.ۡܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C10891 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C23631 f30172;

    /* JADX INFO: renamed from: ۙ */
    public final C10123 f30173;

    /* JADX INFO: renamed from: ۬ */
    public final C14146 f30174;

    /* JADX INFO: renamed from: ᩶ */
    public final C6867 f30175;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9768 f30176;

    /* JADX INFO: renamed from: ᩹ */
    public final C16434 f30177;

    public C10891(C23631 c23631, C14146 c14146, InterfaceC9768 interfaceC9768, C10123 c10123, C6867 c6867, C16434 c16434) {
        this.f30172 = c23631;
        this.f30174 = c14146;
        this.f30176 = interfaceC9768;
        this.f30173 = c10123;
        this.f30175 = c6867;
        this.f30177 = c16434;
    }

    /* JADX INFO: renamed from: ۫ */
    public final boolean m25104() {
        C23631 c23631 = this.f30172;
        if (c23631.f75236 != null || !c23631.f75228) {
            return false;
        }
        C14146 c14146 = c23631.f75242;
        C14146 c14147 = this.f30174;
        return c14146 == c14147 && c14147.m32500() == this.f30176 && this.f30175.f17850.mo25505().equals(c23631.m7649().f17850.mo25505());
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25103() {
        if (m25104()) {
            C16434 c16434 = this.f30177;
            C23631 c23631 = this.f30172;
            boolean zM37352 = c16434.m37352(c23631.f75238);
            C14146 c14146 = this.f30174;
            boolean z = zM37352 && c14146.m32422(this.f30173);
            if (m25104()) {
                c23631.m7638(c23631.m52576(c14146.m32361()));
                c23631.f8387.m26130(c23631.m7655() || c23631.f75235);
                c23631.m52538();
            }
            if (z && m25104()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f30177.close();
    }
}
