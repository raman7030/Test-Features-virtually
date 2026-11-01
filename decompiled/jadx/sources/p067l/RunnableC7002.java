package p067l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7002 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9684 f18246;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ArrayList f18247;

    public RunnableC7002(C9684 c9684, ArrayList arrayList) {
        this.f18246 = c9684;
        this.f18247 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f18247;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C9684 c9684 = this.f18246;
            if (!zHasNext) {
                arrayList.clear();
                c9684.f26686.remove(arrayList);
                return;
            }
            C24436 c24436 = (C24436) it.next();
            ArrayList arrayList2 = c9684.f26687;
            AbstractC5462 abstractC5462 = c24436.f77370;
            View view = abstractC5462 == null ? null : abstractC5462.itemView;
            AbstractC5462 abstractC5463 = c24436.f77368;
            View view2 = abstractC5463 != null ? abstractC5463.itemView : null;
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c9684.m53117());
                arrayList2.add(c24436.f77370);
                duration.translationX(c24436.f77369 - c24436.f77365);
                duration.translationY(c24436.f77367 - c24436.f77366);
                duration.alpha(0.0f).setListener(new C8343(c9684, c24436, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                arrayList2.add(c24436.f77368);
                viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(c9684.m53117()).alpha(1.0f).setListener(new C13708(c9684, c24436, viewPropertyAnimatorAnimate, view2)).start();
            }
        }
    }
}
