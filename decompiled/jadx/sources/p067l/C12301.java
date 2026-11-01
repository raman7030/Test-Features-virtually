package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12301 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ List f34339;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ InterfaceC8848 f34341;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C16223 f34342;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ List f34343;

    /* JADX INFO: renamed from: ܽ */
    public CharSequence f34340 = null;

    /* JADX INFO: renamed from: ֫ */
    public int f34337 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f34338 = 0;

    public C12301(InterfaceC8848 interfaceC8848, List list, List list2, C16223 c16223) {
        this.f34341 = interfaceC8848;
        this.f34339 = list;
        this.f34343 = list2;
        this.f34342 = c16223;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28336() {
        InterfaceC8848 interfaceC8848 = this.f34341;
        for (C23600 c23600 : interfaceC8848.mo8421()) {
            int i = c23600.f75121;
            int i2 = c23600.f75123;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c23600.f75124 + i4;
                C24370 c24370 = (C24370) this.f34339.get(i5);
                C24370 c24371 = (C24370) this.f34343.get(i6);
                if (!C13061.m29893(this.f34340, c24370.m53725())) {
                    if (c24370.equals(c24371)) {
                        m28335(i5, i6);
                        this.f34342.m43007(i5, i6, 1);
                    } else {
                        m28335(i5, i6);
                        this.f34340 = c24370.m53725();
                    }
                }
            }
        }
        m28335(interfaceC8848.mo8424(), interfaceC8848.mo8425());
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28335(int i, int i2) {
        List list;
        List list2;
        if (this.f34340 == null) {
            return;
        }
        int i3 = this.f34337;
        C16223 c16223 = this.f34342;
        int iMax = Math.max(i3, c16223.m43008());
        int iMax2 = Math.max(this.f34338, c16223.m43010());
        C17441 c17441 = new C17441();
        C17441 c17442 = new C17441();
        while (true) {
            list = this.f34339;
            if (iMax >= i) {
                break;
            }
            if (C13061.m29893(this.f34340, ((C24370) list.get(iMax)).m53725())) {
                c17441.add(iMax);
                this.f34337 = iMax + 1;
            }
            iMax++;
        }
        while (true) {
            list2 = this.f34343;
            if (iMax2 >= i2) {
                break;
            }
            if (C13061.m29893(this.f34340, ((C24370) list2.get(iMax2)).m53725())) {
                c17442.add(iMax2);
                this.f34338 = iMax2 + 1;
            }
            iMax2++;
        }
        if (Math.max(c17441.size(), c17442.size()) > 10 || c17441.size() == c17442.size()) {
            int iMin = Math.min(c17441.size(), c17442.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                int i5 = c17441.getInt(i4);
                int i6 = c17442.getInt(i4);
                if (((C24370) list.get(i5)).equals(list2.get(i6))) {
                    c16223.m43007(i5, i6, 1);
                }
            }
        } else if (c17441.size() < c17442.size()) {
            int size = c17441.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = i7;
            }
            new C8277(c17442, size, iArr, c17441, list, list2, iArr2).m19073();
            for (int i8 = 0; i8 < c17441.size(); i8++) {
                int i9 = c17441.getInt(i8);
                int i10 = c17442.getInt(iArr2[i8]);
                if (((C24370) list.get(i9)).equals(list2.get(i10))) {
                    c16223.m43007(i9, i10, 1);
                }
            }
        } else {
            int size2 = c17442.size();
            int[] iArr3 = new int[size2];
            int[] iArr4 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr4[i11] = i11;
            }
            new C8277(c17441, size2, iArr3, c17442, list2, list, iArr4).m19073();
            for (int i12 = 0; i12 < c17442.size(); i12++) {
                int i13 = c17441.getInt(iArr4[i12]);
                int i14 = c17442.getInt(i12);
                if (((C24370) list.get(i13)).equals(list2.get(i14))) {
                    c16223.m43007(i13, i14, 1);
                }
            }
        }
        this.f34340 = null;
    }
}
