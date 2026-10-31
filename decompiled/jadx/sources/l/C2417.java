package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5WO */
/* JADX INFO: loaded from: classes2.dex */
public final class C2417 extends C6650 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f7694;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Drawable f7695;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f7696;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f7697;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15821 f7698;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ColorStateList f7699;

    public C2417(C15821 c15821) {
        super(c15821);
        this.f7699 = null;
        this.f7694 = null;
        this.f7697 = false;
        this.f7696 = false;
        this.f7698 = c15821;
    }

    @Override // l.C6650
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo7844(AttributeSet attributeSet, int i) {
        super.mo7844(attributeSet, i);
        C15821 c15821 = this.f7698;
        Context context = c15821.getContext();
        int[] iArr = C3390.f10703;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(c15821, c15821.getContext(), iArr, attributeSet, c22733M50796.m50810(), i);
        Drawable drawableM50812 = c22733M50796.m50812(0);
        if (drawableM50812 != null) {
            c15821.setThumb(drawableM50812);
        }
        Drawable drawableM50815 = c22733M50796.m50815(1);
        Drawable drawable = this.f7695;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f7695 = drawableM50815;
        if (drawableM50815 != null) {
            drawableM50815.setCallback(c15821);
            C8184.m21681(drawableM50815, c15821.getLayoutDirection());
            if (drawableM50815.isStateful()) {
                drawableM50815.setState(c15821.getDrawableState());
            }
            m7842();
        }
        c15821.invalidate();
        if (c22733M50796.m50802(3)) {
            this.f7694 = C15320.m36346(c22733M50796.m50809(3, -1), this.f7694);
            this.f7696 = true;
        }
        if (c22733M50796.m50802(2)) {
            this.f7699 = c22733M50796.m50804(2);
            this.f7697 = true;
        }
        c22733M50796.m50813();
        m7842();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m7842() {
        Drawable drawable = this.f7695;
        if (drawable != null) {
            if (this.f7697 || this.f7696) {
                Drawable drawableM21684 = C8184.m21684(drawable.mutate());
                this.f7695 = drawableM21684;
                if (this.f7697) {
                    C8184.m21676(drawableM21684, this.f7699);
                }
                if (this.f7696) {
                    C8184.m21679(this.f7695, this.f7694);
                }
                if (this.f7695.isStateful()) {
                    this.f7695.setState(this.f7698.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m7846() {
        Drawable drawable = this.f7695;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7845() {
        Drawable drawable = this.f7695;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C15821 c15821 = this.f7698;
        if (drawable.setState(c15821.getDrawableState())) {
            c15821.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7843(Canvas canvas) {
        if (this.f7695 != null) {
            C15821 c15821 = this.f7698;
            int max = c15821.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f7695.getIntrinsicWidth();
                int intrinsicHeight = this.f7695.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f7695.setBounds(-i, -i2, i, i2);
                float width = ((c15821.getWidth() - c15821.getPaddingLeft()) - c15821.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c15821.getPaddingLeft(), c15821.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f7695.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
