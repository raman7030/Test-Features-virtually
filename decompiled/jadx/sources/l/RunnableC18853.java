package l;

/* JADX INFO: renamed from: l.ᩴܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18853 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f59453;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC22901 f59454;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C20765 f59455;

    public RunnableC18853(C20765 c20765, EnumC22901 enumC22901) {
        C11233.m27805(c20765, "registry");
        C11233.m27805(enumC22901, "event");
        this.f59455 = c20765;
        this.f59454 = enumC22901;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f59453) {
            return;
        }
        this.f59455.m47438(this.f59454);
        this.f59453 = true;
    }
}
