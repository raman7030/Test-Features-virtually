package l;

/* JADX INFO: renamed from: l.۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8112 extends AbstractC23747 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f25069;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25070;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f25071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m21579(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            return -1;
        }
        return i - 55;
    }

    public AbstractC8112(C20813 c20813) {
        super(c20813);
        this.f25069 = 1;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21580() {
        ((C4264) m43460()).m12836(this.f76890);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21578(String str) {
        throw new C0350(EnumC19402.SYNTAX, this.f76880, this.f76879, str);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21582() {
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (interfaceC23125.mo6203(1) == 91) {
            int i = 1;
            do {
                i++;
            } while (interfaceC23125.mo6203(i) == 61);
            if (interfaceC23125.mo6203(i) == 91) {
                for (int i2 = 0; i2 < i; i2++) {
                    m21580();
                }
                m21581(true);
                return;
            }
        }
        while (interfaceC23125.mo6203(1) != -1 && interfaceC23125.mo6203(1) != 10 && interfaceC23125.mo6203(1) != 13) {
            m21580();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21583(int i) {
        while (true) {
            InterfaceC23125 interfaceC23125 = this.f76890;
            int iMo6203 = interfaceC23125.mo6203(1);
            if (iMo6203 == -1) {
                break;
            }
            if (iMo6203 == 13 || iMo6203 == 10) {
                break;
            }
            m21580();
            if (iMo6203 == i) {
                return;
            }
            if (iMo6203 == 92) {
                int iMo6204 = interfaceC23125.mo6203(1);
                if (iMo6204 == -1) {
                    m21578("Unterminated string escape");
                    throw null;
                }
                m21580();
                if (iMo6204 == 122) {
                    while (true) {
                        int iMo6205 = interfaceC23125.mo6203(1);
                        if (iMo6205 == 32 || iMo6205 == 9 || iMo6205 == 13 || iMo6205 == 10 || iMo6205 == 12 || iMo6205 == 11) {
                            m21580();
                        }
                    }
                } else if (iMo6204 != 13 && iMo6204 != 10) {
                    int i2 = 0;
                    if (iMo6204 == 120) {
                        while (i2 < 2) {
                            if (m21579(interfaceC23125.mo6203(1)) < 0) {
                                m21578("Invalid hexadecimal escape");
                                throw null;
                            }
                            m21580();
                            i2++;
                        }
                    } else if (iMo6204 == 117) {
                        if (interfaceC23125.mo6203(1) != 123) {
                            m21578("Invalid Unicode escape");
                            throw null;
                        }
                        m21580();
                        long jM21579 = 0;
                        while (m21579(interfaceC23125.mo6203(1)) >= 0) {
                            jM21579 = (jM21579 * 16) + ((long) m21579(interfaceC23125.mo6203(1)));
                            if (jM21579 > 2147483647L) {
                                m21578("Unicode escape out of range");
                                throw null;
                            }
                            m21580();
                            i2++;
                        }
                        if (i2 == 0 || interfaceC23125.mo6203(1) != 125) {
                            m21578("Invalid Unicode escape");
                            throw null;
                        }
                        m21580();
                    } else if (iMo6204 >= 48 && iMo6204 <= 57) {
                        int iMo6206 = iMo6204 - 48;
                        for (int i3 = 1; i3 < 3 && interfaceC23125.mo6203(1) >= 48 && interfaceC23125.mo6203(1) <= 57; i3++) {
                            iMo6206 = (interfaceC23125.mo6203(1) + (iMo6206 * 10)) - 48;
                            m21580();
                        }
                        if (iMo6206 > 255) {
                            m21578("Decimal escape out of range");
                            throw null;
                        }
                    } else if ("abfnrtv\"'\\".indexOf(iMo6204) < 0) {
                        m21578("Invalid string escape");
                        throw null;
                    }
                } else if (interfaceC23125.mo6203(1) == (iMo6204 == 13 ? 10 : 13)) {
                    m21580();
                }
            }
        }
        m21578("Unterminated string");
        throw null;
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        InterfaceC23125 interfaceC23125 = this.f76890;
        InterfaceC0463 interfaceC0463NextToken = super.nextToken();
        for (int iIndex = interfaceC23125.index(); iIndex < interfaceC23125.index(); iIndex++) {
            int iMo6203 = interfaceC23125.mo6203(iIndex - interfaceC23125.index());
            if (iMo6203 == 13 || iMo6203 == 10) {
                int i = this.f25070;
                if (i == 0 || i == iMo6203) {
                    this.f25069++;
                    this.f25070 = iMo6203;
                } else {
                    this.f25070 = 0;
                }
                this.f25071 = 0;
            } else {
                this.f25071++;
                this.f25070 = 0;
            }
        }
        ((C4264) m43460()).m12840(this.f25069);
        ((C4264) m43460()).m12835(this.f25071);
        int type = interfaceC0463NextToken.getType();
        int iMo6204 = interfaceC23125.mo6203(1);
        if ((type != 60 && type != 61 && type != 62 && type != 63) || (iMo6204 != 46 && iMo6204 != 95 && ((iMo6204 < 97 || iMo6204 > 122) && (iMo6204 < 65 || iMo6204 > 90)))) {
            return interfaceC0463NextToken;
        }
        m21578("Malformed number");
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21581(boolean z) {
        InterfaceC23125 interfaceC23125 = this.f76890;
        int iIndex = (interfaceC23125.index() - this.f76885) - (z ? 4 : 2);
        while (interfaceC23125.mo6203(1) != -1) {
            if (interfaceC23125.mo6203(1) != 93) {
                m21580();
            } else {
                m21580();
                int i = 0;
                while (interfaceC23125.mo6203(1) == 61) {
                    m21580();
                    i++;
                }
                if (i == iIndex && interfaceC23125.mo6203(1) == 93) {
                    m21580();
                    return;
                }
            }
        }
        m21578(z ? "Unterminated long comment" : "Unterminated long string");
        throw null;
    }
}
