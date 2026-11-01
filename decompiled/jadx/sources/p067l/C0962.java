package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ۖۡ */
/* JADX INFO: compiled from: C5WO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0962 extends C1172 {

    /* JADX INFO: renamed from: ۜ */
    public PorterDuff.Mode f10485;

    /* JADX INFO: renamed from: ܳ */
    public Drawable f10486;

    /* JADX INFO: renamed from: ܿ */
    public boolean f10487;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f10488;

    /* JADX INFO: renamed from: ᩷ */
    public final C1627 f10489;

    /* JADX INFO: renamed from: ᩻ */
    public ColorStateList f10490;

    public C0962(C1627 c1627) {
        super(c1627);
        this.f10490 = null;
        this.f10485 = null;
        this.f10488 = false;
        this.f10487 = false;
        this.f10489 = c1627;
    }

    @Override // p067l.C1172
    /* JADX INFO: renamed from: ֫ */
    public final void mo9892(AttributeSet attributeSet, int i) {
        super.mo9892(attributeSet, i);
        C1627 c1627 = this.f10489;
        Context context = c1627.getContext();
        int[] iArr = C1010.f13510;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(c1627, c1627.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        Drawable drawableM53145 = c1970M53129.m53145(0);
        if (drawableM53145 != null) {
            c1627.setThumb(drawableM53145);
        }
        Drawable drawableM53148 = c1970M53129.m53148(1);
        Drawable drawable = this.f10486;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f10486 = drawableM53148;
        if (drawableM53148 != null) {
            drawableM53148.setCallback(c1627);
            C1248.m23650(drawableM53148, c1627.getLayoutDirection());
            if (drawableM53148.isStateful()) {
                drawableM53148.setState(c1627.getDrawableState());
            }
            m9890();
        }
        c1627.invalidate();
        if (c1970M53129.m53135(3)) {
            this.f10485 = C1602.m38504(c1970M53129.m53142(3, -1), this.f10485);
            this.f10487 = true;
        }
        if (c1970M53129.m53135(2)) {
            this.f10490 = c1970M53129.m53137(2);
            this.f10488 = true;
        }
        c1970M53129.m53146();
        m9890();
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m9890() {
        Drawable drawable = this.f10486;
        if (drawable != null) {
            if (this.f10488 || this.f10487) {
                Drawable drawableM23653 = C1248.m23653(drawable.mutate());
                this.f10486 = drawableM23653;
                if (this.f10488) {
                    C1248.m23645(drawableM23653, this.f10490);
                }
                if (this.f10487) {
                    C1248.m23648(this.f10486, this.f10485);
                }
                if (this.f10486.isStateful()) {
                    this.f10486.setState(this.f10489.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m9894() {
        Drawable drawable = this.f10486;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m9893() {
        Drawable drawable = this.f10486;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1627 c1627 = this.f10489;
        if (drawable.setState(c1627.getDrawableState())) {
            c1627.invalidateDrawable(drawable);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9891(Canvas canvas) {
        if (this.f10486 != null) {
            C1627 c1627 = this.f10489;
            int max = c1627.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f10486.getIntrinsicWidth();
                int intrinsicHeight = this.f10486.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f10486.setBounds(-i, -i2, i, i2);
                float width = ((c1627.getWidth() - c1627.getPaddingLeft()) - c1627.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c1627.getPaddingLeft(), c1627.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f10486.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
