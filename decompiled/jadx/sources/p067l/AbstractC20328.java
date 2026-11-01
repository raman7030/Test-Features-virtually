package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1LP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC20328 {

    /* JADX INFO: renamed from: ֫ */
    public final List f62792;

    /* JADX INFO: renamed from: ۧ */
    public final List f62793;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8848 f62794;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f62795 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo10410(EnumC21589 enumC21589, int i, int i2, C23600 c23600, C23600 c23601);

    public AbstractC20328(List list, List list2, InterfaceC8848 interfaceC8848) {
        this.f62792 = list;
        this.f62793 = list2;
        this.f62794 = interfaceC8848;
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC8848 m45890() {
        Iterator it = this.f62794.mo8421().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList = this.f62795;
            if (zHasNext) {
                arrayList.add((C23600) it.next());
                m45889();
            } else {
                return C24941.m54812(C24941.m54808(this.f62792.size(), this.f62793.size(), arrayList));
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m45889() {
        List list;
        int i;
        List list2;
        int i2;
        int i3;
        AbstractC20328 abstractC20328 = this;
        ArrayList arrayList = abstractC20328.f62795;
        if (arrayList.size() < 2) {
            return;
        }
        C23600 c23600 = (C23600) C20013.m45383(arrayList, 2);
        C23600 c23601 = (C23600) C20013.m45383(arrayList, 1);
        int i4 = c23600.f75121;
        int i5 = c23600.f75124;
        int i6 = c23600.f75123;
        int i7 = c23600.f75122;
        int i8 = c23601.f75123;
        int i9 = c23601.f75122;
        int i10 = c23601.f75121;
        int i11 = c23601.f75124;
        if (i4 == i8 || i7 == i11) {
            int i12 = i4 - i6;
            int i13 = i10 - i8;
            int i14 = i4 + i13;
            int i15 = i7 + i13;
            int i16 = i7;
            int i17 = i4;
            while (true) {
                list = abstractC20328.f62793;
                i = i9;
                list2 = abstractC20328.f62792;
                if (i17 >= i14 || i16 >= i15) {
                    break;
                }
                int i18 = i14;
                if (!C12826.equals(list2.get(i17), list.get(i16))) {
                    break;
                }
                i17++;
                i16++;
                abstractC20328 = this;
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
                if (!C12826.equals(list2.get(i22 - 1), list.get(i11 - 1))) {
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
                arrayList.add(new C23600(i6, i4 + i13, i5, i15));
                m45889();
                return;
            }
            if (i23 == i12) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C23600(i2, i10, i3, i));
                m45889();
                return;
            }
            int iMo10410 = mo10410(EnumC21589.m48781(i4 == i8), i19, i23, c23600, c23601);
            if (iMo10410 != 0) {
                arrayList.remove(arrayList.size() - 1);
                arrayList.remove(arrayList.size() - 1);
                arrayList.add(new C23600(i6, i4 + iMo10410, i5, i16 + iMo10410));
                arrayList.add(new C23600(i8 + iMo10410, i10, i11 + iMo10410, i));
            }
        }
    }
}
