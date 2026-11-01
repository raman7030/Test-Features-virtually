package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: l.۟ۗۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6A7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9212 {
    @Deprecated
    public void onDraw(Canvas canvas, C14849 c14849) {
    }

    @Deprecated
    public void onDrawOver(Canvas canvas, C14849 c14849) {
    }

    public void onDraw(Canvas canvas, C14849 c14849, C22897 c22897) {
        onDraw(canvas, c14849);
    }

    public void onDrawOver(Canvas canvas, C14849 c14849, C22897 c22897) {
        onDrawOver(canvas, c14849);
    }

    @Deprecated
    public void getItemOffsets(Rect rect, int i, C14849 c14849) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, C14849 c14849, C22897 c22897) {
        getItemOffsets(rect, ((C16190) view.getLayoutParams()).f47660.getLayoutPosition(), c14849);
    }
}
