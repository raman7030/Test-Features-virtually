package p067l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l.᩸᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes.dex */
public final class C23175 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public final Drawable.ConstantState f72797;

    public C23175(Drawable.ConstantState constantState) {
        this.f72797 = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C23845 c23845 = new C23845();
        c23845.f16594 = (VectorDrawable) this.f72797.newDrawable();
        return c23845;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C23845 c23845 = new C23845();
        c23845.f16594 = (VectorDrawable) this.f72797.newDrawable(resources);
        return c23845;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C23845 c23845 = new C23845();
        c23845.f16594 = (VectorDrawable) this.f72797.newDrawable(resources, theme);
        return c23845;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f72797.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f72797.getChangingConfigurations();
    }
}
