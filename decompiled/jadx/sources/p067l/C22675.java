package p067l;

/* JADX INFO: renamed from: l.᩸ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: L8SE */
/* JADX INFO: loaded from: classes4.dex */
public final class C22675 {

    /* JADX INFO: renamed from: ֫ */
    public C2930 f71525 = new C2930();

    /* JADX INFO: renamed from: ۧ */
    public final Object f71526;

    /* JADX INFO: renamed from: ܽ */
    public boolean f71527;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f71528;

    public C22675(Object obj) {
        this.f71526 = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50751(InterfaceC16638 interfaceC16638) {
        this.f71528 = true;
        if (this.f71527) {
            this.f71527 = false;
            interfaceC16638.mo21136(this.f71526, this.f71525.m4800());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50749(int i, InterfaceC9934 interfaceC9934) {
        if (this.f71528) {
            return;
        }
        if (i != -1) {
            this.f71525.m4801(i);
        }
        this.f71527 = true;
        interfaceC9934.invoke(this.f71526);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50750(InterfaceC16638 interfaceC16638) {
        if (this.f71528 || !this.f71527) {
            return;
        }
        C7625 c7625M4800 = this.f71525.m4800();
        this.f71525 = new C2930();
        this.f71527 = false;
        interfaceC16638.mo21136(this.f71526, c7625M4800);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C22675.class != obj.getClass()) {
            return false;
        }
        return this.f71526.equals(((C22675) obj).f71526);
    }

    public final int hashCode() {
        return this.f71526.hashCode();
    }
}
