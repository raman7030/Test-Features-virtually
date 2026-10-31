package l;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16952 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18364 f52030;

    public C16952(AbstractC18364 abstractC18364) {
        this.f52030 = abstractC18364;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f52030.onAnimationStart(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f52030.onAnimationEnd(drawable);
    }
}
