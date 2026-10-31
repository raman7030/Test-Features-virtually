package l;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes.dex */
public final class C24008 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AnimatorSet f77807;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f77808;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C2727 f77809;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C22597 f77810;

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
