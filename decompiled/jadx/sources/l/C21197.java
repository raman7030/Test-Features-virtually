package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C21197 extends AbstractC9202 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f68317;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f68318;

    public C21197(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C9908 c9908 = new C9908(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c9908.m25015());
        objectAnimatorOfInt.setInterpolator(c9908);
        this.f68318 = z2;
        this.f68317 = objectAnimatorOfInt;
    }

    @Override // l.AbstractC9202
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23635() {
        return this.f68318;
    }

    @Override // l.AbstractC9202
    /* JADX INFO: renamed from: ܽ */
    public final void mo19082() {
        this.f68317.start();
    }

    @Override // l.AbstractC9202
    /* JADX INFO: renamed from: ۧ */
    public final void mo23636() {
        this.f68317.reverse();
    }

    @Override // l.AbstractC9202
    /* JADX INFO: renamed from: ᩳ */
    public final void mo19083() {
        this.f68317.cancel();
    }
}
