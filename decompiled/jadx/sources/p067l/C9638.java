package p067l;

import com.umeng.analytics.pro.C0713i;

/* JADX INFO: renamed from: l.۟ᩴۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V8DT */
/* JADX INFO: loaded from: classes3.dex */
public final class C9638 extends AbstractC25081 {

    /* JADX INFO: renamed from: ۢ */
    public static double[] f26533 = new double[C0713i.f2747b];

    /* JADX INFO: renamed from: ܳ */
    public C10309 f26535;

    /* JADX INFO: renamed from: ᩷ */
    public C17013 f26536;

    /* JADX INFO: renamed from: ᩻ */
    public double f26537 = 0.0d;

    /* JADX INFO: renamed from: ۜ */
    public double f26534 = 1.0d;

    static {
        int i = 0;
        while (true) {
            double[] dArr = f26533;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = Math.pow(2.0d, ((double) i) / 2048.0d);
            i++;
        }
    }

    public C9638() {
        C10309 c10309 = new C10309("Input");
        this.f26535 = c10309;
        m55058(c10309);
        c10309.m23923(-8.0d, 0.0d, 8.0d);
        C17013 c17013 = new C17013(0);
        this.f26536 = c17013;
        m55058(c17013);
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40212 = this.f26535.m40212();
        double[] dArrM40213 = this.f26536.m40212();
        for (int i = 0; i < 8; i++) {
            double d = dArrM40212[i];
            if (d == this.f26537) {
                dArrM40213[i] = this.f26534;
            } else {
                this.f26537 = d;
                int iFloor = (int) Math.floor(d);
                double d2 = (d - ((double) iFloor)) * 2048.0d;
                int i2 = (int) d2;
                double[] dArr = f26533;
                double d3 = dArr[i2];
                double d4 = ((dArr[i2 + 1] - d3) * (d2 - ((double) i2))) + d3;
                while (iFloor > 0) {
                    iFloor--;
                    d4 *= 2.0d;
                }
                while (iFloor < 0) {
                    iFloor++;
                    d4 *= 0.5d;
                }
                dArrM40213[i] = d4;
                this.f26534 = d4;
            }
        }
    }
}
