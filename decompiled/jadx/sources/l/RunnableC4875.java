package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4875 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f15415;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f15416;

    public RunnableC4875(C7697 c7697, ArrayList arrayList) {
        this.f15415 = c7697;
        this.f15416 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f15416;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C7697 c7697 = this.f15415;
            if (!zHasNext) {
                arrayList.clear();
                c7697.f23773.remove(arrayList);
                return;
            }
            C23219 c23219 = (C23219) it.next();
            ArrayList arrayList2 = c7697.f23774;
            AbstractC3255 abstractC3255 = c23219.f74627;
            View view = abstractC3255 == null ? null : abstractC3255.itemView;
            AbstractC3255 abstractC3256 = c23219.f74625;
            View view2 = abstractC3256 != null ? abstractC3256.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c7697.m50791());
                arrayList2.add(c23219.f74627);
                duration.translationX(c23219.f74626 - c23219.f74622);
                duration.translationY(c23219.f74624 - c23219.f74623);
                duration.alpha(0.0f).setListener(new C6286(c7697, c23219, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(c23219.f74625);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c7697.m50791()).alpha(1.0f).setListener(new C11931(c7697, c23219, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
