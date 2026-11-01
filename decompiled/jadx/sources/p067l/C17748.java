package p067l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܺ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17748 extends AbstractC11044 {

    /* JADX INFO: renamed from: ۧ */
    public final Drawable f53007;

    /* JADX INFO: renamed from: ܽ */
    public final Drawable f53008;

    /* JADX INFO: renamed from: ܿ */
    public boolean f53009;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f53010;

    public C17748(C21103 c21103, Drawable drawable, Drawable drawable2) {
        super(c21103);
        this.f53010 = true;
        this.f53007 = drawable;
        this.f53008 = drawable2;
        mo14514();
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ֫ */
    public final void mo14510(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((1.0f - f) * f2 * (this.f53010 ? 153 : 51));
        int i2 = (int) (f * f2 * 153);
        if (i != 0) {
            Drawable drawable = this.f53007;
            drawable.setAlpha(i);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (i2 != 0) {
            Drawable drawable2 = this.f53008;
            drawable2.setAlpha(i2);
            drawable2.setBounds(rect);
            drawable2.draw(canvas);
        }
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo14513() {
        int i = C11715.f32671[this.f30589.f66310.ordinal()];
        if (i == 1 || i == 2) {
            return this.f53010;
        }
        return i == 3 || i == 4;
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo14515() {
        int i = C11715.f32671[this.f30589.f66310.ordinal()];
        if (i == 1 || i == 2) {
            return this.f53010 || this.f53009;
        }
        return i == 3 || i == 4;
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ܿ */
    public final void mo14514() {
        C21103 c21103 = this.f30589;
        this.f53007.setColorFilter(c21103.f66311);
        this.f53008.setColorFilter(c21103.f66311);
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ۧ */
    public final int mo14512() {
        return Math.max(this.f53007.getIntrinsicWidth(), this.f53008.getIntrinsicWidth());
    }

    @Override // p067l.AbstractC11044
    /* JADX INFO: renamed from: ֫ */
    public final int mo14509() {
        return Math.max(this.f53007.getIntrinsicHeight(), this.f53008.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40332(boolean z) {
        this.f53010 = z;
        this.f30589.invalidate();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m40333() {
        this.f53009 = true;
    }
}
