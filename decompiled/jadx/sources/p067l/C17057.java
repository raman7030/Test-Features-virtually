package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17057 extends AbstractC23094 implements Serializable {
    public static final long serialVersionUID = -2870572449815403710L;

    /* JADX INFO: renamed from: ᩸ */
    public float f50443;

    /* JADX INFO: renamed from: ᩹ */
    public float f50444;

    @Override // p067l.AbstractC23094
    public final double getX() {
        return this.f50443;
    }

    @Override // p067l.AbstractC23094
    public final double getY() {
        return this.f50444;
    }

    @Override // p067l.AbstractC23094
    /* JADX INFO: renamed from: ֫ */
    public final void mo23980(double d, double d2) {
        this.f50443 = (float) d;
        this.f50444 = (float) d2;
    }

    public final String toString() {
        return "Point2D.Float[" + this.f50443 + ", " + this.f50444 + "]";
    }
}
