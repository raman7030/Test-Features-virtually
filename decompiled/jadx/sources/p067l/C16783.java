package p067l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܶۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16783 extends Animation {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f49451;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14102 f49452;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f49453;

    public C16783(C14102 c14102, int i, int i2) {
        this.f49452 = c14102;
        this.f49451 = i;
        this.f49453 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C20809 c20809 = this.f49452.f39982;
        int i = this.f49451;
        c20809.setAlpha((int) (((this.f49453 - i) * f) + i));
    }
}
