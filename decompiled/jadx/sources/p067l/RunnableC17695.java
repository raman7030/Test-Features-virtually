package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܺᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6SA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17695 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Serializable f52856;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f52857;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f52858;

    public /* synthetic */ RunnableC17695(Object obj, Serializable serializable, int i) {
        this.f52857 = i;
        this.f52858 = obj;
        this.f52856 = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f52857) {
            case 0:
                C21050.m47471((C21050) this.f52858, (Throwable) this.f52856);
                break;
            default:
                C3773.m7356((C3773) this.f52858, (String) this.f52856);
                break;
        }
    }
}
