package p067l;

/* JADX INFO: renamed from: l.ܺ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17764 {

    /* JADX INFO: renamed from: ᩶ */
    public C7707 f53054;

    /* JADX INFO: renamed from: ᩸ */
    public volatile int f53055;

    /* JADX INFO: renamed from: ᩹ */
    public volatile boolean f53056;

    /* JADX INFO: renamed from: ۧ */
    public abstract void mo10695(int i, Thread thread, long j, String str, String str2, Throwable th);

    public AbstractC17764() {
        C7707 c7707 = C7707.f20227;
        String str = C20448.f63161;
        this.f53055 = 60;
        this.f53056 = true;
        this.f53054 = c7707;
        this.f53055 = 60;
        this.f53056 = true;
        this.f53054 = c7707;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40367(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (this.f53056 && i == (this.f53055 & i)) {
            mo10695(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7707 m40366() {
        return this.f53054;
    }
}
