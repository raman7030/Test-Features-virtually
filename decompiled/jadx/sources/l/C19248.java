package l;

import android.util.SparseArray;
import android.view.View;
import com.umeng.analytics.pro.cb;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: l.᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 21CQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19248 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC20513 f60586;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public View f60588;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C3725[] f60589;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public AbstractC20513[] f60591;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f60594;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public double[] f60595;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f60596;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public HashMap f60597;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public double[] f60599;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String[] f60600;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f60602;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f60606;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public HashMap f60608;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60601 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C5841 f60598 = new C5841();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5841 f60609 = new C5841();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18542 f60607 = new C18542();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18542 f60592 = new C18542();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f60604 = Float.NaN;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f60585 = 0.0f;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f60593 = 1.0f;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float[] f60605 = new float[4];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f60603 = new ArrayList();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f60590 = new float[1];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f60587 = new ArrayList();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f60584 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44403(int i) {
    }

    public C19248(View view) {
        this.f60588 = view;
        this.f60606 = view.getId();
        view.getLayoutParams();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m44411() {
        return this.f60609.f17915;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m44414() {
        return this.f60609.f17911;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44405(int i, float[] fArr) {
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / (i2 - 1);
        HashMap map = this.f60602;
        AbstractC19123 abstractC19123 = map == null ? null : (AbstractC19123) map.get("translationX");
        HashMap map2 = this.f60602;
        AbstractC19123 abstractC19124 = map2 == null ? null : (AbstractC19123) map2.get("translationY");
        HashMap map3 = this.f60597;
        AbstractC14307 abstractC14307 = map3 == null ? null : (AbstractC14307) map3.get("translationX");
        HashMap map4 = this.f60597;
        AbstractC14307 abstractC14308 = map4 != null ? (AbstractC14307) map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float f3 = i3 * f2;
            float f4 = this.f60593;
            float f5 = 0.0f;
            if (f4 != f) {
                float f6 = this.f60585;
                if (f3 < f6) {
                    f3 = 0.0f;
                }
                if (f3 > f6 && f3 < 1.0d) {
                    f3 = (f3 - f6) * f4;
                }
            }
            double dMo22211 = f3;
            C5841 c5841 = this.f60598;
            C8518 c8518 = c5841.f17913;
            float f7 = Float.NaN;
            for (C5841 c5842 : this.f60603) {
                float f8 = f2;
                C8518 c8519 = c5842.f17913;
                if (c8519 != null) {
                    float f9 = c5842.f17924;
                    if (f9 < f3) {
                        f5 = f9;
                        c8518 = c8519;
                    } else if (Float.isNaN(f7)) {
                        f7 = c5842.f17924;
                    }
                }
                f2 = f8;
            }
            float f10 = f2;
            if (c8518 != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                float f11 = f7 - f5;
                dMo22211 = (((float) c8518.mo22211((f3 - f5) / f11)) * f11) + f5;
            }
            this.f60591[0].mo7169(dMo22211, this.f60595);
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr = this.f60595;
                if (dArr.length > 0) {
                    abstractC20513.mo7169(dMo22211, dArr);
                }
            }
            int i4 = i3 * 2;
            c5841.m16364(this.f60594, this.f60595, fArr, i4);
            if (abstractC14307 != null) {
                fArr[i4] = abstractC14307.m34132(f3) + fArr[i4];
            } else if (abstractC19123 != null) {
                fArr[i4] = abstractC19123.m44146(f3) + fArr[i4];
            }
            if (abstractC14308 != null) {
                int i5 = i4 + 1;
                fArr[i5] = abstractC14308.m34132(f3) + fArr[i5];
            } else if (abstractC19124 != null) {
                int i6 = i4 + 1;
                fArr[i6] = abstractC19124.m44146(f3) + fArr[i6];
            }
            i3++;
            f = 1.0f;
            i2 = i;
            f2 = f10;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44399(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo7171 = this.f60591[0].mo7171();
        if (iArr != null) {
            Iterator it = this.f60603.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = ((C5841) it.next()).f17912;
                i++;
            }
        }
        int i2 = 0;
        for (double d : dArrMo7171) {
            this.f60591[0].mo7169(d, this.f60595);
            this.f60598.m16364(this.f60594, this.f60595, fArr, i2);
            i2 += 2;
        }
        return i2 / 2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44402(float f, float[] fArr) {
        this.f60591[0].mo7169(m44397(f, (float[]) null), this.f60595);
        int[] iArr = this.f60594;
        double[] dArr = this.f60595;
        C5841 c5841 = this.f60598;
        float f2 = c5841.f17915;
        float f3 = c5841.f17911;
        float f4 = c5841.f17920;
        float f5 = c5841.f17923;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44407(ArrayList arrayList) {
        this.f60587.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44408(AbstractC4990 abstractC4990) {
        this.f60587.add(abstractC4990);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44412(int i) {
        this.f60584 = i;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44404(int i, int i2, long j) {
        C18542 c18542;
        C18542 c18543;
        ArrayList<AbstractC4990> arrayList;
        HashMap map;
        HashSet hashSet;
        ArrayList arrayList2;
        C19248 c19248;
        HashSet hashSet2;
        C5841 c5841;
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
        AbstractC14307 c22629;
        String str10;
        String str11;
        String str12;
        double dMo22211;
        String str13;
        HashSet hashSet6;
        Iterator it;
        HashMap map2;
        AbstractC5717 c21945;
        AbstractC5717 abstractC5717;
        C13888 c13888;
        String str14;
        HashSet hashSet7;
        HashMap map3;
        HashSet hashSet8;
        byte b2;
        AbstractC19123 c20534;
        C13888 c13889;
        C5841 c5842;
        C19248 c19249;
        HashSet hashSet9;
        HashSet hashSet10;
        HashMap map4;
        HashSet hashSet11;
        C20659 c20659;
        int i3;
        C19248 c192410 = this;
        new HashSet();
        HashSet hashSet12 = new HashSet();
        HashSet hashSet13 = new HashSet();
        HashSet hashSet14 = new HashSet();
        HashMap map5 = new HashMap();
        int i4 = c192410.f60584;
        C5841 c5843 = c192410.f60598;
        int i5 = -1;
        if (i4 != -1) {
            c5843.f17919 = i4;
        }
        C18542 c18544 = c192410.f60607;
        C18542 c18545 = c192410.f60592;
        c18544.m43086(c18545, hashSet13);
        float f = Float.NaN;
        C5841 c5844 = c192410.f60609;
        ArrayList arrayList4 = c192410.f60603;
        ArrayList arrayList5 = c192410.f60587;
        int i6 = 0;
        if (arrayList5 != null) {
            Iterator it2 = arrayList5.iterator();
            ArrayList arrayList6 = null;
            while (it2.hasNext()) {
                AbstractC4990 abstractC4990 = (AbstractC4990) it2.next();
                Iterator it3 = it2;
                if (abstractC4990 instanceof C20659) {
                    C20659 c206510 = (C20659) abstractC4990;
                    C5841 c5845 = new C5841();
                    c5845.f17921 = i6;
                    c5845.f17918 = f;
                    c5845.f17919 = i5;
                    c5845.f17922 = new LinkedHashMap();
                    c5845.f17912 = i6;
                    c5845.f17914 = new double[18];
                    c5845.f17916 = new double[18];
                    int i7 = c206510.f66439;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            float f2 = c206510.f15712 / 100.0f;
                            c5845.f17924 = f2;
                            c5845.f17921 = c206510.f66438;
                            float f3 = Float.isNaN(c206510.f66440) ? f2 : c206510.f66440;
                            float f4 = Float.isNaN(c206510.f66435) ? f2 : c206510.f66435;
                            c18545 = c18545;
                            float f5 = c5844.f17920;
                            c18544 = c18544;
                            float f6 = c5843.f17920;
                            float f7 = f5 - f6;
                            arrayList5 = arrayList5;
                            float f8 = c5844.f17923;
                            hashSet13 = hashSet13;
                            float f9 = c5843.f17923;
                            float f10 = f8 - f9;
                            map5 = map5;
                            c5845.f17917 = c5845.f17924;
                            float f11 = c5843.f17915;
                            hashSet12 = hashSet12;
                            float f12 = c5843.f17911;
                            hashSet14 = hashSet14;
                            float f13 = ((f5 / 2.0f) + c5844.f17915) - ((f6 / 2.0f) + f11);
                            float f14 = ((f8 / 2.0f) + c5844.f17911) - ((f9 / 2.0f) + f12);
                            float f15 = (f13 * f2) + f11;
                            float f16 = f7 * f3;
                            float f17 = f16 / 2.0f;
                            c5845.f17915 = (int) (f15 - f17);
                            float f18 = (f14 * f2) + f12;
                            float f19 = f10 * f4;
                            float f20 = f19 / 2.0f;
                            c5845.f17911 = (int) (f18 - f20);
                            c5845.f17920 = (int) (f6 + f16);
                            c5845.f17923 = (int) (f9 + f19);
                            float f21 = Float.isNaN(c206510.f66437) ? f2 : c206510.f66437;
                            float f22 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            if (!Float.isNaN(c206510.f66436)) {
                                f2 = c206510.f66436;
                            }
                            float f23 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                            c5845.f17912 = 2;
                            c5845.f17915 = (int) (((f23 * f14) + ((f21 * f13) + c5843.f17915)) - f17);
                            c5845.f17911 = (int) (((f14 * f2) + ((f13 * f22) + c5843.f17911)) - f20);
                            c5845.f17913 = C8518.m22210(c206510.f66434);
                            c5845.f17919 = c206510.f66441;
                            c5842 = c5843;
                            c20659 = c206510;
                        } else {
                            float f24 = c206510.f15712 / 100.0f;
                            c5845.f17924 = f24;
                            c5845.f17921 = c206510.f66438;
                            float f25 = Float.isNaN(c206510.f66440) ? f24 : c206510.f66440;
                            float f26 = Float.isNaN(c206510.f66435) ? f24 : c206510.f66435;
                            float f27 = c5844.f17920;
                            float f28 = c5843.f17920;
                            float f29 = f27 - f28;
                            float f30 = c5844.f17923;
                            float f31 = c5843.f17923;
                            float f32 = f30 - f31;
                            c5845.f17917 = c5845.f17924;
                            float f33 = c5843.f17915;
                            float f34 = c5843.f17911;
                            float f35 = (f27 / 2.0f) + c5844.f17915;
                            float f36 = (f30 / 2.0f) + c5844.f17911;
                            float f37 = f29 * f25;
                            c5845.f17915 = (int) ((((f35 - ((f28 / 2.0f) + f33)) * f24) + f33) - (f37 / 2.0f));
                            float f38 = f32 * f26;
                            c5845.f17911 = (int) ((((f36 - ((f31 / 2.0f) + f34)) * f24) + f34) - (f38 / 2.0f));
                            c5845.f17920 = (int) (f28 + f37);
                            c5845.f17923 = (int) (f31 + f38);
                            c5845.f17912 = 3;
                            if (!Float.isNaN(c206510.f66437)) {
                                c5845.f17915 = (int) (c206510.f66437 * ((int) (i - c5845.f17920)));
                            }
                            if (!Float.isNaN(c206510.f66436)) {
                                c5845.f17911 = (int) (c206510.f66436 * ((int) (i2 - c5845.f17923)));
                            }
                            c5845.f17913 = C8518.m22210(c206510.f66434);
                            c5845.f17919 = c206510.f66441;
                            c5842 = c5843;
                            c20659 = c206510;
                        }
                        arrayList4.add((-Collections.binarySearch(arrayList4, c5845)) - 1, c5845);
                        i3 = c20659.f28448;
                        if (i3 != -1) {
                            c19249 = this;
                            c19249.f60601 = i3;
                        } else {
                            c19249 = this;
                        }
                        hashSet11 = hashSet13;
                        map4 = map5;
                        hashSet10 = hashSet12;
                        hashSet9 = hashSet14;
                    } else {
                        float f39 = c206510.f15712 / 100.0f;
                        c5845.f17924 = f39;
                        c5845.f17921 = c206510.f66438;
                        float f40 = Float.isNaN(c206510.f66440) ? f39 : c206510.f66440;
                        float f41 = Float.isNaN(c206510.f66435) ? f39 : c206510.f66435;
                        float f42 = c5844.f17920 - c5843.f17920;
                        float f43 = c5844.f17923 - c5843.f17923;
                        c5845.f17917 = c5845.f17924;
                        if (!Float.isNaN(c206510.f66437)) {
                            f39 = c206510.f66437;
                        }
                        float f44 = c5843.f17915;
                        float f45 = c5843.f17920;
                        float f46 = c5843.f17911;
                        float f47 = c5843.f17923;
                        C5841 c5846 = c5843;
                        float f48 = ((c5844.f17920 / 2.0f) + c5844.f17915) - ((f45 / 2.0f) + f44);
                        float f49 = ((c5844.f17923 / 2.0f) + c5844.f17911) - ((f47 / 2.0f) + f46);
                        float f50 = f48 * f39;
                        float f51 = f40 * f42;
                        float f52 = f51 / 2.0f;
                        c5845.f17915 = (int) ((f44 + f50) - f52);
                        float f53 = f39 * f49;
                        float f54 = f41 * f43;
                        float f55 = f54 / 2.0f;
                        c5845.f17911 = (int) ((f46 + f53) - f55);
                        c5845.f17920 = (int) (f45 + f51);
                        c5845.f17923 = (int) (f47 + f54);
                        c20659 = c206510;
                        float f56 = Float.isNaN(c20659.f66436) ? 0.0f : c20659.f66436;
                        float f57 = (-f49) * f56;
                        float f58 = f48 * f56;
                        c5845.f17912 = 1;
                        c5842 = c5846;
                        float f59 = (int) ((c5842.f17915 + f50) - f52);
                        float f60 = (int) ((c5842.f17911 + f53) - f55);
                        c5845.f17915 = f59 + f57;
                        c5845.f17911 = f60 + f58;
                        c5845.f17913 = C8518.m22210(c20659.f66434);
                        c5845.f17919 = c20659.f66441;
                    }
                    arrayList4.add((-Collections.binarySearch(arrayList4, c5845)) - 1, c5845);
                    i3 = c20659.f28448;
                    if (i3 != -1) {
                        c19249 = this;
                        c19249.f60601 = i3;
                    } else {
                        c19249 = this;
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
                    c18544 = c18544;
                    c5842 = c5843;
                    c18545 = c18545;
                    arrayList4 = arrayList4;
                    arrayList5 = arrayList5;
                    c19249 = c192410;
                    if (abstractC4990 instanceof C21924) {
                        hashSet9 = hashSet17;
                        abstractC4990.mo11330(hashSet9);
                        hashSet11 = hashSet16;
                        map4 = map6;
                        hashSet10 = hashSet15;
                    } else {
                        hashSet9 = hashSet17;
                        if (abstractC4990 instanceof C15718) {
                            hashSet10 = hashSet15;
                            abstractC4990.mo11330(hashSet10);
                        } else {
                            hashSet10 = hashSet15;
                            if (abstractC4990 instanceof C3725) {
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                ArrayList arrayList7 = arrayList6;
                                arrayList7.add((C3725) abstractC4990);
                                arrayList6 = arrayList7;
                            } else {
                                map4 = map6;
                                abstractC4990.mo14474(map4);
                                hashSet11 = hashSet16;
                                abstractC4990.mo11330(hashSet11);
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
                c18545 = c18545;
                c18544 = c18544;
                arrayList5 = arrayList5;
                C5841 c5847 = c5842;
                hashSet14 = hashSet9;
                c192410 = c19249;
                hashSet13 = hashSet11;
                c5843 = c5847;
            }
            c18542 = c18544;
            c18543 = c18545;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            HashSet hashSet18 = hashSet13;
            c19248 = c192410;
            hashSet2 = hashSet14;
            c5841 = c5843;
            hashSet3 = hashSet18;
            arrayList3 = arrayList6;
        } else {
            c18542 = c18544;
            c18543 = c18545;
            arrayList = arrayList5;
            map = map5;
            hashSet = hashSet12;
            arrayList2 = arrayList4;
            c19248 = c192410;
            hashSet2 = hashSet14;
            c5841 = c5843;
            hashSet3 = hashSet13;
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            c19248.f60589 = (C3725[]) arrayList3.toArray(new C3725[0]);
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
        C5841 c5848 = c5841;
        String str24 = "CUSTOM,";
        ArrayList<C5841> arrayList8 = arrayList2;
        if (hashSet3.isEmpty()) {
            str = "CUSTOM,";
            hashSet4 = hashSet;
            hashSet5 = hashSet3;
        } else {
            c19248.f60602 = new HashMap();
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
                                b2 = cb.k;
                            } else {
                                b2 = -1;
                            }
                            break;
                        case 92909918:
                            if (str25.equals("alpha")) {
                                b2 = cb.f77931l;
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
                            c20534 = new C20534();
                            break;
                        case 1:
                            c20534 = new C9245();
                            break;
                        case 2:
                            c20534 = new C2189();
                            break;
                        case 3:
                            c20534 = new C3600();
                            break;
                        case 4:
                            c20534 = new C18417();
                            break;
                        case 5:
                            C23355 c23355 = new C23355();
                            c23355.f75035 = false;
                            c20534 = c23355;
                            break;
                        case 6:
                            c20534 = new C8539();
                            break;
                        case 7:
                            c20534 = new C15593();
                            break;
                        case 8:
                            c20534 = new C1483();
                            break;
                        case 9:
                            c20534 = new C17005();
                            break;
                        case 10:
                            c20534 = new C14182();
                            break;
                        case 11:
                            c20534 = new C6422();
                            break;
                        case 12:
                            c20534 = new C16299();
                            break;
                        case 13:
                            c20534 = new C17711();
                            break;
                        case 14:
                            c20534 = new C1483();
                            break;
                        case 15:
                            c20534 = new C1483();
                            break;
                        default:
                            c20534 = null;
                            break;
                    }
                } else {
                    hashSet8 = hashSet3;
                    SparseArray sparseArray = new SparseArray();
                    str14 = str24;
                    String str26 = str25.split(",")[1];
                    for (AbstractC4990 abstractC4991 : arrayList) {
                        HashSet hashSet20 = hashSet;
                        HashMap map7 = map;
                        HashMap map8 = abstractC4991.f15711;
                        if (map8 != null && (c13889 = (C13888) map8.get(str26)) != null) {
                            sparseArray.append(abstractC4991.f15712, c13889);
                        }
                        map = map7;
                        hashSet = hashSet20;
                    }
                    hashSet7 = hashSet;
                    map3 = map;
                    C10656 c10656 = new C10656();
                    String str27 = str25.split(",")[1];
                    c10656.f32056 = sparseArray;
                    c20534 = c10656;
                }
                if (c20534 != null) {
                    c20534.m44147(str25);
                    c19248.f60602.put(str25, c20534);
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
                for (AbstractC4990 abstractC4992 : arrayList) {
                    if (abstractC4992 instanceof C7812) {
                        abstractC4992.mo11329(c19248.f60602);
                    }
                }
            }
            c18542.m43083(0, c19248.f60602);
            c18543.m43083(100, c19248.f60602);
            for (String str28 : c19248.f60602.keySet()) {
                HashMap map10 = map9;
                ((AbstractC19123) c19248.f60602.get(str28)).mo26746(map10.containsKey(str28) ? ((Integer) map10.get(str28)).intValue() : 0);
                map9 = map10;
            }
            map = map9;
        }
        if (!hashSet4.isEmpty()) {
            if (c19248.f60608 == null) {
                c19248.f60608 = new HashMap();
            }
            Iterator it6 = hashSet4.iterator();
            while (it6.hasNext()) {
                String str29 = (String) it6.next();
                if (!c19248.f60608.containsKey(str29)) {
                    String str30 = str;
                    if (!str29.startsWith(str30)) {
                        it = it6;
                        map2 = map;
                        str = str30;
                        switch (str29) {
                            case "rotationX":
                                c21945 = new C21945();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "rotationY":
                                c21945 = new C19829();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "translationX":
                                c21945 = new C12772();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "translationY":
                                c21945 = new C12067();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "translationZ":
                                c21945 = new C9951();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "progress":
                                C14888 c14888 = new C14888();
                                c14888.f45439 = false;
                                c21945 = c14888;
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "scaleX":
                                c21945 = new C4306();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "scaleY":
                                c21945 = new C2895();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "rotation":
                                c21945 = new C21240();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "elevation":
                                c21945 = new C0777();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "transitionPathRotate":
                                c21945 = new C7833();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            case "alpha":
                                c21945 = new C0071();
                                c21945.f17633 = j;
                                abstractC5717 = c21945;
                                break;
                            default:
                                abstractC5717 = null;
                                break;
                        }
                    } else {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it6;
                        String str31 = str29.split(",")[1];
                        for (AbstractC4990 abstractC4993 : arrayList) {
                            String str32 = str30;
                            HashMap map11 = map;
                            HashMap map12 = abstractC4993.f15711;
                            if (map12 != null && (c13888 = (C13888) map12.get(str31)) != null) {
                                sparseArray2.append(abstractC4993.f15712, c13888);
                            }
                            str30 = str32;
                            map = map11;
                        }
                        map2 = map;
                        str = str30;
                        C5011 c5011 = new C5011();
                        c5011.f15788 = new SparseArray();
                        c5011.f15786 = str29.split(",")[1];
                        c5011.f15784 = sparseArray2;
                        abstractC5717 = c5011;
                    }
                    if (abstractC5717 != null) {
                        abstractC5717.m16151(str29);
                        c19248.f60608.put(str29, abstractC5717);
                    }
                    it6 = it;
                    map = map2;
                }
            }
            HashMap map13 = map;
            if (arrayList != null) {
                for (AbstractC4990 abstractC4994 : arrayList) {
                    if (abstractC4994 instanceof C15718) {
                        ((C15718) abstractC4994).m37091(c19248.f60608);
                    }
                }
            }
            for (String str33 : c19248.f60608.keySet()) {
                HashMap map14 = map13;
                ((AbstractC5717) c19248.f60608.get(str33)).mo14502(map14.containsKey(str33) ? ((Integer) map14.get(str33)).intValue() : 0);
                map13 = map14;
            }
        }
        int size = arrayList8.size();
        int i8 = size + 2;
        C5841[] c5841Arr = new C5841[i8];
        c5841Arr[0] = c5848;
        c5841Arr[size + 1] = c5844;
        if (arrayList8.size() > 0 && c19248.f60601 == -1) {
            c19248.f60601 = 0;
        }
        Iterator it7 = arrayList8.iterator();
        int i9 = 1;
        while (it7.hasNext()) {
            c5841Arr[i9] = (C5841) it7.next();
            i9++;
        }
        HashSet hashSet21 = new HashSet();
        Iterator it8 = c5844.f17922.keySet().iterator();
        while (it8.hasNext()) {
            String str34 = (String) it8.next();
            Iterator it9 = it8;
            C5841 c5849 = c5848;
            if (c5849.f17922.containsKey(str34)) {
                c5848 = c5849;
                hashSet6 = hashSet5;
                if (!hashSet6.contains(str + str34)) {
                    hashSet21.add(str34);
                }
            } else {
                c5848 = c5849;
                hashSet6 = hashSet5;
            }
            it8 = it9;
            hashSet5 = hashSet6;
        }
        String[] strArr = (String[]) hashSet21.toArray(new String[0]);
        c19248.f60600 = strArr;
        c19248.f60596 = new int[strArr.length];
        int i10 = 0;
        while (true) {
            String[] strArr2 = c19248.f60600;
            if (i10 < strArr2.length) {
                String str35 = strArr2[i10];
                c19248.f60596[i10] = 0;
                for (int i11 = 0; i11 < i8; i11++) {
                    if (c5841Arr[i11].f17922.containsKey(str35)) {
                        int[] iArr = c19248.f60596;
                        iArr[i10] = ((C13888) c5841Arr[i11].f17922.get(str35)).m33297() + iArr[i10];
                        break;
                    }
                }
                i10++;
            } else {
                boolean z = c5841Arr[0].f17919 != -1;
                int length = strArr2.length + 18;
                boolean[] zArr = new boolean[length];
                int i12 = 1;
                while (i12 < i8) {
                    c5841Arr[i12].m16362(c5841Arr[i12 - 1], zArr, z);
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
                c19248.f60594 = new int[i13];
                c19248.f60595 = new double[i13];
                c19248.f60599 = new double[i13];
                int i15 = 0;
                for (int i16 = 1; i16 < length; i16++) {
                    if (zArr[i16]) {
                        c19248.f60594[i15] = i16;
                        i15++;
                    }
                }
                int[] iArr2 = {i8, c19248.f60594.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i8];
                int i17 = 0;
                while (i17 < i8) {
                    C5841 c58410 = c5841Arr[i17];
                    double[] dArr3 = dArr[i17];
                    String str38 = str21;
                    int[] iArr3 = c19248.f60594;
                    String str39 = str20;
                    String str40 = str19;
                    String str41 = str18;
                    String str42 = str17;
                    String str43 = str16;
                    String str44 = str15;
                    float[] fArr = {c58410.f17917, c58410.f17915, c58410.f17911, c58410.f17920, c58410.f17923, c58410.f17918};
                    int i18 = 0;
                    for (int i19 : iArr3) {
                        if (i19 < 6) {
                            dArr3[i18] = fArr[i19];
                            i18++;
                        }
                    }
                    dArr2[i17] = c5841Arr[i17].f17924;
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
                    int[] iArr4 = c19248.f60594;
                    if (i20 < iArr4.length) {
                        if (iArr4[i20] < 6) {
                            String strM23341 = C9045.m23341(new StringBuilder(), C5841.f17910[c19248.f60594[i20]], " [");
                            for (int i21 = 0; i21 < i8; i21++) {
                                StringBuilder sbM15339 = C5368.m15339(strM23341);
                                sbM15339.append(dArr[i21][i20]);
                                strM23341 = sbM15339.toString();
                            }
                        }
                        i20++;
                    } else {
                        c19248.f60591 = new AbstractC20513[c19248.f60600.length + 1];
                        int i22 = 0;
                        while (true) {
                            String[] strArr3 = c19248.f60600;
                            if (i22 >= strArr3.length) {
                                c19248.f60591[0] = AbstractC20513.m46987(c19248.f60601, dArr2, dArr);
                                if (c5841Arr[0].f17919 != -1) {
                                    int[] iArr5 = new int[i8];
                                    double[] dArr4 = new double[i8];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i8, 2);
                                    for (int i23 = 0; i23 < i8; i23++) {
                                        C5841 c58411 = c5841Arr[i23];
                                        iArr5[i23] = c58411.f17919;
                                        dArr4[i23] = c58411.f17924;
                                        double[] dArr6 = dArr5[i23];
                                        dArr6[0] = c58411.f17915;
                                        dArr6[1] = c58411.f17911;
                                    }
                                    c19248.f60586 = AbstractC20513.m46988(iArr5, dArr4, dArr5);
                                }
                                c19248.f60597 = new HashMap();
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
                                                        b = cb.k;
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
                                                    c22629 = new C22629();
                                                    break;
                                                case 1:
                                                    c22629 = new C13456();
                                                    break;
                                                case 2:
                                                    c22629 = new C10781();
                                                    break;
                                                case 3:
                                                    c22629 = new C16424();
                                                    break;
                                                case 4:
                                                    c22629 = new C17836();
                                                    break;
                                                case 5:
                                                    C5696 c5696 = new C5696();
                                                    c5696.f17557 = false;
                                                    c22629 = c5696;
                                                    break;
                                                case 6:
                                                    c22629 = new C7107();
                                                    break;
                                                case 7:
                                                    c22629 = new C1608();
                                                    break;
                                                case 8:
                                                    c22629 = new C4285();
                                                    break;
                                                case 9:
                                                    c22629 = new C11341();
                                                    break;
                                                case 10:
                                                    c22629 = new C12046();
                                                    break;
                                                case 11:
                                                    c22629 = new C9930();
                                                    break;
                                                case 12:
                                                    c22629 = new C4285();
                                                    break;
                                                case 13:
                                                    c22629 = new C4285();
                                                    break;
                                                default:
                                                    c22629 = null;
                                                    break;
                                            }
                                        } else {
                                            C2874 c2874 = new C2874();
                                            c2874.f9164 = new float[1];
                                            str2 = str37;
                                            str3 = str36;
                                            c22629 = c2874;
                                            str4 = str51;
                                            str5 = str50;
                                            str6 = str49;
                                            str7 = str48;
                                            str8 = str47;
                                            str9 = str46;
                                            str45 = str45;
                                        }
                                        if (c22629 == null) {
                                            it10 = it10;
                                            str45 = str45;
                                            str46 = str9;
                                            str47 = str8;
                                            str10 = str7;
                                            str11 = str6;
                                            str12 = str5;
                                        } else {
                                            if (c22629.f43138 == 1 && Float.isNaN(f61)) {
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
                                                    c5848 = c5848;
                                                    C8518 c8518 = c5848.f17913;
                                                    float f64 = Float.NaN;
                                                    float f65 = 0.0f;
                                                    for (C5841 c58412 : arrayList8) {
                                                        String str55 = str7;
                                                        String str56 = str6;
                                                        C8518 c8519 = c58412.f17913;
                                                        if (c8519 != null) {
                                                            float f66 = c58412.f17924;
                                                            if (f66 < f63) {
                                                                c8518 = c8519;
                                                                f65 = f66;
                                                            } else if (Float.isNaN(f64)) {
                                                                f64 = c58412.f17924;
                                                            }
                                                        }
                                                        str7 = str55;
                                                        str6 = str56;
                                                    }
                                                    String str57 = str7;
                                                    String str58 = str6;
                                                    if (c8518 != null) {
                                                        if (Float.isNaN(f64)) {
                                                            f64 = 1.0f;
                                                        }
                                                        float f67 = f64 - f65;
                                                        dMo22211 = (((float) c8518.mo22211((f63 - f65) / f67)) * f67) + f65;
                                                    } else {
                                                        dMo22211 = d3;
                                                    }
                                                    c19248.f60591[0].mo7169(dMo22211, c19248.f60595);
                                                    c5848.m16364(c19248.f60594, c19248.f60595, fArr2, 0);
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
                                            c22629.m34136(str52);
                                            c19248.f60597.put(str52, c22629);
                                        }
                                        it10 = it10;
                                        str48 = str10;
                                        str51 = str4;
                                        str36 = str3;
                                        str37 = str2;
                                        str50 = str12;
                                        str49 = str11;
                                    }
                                    for (AbstractC4990 abstractC4995 : arrayList) {
                                        if (abstractC4995 instanceof C21924) {
                                            ((C21924) abstractC4995).m49381(c19248.f60597);
                                        }
                                    }
                                    Iterator it11 = c19248.f60597.values().iterator();
                                    while (it11.hasNext()) {
                                        ((AbstractC14307) it11.next()).m34133();
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
                                if (c5841Arr[i26].f17922.containsKey(str59)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i8];
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i8, ((C13888) c5841Arr[i26].f17922.get(str59)).m33297());
                                    }
                                    C5841 c58413 = c5841Arr[i26];
                                    dArr7[i25] = c58413.f17924;
                                    double[] dArr9 = dArr8[i25];
                                    C13888 c138810 = (C13888) c58413.f17922.get(str59);
                                    if (c138810.m33297() == 1) {
                                        dArr9[0] = c138810.m33296();
                                    } else {
                                        int iM33297 = c138810.m33297();
                                        float[] fArr3 = new float[iM33297];
                                        c138810.m33295(fArr3);
                                        int i27 = 0;
                                        int i28 = 0;
                                        while (i27 < iM33297) {
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
                            c19248.f60591[i22] = AbstractC20513.m46987(c19248.f60601, Arrays.copyOf(dArr7, i25), (double[][]) Arrays.copyOf(dArr8, i25));
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        C5841 c5841 = this.f60598;
        sb.append(c5841.f17915);
        sb.append(" y: ");
        sb.append(c5841.f17911);
        sb.append(" end: x: ");
        C5841 c5842 = this.f60609;
        sb.append(c5842.f17915);
        sb.append(" y: ");
        sb.append(c5842.f17911);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44396(C5841 c5841) {
        float x = (int) this.f60588.getX();
        float y = (int) this.f60588.getY();
        float width = this.f60588.getWidth();
        float height = this.f60588.getHeight();
        c5841.f17915 = x;
        c5841.f17911 = y;
        c5841.f17920 = width;
        c5841.f17923 = height;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44406(View view) {
        C5841 c5841 = this.f60598;
        c5841.f17924 = 0.0f;
        c5841.f17917 = 0.0f;
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth();
        float height = view.getHeight();
        c5841.f17915 = x;
        c5841.f17911 = y;
        c5841.f17920 = width;
        c5841.f17923 = height;
        this.f60607.m43084(view);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44413(C15094 c15094, C4201 c4201) {
        C5841 c5841 = this.f60598;
        c5841.f17924 = 0.0f;
        c5841.f17917 = 0.0f;
        m44396(c5841);
        float fM35774 = c15094.m35774();
        float fM35775 = c15094.m35775();
        float fM35753 = c15094.m35753();
        float fM35732 = c15094.m35732();
        c5841.f17915 = fM35774;
        c5841.f17911 = fM35775;
        c5841.f17920 = fM35753;
        c5841.f17923 = fM35732;
        C21135 c21135M12684 = c4201.m12684(this.f60606);
        c5841.m16363(c21135M12684);
        this.f60604 = c21135M12684.f68163.f27677;
        this.f60607.m43085(c15094, c4201, this.f60606);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44409(C15094 c15094, C4201 c4201) {
        C5841 c5841 = this.f60609;
        c5841.f17924 = 1.0f;
        c5841.f17917 = 1.0f;
        m44396(c5841);
        float fM35774 = c15094.m35774();
        float fM35775 = c15094.m35775();
        float fM35753 = c15094.m35753();
        float fM35732 = c15094.m35732();
        c5841.f17915 = fM35774;
        c5841.f17911 = fM35775;
        c5841.f17920 = fM35753;
        c5841.f17923 = fM35732;
        c5841.m16363(c4201.m12684(this.f60606));
        this.f60592.m43085(c15094, c4201, this.f60606);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private float m44397(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.f60593;
            if (f3 != 1.0d) {
                float f4 = this.f60585;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = (f - f4) * f3;
                }
            }
        }
        C8518 c8518 = this.f60598.f17913;
        float f5 = Float.NaN;
        for (C5841 c5841 : this.f60603) {
            C8518 c8519 = c5841.f17913;
            if (c8519 != null) {
                float f6 = c5841.f17924;
                if (f6 < f) {
                    c8518 = c8519;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = c5841.f17924;
                }
            }
        }
        if (c8518 != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) c8518.mo22211(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) c8518.mo22212(d);
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44410(float f, long j, View view, C14867 c14867) {
        boolean zMo1019;
        C7833 c7833;
        float f2;
        float fM44397 = m44397(f, (float[]) null);
        HashMap map = this.f60602;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC19123) it.next()).mo5144(fM44397, view);
            }
        }
        HashMap map2 = this.f60608;
        if (map2 != null) {
            c7833 = null;
            zMo1019 = false;
            for (AbstractC5717 abstractC5717 : map2.values()) {
                if (abstractC5717 instanceof C7833) {
                    c7833 = (C7833) abstractC5717;
                } else {
                    zMo1019 |= abstractC5717.mo1019(fM44397, j, view, c14867);
                }
            }
        } else {
            zMo1019 = false;
            c7833 = null;
        }
        AbstractC20513[] abstractC20513Arr = this.f60591;
        C5841 c5841 = this.f60598;
        if (abstractC20513Arr != null) {
            double d = fM44397;
            abstractC20513Arr[0].mo7169(d, this.f60595);
            this.f60591[0].mo7173(d, this.f60599);
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr = this.f60595;
                if (dArr.length > 0) {
                    abstractC20513.mo7169(d, dArr);
                    this.f60586.mo7173(d, this.f60599);
                }
            }
            int[] iArr = this.f60594;
            double[] dArr2 = this.f60595;
            double[] dArr3 = this.f60599;
            float f3 = c5841.f17915;
            float f4 = c5841.f17911;
            float f5 = c5841.f17920;
            float f6 = c5841.f17923;
            if (iArr.length != 0) {
                f2 = f3;
                if (c5841.f17914.length <= iArr[iArr.length - 1]) {
                    int i = iArr[iArr.length - 1] + 1;
                    c5841.f17914 = new double[i];
                    c5841.f17916 = new double[i];
                }
            } else {
                f2 = f3;
            }
            Arrays.fill(c5841.f17914, Double.NaN);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                double[] dArr4 = c5841.f17914;
                int i3 = iArr[i2];
                dArr4[i3] = dArr2[i2];
                c5841.f17916[i3] = dArr3[i2];
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
                double[] dArr5 = c5841.f17914;
                if (i4 >= dArr5.length) {
                    break;
                }
                if (!Double.isNaN(dArr5[i4])) {
                    float f15 = (float) (Double.isNaN(c5841.f17914[i4]) ? 0.0d : c5841.f17914[i4] + 0.0d);
                    float f16 = (float) c5841.f17916[i4];
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
            HashMap map3 = this.f60602;
            if (map3 != null) {
                for (AbstractC19123 abstractC19123 : map3.values()) {
                    if (abstractC19123 instanceof C17711) {
                        double[] dArr6 = this.f60599;
                        view.setRotation(((C17711) abstractC19123).m44146(fM44397) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                    }
                }
            }
            if (c7833 != null) {
                double[] dArr7 = this.f60599;
                view.setRotation(c7833.m16150(fM44397, j, view, c14867) + ((float) Math.toDegrees(Math.atan2(dArr7[1], dArr7[0]))));
                zMo1019 = c7833.f17634 | zMo1019;
            }
            int i11 = 1;
            while (true) {
                AbstractC20513[] abstractC20513Arr2 = this.f60591;
                if (i11 >= abstractC20513Arr2.length) {
                    break;
                }
                AbstractC20513 abstractC20514 = abstractC20513Arr2[i11];
                float[] fArr = this.f60605;
                abstractC20514.mo7170(d, fArr);
                ((C13888) c5841.f17922.get(this.f60600[i11 - 1])).m33293(view, fArr);
                i11++;
            }
            C18542 c18542 = this.f60607;
            if (c18542.f57462 == 0) {
                if (fM44397 <= 0.0f) {
                    view.setVisibility(c18542.f57469);
                } else {
                    C18542 c18543 = this.f60592;
                    if (fM44397 >= 1.0f) {
                        view.setVisibility(c18543.f57469);
                    } else if (c18543.f57469 != c18542.f57469) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.f60589 != null) {
                int i12 = 0;
                while (true) {
                    C3725[] c3725Arr = this.f60589;
                    if (i12 >= c3725Arr.length) {
                        break;
                    }
                    c3725Arr[i12].m11327(fM44397, view);
                    i12++;
                }
            }
        } else {
            float f19 = c5841.f17915;
            C5841 c5842 = this.f60609;
            float fM46695 = C20382.m46695(c5842.f17915, f19, fM44397, f19);
            float f20 = c5841.f17911;
            float fM46696 = C20382.m46695(c5842.f17911, f20, fM44397, f20);
            float f21 = c5841.f17920;
            float f22 = c5842.f17920;
            float fM46697 = C20382.m46695(f22, f21, fM44397, f21);
            float f23 = c5841.f17923;
            float f24 = c5842.f17923;
            float f25 = fM46695 + 0.5f;
            int i13 = (int) f25;
            float f26 = fM46696 + 0.5f;
            int i14 = (int) f26;
            int i15 = (int) (f25 + fM46697);
            int iM46695 = (int) (f26 + C20382.m46695(f24, f23, fM44397, f23));
            int i16 = i15 - i13;
            int i17 = iM46695 - i14;
            if (f22 != f21 || f24 != f23) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i16, 1073741824), View.MeasureSpec.makeMeasureSpec(i17, 1073741824));
            }
            view.layout(i13, i14, i15, iM46695);
        }
        HashMap map4 = this.f60597;
        if (map4 != null) {
            for (AbstractC14307 abstractC14307 : map4.values()) {
                if (abstractC14307 instanceof C9930) {
                    double[] dArr8 = this.f60599;
                    view.setRotation(((C9930) abstractC14307).m34132(fM44397) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    abstractC14307.mo5474(fM44397, view);
                }
            }
        }
        return zMo1019;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44400(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.f60590;
        float fM44397 = m44397(f, fArr2);
        AbstractC20513[] abstractC20513Arr = this.f60591;
        C5841 c5841 = this.f60598;
        int i = 0;
        if (abstractC20513Arr != null) {
            double d = fM44397;
            abstractC20513Arr[0].mo7173(d, this.f60599);
            this.f60591[0].mo7169(d, this.f60595);
            float f4 = fArr2[0];
            while (true) {
                dArr = this.f60599;
                if (i >= dArr.length) {
                    break;
                }
                dArr[i] = dArr[i] * ((double) f4);
                i++;
            }
            AbstractC20513 abstractC20513 = this.f60586;
            if (abstractC20513 != null) {
                double[] dArr2 = this.f60595;
                if (dArr2.length > 0) {
                    abstractC20513.mo7169(d, dArr2);
                    this.f60586.mo7173(d, this.f60599);
                    int[] iArr = this.f60594;
                    double[] dArr3 = this.f60599;
                    double[] dArr4 = this.f60595;
                    c5841.getClass();
                    C5841.m16360(f2, f3, fArr, iArr, dArr3, dArr4);
                    return;
                }
                return;
            }
            int[] iArr2 = this.f60594;
            double[] dArr5 = this.f60595;
            c5841.getClass();
            C5841.m16360(f2, f3, fArr, iArr2, dArr, dArr5);
            return;
        }
        C5841 c5842 = this.f60609;
        float f5 = c5842.f17915 - c5841.f17915;
        float f6 = c5842.f17911 - c5841.f17911;
        float f7 = c5842.f17920 - c5841.f17920;
        float f8 = (c5842.f17923 - c5841.f17923) + f6;
        fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
        fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44401(float f, int i, int i2, float f2, float f3, float[] fArr) {
        float[] fArr2 = this.f60590;
        float fM44397 = m44397(f, fArr2);
        HashMap map = this.f60602;
        AbstractC19123 abstractC19123 = map == null ? null : (AbstractC19123) map.get("translationX");
        HashMap map2 = this.f60602;
        AbstractC19123 abstractC19124 = map2 == null ? null : (AbstractC19123) map2.get("translationY");
        HashMap map3 = this.f60602;
        AbstractC19123 abstractC19125 = map3 == null ? null : (AbstractC19123) map3.get("rotation");
        HashMap map4 = this.f60602;
        AbstractC19123 abstractC19126 = map4 == null ? null : (AbstractC19123) map4.get("scaleX");
        HashMap map5 = this.f60602;
        AbstractC19123 abstractC19127 = map5 == null ? null : (AbstractC19123) map5.get("scaleY");
        HashMap map6 = this.f60597;
        AbstractC14307 abstractC14307 = map6 == null ? null : (AbstractC14307) map6.get("translationX");
        HashMap map7 = this.f60597;
        AbstractC14307 abstractC14308 = map7 == null ? null : (AbstractC14307) map7.get("translationY");
        HashMap map8 = this.f60597;
        AbstractC14307 abstractC14309 = map8 == null ? null : (AbstractC14307) map8.get("rotation");
        HashMap map9 = this.f60597;
        AbstractC14307 abstractC143010 = map9 == null ? null : (AbstractC14307) map9.get("scaleX");
        HashMap map10 = this.f60597;
        AbstractC14307 abstractC143011 = map10 != null ? (AbstractC14307) map10.get("scaleY") : null;
        C19102 c19102 = new C19102();
        c19102.m44024();
        c19102.m44028(abstractC19125, fM44397);
        c19102.m44031(abstractC19123, abstractC19124, fM44397);
        c19102.m44029(abstractC19126, abstractC19127, fM44397);
        c19102.m44026(abstractC14309, fM44397);
        c19102.m44030(abstractC14307, abstractC14308, fM44397);
        c19102.m44027(abstractC143010, abstractC143011, fM44397);
        AbstractC20513 abstractC20513 = this.f60586;
        C5841 c5841 = this.f60598;
        if (abstractC20513 != null) {
            double[] dArr = this.f60595;
            if (dArr.length > 0) {
                double d = fM44397;
                abstractC20513.mo7169(d, dArr);
                this.f60586.mo7173(d, this.f60599);
                int[] iArr = this.f60594;
                double[] dArr2 = this.f60599;
                double[] dArr3 = this.f60595;
                c5841.getClass();
                C5841.m16360(f2, f3, fArr, iArr, dArr2, dArr3);
            }
            c19102.m44025(f2, f3, i, i2, fArr);
            return;
        }
        if (this.f60591 != null) {
            double dM44397 = m44397(fM44397, fArr2);
            this.f60591[0].mo7173(dM44397, this.f60599);
            this.f60591[0].mo7169(dM44397, this.f60595);
            float f4 = fArr2[0];
            int i3 = 0;
            while (true) {
                double[] dArr4 = this.f60599;
                if (i3 < dArr4.length) {
                    dArr4[i3] = dArr4[i3] * ((double) f4);
                    i3++;
                } else {
                    int[] iArr2 = this.f60594;
                    double[] dArr5 = this.f60595;
                    c5841.getClass();
                    C5841.m16360(f2, f3, fArr, iArr2, dArr4, dArr5);
                    c19102.m44025(f2, f3, i, i2, fArr);
                    return;
                }
            }
        } else {
            C5841 c5842 = this.f60609;
            float f5 = c5842.f17915 - c5841.f17915;
            AbstractC14307 abstractC143012 = abstractC143011;
            float f6 = c5842.f17911 - c5841.f17911;
            float f7 = c5842.f17920 - c5841.f17920;
            float f8 = (c5842.f17923 - c5841.f17923) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            c19102.m44024();
            c19102.m44028(abstractC19125, fM44397);
            c19102.m44031(abstractC19123, abstractC19124, fM44397);
            c19102.m44029(abstractC19126, abstractC19127, fM44397);
            c19102.m44026(abstractC14309, fM44397);
            c19102.m44030(abstractC14307, abstractC14308, fM44397);
            c19102.m44027(abstractC143010, abstractC143012, fM44397);
            c19102.m44025(f2, f3, i, i2, fArr);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44398() {
        int iMax = this.f60598.f17921;
        Iterator it = this.f60603.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((C5841) it.next()).f17921);
        }
        return Math.max(iMax, this.f60609.f17921);
    }
}
