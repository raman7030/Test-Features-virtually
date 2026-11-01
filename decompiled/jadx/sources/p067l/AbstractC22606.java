package p067l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.᩸ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R12P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC22606 {

    /* JADX INFO: renamed from: ֫ */
    public int f71349;

    /* JADX INFO: renamed from: ۧ */
    public final int f71350;

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo3598();

    public AbstractC22606(int i) {
        this.f71350 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo9513() {
        return this.f71350;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo9511() {
        if (C23223.f72974) {
            int i = this.f71349;
            if (i != 0) {
                return i;
            }
            float[] fArr = {0.0f, 0.0f, 0.9f};
            C1199.m21219(mo3598(), fArr);
            int iM21216 = C1199.m21216(fArr);
            double[] dArr = new double[3];
            C1199.m21217(Color.red(iM21216), Color.green(iM21216), Color.blue(iM21216), dArr);
            int iM21211 = C1199.m21211(dArr[1], dArr[2]);
            this.f71349 = iM21211;
            return iM21211;
        }
        return mo3598();
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo9512() {
        if (C23223.f72974) {
            return mo3598();
        }
        return C23223.m51768() ? -922746881 : -1;
    }
}
