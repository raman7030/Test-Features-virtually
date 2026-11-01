package p067l;

/* JADX INFO: renamed from: l.ᩴܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: S1KE */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20286 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f62682;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC24133 f62683;

    /* JADX INFO: renamed from: ᩹ */
    public final C22103 f62684;

    public RunnableC20286(C22103 c22103, EnumC24133 enumC24133) {
        C13045.m29867(c22103, "registry");
        C13045.m29867(enumC24133, "event");
        this.f62684 = c22103;
        this.f62683 = enumC24133;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f62682) {
            return;
        }
        this.f62684.m49766(this.f62683);
        this.f62682 = true;
    }
}
