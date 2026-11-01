package p067l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܿۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes4.dex */
public final class C18639 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12605 f55637;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f55638;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f55639;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f55640;

    /* JADX INFO: renamed from: ܿ */
    public final int f55641;

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f55642;

    /* JADX INFO: renamed from: ᩻ */
    public final int f55643;

    public C18639(AbstractC12605 abstractC12605, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        int i2;
        this.f55640 = arrayList;
        this.f55639 = iArr;
        this.f55642 = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f55637 = abstractC12605;
        int iMo3749 = abstractC12605.mo3749();
        this.f55643 = iMo3749;
        int iMo3747 = abstractC12605.mo3747();
        this.f55641 = iMo3747;
        this.f55638 = true;
        C19310 c19310 = arrayList.isEmpty() ? null : (C19310) arrayList.get(0);
        if (c19310 == null || c19310.f57668 != 0 || c19310.f57669 != 0) {
            arrayList.add(0, new C19310(0, 0, 0));
        }
        arrayList.add(new C19310(iMo3749, iMo3747, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19310 c19311 = (C19310) it.next();
            for (int i3 = 0; i3 < c19311.f57667; i3++) {
                int i4 = c19311.f57668 + i3;
                int i5 = c19311.f57669 + i3;
                int i6 = abstractC12605.mo3748(i4, i5) ? 1 : 2;
                iArr[i4] = (i5 << 4) | i6;
                iArr2[i5] = (i4 << 4) | i6;
            }
        }
        if (this.f55638) {
            Iterator it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                C19310 c19312 = (C19310) it2.next();
                while (true) {
                    i = c19312.f57668;
                    if (i7 < i) {
                        if (iArr[i7] == 0) {
                            int size = arrayList.size();
                            int i8 = 0;
                            for (int i9 = 0; i9 < size; i9++) {
                                C19310 c19313 = (C19310) arrayList.get(i9);
                                while (true) {
                                    i2 = c19313.f57669;
                                    if (i8 < i2) {
                                        if (iArr2[i8] == 0 && abstractC12605.mo3750(i7, i8)) {
                                            int i10 = abstractC12605.mo3748(i7, i8) ? 8 : 4;
                                            iArr[i7] = (i8 << 4) | i10;
                                            iArr2[i8] = i10 | (i7 << 4);
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                i8 = c19313.f57667 + i2;
                            }
                        }
                        i7++;
                    }
                }
                i7 = c19312.f57667 + i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX INFO: renamed from: ֫ */
    public final void m42393(AbstractC21283 abstractC21283) {
        int[] iArr;
        AbstractC12605 abstractC12605;
        int i;
        ArrayList arrayList;
        int i2;
        C17059 c17059 = new C17059(new C10355(abstractC21283));
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = this.f55640;
        int size = arrayList2.size() - 1;
        int i3 = this.f55643;
        int i4 = this.f55641;
        int i5 = i3;
        while (size >= 0) {
            C19310 c19310 = (C19310) arrayList2.get(size);
            int i6 = c19310.f57668;
            int i7 = c19310.f57669;
            int i8 = c19310.f57667;
            int i9 = i6 + i8;
            int i10 = i7 + i8;
            while (true) {
                iArr = this.f55639;
                abstractC12605 = this.f55637;
                if (i5 <= i9) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) == 0) {
                    arrayList = arrayList2;
                    if (c17059.f50447 == 2 && (i2 = c17059.f50446) >= i5 && i2 <= i5 + 1) {
                        c17059.f50445++;
                        c17059.f50446 = i5;
                    } else {
                        c17059.m38705();
                        c17059.f50446 = i5;
                        c17059.f50445 = 1;
                        c17059.f50447 = 2;
                    }
                    i3--;
                } else {
                    arrayList = arrayList2;
                    C15956 c15956M42392 = m42392(arrayDeque, i11 >> 4, false);
                    if (c15956M42392 != null) {
                        int i12 = (i3 - c15956M42392.f46178) - 1;
                        c17059.m38707(i5, i12);
                        if ((i11 & 4) != 0) {
                            abstractC12605.getClass();
                            c17059.m38706(i12, 1);
                        }
                    } else {
                        arrayDeque.add(new C15956(i5, (i3 - i5) - 1, true));
                    }
                }
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i13 = this.f55642[i4];
                if ((i13 & 12) == 0) {
                    if (c17059.f50447 != 1 || i5 < (i = c17059.f50446)) {
                        c17059.m38705();
                        c17059.f50446 = i5;
                        c17059.f50445 = 1;
                        c17059.f50447 = 1;
                    } else {
                        int i14 = c17059.f50445;
                        if (i5 <= i + i14) {
                            c17059.f50445 = i14 + 1;
                            c17059.f50446 = Math.min(i5, i);
                        } else {
                            c17059.m38705();
                            c17059.f50446 = i5;
                            c17059.f50445 = 1;
                            c17059.f50447 = 1;
                        }
                    }
                    i3++;
                } else {
                    C15956 c15956M42393 = m42392(arrayDeque, i13 >> 4, true);
                    if (c15956M42393 == null) {
                        arrayDeque.add(new C15956(i4, i3 - i5, false));
                    } else {
                        c17059.m38707((i3 - c15956M42393.f46178) - 1, i5);
                        if ((i13 & 4) != 0) {
                            abstractC12605.getClass();
                            c17059.m38706(i5, 1);
                        }
                    }
                }
            }
            int i15 = i6;
            for (int i16 = 0; i16 < i8; i16++) {
                if ((iArr[i15] & 15) == 2) {
                    abstractC12605.getClass();
                    c17059.m38706(i15, 1);
                }
                i15++;
            }
            size--;
            i5 = i6;
            i4 = i7;
            arrayList2 = arrayList3;
        }
        c17059.m38705();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15956 m42392(ArrayDeque arrayDeque, int i, boolean z) {
        C15956 c15956;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c15956 = null;
                break;
            }
            c15956 = (C15956) it.next();
            if (c15956.f46179 == i && c15956.f46180 == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C15956 c15957 = (C15956) it.next();
            if (z) {
                c15957.f46178--;
            } else {
                c15957.f46178++;
            }
        }
        return c15956;
    }
}
