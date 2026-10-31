package l;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C18342 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f56999 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f57000 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42765(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42766(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        WeakHashMap weakHashMap = f57000;
        if (actionMasked == 0) {
            weakHashMap.put(view, new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            weakHashMap.remove(view);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42767(View view, C21282 c21282) {
        Point point = (Point) f57000.remove(view);
        int width = point != null ? point.x : view.getWidth() / 2;
        if (width < 0 || width > view.getWidth()) {
            width = view.getWidth() / 2;
        }
        c21282.m48300(width < view.getWidth() / 2 ? 3 : 5);
        c21282.m48305();
    }
}
