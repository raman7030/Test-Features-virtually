package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 9649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8413 extends Drawable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15467 f25766;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C8413(C15467 c15467) {
        this.f25766 = c15467;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C15467 c15467 = this.f25766;
        if (c15467.f47330) {
            Drawable drawable = c15467.f47333;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = c15467.f47338;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = c15467.f47332;
        if (drawable3 == null || !c15467.f47335) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C15467 c15467 = this.f25766;
        boolean z = c15467.f47330;
        Drawable drawable = c15467.f47338;
        if (z) {
            if (c15467.f47333 != null) {
                drawable.getOutline(outline);
            }
        } else if (drawable != null) {
            drawable.getOutline(outline);
        }
    }
}
