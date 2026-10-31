package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1MI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4785 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15174;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f15176;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f15177;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f15178;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f15181;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f15179 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15173 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15175 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C22424 f15180 = null;

    public C4785(InterfaceC6818 interfaceC6818, CharSequence charSequence, CharSequence charSequence2, ArrayList arrayList, ArrayList arrayList2) {
        this.f15178 = charSequence;
        this.f15176 = charSequence2;
        this.f15181 = arrayList;
        this.f15174 = arrayList2;
        this.f15177 = interfaceC6818;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m13966(ArrayList arrayList, CharSequence charSequence, int i) {
        if (i == -1) {
            return 0;
        }
        return i == arrayList.size() ? charSequence.length() : ((InterfaceC18191) arrayList.get(i)).mo18688();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m13968() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it = this.f15177.mo6219().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f15174;
            arrayList2 = this.f15181;
            if (!zHasNext) {
                break;
            }
            C22340 c22340 = (C22340) it.next();
            int i = c22340.f72395;
            int i2 = c22340.f72397;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c22340.f72398 + i4;
                if (!(arrayList2.get(i5) instanceof C14662) || !(arrayList.get(i6) instanceof C14662)) {
                    if (i5 == 0 ? true : arrayList2.get(i5 - 1) instanceof C14662) {
                        if (i6 == 0 ? true : arrayList.get(i6 - 1) instanceof C14662) {
                            m13967(i5 - 1, i6 - 1, z);
                        }
                    }
                    z = true;
                } else {
                    m13967(i5, i6, z);
                    z = false;
                }
            }
        }
        m13967(arrayList2.size(), arrayList.size(), z);
        C22424 c22424 = this.f15180;
        ArrayList arrayList3 = this.f15179;
        if (c22424 != null) {
            arrayList3.add(c22424.f72658);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00fb  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13967(int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int i4 = this.f15173;
        if (i4 > i || (i3 = this.f15175) > i2) {
            return;
        }
        ArrayList arrayList = this.f15181;
        CharSequence charSequence = this.f15178;
        int iM13966 = m13966(arrayList, charSequence, i4);
        ArrayList arrayList2 = this.f15174;
        CharSequence charSequence2 = this.f15176;
        int iM13967 = m13966(arrayList2, charSequence2, i3);
        int iM13968 = m13966(arrayList, charSequence, i);
        int iM13969 = m13966(arrayList2, charSequence2, i2);
        int iMax = Math.max(0, i4 + 1);
        C22340 c22340 = new C22340(iMax, Math.min(i + 1, arrayList.size()), Math.max(0, i3 + 1), Math.min(i2 + 1, arrayList2.size()));
        C22340 c22341 = new C22340(iM13966, iM13968, iM13967, iM13969);
        C20308 c20308 = new C20308(c22340, c22341);
        while (true) {
            if (iMax < c22340.f72395) {
                if (arrayList.get(iMax) instanceof C14662) {
                    iMax++;
                }
            } else {
                int i5 = c22340.f72398;
                while (true) {
                    if (i5 >= c22340.f72396) {
                        z2 = false;
                        break;
                    } else if (arrayList2.get(i5) instanceof C14662) {
                        i5++;
                    }
                }
            }
            z2 = true;
            break;
        }
        int i6 = c22341.f72397;
        int i7 = c22341.f72395;
        CharSequence charSequenceSubSequence = charSequence.subSequence(i6, i7);
        int i8 = c22341.f72398;
        int i9 = c22341.f72396;
        boolean zM27831 = C11250.m27831(charSequenceSubSequence, charSequence2.subSequence(i8, i9));
        C22424 c22424 = new C22424(c20308, z, z2, zM27831);
        if (c22341.m50072()) {
            return;
        }
        C22424 c22425 = this.f15180;
        if (c22425 != null) {
            boolean z3 = c22425.f72660;
            boolean z4 = c22425.f72661;
            boolean z5 = c22425.f72659;
            if ((!z5 && !z) || ((z4 && zM27831) || !z3 || !z2)) {
                C20308 c20309 = c22425.f72658;
                C22340 c22342 = c20309.f65574;
                int i10 = c22342.f72397;
                C22340 c22343 = c20308.f65574;
                C22340 c22344 = new C22340(i10, c22343.f72395, c22342.f72398, c22343.f72396);
                C22340 c22345 = c20309.f65573;
                this.f15180 = new C22424(new C20308(c22344, new C22340(c22345.f72397, i7, c22345.f72398, i9)), z5 || z, z3 || z2, z4 && zM27831);
            } else {
                if (c22425 != null) {
                    this.f15179.add(c22425.f72658);
                }
                this.f15180 = c22424;
            }
        } else {
            if (c22425 != null) {
                this.f15179.add(c22425.f72658);
            }
            this.f15180 = c22424;
        }
        this.f15173 = i;
        this.f15175 = i2;
    }
}
