package p067l;

/* JADX INFO: renamed from: l.ܰۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15260 {

    /* JADX INFO: renamed from: ֫ */
    public C13250[] f43560;

    /* JADX INFO: renamed from: ۧ */
    public final double[] f43561;

    public C15260(int i) {
        this.f43561 = new double[i * 64];
        this.f43560 = new C13250[i];
        int i2 = 0;
        while (true) {
            C13250[] c13250Arr = this.f43560;
            if (i2 >= c13250Arr.length) {
                return;
            }
            c13250Arr[i2] = new C13250();
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34724(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C13250[] c13250Arr = this.f43560;
                if (i3 < c13250Arr.length) {
                    c13250Arr[i3].f37218[i2] = this.f43561[i];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m34725(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C13250[] c13250Arr = this.f43560;
                if (i3 < c13250Arr.length) {
                    this.f43561[i] = c13250Arr[i3].f37218[i2];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }
}
