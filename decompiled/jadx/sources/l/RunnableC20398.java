package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20398 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f65830;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f65831;

    public RunnableC20398(C7697 c7697, ArrayList arrayList) {
        this.f65830 = c7697;
        this.f65831 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f65831;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C7697 c7697 = this.f65830;
            if (zHasNext) {
                C14046 c14046 = (C14046) it.next();
                AbstractC3255 abstractC3255 = c14046.f42455;
                int i = c14046.f42453;
                int i2 = c14046.f42454;
                int i3 = c14046.f42457;
                int i4 = c14046.f42456;
                c7697.getClass();
                View view = abstractC3255.itemView;
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    view.animate().translationX(0.0f);
                }
                if (i6 != 0) {
                    view.animate().translationY(0.0f);
                }
                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                c7697.f23775.add(abstractC3255);
                viewPropertyAnimatorAnimate.setDuration(c7697.m50790()).setListener(new C10520(c7697, abstractC3255, i5, view, i6, viewPropertyAnimatorAnimate)).start();
            } else {
                arrayList.clear();
                c7697.f23769.remove(arrayList);
                return;
            }
        }
    }
}
