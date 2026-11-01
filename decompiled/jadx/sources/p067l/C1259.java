package p067l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩷ */
/* JADX INFO: compiled from: 9649 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1259 extends Drawable {

    /* JADX INFO: renamed from: ֫ */
    public final C1609 f28680;

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

    public C1259(C1609 c1609) {
        this.f28680 = c1609;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C1609 c1609 = this.f28680;
        if (c1609.f50461) {
            Drawable drawable = c1609.f50464;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = c1609.f50469;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = c1609.f50463;
        if (drawable3 == null || !c1609.f50466) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        C1609 c1609 = this.f28680;
        boolean z = c1609.f50461;
        Drawable drawable = c1609.f50469;
        if (z) {
            if (c1609.f50464 != null) {
                drawable.getOutline(outline);
            }
        } else if (drawable != null) {
            drawable.getOutline(outline);
        }
    }
}
