package p067l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.۠᩹ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBKO */
/* JADX INFO: loaded from: classes3.dex */
public final class C10413 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public boolean f28793;

    /* JADX INFO: renamed from: ۜ */
    public int f28794;

    /* JADX INFO: renamed from: ۡ */
    public PorterDuff.Mode f28795;

    /* JADX INFO: renamed from: ۢ */
    public ColorStateList f28796;

    /* JADX INFO: renamed from: ۧ */
    public boolean f28797;

    /* JADX INFO: renamed from: ܳ */
    public ColorStateList f28798;

    /* JADX INFO: renamed from: ܺ */
    public C3707 f28799;

    /* JADX INFO: renamed from: ܽ */
    public boolean f28800;

    /* JADX INFO: renamed from: ܿ */
    public int f28801;

    /* JADX INFO: renamed from: ᩳ */
    public Bitmap f28802;

    /* JADX INFO: renamed from: ᩷ */
    public Paint f28803;

    /* JADX INFO: renamed from: ᩻ */
    public PorterDuff.Mode f28804;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C17117(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C17117(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f28794;
    }
}
