package l;

/* JADX INFO: renamed from: l.ۤۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10086 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f30376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5852 f30377;

    public RunnableC10086(C5852 c5852) {
        this.f30377 = c5852;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25349(float f, float f2, boolean z) {
        if (this.f30376) {
            return;
        }
        this.f30376 = true;
        this.f30377.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30376 = false;
        int i = C5852.f17950;
        this.f30377.getClass();
    }
}
