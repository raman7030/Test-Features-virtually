package l;

/* JADX INFO: renamed from: l.֨᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1316 extends AbstractC15594 {
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        int i;
        C8372 c8372;
        if (c19662.mo44151() < 4) {
            C16300 line = c19662.getLine();
            int iMo44153 = c19662.mo44153();
            if (line.m38335().charAt(iMo44153) == '#') {
                C16300 c16300M38336 = line.m38336(iMo44153, line.m38335().length());
                C17712 c17712 = new C17712();
                c17712.m41445(c16300M38336);
                C9246 c9246M23714 = C9246.m23714(c17712);
                int iM23722 = c9246M23714.m23722('#');
                if (iM23722 == 0 || iM23722 > 6) {
                    c8372 = null;
                } else if (c9246M23714.m23720()) {
                    char cM23725 = c9246M23714.m23725();
                    if (cM23725 == ' ' || cM23725 == '\t') {
                        c9246M23714.m23729();
                        C20535 c20535M23724 = c9246M23714.m23724();
                        C20535 c20535M23725 = c20535M23724;
                        loop0: while (true) {
                            boolean z = true;
                            while (true) {
                                if (!c9246M23714.m23720()) {
                                    break loop0;
                                }
                                char cM23726 = c9246M23714.m23725();
                                if (cM23726 == '\t' || cM23726 == ' ') {
                                    c9246M23714.m23723();
                                } else {
                                    if (cM23726 != '#') {
                                        c9246M23714.m23723();
                                        c20535M23725 = c9246M23714.m23724();
                                    } else if (z) {
                                        c9246M23714.m23722('#');
                                        int iM23729 = c9246M23714.m23729();
                                        if (c9246M23714.m23720()) {
                                            c20535M23725 = c9246M23714.m23724();
                                        }
                                        if (iM23729 > 0) {
                                        }
                                    } else {
                                        c9246M23714.m23723();
                                        c20535M23725 = c9246M23714.m23724();
                                    }
                                    z = false;
                                }
                            }
                        }
                        C17712 c17712M23718 = c9246M23714.m23718(c20535M23724, c20535M23725);
                        c8372 = c17712M23718.m41444().isEmpty() ? new C8372(iM23722, new C17712()) : new C8372(iM23722, c17712M23718);
                    } else {
                        c8372 = null;
                    }
                } else {
                    c8372 = new C8372(iM23722, new C17712());
                }
                if (c8372 != null) {
                    C21073 c21073 = new C21073(c8372);
                    c21073.m47974(line.m38335().length());
                    return c21073;
                }
            }
            CharSequence charSequenceM38335 = line.m38335();
            char cCharAt = charSequenceM38335.charAt(iMo44153);
            if (cCharAt == '-') {
                int length = charSequenceM38335.length();
                for (int i2 = iMo44153 + 1; i2 < length; i2++) {
                    if (charSequenceM38335.charAt(i2) != '-') {
                        length = i2;
                        break;
                    }
                }
                if (C8751.m22636(length, charSequenceM38335.length(), charSequenceM38335) >= charSequenceM38335.length()) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (cCharAt != '=') {
                i = 0;
            } else {
                int length2 = charSequenceM38335.length();
                for (int i3 = iMo44153 + 1; i3 < length2; i3++) {
                    if (charSequenceM38335.charAt(i3) != '=') {
                        length2 = i3;
                        break;
                    }
                }
                if (C8751.m22636(length2, charSequenceM38335.length(), charSequenceM38335) >= charSequenceM38335.length()) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                C17712 c17712Mo12421 = ((C4139) interfaceC18418).mo12421();
                if (!c17712Mo12421.m41448()) {
                    C21073 c21074 = new C21073(new C8372(i, c17712Mo12421));
                    c21074.m47974(line.m38335().length());
                    c21074.m47976(c17712Mo12421.m41446().size());
                    return c21074;
                }
            }
        }
        return null;
    }
}
