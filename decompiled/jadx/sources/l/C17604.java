package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿ᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P7RC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17604 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53792 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53793 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41148(View... viewArr) {
        ArrayList arrayList;
        View viewM42664;
        C17604 c17604 = new C17604();
        if (viewArr.length == 0) {
            return;
        }
        int length = viewArr.length;
        int i = 0;
        while (true) {
            arrayList = c17604.f53793;
            if (i >= length) {
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                arrayList.add(new C18310(view, new RunnableC2539(2, c17604)));
            }
            i++;
        }
        if (arrayList.isEmpty() || (viewM42664 = ((C18310) arrayList.get(0)).m42664()) == null) {
            return;
        }
        viewM42664.post(new RunnableC2539(2, c17604));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41147(C17604 c17604) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = c17604.f53793;
        if (c17604.f53792) {
            return;
        }
        c17604.f53792 = true;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18310 c18310 = (C18310) it.next();
                if (!c18310.m42665()) {
                    c18310.m42663();
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int iM41146 = c17604.m41146();
            if (iM41146 > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View viewM42664 = ((C18310) it2.next()).m42664();
                    if (viewM42664 != null && (layoutParams = viewM42664.getLayoutParams()) != null && layoutParams.width != iM41146) {
                        layoutParams.width = iM41146;
                        viewM42664.setLayoutParams(layoutParams);
                    }
                }
            }
        } finally {
            c17604.f53792 = false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41146() {
        ArrayList arrayList = this.f53793;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View viewM42664 = ((C18310) it.next()).m42664();
                if (viewM42664 != null) {
                    arrayList2.add(new C11255(viewM42664));
                    ViewGroup.LayoutParams layoutParams = viewM42664.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int iMax = 0;
            while (it2.hasNext()) {
                View viewM42665 = ((C18310) it2.next()).m42664();
                if (viewM42665 != null) {
                    viewM42665.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    iMax = Math.max(iMax, viewM42665.getMeasuredWidth());
                }
            }
            return iMax;
        } finally {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C11255) it3.next()).m27851();
            }
        }
    }
}
