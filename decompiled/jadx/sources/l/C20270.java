package l;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.᩶ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96B4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20270 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4747 f65504;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public C20270(AbstractC4747 abstractC4747) {
        this.f65504 = abstractC4747;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return this.f65504;
    }
}
