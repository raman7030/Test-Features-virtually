package l;

/* JADX INFO: renamed from: l.ܺۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15882 implements InterfaceC23206 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15176 f49065;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49066;

    public C15882(C15176 c15176, boolean z) {
        this.f49065 = c15176;
        this.f49066 = z;
    }

    @Override // l.InterfaceC23206
    /* JADX INFO: renamed from: ֫ */
    public final void mo8486(String str) {
        C15176 c15176 = this.f49065;
        c15176.m35892();
        if (c15176.m35898()) {
            C15176.m35883(c15176, str, this.f49066);
        }
    }

    @Override // l.InterfaceC23206
    public final void onCanceled() {
        this.f49065.m35892();
    }
}
