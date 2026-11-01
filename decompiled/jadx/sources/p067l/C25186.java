package p067l;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes.dex */
public final class C25186 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫ */
    public AnimatorSet f80559;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f80560;

    /* JADX INFO: renamed from: ܽ */
    public C0977 f80561;

    /* JADX INFO: renamed from: ᩳ */
    public C23845 f80562;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
