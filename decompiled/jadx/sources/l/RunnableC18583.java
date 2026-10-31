package l;

/* JADX INFO: renamed from: l.ᩴۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E50U */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18583 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0237 f57644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3060 f57645;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19289 f57646;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5882 f57647;

    public RunnableC18583(C19289 c19289, C0237 c0237, C5882 c5882, C3060 c3060) {
        this.f57646 = c19289;
        this.f57644 = c0237;
        this.f57647 = c5882;
        this.f57645 = c3060;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC5177 viewOnKeyListenerC5177 = this.f57646.f60695;
        C0237 c0237 = this.f57644;
        if (c0237 != null) {
            viewOnKeyListenerC5177.f16198 = true;
            c0237.f1508.close(false);
            viewOnKeyListenerC5177.f16198 = false;
        }
        C5882 c5882 = this.f57647;
        if (c5882.isEnabled() && c5882.hasSubMenu()) {
            this.f57645.performItemAction(c5882, 4);
        }
    }
}
