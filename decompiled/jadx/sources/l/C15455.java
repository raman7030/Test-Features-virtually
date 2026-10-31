package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15455 extends AbstractC21807 implements Serializable {
    public static final long serialVersionUID = -2870572449815403710L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f47314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f47315;

    @Override // l.AbstractC21807
    public final double getX() {
        return this.f47314;
    }

    @Override // l.AbstractC21807
    public final double getY() {
        return this.f47315;
    }

    @Override // l.AbstractC21807
    /* JADX INFO: renamed from: ֫ */
    public final void mo22010(double d, double d2) {
        this.f47314 = (float) d;
        this.f47315 = (float) d2;
    }

    public final String toString() {
        return "Point2D.Float[" + this.f47314 + ", " + this.f47315 + "]";
    }
}
