package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C8558 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f22983 = new int[128];

    /* JADX INFO: renamed from: ۧ */
    public int f22984 = 0;

    /* JADX INFO: renamed from: ֫ */
    public final void m19962(int i, int i2) {
        int i3 = this.f22984;
        if (i3 != 0) {
            if (i - (i3 == 0 ? 0 : this.f22983[i3 - 2]) == i2 - (i3 != 0 ? this.f22983[i3 - 1] : 0)) {
                return;
            }
        }
        int i4 = i3 + 2;
        int length = this.f22983.length;
        while (i4 > length) {
            length <<= 1;
        }
        int[] iArr = this.f22983;
        if (length < iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length != iArr.length) {
            this.f22983 = Arrays.copyOf(iArr, length);
        }
        int[] iArr2 = this.f22983;
        int i5 = this.f22984;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        this.f22984 = i5 + 2;
    }
}
