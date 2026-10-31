package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17120 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10771 f52455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52456;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f52457;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52458;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52459;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f52460;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52461;

    public C17120(AbstractC10771 abstractC10771, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.f52458 = arrayList;
        this.f52457 = iArr;
        this.f52460 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f52455 = abstractC10771;
        int iMo1336 = abstractC10771.mo1336();
        this.f52461 = iMo1336;
        int iMo1334 = abstractC10771.mo1334();
        this.f52459 = iMo1334;
        this.f52456 = true;
        C17826 c17826 = arrayList.isEmpty() ? null : (C17826) arrayList.get(0);
        if (c17826 == null || c17826.f54472 != 0 || c17826.f54473 != 0) {
            arrayList.add(0, new C17826(0, 0, 0));
        }
        arrayList.add(new C17826(iMo1336, iMo1334, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C17826 c17827 = (C17826) it.next();
            for (int i3 = 0; i3 < c17827.f54471; i3++) {
                int i4 = c17827.f54472 + i3;
                int i5 = c17827.f54473 + i3;
                int i6 = abstractC10771.mo1335(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f52456) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C17826 c17828 = (C17826) it2.next();
                while (true) {
                    i = c17828.f54472;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                C17826 c17829 = (C17826) arrayList.get(i9);
                                while (true) {
                                    i2 = c17829.f54473;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && abstractC10771.mo1337(i7, i8)) {
                                            int i10 = abstractC10771.mo1335(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = c17829.f54471 + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c17828.f54471 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40148(AbstractC19902 abstractC19902) {
        int[] iArr;
        AbstractC10771 abstractC10771;
        int i;
        ArrayList arrayList;
        int i2;
        C15457 c15457 = new C15457(new C8403(abstractC19902));
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = this.f52458;
        int size = arrayList2.size() - 1;
        int i3 = this.f52461;
        int i4 = this.f52459;
        int i5 = i3;
        while (size >= 0) {
            C17826 c17826 = (C17826) arrayList2.get(size);
            int i6 = c17826.f54472;
            int i7 = c17826.f54473;
            int i8 = c17826.f54471;
            int i9 = i6 + i8;
            int i10 = i7 + i8;
            while (true) {
                iArr = this.f52457;
                abstractC10771 = this.f52455;
                if (i5 <= i9) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) == 0) {
                    arrayList = arrayList2;
                    if (c15457.f47318 == 2 && (i2 = c15457.f47317) >= i5 && i2 <= i5 + 1) {
                        c15457.f47316++;
                        c15457.f47317 = i5;
                    } else {
                        c15457.m36546();
                        c15457.f47317 = i5;
                        c15457.f47316 = 1;
                        c15457.f47318 = 2;
                    }
                    i3--;
                } else {
                    arrayList = arrayList2;
                    C14297 c14297M40147 = m40147(arrayDeque, i11 >> 4, false);
                    if (c14297M40147 != null) {
                        int i12 = (i3 - c14297M40147.f43086) - 1;
                        c15457.m36548(i5, i12);
                        if ((i11 & 4) != 0) {
                            abstractC10771.getClass();
                            c15457.m36547(i12, 1);
                        }
                    } else {
                        arrayDeque.add(new C14297(i5, (i3 - i5) - 1, true));
                    }
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i13 = this.f52460[i4];
                if ((i13 & 12) == 0) {
                    if (c15457.f47318 != 1 || i5 < (i = c15457.f47317)) {
                        c15457.m36546();
                        c15457.f47317 = i5;
                        c15457.f47316 = 1;
                        c15457.f47318 = 1;
                    } else {
                        int i14 = c15457.f47316;
                        if (i5 <= i + i14) {
                            c15457.f47316 = i14 + 1;
                            c15457.f47317 = Math.min(i5, i);
                        } else {
                            c15457.m36546();
                            c15457.f47317 = i5;
                            c15457.f47316 = 1;
                            c15457.f47318 = 1;
                        }
                    }
                    i3++;
                } else {
                    C14297 c14297M40148 = m40147(arrayDeque, i13 >> 4, true);
                    if (c14297M40148 == null) {
                        arrayDeque.add(new C14297(i4, i3 - i5, false));
                    } else {
                        c15457.m36548((i3 - c14297M40148.f43086) - 1, i5);
                        if ((i13 & 4) != 0) {
                            abstractC10771.getClass();
                            c15457.m36547(i5, 1);
                        }
                    }
                }
            }
            int i15 = i6;
            for (int i16 = 0; i16 < i8; i16++) {
                if ((iArr[i15] & 15) == 2) {
                    abstractC10771.getClass();
                    c15457.m36547(i15, 1);
                }
                i15++;
            }
            size--;
            i5 = i6;
            i4 = i7;
            arrayList2 = arrayList3;
        }
        c15457.m36546();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14297 m40147(ArrayDeque arrayDeque, int i, boolean z) {
        C14297 c14297;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c14297 = null;
                break;
            }
            c14297 = (C14297) it.next();
            if (c14297.f43087 == i && c14297.f43088 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C14297 c14298 = (C14297) it.next();
            if (z) {
                c14298.f43086--;
            } else {
                c14298.f43086++;
            }
        }
        return c14297;
    }
}
