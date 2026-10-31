package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.۠᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: VBK3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8401 extends AbstractC21807 implements Serializable {
    public static final long serialVersionUID = 6150783262733311327L;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public double f25752;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public double f25753;

    public C8401(double d, double d2) {
        this.f25752 = d;
        this.f25753 = d2;
    }

    @Override // l.AbstractC21807
    public final double getX() {
        return this.f25752;
    }

    @Override // l.AbstractC21807
    public final double getY() {
        return this.f25753;
    }

    @Override // l.AbstractC21807
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo22010(double d, double d2) {
        this.f25752 = d;
        this.f25753 = d2;
    }

    public final String toString() {
        return "Point2D.Double[" + this.f25752 + ", " + this.f25753 + "]";
    }
}
