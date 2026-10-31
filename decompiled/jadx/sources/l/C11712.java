package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Z20Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11712 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34929;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Drawable.ConstantState f34930;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ColorStateList f34931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f34932;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C6067(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C6067(this, resources);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i = this.f34929;
        Drawable.ConstantState constantState = this.f34930;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }
}
