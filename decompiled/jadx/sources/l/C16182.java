package l;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܺ᩷ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y169 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16182 extends AbstractC9128 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f49841;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Drawable f49842;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49843;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f49844;

    public C16182(C19712 c19712, Drawable drawable, Drawable drawable2) {
        super(c19712);
        this.f49844 = true;
        this.f49841 = drawable;
        this.f49842 = drawable2;
        mo12638();
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ֫ */
    public final void mo12634(Canvas canvas, Rect rect, float f, float f2) {
        int i = (int) ((1.0f - f) * f2 * (this.f49844 ? 153 : 51));
        int i2 = (int) (f * f2 * 153);
        if (i != 0) {
            Drawable drawable = this.f49841;
            drawable.setAlpha(i);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
        if (i2 != 0) {
            Drawable drawable2 = this.f49842;
            drawable2.setAlpha(i2);
            drawable2.setBounds(rect);
            drawable2.draw(canvas);
        }
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo12637() {
        int i = C9834.f29718[this.f27649.f63679.ordinal()];
        if (i == 1 || i == 2) {
            return this.f49844;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo12639() {
        int i = C9834.f29718[this.f27649.f63679.ordinal()];
        if (i == 1 || i == 2) {
            return this.f49844 || this.f49843;
        }
        return i == 3 || i == 4;
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ܿ */
    public final void mo12638() {
        C19712 c19712 = this.f27649;
        this.f49841.setColorFilter(c19712.f63680);
        this.f49842.setColorFilter(c19712.f63680);
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ۧ */
    public final int mo12636() {
        return Math.max(this.f49841.getIntrinsicWidth(), this.f49842.getIntrinsicWidth());
    }

    @Override // l.AbstractC9128
    /* JADX INFO: renamed from: ֫ */
    public final int mo12633() {
        return Math.max(this.f49841.getIntrinsicHeight(), this.f49842.getIntrinsicHeight());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38120(boolean z) {
        this.f49844 = z;
        this.f27649.invalidate();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m38121() {
        this.f49843 = true;
    }
}
