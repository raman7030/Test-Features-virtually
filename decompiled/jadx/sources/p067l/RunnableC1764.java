package p067l;

/* JADX INFO: renamed from: l.ᩴۜ */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC1764 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C0854 f60867;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C0994 f60868;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1799 f60869;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1134 f60870;

    public RunnableC1764(C1799 c1799, C0854 c0854, C1134 c1134, C0994 c0994) {
        this.f60869 = c1799;
        this.f60867 = c0854;
        this.f60870 = c1134;
        this.f60868 = c0994;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC1099 viewOnKeyListenerC1099 = this.f60869.f63925;
        C0854 c0854 = this.f60867;
        if (c0854 != null) {
            viewOnKeyListenerC1099.f19039 = true;
            c0854.f4286.close(false);
            viewOnKeyListenerC1099.f19039 = false;
        }
        C1134 c1134 = this.f60870;
        if (c1134.isEnabled() && c1134.hasSubMenu()) {
            this.f60868.performItemAction(c1134, 4);
        }
    }
}
