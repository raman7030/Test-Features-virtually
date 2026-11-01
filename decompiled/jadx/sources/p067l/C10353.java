package p067l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۠᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10353 extends AbstractC23094 implements Serializable {
    public static final long serialVersionUID = 6150783262733311327L;

    /* JADX INFO: renamed from: ᩸ */
    public double f28665;

    /* JADX INFO: renamed from: ᩹ */
    public double f28666;

    public C10353(double d, double d2) {
        this.f28665 = d;
        this.f28666 = d2;
    }

    @Override // p067l.AbstractC23094
    public final double getX() {
        return this.f28665;
    }

    @Override // p067l.AbstractC23094
    public final double getY() {
        return this.f28666;
    }

    @Override // p067l.AbstractC23094
    /* JADX INFO: renamed from: ֫ */
    public final void mo23980(double d, double d2) {
        this.f28665 = d;
        this.f28666 = d2;
    }

    public final String toString() {
        return "Point2D.Double[" + this.f28665 + ", " + this.f28666 + "]";
    }
}
