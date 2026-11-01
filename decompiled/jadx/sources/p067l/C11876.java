package p067l;

/* JADX INFO: renamed from: l.ۤۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78KJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11876 {
    /* JADX INFO: renamed from: ֫ */
    public static void m27186(int i, C25079 c25079, C3601 c3601, C25079 c250710, C25079... c25079Arr) {
        if (c250710 == null) {
            c250710 = new C25079(new InterfaceC16361[0]);
        }
        if (c25079 != null) {
            for (int i2 = 0; i2 < c25079.m55048(); i2++) {
                InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i2);
                if (interfaceC16361M55049 instanceof C2438) {
                    C2438 c2438 = (C2438) interfaceC16361M55049;
                    if (!c2438.f3762.equals("com.android.capture.fps")) {
                        c250710 = c250710.m55052(c2438);
                    } else if (i == 2) {
                        c250710 = c250710.m55052(c2438);
                    }
                }
            }
        }
        for (C25079 c250711 : c25079Arr) {
            c250710 = c250710.m55051(c250711);
        }
        if (c250710.m55048() > 0) {
            c3601.m6681(c250710);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC16269 m27188(C19203 c19203) {
        int iM43739 = c19203.m43739() + c19203.m43731();
        int iM437310 = c19203.m43739();
        int i = (iM437310 >> 24) & 255;
        AbstractC16269 c4200 = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iM437310;
                if (i2 == 6516084) {
                    int iM437311 = c19203.m43739();
                    if (c19203.m43739() == 1684108385) {
                        c19203.m43724(8);
                        String strM43719 = c19203.m43719(iM437311 - 16);
                        c4200 = new C4200("und", strM43719, strM43719);
                    } else {
                        C21334.m48351("Failed to parse comment attribute: " + AbstractC16520.m37479(iM437310));
                    }
                    c19203.m43730(iM43739);
                    return c4200;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    C10906 c10906M27187 = m27187(iM437310, c19203, "TIT2");
                    c19203.m43730(iM43739);
                    return c10906M27187;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    C10906 c10906M27188 = m27187(iM437310, c19203, "TCOM");
                    c19203.m43730(iM43739);
                    return c10906M27188;
                }
                if (i2 == 6578553) {
                    C10906 c10906M27189 = m27187(iM437310, c19203, "TDRC");
                    c19203.m43730(iM43739);
                    return c10906M27189;
                }
                if (i2 == 4280916) {
                    C10906 c10906M271810 = m27187(iM437310, c19203, "TPE1");
                    c19203.m43730(iM43739);
                    return c10906M271810;
                }
                if (i2 == 7630703) {
                    C10906 c10906M271811 = m27187(iM437310, c19203, "TSSE");
                    c19203.m43730(iM43739);
                    return c10906M271811;
                }
                if (i2 == 6384738) {
                    C10906 c10906M271812 = m27187(iM437310, c19203, "TALB");
                    c19203.m43730(iM43739);
                    return c10906M271812;
                }
                if (i2 == 7108978) {
                    C10906 c10906M271813 = m27187(iM437310, c19203, "USLT");
                    c19203.m43730(iM43739);
                    return c10906M271813;
                }
                if (i2 == 6776174) {
                    C10906 c10906M271814 = m27187(iM437310, c19203, "TCON");
                    c19203.m43730(iM43739);
                    return c10906M271814;
                }
                if (i2 == 6779504) {
                    C10906 c10906M271815 = m27187(iM437310, c19203, "TIT1");
                    c19203.m43730(iM43739);
                    return c10906M271815;
                }
            } else {
                if (iM437310 == 1735291493) {
                    String strM54886 = C24987.m54886(m27189(c19203) - 1);
                    if (strM54886 != null) {
                        c4200 = new C10906("TCON", null, AbstractC16192.m36873of((Object) strM54886));
                    } else {
                        C21334.m48351("Failed to parse standard genre code");
                    }
                    c19203.m43730(iM43739);
                    return c4200;
                }
                if (iM437310 == 1684632427) {
                    C10906 c10906M27183 = m27183(iM437310, c19203, "TPOS");
                    c19203.m43730(iM43739);
                    return c10906M27183;
                }
                if (iM437310 == 1953655662) {
                    C10906 c10906M27184 = m27183(iM437310, c19203, "TRCK");
                    c19203.m43730(iM43739);
                    return c10906M27184;
                }
                if (iM437310 == 1953329263) {
                    AbstractC16269 abstractC16269M27185 = m27185(iM437310, "TBPM", c19203, true, false);
                    c19203.m43730(iM43739);
                    return abstractC16269M27185;
                }
                if (iM437310 == 1668311404) {
                    AbstractC16269 abstractC16269M27186 = m27185(iM437310, "TCMP", c19203, true, true);
                    c19203.m43730(iM43739);
                    return abstractC16269M27186;
                }
                if (iM437310 == 1668249202) {
                    C13393 c13393M27184 = m27184(c19203);
                    c19203.m43730(iM43739);
                    return c13393M27184;
                }
                if (iM437310 == 1631670868) {
                    C10906 c10906M271816 = m27187(iM437310, c19203, "TPE2");
                    c19203.m43730(iM43739);
                    return c10906M271816;
                }
                if (iM437310 == 1936682605) {
                    C10906 c10906M271817 = m27187(iM437310, c19203, "TSOT");
                    c19203.m43730(iM43739);
                    return c10906M271817;
                }
                if (iM437310 == 1936679276) {
                    C10906 c10906M271818 = m27187(iM437310, c19203, "TSOA");
                    c19203.m43730(iM43739);
                    return c10906M271818;
                }
                if (iM437310 == 1936679282) {
                    C10906 c10906M271819 = m27187(iM437310, c19203, "TSOP");
                    c19203.m43730(iM43739);
                    return c10906M271819;
                }
                if (iM437310 == 1936679265) {
                    C10906 c10906M271820 = m27187(iM437310, c19203, "TSO2");
                    c19203.m43730(iM43739);
                    return c10906M271820;
                }
                if (iM437310 == 1936679791) {
                    C10906 c10906M271821 = m27187(iM437310, c19203, "TSOC");
                    c19203.m43730(iM43739);
                    return c10906M271821;
                }
                if (iM437310 == 1920233063) {
                    AbstractC16269 abstractC16269M27187 = m27185(iM437310, "ITUNESADVISORY", c19203, false, false);
                    c19203.m43730(iM43739);
                    return abstractC16269M27187;
                }
                if (iM437310 == 1885823344) {
                    AbstractC16269 abstractC16269M27188 = m27185(iM437310, "ITUNESGAPLESS", c19203, false, true);
                    c19203.m43730(iM43739);
                    return abstractC16269M27188;
                }
                if (iM437310 == 1936683886) {
                    C10906 c10906M271822 = m27187(iM437310, c19203, "TVSHOWSORT");
                    c19203.m43730(iM43739);
                    return c10906M271822;
                }
                if (iM437310 == 1953919848) {
                    C10906 c10906M271823 = m27187(iM437310, c19203, "TVSHOW");
                    c19203.m43730(iM43739);
                    return c10906M271823;
                }
                if (iM437310 == 757935405) {
                    int i3 = -1;
                    int i4 = -1;
                    String strM437110 = null;
                    String strM437111 = null;
                    while (c19203.m43731() < iM43739) {
                        int iM43731 = c19203.m43731();
                        int iM437312 = c19203.m43739();
                        int iM437313 = c19203.m43739();
                        c19203.m43724(4);
                        if (iM437313 == 1835360622) {
                            strM437110 = c19203.m43719(iM437312 - 12);
                        } else if (iM437313 == 1851878757) {
                            strM437111 = c19203.m43719(iM437312 - 12);
                        } else {
                            if (iM437313 == 1684108385) {
                                i3 = iM43731;
                                i4 = iM437312;
                            }
                            c19203.m43724(iM437312 - 12);
                        }
                    }
                    if (strM437110 != null && strM437111 != null && i3 != -1) {
                        c19203.m43730(i3);
                        c19203.m43724(16);
                        c4200 = new C8894(strM437110, strM437111, c19203.m43719(i4 - 16));
                    }
                    c19203.m43730(iM43739);
                    return c4200;
                }
            }
            C21334.m48345("Skipped unknown metadata entry: " + AbstractC16520.m37479(iM437310));
            c19203.m43730(iM43739);
            return null;
        } catch (Throwable th) {
            c19203.m43730(iM43739);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2438 m27182(C25079 c25079, String str) {
        for (int i = 0; i < c25079.m55048(); i++) {
            InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i);
            if (interfaceC16361M55049 instanceof C2438) {
                C2438 c2438 = (C2438) interfaceC16361M55049;
                if (c2438.f3762.equals(str)) {
                    return c2438;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C10906 m27187(int i, C19203 c19203, String str) {
        int iM43739 = c19203.m43739();
        if (c19203.m43739() == 1684108385) {
            c19203.m43724(8);
            return new C10906(str, null, AbstractC16192.m36873of((Object) c19203.m43719(iM43739 - 16)));
        }
        C21334.m48351("Failed to parse text attribute: " + AbstractC16520.m37479(i));
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC16269 m27185(int i, String str, C19203 c19203, boolean z, boolean z2) {
        int iM27189 = m27189(c19203);
        if (z2) {
            iM27189 = Math.min(1, iM27189);
        }
        if (iM27189 >= 0) {
            if (z) {
                return new C10906(str, null, AbstractC16192.m36873of((Object) Integer.toString(iM27189)));
            }
            return new C4200("und", str, Integer.toString(iM27189));
        }
        C21334.m48351("Failed to parse uint8 attribute: " + AbstractC16520.m37479(i));
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m27189(C19203 c19203) {
        int iM43739 = c19203.m43739();
        if (c19203.m43739() == 1684108385) {
            c19203.m43724(8);
            int i = iM43739 - 16;
            if (i == 1) {
                return c19203.m43702();
            }
            if (i == 2) {
                return c19203.m43710();
            }
            if (i == 3) {
                return c19203.m43737();
            }
            if (i == 4 && (c19203.m43723() & 128) == 0) {
                return c19203.m43738();
            }
        }
        C21334.m48351("Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10906 m27183(int i, C19203 c19203, String str) {
        int iM43739 = c19203.m43739();
        if (c19203.m43739() == 1684108385 && iM43739 >= 22) {
            c19203.m43724(10);
            int iM43710 = c19203.m43710();
            if (iM43710 > 0) {
                String strM46922 = C20778.m46922(iM43710, "");
                int iM43711 = c19203.m43710();
                if (iM43711 > 0) {
                    strM46922 = strM46922 + "/" + iM43711;
                }
                return new C10906(str, null, AbstractC16192.m36873of((Object) strM46922));
            }
        }
        C21334.m48351("Failed to parse index/count attribute: " + AbstractC16520.m37479(i));
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13393 m27184(C19203 c19203) {
        String str;
        int iM43739 = c19203.m43739();
        if (c19203.m43739() != 1684108385) {
            C21334.m48351("Failed to parse cover art attribute");
            return null;
        }
        int iM437310 = c19203.m43739();
        int i = C23275.f73137;
        int i2 = iM437310 & 16777215;
        if (i2 == 13) {
            str = "image/jpeg";
        } else {
            str = i2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            C10050.m23419(i2, "Unrecognized cover art flags: ");
            return null;
        }
        c19203.m43724(4);
        int i3 = iM43739 - 16;
        byte[] bArr = new byte[i3];
        c19203.m43707(0, i3, bArr);
        return new C13393(3, str, null, bArr);
    }
}
