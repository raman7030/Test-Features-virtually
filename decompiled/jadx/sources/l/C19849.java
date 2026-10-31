package l;

/* JADX INFO: renamed from: l.᩶֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 673L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19849 implements InterfaceC18303 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64115;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f64116;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22670 f64117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64118;

    public C19849(String str, String str2, int i, C22670 c22670) {
        this.f64116 = str;
        this.f64115 = str2;
        this.f64118 = i;
        this.f64117 = c22670;
    }

    @Override // l.InterfaceC18303
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16891 mo4620(int i) {
        return new C21965(i, this.f64116, this.f64115, this.f64118, this.f64117);
    }

    @Override // l.InterfaceC18303
    public final void cancel() {
        this.f64117.m50658();
    }
}
