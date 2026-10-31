package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۤᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1MC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10451 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f31376;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6818 f31378;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14578 f31379;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f31380;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public CharSequence f31377 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31374 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31375 = 0;

    public C10451(InterfaceC6818 interfaceC6818, List list, List list2, C14578 c14578) {
        this.f31378 = interfaceC6818;
        this.f31376 = list;
        this.f31380 = list2;
        this.f31379 = c14578;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26307() {
        InterfaceC6818 interfaceC6818 = this.f31378;
        for (C22340 c22340 : interfaceC6818.mo6219()) {
            int i = c22340.f72395;
            int i2 = c22340.f72397;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int i6 = c22340.f72398 + i4;
                C23150 c23150 = (C23150) this.f31376.get(i5);
                C23150 c23151 = (C23150) this.f31380.get(i6);
                if (!C11250.m27831(this.f31377, c23150.m51330())) {
                    if (c23150.equals(c23151)) {
                        m26306(i5, i6);
                        this.f31379.m40750(i5, i6, 1);
                    } else {
                        m26306(i5, i6);
                        this.f31377 = c23150.m51330();
                    }
                }
            }
        }
        m26306(interfaceC6818.mo6222(), interfaceC6818.mo6223());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26306(int i, int i2) {
        List list;
        List list2;
        if (this.f31377 == null) {
            return;
        }
        int i3 = this.f31374;
        C14578 c14578 = this.f31379;
        int iMax = Math.max(i3, c14578.m40751());
        int iMax2 = Math.max(this.f31375, c14578.m40753());
        C15859 c15859 = new C15859();
        C15859 c158510 = new C15859();
        while (true) {
            list = this.f31376;
            if (iMax >= i) {
                break;
            }
            if (C11250.m27831(this.f31377, ((C23150) list.get(iMax)).m51330())) {
                c15859.add(iMax);
                this.f31374 = iMax + 1;
            }
            iMax++;
        }
        while (true) {
            list2 = this.f31380;
            if (iMax2 >= i2) {
                break;
            }
            if (C11250.m27831(this.f31377, ((C23150) list2.get(iMax2)).m51330())) {
                c158510.add(iMax2);
                this.f31375 = iMax2 + 1;
            }
            iMax2++;
        }
        if (Math.max(c15859.size(), c158510.size()) > 10 || c15859.size() == c158510.size()) {
            int iMin = Math.min(c15859.size(), c158510.size());
            for (int i4 = 0; i4 < iMin; i4++) {
                int i5 = c15859.getInt(i4);
                int i6 = c158510.getInt(i4);
                if (((C23150) list.get(i5)).equals(list2.get(i6))) {
                    c14578.m40750(i5, i6, 1);
                }
            }
        } else if (c15859.size() < c158510.size()) {
            int size = c15859.size();
            int[] iArr = new int[size];
            int[] iArr2 = new int[size];
            for (int i7 = 0; i7 < size; i7++) {
                iArr2[i7] = i7;
            }
            new C6217(c158510, size, iArr, c15859, list, list2, iArr2).m17141();
            for (int i8 = 0; i8 < c15859.size(); i8++) {
                int i9 = c15859.getInt(i8);
                int i10 = c158510.getInt(iArr2[i8]);
                if (((C23150) list.get(i9)).equals(list2.get(i10))) {
                    c14578.m40750(i9, i10, 1);
                }
            }
        } else {
            int size2 = c158510.size();
            int[] iArr3 = new int[size2];
            int[] iArr4 = new int[size2];
            for (int i11 = 0; i11 < size2; i11++) {
                iArr4[i11] = i11;
            }
            new C6217(c15859, size2, iArr3, c158510, list2, list, iArr4).m17141();
            for (int i12 = 0; i12 < c158510.size(); i12++) {
                int i13 = c15859.getInt(iArr4[i12]);
                int i14 = c158510.getInt(i12);
                if (((C23150) list.get(i13)).equals(list2.get(i14))) {
                    c14578.m40750(i13, i14, 1);
                }
            }
        }
        this.f31377 = null;
    }
}
