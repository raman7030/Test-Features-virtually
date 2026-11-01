package p067l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21755 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9684 f68506;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ArrayList f68507;

    public RunnableC21755(C9684 c9684, ArrayList arrayList) {
        this.f68506 = c9684;
        this.f68507 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f68507;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C9684 c9684 = this.f68506;
            if (zHasNext) {
                C15718 c15718 = (C15718) it.next();
                AbstractC5462 abstractC5462 = c15718.f45538;
                int i = c15718.f45536;
                int i2 = c15718.f45537;
                int i3 = c15718.f45540;
                int i4 = c15718.f45539;
                c9684.getClass();
                View view = abstractC5462.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c9684.f26688.add(abstractC5462);
                viewPropertyAnimatorAnimate.setDuration(c9684.m53116()).setListener(new C12367(c9684, abstractC5462, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            } else {
                arrayList.clear();
                c9684.f26682.remove(arrayList);
                return;
            }
        }
    }
}
