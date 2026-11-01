package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ܰᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: NAVX */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC15662 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ View f44784;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC4244 f44785;

    /* JADX INFO: renamed from: ᩸ */
    public int f44786 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C12962 f44787;

    public RunnableC15662(C12962 c12962, View view, InterfaceC4244 interfaceC4244) {
        this.f44787 = c12962;
        this.f44784 = view;
        this.f44785 = interfaceC4244;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f44784;
        if (view.isPressed()) {
            int i = this.f44786;
            this.f44786 = i + 1;
            if (i > 0) {
                view.performHapticFeedback(0);
            }
            this.f44787.f36466.f50053.mo15920(view, this.f44785);
            int i2 = this.f44786;
            if (i2 < 50) {
                C7050.m16213(this, (((50 - i2) * 130) / 50) + 20);
            } else {
                C7050.m16213(this, 20L);
            }
        }
    }
}
