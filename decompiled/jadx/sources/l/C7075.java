package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۜ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes2.dex */
public final class C7075 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f21769;

    public C7075(Drawable.ConstantState constantState) {
        this.f21769 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C21187 c21187 = new C21187();
        Drawable drawableNewDrawable = this.f21769.newDrawable();
        c21187.f13777 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c21187.f68284);
        return c21187;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C21187 c21187 = new C21187();
        Drawable drawableNewDrawable = this.f21769.newDrawable(resources);
        c21187.f13777 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c21187.f68284);
        return c21187;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C21187 c21187 = new C21187();
        Drawable drawableNewDrawable = this.f21769.newDrawable(resources, theme);
        c21187.f13777 = drawableNewDrawable;
        drawableNewDrawable.setCallback(c21187.f68284);
        return c21187;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f21769.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f21769.getChangingConfigurations();
    }
}
