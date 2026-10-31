package l;

/* JADX INFO: renamed from: l.ۤۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10004 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25169(int i, C23896 c23896, C1297 c1297, C23896 c23897, C23896... c23896Arr) {
        if (c23897 == null) {
            c23897 = new C23896(new InterfaceC14723[0]);
        }
        if (c23896 != null) {
            for (int i2 = 0; i2 < c23896.m52639(); i2++) {
                InterfaceC14723 interfaceC14723M52640 = c23896.m52640(i2);
                if (interfaceC14723M52640 instanceof C0074) {
                    C0074 c0074 = (C0074) interfaceC14723M52640;
                    if (!c0074.f988.equals("com.android.capture.fps")) {
                        c23897 = c23897.m52643(c0074);
                    } else if (i == 2) {
                        c23897 = c23897.m52643(c0074);
                    }
                }
            }
        }
        for (C23896 c23898 : c23896Arr) {
            c23897 = c23897.m52642(c23898);
        }
        if (c23897.m52639() > 0) {
            c1297.m4449(c23897);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC14626 m25171(C17714 c17714) {
        int iM41493 = c17714.m41493() + c17714.m41485();
        int iM41494 = c17714.m41493();
        int i = (iM41494 >> 24) & 255;
        AbstractC14626 c1927 = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM41494;
                if (i2 == 6516084) {
                    int iM41495 = c17714.m41493();
                    if (c17714.m41493() == 1684108385) {
                        c17714.m41478(8);
                        String strM41473 = c17714.m41473(iM41495 - 16);
                        c1927 = new C1927("und", strM41473, strM41473);
                    } else {
                        C19956.m46037("Failed to parse comment attribute: " + AbstractC14891.m35327(iM41494));
                    }
                    c17714.m41484(iM41493);
                    return c1927;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    C8983 c8983M25170 = m25170(iM41494, c17714, "TIT2");
                    c17714.m41484(iM41493);
                    return c8983M25170;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    C8983 c8983M25171 = m25170(iM41494, c17714, "TCOM");
                    c17714.m41484(iM41493);
                    return c8983M25171;
                }
                if (i2 == 6578553) {
                    C8983 c8983M25172 = m25170(iM41494, c17714, "TDRC");
                    c17714.m41484(iM41493);
                    return c8983M25172;
                }
                if (i2 == 4280916) {
                    C8983 c8983M25173 = m25170(iM41494, c17714, "TPE1");
                    c17714.m41484(iM41493);
                    return c8983M25173;
                }
                if (i2 == 7630703) {
                    C8983 c8983M25174 = m25170(iM41494, c17714, "TSSE");
                    c17714.m41484(iM41493);
                    return c8983M25174;
                }
                if (i2 == 6384738) {
                    C8983 c8983M25175 = m25170(iM41494, c17714, "TALB");
                    c17714.m41484(iM41493);
                    return c8983M25175;
                }
                if (i2 == 7108978) {
                    C8983 c8983M25176 = m25170(iM41494, c17714, "USLT");
                    c17714.m41484(iM41493);
                    return c8983M25176;
                }
                if (i2 == 6776174) {
                    C8983 c8983M25177 = m25170(iM41494, c17714, "TCON");
                    c17714.m41484(iM41493);
                    return c8983M25177;
                }
                if (i2 == 6779504) {
                    C8983 c8983M25178 = m25170(iM41494, c17714, "TIT1");
                    c17714.m41484(iM41493);
                    return c8983M25178;
                }
            } else {
                if (iM41494 == 1735291493) {
                    String strM52477 = C23799.m52477(m25172(c17714) - 1);
                    if (strM52477 != null) {
                        c1927 = new C8983("TCON", null, AbstractC14545.of((Object) strM52477));
                    } else {
                        C19956.m46037("Failed to parse standard genre code");
                    }
                    c17714.m41484(iM41493);
                    return c1927;
                }
                if (iM41494 == 1684632427) {
                    C8983 c8983M25166 = m25166(iM41494, c17714, "TPOS");
                    c17714.m41484(iM41493);
                    return c8983M25166;
                }
                if (iM41494 == 1953655662) {
                    C8983 c8983M25167 = m25166(iM41494, c17714, "TRCK");
                    c17714.m41484(iM41493);
                    return c8983M25167;
                }
                if (iM41494 == 1953329263) {
                    AbstractC14626 abstractC14626M25168 = m25168(iM41494, "TBPM", c17714, true, false);
                    c17714.m41484(iM41493);
                    return abstractC14626M25168;
                }
                if (iM41494 == 1668311404) {
                    AbstractC14626 abstractC14626M25169 = m25168(iM41494, "TCMP", c17714, true, true);
                    c17714.m41484(iM41493);
                    return abstractC14626M25169;
                }
                if (iM41494 == 1668249202) {
                    C11600 c11600M25167 = m25167(c17714);
                    c17714.m41484(iM41493);
                    return c11600M25167;
                }
                if (iM41494 == 1631670868) {
                    C8983 c8983M25179 = m25170(iM41494, c17714, "TPE2");
                    c17714.m41484(iM41493);
                    return c8983M25179;
                }
                if (iM41494 == 1936682605) {
                    C8983 c8983M251710 = m25170(iM41494, c17714, "TSOT");
                    c17714.m41484(iM41493);
                    return c8983M251710;
                }
                if (iM41494 == 1936679276) {
                    C8983 c8983M251711 = m25170(iM41494, c17714, "TSOA");
                    c17714.m41484(iM41493);
                    return c8983M251711;
                }
                if (iM41494 == 1936679282) {
                    C8983 c8983M251712 = m25170(iM41494, c17714, "TSOP");
                    c17714.m41484(iM41493);
                    return c8983M251712;
                }
                if (iM41494 == 1936679265) {
                    C8983 c8983M251713 = m25170(iM41494, c17714, "TSO2");
                    c17714.m41484(iM41493);
                    return c8983M251713;
                }
                if (iM41494 == 1936679791) {
                    C8983 c8983M251714 = m25170(iM41494, c17714, "TSOC");
                    c17714.m41484(iM41493);
                    return c8983M251714;
                }
                if (iM41494 == 1920233063) {
                    AbstractC14626 abstractC14626M251610 = m25168(iM41494, "ITUNESADVISORY", c17714, false, false);
                    c17714.m41484(iM41493);
                    return abstractC14626M251610;
                }
                if (iM41494 == 1885823344) {
                    AbstractC14626 abstractC14626M251611 = m25168(iM41494, "ITUNESGAPLESS", c17714, false, true);
                    c17714.m41484(iM41493);
                    return abstractC14626M251611;
                }
                if (iM41494 == 1936683886) {
                    C8983 c8983M251715 = m25170(iM41494, c17714, "TVSHOWSORT");
                    c17714.m41484(iM41493);
                    return c8983M251715;
                }
                if (iM41494 == 1953919848) {
                    C8983 c8983M251716 = m25170(iM41494, c17714, "TVSHOW");
                    c17714.m41484(iM41493);
                    return c8983M251716;
                }
                if (iM41494 == 757935405) {
                    int i3 = -1;
                    int i4 = -1;
                    String strM41474 = null;
                    String strM41475 = null;
                    while (c17714.m41485() < iM41493) {
                        int iM41485 = c17714.m41485();
                        int iM41496 = c17714.m41493();
                        int iM41497 = c17714.m41493();
                        c17714.m41478(4);
                        if (iM41497 == 1835360622) {
                            strM41474 = c17714.m41473(iM41496 - 12);
                        } else if (iM41497 == 1851878757) {
                            strM41475 = c17714.m41473(iM41496 - 12);
                        } else {
                            if (iM41497 == 1684108385) {
                                i3 = iM41485;
                                i4 = iM41496;
                            }
                            c17714.m41478(iM41496 - 12);
                        }
                    }
                    if (strM41474 != null && strM41475 != null && i3 != -1) {
                        c17714.m41484(i3);
                        c17714.m41478(16);
                        c1927 = new C6866(strM41474, strM41475, c17714.m41473(i4 - 16));
                    }
                    c17714.m41484(iM41493);
                    return c1927;
                }
            }
            C19956.m46031("Skipped unknown metadata entry: " + AbstractC14891.m35327(iM41494));
            c17714.m41484(iM41493);
            return null;
        } catch (Throwable th) {
            c17714.m41484(iM41493);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0074 m25165(C23896 c23896, String str) {
        for (int i = 0; i < c23896.m52639(); i++) {
            InterfaceC14723 interfaceC14723M52640 = c23896.m52640(i);
            if (interfaceC14723M52640 instanceof C0074) {
                C0074 c0074 = (C0074) interfaceC14723M52640;
                if (c0074.f988.equals(str)) {
                    return c0074;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8983 m25170(int i, C17714 c17714, String str) {
        int iM41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385) {
            c17714.m41478(8);
            return new C8983(str, null, AbstractC14545.of((Object) c17714.m41473(iM41493 - 16)));
        }
        C19956.m46037("Failed to parse text attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC14626 m25168(int i, String str, C17714 c17714, boolean z, boolean z2) {
        int iM25172 = m25172(c17714);
        if (z2) {
            iM25172 = Math.min(1, iM25172);
        }
        if (iM25172 >= 0) {
            if (z) {
                return new C8983(str, null, AbstractC14545.of((Object) Integer.toString(iM25172)));
            }
            return new C1927("und", str, Integer.toString(iM25172));
        }
        C19956.m46037("Failed to parse uint8 attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m25172(C17714 c17714) {
        int iM41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385) {
            c17714.m41478(8);
            int i = iM41493 - 16;
            if (i == 1) {
                return c17714.m41456();
            }
            if (i == 2) {
                return c17714.m41464();
            }
            if (i == 3) {
                return c17714.m41491();
            }
            if (i == 4 && (c17714.m41477() & 128) == 0) {
                return c17714.m41492();
            }
        }
        C19956.m46037("Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8983 m25166(int i, C17714 c17714, String str) {
        int iM41493 = c17714.m41493();
        if (c17714.m41493() == 1684108385 && iM41493 >= 22) {
            c17714.m41478(10);
            int iM41464 = c17714.m41464();
            if (iM41464 > 0) {
                String strM44628 = C19370.m44628(iM41464, "");
                int iM41465 = c17714.m41464();
                if (iM41465 > 0) {
                    strM44628 = strM44628 + "/" + iM41465;
                }
                return new C8983(str, null, AbstractC14545.of((Object) strM44628));
            }
        }
        C19956.m46037("Failed to parse index/count attribute: " + AbstractC14891.m35327(i));
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11600 m25167(C17714 c17714) {
        String str;
        int iM41493 = c17714.m41493();
        if (c17714.m41493() != 1684108385) {
            C19956.m46037("Failed to parse cover art attribute");
            return null;
        }
        int iM41494 = c17714.m41493();
        int i = C21998.f70423;
        int i2 = iM41494 & 16777215;
        if (i2 == 13) {
            str = "image/jpeg";
        } else {
            str = i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            C8083.m21451(i2, "Unrecognized cover art flags: ");
            return null;
        }
        c17714.m41478(4);
        int i3 = iM41493 - 16;
        byte[] bArr = new byte[i3];
        c17714.m41461(0, i3, bArr);
        return new C11600(3, str, null, bArr);
    }
}
