package p067l;

/* JADX INFO: renamed from: l.֨᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Z90G */
/* JADX INFO: loaded from: classes3.dex */
public final class C3619 extends AbstractC17188 {
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0135  */
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        int i;
        C10325 c10325;
        if (c21055.mo46445() < 4) {
            C17859 line = c21055.getLine();
            int iMo46447 = c21055.mo46447();
            if (line.m40550().charAt(iMo46447) == '#') {
                C17859 c17859M40551 = line.m40551(iMo46447, line.m40550().length());
                C19201 c19201 = new C19201();
                c19201.m43691(c17859M40551);
                C11155 c11155M25715 = C11155.m25715(c19201);
                int iM25723 = c11155M25715.m25723('#');
                if (iM25723 == 0 || iM25723 > 6) {
                    c10325 = null;
                } else if (c11155M25715.m25721()) {
                    char cM25726 = c11155M25715.m25726();
                    if (cM25726 == ' ' || cM25726 == '\t') {
                        c11155M25715.m25730();
                        C21884 c21884M25725 = c11155M25715.m25725();
                        C21884 c21884M25726 = c21884M25725;
                        loop0: while (true) {
                            boolean z = true;
                            while (true) {
                                if (!c11155M25715.m25721()) {
                                    break loop0;
                                }
                                char cM25727 = c11155M25715.m25726();
                                if (cM25727 == '\t' || cM25727 == ' ') {
                                    c11155M25715.m25724();
                                } else {
                                    if (cM25727 != '#') {
                                        c11155M25715.m25724();
                                        c21884M25726 = c11155M25715.m25725();
                                    } else if (z) {
                                        c11155M25715.m25723('#');
                                        int iM25730 = c11155M25715.m25730();
                                        if (c11155M25715.m25721()) {
                                            c21884M25726 = c11155M25715.m25725();
                                        }
                                        if (iM25730 > 0) {
                                        }
                                    } else {
                                        c11155M25715.m25724();
                                        c21884M25726 = c11155M25715.m25725();
                                    }
                                    z = false;
                                }
                            }
                        }
                        C19201 c19201M25719 = c11155M25715.m25719(c21884M25725, c21884M25726);
                        c10325 = c19201M25719.m43690().isEmpty() ? new C10325(iM25723, new C19201()) : new C10325(iM25723, c19201M25719);
                    } else {
                        c10325 = null;
                    }
                } else {
                    c10325 = new C10325(iM25723, new C19201());
                }
                if (c10325 != null) {
                    C22396 c22396 = new C22396(c10325);
                    c22396.m50304(line.m40550().length());
                    return c22396;
                }
            }
            CharSequence charSequenceM40550 = line.m40550();
            char cCharAt = charSequenceM40550.charAt(iMo46447);
            if (cCharAt == '-') {
                int length = charSequenceM40550.length();
                for (int i2 = iMo46447 + 1; i2 < length; i2++) {
                    if (charSequenceM40550.charAt(i2) != '-') {
                        length = i2;
                        break;
                    }
                }
                if (C10685.m24606(length, charSequenceM40550.length(), charSequenceM40550) >= charSequenceM40550.length()) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (cCharAt != '=') {
                i = 0;
            } else {
                int length2 = charSequenceM40550.length();
                for (int i3 = iMo46447 + 1; i3 < length2; i3++) {
                    if (charSequenceM40550.charAt(i3) != '=') {
                        length2 = i3;
                        break;
                    }
                }
                if (C10685.m24606(length2, charSequenceM40550.length(), charSequenceM40550) >= charSequenceM40550.length()) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                C19201 c19201Mo14311 = ((C6302) interfaceC19872).mo14311();
                if (!c19201Mo14311.m43694()) {
                    C22396 c22397 = new C22396(new C10325(i, c19201Mo14311));
                    c22397.m50304(line.m40550().length());
                    c22397.m50306(c19201Mo14311.m43692().size());
                    return c22397;
                }
            }
        }
        return null;
    }
}
