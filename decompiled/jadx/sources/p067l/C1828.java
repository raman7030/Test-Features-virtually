package p067l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import bin.p000mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩶ۖ */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1828 {
    /* JADX INFO: renamed from: ֫ */
    public static C1898 m48010(View view) {
        Context context = view.getContext();
        ViewParent parent = view.getParent();
        if (parent instanceof C1278) {
            C1278 c1278 = (C1278) parent;
            context = c1278.getContext();
            int iM24651 = c1278.m24651();
            if (iM24651 != 0) {
                context = new C1473(context, iM24651);
            }
        }
        return new C1898(context, view, 8388611, R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48011(C1898 c1898, String str, View view) {
        C1484.m33530(c1898.m50638(), str);
        C1749 c1749 = c1898.f71327;
        C1784.m46107(c1749);
        ListView listViewMo10603 = !c1749.m44899() ? null : c1749.m44898().mo10603();
        if (listViewMo10603 == null || m48014(listViewMo10603, view)) {
            return;
        }
        listViewMo10603.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC1933(listViewMo10603, view));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48014(ListView listView, View view) {
        if (listView.getFirstVisiblePosition() == 0) {
            View childAt = listView.getChildAt(0);
            View viewFindViewById = childAt == null ? null : childAt.findViewById(android.R.id.title);
            if (viewFindViewById != null) {
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof FrameLayout) {
                    FrameLayout frameLayout = (FrameLayout) parent;
                    ViewParent parent2 = view.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    frameLayout.removeAllViews();
                    frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    frameLayout.setForeground(C22622.m50680(frameLayout.getContext(), R.drawable.MT_Protector));
                    frameLayout.setForegroundGravity(87);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1749 m48009(C1898 c1898) {
        return c1898.f71327;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m48015(C1898 c1898) {
        try {
            AbstractC1399 abstractC1399M44898 = c1898.f71327.m44898();
            Field declaredField = Class.forName("l.ۖ᩷").getDeclaredField("mAdapter");
            declaredField.setAccessible(true);
            C1939 c1939 = (C1939) declaredField.get(abstractC1399M44898);
            Field declaredField2 = C1939.class.getDeclaredField("ۗ");
            declaredField2.setAccessible(true);
            declaredField2.setInt(c1939, R.layout.MT_Protector);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m48013(C1898 c1898) {
        try {
            C1784.m46106(c1898.f71327.m44898());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static ListView m48008(C0848 c0848) {
        return c0848.f31096;
    }
}
