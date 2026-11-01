package p067l;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.֡ܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X54K */
/* JADX INFO: loaded from: classes2.dex */
public final class C2816 extends ColorDrawable {

    /* JADX INFO: renamed from: ֫ */
    public int f4818;

    /* JADX INFO: renamed from: ۧ */
    public AccelerateInterpolator f4819;

    /* JADX INFO: renamed from: ܽ */
    public boolean f4820;

    /* JADX INFO: renamed from: ᩳ */
    public long f4821;

    public C2816(int i) {
        super(i);
        this.f4819 = new AccelerateInterpolator();
        this.f4820 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4455(int i) {
        this.f4818 = i;
        this.f4821 = System.currentTimeMillis();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.ColorDrawable
    public final void setColor(int i) {
        if (!this.f4820) {
            this.f4820 = true;
            setAlpha(255);
        }
        super.setColor(i);
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f4820) {
            super.draw(canvas);
            return;
        }
        if (this.f4821 != 0) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f4821);
            int i = this.f4818;
            z = false;
            if (iCurrentTimeMillis < i) {
                setAlpha((int) ((1.0f - this.f4819.getInterpolation(iCurrentTimeMillis / i)) * 255.0f));
            } else {
                setAlpha(0);
            }
        } else {
            this.f4821 = 0L;
            z = true;
        }
        super.draw(canvas);
        if (z) {
            return;
        }
        invalidateSelf();
    }
}
