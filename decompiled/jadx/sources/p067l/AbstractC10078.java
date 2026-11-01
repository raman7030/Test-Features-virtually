package p067l;

/* JADX INFO: renamed from: l.۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OU */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10078 extends AbstractC24937 {

    /* JADX INFO: renamed from: ֡ */
    public int f27978;

    /* JADX INFO: renamed from: ۚ */
    public int f27979;

    /* JADX INFO: renamed from: ᩵ */
    public int f27980;

    /* JADX INFO: renamed from: ᩳ */
    public static int m23547(int i) {
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

    public AbstractC10078(C22149 c22149) {
        super(c22149);
        this.f27978 = 1;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m23548() {
        ((C6421) m45729()).m14700(this.f79642);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m23546(String str) {
        throw new C2701(EnumC20808.SYNTAX, this.f79632, this.f79631, str);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m23550() {
        InterfaceC24346 interfaceC24346 = this.f79642;
        if (interfaceC24346.mo8405(1) == 91) {
            int i = 1;
            do {
                i++;
            } while (interfaceC24346.mo8405(i) == 61);
            if (interfaceC24346.mo8405(i) == 91) {
                for (int i2 = 0; i2 < i; i2++) {
                    m23548();
                }
                m23549(true);
                return;
            }
        }
        while (interfaceC24346.mo8405(1) != -1 && interfaceC24346.mo8405(1) != 10 && interfaceC24346.mo8405(1) != 13) {
            m23548();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m23551(int i) {
        while (true) {
            InterfaceC24346 interfaceC24346 = this.f79642;
            int iMo8405 = interfaceC24346.mo8405(1);
            if (iMo8405 == -1) {
                break;
            }
            if (iMo8405 == 13 || iMo8405 == 10) {
                break;
            }
            m23548();
            if (iMo8405 == i) {
                return;
            }
            if (iMo8405 == 92) {
                int iMo8406 = interfaceC24346.mo8405(1);
                if (iMo8406 == -1) {
                    m23546("Unterminated string escape");
                    throw null;
                }
                m23548();
                if (iMo8406 == 122) {
                    while (true) {
                        int iMo8407 = interfaceC24346.mo8405(1);
                        if (iMo8407 == 32 || iMo8407 == 9 || iMo8407 == 13 || iMo8407 == 10 || iMo8407 == 12 || iMo8407 == 11) {
                            m23548();
                        }
                    }
                } else if (iMo8406 != 13 && iMo8406 != 10) {
                    int i2 = 0;
                    if (iMo8406 == 120) {
                        while (i2 < 2) {
                            if (m23547(interfaceC24346.mo8405(1)) < 0) {
                                m23546("Invalid hexadecimal escape");
                                throw null;
                            }
                            m23548();
                            i2++;
                        }
                    } else if (iMo8406 == 117) {
                        if (interfaceC24346.mo8405(1) != 123) {
                            m23546("Invalid Unicode escape");
                            throw null;
                        }
                        m23548();
                        long jM23547 = 0;
                        while (m23547(interfaceC24346.mo8405(1)) >= 0) {
                            jM23547 = (jM23547 * 16) + ((long) m23547(interfaceC24346.mo8405(1)));
                            if (jM23547 > 2147483647L) {
                                m23546("Unicode escape out of range");
                                throw null;
                            }
                            m23548();
                            i2++;
                        }
                        if (i2 == 0 || interfaceC24346.mo8405(1) != 125) {
                            m23546("Invalid Unicode escape");
                            throw null;
                        }
                        m23548();
                    } else if (iMo8406 >= 48 && iMo8406 <= 57) {
                        int iMo8408 = iMo8406 - 48;
                        for (int i3 = 1; i3 < 3 && interfaceC24346.mo8405(1) >= 48 && interfaceC24346.mo8405(1) <= 57; i3++) {
                            iMo8408 = (interfaceC24346.mo8405(1) + (iMo8408 * 10)) - 48;
                            m23548();
                        }
                        if (iMo8408 > 255) {
                            m23546("Decimal escape out of range");
                            throw null;
                        }
                    } else if ("abfnrtv\"'\\".indexOf(iMo8406) < 0) {
                        m23546("Invalid string escape");
                        throw null;
                    }
                } else if (interfaceC24346.mo8405(1) == (iMo8406 == 13 ? 10 : 13)) {
                    m23548();
                }
            }
        }
        m23546("Unterminated string");
        throw null;
    }

    @Override // p067l.AbstractC24937, p067l.InterfaceC3479
    public final InterfaceC2808 nextToken() {
        InterfaceC24346 interfaceC24346 = this.f79642;
        InterfaceC2808 interfaceC2808NextToken = super.nextToken();
        for (int iIndex = interfaceC24346.index(); iIndex < interfaceC24346.index(); iIndex++) {
            int iMo8405 = interfaceC24346.mo8405(iIndex - interfaceC24346.index());
            if (iMo8405 == 13 || iMo8405 == 10) {
                int i = this.f27979;
                if (i == 0 || i == iMo8405) {
                    this.f27978++;
                    this.f27979 = iMo8405;
                } else {
                    this.f27979 = 0;
                }
                this.f27980 = 0;
            } else {
                this.f27980++;
                this.f27979 = 0;
            }
        }
        ((C6421) m45729()).m14704(this.f27978);
        ((C6421) m45729()).m14699(this.f27980);
        int type = interfaceC2808NextToken.getType();
        int iMo8406 = interfaceC24346.mo8405(1);
        if ((type != 60 && type != 61 && type != 62 && type != 63) || (iMo8406 != 46 && iMo8406 != 95 && ((iMo8406 < 97 || iMo8406 > 122) && (iMo8406 < 65 || iMo8406 > 90)))) {
            return interfaceC2808NextToken;
        }
        m23546("Malformed number");
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23549(boolean z) {
        InterfaceC24346 interfaceC24346 = this.f79642;
        int iIndex = (interfaceC24346.index() - this.f79637) - (z ? 4 : 2);
        while (interfaceC24346.mo8405(1) != -1) {
            if (interfaceC24346.mo8405(1) != 93) {
                m23548();
            } else {
                m23548();
                int i = 0;
                while (interfaceC24346.mo8405(1) == 61) {
                    m23548();
                    i++;
                }
                if (i == iIndex && interfaceC24346.mo8405(1) == 93) {
                    m23548();
                    return;
                }
            }
        }
        m23546(z ? "Unterminated long comment" : "Unterminated long string");
        throw null;
    }
}
