package p067l;

/* JADX INFO: renamed from: l.ۤۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11954 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f33336;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C7930 f33337;

    public RunnableC11954(C7930 c7930) {
        this.f33337 = c7930;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27368(float f, float f2, boolean z) {
        if (this.f33336) {
            return;
        }
        this.f33336 = true;
        this.f33337.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f33336 = false;
        int i = C7930.f20801;
        this.f33337.getClass();
    }
}
