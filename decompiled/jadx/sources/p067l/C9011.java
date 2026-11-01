package p067l;

/* JADX INFO: renamed from: l.ۜ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 742G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9011 implements InterfaceC4317 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ String f24460;

    public C9011(String str) {
        this.f24460 = str;
    }

    @Override // p067l.InterfaceC4317
    public final String getName() {
        return this.f24460;
    }

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8853() {
        return this.f24460.endsWith("_OUTPUT");
    }

    @Override // p067l.InterfaceC4317
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo8852() {
        return getName().matches("\\bMODULE\\b");
    }
}
