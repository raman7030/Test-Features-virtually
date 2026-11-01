package p067l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.ۡ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8GM */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC10691 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f29603;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f29604;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f29605;

    public /* synthetic */ RunnableC10691(int i, Object obj, Object obj2) {
        this.f29604 = i;
        this.f29605 = obj;
        this.f29603 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29604) {
            case 0:
                C20079.m45458((C20079) this.f29605, (Bitmap) this.f29603);
                break;
            default:
                C15834 c15834 = (C15834) this.f29605;
                C11813 c11813 = (C11813) this.f29603;
                C4968 c4968 = (C4968) c15834.f45864;
                c4968.f11316 = C4848.m10281(c11813, c4968.f11316);
                break;
        }
    }
}
