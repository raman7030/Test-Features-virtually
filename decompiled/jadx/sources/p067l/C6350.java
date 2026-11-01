package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۘ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6350 extends AbstractC11044 {

    /* JADX INFO: renamed from: ۧ */
    public final Drawable f16454;

    /* JADX INFO: renamed from: ܽ */
    public boolean f16455;

    /* JADX INFO: renamed from: ᩳ */
    public final int f16456;

    public C6350(C21103 c21103, Drawable drawable, int i) {
        super(c21103);
        this.f16455 = true;
        this.f16454 = drawable;
        this.f16456 = i;
        mo14514();
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ֫ */
    public final void mo14510(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((this.f16455 ? 153 : 51) * f2);
        Drawable drawable = this.f16454;
        drawable.setAlpha(i);
        drawable.setBounds(rect);
        float f3 = this.f16456;
        if (f3 != 0.0f) {
            C21103 c21103 = this.f30589;
            if (c21103.f66310 == EnumC20432.STATE_1_2) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = (float) Math.sin(f * 1.5707964f);
            } else if (c21103.f66310 == EnumC20432.STATE_2_1) {
                if (f < 0.0f) {
                    f = 0.0f;
                } else if (f > 1.0f) {
                    f = 1.0f;
                }
                f = 1.0f - ((float) Math.cos(f * 1.5707964f));
            }
            f3 *= f;
        }
        float f4 = (rect.left + rect.right) / 2.0f;
        float f5 = (rect.top + rect.bottom) / 2.0f;
        canvas.rotate(f3, f4, f5);
        drawable.draw(canvas);
        canvas.rotate(-f3, f4, f5);
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14513() {
        return this.f16455;
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo14515() {
        return this.f16455;
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ܿ */
    public final void mo14514() {
        this.f16454.setColorFilter(this.f30589.f66311);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14511(boolean z) {
        this.f16455 = z;
        this.f30589.invalidate();
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ۧ */
    public final int mo14512() {
        return this.f16454.getIntrinsicWidth();
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ֫ */
    public final int mo14509() {
        return this.f16454.getIntrinsicHeight();
    }
}
