package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۛᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8294 {

    /* JADX INFO: renamed from: ۡ */
    public static final C6468 f21954 = new C6468();

    /* JADX INFO: renamed from: ֫ */
    public final C21294 f21955;

    /* JADX INFO: renamed from: ۜ */
    public C4693 f21956;

    /* JADX INFO: renamed from: ۢ */
    public final C22004 f21957;

    /* JADX INFO: renamed from: ۧ */
    public final C4271 f21958;

    /* JADX INFO: renamed from: ܳ */
    public C12318 f21959 = new C12318(this);

    /* JADX INFO: renamed from: ܽ */
    public final C8005 f21960;

    /* JADX INFO: renamed from: ܿ */
    public final C23623 f21961;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC13035 f21962;

    /* JADX INFO: renamed from: ᩷ */
    public final C8200 f21963;

    /* JADX INFO: renamed from: ᩻ */
    public C15795 f21964;

    /* JADX INFO: renamed from: ֫ */
    public static C8294 m19100(C5127 c5127) {
        C8294 c8294 = (C8294) c5127.m10905(f21954);
        return c8294 == null ? new C8294(c5127) : c8294;
    }

    public C8294(C5127 c5127) {
        c5127.m10908(f21954, this);
        this.f21963 = C8200.m18988(c5127);
        this.f21957 = C22004.m49577(c5127);
        this.f21962 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f21961 = C23623.m52439(c5127);
        this.f21955 = C21294.m48132(c5127);
        this.f21960 = C8005.m18541(c5127);
        this.f21958 = C4271.m8674(c5127);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2417 m19107(AbstractC12224 abstractC12224) {
        C2417 c2417M49585 = this.f21957.m49585(abstractC12224);
        m19109(c2417M49585);
        return c2417M49585;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19109(C2417 c2417) {
        EnumC3600 enumC3600 = c2417.f20405;
        EnumC3600 enumC3601 = EnumC3600.f7353;
        if (enumC3600 != enumC3601 && c2417.f3703 == null && c2417.f3690 == null && m19106(c2417).isEmpty()) {
            c2417.f20405 = enumC3601;
        }
        if (c2417.f20405 != enumC3601) {
            C15828 c15828 = c2417.f3687;
            if (c15828.f45858 == null && c15828.f45854 == null) {
                m19105(c2417);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19108() {
        for (C2417 c2417 : m19106(null)) {
            if (c2417.f20405 != EnumC3600.f7353) {
                C15828 c15828 = c2417.f3687;
                if (c15828.f45858 == null && c15828.f45854 == null) {
                    m19105(c2417);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C2417 m19110() {
        C2417 c2417M19099;
        try {
            InterfaceC19740 interfaceC19740M19101 = m19101(EnumC22423.SOURCE_PATH, EnumC18398.SOURCE);
            EnumC22423 enumC22423 = EnumC22423.CLASS_OUTPUT;
            InterfaceC19740 interfaceC19740M19102 = m19101(enumC22423, EnumC18398.CLASS);
            if (interfaceC19740M19101 == null) {
                interfaceC19740M19101 = interfaceC19740M19102;
            } else if (interfaceC19740M19102 != null) {
                interfaceC19740M19101 = this.f21955.m48142(interfaceC19740M19101, interfaceC19740M19102);
            }
            if (interfaceC19740M19101 == null) {
                c2417M19099 = this.f21957.f69129;
            } else {
                c2417M19099 = m19099(interfaceC19740M19101);
            }
            if (c2417M19099.f3700 == null) {
                c2417M19099.f3690 = enumC22423;
                return c2417M19099;
            }
            c2417M19099.f3702 = enumC22423;
            return c2417M19099;
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C2417 m19099(InterfaceC19740 interfaceC19740) {
        AbstractC12224 abstractC12224M15211;
        int i = C14329.f40976[interfaceC19740.mo23287().ordinal()];
        C22004 c22004 = this.f21957;
        C8200 c8200 = this.f21963;
        if (i == 1) {
            abstractC12224M15211 = C6684.m15211((C6684) this.f21964.f45697, interfaceC19740);
            if (abstractC12224M15211 == null) {
                throw new C22635(c22004.m49589(c8200.f21701, c22004.f69202), interfaceC19740, this.f21960.m18543(C13665.f38466), this.f21960, this.f21958);
            }
        } else {
            if (i != 2) {
                C1446.m31698();
                throw null;
            }
            try {
                abstractC12224M15211 = c8200.f21738.m32717(m19103(interfaceC19740));
            } catch (IOException | C17432 unused) {
                abstractC12224M15211 = c8200.f21713;
            }
        }
        C2417 c2417M49585 = c22004.m49585(abstractC12224M15211);
        C15828 c15828 = c2417M49585.f3687;
        if (c15828.f45854 == null) {
            c15828.f45854 = interfaceC19740;
            EnumC22423 enumC22423 = EnumC22423.PATCH_MODULE_PATH;
            InterfaceC13035 interfaceC13035 = this.f21962;
            boolean zMo4108 = interfaceC13035.mo4108(enumC22423);
            C21294 c21294 = this.f21955;
            if (zMo4108 && abstractC12224M15211 != c8200.f21713) {
                InterfaceC4317 interfaceC4317Mo4112 = interfaceC13035.mo4112(enumC22423, abstractC12224M15211.toString());
                c2417M49585.f3700 = interfaceC4317Mo4112;
                if (interfaceC4317Mo4112 != null) {
                    EnumC22423 enumC22424 = EnumC22423.CLASS_OUTPUT;
                    EnumC18398 enumC18398 = EnumC18398.CLASS;
                    InterfaceC19740 interfaceC19740M19101 = m19101(enumC22424, enumC18398);
                    InterfaceC19740 interfaceC19740M19102 = m19101(c2417M49585.f3700, enumC18398);
                    if (interfaceC19740M19102 != null) {
                        interfaceC19740M19101 = interfaceC19740M19101 == null ? interfaceC19740M19102 : c21294.m48142(interfaceC19740M19102, interfaceC19740M19101);
                    }
                    InterfaceC19740 interfaceC19740M19103 = m19101(c2417M49585.f3700, EnumC18398.SOURCE);
                    if (interfaceC19740M19103 != null) {
                        interfaceC19740M19101 = interfaceC19740M19101 == null ? interfaceC19740M19103 : c21294.m48142(interfaceC19740M19103, interfaceC19740M19101);
                    }
                    if (interfaceC19740M19101 != null) {
                        c2417M49585.f3687.f45854 = interfaceC19740M19101;
                    }
                }
            }
            c2417M49585.f20410 = InterfaceC8453.f22683;
            c21294.m48143(c2417M49585.f3687);
        }
        return c2417M49585;
    }

    /* JADX INFO: renamed from: ۧ */
    private String m19103(InterfaceC19740 interfaceC19740) throws IOException {
        if (this.f21956 == null) {
            this.f21956 = new C4693();
        }
        C4693 c4693 = this.f21956;
        c4693.getClass();
        InputStream inputStreamMo22776 = interfaceC19740.mo22776();
        try {
            String strM9940 = c4693.m9940(inputStreamMo22776);
            if (inputStreamMo22776 != null) {
                inputStreamMo22776.close();
            }
            return strM9940;
        } catch (Throwable th) {
            if (inputStreamMo22776 != null) {
                try {
                    inputStreamMo22776.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private InterfaceC19740 m19101(InterfaceC4317 interfaceC4317, EnumC18398 enumC18398) {
        if (interfaceC4317 == null) {
            return null;
        }
        InterfaceC13035 interfaceC13035 = this.f21962;
        if (interfaceC13035.mo4108(interfaceC4317)) {
            return interfaceC13035.mo4105(interfaceC4317, this.f21963.f21701.toString(), enumC18398);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    private C4848 m19106(C2417 c2417) {
        C13370 c13370;
        C20271 c20271 = new C20271();
        HashMap map = new HashMap();
        EnumC22423 enumC22423 = EnumC22423.MODULE_SOURCE_PATH;
        InterfaceC13035 interfaceC13035 = this.f21962;
        boolean zMo4108 = interfaceC13035.mo4108(enumC22423);
        while (true) {
            C12318 c12318 = this.f21959;
            if (c12318.hasNext()) {
                c12318.hasNext();
                Set<InterfaceC4317> set = c12318.f34386;
                if (set != null) {
                    c12318.f34386 = null;
                    map.clear();
                    for (InterfaceC4317 interfaceC4317 : set) {
                        try {
                            AbstractC12224 abstractC12224M32717 = this.f21963.f21738.m32717(interfaceC13035.mo4115(interfaceC4317));
                            if (map.put(abstractC12224M32717, interfaceC4317) == null) {
                                C2417 c2417M49585 = this.f21957.m49585(abstractC12224M32717);
                                if (c2417M49585.f3703 == null && c2417M49585.f3690 == null) {
                                    EnumC22423 enumC22424 = EnumC22423.PATCH_MODULE_PATH;
                                    if (interfaceC13035.mo4108(enumC22424) && c2417M49585.f3700 == null) {
                                        InterfaceC4317 interfaceC4317Mo4112 = interfaceC13035.mo4112(enumC22424, c2417M49585.f20408.toString());
                                        c2417M49585.f3700 = interfaceC4317Mo4112;
                                        if (interfaceC4317Mo4112 != null && zMo4108) {
                                            EnumC22423 enumC22425 = EnumC22423.CLASS_OUTPUT;
                                            if (interfaceC13035.mo4108(enumC22425)) {
                                                c2417M49585.f3702 = interfaceC13035.mo4112(enumC22425, c2417M49585.f20408.toString());
                                            }
                                        }
                                    }
                                    if (c12318.f34384 == EnumC22423.MODULE_SOURCE_PATH) {
                                        c2417M49585.f3703 = interfaceC4317;
                                        EnumC22423 enumC22426 = EnumC22423.CLASS_OUTPUT;
                                        if (interfaceC13035.mo4108(enumC22426)) {
                                            c2417M49585.f3690 = interfaceC13035.mo4112(enumC22426, c2417M49585.f20408.toString());
                                        }
                                    } else {
                                        c2417M49585.f3690 = interfaceC4317;
                                    }
                                    EnumC22423 enumC22427 = c12318.f34384;
                                    if (enumC22427 == EnumC22423.SYSTEM_MODULES || enumC22427 == EnumC22423.UPGRADE_MODULE_PATH) {
                                        c2417M49585.f20409 |= 9007199254740992L;
                                    }
                                    if (c2417 == null || (c2417 == c2417M49585 && (c2417M49585.f3703 != null || c2417M49585.f3690 != null))) {
                                        c20271.m45777(c2417M49585);
                                    }
                                }
                            } else {
                                C23623 c23623 = this.f21961;
                                int i = C14329.f40977[c12318.f34384.ordinal()];
                                if (i == 1) {
                                    c13370 = C13665.f38519;
                                } else if (i == 2) {
                                    c13370 = C13665.f38512;
                                } else if (i == 3) {
                                    c13370 = C13665.f38460;
                                } else if (i == 4) {
                                    c13370 = C13665.f38456;
                                } else {
                                    throw new AssertionError();
                                }
                                C14040 c14040 = C8300.f21997;
                                c23623.m9355(new C14040("compiler", "duplicate.module.on.path", c13370, abstractC12224M32717));
                            }
                        } catch (IOException unused) {
                        }
                    }
                    if (c2417 != null && c20271.m45784()) {
                        return c20271.m45783();
                    }
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                return c20271.m45783();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m19105(C2417 c2417) {
        InterfaceC4317 interfaceC4317;
        try {
            InterfaceC4317 interfaceC4318 = c2417.f3702;
            EnumC18398 enumC18398 = EnumC18398.CLASS;
            InterfaceC19740 interfaceC19740M19101 = m19101(interfaceC4318, enumC18398);
            InterfaceC19740 interfaceC19740M19102 = m19101(c2417.f3700, enumC18398);
            C21294 c21294 = this.f21955;
            if (interfaceC19740M19102 != null) {
                interfaceC19740M19101 = interfaceC19740M19101 == null ? interfaceC19740M19102 : c21294.m48142(interfaceC19740M19102, interfaceC19740M19101);
            }
            InterfaceC4317 interfaceC4319 = c2417.f3700;
            EnumC18398 enumC18399 = EnumC18398.SOURCE;
            InterfaceC19740 interfaceC19740M19103 = m19101(interfaceC4319, enumC18399);
            if (interfaceC19740M19103 != null) {
                interfaceC19740M19101 = interfaceC19740M19101 == null ? interfaceC19740M19103 : c21294.m48142(interfaceC19740M19103, interfaceC19740M19101);
            }
            if (interfaceC19740M19101 == null) {
                interfaceC19740M19101 = m19101(c2417.f3690, enumC18398);
                InterfaceC19740 interfaceC19740M19104 = m19101(c2417.f3703, enumC18399);
                if (interfaceC19740M19104 != null) {
                    interfaceC19740M19101 = interfaceC19740M19101 == null ? interfaceC19740M19104 : c21294.m48142(interfaceC19740M19104, interfaceC19740M19101);
                }
            }
            if (interfaceC19740M19101 == null) {
                if (((c2417.f3703 != null || (interfaceC4317 = c2417.f3690) == null) ? null : this.f21962.mo4115(interfaceC4317)) != null) {
                    c2417.f3687.f45854 = null;
                    c2417.f20409 |= 4503599627370496L;
                    return;
                } else {
                    c2417.f20405 = EnumC3600.f7353;
                    return;
                }
            }
            C15828 c15828 = c2417.f3687;
            c15828.f45854 = interfaceC19740M19101;
            c15828.f20410 = new C14999(this, c2417);
        } catch (IOException unused) {
            c2417.f20405 = EnumC3600.f7353;
        }
    }
}
