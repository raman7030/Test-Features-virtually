package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6923 implements InterfaceC15847, InterfaceC18530 {

    /* JADX INFO: renamed from: ֫ */
    public C6972 f18021;

    /* JADX INFO: renamed from: ۧ */
    public int f18022;

    @Override // p067l.InterfaceC15847
    public final InterfaceC18530 create() {
        return this;
    }

    public C6923(int i) {
        this.f18022 = i * 8;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15858(C6972 c6972) {
        this.f18021 = c6972;
    }

    @Override // p067l.InterfaceC15847
    /* JADX INFO: renamed from: ֫ */
    public final Set mo5226() {
        Object[] objArr = {'$', '\\'};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C12826.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        return C21562.unmodifiableSet(hashSet);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0189  */
    /* JADX WARN: Code duplicated, block: B:124:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:184:0x027d  */
    /* JADX WARN: Code duplicated, block: B:189:0x029b  */
    /* JADX WARN: Code duplicated, block: B:192:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:210:0x0045 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0045 A[SYNTHETIC] */
    @Override // p067l.InterfaceC18530
    /* JADX INFO: renamed from: ֫ */
    public final C6441 mo12931(C24406 c24406) {
        boolean zM25727;
        String str;
        String str2;
        char cM25726;
        String str3;
        boolean z;
        char cCharAt;
        C21884 c21884M25725;
        C19201 c19201M25719;
        boolean z2;
        C11155 c11155M53830 = c24406.m53830();
        int iM25728 = c11155M53830.m25728();
        boolean zM25728 = c11155M53830.m25727('$');
        if (zM25728) {
            zM25727 = c11155M53830.m25727('$');
            str = zM25727 ? "$$" : "$";
            if (!zM25727 && (Character.isWhitespace(c11155M53830.m25726()) || Character.isDigit(iM25728) || iM25728 == 36)) {
                return null;
            }
            str2 = str;
        } else {
            c11155M53830.m25724();
            char cM25727 = c11155M53830.m25726();
            if (cM25727 != '(' && cM25727 != '[') {
                return null;
            }
            zM25727 = cM25727 == '[';
            str = zM25727 ? "\\[" : "\\(";
            str2 = zM25727 ? "\\]" : "\\)";
            c11155M53830.m25724();
        }
        C21884 c21884M25726 = c11155M53830.m25725();
        int length = 0;
        boolean z3 = false;
        char c = 0;
        while (length <= 4096 && this.f18022 > 0 && (cM25726 = c11155M53830.m25726()) != 0 && cM25726 != '\n') {
            if (cM25726 == '`' && !z3) {
                return null;
            }
            if (z3 || cM25726 != '<') {
                str3 = str;
            } else {
                C11155 c11155M53831 = c24406.m53830();
                C21884 c21884M25727 = c11155M53831.m25725();
                try {
                    boolean z4 = new C22535().mo12931(c24406) != null;
                    m15857(c21884M25727, c11155M53831);
                    if (z4) {
                        return null;
                    }
                    if (this.f18022 <= 0) {
                        str3 = str;
                    } else {
                        C11155 c11155M53832 = c24406.m53830();
                        C21884 c21884M25728 = c11155M53832.m25725();
                        try {
                            c11155M53832.m25724();
                            while (true) {
                                str3 = str;
                                if (c11155M53832.m25726() <= ' ' || c11155M53832.m25726() == '<' || c11155M53832.m25726() == '>') {
                                    break;
                                }
                                c11155M53832.m25724();
                                str = str3;
                            }
                            if (c11155M53832.m25726() == '>') {
                                m15857(c21884M25728, c11155M53832);
                                if (this.f18022 > 0) {
                                    z2 = new C17168().mo12931(c24406) != null;
                                    m15857(c21884M25728, c11155M53832);
                                }
                                if (z2) {
                                    return null;
                                }
                            }
                            m15857(c21884M25728, c11155M53832);
                        } catch (Throwable th) {
                            m15857(c21884M25728, c11155M53832);
                            throw th;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    m15857(c21884M25727, c11155M53831);
                    throw th2;
                }
            }
            if (z3 || cM25726 != ']') {
                C21884 c21884M25729 = c11155M53830.m25725();
                if (z3 && c11155M53830.m25722(str2)) {
                    if (length > 0 && (!zM25728 || zM25727 || (!Character.isWhitespace(c) && !Character.isDigit(c11155M53830.m25726()) && c11155M53830.m25726() != '$'))) {
                        String strM43690 = c11155M53830.m25719(c21884M25726, c21884M25729).m43690();
                        if (zM25728 && !zM25727) {
                            boolean z5 = false;
                            if (Character.isDigit(strM43690.charAt(0))) {
                                int i = 0;
                                while (i < strM43690.length() && (Character.isDigit(strM43690.charAt(i)) || strM43690.charAt(i) == '.' || strM43690.charAt(i) == ',')) {
                                    i++;
                                }
                                if (i != strM43690.length()) {
                                    char cCharAt2 = strM43690.charAt(i);
                                    if (cCharAt2 == ';' || cCharAt2 == ':' || cCharAt2 == '!' || cCharAt2 == '?') {
                                        z5 = true;
                                    } else if (Character.isWhitespace(cCharAt2)) {
                                        while (i < strM43690.length() && Character.isWhitespace(strM43690.charAt(i))) {
                                            i++;
                                        }
                                        if (i == strM43690.length() || "+-=*/^_\\<>$".indexOf(strM43690.charAt(i)) < 0) {
                                            z5 = true;
                                        }
                                    }
                                }
                            }
                            if (z5) {
                                return null;
                            }
                        }
                        return new C6441(new C21676(strM43690, C24104.m53357(str3, strM43690, str2), zM25727), c11155M53830.m25725());
                    }
                    c11155M53830.m25720(c21884M25729);
                }
                if (cM25726 == '\\' || z3) {
                    z = false;
                } else {
                    z = true;
                }
                c11155M53830.m25724();
                z3 = z;
                cCharAt = cM25726;
            } else {
                C21884 c21884M257210 = c11155M53830.m25725();
                try {
                    c11155M53830.m25724();
                    if (c11155M53830.m25727('[')) {
                        C21884 c21884M257211 = c11155M53830.m25725();
                        if (C9731.m22758(c11155M53830)) {
                            C21884 c21884M257212 = c11155M53830.m25725();
                            if (c11155M53830.m25727(']')) {
                                String strM43691 = c11155M53830.m25719(c21884M257211, c21884M257212).m43690();
                                if (strM43691.isEmpty() || strM43691.length() > 999 || this.f18021.m15969(strM43691) == null) {
                                    c21884M25725 = null;
                                } else {
                                    c21884M25725 = c11155M53830.m25725();
                                }
                                m15857(c21884M257210, c11155M53830);
                                if (c21884M25725 != null) {
                                    c19201M25719 = c11155M53830.m25719(c11155M53830.m25725(), c21884M25725);
                                    if (c19201M25719.m43692().size() != 1) {
                                        return null;
                                    }
                                    CharSequence charSequenceM40550 = ((C17859) c19201M25719.m43692().get(0)).m40550();
                                    length += charSequenceM40550.length() - 1;
                                    c11155M53830.m25720(c21884M25725);
                                    cCharAt = charSequenceM40550.charAt(charSequenceM40550.length() - 1);
                                    str3 = str3;
                                } else {
                                    C21884 c21884M257213 = c11155M53830.m25725();
                                    if (z3) {
                                    }
                                    if (cM25726 == '\\') {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    c11155M53830.m25724();
                                    z3 = z;
                                    cCharAt = cM25726;
                                }
                            }
                        }
                        m15857(c21884M257210, c11155M53830);
                        c21884M25725 = null;
                        if (c21884M25725 != null) {
                            c19201M25719 = c11155M53830.m25719(c11155M53830.m25725(), c21884M25725);
                            if (c19201M25719.m43692().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM40551 = ((C17859) c19201M25719.m43692().get(0)).m40550();
                            length += charSequenceM40551.length() - 1;
                            c11155M53830.m25720(c21884M25725);
                            cCharAt = charSequenceM40551.charAt(charSequenceM40551.length() - 1);
                            str3 = str3;
                        } else {
                            C21884 c21884M257214 = c11155M53830.m25725();
                            if (z3) {
                            }
                            if (cM25726 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c11155M53830.m25724();
                            z3 = z;
                            cCharAt = cM25726;
                        }
                    } else {
                        if (c11155M53830.m25727('(')) {
                            c11155M53830.m25730();
                            if (C9731.m22756(c11155M53830)) {
                                if (c11155M53830.m25730() > 0 && C9731.m22759(c11155M53830)) {
                                    c11155M53830.m25730();
                                }
                                if (c11155M53830.m25727(')')) {
                                    c21884M25725 = c11155M53830.m25725();
                                } else {
                                    c21884M25725 = null;
                                }
                                m15857(c21884M257210, c11155M53830);
                            }
                            if (c21884M25725 != null) {
                                c19201M25719 = c11155M53830.m25719(c11155M53830.m25725(), c21884M25725);
                                if (c19201M25719.m43692().size() != 1) {
                                    return null;
                                }
                                CharSequence charSequenceM40552 = ((C17859) c19201M25719.m43692().get(0)).m40550();
                                length += charSequenceM40552.length() - 1;
                                c11155M53830.m25720(c21884M25725);
                                cCharAt = charSequenceM40552.charAt(charSequenceM40552.length() - 1);
                                str3 = str3;
                            } else {
                                C21884 c21884M257215 = c11155M53830.m25725();
                                if (z3) {
                                }
                                if (cM25726 == '\\') {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                c11155M53830.m25724();
                                z3 = z;
                                cCharAt = cM25726;
                            }
                        }
                        m15857(c21884M257210, c11155M53830);
                        c21884M25725 = null;
                        if (c21884M25725 != null) {
                            c19201M25719 = c11155M53830.m25719(c11155M53830.m25725(), c21884M25725);
                            if (c19201M25719.m43692().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM40553 = ((C17859) c19201M25719.m43692().get(0)).m40550();
                            length += charSequenceM40553.length() - 1;
                            c11155M53830.m25720(c21884M25725);
                            cCharAt = charSequenceM40553.charAt(charSequenceM40553.length() - 1);
                            str3 = str3;
                        } else {
                            C21884 c21884M257216 = c11155M53830.m25725();
                            if (z3) {
                            }
                            if (cM25726 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c11155M53830.m25724();
                            z3 = z;
                            cCharAt = cM25726;
                        }
                    }
                } catch (Throwable th3) {
                    m15857(c21884M257210, c11155M53830);
                    throw th3;
                }
            }
            length++;
            this.f18022--;
            String str4 = str3;
            c = cCharAt;
            str = str4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m15857(C21884 c21884, C11155 c11155) {
        Iterator it = c11155.m25719(c21884, c11155.m25725()).m43692().iterator();
        while (it.hasNext()) {
            this.f18022 -= ((C17859) it.next()).m40550().length() + 1;
        }
        c11155.m25720(c21884);
    }
}
