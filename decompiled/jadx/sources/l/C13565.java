package l;

/* JADX INFO: renamed from: l.ܰۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8D0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13565 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11450[] f40482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final double[] f40483;

    public C13565(int i) {
        this.f40483 = new double[i * 64];
        this.f40482 = new C11450[i];
        int i2 = 0;
        while (true) {
            C11450[] c11450Arr = this.f40482;
            if (i2 >= c11450Arr.length) {
                return;
            }
            c11450Arr[i2] = new C11450();
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32613(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C11450[] c11450Arr = this.f40482;
                if (i3 < c11450Arr.length) {
                    c11450Arr[i3].f34222[i2] = this.f40483[i];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m32614(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = 0;
            while (true) {
                C11450[] c11450Arr = this.f40482;
                if (i3 < c11450Arr.length) {
                    this.f40483[i] = c11450Arr[i3].f34222[i2];
                    i3++;
                    i++;
                }
            }
        }
        return i;
    }
}
