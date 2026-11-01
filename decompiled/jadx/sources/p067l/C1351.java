package p067l;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: l.ۤۨ */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C1351 {
    /* JADX INFO: renamed from: ֫ */
    public static void m28014(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28016(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28013(View view) {
        view.cancelDragAndDrop();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28015(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m28018(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28017(View view) {
        view.dispatchFinishTemporaryDetach();
    }
}
