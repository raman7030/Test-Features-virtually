package l;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: l.ܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16670 extends C18082 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final WindowInsetsAnimation f51175;

    public C16670(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f51175 = windowInsetsAnimation;
    }

    @Override // l.C18082
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int mo39192() {
        return this.f51175.getTypeMask();
    }

    @Override // l.C18082
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo39189() {
        return this.f51175.getDurationMillis();
    }

    @Override // l.C18082
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo39190(float f) {
        this.f51175.setFraction(f);
    }

    @Override // l.C18082
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float mo39191() {
        return this.f51175.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39187(View view, AbstractC13414 abstractC13414) {
        view.setWindowInsetsAnimationCallback(new C11027(abstractC13414));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C11007 m39188(WindowInsetsAnimation.Bounds bounds) {
        return C11007.m27342(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11007 m39186(WindowInsetsAnimation.Bounds bounds) {
        return C11007.m27342(bounds.getUpperBound());
    }
}
