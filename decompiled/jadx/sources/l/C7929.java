package l;

/* JADX INFO: renamed from: l.۠ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BH0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7929 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f24547;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f24548;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f24549 = 0;

    public C7929(int i) {
        this.f24548 = new int[i];
        this.f24547 = new int[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21234(int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.f24549;
            int[] iArr = this.f24547;
            int[] iArr2 = this.f24548;
            if (i2 < i3) {
                if (iArr2[i2] == i) {
                    iArr[i2] = iArr[i2] + 1;
                    return;
                }
                i2++;
            } else {
                iArr2[i3] = i;
                iArr[i3] = 1;
                this.f24549 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m21233() {
        int i = -1;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f24549;
            int[] iArr = this.f24547;
            if (i3 < i5) {
                int i6 = iArr[i3];
                if (i4 < i6) {
                    i2 = this.f24548[i3];
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21235() {
        return this.f24549;
    }
}
