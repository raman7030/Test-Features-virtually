package l;

import android.content.Intent;

/* JADX INFO: renamed from: l.᩷ۚ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A9T8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20679 implements Runnable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66634;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66635;

    public /* synthetic */ RunnableC20679(int i, Object obj, Object obj2) {
        this.f66634 = i;
        this.f66635 = obj;
        this.f66633 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66634) {
            case 0:
                ServiceC9390.m24221((ServiceC9390) this.f66635, (Intent) this.f66633);
                break;
            default:
                C0405.m1903((C0405) this.f66635, (C1111) this.f66633);
                break;
        }
    }
}
