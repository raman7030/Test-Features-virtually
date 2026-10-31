package l;

/* JADX INFO: renamed from: l.᩸ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C21367 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C0591 f68829 = new C0591();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f68830;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f68831;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68832;

    public C21367(Object obj) {
        this.f68830 = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48415(InterfaceC15015 interfaceC15015) {
        this.f68832 = true;
        if (this.f68831) {
            this.f68831 = false;
            interfaceC15015.mo19193(this.f68830, this.f68829.m2445());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48413(int i, InterfaceC7961 interfaceC7961) {
        if (this.f68832) {
            return;
        }
        if (i != -1) {
            this.f68829.m2446(i);
        }
        this.f68831 = true;
        interfaceC7961.invoke(this.f68830);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48414(InterfaceC15015 interfaceC15015) {
        if (this.f68832 || !this.f68831) {
            return;
        }
        C5531 c5531M2445 = this.f68829.m2445();
        this.f68829 = new C0591();
        this.f68831 = false;
        interfaceC15015.mo19193(this.f68830, c5531M2445);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21367.class != obj.getClass()) {
            return false;
        }
        return this.f68830.equals(((C21367) obj).f68830);
    }

    public final int hashCode() {
        return this.f68830.hashCode();
    }
}
