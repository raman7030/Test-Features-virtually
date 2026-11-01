package p067l;

import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8953 extends AbstractC5149 {

    /* JADX INFO: renamed from: ۜ֫ */
    public static final C13259 f24263 = C13259.m30304("(?m)^[ \\t]*// MARK_(?:CLASS_START (L.+?;)|(CLASS_END)|METHOD_START ([vd]) (.+)|(METHOD_END)|FIELD_START ([si]) (.+)|(FIELD_END))\\r?\\n");

    /* JADX INFO: renamed from: ֫֫ */
    public final ArrayList f24264;

    /* JADX INFO: renamed from: ۟ */
    public Object f24265;

    /* JADX INFO: renamed from: ۧ֫ */
    public AbstractC16003 f24266;

    /* JADX INFO: renamed from: ܳ֫ */
    public List f24267 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܽ֫ */
    public final ArrayList f24268;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f24269;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f24270;

    /* JADX INFO: renamed from: ᩻֫ */
    public final ArrayList f24271;

    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[PHI: r16 r17
      0x0132: PHI (r16v7 l.᩻ᩳۢ) = (r16v4 l.᩻ᩳۢ), (r16v4 l.᩻ᩳۢ), (r16v4 l.᩻ᩳۢ), (r16v9 l.᩻ᩳۢ) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r17v7 int) = (r17v4 int), (r17v4 int), (r17v4 int), (r17v10 int) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX INFO: renamed from: ֫ */
    public static C1349 m20680(String str) {
        char c;
        C25046 c25046;
        int i;
        int i2;
        C10769 c10769;
        C24850 c24850;
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C10769> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C25046 c25047 = new C25046(str);
        C13929 c13929Matcher = f24263.matcher((CharSequence) str);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        C16132 c16132 = null;
        while (c13929Matcher.find()) {
            while (i4 < c13929Matcher.start()) {
                int iM54983 = c25047.m54983(i4, true);
                i4 = iM54983 > i4 ? iM54983 : i4 + 1;
            }
            if (i4 <= c13929Matcher.start()) {
                int iEnd = c13929Matcher.end();
                if (c13929Matcher.group(1) != null) {
                    c = 4;
                } else if (c13929Matcher.group(2) != null) {
                    c = 5;
                } else if (c13929Matcher.group(3) != null) {
                    c = 6;
                } else if (c13929Matcher.group(5) != null) {
                    c = 7;
                } else {
                    c = c13929Matcher.group(6) != null ? '\b' : '\t';
                }
                sb.append((CharSequence) str, i3, c13929Matcher.start());
                int iEnd2 = c13929Matcher.end();
                switch (c) {
                    case 4:
                        c25046 = c25047;
                        i = iEnd2;
                        i2 = iEnd;
                        String strGroup = c13929Matcher.group(1);
                        int length = sb.length();
                        if (strGroup == null || strGroup.isEmpty()) {
                            c10769 = null;
                        } else {
                            c10769 = new C10769();
                            c10769.f29843 = strGroup;
                            int iLastIndexOf = strGroup.lastIndexOf(47) + 1;
                            if (iLastIndexOf == 0 && strGroup.startsWith("L")) {
                                iLastIndexOf = 1;
                            }
                            c10769.f29841 = C17073.m38720(1, iLastIndexOf, strGroup);
                            c10769.f29842 = length;
                        }
                        if (c10769 != null) {
                            arrayList.add(c10769);
                            arrayList4.add(c10769);
                        }
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 5:
                        c25046 = c25047;
                        i = iEnd2;
                        i2 = iEnd;
                        if (!arrayList4.isEmpty()) {
                            ((C10769) C6406.m14670(arrayList4, 1)).f29840 = sb.length();
                        }
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 6:
                        c25046 = c25047;
                        i = iEnd2;
                        String strGroup2 = c13929Matcher.group(4);
                        boolean zEquals = c13929Matcher.group(3).equals(C0655am.f2277aE);
                        int length2 = sb.length();
                        if (strGroup2 == null || (iIndexOf = strGroup2.indexOf("->")) == -1) {
                            i2 = iEnd;
                        } else {
                            i2 = iEnd;
                            String strSubstring = strGroup2.substring(0, iIndexOf);
                            String[] strArrSplit = strGroup2.substring(iIndexOf + 2).split("[()]");
                            if (strArrSplit.length == 3) {
                                C24850 c24851 = new C24850();
                                c24851.f79380 = strArrSplit[0];
                                c24851.f79375 = strArrSplit[1];
                                c24851.f79379 = strArrSplit[2];
                                c24851.f79378 = strSubstring;
                                c24851.f79381 = zEquals;
                                c24851.f79377 = length2;
                                c24850 = c24851;
                            }
                            if (c24850 != null) {
                                arrayList5.add(c24850);
                            }
                            c25047 = c25046;
                            i3 = i;
                            i4 = i2;
                        }
                        c24850 = null;
                        if (c24850 != null) {
                            arrayList5.add(c24850);
                        }
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 7:
                        c25046 = c25047;
                        i = iEnd2;
                        if (!arrayList5.isEmpty()) {
                            C24850 c24852 = (C24850) C6406.m14670(arrayList5, 1);
                            c24852.f79376 = sb.length();
                            arrayList2.add(c24852);
                        }
                        i2 = iEnd;
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\b':
                        c25046 = c25047;
                        i = iEnd2;
                        String strGroup3 = c13929Matcher.group(7);
                        boolean zEquals2 = c13929Matcher.group(6).equals(C0655am.f2274aB);
                        int length3 = sb.length();
                        if (strGroup3 == null || (iIndexOf2 = strGroup3.indexOf("->")) == -1) {
                            c16132 = null;
                        } else {
                            String strSubstring2 = strGroup3.substring(0, iIndexOf2);
                            String strSubstring3 = strGroup3.substring(iIndexOf2 + 2);
                            int iIndexOf3 = strSubstring3.indexOf(58);
                            if (iIndexOf3 == -1) {
                                c16132 = null;
                            } else {
                                C16132 c16133 = new C16132();
                                c16133.f47474 = strSubstring3.substring(0, iIndexOf3);
                                c16133.f47471 = strSubstring3.substring(iIndexOf3 + 1);
                                c16133.f47470 = strSubstring2;
                                c16133.f47473 = length3;
                                c16133.f47472 = zEquals2;
                                c16132 = c16133;
                            }
                        }
                        i2 = iEnd;
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\t':
                        if (c16132 != null) {
                            int length4 = sb.length();
                            c16132.f47469 = length4;
                            String strTrim = sb.substring(c16132.f47473, length4).trim();
                            C25046 c25048 = new C25046(strTrim);
                            int i5 = -1;
                            int i6 = 0;
                            c25046 = c25047;
                            while (true) {
                                if (i6 < strTrim.length()) {
                                    int iM54984 = c25048.m54983(i6, true);
                                    if (iM54984 > i6) {
                                        i6 = iM54984;
                                        i = iEnd2;
                                    } else if (strTrim.startsWith(" = ", i6)) {
                                        i6 += 3;
                                        i = iEnd2;
                                        i5 = i6;
                                    } else {
                                        i = iEnd2;
                                        if (strTrim.charAt(i6) != ';' || i5 == -1) {
                                            i6++;
                                        } else {
                                            c16132.f47475 = C8597.m20011(24, strTrim.substring(i5, i6));
                                        }
                                    }
                                    iEnd2 = i;
                                } else {
                                    i = iEnd2;
                                }
                            }
                            arrayList3.add(c16132);
                            c16132 = null;
                        } else {
                            c25046 = c25047;
                            i = iEnd2;
                        }
                        i2 = iEnd;
                        c25047 = c25046;
                        i3 = i;
                        i4 = i2;
                        break;
                    default:
                        throw new RuntimeException();
                }
            }
        }
        sb.append((CharSequence) str, i3, str.length());
        String string = sb.toString();
        for (C10769 c107610 : arrayList) {
            if (c107610.f29840 == 0) {
                c107610.f29840 = string.length();
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        return new C1349(string, new C8953(arrayList, arrayList2, arrayList3));
    }

    public C8953(C22739 c22739) {
        C3292 c3292M50891 = c22739.m50891(C0655am.f2281aI);
        C3292 c3292M50892 = c22739.m50891("m");
        C3292 c3292M50893 = c22739.m50891("f");
        c3292M50891 = c3292M50891 == null ? new C3292() : c3292M50891;
        ArrayList arrayList = new ArrayList(c3292M50891.size());
        ArrayList arrayList2 = new ArrayList(c3292M50892.size());
        ArrayList arrayList3 = new ArrayList(c3292M50893.size());
        for (int i = 0; i < c3292M50891.size(); i++) {
            C22739 c22739M5735 = c3292M50891.m5735(i);
            C10769 c10769 = new C10769();
            c10769.f29841 = c22739M5735.m50890("n");
            c10769.f29843 = c22739M5735.m50890(C0655am.f2281aI);
            c10769.f29842 = c22739M5735.m50888(C0655am.f2274aB);
            c10769.f29840 = c22739M5735.m50888("e");
            arrayList.add(c10769);
        }
        for (int i2 = 0; i2 < c3292M50892.size(); i2++) {
            C22739 c22739M5736 = c3292M50892.m5735(i2);
            C24850 c24850 = new C24850();
            c24850.f79380 = c22739M5736.m50890("n");
            c24850.f79375 = c22739M5736.m50890(C0655am.f2320av);
            c24850.f79379 = c22739M5736.m50890("r");
            c24850.f79378 = c22739M5736.m50890(C0655am.f2279aG);
            c24850.f79381 = c22739M5736.m50889().booleanValue();
            c24850.f79377 = c22739M5736.m50888(C0655am.f2274aB);
            c24850.f79376 = c22739M5736.m50888("e");
            arrayList2.add(c24850);
        }
        for (int i3 = 0; i3 < c3292M50893.size(); i3++) {
            C22739 c22739M5737 = c3292M50893.m5735(i3);
            C16132 c16132 = new C16132();
            c16132.f47474 = c22739M5737.m50890("n");
            c16132.f47471 = c22739M5737.m50890(C0655am.f2281aI);
            c16132.f47475 = c22739M5737.m50890(C0655am.f2277aE);
            c16132.f47470 = c22739M5737.m50890(C0655am.f2279aG);
            c16132.f47472 = c22739M5737.m50887(C0655am.f2278aF);
            c16132.f47473 = c22739M5737.m50888(C0655am.f2274aB);
            c16132.f47469 = c22739M5737.m50888("e");
            arrayList3.add(c16132);
        }
        this.f24271 = arrayList;
        this.f24268 = arrayList2;
        this.f24264 = arrayList3;
    }

    public C8953(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f24271 = arrayList;
        this.f24268 = arrayList2;
        this.f24264 = arrayList3;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C22739 m20684() {
        C22739 c22739 = new C22739();
        C3292 c3292 = new C3292();
        C3292 c3293 = new C3292();
        C3292 c3294 = new C3292();
        for (C10769 c10769 : this.f24271) {
            c10769.getClass();
            C22739 c227310 = new C22739();
            c227310.m50886("n", c10769.f29841);
            c227310.m50886(C0655am.f2281aI, c10769.f29843);
            c227310.m50886(C0655am.f2274aB, Integer.valueOf(c10769.f29842));
            c227310.m50886("e", Integer.valueOf(c10769.f29840));
            c3292.add(c227310);
        }
        for (C24850 c24850 : this.f24268) {
            c24850.getClass();
            C22739 c227311 = new C22739();
            c227311.m50886("n", c24850.f79380);
            c227311.m50886(C0655am.f2320av, c24850.f79375);
            c227311.m50886("r", c24850.f79379);
            String str = c24850.f79378;
            if (str != null) {
                c227311.m50886(C0655am.f2279aG, str);
            }
            c227311.m50886(C0655am.f2277aE, Boolean.valueOf(c24850.f79381));
            c227311.m50886(C0655am.f2274aB, Integer.valueOf(c24850.f79377));
            c227311.m50886("e", Integer.valueOf(c24850.f79376));
            c3293.add(c227311);
        }
        for (C16132 c16132 : this.f24264) {
            c16132.getClass();
            C22739 c227312 = new C22739();
            c227312.m50886("n", c16132.f47474);
            c227312.m50886(C0655am.f2281aI, c16132.f47471);
            String str2 = c16132.f47475;
            if (str2 != null) {
                c227312.m50886(C0655am.f2277aE, str2);
            }
            String str3 = c16132.f47470;
            if (str3 != null) {
                c227312.m50886(C0655am.f2279aG, str3);
            }
            c227312.m50886(C0655am.f2278aF, Boolean.valueOf(c16132.f47472));
            c227312.m50886(C0655am.f2274aB, Integer.valueOf(c16132.f47473));
            c227312.m50886("e", Integer.valueOf(c16132.f47469));
            c3294.add(c227312);
        }
        c22739.m50886(C0655am.f2281aI, c3292);
        c22739.m50886("m", c3293);
        c22739.m50886("f", c3294);
        return c22739;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10031(C14121 c14121, CharSequence charSequence) {
        m10997(charSequence, new InterfaceC21243() { // from class: l.ܳᩳۢ
            @Override // p067l.InterfaceC21243
            /* JADX INFO: renamed from: ֫ */
            public final Runnable mo13525(CharSequence charSequence2, InterfaceC18588 interfaceC18588) {
                ArrayList arrayList = new ArrayList();
                C25046 c25046 = new C25046(charSequence2);
                int i = 0;
                while (i < charSequence2.length() && !interfaceC18588.mo3924()) {
                    try {
                        int iM54983 = c25046.m54983(i, false);
                        if (iM54983 == i) {
                            i++;
                        } else {
                            if (charSequence2.charAt(i) == '\"') {
                                C11440 c11440 = new C11440();
                                int i2 = i + 1;
                                c11440.f31894 = i2;
                                int i3 = iM54983 - 1;
                                c11440.f31892 = i3;
                                String string = charSequence2.subSequence(i2, i3).toString();
                                c11440.f31893 = string;
                                try {
                                    c11440.f31895 = C11905.f33152.m30298(string);
                                } catch (RuntimeException unused) {
                                    c11440.f31895 = c11440.f31893;
                                }
                                arrayList.add(c11440);
                            }
                            i = iM54983;
                        }
                    } catch (Exception unused2) {
                    }
                }
                return new RunnableC3003(2, this.f47980, arrayList);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m20681(C8953 c8953, ArrayList arrayList) {
        c8953.f24267 = C21562.unmodifiableList(arrayList);
        ?? r4 = c8953.f24266;
        if (r4 != 0) {
            c8953.m20683(c8953.f24270, c8953.f24269, r4);
        }
        InterfaceC8757 interfaceC8757 = c8953.f10724;
        if (interfaceC8757 != null) {
            interfaceC8757.mo20240(c8953.f24271, c8953.f24268, c8953.f24264, c8953.f24267);
        }
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10027() {
        if (m10999()) {
            return this.f24265;
        }
        return null;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10028(final int i, final int i2, final InterfaceC22169 interfaceC22169) {
        m10998(new Runnable(interfaceC22169, i, i2) { // from class: l.ܿᩳۢ

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ int f56673;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ int f56674;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ AbstractC16003 f56676;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f56676 = (AbstractC16003) interfaceC22169;
                this.f56674 = i;
                this.f56673 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C8953.m20682(this.f56675, this.f56676, this.f56674, this.f56673);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m20682(C8953 c8953, InterfaceC22169 interfaceC22169, int i, int i2) {
        c8953.f24266 = (AbstractC16003) interfaceC22169;
        c8953.f24270 = i;
        c8953.f24269 = i2;
        if (c8953.m10999()) {
            c8953.m20683(i, i2, interfaceC22169);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m20683(int i, int i2, InterfaceC22169 interfaceC22169) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f24265 = null;
        for (C24850 c24850 : this.f24268) {
            int i7 = c24850.f79377;
            if (i >= i7 && i <= (i6 = c24850.f79376)) {
                if (i2 < i7 || i2 > i6) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f24265 = c24850;
                    interfaceC22169.mo19362(c24850.f79377, c24850.f79376, C10965.m25286(new StringBuilder(), c24850.f79380, "()"));
                    return;
                }
            }
        }
        for (C16132 c16132 : this.f24264) {
            int i8 = c16132.f47473;
            if (i >= i8 && i <= (i5 = c16132.f47469)) {
                if (i2 < i8 || i2 > i5) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f24265 = c16132;
                    interfaceC22169.mo19362(-1, -1, c16132.f47474);
                    return;
                }
            }
        }
        int i9 = Integer.MAX_VALUE;
        C10769 c10769 = null;
        for (C10769 c107610 : this.f24271) {
            int i10 = c107610.f29842;
            if (i >= i10 && i <= (i3 = c107610.f29840) && i2 >= i10 && i2 <= i3 && (i4 = i3 - i10) < i9) {
                c10769 = c107610;
                i9 = i4;
            }
        }
        if (c10769 == null) {
            interfaceC22169.mo19362(0, 0, null);
        } else {
            this.f24265 = c10769;
            interfaceC22169.mo19362(-1, -1, c10769.f29841);
        }
    }
}
