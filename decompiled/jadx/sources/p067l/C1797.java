package p067l;

import android.util.SparseArray;
import android.view.View;
import com.umeng.analytics.pro.C0698cb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩵ۚ */
/* JADX INFO: compiled from: 21CQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C1797 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractC1860 f63817;

    /* JADX INFO: renamed from: ۗ */
    public View f63819;

    /* JADX INFO: renamed from: ۘ */
    public C1027[] f63820;

    /* JADX INFO: renamed from: ۚ */
    public AbstractC1860[] f63822;

    /* JADX INFO: renamed from: ۡ */
    public int[] f63825;

    /* JADX INFO: renamed from: ۢ */
    public double[] f63826;

    /* JADX INFO: renamed from: ۧ */
    public int[] f63827;

    /* JADX INFO: renamed from: ܳ */
    public HashMap f63828;

    /* JADX INFO: renamed from: ܺ */
    public double[] f63830;

    /* JADX INFO: renamed from: ܽ */
    public String[] f63831;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f63833;

    /* JADX INFO: renamed from: ᩷ */
    public int f63837;

    /* JADX INFO: renamed from: ᩹ */
    public HashMap f63839;

    /* JADX INFO: renamed from: ܿ */
    public int f63832 = -1;

    /* JADX INFO: renamed from: ܶ */
    public C1132 f63829 = new C1132();

    /* JADX INFO: renamed from: ᩻ */
    public C1132 f63840 = new C1132();

    /* JADX INFO: renamed from: ᩸ */
    public C1762 f63838 = new C1762();

    /* JADX INFO: renamed from: ۜ */
    public C1762 f63823 = new C1762();

    /* JADX INFO: renamed from: ᩵ */
    public float f63835 = Float.NaN;

    /* JADX INFO: renamed from: ֨ */
    public float f63816 = 0.0f;

    /* JADX INFO: renamed from: ۠ */
    public float f63824 = 1.0f;

    /* JADX INFO: renamed from: ᩶ */
    public float[] f63836 = new float[4];

    /* JADX INFO: renamed from: ᩴ */
    public ArrayList f63834 = new ArrayList();

    /* JADX INFO: renamed from: ۙ */
    public float[] f63821 = new float[1];

    /* JADX INFO: renamed from: ۖ */
    public ArrayList f63818 = new ArrayList();

    /* JADX INFO: renamed from: ֡ */
    public int f63815 = -1;

    /* JADX INFO: renamed from: ֫ */
    public final void m46697(int i) {
    }

    public C1797(View view) {
        this.f63819 = view;
        this.f63837 = view.getId();
        view.getLayoutParams();
    }

    /* JADX INFO: renamed from: ۧ */
    public final float m46705() {
        return this.f63840.f20767;
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m46708() {
        return this.f63840.f20763;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46699(int i, float[] fArr) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap map = this.f63833;
        AbstractC1791 abstractC1791 = map == null ? null : (AbstractC1791) map.get("translationX");
        HashMap map2 = this.f63833;
        AbstractC1791 abstractC1792 = map2 == null ? null : (AbstractC1791) map2.get("translationY");
        HashMap map3 = this.f63828;
        AbstractC1552 abstractC1552 = map3 == null ? null : (AbstractC1552) map3.get("translationX");
        HashMap map4 = this.f63828;
        AbstractC1552 abstractC1553 = map4 != null ? (AbstractC1552) map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.f63824;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f63816;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = (f3 - f6) * f4;
                }
            }
            double dMo24179 = f3;
            C1132 c1132 = this.f63829;
            C1265 c1265 = c1132.f20765;
            float f7 = Float.NaN;
            for (C1132 c1133 : this.f63834) {
                float f8 = f2;
                C1265 c1266 = c1133.f20765;
                if (c1266 != null) {
                    float f9 = c1133.f20776;
                    if (f9 < f3) {
                        f5 = f9;
                        c1265 = c1266;
                    } else if (Float.isNaN(f7)) {
                        f7 = c1133.f20776;
                    }
                }
                f2 = f8;
            }
            float f10 = f2;
            if (c1265 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f11 = f7 - f5;
                dMo24179 = (((float) c1265.mo24179((f3 - f5) / f11)) * f11) + f5;
            }
            this.f63822[0].mo9248(dMo24179, this.f63826);
            AbstractC1860 abstractC1860 = this.f63817;
            if (abstractC1860 != null) {
                double[] dArr = this.f63826;
                if (dArr.length > 0) {
                    abstractC1860.mo9248(dMo24179, dArr);
                }
            }
            int i4 = i3 * 2;
            c1132.m18289(this.f63825, this.f63826, fArr, i4);
            if (abstractC1552 != null) {
                fArr[i4] = abstractC1552.m36265(f3) + fArr[i4];
            } else if (abstractC1791 != null) {
                fArr[i4] = abstractC1791.m46440(f3) + fArr[i4];
            }
            if (abstractC1553 != null) {
                int i5 = i4 + 1;
                fArr[i5] = abstractC1553.m36265(f3) + fArr[i5];
            } else if (abstractC1792 != null) {
                int i6 = i4 + 1;
                fArr[i6] = abstractC1792.m46440(f3) + fArr[i6];
            }
            i3++;
            f = 1.0f;
            i2 = i;
            f2 = f10;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46693(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo9250 = this.f63822[0].mo9250();
        if (iArr != null) {
            Iterator it = this.f63834.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((C1132) it.next()).f20764;
                i++;
            }
        }
        int i2 = 0;
        for (double d : dArrMo9250) {
            this.f63822[0].mo9248(d, this.f63826);
            this.f63829.m18289(this.f63825, this.f63826, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46696(float f, float[] fArr) {
        this.f63822[0].mo9248(m46691(f, (float[]) null), this.f63826);
        int[] iArr = this.f63825;
        double[] dArr = this.f63826;
        C1132 c1132 = this.f63829;
        float f2 = c1132.f20767;
        float f3 = c1132.f20763;
        float f4 = c1132.f20772;
        float f5 = c1132.f20775;
        for (int i = 0; i < iArr.length; i++) {
            float f6 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f2 = f6;
            } else if (i2 == 2) {
                f3 = f6;
            } else if (i2 == 3) {
                f4 = f6;
            } else if (i2 == 4) {
                f5 = f6;
            }
        }
        float f7 = f4 + f2;
        float f8 = f5 + f3;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        float f9 = f2 + 0.0f;
        float f10 = f3 + 0.0f;
        float f11 = f7 + 0.0f;
        float f12 = f8 + 0.0f;
        fArr[0] = f9;
        fArr[1] = f10;
        fArr[2] = f11;
        fArr[3] = f10;
        fArr[4] = f11;
        fArr[5] = f12;
        fArr[6] = f9;
        fArr[7] = f12;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46701(ArrayList arrayList) {
        this.f63818.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46702(AbstractC1090 abstractC1090) {
        this.f63818.add(abstractC1090);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46706(int i) {
        this.f63815 = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:184:0x050a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0718  */
    /* JADX WARN: Code duplicated, block: B:439:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:462:0x0bbc A[PHI: r4
      0x0bbc: PHI (r4v18 java.lang.String) = (r4v17 java.lang.String), (r4v19 java.lang.String) binds: [B:461:0x0bba, B:457:0x0b99] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:78:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0304  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ֫ */
    public final void m46698(int i, int i2, long j) {
        C1762 c1762;
        C1762 c1763;
        ArrayList<AbstractC1090> arrayList;
        HashMap map;
        HashSet hashSet;
        ArrayList arrayList2;
        C1797 c1797;
        HashSet hashSet2;
        C1132 c1132;
        HashSet hashSet3;
        ArrayList arrayList3;
        String str;
        HashSet hashSet4;
        HashSet hashSet5;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        byte b;
        AbstractC1552 c1965;
        String str10;
        String str11;
        String str12;
        double dMo24179;
        String str13;
        HashSet hashSet6;
        Iterator it;
        HashMap map2;
        AbstractC1126 c1931;
        AbstractC1126 abstractC1126;
        C1531 c1531;
        String str14;
        HashSet hashSet7;
        HashMap map3;
        HashSet hashSet8;
        byte b2;
        AbstractC1791 c1861;
        C1531 c1532;
        C1132 c1133;
        C1797 c1798;
        HashSet hashSet9;
        HashSet hashSet10;
        HashMap map4;
        HashSet hashSet11;
        C1867 c1867;
        int i3;
        C1797 c1799 = this;
        new HashSet();
        HashSet hashSet12 = new HashSet();
        HashSet hashSet13 = new HashSet();
        HashSet hashSet14 = new HashSet();
        HashMap map5 = new HashMap();
        int i4 = c1799.f63815;
        C1132 c1134 = c1799.f63829;
        int i5 = -1;
        if (i4 != -1) {
            c1134.f20771 = i4;
        }
        C1762 c1764 = c1799.f63838;
        C1762 c1765 = c1799.f63823;
        c1764.m45364(c1765, hashSet13);
        float f = Float.NaN;
        C1132 c1135 = c1799.f63840;
        ArrayList arrayList4 = c1799.f63834;
        ArrayList arrayList5 = c1799.f63818;
        int i6 = 0;
        if (arrayList5 != null) {
            Iterator it2 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it2.hasNext()) {
                AbstractC1090 abstractC1090 = (AbstractC1090) it2.next();
                Iterator it3 = it2;
                if (abstractC1090 instanceof C1867) {
                    C1867 c1868 = (C1867) abstractC1090;
                    C1132 c1136 = new C1132();
                    c1136.f20773 = i6;
                    c1136.f20770 = f;
                    c1136.f20771 = i5;
                    c1136.f20774 = new LinkedHashMap();
                    c1136.f20764 = i6;
                    c1136.f20766 = new double[18];
                    c1136.f20768 = new double[18];
                    int i7 = c1868.f69121;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            float f2 = c1868.f18545 / 100.0f;
                            c1136.f20776 = f2;
                            c1136.f20773 = c1868.f69120;
                            float f3 = Float.isNaN(c1868.f69122) ? f2 : c1868.f69122;
                            float f4 = Float.isNaN(c1868.f69117) ? f2 : c1868.f69117;
                            c1765 = c1765;
                            float f5 = c1135.f20772;
                            c1764 = c1764;
                            float f6 = c1134.f20772;
                            float f7 = f5 - f6;
                            arrayList5 = arrayList5;
                            float f8 = c1135.f20775;
                            hashSet13 = hashSet13;
                            float f9 = c1134.f20775;
                            float f10 = f8 - f9;
                            map5 = map5;
                            c1136.f20769 = c1136.f20776;
                            float f11 = c1134.f20767;
                            hashSet12 = hashSet12;
                            float f12 = c1134.f20763;
                            hashSet14 = hashSet14;
                            float f13 = ((f5 / 2.0f) + c1135.f20767) - ((f6 / 2.0f) + f11);
                            float f14 = ((f8 / 2.0f) + c1135.f20763) - ((f9 / 2.0f) + f12);
                            float f15 = (f13 * f2) + f11;
                            float f16 = f7 * f3;
                            float f17 = f16 / 2.0f;
                            c1136.f20767 = (int) (f15 - f17);
                            float f18 = (f14 * f2) + f12;
                            float f19 = f10 * f4;
                            float f20 = f19 / 2.0f;
                            c1136.f20763 = (int) (f18 - f20);
                            c1136.f20772 = (int) (f6 + f16);
                            c1136.f20775 = (int) (f9 + f19);
                            float f21 = Float.isNaN(c1868.f69119) ? f2 : c1868.f69119;
                            float f22 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            if (!Float.isNaN(c1868.f69118)) {
                                f2 = c1868.f69118;
                            }
                            float f23 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            c1136.f20764 = 2;
                            c1136.f20767 = (int) (((f23 * f14) + ((f21 * f13) + c1134.f20767)) - f17);
                            c1136.f20763 = (int) (((f14 * f2) + ((f13 * f22) + c1134.f20763)) - f20);
                            c1136.f20765 = C1265.m24178(c1868.f69116);
                            c1136.f20771 = c1868.f69123;
                            c1133 = c1134;
                            c1867 = c1868;
                        } else {
                            float f24 = c1868.f18545 / 100.0f;
                            c1136.f20776 = f24;
                            c1136.f20773 = c1868.f69120;
                            float f25 = Float.isNaN(c1868.f69122) ? f24 : c1868.f69122;
                            float f26 = Float.isNaN(c1868.f69117) ? f24 : c1868.f69117;
                            float f27 = c1135.f20772;
                            float f28 = c1134.f20772;
                            float f29 = f27 - f28;
                            float f30 = c1135.f20775;
                            float f31 = c1134.f20775;
                            float f32 = f30 - f31;
                            c1136.f20769 = c1136.f20776;
                            float f33 = c1134.f20767;
                            float f34 = c1134.f20763;
                            float f35 = (f27 / 2.0f) + c1135.f20767;
                            float f36 = (f30 / 2.0f) + c1135.f20763;
                            float f37 = f29 * f25;
                            c1136.f20767 = (int) ((((f35 - ((f28 / 2.0f) + f33)) * f24) + f33) - (f37 / 2.0f));
                            float f38 = f32 * f26;
                            c1136.f20763 = (int) ((((f36 - ((f31 / 2.0f) + f34)) * f24) + f34) - (f38 / 2.0f));
                            c1136.f20772 = (int) (f28 + f37);
                            c1136.f20775 = (int) (f31 + f38);
                            c1136.f20764 = 3;
                            if (!Float.isNaN(c1868.f69119)) {
                                c1136.f20767 = (int) (c1868.f69119 * ((int) (i - c1136.f20772)));
                            }
                            if (!Float.isNaN(c1868.f69118)) {
                                c1136.f20763 = (int) (c1868.f69118 * ((int) (i2 - c1136.f20775)));
                            }
                            c1136.f20765 = C1265.m24178(c1868.f69116);
                            c1136.f20771 = c1868.f69123;
                            c1133 = c1134;
                            c1867 = c1868;
                        }
                        arrayList4.add((-Collections.binarySearch(arrayList4, c1136)) - 1, c1136);
                        i3 = c1867.f31397;
                        if (i3 != -1) {
                            c1798 = this;
                            c1798.f63832 = i3;
                        } else {
                            c1798 = this;
                        }
                        hashSet11 = hashSet13;
                        map4 = map5;
                        hashSet10 = hashSet12;
                        hashSet9 = hashSet14;
                    } else {
                        float f39 = c1868.f18545 / 100.0f;
                        c1136.f20776 = f39;
                        c1136.f20773 = c1868.f69120;
                        float f40 = Float.isNaN(c1868.f69122) ? f39 : c1868.f69122;
                        float f41 = Float.isNaN(c1868.f69117) ? f39 : c1868.f69117;
                        float f42 = c1135.f20772 - c1134.f20772;
                        float f43 = c1135.f20775 - c1134.f20775;
                        c1136.f20769 = c1136.f20776;
                        if (!Float.isNaN(c1868.f69119)) {
                            f39 = c1868.f69119;
                        }
                        float f44 = c1134.f20767;
                        float f45 = c1134.f20772;
                        float f46 = c1134.f20763;
                        float f47 = c1134.f20775;
                        C1132 c1137 = c1134;
                        float f48 = ((c1135.f20772 / 2.0f) + c1135.f20767) - ((f45 / 2.0f) + f44);
                        float f49 = ((c1135.f20775 / 2.0f) + c1135.f20763) - ((f47 / 2.0f) + f46);
                        float f50 = f48 * f39;
                        float f51 = f40 * f42;
                        float f52 = f51 / 2.0f;
                        c1136.f20767 = (int) ((f44 + f50) - f52);
                        float f53 = f39 * f49;
                        float f54 = f41 * f43;
                        float f55 = f54 / 2.0f;
                        c1136.f20763 = (int) ((f46 + f53) - f55);
                        c1136.f20772 = (int) (f45 + f51);
                        c1136.f20775 = (int) (f47 + f54);
                        c1867 = c1868;
                        float f56 = Float.isNaN(c1867.f69118) ? 0.0f : c1867.f69118;
                        float f57 = (-f49) * f56;
                        float f58 = f48 * f56;
                        c1136.f20764 = 1;
                        c1133 = c1137;
                        float f59 = (int) ((c1133.f20767 + f50) - f52);
                        float f60 = (int) ((c1133.f20763 + f53) - f55);
                        c1136.f20767 = f59 + f57;
                        c1136.f20763 = f60 + f58;
                        c1136.f20765 = C1265.m24178(c1867.f69116);
                        c1136.f20771 = c1867.f69123;
                    }
                    arrayList4.add((-Collections.binarySearch(arrayList4, c1136)) - 1, c1136);
                    i3 = c1867.f31397;
                    if (i3 != -1) {
                        c1798 = this;
                        c1798.f63832 = i3;
                    } else {
                        c1798 = this;
                    }
                    hashSet11 = hashSet13;
                    map4 = map5;
                    hashSet10 = hashSet12;
                    hashSet9 = hashSet14;
                } else {
                    HashSet hashSet15 = hashSet12;
                    HashSet hashSet16 = hashSet13;
                    HashSet hashSet17 = hashSet14;
                    HashMap map6 = map5;
                    c1764 = c1764;
                    c1133 = c1134;
                    c1765 = c1765;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    c1798 = c1799;
                    if (abstractC1090 instanceof C1930) {
                        hashSet9 = hashSet17;
                        abstractC1090.mo13282(hashSet9);
                        hashSet11 = hashSet16;
                        map4 = map6;
                        hashSet10 = hashSet15;
                    } else {
                        hashSet9 = hashSet17;
                        if (abstractC1090 instanceof C1622) {
                            hashSet10 = hashSet15;
                            abstractC1090.mo13282(hashSet10);
                        } else {
                            hashSet10 = hashSet15;
                            if (abstractC1090 instanceof C1027) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((C1027) abstractC1090);
                                arrayList6 = arrayList7;
                            } else {
                                map4 = map6;
                                abstractC1090.mo16378(map4);
                                hashSet11 = hashSet16;
                                abstractC1090.mo13282(hashSet11);
                            }
                        }
                        hashSet11 = hashSet16;
                        map4 = map6;
                    }
                }
                i5 = -1;
                i6 = 0;
                f = Float.NaN;
                arrayList4 = arrayList4;
                hashSet12 = hashSet10;
                map5 = map4;
                it2 = it3;
                c1765 = c1765;
                c1764 = c1764;
                arrayList5 = arrayList5;
                C1132 c1138 = c1133;
                hashSet14 = hashSet9;
                c1799 = c1798;
                hashSet13 = hashSet11;
                c1134 = c1138;
            }
            c1762 = c1764;
            c1763 = c1765;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            HashSet hashSet18 = hashSet13;
            c1797 = c1799;
            hashSet2 = hashSet14;
            c1132 = c1134;
            hashSet3 = hashSet18;
            arrayList3 = arrayList6;
        } else {
            c1762 = c1764;
            c1763 = c1765;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            c1797 = c1799;
            hashSet2 = hashSet14;
            c1132 = c1134;
            hashSet3 = hashSet13;
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            c1797.f63820 = (C1027[]) arrayList3.toArray(new C1027[0]);
        }
        String str15 = "rotation";
        String str16 = "scaleY";
        String str17 = "scaleX";
        String str18 = "progress";
        String str19 = "translationZ";
        String str20 = "translationY";
        String str21 = "translationX";
        HashSet hashSet19 = hashSet2;
        String str22 = "rotationY";
        String str23 = "rotationX";
        C1132 c1139 = c1132;
        String str24 = "CUSTOM,";
        ArrayList<C1132> arrayList8 = arrayList2;
        if (hashSet3.isEmpty()) {
            str = "CUSTOM,";
            hashSet4 = hashSet;
            hashSet5 = hashSet3;
        } else {
            c1797.f63833 = new HashMap();
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                Iterator it5 = it4;
                String str25 = (String) it4.next();
                if (!str25.startsWith(str24)) {
                    str14 = str24;
                    hashSet7 = hashSet;
                    map3 = map;
                    hashSet8 = hashSet3;
                    switch (str25.hashCode()) {
                        case -1249320806:
                            if (str25.equals("rotationX")) {
                                b2 = 0;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1249320805:
                            if (str25.equals("rotationY")) {
                                b2 = 1;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497657:
                            if (str25.equals("translationX")) {
                                b2 = 2;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497656:
                            if (str25.equals("translationY")) {
                                b2 = 3;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1225497655:
                            if (str25.equals("translationZ")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -1001078227:
                            if (str25.equals("progress")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -908189618:
                            if (str25.equals("scaleX")) {
                                b2 = 6;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -908189617:
                            if (str25.equals("scaleY")) {
                                b2 = 7;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -797520672:
                            if (str25.equals("waveVariesBy")) {
                                b2 = 8;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -760884510:
                            if (str25.equals("transformPivotX")) {
                                b2 = 9;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -760884509:
                            if (str25.equals("transformPivotY")) {
                                b2 = 10;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -40300674:
                            if (str25.equals("rotation")) {
                                b2 = 11;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case -4379043:
                            if (str25.equals("elevation")) {
                                b2 = 12;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 37232917:
                            if (str25.equals("transitionPathRotate")) {
                                b2 = C0698cb.f2569k;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 92909918:
                            if (str25.equals("alpha")) {
                                b2 = C0698cb.f2570l;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 156108012:
                            if (str25.equals("waveOffset")) {
                                b2 = 15;
                            } else {
                                b2 = -1;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                            c1861 = new C1861();
                            break;
                        case 1:
                            c1861 = new C1301();
                            break;
                        case 2:
                            c1861 = new C0951();
                            break;
                        case 3:
                            c1861 = new C1021();
                            break;
                        case 4:
                            c1861 = new C1756();
                            break;
                        case 5:
                            C2001 c2001 = new C2001();
                            c2001.f77781 = false;
                            c1861 = c2001;
                            break;
                        case 6:
                            c1861 = new C1266();
                            break;
                        case 7:
                            c1861 = new C1616();
                            break;
                        case 8:
                            c1861 = new C0916();
                            break;
                        case 9:
                            c1861 = new C1686();
                            break;
                        case 10:
                            c1861 = new C1546();
                            break;
                        case 11:
                            c1861 = new C1161();
                            break;
                        case 12:
                            c1861 = new C1651();
                            break;
                        case 13:
                            c1861 = new C1721();
                            break;
                        case 14:
                            c1861 = new C0916();
                            break;
                        case 15:
                            c1861 = new C0916();
                            break;
                        default:
                            c1861 = null;
                            break;
                    }
                } else {
                    hashSet8 = hashSet3;
                    SparseArray sparseArray = new SparseArray();
                    str14 = str24;
                    String str26 = str25.split(",")[1];
                    for (AbstractC1090 abstractC1091 : arrayList) {
                        HashSet hashSet20 = hashSet;
                        HashMap map7 = map;
                        HashMap map8 = abstractC1091.f18544;
                        if (map8 != null && (c1532 = (C1531) map8.get(str26)) != null) {
                            sparseArray.append(abstractC1091.f18545, c1532);
                        }
                        map = map7;
                        hashSet = hashSet20;
                    }
                    hashSet7 = hashSet;
                    map3 = map;
                    C1371 c1371 = new C1371();
                    String str27 = str25.split(",")[1];
                    c1371.f35027 = sparseArray;
                    c1861 = c1371;
                }
                if (c1861 != null) {
                    c1861.m46441(str25);
                    c1797.f63833.put(str25, c1861);
                }
                it4 = it5;
                str24 = str14;
                hashSet3 = hashSet8;
                map = map3;
                hashSet = hashSet7;
            }
            str = str24;
            hashSet4 = hashSet;
            HashMap map9 = map;
            hashSet5 = hashSet3;
            if (arrayList != null) {
                for (AbstractC1090 abstractC1092 : arrayList) {
                    if (abstractC1092 instanceof C1230) {
                        abstractC1092.mo13281(c1797.f63833);
                    }
                }
            }
            c1762.m45361(0, c1797.f63833);
            c1763.m45361(100, c1797.f63833);
            for (String str28 : c1797.f63833.keySet()) {
                HashMap map10 = map9;
                ((AbstractC1791) c1797.f63833.get(str28)).mo28785(map10.containsKey(str28) ? ((Integer) map10.get(str28)).intValue() : 0);
                map9 = map10;
            }
            map = map9;
        }
        if (!hashSet4.isEmpty()) {
            if (c1797.f63839 == null) {
                c1797.f63839 = new HashMap();
            }
            Iterator it6 = hashSet4.iterator();
            while (it6.hasNext()) {
                String str29 = (String) it6.next();
                if (!c1797.f63839.containsKey(str29)) {
                    String str30 = str;
                    if (!str29.startsWith(str30)) {
                        it = it6;
                        map2 = map;
                        str = str30;
                        switch (str29) {
                            case "rotationX":
                                c1931 = new C1931();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "rotationY":
                                c1931 = new C1826();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "translationX":
                                c1931 = new C1476();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "translationY":
                                c1931 = new C1441();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "translationZ":
                                c1931 = new C1336();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "progress":
                                C1581 c1581 = new C1581();
                                c1581.f48554 = false;
                                c1931 = c1581;
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "scaleX":
                                c1931 = new C1056();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "scaleY":
                                c1931 = new C0986();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "rotation":
                                c1931 = new C1896();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "elevation":
                                c1931 = new C0881();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "transitionPathRotate":
                                c1931 = new C1231();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            case "alpha":
                                c1931 = new C0846();
                                c1931.f20478 = j;
                                abstractC1126 = c1931;
                                break;
                            default:
                                abstractC1126 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str31 = str29.split(",")[1];
                        for (AbstractC1090 abstractC1093 : arrayList) {
                            String str32 = str30;
                            HashMap map11 = map;
                            HashMap map12 = abstractC1093.f18544;
                            if (map12 != null && (c1531 = (C1531) map12.get(str31)) != null) {
                                sparseArray2.append(abstractC1093.f18545, c1531);
                            }
                            str30 = str32;
                            map = map11;
                        }
                        map2 = map;
                        str = str30;
                        C1091 c1091 = new C1091();
                        c1091.f18620 = new SparseArray();
                        c1091.f18618 = str29.split(",")[1];
                        c1091.f18616 = sparseArray2;
                        abstractC1126 = c1091;
                    }
                    if (abstractC1126 != null) {
                        abstractC1126.m18070(str29);
                        c1797.f63839.put(str29, abstractC1126);
                    }
                    it6 = it;
                    map = map2;
                }
            }
            HashMap map13 = map;
            if (arrayList != null) {
                for (AbstractC1090 abstractC1094 : arrayList) {
                    if (abstractC1094 instanceof C1622) {
                        ((C1622) abstractC1094).m39260(c1797.f63839);
                    }
                }
            }
            for (String str33 : c1797.f63839.keySet()) {
                HashMap map14 = map13;
                ((AbstractC1126) c1797.f63839.get(str33)).mo16406(map14.containsKey(str33) ? ((Integer) map14.get(str33)).intValue() : 0);
                map13 = map14;
            }
        }
        int size = arrayList8.size();
        int i8 = size + 2;
        C1132[] c1132Arr = new C1132[i8];
        c1132Arr[0] = c1139;
        c1132Arr[size + 1] = c1135;
        if (arrayList8.size() > 0 && c1797.f63832 == -1) {
            c1797.f63832 = 0;
        }
        Iterator it7 = arrayList8.iterator();
        int i9 = 1;
        while (it7.hasNext()) {
            c1132Arr[i9] = (C1132) it7.next();
            i9++;
        }
        HashSet hashSet21 = new HashSet();
        Iterator it8 = c1135.f20774.keySet().iterator();
        while (it8.hasNext()) {
            String str34 = (String) it8.next();
            Iterator it9 = it8;
            C1132 c11310 = c1139;
            if (c11310.f20774.containsKey(str34)) {
                c1139 = c11310;
                hashSet6 = hashSet5;
                if (!hashSet6.contains(str + str34)) {
                    hashSet21.add(str34);
                }
            } else {
                c1139 = c11310;
                hashSet6 = hashSet5;
            }
            it8 = it9;
            hashSet5 = hashSet6;
        }
        String[] strArr = (String[]) hashSet21.toArray(new String[0]);
        c1797.f63831 = strArr;
        c1797.f63827 = new int[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = c1797.f63831;
            if (i10 < strArr2.length) {
                String str35 = strArr2[i10];
                c1797.f63827[i10] = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    if (c1132Arr[i11].f20774.containsKey(str35)) {
                        int[] iArr = c1797.f63827;
                        iArr[i10] = ((C1531) c1132Arr[i11].f20774.get(str35)).m35416() + iArr[i10];
                        break;
                    }
                }
                i10++;
            } else {
                boolean z = c1132Arr[0].f20771 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i12 = 1;
                while (i12 < i8) {
                    c1132Arr[i12].m18287(c1132Arr[i12 - 1], zArr, z);
                    i12++;
                    str23 = str23;
                    str22 = str22;
                }
                String str36 = str22;
                String str37 = str23;
                int i13 = 0;
                for (int i14 = 1; i14 < length; i14++) {
                    if (zArr[i14]) {
                        i13++;
                    }
                }
                c1797.f63825 = new int[i13];
                c1797.f63826 = new double[i13];
                c1797.f63830 = new double[i13];
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        c1797.f63825[i15] = i16;
                        i15++;
                    }
                }
                int[] iArr2 = {i8, c1797.f63825.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i8];
                int i17 = 0;
                while (i17 < i8) {
                    C1132 c11311 = c1132Arr[i17];
                    double[] dArr3 = dArr[i17];
                    String str38 = str21;
                    int[] iArr3 = c1797.f63825;
                    String str39 = str20;
                    String str40 = str19;
                    String str41 = str18;
                    String str42 = str17;
                    String str43 = str16;
                    String str44 = str15;
                    float[] fArr = {c11311.f20769, c11311.f20767, c11311.f20763, c11311.f20772, c11311.f20775, c11311.f20770};
                    int i18 = 0;
                    for (int i19 : iArr3) {
                        if (i19 < 6) {
                            dArr3[i18] = fArr[i19];
                            i18++;
                        }
                    }
                    dArr2[i17] = c1132Arr[i17].f20776;
                    i17++;
                    str21 = str38;
                    str20 = str39;
                    str19 = str40;
                    str18 = str41;
                    str17 = str42;
                    str16 = str43;
                    str15 = str44;
                }
                String str45 = str15;
                String str46 = str16;
                String str47 = str17;
                String str48 = str18;
                String str49 = str19;
                String str50 = str20;
                String str51 = str21;
                int i20 = 0;
                while (true) {
                    int[] iArr4 = c1797.f63825;
                    if (i20 < iArr4.length) {
                        if (iArr4[i20] < 6) {
                            String strM25286 = C10965.m25286(new StringBuilder(), C1132.f20762[c1797.f63825[i20]], " [");
                            for (int i21 = 0; i21 < i8; i21++) {
                                StringBuilder sbM17248 = C7470.m17248(strM25286);
                                sbM17248.append(dArr[i21][i20]);
                                strM25286 = sbM17248.toString();
                            }
                        }
                        i20++;
                    } else {
                        c1797.f63822 = new AbstractC1860[c1797.f63831.length + 1];
                        int i22 = 0;
                        while (true) {
                            String[] strArr3 = c1797.f63831;
                            if (i22 >= strArr3.length) {
                                c1797.f63822[0] = AbstractC1860.m49310(c1797.f63832, dArr2, dArr);
                                if (c1132Arr[0].f20771 != -1) {
                                    int[] iArr5 = new int[i8];
                                    double[] dArr4 = new double[i8];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i8, 2);
                                    for (int i23 = 0; i23 < i8; i23++) {
                                        C1132 c11312 = c1132Arr[i23];
                                        iArr5[i23] = c11312.f20771;
                                        dArr4[i23] = c11312.f20776;
                                        double[] dArr6 = dArr5[i23];
                                        dArr6[0] = c11312.f20767;
                                        dArr6[1] = c11312.f20763;
                                    }
                                    c1797.f63817 = AbstractC1860.m49311(iArr5, dArr4, dArr5);
                                }
                                c1797.f63828 = new HashMap();
                                if (arrayList != null) {
                                    Iterator it10 = hashSet19.iterator();
                                    float f61 = Float.NaN;
                                    while (it10.hasNext()) {
                                        String str52 = (String) it10.next();
                                        if (!str52.startsWith("CUSTOM")) {
                                            switch (str52.hashCode()) {
                                                case -1249320806:
                                                    str2 = str37;
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    b = str52.equals(str2) ? (byte) 0 : (byte) -1;
                                                    break;
                                                case -1249320805:
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str3)) {
                                                        str2 = str37;
                                                        b = 1;
                                                    } else {
                                                        str2 = str37;
                                                    }
                                                    break;
                                                case -1225497657:
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str4)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        b = 2;
                                                    } else {
                                                        str3 = str36;
                                                        str2 = str37;
                                                    }
                                                    break;
                                                case -1225497656:
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str5)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        b = 3;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -1225497655:
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str6)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        b = 4;
                                                    } else {
                                                        str5 = str50;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -1001078227:
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str7)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        b = 5;
                                                    } else {
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -908189618:
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str8)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        b = 6;
                                                    } else {
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                    }
                                                    break;
                                                case -908189617:
                                                    str9 = str46;
                                                    str45 = str45;
                                                    if (str52.equals(str9)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        b = 7;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                    }
                                                    break;
                                                case -797520672:
                                                    str45 = str45;
                                                    if (str52.equals("waveVariesBy")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        b = 8;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                    }
                                                    break;
                                                case -40300674:
                                                    str45 = str45;
                                                    if (str52.equals(str45)) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        b = 9;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                    }
                                                    break;
                                                case -4379043:
                                                    if (str52.equals("elevation")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 10;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 37232917:
                                                    if (str52.equals("transitionPathRotate")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 11;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 92909918:
                                                    if (str52.equals("alpha")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = 12;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                case 156108012:
                                                    if (str52.equals("waveOffset")) {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                        b = C0698cb.f2569k;
                                                    } else {
                                                        str2 = str37;
                                                        str3 = str36;
                                                        str4 = str51;
                                                        str5 = str50;
                                                        str6 = str49;
                                                        str7 = str48;
                                                        str8 = str47;
                                                        str9 = str46;
                                                        str45 = str45;
                                                    }
                                                    break;
                                                default:
                                                    str2 = str37;
                                                    str3 = str36;
                                                    str4 = str51;
                                                    str5 = str50;
                                                    str6 = str49;
                                                    str7 = str48;
                                                    str8 = str47;
                                                    str9 = str46;
                                                    str45 = str45;
                                                    break;
                                            }
                                            switch (b) {
                                                case 0:
                                                    c1965 = new C1965();
                                                    break;
                                                case 1:
                                                    c1965 = new C1510();
                                                    break;
                                                case 2:
                                                    c1965 = new C1377();
                                                    break;
                                                case 3:
                                                    c1965 = new C1657();
                                                    break;
                                                case 4:
                                                    c1965 = new C1727();
                                                    break;
                                                case 5:
                                                    C1125 c1125 = new C1125();
                                                    c1125.f20403 = false;
                                                    c1965 = c1125;
                                                    break;
                                                case 6:
                                                    c1965 = new C1195();
                                                    break;
                                                case 7:
                                                    c1965 = new C0922();
                                                    break;
                                                case 8:
                                                    c1965 = new C1055();
                                                    break;
                                                case 9:
                                                    c1965 = new C1405();
                                                    break;
                                                case 10:
                                                    c1965 = new C1440();
                                                    break;
                                                case 11:
                                                    c1965 = new C1335();
                                                    break;
                                                case 12:
                                                    c1965 = new C1055();
                                                    break;
                                                case 13:
                                                    c1965 = new C1055();
                                                    break;
                                                default:
                                                    c1965 = null;
                                                    break;
                                            }
                                        } else {
                                            C0985 c0985 = new C0985();
                                            c0985.f11962 = new float[1];
                                            str2 = str37;
                                            str3 = str36;
                                            c1965 = c0985;
                                            str4 = str51;
                                            str5 = str50;
                                            str6 = str49;
                                            str7 = str48;
                                            str8 = str47;
                                            str9 = str46;
                                            str45 = str45;
                                        }
                                        if (c1965 == null) {
                                            it10 = it10;
                                            str45 = str45;
                                            str46 = str9;
                                            str47 = str8;
                                            str10 = str7;
                                            str11 = str6;
                                            str12 = str5;
                                        } else {
                                            if (c1965.f46230 == 1 && Float.isNaN(f61)) {
                                                float[] fArr2 = new float[2];
                                                float f62 = 1.0f / 99;
                                                double d = 0.0d;
                                                float fHypot = 0.0f;
                                                double d2 = 0.0d;
                                                int i24 = 0;
                                                while (i24 < 100) {
                                                    float f63 = i24 * f62;
                                                    String str53 = str9;
                                                    String str54 = str8;
                                                    double d3 = f63;
                                                    c1139 = c1139;
                                                    C1265 c1265 = c1139.f20765;
                                                    float f64 = Float.NaN;
                                                    float f65 = 0.0f;
                                                    for (C1132 c11313 : arrayList8) {
                                                        String str55 = str7;
                                                        String str56 = str6;
                                                        C1265 c1266 = c11313.f20765;
                                                        if (c1266 != null) {
                                                            float f66 = c11313.f20776;
                                                            if (f66 < f63) {
                                                                c1265 = c1266;
                                                                f65 = f66;
                                                            } else if (Float.isNaN(f64)) {
                                                                f64 = c11313.f20776;
                                                            }
                                                        }
                                                        str7 = str55;
                                                        str6 = str56;
                                                    }
                                                    String str57 = str7;
                                                    String str58 = str6;
                                                    if (c1265 != null) {
                                                        if (Float.isNaN(f64)) {
                                                            f64 = 1.0f;
                                                        }
                                                        float f67 = f64 - f65;
                                                        dMo24179 = (((float) c1265.mo24179((f63 - f65) / f67)) * f67) + f65;
                                                    } else {
                                                        dMo24179 = d3;
                                                    }
                                                    c1797.f63822[0].mo9248(dMo24179, c1797.f63826);
                                                    c1139.m18289(c1797.f63825, c1797.f63826, fArr2, 0);
                                                    if (i24 > 0) {
                                                        fHypot = (float) (Math.hypot(d - ((double) fArr2[1]), d2 - ((double) fArr2[0])) + ((double) fHypot));
                                                    }
                                                    i24++;
                                                    d2 = fArr2[0];
                                                    d = fArr2[1];
                                                    str5 = str5;
                                                    str8 = str54;
                                                    str9 = str53;
                                                    str6 = str58;
                                                    str7 = str57;
                                                }
                                                str46 = str9;
                                                str47 = str8;
                                                str10 = str7;
                                                str11 = str6;
                                                str12 = str5;
                                                f61 = fHypot;
                                            } else {
                                                str46 = str9;
                                                str47 = str8;
                                                str10 = str7;
                                                str11 = str6;
                                                str12 = str5;
                                            }
                                            c1965.m36269(str52);
                                            c1797.f63828.put(str52, c1965);
                                        }
                                        it10 = it10;
                                        str48 = str10;
                                        str51 = str4;
                                        str36 = str3;
                                        str37 = str2;
                                        str50 = str12;
                                        str49 = str11;
                                    }
                                    for (AbstractC1090 abstractC1095 : arrayList) {
                                        if (abstractC1095 instanceof C1930) {
                                            ((C1930) abstractC1095).m51718(c1797.f63828);
                                        }
                                    }
                                    Iterator it11 = c1797.f63828.values().iterator();
                                    while (it11.hasNext()) {
                                        ((AbstractC1552) it11.next()).m36266();
                                    }
                                    return;
                                }
                                return;
                            }
                            String str59 = strArr3[i22];
                            int i25 = 0;
                            int i26 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i26 < i8) {
                                if (c1132Arr[i26].f20774.containsKey(str59)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i8];
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i8, ((C1531) c1132Arr[i26].f20774.get(str59)).m35416());
                                    }
                                    C1132 c11314 = c1132Arr[i26];
                                    dArr7[i25] = c11314.f20776;
                                    double[] dArr9 = dArr8[i25];
                                    C1531 c1533 = (C1531) c11314.f20774.get(str59);
                                    if (c1533.m35416() == 1) {
                                        dArr9[0] = c1533.m35415();
                                    } else {
                                        int iM35416 = c1533.m35416();
                                        float[] fArr3 = new float[iM35416];
                                        c1533.m35414(fArr3);
                                        int i27 = 0;
                                        int i28 = 0;
                                        while (i27 < iM35416) {
                                            dArr9[i28] = fArr3[i27];
                                            i27++;
                                            str59 = str59;
                                            dArr7 = dArr7;
                                            i28++;
                                            dArr8 = dArr8;
                                        }
                                    }
                                    str13 = str59;
                                    i25++;
                                    dArr7 = dArr7;
                                    dArr8 = dArr8;
                                } else {
                                    str13 = str59;
                                }
                                i26++;
                                str59 = str13;
                            }
                            i22++;
                            c1797.f63822[i22] = AbstractC1860.m49310(c1797.f63832, Arrays.copyOf(dArr7, i25), (double[][]) Arrays.copyOf(dArr8, i25));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        C1132 c1132 = this.f63829;
        sb.append(c1132.f20767);
        sb.append(" y: ");
        sb.append(c1132.f20763);
        sb.append(" end: x: ");
        C1132 c1133 = this.f63840;
        sb.append(c1133.f20767);
        sb.append(" y: ");
        sb.append(c1133.f20763);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46690(C1132 c1132) {
        float x = (int) this.f63819.getX();
        float y = (int) this.f63819.getY();
        float width = this.f63819.getWidth();
        float height = this.f63819.getHeight();
        c1132.f20767 = x;
        c1132.f20763 = y;
        c1132.f20772 = width;
        c1132.f20775 = height;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46700(View view) {
        C1132 c1132 = this.f63829;
        c1132.f20776 = 0.0f;
        c1132.f20769 = 0.0f;
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth();
        float height = view.getHeight();
        c1132.f20767 = x;
        c1132.f20763 = y;
        c1132.f20772 = width;
        c1132.f20775 = height;
        this.f63838.m45362(view);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46707(C1591 c1591, C1050 c1050) {
        C1132 c1132 = this.f63829;
        c1132.f20776 = 0.0f;
        c1132.f20769 = 0.0f;
        m46690(c1132);
        float fM37932 = c1591.m37932();
        float fM37933 = c1591.m37933();
        float fM37911 = c1591.m37911();
        float fM37890 = c1591.m37890();
        c1132.f20767 = fM37932;
        c1132.f20763 = fM37933;
        c1132.f20772 = fM37911;
        c1132.f20775 = fM37890;
        C1890 c1890M14560 = c1050.m14560(this.f63837);
        c1132.m18288(c1890M14560);
        this.f63835 = c1890M14560.f70845.f30617;
        this.f63838.m45363(c1591, c1050, this.f63837);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46703(C1591 c1591, C1050 c1050) {
        C1132 c1132 = this.f63840;
        c1132.f20776 = 1.0f;
        c1132.f20769 = 1.0f;
        m46690(c1132);
        float fM37932 = c1591.m37932();
        float fM37933 = c1591.m37933();
        float fM37911 = c1591.m37911();
        float fM37890 = c1591.m37890();
        c1132.f20767 = fM37932;
        c1132.f20763 = fM37933;
        c1132.f20772 = fM37911;
        c1132.f20775 = fM37890;
        c1132.m18288(c1050.m14560(this.f63837));
        this.f63823.m45363(c1591, c1050, this.f63837);
    }

    /* JADX INFO: renamed from: ۧ */
    private float m46691(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f63824;
            if (f3 != 1.0d) {
                float f4 = this.f63816;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C1265 c1265 = this.f63829.f20765;
        float f5 = Float.NaN;
        for (C1132 c1132 : this.f63834) {
            C1265 c1266 = c1132.f20765;
            if (c1266 != null) {
                float f6 = c1132.f20776;
                if (f6 < f) {
                    c1265 = c1266;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c1132.f20776;
                }
            }
        }
        if (c1265 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c1265.mo24179(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c1265.mo24180(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m46704(float f, long j, View view, C1580 c1580) {
        boolean zMo3415;
        C1231 c1231;
        float f2;
        float fM46691 = m46691(f, (float[]) null);
        HashMap map = this.f63833;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC1791) it.next()).mo7386(fM46691, view);
            }
        }
        HashMap map2 = this.f63839;
        if (map2 != null) {
            c1231 = null;
            zMo3415 = false;
            for (AbstractC1126 abstractC1126 : map2.values()) {
                if (abstractC1126 instanceof C1231) {
                    c1231 = (C1231) abstractC1126;
                } else {
                    zMo3415 |= abstractC1126.mo3415(fM46691, j, view, c1580);
                }
            }
        } else {
            zMo3415 = false;
            c1231 = null;
        }
        AbstractC1860[] abstractC1860Arr = this.f63822;
        C1132 c1132 = this.f63829;
        if (abstractC1860Arr != null) {
            double d = fM46691;
            abstractC1860Arr[0].mo9248(d, this.f63826);
            this.f63822[0].mo9252(d, this.f63830);
            AbstractC1860 abstractC1860 = this.f63817;
            if (abstractC1860 != null) {
                double[] dArr = this.f63826;
                if (dArr.length > 0) {
                    abstractC1860.mo9248(d, dArr);
                    this.f63817.mo9252(d, this.f63830);
                }
            }
            int[] iArr = this.f63825;
            double[] dArr2 = this.f63826;
            double[] dArr3 = this.f63830;
            float f3 = c1132.f20767;
            float f4 = c1132.f20763;
            float f5 = c1132.f20772;
            float f6 = c1132.f20775;
            if (iArr.length != 0) {
                f2 = f3;
                if (c1132.f20766.length <= iArr[iArr.length - 1]) {
                    int i = iArr[iArr.length - 1] + 1;
                    c1132.f20766 = new double[i];
                    c1132.f20768 = new double[i];
                }
            } else {
                f2 = f3;
            }
            Arrays.fill(c1132.f20766, Double.NaN);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                double[] dArr4 = c1132.f20766;
                int i3 = iArr[i2];
                dArr4[i3] = dArr2[i2];
                c1132.f20768[i3] = dArr3[i2];
            }
            int i4 = 0;
            float f7 = Float.NaN;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = f4;
            float f12 = f5;
            float f13 = f6;
            float f14 = 0.0f;
            while (true) {
                double[] dArr5 = c1132.f20766;
                if (i4 >= dArr5.length) {
                    break;
                }
                if (!Double.isNaN(dArr5[i4])) {
                    float f15 = (float) (Double.isNaN(c1132.f20766[i4]) ? 0.0d : c1132.f20766[i4] + 0.0d);
                    float f16 = (float) c1132.f20768[i4];
                    if (i4 == 1) {
                        f8 = f16;
                        f2 = f15;
                    } else if (i4 == 2) {
                        f10 = f16;
                        f11 = f15;
                    } else if (i4 == 3) {
                        f9 = f16;
                        f12 = f15;
                    } else if (i4 == 4) {
                        f14 = f16;
                        f13 = f15;
                    } else if (i4 == 5) {
                        f7 = f15;
                    }
                }
                i4++;
            }
            if (Float.isNaN(f7)) {
                if (!Float.isNaN(Float.NaN)) {
                    view.setRotation(Float.NaN);
                }
            } else {
                view.setRotation((float) (Math.toDegrees(Math.atan2((f14 / 2.0f) + f10, (f9 / 2.0f) + f8)) + ((double) f7) + ((double) (Float.isNaN(Float.NaN) ? 0.0f : Float.NaN))));
            }
            float f17 = f2 + 0.5f;
            int i5 = (int) f17;
            float f18 = f11 + 0.5f;
            int i6 = (int) f18;
            int i7 = (int) (f17 + f12);
            int i8 = (int) (f18 + f13);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (i9 != view.getMeasuredWidth() || i10 != view.getMeasuredHeight()) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
            }
            view.layout(i5, i6, i7, i8);
            HashMap map3 = this.f63833;
            if (map3 != null) {
                for (AbstractC1791 abstractC1791 : map3.values()) {
                    if (abstractC1791 instanceof C1721) {
                        double[] dArr6 = this.f63830;
                        view.setRotation(((C1721) abstractC1791).m46440(fM46691) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                    }
                }
            }
            if (c1231 != null) {
                double[] dArr7 = this.f63830;
                view.setRotation(c1231.m18069(fM46691, j, view, c1580) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                zMo3415 = c1231.f20479 | zMo3415;
            }
            int i11 = 1;
            while (true) {
                AbstractC1860[] abstractC1860Arr2 = this.f63822;
                if (i11 >= abstractC1860Arr2.length) {
                    break;
                }
                AbstractC1860 abstractC1861 = abstractC1860Arr2[i11];
                float[] fArr = this.f63836;
                abstractC1861.mo9249(d, fArr);
                ((C1531) c1132.f20774.get(this.f63831[i11 - 1])).m35412(view, fArr);
                i11++;
            }
            C1762 c1762 = this.f63838;
            if (c1762.f60686 == 0) {
                if (fM46691 <= 0.0f) {
                    view.setVisibility(c1762.f60693);
                } else {
                    C1762 c1763 = this.f63823;
                    if (fM46691 >= 1.0f) {
                        view.setVisibility(c1763.f60693);
                    } else if (c1763.f60693 != c1762.f60693) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f63820 != null) {
                int i12 = 0;
                while (true) {
                    C1027[] c1027Arr = this.f63820;
                    if (i12 >= c1027Arr.length) {
                        break;
                    }
                    c1027Arr[i12].m13279(fM46691, view);
                    i12++;
                }
            }
        } else {
            float f19 = c1132.f20767;
            C1132 c1133 = this.f63840;
            float fM49018 = C21740.m49018(c1133.f20767, f19, fM46691, f19);
            float f20 = c1132.f20763;
            float fM49019 = C21740.m49018(c1133.f20763, f20, fM46691, f20);
            float f21 = c1132.f20772;
            float f22 = c1133.f20772;
            float fM490110 = C21740.m49018(f22, f21, fM46691, f21);
            float f23 = c1132.f20775;
            float f24 = c1133.f20775;
            float f25 = fM49018 + 0.5f;
            int i13 = (int) f25;
            float f26 = fM49019 + 0.5f;
            int i14 = (int) f26;
            int i15 = (int) (f25 + fM490110);
            int iM49018 = (int) (f26 + C21740.m49018(f24, f23, fM46691, f23));
            int i16 = i15 - i13;
            int i17 = iM49018 - i14;
            if (f22 != f21 || f24 != f23) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            }
            view.layout(i13, i14, i15, iM49018);
        }
        HashMap map4 = this.f63828;
        if (map4 != null) {
            for (AbstractC1552 abstractC1552 : map4.values()) {
                if (abstractC1552 instanceof C1335) {
                    double[] dArr8 = this.f63830;
                    view.setRotation(((C1335) abstractC1552).m36265(fM46691) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC1552.mo7704(fM46691, view);
                }
            }
        }
        return zMo3415;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46694(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f63821;
        float fM46691 = m46691(f, fArr2);
        AbstractC1860[] abstractC1860Arr = this.f63822;
        C1132 c1132 = this.f63829;
        int i = 0;
        if (abstractC1860Arr != null) {
            double d = fM46691;
            abstractC1860Arr[0].mo9252(d, this.f63830);
            this.f63822[0].mo9248(d, this.f63826);
            float f4 = fArr2[0];
            while (true) {
                dArr = this.f63830;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            AbstractC1860 abstractC1860 = this.f63817;
            if (abstractC1860 != null) {
                double[] dArr2 = this.f63826;
                if (dArr2.length > 0) {
                    abstractC1860.mo9248(d, dArr2);
                    this.f63817.mo9252(d, this.f63830);
                    int[] iArr = this.f63825;
                    double[] dArr3 = this.f63830;
                    double[] dArr4 = this.f63826;
                    c1132.getClass();
                    C1132.m18285(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            int[] iArr2 = this.f63825;
            double[] dArr5 = this.f63826;
            c1132.getClass();
            C1132.m18285(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C1132 c1133 = this.f63840;
        float f5 = c1133.f20767 - c1132.f20767;
        float f6 = c1133.f20763 - c1132.f20763;
        float f7 = c1133.f20772 - c1132.f20772;
        float f8 = (c1133.f20775 - c1132.f20775) + f6;
        fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
        fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46695(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float[] fArr2 = this.f63821;
        float fM46691 = m46691(f, fArr2);
        HashMap map = this.f63833;
        AbstractC1791 abstractC1791 = map == null ? null : (AbstractC1791) map.get("translationX");
        HashMap map2 = this.f63833;
        AbstractC1791 abstractC1792 = map2 == null ? null : (AbstractC1791) map2.get("translationY");
        HashMap map3 = this.f63833;
        AbstractC1791 abstractC1793 = map3 == null ? null : (AbstractC1791) map3.get("rotation");
        HashMap map4 = this.f63833;
        AbstractC1791 abstractC1794 = map4 == null ? null : (AbstractC1791) map4.get("scaleX");
        HashMap map5 = this.f63833;
        AbstractC1791 abstractC1795 = map5 == null ? null : (AbstractC1791) map5.get("scaleY");
        HashMap map6 = this.f63828;
        AbstractC1552 abstractC1552 = map6 == null ? null : (AbstractC1552) map6.get("translationX");
        HashMap map7 = this.f63828;
        AbstractC1552 abstractC1553 = map7 == null ? null : (AbstractC1552) map7.get("translationY");
        HashMap map8 = this.f63828;
        AbstractC1552 abstractC1554 = map8 == null ? null : (AbstractC1552) map8.get("rotation");
        HashMap map9 = this.f63828;
        AbstractC1552 abstractC1555 = map9 == null ? null : (AbstractC1552) map9.get("scaleX");
        HashMap map10 = this.f63828;
        AbstractC1552 abstractC1556 = map10 != null ? (AbstractC1552) map10.get("scaleY") : null;
        C1790 c1790 = new C1790();
        c1790.m46318();
        c1790.m46322(abstractC1793, fM46691);
        c1790.m46325(abstractC1791, abstractC1792, fM46691);
        c1790.m46323(abstractC1794, abstractC1795, fM46691);
        c1790.m46320(abstractC1554, fM46691);
        c1790.m46324(abstractC1552, abstractC1553, fM46691);
        c1790.m46321(abstractC1555, abstractC1556, fM46691);
        AbstractC1860 abstractC1860 = this.f63817;
        C1132 c1132 = this.f63829;
        if (abstractC1860 != null) {
            double[] dArr = this.f63826;
            if (dArr.length > 0) {
                double d = fM46691;
                abstractC1860.mo9248(d, dArr);
                this.f63817.mo9252(d, this.f63830);
                int[] iArr = this.f63825;
                double[] dArr2 = this.f63830;
                double[] dArr3 = this.f63826;
                c1132.getClass();
                C1132.m18285(f2, f3, fArr, iArr, dArr2, dArr3);
            }
            c1790.m46319(f2, f3, i, i2, fArr);
            return;
        }
        if (this.f63822 != null) {
            double dM46691 = m46691(fM46691, fArr2);
            this.f63822[0].mo9252(dM46691, this.f63830);
            this.f63822[0].mo9248(dM46691, this.f63826);
            float f4 = fArr2[0];
            int i3 = 0;
            while (true) {
                double[] dArr4 = this.f63830;
                if (i3 < dArr4.length) {
                    dArr4[i3] = dArr4[i3] * ((double) f4);
                    i3++;
                } else {
                    int[] iArr2 = this.f63825;
                    double[] dArr5 = this.f63826;
                    c1132.getClass();
                    C1132.m18285(f2, f3, fArr, iArr2, dArr4, dArr5);
                    c1790.m46319(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C1132 c1133 = this.f63840;
            float f5 = c1133.f20767 - c1132.f20767;
            AbstractC1552 abstractC1557 = abstractC1556;
            float f6 = c1133.f20763 - c1132.f20763;
            float f7 = c1133.f20772 - c1132.f20772;
            float f8 = (c1133.f20775 - c1132.f20775) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            c1790.m46318();
            c1790.m46322(abstractC1793, fM46691);
            c1790.m46325(abstractC1791, abstractC1792, fM46691);
            c1790.m46323(abstractC1794, abstractC1795, fM46691);
            c1790.m46320(abstractC1554, fM46691);
            c1790.m46324(abstractC1552, abstractC1553, fM46691);
            c1790.m46321(abstractC1555, abstractC1557, fM46691);
            c1790.m46319(f2, f3, i, i2, fArr);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46692() {
        int iMax = this.f63829.f20773;
        Iterator it = this.f63834.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C1132) it.next()).f20773);
        }
        return Math.max(iMax, this.f63840.f20773);
    }
}
