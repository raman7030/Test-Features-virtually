package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11472 extends AbstractC15452 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f34259;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public List f34260;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public List f34261;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public List f34262;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34263;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f34264;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5121 f34265;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f34266;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f34267;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public List f34268;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f34269;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public List f34270;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public List[] f34271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public List f34273;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f34274;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34275;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f34276;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f34277;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34278;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f34279;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List[] f34280;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f34281 = C17780.m41657((Object[]) null);

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28289() {
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo28293() {
    }

    public C11472(int i, String str, String str2) {
        this.f34272 = i;
        this.f34259 = str;
        this.f34269 = str2;
        if ((i & 1024) == 0) {
            this.f34262 = new ArrayList(5);
        }
        this.f34260 = new ArrayList();
        this.f34265 = new C5121();
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28291(int i, String str) {
        if (this.f34264 == null) {
            this.f34264 = new ArrayList(5);
        }
        ArrayList arrayList = this.f34264;
        C13587 c13587 = new C13587();
        c13587.f40530 = str;
        c13587.f40529 = i;
        arrayList.add(c13587);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo26963() {
        return new C15703(new C5827(this));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo26968(String str, boolean z) {
        C15703 c15703 = new C15703(str);
        if (z) {
            this.f34270 = C17780.m41658(this.f34270, c15703);
            return c15703;
        }
        this.f34268 = C17780.m41658(this.f34268, c15703);
        return c15703;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14104 mo26977(int i, C23214 c23214, String str, boolean z) {
        C10725 c10725 = new C10725(i, c23214, str);
        if (z) {
            this.f34277 = C17780.m41658(this.f34277, c10725);
            return c10725;
        }
        this.f34261 = C17780.m41658(this.f34261, c10725);
        return c10725;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28283(int i, boolean z) {
        if (z) {
            this.f34266 = i;
        } else {
            this.f34278 = i;
        }
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo26964(int i, String str, boolean z) {
        C15703 c15703 = new C15703(str);
        String str2 = this.f34269;
        if (z) {
            if (this.f34280 == null) {
                this.f34280 = new List[C11926.m29089(str2)];
            }
            List[] listArr = this.f34280;
            listArr[i] = C17780.m41658(listArr[i], c15703);
            return c15703;
        }
        if (this.f34271 == null) {
            this.f34271 = new List[C11926.m29089(str2)];
        }
        List[] listArr2 = this.f34271;
        listArr2[i] = C17780.m41658(listArr2[i], c15703);
        return c15703;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28288(C16864 c16864) {
        this.f34273 = C17780.m41658(this.f34273, c16864);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26969(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = new Object[objArr.length];
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object objM28278 = objArr[i4];
                if (objM28278 instanceof C1342) {
                    objM28278 = m28278((C1342) objM28278);
                }
                objArr3[i4] = objM28278;
            }
        }
        if (objArr2 == null) {
            objArr4 = null;
        } else {
            objArr4 = new Object[objArr2.length];
            int length2 = objArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                Object objM28279 = objArr2[i5];
                if (objM28279 instanceof C1342) {
                    objM28279 = m28278((C1342) objM28279);
                }
                objArr4[i5] = objM28279;
            }
        }
        C3710 c3710 = new C3710(-1);
        c3710.f11707 = i;
        if (i == -1 || i == 0) {
            c3710.f11708 = C17780.m41655(i2, objArr3);
            c3710.f11706 = C17780.m41655(i3, objArr4);
        } else if (i == 1) {
            c3710.f11708 = C17780.m41655(i2, objArr3);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i6 = 0; i6 < i2; i6++) {
                arrayList.add(null);
            }
            c3710.f11708 = arrayList;
        } else if (i != 3) {
            if (i == 4) {
                c3710.f11706 = C17780.m41655(1, objArr4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        this.f34265.m14666(c3710);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28279(int i) {
        this.f34265.m14666(new C0887(i));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28290(int i, int i2) {
        C7943 c7943 = new C7943(i);
        c7943.f24566 = i2;
        this.f34265.m14666(c7943);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo28295(int i, int i2) {
        C17074 c17074 = new C17074(i);
        c17074.f52349 = i2;
        this.f34265.m14666(c17074);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ */
    public final void mo26978(int i, String str) {
        C16368 c16368 = new C16368(i);
        c16368.f50357 = str;
        this.f34265.m14666(c16368);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26972(String str, int i, String str2, String str3) {
        C2299 c2299 = new C2299(i);
        c2299.f7424 = str;
        c2299.f7423 = str2;
        c2299.f7425 = str3;
        this.f34265.m14666(c2299);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo12089(int i, String str, String str2, String str3, boolean z) {
        if (this.f47310 >= 327680 || (i & 256) != 0) {
            C10061 c10061 = new C10061(i & (-257));
            c10061.f30239 = str;
            c10061.f30240 = str2;
            c10061.f30241 = str3;
            c10061.f30238 = z;
            this.f34265.m14666(c10061);
            return;
        }
        super.mo12089(i, str, str2, str3, z);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26974(String str, String str2, C0636 c0636, Object... objArr) {
        C14998 c14998 = new C14998(186);
        c14998.f45750 = str;
        c14998.f45751 = str2;
        c14998.f45752 = c0636;
        c14998.f45749 = objArr;
        this.f34265.m14666(c14998);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28282(int i, C1342 c1342) {
        C22055 c22055M28278 = m28278(c1342);
        C21350 c21350 = new C21350(i);
        c21350.f68788 = c22055M28278;
        this.f34265.m14666(c21350);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28284(C1342 c1342) {
        this.f34265.m14666(m28278(c1342));
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26971(Object obj) {
        C19939 c19939 = new C19939(18);
        c19939.f64596 = obj;
        this.f34265.m14666(c19939);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28280(int i, int i2) {
        C18527 c18527 = new C18527(132);
        c18527.f57401 = i;
        c18527.f57402 = i2;
        this.f34265.m14666(c18527);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28281(int i, int i2, C1342 c1342, C1342... c1342Arr) {
        C22055 c22055M28278 = m28278(c1342);
        C22055[] c22055ArrM28277 = m28277(c1342Arr);
        C7238 c7238 = new C7238(170);
        c7238.f22189 = i;
        c7238.f22190 = i2;
        c7238.f22191 = c22055M28278;
        c7238.f22188 = C17780.m41657(c22055ArrM28277);
        this.f34265.m14666(c7238);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28285(C1342 c1342, int[] iArr, C1342[] c1342Arr) {
        C22055 c22055M28278 = m28278(c1342);
        C22055[] c22055ArrM28277 = m28277(c1342Arr);
        C12177 c12177 = new C12177(171);
        c12177.f36317 = c22055M28278;
        c12177.f36315 = C17780.m41656(iArr);
        c12177.f36316 = C17780.m41657(c22055ArrM28277);
        this.f34265.m14666(c12177);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26970(int i, String str) {
        C22760 c22760 = new C22760(197);
        c22760.f73490 = str;
        c22760.f73489 = i;
        this.f34265.m14666(c22760);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo26965(int i, C23214 c23214, String str, boolean z) {
        AbstractC8649 last = this.f34265.getLast();
        while (last.f26403 == -1) {
            last = last.f26402;
        }
        C10725 c10725 = new C10725(i, c23214, str);
        if (z) {
            last.f26400 = C17780.m41658(last.f26400, c10725);
            return c10725;
        }
        last.f26399 = C17780.m41658(last.f26399, c10725);
        return c10725;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26975(C1342 c1342, C1342 c1343, C1342 c1344, String str) {
        C22055 c22055M28278 = m28278(c1342);
        C22055 c22055M28279 = m28278(c1343);
        C22055 c22055M282710 = m28278(c1344);
        C1552 c1552 = new C1552();
        c1552.f5469 = c22055M28278;
        c1552.f5464 = c22055M28279;
        c1552.f5465 = c22055M282710;
        c1552.f5468 = str;
        this.f34260 = C17780.m41658(this.f34260, c1552);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14104 mo26976(int i, C23214 c23214, String str, boolean z) {
        C1552 c1552 = (C1552) this.f34260.get((16776960 & i) >> 8);
        C10725 c10725 = new C10725(i, c23214, str);
        if (z) {
            c1552.f5466 = C17780.m41658(c1552.f5466, c10725);
            return c10725;
        }
        c1552.f5467 = C17780.m41658(c1552.f5467, c10725);
        return c10725;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final void mo26973(String str, String str2, String str3, C1342 c1342, C1342 c1343, int i) {
        C22055 c22055M28278 = m28278(c1342);
        C22055 c22055M28279 = m28278(c1343);
        C12882 c12882 = new C12882();
        c12882.f38678 = str;
        c12882.f38673 = str2;
        c12882.f38677 = str3;
        c12882.f38675 = c22055M28278;
        c12882.f38674 = c22055M28279;
        c12882.f38676 = i;
        this.f34262 = C17780.m41658(this.f34262, c12882);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14104 mo26966(int i, C23214 c23214, C1342[] c1342Arr, C1342[] c1342Arr2, int[] iArr, String str, boolean z) {
        C22055[] c22055ArrM28277 = m28277(c1342Arr);
        C22055[] c22055ArrM28278 = m28277(c1342Arr2);
        C3005 c3005 = new C3005(i, c23214, str, 0);
        c3005.f9469 = C17780.m41657(c22055ArrM28277);
        c3005.f9470 = C17780.m41657(c22055ArrM28278);
        c3005.f9468 = C17780.m41656(iArr);
        if (z) {
            this.f34279 = C17780.m41658(this.f34279, c3005);
            return c3005;
        }
        this.f34267 = C17780.m41658(this.f34267, c3005);
        return c3005;
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo28292(int i, C1342 c1342) {
        C22055 c22055M28278 = m28278(c1342);
        C4416 c4416 = new C4416(-1);
        c4416.f14126 = i;
        c4416.f14125 = c22055M28278;
        this.f34265.m14666(c4416);
    }

    @Override // l.AbstractC15452
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo28294(int i, int i2) {
        this.f34276 = i;
        this.f34275 = i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22055 m28278(C1342 c1342) {
        if (!C12354.m29972(c1342.f4884)) {
            c1342.f4884 = new C22055();
        }
        return c1342.f4884;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22055[] m28277(C1342[] c1342Arr) {
        C22055[] c22055Arr = new C22055[c1342Arr.length];
        int length = c1342Arr.length;
        for (int i = 0; i < length; i++) {
            c22055Arr[i] = m28278(c1342Arr[i]);
        }
        return c22055Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28286(C6987 c6987) {
        ArrayList arrayList = this.f34281;
        String[] strArr = arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
        m28287(c6987.mo18880(this.f34272, this.f34259, this.f34269, (String) null, strArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28287(AbstractC15452 abstractC15452) {
        ArrayList arrayList = this.f34264;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C13587 c13587 = (C13587) this.f34264.get(i);
                abstractC15452.mo28291(c13587.f40529, c13587.f40530);
            }
        }
        if (this.f34274 != null) {
            AbstractC14104 abstractC14104Mo26963 = abstractC15452.mo26963();
            C15703.m37036(abstractC14104Mo26963, (String) null, this.f34274);
            if (abstractC14104Mo26963 != null) {
                abstractC14104Mo26963.mo20790();
            }
        }
        List list = this.f34270;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C15703 c15703 = (C15703) this.f34270.get(i2);
                c15703.m37037(abstractC15452.mo26968(c15703.f48452, true));
            }
        }
        List list2 = this.f34268;
        if (list2 != null) {
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C15703 c15704 = (C15703) this.f34268.get(i3);
                c15704.m37037(abstractC15452.mo26968(c15704.f48452, false));
            }
        }
        List list3 = this.f34277;
        if (list3 != null) {
            int size4 = list3.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C10725 c10725 = (C10725) this.f34277.get(i4);
                c10725.m37037(abstractC15452.mo26977(c10725.f32310, c10725.f32311, c10725.f48452, true));
            }
        }
        List list4 = this.f34261;
        if (list4 != null) {
            int size5 = list4.size();
            for (int i5 = 0; i5 < size5; i5++) {
                C10725 c10726 = (C10725) this.f34261.get(i5);
                c10726.m37037(abstractC15452.mo26977(c10726.f32310, c10726.f32311, c10726.f48452, false));
            }
        }
        int i6 = this.f34266;
        if (i6 > 0) {
            abstractC15452.mo28283(i6, true);
        }
        List[] listArr = this.f34280;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                List list5 = this.f34280[i7];
                if (list5 != null) {
                    int size6 = list5.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        C15703 c15705 = (C15703) list5.get(i8);
                        c15705.m37037(abstractC15452.mo26964(i7, c15705.f48452, true));
                    }
                }
            }
        }
        int i9 = this.f34278;
        if (i9 > 0) {
            abstractC15452.mo28283(i9, false);
        }
        List[] listArr2 = this.f34271;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                List list6 = this.f34271[i10];
                if (list6 != null) {
                    int size7 = list6.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        C15703 c15706 = (C15703) list6.get(i11);
                        c15706.m37037(abstractC15452.mo26964(i10, c15706.f48452, false));
                    }
                }
            }
        }
        boolean z = this.f34263;
        C5121 c5121 = this.f34265;
        if (z) {
            c5121.m14669();
        }
        List list7 = this.f34273;
        if (list7 != null) {
            int size8 = list7.size();
            for (int i12 = 0; i12 < size8; i12++) {
                abstractC15452.mo28288((C16864) this.f34273.get(i12));
            }
        }
        if (c5121.size() > 0) {
            abstractC15452.mo28289();
            List list8 = this.f34260;
            if (list8 != null) {
                int size9 = list8.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    C1552 c1552 = (C1552) this.f34260.get(i13);
                    int i14 = (i13 << 8) | 1107296256;
                    List list9 = c1552.f5466;
                    if (list9 != null) {
                        int size10 = list9.size();
                        for (int i15 = 0; i15 < size10; i15++) {
                            ((C10725) c1552.f5466.get(i15)).f32310 = i14;
                        }
                    }
                    List list10 = c1552.f5467;
                    if (list10 != null) {
                        int size11 = list10.size();
                        for (int i16 = 0; i16 < size11; i16++) {
                            ((C10725) c1552.f5467.get(i16)).f32310 = i14;
                        }
                    }
                    C1552 c1553 = (C1552) this.f34260.get(i13);
                    C1342 c1342M49617 = c1553.f5469.m49617();
                    C1342 c1342M49618 = c1553.f5464.m49617();
                    C22055 c22055 = c1553.f5465;
                    abstractC15452.mo26975(c1342M49617, c1342M49618, c22055 == null ? null : c22055.m49617(), c1553.f5468);
                    List list11 = c1553.f5466;
                    if (list11 != null) {
                        int size12 = list11.size();
                        for (int i17 = 0; i17 < size12; i17++) {
                            C10725 c10727 = (C10725) c1553.f5466.get(i17);
                            c10727.m37037(abstractC15452.mo26976(c10727.f32310, c10727.f32311, c10727.f48452, true));
                        }
                    }
                    List list12 = c1553.f5467;
                    if (list12 != null) {
                        int size13 = list12.size();
                        for (int i18 = 0; i18 < size13; i18++) {
                            C10725 c10728 = (C10725) c1553.f5467.get(i18);
                            c10728.m37037(abstractC15452.mo26976(c10728.f32310, c10728.f32311, c10728.f48452, false));
                        }
                    }
                }
            }
            c5121.m14668(abstractC15452);
            List list13 = this.f34262;
            if (list13 != null) {
                int size14 = list13.size();
                for (int i19 = 0; i19 < size14; i19++) {
                    C12882 c12882 = (C12882) this.f34262.get(i19);
                    abstractC15452.mo26973(c12882.f38678, c12882.f38673, c12882.f38677, c12882.f38675.m49617(), c12882.f38674.m49617(), c12882.f38676);
                }
            }
            List list14 = this.f34279;
            if (list14 != null) {
                int size15 = list14.size();
                for (int i20 = 0; i20 < size15; i20++) {
                    ((C3005) this.f34279.get(i20)).m9171(abstractC15452, true);
                }
            }
            List list15 = this.f34267;
            if (list15 != null) {
                int size16 = list15.size();
                for (int i21 = 0; i21 < size16; i21++) {
                    ((C3005) this.f34267.get(i21)).m9171(abstractC15452, false);
                }
            }
            abstractC15452.mo28294(this.f34276, this.f34275);
            this.f34263 = true;
        }
        abstractC15452.mo28293();
    }
}
