package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18897 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f59562;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f59563;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f59564;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f59565 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo8364(EnumC20224 enumC20224, int i, int i2, C22340 c22340, C22340 c22341);

    public AbstractC18897(List list, List list2, InterfaceC6818 interfaceC6818) {
        this.f59562 = list;
        this.f59563 = list2;
        this.f59564 = interfaceC6818;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6818 m43624() {
        Iterator it = this.f59564.mo6219().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f59565;
            if (zHasNext) {
                arrayList.add((C22340) it.next());
                m43623();
            } else {
                return C23751.m52403(C23751.m52399(this.f59562.size(), this.f59563.size(), arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m43623() {
        List list;
        int i;
        List list2;
        int i2;
        int i3;
        AbstractC18897 abstractC18897 = this;
        ArrayList arrayList = abstractC18897.f59565;
        if (arrayList.size() < 2) {
            return;
        }
        C22340 c22340 = (C22340) C18566.m43105(arrayList, 2);
        C22340 c22341 = (C22340) C18566.m43105(arrayList, 1);
        int i4 = c22340.f72395;
        int i5 = c22340.f72398;
        int i6 = c22340.f72397;
        int i7 = c22340.f72396;
        int i8 = c22341.f72397;
        int i9 = c22341.f72396;
        int i10 = c22341.f72395;
        int i11 = c22341.f72398;
        if (i4 == i8 || i7 == i11) {
            int i12 = i4 - i6;
            int i13 = i10 - i8;
            int i14 = i4 + i13;
            int i15 = i7 + i13;
            int i16 = i7;
            int i17 = i4;
            while (true) {
                list = abstractC18897.f59563;
                i = i9;
                list2 = abstractC18897.f59562;
                if (i17 >= i14 || i16 >= i15) {
                    break;
                }
                int i18 = i14;
                if (!C11003.equals(list2.get(i17), list.get(i16))) {
                    break;
                }
                i17++;
                i16++;
                abstractC18897 = this;
                i9 = i;
                i14 = i18;
            }
            int i19 = i17 - i4;
            int i20 = i8 - i12;
            int i21 = i11 - i12;
            int i22 = i8;
            while (true) {
                if (i20 >= i22 || i21 >= i11) {
                    i2 = i20;
                    i3 = i21;
                    break;
                }
                i2 = i20;
                i3 = i21;
                if (!C11003.equals(list2.get(i22 - 1), list.get(i11 - 1))) {
                    break;
                }
                i22--;
                i11--;
                i20 = i2;
                i21 = i3;
            }
            int i23 = i8 - i22;
            if (i19 == 0 && i23 == 0) {
                return;
            }
            if (i19 == i13) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C22340(i6, i4 + i13, i5, i15));
                m43623();
                return;
            }
            if (i23 == i12) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C22340(i2, i10, i3, i));
                m43623();
                return;
            }
            int iMo8364 = mo8364(EnumC20224.m46461(i4 == i8), i19, i23, c22340, c22341);
            if (iMo8364 != 0) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C22340(i6, i4 + iMo8364, i5, i16 + iMo8364));
                arrayList.add(new C22340(i8 + iMo8364, i10, i11 + iMo8364, i));
            }
        }
    }
}
