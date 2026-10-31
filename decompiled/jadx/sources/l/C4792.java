package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes3.dex */
public final class C4792 implements InterfaceC14183, InterfaceC17006 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4844 f15189;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15190;

    @Override // l.InterfaceC14183
    public final InterfaceC17006 create() {
        return this;
    }

    public C4792(int i) {
        this.f15190 = i * 8;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13978(C4844 c4844) {
        this.f15189 = c4844;
    }

    @Override // l.InterfaceC14183
    /* JADX INFO: renamed from: ֫ */
    public final Set mo2897() {
        Object[] objArr = {'$', '\\'};
        HashSet hashSet = new HashSet(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        return C20195.unmodifiableSet(hashSet);
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
    @Override // l.InterfaceC17006
    /* JADX INFO: renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        boolean zM23726;
        String str;
        String str2;
        char cM23725;
        String str3;
        boolean z;
        char cCharAt;
        C20535 c20535M23724;
        C17712 c17712M23718;
        boolean z2;
        C9246 c9246M51434 = c23188.m51434();
        int iM23727 = c9246M51434.m23727();
        boolean zM23727 = c9246M51434.m23726('$');
        if (zM23727) {
            zM23726 = c9246M51434.m23726('$');
            str = zM23726 ? "$$" : "$";
            if (!zM23726 && (Character.isWhitespace(c9246M51434.m23725()) || Character.isDigit(iM23727) || iM23727 == 36)) {
                return null;
            }
            str2 = str;
        } else {
            c9246M51434.m23723();
            char cM23726 = c9246M51434.m23725();
            if (cM23726 != '(' && cM23726 != '[') {
                return null;
            }
            zM23726 = cM23726 == '[';
            str = zM23726 ? "\\[" : "\\(";
            str2 = zM23726 ? "\\]" : "\\)";
            c9246M51434.m23723();
        }
        C20535 c20535M23725 = c9246M51434.m23724();
        int length = 0;
        boolean z3 = false;
        char c = 0;
        while (length <= 4096 && this.f15190 > 0 && (cM23725 = c9246M51434.m23725()) != 0 && cM23725 != '\n') {
            if (cM23725 == '`' && !z3) {
                return null;
            }
            if (z3 || cM23725 != '<') {
                str3 = str;
            } else {
                C9246 c9246M51435 = c23188.m51434();
                C20535 c20535M23726 = c9246M51435.m23724();
                try {
                    boolean z4 = new C21220().mo10955(c23188) != null;
                    m13977(c20535M23726, c9246M51435);
                    if (z4) {
                        return null;
                    }
                    if (this.f15190 <= 0) {
                        str3 = str;
                    } else {
                        C9246 c9246M51436 = c23188.m51434();
                        C20535 c20535M23727 = c9246M51436.m23724();
                        try {
                            c9246M51436.m23723();
                            while (true) {
                                str3 = str;
                                if (c9246M51436.m23725() <= ' ' || c9246M51436.m23725() == '<' || c9246M51436.m23725() == '>') {
                                    break;
                                }
                                c9246M51436.m23723();
                                str = str3;
                            }
                            if (c9246M51436.m23725() == '>') {
                                m13977(c20535M23727, c9246M51436);
                                if (this.f15190 > 0) {
                                    z2 = new C15573().mo10955(c23188) != null;
                                    m13977(c20535M23727, c9246M51436);
                                }
                                if (z2) {
                                    return null;
                                }
                            }
                            m13977(c20535M23727, c9246M51436);
                        } catch (Throwable th) {
                            m13977(c20535M23727, c9246M51436);
                            throw th;
                        }
                    }
                    z2 = false;
                    if (z2) {
                        return null;
                    }
                } catch (Throwable th2) {
                    m13977(c20535M23726, c9246M51435);
                    throw th2;
                }
            }
            if (z3 || cM23725 != ']') {
                C20535 c20535M23728 = c9246M51434.m23724();
                if (z3 && c9246M51434.m23721(str2)) {
                    if (length > 0 && (!zM23727 || zM23726 || (!Character.isWhitespace(c) && !Character.isDigit(c9246M51434.m23725()) && c9246M51434.m23725() != '$'))) {
                        String strM41444 = c9246M51434.m23718(c20535M23725, c20535M23728).m41444();
                        if (zM23727 && !zM23726) {
                            boolean z5 = false;
                            if (Character.isDigit(strM41444.charAt(0))) {
                                int i = 0;
                                while (i < strM41444.length() && (Character.isDigit(strM41444.charAt(i)) || strM41444.charAt(i) == '.' || strM41444.charAt(i) == ',')) {
                                    i++;
                                }
                                if (i != strM41444.length()) {
                                    char cCharAt2 = strM41444.charAt(i);
                                    if (cCharAt2 == ';' || cCharAt2 == ':' || cCharAt2 == '!' || cCharAt2 == '?') {
                                        z5 = true;
                                    } else if (Character.isWhitespace(cCharAt2)) {
                                        while (i < strM41444.length() && Character.isWhitespace(strM41444.charAt(i))) {
                                            i++;
                                        }
                                        if (i == strM41444.length() || "+-=*/^_\\<>$".indexOf(strM41444.charAt(i)) < 0) {
                                            z5 = true;
                                        }
                                    }
                                }
                            }
                            if (z5) {
                                return null;
                            }
                        }
                        return new C4286(new C20315(strM41444, C22870.m50967(str3, strM41444, str2), zM23726), c9246M51434.m23724());
                    }
                    c9246M51434.m23719(c20535M23728);
                }
                if (cM23725 == '\\' || z3) {
                    z = false;
                } else {
                    z = true;
                }
                c9246M51434.m23723();
                z3 = z;
                cCharAt = cM23725;
            } else {
                C20535 c20535M23729 = c9246M51434.m23724();
                try {
                    c9246M51434.m23723();
                    if (c9246M51434.m23726('[')) {
                        C20535 c20535M237210 = c9246M51434.m23724();
                        if (C7746.m20777(c9246M51434)) {
                            C20535 c20535M237211 = c9246M51434.m23724();
                            if (c9246M51434.m23726(']')) {
                                String strM41445 = c9246M51434.m23718(c20535M237210, c20535M237211).m41444();
                                if (strM41445.isEmpty() || strM41445.length() > 999 || this.f15189.m14089(strM41445) == null) {
                                    c20535M23724 = null;
                                } else {
                                    c20535M23724 = c9246M51434.m23724();
                                }
                                m13977(c20535M23729, c9246M51434);
                                if (c20535M23724 != null) {
                                    c17712M23718 = c9246M51434.m23718(c9246M51434.m23724(), c20535M23724);
                                    if (c17712M23718.m41446().size() != 1) {
                                        return null;
                                    }
                                    CharSequence charSequenceM38335 = ((C16300) c17712M23718.m41446().get(0)).m38335();
                                    length += charSequenceM38335.length() - 1;
                                    c9246M51434.m23719(c20535M23724);
                                    cCharAt = charSequenceM38335.charAt(charSequenceM38335.length() - 1);
                                    str3 = str3;
                                } else {
                                    C20535 c20535M237212 = c9246M51434.m23724();
                                    if (z3) {
                                    }
                                    if (cM23725 == '\\') {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    c9246M51434.m23723();
                                    z3 = z;
                                    cCharAt = cM23725;
                                }
                            }
                        }
                        m13977(c20535M23729, c9246M51434);
                        c20535M23724 = null;
                        if (c20535M23724 != null) {
                            c17712M23718 = c9246M51434.m23718(c9246M51434.m23724(), c20535M23724);
                            if (c17712M23718.m41446().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM38336 = ((C16300) c17712M23718.m41446().get(0)).m38335();
                            length += charSequenceM38336.length() - 1;
                            c9246M51434.m23719(c20535M23724);
                            cCharAt = charSequenceM38336.charAt(charSequenceM38336.length() - 1);
                            str3 = str3;
                        } else {
                            C20535 c20535M237213 = c9246M51434.m23724();
                            if (z3) {
                            }
                            if (cM23725 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c9246M51434.m23723();
                            z3 = z;
                            cCharAt = cM23725;
                        }
                    } else {
                        if (c9246M51434.m23726('(')) {
                            c9246M51434.m23729();
                            if (C7746.m20775(c9246M51434)) {
                                if (c9246M51434.m23729() > 0 && C7746.m20778(c9246M51434)) {
                                    c9246M51434.m23729();
                                }
                                if (c9246M51434.m23726(')')) {
                                    c20535M23724 = c9246M51434.m23724();
                                } else {
                                    c20535M23724 = null;
                                }
                                m13977(c20535M23729, c9246M51434);
                            }
                            if (c20535M23724 != null) {
                                c17712M23718 = c9246M51434.m23718(c9246M51434.m23724(), c20535M23724);
                                if (c17712M23718.m41446().size() != 1) {
                                    return null;
                                }
                                CharSequence charSequenceM38337 = ((C16300) c17712M23718.m41446().get(0)).m38335();
                                length += charSequenceM38337.length() - 1;
                                c9246M51434.m23719(c20535M23724);
                                cCharAt = charSequenceM38337.charAt(charSequenceM38337.length() - 1);
                                str3 = str3;
                            } else {
                                C20535 c20535M237214 = c9246M51434.m23724();
                                if (z3) {
                                }
                                if (cM23725 == '\\') {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                c9246M51434.m23723();
                                z3 = z;
                                cCharAt = cM23725;
                            }
                        }
                        m13977(c20535M23729, c9246M51434);
                        c20535M23724 = null;
                        if (c20535M23724 != null) {
                            c17712M23718 = c9246M51434.m23718(c9246M51434.m23724(), c20535M23724);
                            if (c17712M23718.m41446().size() != 1) {
                                return null;
                            }
                            CharSequence charSequenceM38338 = ((C16300) c17712M23718.m41446().get(0)).m38335();
                            length += charSequenceM38338.length() - 1;
                            c9246M51434.m23719(c20535M23724);
                            cCharAt = charSequenceM38338.charAt(charSequenceM38338.length() - 1);
                            str3 = str3;
                        } else {
                            C20535 c20535M237215 = c9246M51434.m23724();
                            if (z3) {
                            }
                            if (cM23725 == '\\') {
                                z = false;
                            } else {
                                z = false;
                            }
                            c9246M51434.m23723();
                            z3 = z;
                            cCharAt = cM23725;
                        }
                    }
                } catch (Throwable th3) {
                    m13977(c20535M23729, c9246M51434);
                    throw th3;
                }
            }
            length++;
            this.f15190--;
            String str4 = str3;
            c = cCharAt;
            str = str4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13977(C20535 c20535, C9246 c9246) {
        Iterator it = c9246.m23718(c20535, c9246.m23724()).m41446().iterator();
        while (it.hasNext()) {
            this.f15190 -= ((C16300) it.next()).m38335().length() + 1;
        }
        c9246.m23719(c20535);
    }
}
