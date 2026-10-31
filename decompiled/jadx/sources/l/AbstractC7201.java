package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.۟ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7201 {
    @Deprecated
    public void onDraw(Canvas canvas, C13132 c13132) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, C13132 c13132) {
    }

    public void onDraw(Canvas canvas, C13132 c13132, C21600 c21600) {
        onDraw(canvas, c13132);
    }

    public void onDrawOver(Canvas canvas, C13132 c13132, C21600 c21600) {
        onDrawOver(canvas, c13132);
    }

    @Deprecated
    public void getItemOffsets(Rect rect, int i, C13132 c13132) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, C13132 c13132, C21600 c21600) {
        getItemOffsets(rect, ((C14543) view.getLayoutParams()).f44554.getLayoutPosition(), c13132);
    }
}
