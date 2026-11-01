package p067l;

import android.util.StateSet;

/* JADX INFO: renamed from: l.֨᩻ */
/* JADX INFO: compiled from: T9OD */
/* JADX INFO: loaded from: classes2.dex */
public class C0913 extends AbstractC1788 {

    /* JADX INFO: renamed from: ۟ */
    public int[][] f7918;

    @Override // p067l.AbstractC1788
    /* JADX INFO: renamed from: ܿ */
    public void mo7192() {
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m7191(int[] iArr) {
        int[][] iArr2 = this.f7918;
        int i = this.f63339;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }
}
