package l;

/* JADX INFO: renamed from: l.ۜ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6989 implements InterfaceC2050 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f21580;

    public C6989(String str) {
        this.f21580 = str;
    }

    @Override // l.InterfaceC2050
    public final String getName() {
        return this.f21580;
    }

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6727() {
        return this.f21580.endsWith("_OUTPUT");
    }

    @Override // l.InterfaceC2050
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6726() {
        return getName().matches("\\bMODULE\\b");
    }
}
