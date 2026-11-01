package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C22921 implements Iterable {

    /* JADX INFO: renamed from: ۙ */
    public int f72120;

    /* JADX INFO: renamed from: ᩶ */
    public int f72121;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f72122 = new ArrayList();

    /* JADX INFO: renamed from: ᩹ */
    public int[] f72123 = new int[8];

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m51198(int i, int i2, int i3) {
        int i4;
        if (i >= i2) {
            return;
        }
        int iM51199 = m51199(i);
        int iM511910 = m51199(i2 - 1);
        int i5 = (iM511910 - iM51199) + 1;
        C10180[] c10180Arr = new C10180[i5];
        int i6 = iM51199;
        while (true) {
            if (i6 > iM511910) {
                break;
            }
            int iM51195 = m51195(i6);
            c10180Arr[i6 - iM51199] = new C10180((C7498) this.f72122.get(i6), Math.max(0, i - iM51195), Math.min(((C7498) this.f72122.get(i6)).f19641, i2 - iM51195));
            i6++;
        }
        C16884 c16884 = new C16884(this, c10180Arr, iM51199);
        c16884.m38443(i, i3);
        for (int i7 = 0; i7 < i5; i7++) {
            c10180Arr[i7].m23743();
        }
        c16884.f49991 = true;
        c16884.m38443(i, i3);
        for (i4 = 0; i4 < i5; i4++) {
            C10180 c10180 = c10180Arr[i4];
            C7498 c7498 = c10180.f28236;
            char[] cArr = c10180.f28233;
            c7498.f19640 = cArr == null ? null : c10180.f28235;
            c7498.f19639 = cArr;
        }
    }

    public final int size() {
        return this.f72121;
    }

    public final boolean isEmpty() {
        return this.f72121 == 0;
    }

    public final void clear() {
        this.f72122.clear();
        this.f72123 = new int[8];
        this.f72121 = 0;
        this.f72120++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51209(AbstractC5390 abstractC5390, InterfaceC21800 interfaceC21800, C22076 c22076, int i) {
        C9729 c9729Mo28589 = interfaceC21800.mo28589();
        try {
            clear();
            C15543 c15543M49686 = c22076.m49686();
            int i2 = 0;
            for (int i3 = 0; i3 < c22076.size(); i3++) {
                C13533 c13533M35335 = c15543M49686.m35335(i3);
                if (c13533M35335.f38063 == i2) {
                    add(C20910.m47222(abstractC5390, c9729Mo28589, c13533M35335.f38061, i));
                    i2++;
                }
            }
            m51213();
            c9729Mo28589.close();
        } catch (Throwable th) {
            try {
                c9729Mo28589.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void add(int i) {
        if (this.f72121 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Too many indent lines");
        }
        ArrayList arrayList = this.f72122;
        C7498 c7498 = arrayList.isEmpty() ? null : (C7498) C20013.m45383(arrayList, 1);
        if (c7498 == null || c7498.f19641 == 1024) {
            c7498 = new C7498(8);
            arrayList.add(c7498);
            m51204();
        }
        int i2 = c7498.f19641;
        int[] iArr = c7498.f19638;
        if (i2 == iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.min(1024, iArr.length * 2));
            c7498.f19638 = iArrCopyOf;
            int[] iArr2 = c7498.f19640;
            if (iArr2 != null) {
                c7498.f19640 = Arrays.copyOf(iArr2, iArrCopyOf.length + 1);
            }
        }
        int[] iArr3 = c7498.f19638;
        int i3 = c7498.f19641;
        int i4 = i3 + 1;
        c7498.f19641 = i4;
        iArr3[i3] = i;
        int[] iArr4 = c7498.f19640;
        if (iArr4 != null) {
            iArr4[i4] = iArr4[i3];
        }
        int[] iArr5 = this.f72123;
        int size = arrayList.size() - 1;
        int i5 = this.f72121 + 1;
        this.f72121 = i5;
        iArr5[size] = i5;
        this.f72120++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51208(int i, AbstractC5390 abstractC5390, C9729 c9729, int i2, int i3) {
        int iM51199 = m51199(i);
        ((C7498) this.f72122.get(iM51199)).f19638[i - m51195(iM51199)] = C20910.m47222(abstractC5390, c9729, i2, i3);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51212(int i, int i2) {
        C12826.checkFromToIndex(i, i, this.f72121);
        if (i2 < 0 || ((long) this.f72121) + ((long) i2) > 2147483647L) {
            throw new IllegalArgumentException("Invalid indent line count");
        }
        if (i2 == 0) {
            return;
        }
        int iM51205 = m51205(i);
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(1024, i2);
            C7498 c7498 = new C7498(iMin);
            c7498.f19641 = iMin;
            arrayList.add(c7498);
            i2 -= iMin;
        }
        this.f72122.addAll(iM51205, arrayList);
        m51206();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51207(int i, int i2) {
        C12826.checkFromToIndex(i, i2, this.f72121);
        if (i == i2) {
            return;
        }
        this.f72122.subList(m51205(i), m51205(i2)).clear();
        m51206();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51210(C22921 c22921, int i, int i2) {
        if (c22921 == this) {
            throw new IllegalArgumentException("Cannot append indent lines from self");
        }
        C12826.checkFromToIndex(i, i2, c22921.f72121);
        if ((((long) this.f72121) + ((long) i2)) - ((long) i) > 2147483647L) {
            throw new IllegalArgumentException("Too many indent lines");
        }
        while (i < i2) {
            int iM51199 = c22921.m51199(i);
            int iM51195 = c22921.m51195(iM51199);
            C7498 c7498 = (C7498) c22921.f72122.get(iM51199);
            int iMin = Math.min(i2, c7498.f19641 + iM51195);
            C7498 c7498M17315 = c7498.m17315(i - iM51195, iMin - iM51195);
            ArrayList arrayList = this.f72122;
            int size = arrayList.size() - 1;
            if (size >= 0 && ((C7498) arrayList.get(size)).f19641 + c7498M17315.f19641 <= 1024) {
                arrayList.set(size, C7498.m17313((C7498) arrayList.get(size), c7498M17315));
            } else {
                arrayList.add(c7498M17315);
                m51204();
            }
            this.f72121 += c7498M17315.f19641;
            this.f72123[arrayList.size() - 1] = this.f72121;
            this.f72120++;
            i = iMin;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m51205(int i) {
        int i2 = this.f72121;
        ArrayList arrayList = this.f72122;
        if (i == i2) {
            return arrayList.size();
        }
        int iM51199 = m51199(i);
        int iM51195 = i - m51195(iM51199);
        if (iM51195 == 0) {
            return iM51199;
        }
        C7498 c7498 = (C7498) arrayList.get(iM51199);
        arrayList.set(iM51199, c7498.m17315(0, iM51195));
        int i3 = iM51199 + 1;
        arrayList.add(i3, c7498.m17315(iM51195, c7498.f19641));
        m51202();
        return i3;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX INFO: renamed from: ᩳ */
    private void m51206() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f72122;
            if (i < arrayList.size()) {
                C7498 c7498 = (C7498) arrayList.get(i);
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (((C7498) arrayList.get(i3)).f19641 + c7498.f19641 <= 1024) {
                        arrayList.set(i3, C7498.m17313((C7498) arrayList.get(i3), c7498));
                    } else {
                        arrayList.set(i2, c7498);
                        i2++;
                    }
                } else {
                    arrayList.set(i2, c7498);
                    i2++;
                }
                i++;
            } else {
                arrayList.subList(i2, arrayList.size()).clear();
                m51202();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m51204() {
        int length = this.f72123.length;
        ArrayList arrayList = this.f72122;
        if (length < arrayList.size()) {
            this.f72123 = Arrays.copyOf(this.f72123, Math.max(arrayList.size(), this.f72123.length * 2));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m51202() {
        m51204();
        int i = 0;
        this.f72121 = 0;
        while (true) {
            ArrayList arrayList = this.f72122;
            if (i >= arrayList.size()) {
                this.f72120++;
                return;
            }
            int[] iArr = this.f72123;
            int i2 = this.f72121 + ((C7498) arrayList.get(i)).f19641;
            this.f72121 = i2;
            iArr[i] = i2;
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m51195(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f72123[i - 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public int m51199(int i) {
        C12826.checkIndex(i, this.f72121);
        int iBinarySearch = Arrays.binarySearch(this.f72123, 0, this.f72122.size(), i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C3474 m51211() {
        return new C3474(this);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51214(int i, int i2) {
        C3474 c3474 = new C3474(this);
        if (i > 0) {
            while (true) {
                i--;
                if (i <= 0) {
                    break;
                }
                c3474.m6205(i);
                if (c3474.m6204() == 0 && c3474.m6200() != 0) {
                    break;
                }
            }
        } else {
            i = 0;
        }
        int i3 = this.f72121;
        if (i2 < i3) {
            i3 = i2 + 1;
            while (i3 < this.f72121) {
                c3474.m6205(i3);
                if (c3474.m6204() == 0 && c3474.m6200() != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        m51198(i, i3, i3 < this.f72121 ? i3 + 1 : i3);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2803(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51213() {
        int i = this.f72121;
        m51198(0, i, i);
    }
}
