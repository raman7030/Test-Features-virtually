package l;

import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.᩻۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23572 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75656;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75657;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75658;

    public /* synthetic */ RunnableC23572(int i, Object obj, Object obj2) {
        this.f75657 = i;
        this.f75658 = obj;
        this.f75656 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75657) {
            case 0:
                AbstractC3817.m11513((AbstractC3817) this.f75658, (AbstractActivityC3346) this.f75656);
                break;
            case 1:
                C0405.m1907((C0405) this.f75658, (Exception) this.f75656);
                break;
            default:
                ((AsyncTask) this.f75658).lambda$handleError$2((Exception) this.f75656);
                break;
        }
    }
}
