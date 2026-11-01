package p067l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢ۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC11366 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C10695 f31737;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f31738 = false;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView f31739;

    public RunnableC11366(C10695 c10695) {
        this.f31737 = c10695;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10695 c10695 = this.f31737;
        C5134 c5134 = c10695.f29635;
        c10695.f29638 = c5134.m10958(c10695.f29639);
        String strM10965 = c5134.m10965();
        synchronized (C6001.f15039) {
            C6001.f15039.m6786(strM10965, this.f31737.f29638);
        }
        C7050.m16212(new Runnable() { // from class: l.᩷۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC11366 runnableC11366 = this.f69921;
                C10695 c10696 = runnableC11366.f31737;
                C5134 c5135 = c10696.f29635;
                ImageView imageView = runnableC11366.f31739;
                if (imageView.getTag() == c5135) {
                    imageView.setImageDrawable(c10696.f29638);
                }
            }
        });
    }
}
