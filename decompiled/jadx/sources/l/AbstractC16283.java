package l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܽ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16283 implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f50073;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Interpolator f50072 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f50074 = false;

    @Override // 
    public abstract AbstractC16283 clone();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo26697(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract Float mo26698();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Interpolator m38306() {
        return this.f50072;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38307(Interpolator interpolator) {
        this.f50072 = interpolator;
    }
}
