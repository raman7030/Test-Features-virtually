package l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8464 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f25880;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f25881;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f25882;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ColorStateList f25883;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f25884;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ColorStateList f25885;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1408 f25886;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f25887;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f25888;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Bitmap f25889;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Paint f25890;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f25891;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C15518(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C15518(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f25881;
    }
}
