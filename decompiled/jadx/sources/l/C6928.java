package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۜᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: UATT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6928 extends AbstractC2926 {

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f21382 = C11459.m28260("(?m)^[ \\t]*// MARK_(?:CLASS_START (L.+?;)|(CLASS_END)|METHOD_START ([vd]) (.+)|(METHOD_END)|FIELD_START ([si]) (.+)|(FIELD_END))\\r?\\n");

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21383;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f21384;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f21385;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f21386 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21387;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f21388;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f21389;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f21390;

    /* JADX WARN: Code duplicated, block: B:63:0x0132 A[PHI: r16 r17
      0x0132: PHI (r16v7 l.᩻ᩳۢ) = (r16v4 l.᩻ᩳۢ), (r16v4 l.᩻ᩳۢ), (r16v4 l.᩻ᩳۢ), (r16v9 l.᩻ᩳۢ) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r17v7 int) = (r17v4 int), (r17v4 int), (r17v4 int), (r17v10 int) binds: [B:56:0x0114, B:59:0x011c, B:62:0x0130, B:53:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10220 m18730(String str) {
        char c;
        C23861 c23861;
        int i;
        int i2;
        C8839 c8839;
        C23655 c23655;
        int iIndexOf;
        int iIndexOf2;
        ArrayList<C8839> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        C23861 c23862 = new C23861(str);
        C12164 c12164Matcher = f21382.matcher((CharSequence) str);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        C14482 c14482 = null;
        while (c12164Matcher.find()) {
            while (i4 < c12164Matcher.start()) {
                int iM52574 = c23862.m52574(i4, true);
                i4 = iM52574 > i4 ? iM52574 : i4 + 1;
            }
            if (i4 <= c12164Matcher.start()) {
                int iEnd = c12164Matcher.end();
                if (c12164Matcher.group(1) != null) {
                    c = 4;
                } else if (c12164Matcher.group(2) != null) {
                    c = 5;
                } else if (c12164Matcher.group(3) != null) {
                    c = 6;
                } else if (c12164Matcher.group(5) != null) {
                    c = 7;
                } else {
                    c = c12164Matcher.group(6) != null ? '\b' : '\t';
                }
                sb.append((CharSequence) str, i3, c12164Matcher.start());
                int iEnd2 = c12164Matcher.end();
                switch (c) {
                    case 4:
                        c23861 = c23862;
                        i = iEnd2;
                        i2 = iEnd;
                        String strGroup = c12164Matcher.group(1);
                        int length = sb.length();
                        if (strGroup == null || strGroup.isEmpty()) {
                            c8839 = null;
                        } else {
                            c8839 = new C8839();
                            c8839.f26919 = strGroup;
                            int iLastIndexOf = strGroup.lastIndexOf(47) + 1;
                            if (iLastIndexOf == 0 && strGroup.startsWith("L")) {
                                iLastIndexOf = 1;
                            }
                            c8839.f26917 = C15472.m36561(1, iLastIndexOf, strGroup);
                            c8839.f26918 = length;
                        }
                        if (c8839 != null) {
                            arrayList.add(c8839);
                            arrayList4.add(c8839);
                        }
                        c23862 = c23861;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 5:
                        c23861 = c23862;
                        i = iEnd2;
                        i2 = iEnd;
                        if (!arrayList4.isEmpty()) {
                            ((C8839) C4248.m12790(arrayList4, 1)).f26916 = sb.length();
                        }
                        c23862 = c23861;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 6:
                        c23861 = c23862;
                        i = iEnd2;
                        String strGroup2 = c12164Matcher.group(4);
                        boolean zEquals = c12164Matcher.group(3).equals(am.aE);
                        int length2 = sb.length();
                        if (strGroup2 == null || (iIndexOf = strGroup2.indexOf("->")) == -1) {
                            i2 = iEnd;
                        } else {
                            i2 = iEnd;
                            String strSubstring = strGroup2.substring(0, iIndexOf);
                            String[] strArrSplit = strGroup2.substring(iIndexOf + 2).split("[()]");
                            if (strArrSplit.length == 3) {
                                C23655 c23656 = new C23655();
                                c23656.f76634 = strArrSplit[0];
                                c23656.f76629 = strArrSplit[1];
                                c23656.f76633 = strArrSplit[2];
                                c23656.f76632 = strSubstring;
                                c23656.f76635 = zEquals;
                                c23656.f76631 = length2;
                                c23655 = c23656;
                            }
                            if (c23655 != null) {
                                arrayList5.add(c23655);
                            }
                            c23862 = c23861;
                            i3 = i;
                            i4 = i2;
                        }
                        c23655 = null;
                        if (c23655 != null) {
                            arrayList5.add(c23655);
                        }
                        c23862 = c23861;
                        i3 = i;
                        i4 = i2;
                        break;
                    case 7:
                        c23861 = c23862;
                        i = iEnd2;
                        if (!arrayList5.isEmpty()) {
                            C23655 c23657 = (C23655) C4248.m12790(arrayList5, 1);
                            c23657.f76630 = sb.length();
                            arrayList2.add(c23657);
                        }
                        i2 = iEnd;
                        c23862 = c23861;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\b':
                        c23861 = c23862;
                        i = iEnd2;
                        String strGroup3 = c12164Matcher.group(7);
                        boolean zEquals2 = c12164Matcher.group(6).equals(am.aB);
                        int length3 = sb.length();
                        if (strGroup3 == null || (iIndexOf2 = strGroup3.indexOf("->")) == -1) {
                            c14482 = null;
                        } else {
                            String strSubstring2 = strGroup3.substring(0, iIndexOf2);
                            String strSubstring3 = strGroup3.substring(iIndexOf2 + 2);
                            int iIndexOf3 = strSubstring3.indexOf(58);
                            if (iIndexOf3 == -1) {
                                c14482 = null;
                            } else {
                                C14482 c14483 = new C14482();
                                c14483.f44373 = strSubstring3.substring(0, iIndexOf3);
                                c14483.f44370 = strSubstring3.substring(iIndexOf3 + 1);
                                c14483.f44369 = strSubstring2;
                                c14483.f44372 = length3;
                                c14483.f44371 = zEquals2;
                                c14482 = c14483;
                            }
                        }
                        i2 = iEnd;
                        c23862 = c23861;
                        i3 = i;
                        i4 = i2;
                        break;
                    case '\t':
                        if (c14482 != null) {
                            int length4 = sb.length();
                            c14482.f44368 = length4;
                            String strTrim = sb.substring(c14482.f44372, length4).trim();
                            C23861 c23863 = new C23861(strTrim);
                            int i5 = -1;
                            int i6 = 0;
                            c23861 = c23862;
                            while (true) {
                                if (i6 < strTrim.length()) {
                                    int iM52575 = c23863.m52574(i6, true);
                                    if (iM52575 > i6) {
                                        i6 = iM52575;
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
                                            c14482.f44374 = C6554.m18061(24, strTrim.substring(i5, i6));
                                        }
                                    }
                                    iEnd2 = i;
                                } else {
                                    i = iEnd2;
                                }
                            }
                            arrayList3.add(c14482);
                            c14482 = null;
                        } else {
                            c23861 = c23862;
                            i = iEnd2;
                        }
                        i2 = iEnd;
                        c23862 = c23861;
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
        for (C8839 c88310 : arrayList) {
            if (c88310.f26916 == 0) {
                c88310.f26916 = string.length();
            }
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        return new C10220(string, new C6928(arrayList, arrayList2, arrayList3));
    }

    public C6928(C21434 c21434) {
        C0972 c0972M48554 = c21434.m48554(am.aI);
        C0972 c0972M48555 = c21434.m48554("m");
        C0972 c0972M48556 = c21434.m48554("f");
        c0972M48554 = c0972M48554 == null ? new C0972() : c0972M48554;
        ArrayList arrayList = new ArrayList(c0972M48554.size());
        ArrayList arrayList2 = new ArrayList(c0972M48555.size());
        ArrayList arrayList3 = new ArrayList(c0972M48556.size());
        for (int i = 0; i < c0972M48554.size(); i++) {
            C21434 c21434M3432 = c0972M48554.m3432(i);
            C8839 c8839 = new C8839();
            c8839.f26917 = c21434M3432.m48553("n");
            c8839.f26919 = c21434M3432.m48553(am.aI);
            c8839.f26918 = c21434M3432.m48551(am.aB);
            c8839.f26916 = c21434M3432.m48551("e");
            arrayList.add(c8839);
        }
        for (int i2 = 0; i2 < c0972M48555.size(); i2++) {
            C21434 c21434M3433 = c0972M48555.m3432(i2);
            C23655 c23655 = new C23655();
            c23655.f76634 = c21434M3433.m48553("n");
            c23655.f76629 = c21434M3433.m48553(am.av);
            c23655.f76633 = c21434M3433.m48553("r");
            c23655.f76632 = c21434M3433.m48553(am.aG);
            c23655.f76635 = c21434M3433.m48552().booleanValue();
            c23655.f76631 = c21434M3433.m48551(am.aB);
            c23655.f76630 = c21434M3433.m48551("e");
            arrayList2.add(c23655);
        }
        for (int i3 = 0; i3 < c0972M48556.size(); i3++) {
            C21434 c21434M3434 = c0972M48556.m3432(i3);
            C14482 c14482 = new C14482();
            c14482.f44373 = c21434M3434.m48553("n");
            c14482.f44370 = c21434M3434.m48553(am.aI);
            c14482.f44374 = c21434M3434.m48553(am.aE);
            c14482.f44369 = c21434M3434.m48553(am.aG);
            c14482.f44371 = c21434M3434.m48550(am.aF);
            c14482.f44372 = c21434M3434.m48551(am.aB);
            c14482.f44368 = c21434M3434.m48551("e");
            arrayList3.add(c14482);
        }
        this.f21390 = arrayList;
        this.f21387 = arrayList2;
        this.f21383 = arrayList3;
    }

    public C6928(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f21390 = arrayList;
        this.f21387 = arrayList2;
        this.f21383 = arrayList3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21434 m18734() {
        C21434 c21434 = new C21434();
        C0972 c0972 = new C0972();
        C0972 c0973 = new C0972();
        C0972 c0974 = new C0972();
        for (C8839 c8839 : this.f21390) {
            c8839.getClass();
            C21434 c21435 = new C21434();
            c21435.m48549("n", c8839.f26917);
            c21435.m48549(am.aI, c8839.f26919);
            c21435.m48549(am.aB, Integer.valueOf(c8839.f26918));
            c21435.m48549("e", Integer.valueOf(c8839.f26916));
            c0972.add(c21435);
        }
        for (C23655 c23655 : this.f21387) {
            c23655.getClass();
            C21434 c21436 = new C21434();
            c21436.m48549("n", c23655.f76634);
            c21436.m48549(am.av, c23655.f76629);
            c21436.m48549("r", c23655.f76633);
            String str = c23655.f76632;
            if (str != null) {
                c21436.m48549(am.aG, str);
            }
            c21436.m48549(am.aE, Boolean.valueOf(c23655.f76635));
            c21436.m48549(am.aB, Integer.valueOf(c23655.f76631));
            c21436.m48549("e", Integer.valueOf(c23655.f76630));
            c0973.add(c21436);
        }
        for (C14482 c14482 : this.f21383) {
            c14482.getClass();
            C21434 c21437 = new C21434();
            c21437.m48549("n", c14482.f44373);
            c21437.m48549(am.aI, c14482.f44370);
            String str2 = c14482.f44374;
            if (str2 != null) {
                c21437.m48549(am.aE, str2);
            }
            String str3 = c14482.f44369;
            if (str3 != null) {
                c21437.m48549(am.aG, str3);
            }
            c21437.m48549(am.aF, Boolean.valueOf(c14482.f44371));
            c21437.m48549(am.aB, Integer.valueOf(c14482.f44372));
            c21437.m48549("e", Integer.valueOf(c14482.f44368));
            c0974.add(c21437);
        }
        c21434.m48549(am.aI, c0972);
        c21434.m48549("m", c0973);
        c21434.m48549("f", c0974);
        return c21434;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        m8929(charSequence, new InterfaceC19860() { // from class: l.ܳᩳۢ
            @Override // l.InterfaceC19860
            /* JADX INFO: renamed from: ֫ */
            public final Runnable mo11589(CharSequence charSequence2, InterfaceC17066 interfaceC17066) {
                ArrayList arrayList = new ArrayList();
                C23861 c23861 = new C23861(charSequence2);
                int i = 0;
                while (i < charSequence2.length() && !interfaceC17066.mo1526()) {
                    try {
                        int iM52574 = c23861.m52574(i, false);
                        if (iM52574 == i) {
                            i++;
                        } else {
                            if (charSequence2.charAt(i) == '\"') {
                                C9545 c9545 = new C9545();
                                int i2 = i + 1;
                                c9545.f28948 = i2;
                                int i3 = iM52574 - 1;
                                c9545.f28946 = i3;
                                String string = charSequence2.subSequence(i2, i3).toString();
                                c9545.f28947 = string;
                                try {
                                    c9545.f28949 = C10035.f30194.m28254(string);
                                } catch (RuntimeException unused) {
                                    c9545.f28949 = c9545.f28947;
                                }
                                arrayList.add(c9545);
                            }
                            i = iM52574;
                        }
                    } catch (Exception unused2) {
                    }
                }
                return new RunnableC0667(2, this.f44865, arrayList);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18731(C6928 c6928, ArrayList arrayList) {
        c6928.f21386 = C20195.unmodifiableList(arrayList);
        ?? r4 = c6928.f21385;
        if (r4 != 0) {
            c6928.m18733(c6928.f21389, c6928.f21388, r4);
        }
        InterfaceC6722 interfaceC6722 = c6928.f7936;
        if (interfaceC6722 != null) {
            interfaceC6722.mo18292(c6928.f21390, c6928.f21387, c6928.f21383, c6928.f21386);
        }
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7979() {
        if (m8931()) {
            return this.f21384;
        }
        return null;
    }

    @Override // l.AbstractC2489
    /* JADX INFO: renamed from: ֫ */
    public final void mo7980(final int i, final int i2, final InterfaceC20834 interfaceC20834) {
        m8930(new Runnable(interfaceC20834, i, i2) { // from class: l.ܿᩳۢ

            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f53483;

            /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f53484;

            /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC14346 f53486;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f53486 = (AbstractC14346) interfaceC20834;
                this.f53484 = i;
                this.f53483 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C6928.m18732(this.f53485, this.f53486, this.f53484, this.f53483);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18732(C6928 c6928, InterfaceC20834 interfaceC20834, int i, int i2) {
        c6928.f21385 = (AbstractC14346) interfaceC20834;
        c6928.f21389 = i;
        c6928.f21388 = i2;
        if (c6928.m8931()) {
            c6928.m18733(i, i2, interfaceC20834);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18733(int i, int i2, InterfaceC20834 interfaceC20834) {
        int i3;
        int i4;
        int i5;
        int i6;
        this.f21384 = null;
        for (C23655 c23655 : this.f21387) {
            int i7 = c23655.f76631;
            if (i >= i7 && i <= (i6 = c23655.f76630)) {
                if (i2 < i7 || i2 > i6) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f21384 = c23655;
                    interfaceC20834.mo17422(c23655.f76631, c23655.f76630, C9045.m23341(new StringBuilder(), c23655.f76634, "()"));
                    return;
                }
            }
        }
        for (C14482 c14482 : this.f21383) {
            int i8 = c14482.f44372;
            if (i >= i8 && i <= (i5 = c14482.f44368)) {
                if (i2 < i8 || i2 > i5) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f21384 = c14482;
                    interfaceC20834.mo17422(-1, -1, c14482.f44373);
                    return;
                }
            }
        }
        int i9 = Integer.MAX_VALUE;
        C8839 c8839 = null;
        for (C8839 c88310 : this.f21390) {
            int i10 = c88310.f26918;
            if (i >= i10 && i <= (i3 = c88310.f26916) && i2 >= i10 && i2 <= i3 && (i4 = i3 - i10) < i9) {
                c8839 = c88310;
                i9 = i4;
            }
        }
        if (c8839 == null) {
            interfaceC20834.mo17422(0, 0, null);
        } else {
            this.f21384 = c8839;
            interfaceC20834.mo17422(-1, -1, c8839.f26917);
        }
    }
}
