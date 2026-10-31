package l;

import android.view.View;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۘۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1Y5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3737 implements Runnable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11808;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11809;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f11810;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11811;

    public /* synthetic */ RunnableC3737(Object obj, Object obj2, Object obj3, int i) {
        this.f11810 = i;
        this.f11811 = obj;
        this.f11809 = obj2;
        this.f11808 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11810;
        Object obj = this.f11808;
        Object obj2 = this.f11809;
        Object obj3 = this.f11811;
        switch (i) {
            case 0:
                C0208.m1454((C0208) obj3, (C2450) obj2, (ArrayList) obj);
                break;
            default:
                View view = (View) obj2;
                View view2 = (View) obj;
                int i2 = ViewOnClickListenerC7042.f21692;
                view.setVisibility((((C13132) obj3).canScrollVertically(1) || view.getTop() < view2.getBottom()) ? 0 : 4);
                break;
        }
    }
}
