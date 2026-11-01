package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J6B2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13271 extends AbstractC17054 {

    /* JADX INFO: renamed from: ֡ */
    public String f37255;

    /* JADX INFO: renamed from: ֨ */
    public List f37256;

    /* JADX INFO: renamed from: ۖ */
    public List f37257;

    /* JADX INFO: renamed from: ۘ */
    public List f37258;

    /* JADX INFO: renamed from: ۙ */
    public boolean f37259;

    /* JADX INFO: renamed from: ۚ */
    public ArrayList f37260;

    /* JADX INFO: renamed from: ۜ */
    public C7235 f37261;

    /* JADX INFO: renamed from: ۠ */
    public int f37262;

    /* JADX INFO: renamed from: ۡ */
    public List f37263;

    /* JADX INFO: renamed from: ۢ */
    public List f37264;

    /* JADX INFO: renamed from: ܳ */
    public String f37265;

    /* JADX INFO: renamed from: ܶ */
    public List f37266;

    /* JADX INFO: renamed from: ܺ */
    public List[] f37267;

    /* JADX INFO: renamed from: ܽ */
    public int f37268;

    /* JADX INFO: renamed from: ܿ */
    public List f37269;

    /* JADX INFO: renamed from: ᩳ */
    public Object f37270;

    /* JADX INFO: renamed from: ᩴ */
    public int f37271;

    /* JADX INFO: renamed from: ᩵ */
    public int f37272;

    /* JADX INFO: renamed from: ᩶ */
    public List f37273;

    /* JADX INFO: renamed from: ᩷ */
    public int f37274;

    /* JADX INFO: renamed from: ᩸ */
    public List f37275;

    /* JADX INFO: renamed from: ᩹ */
    public List[] f37276;

    /* JADX INFO: renamed from: ᩻ */
    public ArrayList f37277 = C19266.m43903((Object[]) null);

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final void mo30333() {
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final void mo30337() {
    }

    public C13271(int i, String str, String str2) {
        this.f37268 = i;
        this.f37255 = str;
        this.f37265 = str2;
        if ((i & 1024) == 0) {
            this.f37258 = new ArrayList(5);
        }
        this.f37256 = new ArrayList();
        this.f37261 = new C7235();
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final void mo30335(int i, String str) {
        if (this.f37260 == null) {
            this.f37260 = new ArrayList(5);
        }
        ArrayList arrayList = this.f37260;
        C15281 c15281 = new C15281();
        c15281.f43607 = str;
        c15281.f43606 = i;
        arrayList.add(c15281);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29008() {
        return new C17292(new C7906(this));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29013(String str, boolean z) {
        C17292 c17292 = new C17292(str);
        if (z) {
            this.f37266 = C19266.m43904(this.f37266, c17292);
            return c17292;
        }
        this.f37264 = C19266.m43904(this.f37264, c17292);
        return c17292;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC15773 mo29022(int i, C24431 c24431, String str, boolean z) {
        C12561 c12561 = new C12561(i, c24431, str);
        if (z) {
            this.f37273 = C19266.m43904(this.f37273, c12561);
            return c12561;
        }
        this.f37257 = C19266.m43904(this.f37257, c12561);
        return c12561;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30327(int i, boolean z) {
        if (z) {
            this.f37262 = i;
        } else {
            this.f37274 = i;
        }
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29009(int i, String str, boolean z) {
        C17292 c17292 = new C17292(str);
        String str2 = this.f37265;
        if (z) {
            if (this.f37276 == null) {
                this.f37276 = new List[C13703.m31142(str2)];
            }
            List[] listArr = this.f37276;
            listArr[i] = C19266.m43904(listArr[i], c17292);
            return c17292;
        }
        if (this.f37267 == null) {
            this.f37267 = new List[C13703.m31142(str2)];
        }
        List[] listArr2 = this.f37267;
        listArr2[i] = C19266.m43904(listArr2[i], c17292);
        return c17292;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30332(C18396 c18396) {
        this.f37269 = C19266.m43904(this.f37269, c18396);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29014(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = new Object[objArr.length];
            int length = objArr.length;
            for (int i4 = 0; i4 < length; i4++) {
                Object objM30322 = objArr[i4];
                if (objM30322 instanceof C3644) {
                    objM30322 = m30322((C3644) objM30322);
                }
                objArr3[i4] = objM30322;
            }
        }
        if (objArr2 == null) {
            objArr4 = null;
        } else {
            objArr4 = new Object[objArr2.length];
            int length2 = objArr2.length;
            for (int i5 = 0; i5 < length2; i5++) {
                Object objM30323 = objArr2[i5];
                if (objM30323 instanceof C3644) {
                    objM30323 = m30322((C3644) objM30323);
                }
                objArr4[i5] = objM30323;
            }
        }
        C5894 c5894 = new C5894(-1);
        c5894.f14508 = i;
        if (i == -1 || i == 0) {
            c5894.f14509 = C19266.m43901(i2, objArr3);
            c5894.f14507 = C19266.m43901(i3, objArr4);
        } else if (i == 1) {
            c5894.f14509 = C19266.m43901(i2, objArr3);
        } else if (i == 2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i6 = 0; i6 < i2; i6++) {
                arrayList.add(null);
            }
            c5894.f14509 = arrayList;
        } else if (i != 3) {
            if (i == 4) {
                c5894.f14507 = C19266.m43901(1, objArr4);
            } else {
                throw new IllegalArgumentException();
            }
        }
        this.f37261.m16574(c5894);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30323(int i) {
        this.f37261.m16574(new C3211(i));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final void mo30334(int i, int i2) {
        C9917 c9917 = new C9917(i);
        c9917.f27479 = i2;
        this.f37261.m16574(c9917);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ᩳ */
    public final void mo30339(int i, int i2) {
        C18595 c18595 = new C18595(i);
        c18595.f55531 = i2;
        this.f37261.m16574(c18595);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final void mo29023(int i, String str) {
        C17924 c17924 = new C17924(i);
        c17924.f53530 = str;
        this.f37261.m16574(c17924);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29017(String str, int i, String str2, String str3) {
        C4553 c4553 = new C4553(i);
        c4553.f10210 = str;
        c4553.f10209 = str2;
        c4553.f10211 = str3;
        this.f37261.m16574(c4553);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo14009(int i, String str, String str2, String str3, boolean z) {
        if (this.f50439 >= 327680 || (i & 256) != 0) {
            C11930 c11930 = new C11930(i & (-257));
            c11930.f33197 = str;
            c11930.f33198 = str2;
            c11930.f33199 = str3;
            c11930.f33196 = z;
            this.f37261.m16574(c11930);
            return;
        }
        super.mo14009(i, str, str2, str3, z);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29019(String str, String str2, C2973 c2973, Object... objArr) {
        C16622 c16622 = new C16622(186);
        c16622.f48863 = str;
        c16622.f48864 = str2;
        c16622.f48865 = c2973;
        c16622.f48862 = objArr;
        this.f37261.m16574(c16622);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30326(int i, C3644 c3644) {
        C23329 c23329M30322 = m30322(c3644);
        C22659 c22659 = new C22659(i);
        c22659.f71482 = c23329M30322;
        this.f37261.m16574(c22659);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30328(C3644 c3644) {
        this.f37261.m16574(m30322(c3644));
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29016(Object obj) {
        C21318 c21318 = new C21318(18);
        c21318.f67233 = obj;
        this.f37261.m16574(c21318);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30324(int i, int i2) {
        C19976 c19976 = new C19976(132);
        c19976.f60622 = i;
        c19976.f60623 = i2;
        this.f37261.m16574(c19976);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30325(int i, int i2, C3644 c3644, C3644... c3644Arr) {
        C23329 c23329M30322 = m30322(c3644);
        C23329[] c23329ArrM30321 = m30321(c3644Arr);
        C9247 c9247 = new C9247(170);
        c9247.f25072 = i;
        c9247.f25073 = i2;
        c9247.f25074 = c23329M30322;
        c9247.f25071 = C19266.m43903(c23329ArrM30321);
        this.f37261.m16574(c9247);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo30329(C3644 c3644, int[] iArr, C3644[] c3644Arr) {
        C23329 c23329M30322 = m30322(c3644);
        C23329[] c23329ArrM30321 = m30321(c3644Arr);
        C13941 c13941 = new C13941(171);
        c13941.f39328 = c23329M30322;
        c13941.f39326 = C19266.m43902(iArr);
        c13941.f39327 = C19266.m43903(c23329ArrM30321);
        this.f37261.m16574(c13941);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29015(int i, String str) {
        C23999 c23999 = new C23999(197);
        c23999.f76216 = str;
        c23999.f76215 = i;
        this.f37261.m16574(c23999);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29010(int i, C24431 c24431, String str, boolean z) {
        AbstractC10588 last = this.f37261.getLast();
        while (last.f29321 == -1) {
            last = last.f29320;
        }
        C12561 c12561 = new C12561(i, c24431, str);
        if (z) {
            last.f29318 = C19266.m43904(last.f29318, c12561);
            return c12561;
        }
        last.f29317 = C19266.m43904(last.f29317, c12561);
        return c12561;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29020(C3644 c3644, C3644 c3645, C3644 c3646, String str) {
        C23329 c23329M30322 = m30322(c3644);
        C23329 c23329M30323 = m30322(c3645);
        C23329 c23329M30324 = m30322(c3646);
        C3843 c3843 = new C3843();
        c3843.f8250 = c23329M30322;
        c3843.f8245 = c23329M30323;
        c3843.f8246 = c23329M30324;
        c3843.f8249 = str;
        this.f37256 = C19266.m43904(this.f37256, c3843);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15773 mo29021(int i, C24431 c24431, String str, boolean z) {
        C3843 c3843 = (C3843) this.f37256.get((16776960 & i) >> 8);
        C12561 c12561 = new C12561(i, c24431, str);
        if (z) {
            c3843.f8247 = C19266.m43904(c3843.f8247, c12561);
            return c12561;
        }
        c3843.f8248 = C19266.m43904(c3843.f8248, c12561);
        return c12561;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final void mo29018(String str, String str2, String str3, C3644 c3644, C3644 c3645, int i) {
        C23329 c23329M30322 = m30322(c3644);
        C23329 c23329M30323 = m30322(c3645);
        C14611 c14611 = new C14611();
        c14611.f41721 = str;
        c14611.f41716 = str2;
        c14611.f41720 = str3;
        c14611.f41718 = c23329M30322;
        c14611.f41717 = c23329M30323;
        c14611.f41719 = i;
        this.f37258 = C19266.m43904(this.f37258, c14611);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15773 mo29011(int i, C24431 c24431, C3644[] c3644Arr, C3644[] c3644Arr2, int[] iArr, String str, boolean z) {
        C23329[] c23329ArrM30321 = m30321(c3644Arr);
        C23329[] c23329ArrM30322 = m30321(c3644Arr2);
        C5224 c5224 = new C5224(i, c24431, str, 0);
        c5224.f12267 = C19266.m43903(c23329ArrM30321);
        c5224.f12268 = C19266.m43903(c23329ArrM30322);
        c5224.f12266 = C19266.m43902(iArr);
        if (z) {
            this.f37275 = C19266.m43904(this.f37275, c5224);
            return c5224;
        }
        this.f37263 = C19266.m43904(this.f37263, c5224);
        return c5224;
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ۧ */
    public final void mo30336(int i, C3644 c3644) {
        C23329 c23329M30322 = m30322(c3644);
        C6565 c6565 = new C6565(-1);
        c6565.f16942 = i;
        c6565.f16941 = c23329M30322;
        this.f37261.m16574(c6565);
    }

    @Override // p067l.AbstractC17054
    /* JADX INFO: renamed from: ܽ */
    public final void mo30338(int i, int i2) {
        this.f37272 = i;
        this.f37271 = i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23329 m30322(C3644 c3644) {
        if (!C14110.m32033(c3644.f7654)) {
            c3644.f7654 = new C23329();
        }
        return c3644.f7654;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23329[] m30321(C3644[] c3644Arr) {
        C23329[] c23329Arr = new C23329[c3644Arr.length];
        int length = c3644Arr.length;
        for (int i = 0; i < length; i++) {
            c23329Arr[i] = m30322(c3644Arr[i]);
        }
        return c23329Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30330(C9009 c9009) {
        ArrayList arrayList = this.f37277;
        String[] strArr = arrayList == null ? null : (String[]) arrayList.toArray(new String[0]);
        m30331(c9009.mo20834(this.f37268, this.f37255, this.f37265, (String) null, strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30331(AbstractC17054 abstractC17054) {
        ArrayList arrayList = this.f37260;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C15281 c15281 = (C15281) this.f37260.get(i);
                abstractC17054.mo30335(c15281.f43606, c15281.f43607);
            }
        }
        if (this.f37270 != null) {
            AbstractC15773 abstractC15773Mo29008 = abstractC17054.mo29008();
            C17292.m39203(abstractC15773Mo29008, (String) null, this.f37270);
            if (abstractC15773Mo29008 != null) {
                abstractC15773Mo29008.mo22771();
            }
        }
        List list = this.f37266;
        if (list != null) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C17292 c17292 = (C17292) this.f37266.get(i2);
                c17292.m39204(abstractC17054.mo29013(c17292.f51590, true));
            }
        }
        List list2 = this.f37264;
        if (list2 != null) {
            int size3 = list2.size();
            for (int i3 = 0; i3 < size3; i3++) {
                C17292 c17293 = (C17292) this.f37264.get(i3);
                c17293.m39204(abstractC17054.mo29013(c17293.f51590, false));
            }
        }
        List list3 = this.f37273;
        if (list3 != null) {
            int size4 = list3.size();
            for (int i4 = 0; i4 < size4; i4++) {
                C12561 c12561 = (C12561) this.f37273.get(i4);
                c12561.m39204(abstractC17054.mo29022(c12561.f35284, c12561.f35285, c12561.f51590, true));
            }
        }
        List list4 = this.f37257;
        if (list4 != null) {
            int size5 = list4.size();
            for (int i5 = 0; i5 < size5; i5++) {
                C12561 c12562 = (C12561) this.f37257.get(i5);
                c12562.m39204(abstractC17054.mo29022(c12562.f35284, c12562.f35285, c12562.f51590, false));
            }
        }
        int i6 = this.f37262;
        if (i6 > 0) {
            abstractC17054.mo30327(i6, true);
        }
        List[] listArr = this.f37276;
        if (listArr != null) {
            int length = listArr.length;
            for (int i7 = 0; i7 < length; i7++) {
                List list5 = this.f37276[i7];
                if (list5 != null) {
                    int size6 = list5.size();
                    for (int i8 = 0; i8 < size6; i8++) {
                        C17292 c17294 = (C17292) list5.get(i8);
                        c17294.m39204(abstractC17054.mo29009(i7, c17294.f51590, true));
                    }
                }
            }
        }
        int i9 = this.f37274;
        if (i9 > 0) {
            abstractC17054.mo30327(i9, false);
        }
        List[] listArr2 = this.f37267;
        if (listArr2 != null) {
            int length2 = listArr2.length;
            for (int i10 = 0; i10 < length2; i10++) {
                List list6 = this.f37267[i10];
                if (list6 != null) {
                    int size7 = list6.size();
                    for (int i11 = 0; i11 < size7; i11++) {
                        C17292 c17295 = (C17292) list6.get(i11);
                        c17295.m39204(abstractC17054.mo29009(i10, c17295.f51590, false));
                    }
                }
            }
        }
        boolean z = this.f37259;
        C7235 c7235 = this.f37261;
        if (z) {
            c7235.m16577();
        }
        List list7 = this.f37269;
        if (list7 != null) {
            int size8 = list7.size();
            for (int i12 = 0; i12 < size8; i12++) {
                abstractC17054.mo30332((C18396) this.f37269.get(i12));
            }
        }
        if (c7235.size() > 0) {
            abstractC17054.mo30333();
            List list8 = this.f37256;
            if (list8 != null) {
                int size9 = list8.size();
                for (int i13 = 0; i13 < size9; i13++) {
                    C3843 c3843 = (C3843) this.f37256.get(i13);
                    int i14 = (i13 << 8) | 1107296256;
                    List list9 = c3843.f8247;
                    if (list9 != null) {
                        int size10 = list9.size();
                        for (int i15 = 0; i15 < size10; i15++) {
                            ((C12561) c3843.f8247.get(i15)).f35284 = i14;
                        }
                    }
                    List list10 = c3843.f8248;
                    if (list10 != null) {
                        int size11 = list10.size();
                        for (int i16 = 0; i16 < size11; i16++) {
                            ((C12561) c3843.f8248.get(i16)).f35284 = i14;
                        }
                    }
                    C3843 c3844 = (C3843) this.f37256.get(i13);
                    C3644 c3644M51953 = c3844.f8250.m51953();
                    C3644 c3644M51954 = c3844.f8245.m51953();
                    C23329 c23329 = c3844.f8246;
                    abstractC17054.mo29020(c3644M51953, c3644M51954, c23329 == null ? null : c23329.m51953(), c3844.f8249);
                    List list11 = c3844.f8247;
                    if (list11 != null) {
                        int size12 = list11.size();
                        for (int i17 = 0; i17 < size12; i17++) {
                            C12561 c12563 = (C12561) c3844.f8247.get(i17);
                            c12563.m39204(abstractC17054.mo29021(c12563.f35284, c12563.f35285, c12563.f51590, true));
                        }
                    }
                    List list12 = c3844.f8248;
                    if (list12 != null) {
                        int size13 = list12.size();
                        for (int i18 = 0; i18 < size13; i18++) {
                            C12561 c12564 = (C12561) c3844.f8248.get(i18);
                            c12564.m39204(abstractC17054.mo29021(c12564.f35284, c12564.f35285, c12564.f51590, false));
                        }
                    }
                }
            }
            c7235.m16576(abstractC17054);
            List list13 = this.f37258;
            if (list13 != null) {
                int size14 = list13.size();
                for (int i19 = 0; i19 < size14; i19++) {
                    C14611 c14611 = (C14611) this.f37258.get(i19);
                    abstractC17054.mo29018(c14611.f41721, c14611.f41716, c14611.f41720, c14611.f41718.m51953(), c14611.f41717.m51953(), c14611.f41719);
                }
            }
            List list14 = this.f37275;
            if (list14 != null) {
                int size15 = list14.size();
                for (int i20 = 0; i20 < size15; i20++) {
                    ((C5224) this.f37275.get(i20)).m11222(abstractC17054, true);
                }
            }
            List list15 = this.f37263;
            if (list15 != null) {
                int size16 = list15.size();
                for (int i21 = 0; i21 < size16; i21++) {
                    ((C5224) this.f37263.get(i21)).m11222(abstractC17054, false);
                }
            }
            abstractC17054.mo30338(this.f37272, this.f37271);
            this.f37259 = true;
        }
        abstractC17054.mo30337();
    }
}
