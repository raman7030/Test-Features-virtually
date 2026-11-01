package p067l;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ܽ֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21VS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17843 implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public float f53240;

    /* JADX INFO: renamed from: ᩶ */
    public Interpolator f53239 = null;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f53241 = false;

    @Override // 
    public abstract AbstractC17843 clone();

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo28737(Object obj);

    /* JADX INFO: renamed from: ܽ */
    public abstract Float mo28738();

    /* JADX INFO: renamed from: ֫ */
    public final Interpolator m40520() {
        return this.f53239;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40521(Interpolator interpolator) {
        this.f53239 = interpolator;
    }
}
