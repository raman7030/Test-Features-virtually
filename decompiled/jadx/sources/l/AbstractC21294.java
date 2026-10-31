package l;

import android.graphics.Color;

/* JADX INFO: renamed from: l.᩸ۖܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R12P */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21294 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f68658;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f68659;

    /* JADX INFO: renamed from: ᩳ */
    public abstract int mo1197();

    public AbstractC21294(int i) {
        this.f68659 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public int mo7431() {
        return this.f68659;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo7429() {
        if (C21943.f70262) {
            int i = this.f68658;
            if (i != 0) {
                return i;
            }
            float[] fArr = {0.0f, 0.0f, 0.9f};
            C7191.m19272(mo1197(), fArr);
            int iM19269 = C7191.m19269(fArr);
            double[] dArr = new double[3];
            C7191.m19270(Color.red(iM19269), Color.green(iM19269), Color.blue(iM19269), dArr);
            int iM19264 = C7191.m19264(dArr[1], dArr[2]);
            this.f68658 = iM19264;
            return iM19264;
        }
        return mo1197();
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo7430() {
        if (C21943.f70262) {
            return mo1197();
        }
        return C21943.m49431() ? -922746881 : -1;
    }
}
