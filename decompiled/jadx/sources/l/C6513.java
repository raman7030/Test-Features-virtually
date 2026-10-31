package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜۘ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E7PU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6513 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f20105 = new int[128];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f20106 = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18013(int i, int i2) {
        int i3 = this.f20106;
        if (i3 != 0) {
            if (i - (i3 == 0 ? 0 : this.f20105[i3 - 2]) == i2 - (i3 != 0 ? this.f20105[i3 - 1] : 0)) {
                return;
            }
        }
        int i4 = i3 + 2;
        int length = this.f20105.length;
        while (i4 > length) {
            length <<= 1;
        }
        int[] iArr = this.f20105;
        if (length < iArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (length != iArr.length) {
            this.f20105 = Arrays.copyOf(iArr, length);
        }
        int[] iArr2 = this.f20105;
        int i5 = this.f20106;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        this.f20106 = i5 + 2;
    }
}
