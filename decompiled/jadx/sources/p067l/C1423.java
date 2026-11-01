package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨ۬ */
/* JADX INFO: compiled from: Z20Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C1423 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public int f37929;

    /* JADX INFO: renamed from: ۧ */
    public Drawable.ConstantState f37930;

    /* JADX INFO: renamed from: ܽ */
    public ColorStateList f37931;

    /* JADX INFO: renamed from: ᩳ */
    public PorterDuff.Mode f37932;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1143(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1143(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f37929;
        Drawable.ConstantState constantState = this.f37930;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
