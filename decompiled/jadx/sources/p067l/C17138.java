package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܶ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17138 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public boolean f51020;

    /* JADX INFO: renamed from: ۜ */
    public int f51021;

    /* JADX INFO: renamed from: ۡ */
    public PorterDuff.Mode f51022;

    /* JADX INFO: renamed from: ۢ */
    public ColorStateList f51023;

    /* JADX INFO: renamed from: ۧ */
    public boolean f51024;

    /* JADX INFO: renamed from: ܳ */
    public ColorStateList f51025;

    /* JADX INFO: renamed from: ܺ */
    public C10434 f51026;

    /* JADX INFO: renamed from: ܽ */
    public boolean f51027;

    /* JADX INFO: renamed from: ܿ */
    public int f51028;

    /* JADX INFO: renamed from: ᩳ */
    public Bitmap f51029;

    /* JADX INFO: renamed from: ᩷ */
    public Paint f51030;

    /* JADX INFO: renamed from: ᩻ */
    public PorterDuff.Mode f51031;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C23845(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C23845(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f51021;
    }
}
