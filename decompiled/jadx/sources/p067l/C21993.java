package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ۙۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5WF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21993 {

    /* JADX INFO: renamed from: ֫ */
    public static final Comparator f69094 = new C3887();

    /* JADX INFO: renamed from: ֫ */
    public static C18639 m49555(AbstractC12605 abstractC12605) {
        ArrayList arrayList;
        C24674 c24674;
        C8581 c8581;
        ArrayList arrayList2;
        int i;
        C24674 c24675;
        C19310 c19310;
        int i2;
        int iM40890;
        int i3;
        int i4;
        int iM40891;
        int i5;
        boolean z;
        int iMo3749 = abstractC12605.mo3749();
        int iMo3747 = abstractC12605.mo3747();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C24674 c24676 = new C24674();
        c24676.f78053 = 0;
        c24676.f78052 = iMo3749;
        c24676.f78051 = 0;
        c24676.f78050 = iMo3747;
        arrayList4.add(c24676);
        int i6 = iMo3749 + iMo3747;
        int i7 = 1;
        int i8 = (((i6 + 1) / 2) * 2) + 1;
        C17968 c17968 = new C17968(i8);
        C17968 c17969 = new C17968(i8);
        ArrayList arrayList5 = new ArrayList();
        while (!arrayList4.isEmpty()) {
            C24674 c24677 = (C24674) C6406.m14670(arrayList4, i7);
            if (c24677.m54311() >= i7 && c24677.m54310() >= i7) {
                int iM54311 = ((c24677.m54311() + c24677.m54310()) + i7) / 2;
                c17968.m40891(i7, c24677.f78053);
                c17969.m40891(i7, c24677.f78052);
                int i9 = 0;
                while (true) {
                    if (i9 >= iM54311) {
                        arrayList = arrayList4;
                        c24674 = c24677;
                        c8581 = null;
                        break;
                    }
                    boolean z2 = Math.abs(c24677.m54311() - c24677.m54310()) % 2 == i7;
                    int iM54312 = c24677.m54311() - c24677.m54310();
                    int i10 = -i9;
                    int i11 = i10;
                    while (true) {
                        if (i11 > i9) {
                            arrayList = arrayList4;
                            i2 = iM54311;
                            c8581 = null;
                            break;
                        }
                        if (i11 == i10 || (i11 != i9 && c17968.m40890(i11 + 1) > c17968.m40890(i11 - 1))) {
                            iM40891 = c17968.m40890(i11 + 1);
                            i5 = iM40891;
                        } else {
                            iM40891 = c17968.m40890(i11 - 1);
                            i5 = iM40891 + 1;
                        }
                        i2 = iM54311;
                        int i12 = ((i5 - c24677.f78053) + c24677.f78051) - i11;
                        int i13 = (i9 == 0 || i5 != iM40891) ? i12 : i12 - 1;
                        arrayList = arrayList4;
                        while (i5 < c24677.f78052 && i12 < c24677.f78050 && abstractC12605.mo3750(i5, i12)) {
                            i5++;
                            i12++;
                        }
                        c17968.m40891(i11, i5);
                        if (z2) {
                            int i14 = iM54312 - i11;
                            z = z2;
                            if (i14 >= i10 + 1 && i14 <= i9 - 1 && c17969.m40890(i14) <= i5) {
                                c8581 = new C8581();
                                c8581.f23064 = iM40891;
                                c8581.f23063 = i13;
                                c8581.f23060 = i5;
                                c8581.f23061 = i12;
                                c8581.f23062 = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        i11 += 2;
                        iM54311 = i2;
                        arrayList4 = arrayList;
                        z2 = z;
                    }
                    if (c8581 != null) {
                        c24674 = c24677;
                        break;
                    }
                    boolean z3 = (c24677.m54311() - c24677.m54310()) % 2 == 0;
                    int iM54313 = c24677.m54311() - c24677.m54310();
                    int i15 = i10;
                    while (true) {
                        if (i15 > i9) {
                            c24674 = c24677;
                            c8581 = null;
                            break;
                        }
                        if (i15 == i10 || (i15 != i9 && c17969.m40890(i15 + 1) < c17969.m40890(i15 - 1))) {
                            iM40890 = c17969.m40890(i15 + 1);
                            i3 = iM40890;
                        } else {
                            iM40890 = c17969.m40890(i15 - 1);
                            i3 = iM40890 - 1;
                        }
                        int i16 = c24677.f78050 - ((c24677.f78052 - i3) - i15);
                        int i17 = (i9 == 0 || i3 != iM40890) ? i16 : i16 + 1;
                        while (true) {
                            if (i3 > c24677.f78053 && i16 > c24677.f78051) {
                                c24674 = c24677;
                                if (!abstractC12605.mo3750(i3 - 1, i16 - 1)) {
                                    break;
                                }
                                i3--;
                                i16--;
                                c24677 = c24674;
                            } else {
                                c24674 = c24677;
                                break;
                            }
                        }
                        c17969.m40891(i15, i3);
                        if (z3 && (i4 = iM54313 - i15) >= i10 && i4 <= i9 && c17968.m40890(i4) >= i3) {
                            c8581 = new C8581();
                            c8581.f23064 = i3;
                            c8581.f23063 = i16;
                            c8581.f23060 = iM40890;
                            c8581.f23061 = i17;
                            c8581.f23062 = true;
                            break;
                        }
                        i15 += 2;
                        c24677 = c24674;
                    }
                    if (c8581 != null) {
                        break;
                    }
                    i9++;
                    i7 = 1;
                    iM54311 = i2;
                    arrayList4 = arrayList;
                    c24677 = c24674;
                }
            } else {
                arrayList = arrayList4;
                c24674 = c24677;
                c8581 = null;
                break;
            }
            if (c8581 != null) {
                if (c8581.m19992() > 0) {
                    int i18 = c8581.f23061;
                    int i19 = c8581.f23063;
                    int i20 = i18 - i19;
                    int i21 = c8581.f23060;
                    int i22 = c8581.f23064;
                    int i23 = i21 - i22;
                    if (i20 == i23) {
                        c19310 = new C19310(i22, i19, i23);
                    } else if (c8581.f23062) {
                        c19310 = new C19310(i22, i19, c8581.m19992());
                    } else {
                        c19310 = i20 > i23 ? new C19310(i22, i19 + 1, c8581.m19992()) : new C19310(i22 + 1, i19, c8581.m19992());
                    }
                    arrayList3.add(c19310);
                }
                if (arrayList5.isEmpty()) {
                    c24675 = new C24674();
                    i = 1;
                } else {
                    i = 1;
                    c24675 = (C24674) C6406.m14670(arrayList5, 1);
                }
                C24674 c24678 = c24674;
                c24675.f78053 = c24678.f78053;
                c24675.f78051 = c24678.f78051;
                c24675.f78052 = c8581.f23064;
                c24675.f78050 = c8581.f23063;
                arrayList2 = arrayList;
                arrayList2.add(c24675);
                c24678.f78052 = c24678.f78052;
                c24678.f78050 = c24678.f78050;
                c24678.f78053 = c8581.f23060;
                c24678.f78051 = c8581.f23061;
                arrayList2.add(c24678);
                i7 = i;
            } else {
                arrayList2 = arrayList;
                i7 = 1;
                arrayList5.add(c24674);
            }
            arrayList4 = arrayList2;
        }
        Collections.sort(arrayList3, f69094);
        return new C18639(abstractC12605, arrayList3, c17968.m40892(), c17969.m40892());
    }
}
