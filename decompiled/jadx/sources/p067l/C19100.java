package p067l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19100 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f56986 = false;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f56987 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static void m43394(View... viewArr) {
        ArrayList arrayList;
        View viewM44925;
        C19100 c19100 = new C19100();
        if (viewArr.length == 0) {
            return;
        }
        int length = viewArr.length;
        int i = 0;
        while (true) {
            arrayList = c19100.f56987;
            if (i >= length) {
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                arrayList.add(new C19771(view, new RunnableC4782(2, c19100)));
            }
            i++;
        }
        if (arrayList.isEmpty() || (viewM44925 = ((C19771) arrayList.get(0)).m44925()) == null) {
            return;
        }
        viewM44925.post(new RunnableC4782(2, c19100));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43393(C19100 c19100) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = c19100.f56987;
        if (c19100.f56986) {
            return;
        }
        c19100.f56986 = true;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C19771 c19771 = (C19771) it.next();
                if (!c19771.m44926()) {
                    c19771.m44924();
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int iM43392 = c19100.m43392();
            if (iM43392 > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View viewM44925 = ((C19771) it2.next()).m44925();
                    if (viewM44925 != null && (layoutParams = viewM44925.getLayoutParams()) != null && layoutParams.width != iM43392) {
                        layoutParams.width = iM43392;
                        viewM44925.setLayoutParams(layoutParams);
                    }
                }
            }
        } finally {
            c19100.f56986 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m43392() {
        ArrayList arrayList = this.f56987;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View viewM44925 = ((C19771) it.next()).m44925();
                if (viewM44925 != null) {
                    arrayList2.add(new C13066(viewM44925));
                    ViewGroup.LayoutParams layoutParams = viewM44925.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int iMax = 0;
            while (it2.hasNext()) {
                View viewM44926 = ((C19771) it2.next()).m44925();
                if (viewM44926 != null) {
                    viewM44926.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    iMax = Math.max(iMax, viewM44926.getMeasuredWidth());
                }
            }
            return iMax;
        } finally {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C13066) it3.next()).m29912();
            }
        }
    }
}
