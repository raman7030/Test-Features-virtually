package p067l;

/* JADX INFO: renamed from: l.۠ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9904 {

    /* JADX INFO: renamed from: ֫ */
    public final int[] f27461;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f27462;

    /* JADX INFO: renamed from: ܽ */
    public int f27463 = 0;

    public C9904(int i) {
        this.f27462 = new int[i];
        this.f27461 = new int[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23200(int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.f27463;
            int[] iArr = this.f27461;
            int[] iArr2 = this.f27462;
            if (i2 < i3) {
                if (iArr2[i2] == i) {
                    iArr[i2] = iArr[i2] + 1;
                    return;
                }
                i2++;
            } else {
                iArr2[i3] = i;
                iArr[i3] = 1;
                this.f27463 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m23199() {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f27463;
            int[] iArr = this.f27461;
            if (i3 < i5) {
                int i6 = iArr[i3];
                if (i4 < i6) {
                    i2 = this.f27462[i3];
                    i = i3;
                    i4 = i6;
                }
                i3++;
            } else {
                iArr[i] = 0;
                return i2;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m23201() {
        return this.f27463;
    }
}
