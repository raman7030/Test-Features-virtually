package p067l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.᩷᩻ */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes5.dex */
public final class C1893 extends AbstractC1298 {

    /* JADX INFO: renamed from: ֫ */
    public final ObjectAnimator f71000;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f71001;

    public C1893(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C1333 c1333 = new C1333(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c1333.m27032());
        objectAnimatorOfInt.setInterpolator(c1333);
        this.f71001 = z2;
        this.f71000 = objectAnimatorOfInt;
    }

    @Override // p067l.AbstractC1298
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25634() {
        return this.f71001;
    }

    @Override // p067l.AbstractC1298
    /* JADX INFO: renamed from: ܽ */
    public final void mo21040() {
        this.f71000.start();
    }

    @Override // p067l.AbstractC1298
    /* JADX INFO: renamed from: ۧ */
    public final void mo25635() {
        this.f71000.reverse();
    }

    @Override // p067l.AbstractC1298
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21041() {
        this.f71000.cancel();
    }
}
