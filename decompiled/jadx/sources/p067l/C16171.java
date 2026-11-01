package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16171 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f47614;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f47615;

    /* JADX INFO: renamed from: ֫ */
    public final void m36815(int i) {
        int[] iArr = this.f47614;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f47614 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f47614 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f47614;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36814() {
        int[] iArr = this.f47614;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f47615 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36817(int i, int i2) {
        int[] iArr = this.f47614;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m36815(i3);
        int[] iArr2 = this.f47614;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f47614;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.f47615;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C18854 c18854 = (C18854) this.f47615.get(size);
            int i4 = c18854.f56320;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f47615.remove(size);
                } else {
                    c18854.f56320 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36816(int i, int i2) {
        int[] iArr = this.f47614;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m36815(i3);
        int[] iArr2 = this.f47614;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f47614, i, i3, -1);
        ArrayList arrayList = this.f47615;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C18854 c18854 = (C18854) this.f47615.get(size);
            int i4 = c18854.f56320;
            if (i4 >= i) {
                c18854.f56320 = i4 + i2;
            }
        }
    }
}
