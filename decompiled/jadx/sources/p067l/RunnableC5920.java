package p067l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5920 implements Runnable {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Object f14615;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Object f14616;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f14617;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f14618;

    public /* synthetic */ RunnableC5920(Object obj, Object obj2, Object obj3, int i) {
        this.f14617 = i;
        this.f14618 = obj;
        this.f14616 = obj2;
        this.f14615 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f14617;
        Object obj = this.f14615;
        Object obj2 = this.f14616;
        Object obj3 = this.f14618;
        switch (i) {
            case 0:
                C2566.m3867((C2566) obj3, (C4697) obj2, (ArrayList) obj);
                break;
            default:
                View view = (View) obj2;
                View view2 = (View) obj;
                int i2 = ViewOnClickListenerC9062.f24574;
                view.setVisibility((((C14849) obj3).canScrollVertically(1) || view.getTop() < view2.getBottom()) ? 0 : 4);
                break;
        }
    }
}
