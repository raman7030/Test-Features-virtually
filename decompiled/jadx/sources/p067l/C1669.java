package p067l;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: l.ܽܰ */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C1669 extends C1739 {

    /* JADX INFO: renamed from: ܿ */
    public final WindowInsetsAnimation f54360;

    public C1669(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f54360 = windowInsetsAnimation;
    }

    @Override // p067l.C1739
    /* JADX INFO: renamed from: ܽ */
    public final int mo41427() {
        return this.f54360.getTypeMask();
    }

    @Override // p067l.C1739
    /* JADX INFO: renamed from: ֫ */
    public final long mo41424() {
        return this.f54360.getDurationMillis();
    }

    @Override // p067l.C1739
    /* JADX INFO: renamed from: ֫ */
    public final void mo41425(float f) {
        this.f54360.setFraction(f);
    }

    @Override // p067l.C1739
    /* JADX INFO: renamed from: ۧ */
    public final float mo41426() {
        return this.f54360.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41422(View view, AbstractC1507 abstractC1507) {
        view.setWindowInsetsAnimationCallback(new C1389(abstractC1507));
    }

    /* JADX INFO: renamed from: ۧ */
    public static C1388 m41423(WindowInsetsAnimation.Bounds bounds) {
        return C1388.m29404(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1388 m41421(WindowInsetsAnimation.Bounds bounds) {
        return C1388.m29404(bounds.getUpperBound());
    }
}
