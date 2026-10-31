package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C21625 implements Iterable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f69418;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f69419 = new ArrayList();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f69420 = new int[8];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m48850(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return;
        }
        int iM48851 = m48851(i);
        int iM48852 = m48851(i2 - 1);
        int i5 = (iM48852 - iM48851) + 1;
        C8219[] c8219Arr = new C8219[i5];
        int i6 = iM48851;
        while (true) {
            if (i6 > iM48852) {
                break;
            }
            int iM48847 = m48847(i6);
            c8219Arr[i6 - iM48851] = new C8219((C5397) this.f69419.get(i6), Math.max(0, i - iM48847), Math.min(((C5397) this.f69419.get(i6)).f16805, i2 - iM48847));
            i6++;
        }
        C15273 c15273 = new C15273(this, c8219Arr, iM48851);
        c15273.m36282(i, i3);
        for (int i7 = 0; i7 < i5; i7++) {
            c8219Arr[i7].m21774();
        }
        c15273.f46867 = true;
        c15273.m36282(i, i3);
        for (i4 = 0; i4 < i5; i4++) {
            C8219 c8219 = c8219Arr[i4];
            C5397 c5397 = c8219.f25326;
            char[] cArr = c8219.f25323;
            c5397.f16804 = cArr == null ? null : c8219.f25325;
            c5397.f16803 = cArr;
        }
    }

    public final int size() {
        return this.f69418;
    }

    public final boolean isEmpty() {
        return this.f69418 == 0;
    }

    public final void clear() {
        this.f69419.clear();
        this.f69420 = new int[8];
        this.f69418 = 0;
        this.f69417++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48861(AbstractC3179 abstractC3179, InterfaceC20445 interfaceC20445, C20736 c20736, int i) {
        C7744 c7744Mo26556 = interfaceC20445.mo26556();
        try {
            clear();
            C13862 c13862M47359 = c20736.m47359();
            int i2 = 0;
            for (int i3 = 0; i3 < c20736.size(); i3++) {
                C11747 c11747M33216 = c13862M47359.m33216(i3);
                if (c11747M33216.f35064 == i2) {
                    add(C19509.m44924(abstractC3179, c7744Mo26556, c11747M33216.f35062, i));
                    i2++;
                }
            }
            m48865();
            c7744Mo26556.close();
        } catch (Throwable th) {
            try {
                c7744Mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void add(int i) {
        if (this.f69418 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Too many indent lines");
        }
        ArrayList arrayList = this.f69419;
        C5397 c5397 = arrayList.isEmpty() ? null : (C5397) C18566.m43105(arrayList, 1);
        if (c5397 == null || c5397.f16805 == 1024) {
            c5397 = new C5397(8);
            arrayList.add(c5397);
            m48856();
        }
        int i2 = c5397.f16805;
        int[] iArr = c5397.f16802;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.min(1024, iArr.length * 2));
            c5397.f16802 = iArrCopyOf;
            int[] iArr2 = c5397.f16804;
            if (iArr2 != null) {
                c5397.f16804 = Arrays.copyOf(iArr2, iArrCopyOf.length + 1);
            }
        }
        int[] iArr3 = c5397.f16802;
        int i3 = c5397.f16805;
        int i4 = i3 + 1;
        c5397.f16805 = i4;
        iArr3[i3] = i;
        int[] iArr4 = c5397.f16804;
        if (iArr4 != null) {
            iArr4[i4] = iArr4[i3];
        }
        int[] iArr5 = this.f69420;
        int size = arrayList.size() - 1;
        int i5 = this.f69418 + 1;
        this.f69418 = i5;
        iArr5[size] = i5;
        this.f69417++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48860(int i, AbstractC3179 abstractC3179, C7744 c7744, int i2, int i3) {
        int iM48851 = m48851(i);
        ((C5397) this.f69419.get(iM48851)).f16802[i - m48847(iM48851)] = C19509.m44924(abstractC3179, c7744, i2, i3);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48864(int i, int i2) {
        C11003.checkFromToIndex(i, i, this.f69418);
        if (i2 < 0 || ((long) this.f69418) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid indent line count");
        }
        if (i2 == 0) {
            return;
        }
        int iM48857 = m48857(i);
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(1024, i2);
            C5397 c5397 = new C5397(iMin);
            c5397.f16805 = iMin;
            arrayList.add(c5397);
            i2 -= iMin;
        }
        this.f69419.addAll(iM48857, arrayList);
        m48858();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48859(int i, int i2) {
        C11003.checkFromToIndex(i, i2, this.f69418);
        if (i == i2) {
            return;
        }
        this.f69419.subList(m48857(i), m48857(i2)).clear();
        m48858();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48862(C21625 c21625, int i, int i2) {
        if (c21625 == this) {
            throw new IllegalArgumentException("Cannot append indent lines from self");
        }
        C11003.checkFromToIndex(i, i2, c21625.f69418);
        if ((((long) this.f69418) + ((long) i2)) - ((long) i) > 2147483647L) {
            throw new IllegalArgumentException("Too many indent lines");
        }
        while (i < i2) {
            int iM48851 = c21625.m48851(i);
            int iM48847 = c21625.m48847(iM48851);
            C5397 c5397 = (C5397) c21625.f69419.get(iM48851);
            int iMin = Math.min(i2, c5397.f16805 + iM48847);
            C5397 c5397M15404 = c5397.m15404(i - iM48847, iMin - iM48847);
            ArrayList arrayList = this.f69419;
            int size = arrayList.size() - 1;
            if (size >= 0 && ((C5397) arrayList.get(size)).f16805 + c5397M15404.f16805 <= 1024) {
                arrayList.set(size, C5397.m15402((C5397) arrayList.get(size), c5397M15404));
            } else {
                arrayList.add(c5397M15404);
                m48856();
            }
            this.f69418 += c5397M15404.f16805;
            this.f69420[arrayList.size() - 1] = this.f69418;
            this.f69417++;
            i = iMin;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m48857(int i) {
        int i2 = this.f69418;
        ArrayList arrayList = this.f69419;
        if (i == i2) {
            return arrayList.size();
        }
        int iM48851 = m48851(i);
        int iM48847 = i - m48847(iM48851);
        if (iM48847 == 0) {
            return iM48851;
        }
        C5397 c5397 = (C5397) arrayList.get(iM48851);
        arrayList.set(iM48851, c5397.m15404(0, iM48847));
        int i3 = iM48851 + 1;
        arrayList.add(i3, c5397.m15404(iM48847, c5397.f16805));
        m48854();
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48858() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f69419;
            if (i < arrayList.size()) {
                C5397 c5397 = (C5397) arrayList.get(i);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((C5397) arrayList.get(i3)).f16805 + c5397.f16805 <= 1024) {
                        arrayList.set(i3, C5397.m15402((C5397) arrayList.get(i3), c5397));
                    } else {
                        arrayList.set(i2, c5397);
                        i2++;
                    }
                } else {
                    arrayList.set(i2, c5397);
                    i2++;
                }
                i++;
            } else {
                arrayList.subList(i2, arrayList.size()).clear();
                m48854();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m48856() {
        int length = this.f69420.length;
        ArrayList arrayList = this.f69419;
        if (length < arrayList.size()) {
            this.f69420 = Arrays.copyOf(this.f69420, Math.max(arrayList.size(), this.f69420.length * 2));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m48854() {
        m48856();
        int i = 0;
        this.f69418 = 0;
        while (true) {
            ArrayList arrayList = this.f69419;
            if (i >= arrayList.size()) {
                this.f69417++;
                return;
            }
            int[] iArr = this.f69420;
            int i2 = this.f69418 + ((C5397) arrayList.get(i)).f16805;
            this.f69418 = i2;
            iArr[i] = i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m48847(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f69420[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m48851(int i) {
        C11003.checkIndex(i, this.f69418);
        int iBinarySearch = Arrays.binarySearch(this.f69420, 0, this.f69419.size(), i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1163 m48863() {
        return new C1163(this);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m48866(int i, int i2) {
        C1163 c1163 = new C1163(this);
        if (i > 0) {
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                c1163.m3964(i);
                if (c1163.m3963() == 0 && c1163.m3959() != 0) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        int i3 = this.f69418;
        if (i2 < i3) {
            i3 = i2 + 1;
            while (i3 < this.f69418) {
                c1163.m3964(i3);
                if (c1163.m3963() == 0 && c1163.m3959() != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        m48850(i, i3, i3 < this.f69418 ? i3 + 1 : i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0457(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48865() {
        int i = this.f69418;
        m48850(0, i, i);
    }
}
