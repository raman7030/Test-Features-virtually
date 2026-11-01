package p067l;

/* JADX INFO: renamed from: l.۠ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8DQ */
/* JADX INFO: loaded from: classes4.dex */
public class C10309 extends C17684 implements InterfaceC19697 {

    /* JADX INFO: renamed from: ۜ */
    public boolean f28561;

    /* JADX INFO: renamed from: ܳ */
    public double f28562;

    /* JADX INFO: renamed from: ܿ */
    public double f28563;

    /* JADX INFO: renamed from: ᩳ */
    public double f28564;

    /* JADX INFO: renamed from: ᩻ */
    public double[] f28565;

    public C10309(int i, String str, double d) {
        super(i, str, d);
        this.f28562 = 0.0d;
        this.f28563 = 1.0d;
        this.f28561 = false;
        this.f28564 = d;
        this.f28565 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f28565[i2] = d;
        }
    }

    public C10309(String str) {
        this(1, str, 0.0d);
    }

    @Override // p067l.C17684
    /* JADX INFO: renamed from: ֫ */
    public final void mo23925(int i, double d) {
        this.f52824 = new C19026[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f52824[i2] = new C19026(this, d);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23924(double d, C22559 c22559) {
        this.f52824[0].mo20722();
        m51435(c22559, new C3603(this, d));
    }

    @Override // p067l.InterfaceC19697
    /* JADX INFO: renamed from: ֫ */
    public final void mo20717(long j) {
        for (C8968 c8968 : this.f52824) {
            ((C19026) c8968).mo20717(j);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m23928(double d) {
        this.f52824[0].mo20716(d);
        this.f28565[0] = d;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23922(double d) {
        this.f28565[0] = d;
        m51434(new C7627(this, d));
    }

    /* JADX INFO: renamed from: ܳ */
    public final double m23929() {
        return this.f28563;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23926(C10309 c10309) {
        m23923(c10309.f28562, c10309.f28564, c10309.f28563);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final double m23931() {
        return this.f28562;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23923(double d, double d2, double d3) {
        this.f28562 = d;
        this.f28563 = d3;
        this.f28564 = d2;
        m23922(d2);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m23927() {
        return this.f28561;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m23930() {
        this.f28561 = true;
    }
}
