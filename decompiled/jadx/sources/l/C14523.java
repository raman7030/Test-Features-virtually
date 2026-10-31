package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ۫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8539 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14523 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f44508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f44509;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34672(int i) {
        int[] iArr = this.f44508;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f44508 = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f44508 = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.f44508;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34671() {
        int[] iArr = this.f44508;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f44509 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34674(int i, int i2) {
        int[] iArr = this.f44508;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m34672(i3);
        int[] iArr2 = this.f44508;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = this.f44508;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = this.f44509;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C17346 c17346 = (C17346) this.f44509.get(size);
            int i4 = c17346.f53136;
            if (i4 >= i) {
                if (i4 < i3) {
                    this.f44509.remove(size);
                } else {
                    c17346.f53136 = i4 - i2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34673(int i, int i2) {
        int[] iArr = this.f44508;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        m34672(i3);
        int[] iArr2 = this.f44508;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill(this.f44508, i, i3, -1);
        ArrayList arrayList = this.f44509;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C17346 c17346 = (C17346) this.f44509.get(size);
            int i4 = c17346.f53136;
            if (i4 >= i) {
                c17346.f53136 = i4 + i2;
            }
        }
    }
}
