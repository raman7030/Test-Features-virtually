package l;

/* JADX INFO: renamed from: l.ᩳܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1H1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18147 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f56439;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11092 f56440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f56441;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42255(AbstractC7379 abstractC7379, C15228 c15228) {
        C11233.m27805(c15228, "registry");
        C11233.m27805(abstractC7379, "lifecycle");
        if (this.f56441) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f56441 = true;
        abstractC7379.mo19833(this);
        c15228.m36039(this.f56439, this.f56440.m27521());
    }

    public C18147(String str, C11092 c11092) {
        this.f56439 = str;
        this.f56440 = c11092;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11092 m42254() {
        return this.f56440;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m42256() {
        return this.f56441;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            this.f56441 = false;
            interfaceC23586.getLifecycle().mo19834(this);
        }
    }
}
