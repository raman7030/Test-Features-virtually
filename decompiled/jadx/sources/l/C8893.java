package l;

/* JADX INFO: renamed from: l.ۡ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8893 implements InterfaceC22757 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f27056;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2730 f27057 = C2730.f8507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC16427 f27058;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f27059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f27060;

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ boolean mo13463() {
        return false;
    }

    public C8893(InterfaceC16427 interfaceC16427) {
        this.f27058 = interfaceC16427;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22966() {
        if (this.f27056) {
            return;
        }
        this.f27059 = this.f27058.mo33834();
        this.f27056 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22968() {
        if (this.f27056) {
            m22967(mo13471());
            this.f27056 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22967(long j) {
        this.f27060 = j;
        if (this.f27056) {
            this.f27059 = this.f27058.mo33834();
        }
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ᩴ */
    public final long mo13471() {
        long jM8465;
        long j = this.f27060;
        if (!this.f27056) {
            return j;
        }
        long jMo33834 = this.f27058.mo33834() - this.f27059;
        C2730 c2730 = this.f27057;
        if (c2730.f8510 == 1.0f) {
            jM8465 = C3603.m11014(jMo33834);
        } else {
            jM8465 = c2730.m8465(jMo33834);
        }
        return jM8465 + j;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ֫ */
    public final void mo13455(C2730 c2730) {
        if (this.f27056) {
            m22967(mo13471());
        }
        this.f27057 = c2730;
    }

    @Override // l.InterfaceC22757
    /* JADX INFO: renamed from: ܽ */
    public final C2730 mo13468() {
        return this.f27057;
    }
}
