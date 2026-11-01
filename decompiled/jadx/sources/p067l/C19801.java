package p067l;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ᩳ᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EO */
/* JADX INFO: loaded from: classes4.dex */
public final class C19801 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f60217 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final WeakHashMap f60218 = new WeakHashMap();

    /* JADX INFO: renamed from: ֫ */
    public static void m45027(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC18459());
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m45028(View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        WeakHashMap weakHashMap = f60218;
        if (actionMasked == 0) {
            weakHashMap.put(view, new Point(Math.round(motionEvent.getX()), Math.round(motionEvent.getY())));
        } else if (actionMasked == 1 || actionMasked == 3) {
            weakHashMap.remove(view);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45029(View view, C1898 c1898) {
        Point point = (Point) f60218.remove(view);
        int width = point != null ? point.x : view.getWidth() / 2;
        if (width < 0 || width > view.getWidth()) {
            width = view.getWidth() / 2;
        }
        c1898.m50634(width < view.getWidth() / 2 ? 3 : 5);
        c1898.m50639();
    }
}
