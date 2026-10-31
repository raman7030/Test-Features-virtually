package l;

/* JADX INFO: renamed from: l.ܺ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16199 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5617 f49888;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f49889;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f49890;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo8635(int i, Thread thread, long j, String str, String str2, Throwable th);

    public AbstractC16199() {
        C5617 c5617 = C5617.f17383;
        String str = C19023.f59932;
        this.f49889 = 60;
        this.f49890 = true;
        this.f49888 = c5617;
        this.f49889 = 60;
        this.f49890 = true;
        this.f49888 = c5617;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38155(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (this.f49890 && i == (this.f49889 & i)) {
            mo8635(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5617 m38154() {
        return this.f49888;
    }
}
