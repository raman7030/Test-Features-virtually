package l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ListView;
import bin.mt.plus.R;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: A513 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19871 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21282 m45699(View view) {
        Context context = view.getContext();
        ViewParent parent = view.getParent();
        if (parent instanceof C8788) {
            C8788 c8788 = (C8788) parent;
            context = c8788.getContext();
            int iM22681 = c8788.m22681();
            if (iM22681 != 0) {
                context = new C12729(context, iM22681);
            }
        }
        return new C21282(context, view, 8388611, R.attr.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45700(C21282 c21282, String str, View view) {
        C12937.m31443(c21282.m48304(), str);
        C18291 c18291 = c21282.f68635;
        C18997.m43839(c18291);
        ListView listViewMo8540 = !c18291.m42639() ? null : c18291.m42638().mo8540();
        if (listViewMo8540 == null || m45703(listViewMo8540, view)) {
            return;
        }
        listViewMo8540.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC21987(listViewMo8540, view));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m45703(ListView listView, View view) {
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
                    frameLayout.setForeground(C21311.m48345(frameLayout.getContext(), R.drawable.MT_Protector));
                    frameLayout.setForegroundGravity(87);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18291 m45698(C21282 c21282) {
        return c21282.f68635;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m45704(C21282 c21282) {
        try {
            AbstractC11236 abstractC11236M42638 = c21282.f68635.m42638();
            Field declaredField = Class.forName("l.ۖ᩷").getDeclaredField("mAdapter");
            declaredField.setAccessible(true);
            C22110 c22110 = (C22110) declaredField.get(abstractC11236M42638);
            Field declaredField2 = C22110.class.getDeclaredField("ۗ");
            declaredField2.setAccessible(true);
            declaredField2.setInt(c22110, R.layout.MT_Protector);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45702(C21282 c21282) {
        try {
            C18997.m43838(c21282.f68635.m42638());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ListView m45697(C0113 c0113) {
        return c0113.f28147;
    }
}
