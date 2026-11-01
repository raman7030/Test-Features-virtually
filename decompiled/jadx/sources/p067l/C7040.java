package p067l;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X53D */
/* JADX INFO: loaded from: classes2.dex */
public final class C7040 {
    /* JADX INFO: renamed from: ֫ */
    public static void m16183(final C14849 c14849) {
        ViewGroup viewGroup = (ViewGroup) c14849.getParent();
        final View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C1717.m43560(c14849, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        c14849.addOnScrollListener(new C10393(viewFindViewById, viewFindViewById2));
        c14849.post(new Runnable() { // from class: l.ۚ᩸ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C7040.m16179((View) c14849, viewFindViewById, viewFindViewById2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16181(final ListView listView) {
        ViewGroup viewGroup = (ViewGroup) listView.getParent();
        final View viewFindViewById = viewGroup.findViewById(R.id.MT_Protector);
        final View viewFindViewById2 = viewGroup.findViewById(R.id.MT_Protector);
        if (Build.VERSION.SDK_INT >= 23) {
            C1717.m43560(listView, 3, 3);
            if (viewFindViewById != null) {
                viewGroup.removeView(viewFindViewById);
            }
            if (viewFindViewById2 != null) {
                viewGroup.removeView(viewFindViewById2);
                return;
            }
            return;
        }
        listView.setOnScrollListener(new C17097(viewFindViewById, viewFindViewById2));
        listView.post(new Runnable() { // from class: l.֨᩸ۡ
            @Override // java.lang.Runnable
            public final void run() {
                C7040.m16179((View) listView, viewFindViewById, viewFindViewById2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16179(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }
}
