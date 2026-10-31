package l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l.᩸᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C21892 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable.ConstantState f70085;

    public C21892(Drawable.ConstantState constantState) {
        this.f70085 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C22597 c22597 = new C22597();
        c22597.f13777 = (VectorDrawable) this.f70085.newDrawable();
        return c22597;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C22597 c22597 = new C22597();
        c22597.f13777 = (VectorDrawable) this.f70085.newDrawable(resources);
        return c22597;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C22597 c22597 = new C22597();
        c22597.f13777 = (VectorDrawable) this.f70085.newDrawable(resources, theme);
        return c22597;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f70085.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f70085.getChangingConfigurations();
    }
}
