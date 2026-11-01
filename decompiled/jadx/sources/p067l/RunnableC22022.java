package p067l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩷ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC22022 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f69315;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f69316;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f69317;

    public /* synthetic */ RunnableC22022(int i, Object obj, Object obj2) {
        this.f69316 = i;
        this.f69317 = obj;
        this.f69315 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f69316) {
            case 0:
                ServiceC11293.m26231((ServiceC11293) this.f69317, (Intent) this.f69315);
                break;
            default:
                C2753.m4295((C2753) this.f69317, (C3424) this.f69315);
                break;
        }
    }
}
