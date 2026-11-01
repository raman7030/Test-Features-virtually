package p067l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5661 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9684 f13774;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ArrayList f13775;

    public RunnableC5661(C9684 c9684, ArrayList arrayList) {
        this.f13774 = c9684;
        this.f13775 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f13775;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C9684 c9684 = this.f13774;
            if (zHasNext) {
                AbstractC5462 abstractC5462 = (AbstractC5462) it.next();
                c9684.getClass();
                View view = abstractC5462.itemView;
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c9684.f26685.add(abstractC5462);
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(c9684.m53114()).setListener(new C14378(view, viewPropertyAnimatorAnimate, c9684, abstractC5462)).start();
            } else {
                arrayList.clear();
                c9684.f26691.remove(arrayList);
                return;
            }
        }
    }
}
