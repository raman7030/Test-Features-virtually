package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۙᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5A5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6941 extends AbstractC5149 {

    /* JADX INFO: renamed from: ֫֫ */
    public List f18053;

    /* JADX INFO: renamed from: ۟ */
    public Object f18054;

    /* JADX INFO: renamed from: ۧ֫ */
    public AbstractC16003 f18055;

    /* JADX INFO: renamed from: ܳ֫ */
    public List f18056;

    /* JADX INFO: renamed from: ܽ֫ */
    public List f18057;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f18058;

    /* JADX INFO: renamed from: ᩳ֫ */
    public int f18059;

    /* JADX INFO: renamed from: ᩻֫ */
    public List f18060;

    public C6941() {
        List list = Collections.EMPTY_LIST;
        this.f18060 = list;
        this.f18057 = list;
        this.f18053 = list;
        this.f18056 = list;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15902(String str) {
        C13929 c13929Matcher = C7612.f19920.matcher((CharSequence) str);
        return C7612.m17564(c13929Matcher, 0) ? c13929Matcher.m31662("modifiers") : "";
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m15905(CharSequence charSequence) {
        C13929 c13929Matcher = C7612.f19915.matcher(charSequence);
        try {
            return C7612.m17564(c13929Matcher, 0) ? c13929Matcher.m31662("modifiers") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15901(CharSequence charSequence, C24850 c24850) {
        C13929 c13929Matcher = C7612.f19920.matcher(charSequence);
        try {
            String str = c24850.f79380;
            String str2 = c24850.f79375;
            String str3 = c24850.f79379;
            for (int iEnd = 0; C7612.m17564(c13929Matcher, iEnd); iEnd = c13929Matcher.end()) {
                if (str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("parameters")) && str3.equals(c13929Matcher.m31662("type"))) {
                    return c13929Matcher.m31662("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15900(CharSequence charSequence, C16132 c16132) {
        C13929 c13929Matcher = C7612.f19917.matcher(charSequence);
        try {
            String str = c16132.f47474;
            String str2 = c16132.f47471;
            for (int iEnd = 0; C7612.m17564(c13929Matcher, iEnd); iEnd = c13929Matcher.end()) {
                if (str.equals(c13929Matcher.m31662("name")) && str2.equals(c13929Matcher.m31662("type"))) {
                    return c13929Matcher.m31662("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10031(C14121 c14121, CharSequence charSequence) {
        m10997(charSequence, new InterfaceC21243() { // from class: l.۠ᩳۢ
            @Override // p067l.InterfaceC21243
            /* JADX INFO: renamed from: ֫ */
            public final Runnable mo13525(CharSequence charSequence2, InterfaceC18588 interfaceC18588) {
                int i;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                try {
                    C13929 c13929Matcher = C7612.f19915.matcher(charSequence2);
                    if (C7612.m17564(c13929Matcher, 0)) {
                        C10769 c10769 = new C10769();
                        String strM31662 = c13929Matcher.m31662("type");
                        int iLastIndexOf = strM31662.lastIndexOf(47);
                        int i2 = iLastIndexOf + 1;
                        if (i2 == 0) {
                            i2 = iLastIndexOf + 2;
                        }
                        c10769.f29843 = strM31662;
                        c10769.f29841 = strM31662.substring(i2, strM31662.length() - 1);
                        c10769.f29842 = c13929Matcher.m31671("directive");
                        c10769.f29840 = c13929Matcher.end();
                        arrayList.add(c10769);
                    }
                } catch (Throwable unused) {
                }
                C13929 c13929Matcher2 = C7612.f19920.matcher(charSequence2);
                C13929 c13929Matcher3 = C7612.f19918.matcher(charSequence2);
                int iStart = -1;
                for (int iEnd = 0; C7612.m17564(c13929Matcher2, iEnd); iEnd = c13929Matcher2.end()) {
                    try {
                        if (!interfaceC18588.mo3924()) {
                            if (iStart < c13929Matcher2.end() && !C7612.m17564(c13929Matcher3, c13929Matcher2.end())) {
                                break;
                            }
                            iStart = c13929Matcher3.start();
                            C24850 c24850 = new C24850();
                            c24850.f79377 = c13929Matcher2.m31671("directive");
                            c24850.f79376 = c13929Matcher3.end();
                            String strM31663 = c13929Matcher2.m31662("modifiers");
                            c24850.f79381 = (strM31663.contains("private") || strM31663.contains("static") || strM31663.contains("constructor")) ? false : true;
                            c24850.f79380 = c13929Matcher2.m31662("name");
                            c24850.f79375 = c13929Matcher2.m31662("parameters");
                            c24850.f79379 = c13929Matcher2.m31662("type");
                            if (!arrayList.isEmpty()) {
                                c24850.f79378 = ((C10769) arrayList.get(0)).f29843;
                            }
                            arrayList2.add(c24850);
                        }
                    } catch (Exception unused2) {
                    }
                    return null;
                }
                C13929 c13929Matcher4 = C7612.f19917.matcher(charSequence2);
                C13929 c13929Matcher5 = C7612.f19919.matcher(charSequence2);
                for (int iEnd2 = 0; C7612.m17564(c13929Matcher4, iEnd2); iEnd2 = c13929Matcher4.end()) {
                    try {
                        if (interfaceC18588.mo3924()) {
                            return null;
                        }
                        C16132 c16132 = new C16132();
                        c16132.f47473 = c13929Matcher4.m31671("directive");
                        c16132.f47469 = c13929Matcher4.end();
                        c16132.f47474 = c13929Matcher4.m31662("name");
                        c16132.f47471 = c13929Matcher4.m31662("type");
                        c16132.f47475 = c13929Matcher4.m31662(C0226b.f1011d);
                        if (!arrayList.isEmpty()) {
                            c16132.f47470 = ((C10769) arrayList.get(0)).f29843;
                        }
                        c16132.f47472 = c13929Matcher4.m31662("modifiers").contains("static");
                        arrayList3.add(c16132);
                    } catch (Exception unused3) {
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C16132 c16133 = (C16132) C20013.m45383(arrayList3, 1);
                    C17441 c17441 = new C17441();
                    for (int iEnd3 = 0; C7612.m17564(c13929Matcher5, iEnd3); iEnd3 = c13929Matcher5.end()) {
                        try {
                            c17441.add(c13929Matcher5.end());
                            if (c13929Matcher5.end() > c16133.f47469) {
                                break;
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (c17441.isEmpty() || size < 0) {
                            break;
                        }
                        C16132 c16134 = (C16132) arrayList3.get(size);
                        int i3 = c16134.f47469;
                        while (!c17441.isEmpty()) {
                            if (c17441.isEmpty()) {
                                throw new NoSuchElementException();
                            }
                            if (i3 >= c17441.getInt(c17441.size() - 1)) {
                                break;
                            }
                            c16134.f47469 = c17441.m28313();
                        }
                    }
                }
                C13929 c13929Matcher6 = C7612.f19916.matcher(charSequence2);
                int iEnd4 = 0;
                while (C7612.m17564(c13929Matcher6, iEnd4)) {
                    try {
                        if (interfaceC18588.mo3924()) {
                            return null;
                        }
                        iEnd4 = c13929Matcher6.end();
                        int length = charSequence2.length();
                        int i4 = iEnd4;
                        while (true) {
                            if (i4 < length) {
                                char cCharAt = charSequence2.charAt(i4);
                                if (cCharAt == '\r' || cCharAt == '\n') {
                                    break;
                                }
                                if (cCharAt == '\"') {
                                    i = -1;
                                    break;
                                }
                                if (cCharAt == '\\') {
                                    i4++;
                                }
                                i4++;
                            }
                            i = -1;
                            i4 = -1;
                            break;
                        }
                        if (i4 != i) {
                            int i5 = i4 + 1;
                            C11440 c11440 = new C11440();
                            c11440.f31894 = iEnd4;
                            c11440.f31892 = i4;
                            String string = charSequence2.subSequence(iEnd4, i4).toString();
                            c11440.f31893 = string;
                            try {
                                c11440.f31895 = C11905.f33152.m30298(string);
                            } catch (RuntimeException unused5) {
                                c11440.f31895 = c11440.f31893;
                            }
                            arrayList4.add(c11440);
                            iEnd4 = i5;
                        }
                    } catch (Exception unused6) {
                    }
                }
                final C6941 c6941 = this.f28475;
                return new Runnable() { // from class: l.ܶᩳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6941.m15903(c6941, arrayList, arrayList2, arrayList3, arrayList4);
                    }
                };
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15903(C6941 c6941, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c6941.f18060 = C21562.unmodifiableList(arrayList);
        c6941.f18057 = C21562.unmodifiableList(arrayList2);
        c6941.f18053 = C21562.unmodifiableList(arrayList3);
        c6941.f18056 = C21562.unmodifiableList(arrayList4);
        ?? r1 = c6941.f18055;
        if (r1 != 0) {
            c6941.m15906(c6941.f18059, c6941.f18058, r1);
        }
        InterfaceC8757 interfaceC8757 = c6941.f10724;
        if (interfaceC8757 != null) {
            interfaceC8757.mo20240(c6941.f18060, c6941.f18057, c6941.f18053, c6941.f18056);
        }
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final Object mo10027() {
        if (m10999()) {
            return this.f18054;
        }
        return null;
    }

    @Override // p067l.AbstractC4734
    /* JADX INFO: renamed from: ֫ */
    public final void mo10028(final int i, final int i2, final InterfaceC22169 interfaceC22169) {
        m10998(new Runnable(interfaceC22169, i, i2) { // from class: l.֨ᩳۢ

            /* JADX INFO: renamed from: ۙ */
            public final /* synthetic */ int f7284;

            /* JADX INFO: renamed from: ᩶ */
            public final /* synthetic */ int f7285;

            /* JADX INFO: renamed from: ᩹ */
            public final /* synthetic */ AbstractC16003 f7287;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f7287 = (AbstractC16003) interfaceC22169;
                this.f7285 = i;
                this.f7284 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C6941.m15904(this.f7286, this.f7287, this.f7285, this.f7284);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15904(C6941 c6941, InterfaceC22169 interfaceC22169, int i, int i2) {
        c6941.f18055 = (AbstractC16003) interfaceC22169;
        c6941.f18059 = i;
        c6941.f18058 = i2;
        if (c6941.m10999()) {
            c6941.m15906(i, i2, interfaceC22169);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15906(int i, int i2, InterfaceC22169 interfaceC22169) {
        int i3;
        int i4;
        int i5;
        this.f18054 = null;
        for (C10769 c10769 : this.f18060) {
            int i6 = c10769.f29842;
            if (i >= i6 && i <= (i5 = c10769.f29840)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f18054 = c10769;
                    interfaceC22169.mo19362(-1, -1, c10769.f29841);
                    return;
                }
            }
        }
        for (C16132 c16132 : this.f18053) {
            int i7 = c16132.f47473;
            if (i >= i7 && i <= (i4 = c16132.f47469)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f18054 = c16132;
                    interfaceC22169.mo19362(-1, -1, c16132.f47474);
                    return;
                }
            }
        }
        for (C24850 c24850 : this.f18057) {
            int i8 = c24850.f79377;
            if (i >= i8 && i <= (i3 = c24850.f79376)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC22169.mo19362(0, 0, null);
                    return;
                } else {
                    this.f18054 = c24850;
                    interfaceC22169.mo19362(c24850.f79377, c24850.f79376, C10965.m25286(new StringBuilder(), c24850.f79380, "()"));
                    return;
                }
            }
        }
        interfaceC22169.mo19362(0, 0, null);
    }
}
