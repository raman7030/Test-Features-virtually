package p067l;

import bin.p000mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩻۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24771 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f78402;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f78403;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f78404;

    public /* synthetic */ RunnableC24771(int i, Object obj, Object obj2) {
        this.f78403 = i;
        this.f78404 = obj;
        this.f78402 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f78403) {
            case 0:
                AbstractC5996.m13449((AbstractC5996) this.f78404, (AbstractActivityC5549) this.f78402);
                break;
            case 1:
                C2753.m4299((C2753) this.f78404, (Exception) this.f78402);
                break;
            default:
                ((AsyncTask) this.f78404).lambda$handleError$2((Exception) this.f78402);
                break;
        }
    }
}
