package p067l;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ܽ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C18480 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ AbstractC19822 f55211;

    public C18480(AbstractC19822 abstractC19822) {
        this.f55211 = abstractC19822;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f55211.onAnimationStart(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f55211.onAnimationEnd(drawable);
    }
}
