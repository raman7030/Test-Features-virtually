package l;

/* JADX INFO: renamed from: l.۠ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8DQ */
/* JADX INFO: loaded from: classes4.dex */
public class C8355 extends C16115 implements InterfaceC18233 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f25647;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public double f25648;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double f25649;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double f25650;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public double[] f25651;

    public C8355(int i, String str, double d) {
        super(i, str, d);
        this.f25648 = 0.0d;
        this.f25649 = 1.0d;
        this.f25647 = false;
        this.f25650 = d;
        this.f25651 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f25651[i2] = d;
        }
    }

    public C8355(String str) {
        this(1, str, 0.0d);
    }

    @Override // l.C16115
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21955(int i, double d) {
        this.f49658 = new C17527[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f49658[i2] = new C17527(this, d);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21954(double d, C21245 c21245) {
        this.f49658[0].mo18768();
        m49086(c21245, new C1299(this, d));
    }

    @Override // l.InterfaceC18233
    /* JADX INFO: renamed from: ֫ */
    public final void mo18763(long j) {
        for (C6944 c6944 : this.f49658) {
            ((C17527) c6944).mo18763(j);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21958(double d) {
        this.f49658[0].mo18762(d);
        this.f25651[0] = d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21952(double d) {
        this.f25651[0] = d;
        m49085(new C5533(this, d));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m21959() {
        return this.f25649;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21956(C8355 c8355) {
        m21953(c8355.f25648, c8355.f25650, c8355.f25649);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final double m21961() {
        return this.f25648;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21953(double d, double d2, double d3) {
        this.f25648 = d;
        this.f25649 = d3;
        this.f25650 = d2;
        m21952(d2);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m21957() {
        return this.f25647;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21960() {
        this.f25647 = true;
    }
}
