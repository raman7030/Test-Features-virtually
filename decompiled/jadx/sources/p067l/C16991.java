package p067l;

/* JADX INFO: renamed from: l.ܶᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB0P */
/* JADX INFO: loaded from: classes4.dex */
public final class C16991 {

    /* JADX INFO: renamed from: ֫ */
    public int f50243;

    /* JADX INFO: renamed from: ۧ */
    public C13640 f50244;

    /* JADX INFO: renamed from: ܳ */
    public int f50245 = 1;

    /* JADX INFO: renamed from: ܽ */
    public C13640 f50246;

    /* JADX INFO: renamed from: ܿ */
    public final C13640 f50247;

    /* JADX INFO: renamed from: ᩳ */
    public int f50248;

    public C16991(C13640 c13640) {
        this.f50247 = c13640;
        this.f50244 = c13640;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m38580(int i) {
        C13640 c13640M31019 = this.f50244.m31019(i);
        int i2 = 1;
        if (this.f50245 == 2) {
            if (c13640M31019 != null) {
                this.f50244 = c13640M31019;
                this.f50243++;
            } else if (i == 65038) {
                m38579();
            } else if (i != 65039) {
                if (this.f50244.m31018() != null) {
                    if (this.f50243 != 1 || m38578()) {
                        this.f50246 = this.f50244;
                        m38579();
                        i2 = 3;
                    } else {
                        m38579();
                    }
                } else {
                    m38579();
                }
            }
            i2 = 2;
        } else if (c13640M31019 == null) {
            m38579();
        } else {
            this.f50245 = 2;
            this.f50244 = c13640M31019;
            this.f50243 = 1;
            i2 = 2;
        }
        this.f50248 = i;
        return i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m38579() {
        this.f50245 = 1;
        this.f50244 = this.f50247;
        this.f50243 = 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4232 m38582() {
        return this.f50246.m31018();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4232 m38581() {
        return this.f50244.m31018();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m38583() {
        if (this.f50245 != 2 || this.f50244.m31018() == null) {
            return false;
        }
        return this.f50243 > 1 || m38578();
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m38578() {
        return this.f50244.m31018().m8607() || this.f50248 == 65039;
    }
}
