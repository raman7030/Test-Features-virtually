package p067l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۜ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes2.dex */
public final class C9093 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public final Drawable.ConstantState f24650;

    public C9093(Drawable.ConstantState constantState) {
        this.f24650 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C22505 c22505 = new C22505();
        Drawable drawableNewDrawable = this.f24650.newDrawable();
        c22505.f16594 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c22505.f70966);
        return c22505;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C22505 c22505 = new C22505();
        Drawable drawableNewDrawable = this.f24650.newDrawable(resources);
        c22505.f16594 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c22505.f70966);
        return c22505;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C22505 c22505 = new C22505();
        Drawable drawableNewDrawable = this.f24650.newDrawable(resources, theme);
        c22505.f16594 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c22505.f70966);
        return c22505;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f24650.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f24650.getChangingConfigurations();
    }
}
