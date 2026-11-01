package p067l;

import android.text.method.TextKeyListener;

/* JADX INFO: renamed from: l.֫ۛᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3931 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f8522;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f8523;

    public /* synthetic */ RunnableC3931(int i, Object obj) {
        this.f8522 = i;
        this.f8523 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8522;
        Object obj = this.f8523;
        switch (i) {
            case 0:
                TextKeyListener textKeyListener = C14146.f40186;
                C7050.m16212(new RunnableC19354((C14146) obj, 0));
                break;
            default:
                ((C2628) obj).mo3996();
                break;
        }
    }
}
