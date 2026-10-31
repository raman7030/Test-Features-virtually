package l;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* JADX INFO: renamed from: l.ۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95QI */
/* JADX INFO: loaded from: classes3.dex */
public final class C10261 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25992(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m25994(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25991(View view) {
        view.cancelDragAndDrop();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25993(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m25996(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m25995(View view) {
        view.dispatchFinishTemporaryDetach();
    }
}
