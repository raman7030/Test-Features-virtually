package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public class C20806 extends AbstractC18689 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f67350;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9378[] f67353;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f67355;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f67356;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5557 f67357;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10222 f67359;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67360;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f67365;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC1049 f67362 = EnumC1049.NORMAL;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f67354 = false;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7841 f67361 = new C7841(false);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7841 f67351 = new C7841(false);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C7841 f67352 = new C7841(false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7841 f67366 = new C7841(true);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C7841 f67358 = new C7841(true);

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C7841 f67364 = new C7841(true);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7841 f67363 = new C7841(true);

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
    }

    @Override // l.AbstractC18689, l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo1386(C7820 c7820) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1409(C16139 c16139) {
        mo10758((AbstractC5144) c16139.f49721);
        m47609(c16139.f49721);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        mo10758(c6262.f19397);
        if (C7260.m19453(c6262.f19397)) {
            AbstractC5698 abstractC5698 = c6262.f19396;
            if (abstractC5698.f17559 == EnumC1296.f4567) {
                m47603((InterfaceC3109) c6262, (C12048) abstractC5698);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m47610(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            super.mo10758(abstractC5144);
            if (this.f67361.m20941()) {
                m47613();
            }
        }
    }

    @Override // l.AbstractC18689
    /* JADX INFO: renamed from: ᩳ */
    public final void mo15215() {
        boolean z = this.f67354;
        C7841 c7841 = this.f67361;
        if (!z) {
            c7841.m20937(this.f67356, this.f67365);
        } else {
            for (int i = this.f67356; i < this.f67365; i++) {
                C12048 c12048 = this.f67353[i].f28489;
                if (!m47607(c12048) || !c12048.mo15572()) {
                    c7841.m20945(i);
                }
            }
        }
        this.f67351.m20937(this.f67356, this.f67365);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo35862(C12048 c12048) {
        if (c12048.f36040 < this.f67355) {
            return false;
        }
        EnumC1296 enumC1296 = c12048.f17561.f17559;
        return enumC1296 == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567 || m47607(c12048);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47607(C12048 c12048) {
        AbstractC5698 abstractC5698 = c12048.f17561;
        if (abstractC5698.f17559 != EnumC1296.f4582 || (c12048.f17563 & 8590196752L) != 16) {
            return false;
        }
        AbstractC5698 abstractC5699 = this.f67357.f17186;
        C14163 c14163 = (C14163) abstractC5698;
        abstractC5699.getClass();
        while (abstractC5699.f17559 != EnumC1296.f4579) {
            if (abstractC5699 == c14163) {
                return true;
            }
            abstractC5699 = abstractC5699.f17561;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47611(C9378 c9378) {
        C12048 c12048 = c9378.f28489;
        C9378[] c9378Arr = (C9378[]) C6322.m17575(this.f67365, this.f67353);
        this.f67353 = c9378Arr;
        long j = c12048.f17563;
        if ((16 & j) == 0) {
            c12048.f17563 = j | 2199023255552L;
        }
        int i = this.f67365;
        c12048.f36038 = i;
        c9378Arr[i] = c9378;
        this.f67361.m20936(i);
        this.f67351.m20945(this.f67365);
        this.f67365++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47605(AbstractC5144 abstractC5144, C12048 c12048) {
        int i = c12048.f36038;
        int i2 = this.f67360;
        C10222 c10222 = this.f67359;
        if (i < i2 || !mo35862(c12048)) {
            if ((c12048.f17563 & 16) != 0) {
                C22364 c22364 = c10222.f30706;
                C12281 c12281 = C6241.f19132;
                c22364.m7273(abstractC5144, new C12281("compiler", "var.might.already.be.assigned", c12048));
                return;
            }
            return;
        }
        long j = c12048.f17563;
        long j2 = 2199023255552L & j;
        C7841 c7841 = this.f67351;
        if (j2 != 0) {
            if (!c7841.m20950(c12048.f36038)) {
                c12048.f17563 &= -2199023255553L;
            } else {
                m47612(c12048);
            }
        } else if ((16 & j) != 0) {
            if ((8589934592L & j) != 0) {
                if ((j & 549755813888L) != 0) {
                    C22364 c22365 = c10222.f30706;
                    C12281 c12282 = C6241.f19132;
                    c22365.m7273(abstractC5144, new C12281("compiler", "multicatch.parameter.may.not.be.assigned", c12048));
                } else {
                    C22364 c22366 = c10222.f30706;
                    C12281 c12283 = C6241.f19132;
                    c22366.m7273(abstractC5144, new C12281("compiler", "final.parameter.may.not.be.assigned", c12048));
                }
            } else if (!c7841.m20950(c12048.f36038)) {
                c10222.f30706.m7273(abstractC5144, c10222.f30709.m16616(this.f67362.f3879, c12048));
            } else {
                m47612(c12048);
            }
        }
        this.f67361.m20945(c12048.f36038);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m47612(C12048 c12048) {
        boolean zM20950 = this.f67361.m20950(c12048.f36038);
        C7841 c7841 = this.f67351;
        if (!zM20950) {
            c7841.m20936(c12048.f36038);
            this.f67352.m20936(c12048.f36038);
        } else {
            c7841.m20936(c12048.f36038);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m47615(AbstractC5144 abstractC5144) {
        AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC5144);
        if (abstractC5144M19471.m14709(EnumC18550.f57566) || abstractC5144M19471.m14709(EnumC18550.f57581)) {
            AbstractC5698 abstractC5698M19472 = C7260.m19472(abstractC5144M19471);
            if (abstractC5698M19472.f17559 == EnumC1296.f4567) {
                m47605(abstractC5144M19471, (C12048) abstractC5698M19472);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47603(InterfaceC3109 interfaceC3109, C12048 c12048) {
        C12281 c12281 = C6241.f19132;
        m47604(interfaceC3109, c12048, new C12281("compiler", "var.might.not.have.been.initialized", c12048));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47604(InterfaceC3109 interfaceC3109, C12048 c12048, C12281 c12281) {
        if ((c12048.f36038 >= this.f67360 || c12048.f17561.f17559 != EnumC1296.f4582) && mo35862(c12048)) {
            int i = c12048.f36038;
            C7841 c7841 = this.f67361;
            if (c7841.m20950(i) || (c12048.f17563 & 4398046511104L) != 0) {
                return;
            }
            this.f67359.f30706.m7273(interfaceC3109, c12281);
            c7841.m20945(c12048.f36038);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47600(C7841... c7841Arr) {
        for (C7841 c7841 : c7841Arr) {
            c7841.m20944();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47606(boolean z) {
        C7841 c7841 = this.f67358;
        C7841 c7842 = this.f67361;
        c7841.m20940(c7842);
        C7841 c7843 = this.f67363;
        C7841 c7844 = this.f67351;
        c7843.m20940(c7844);
        this.f67366.m20940(c7842);
        this.f67364.m20940(c7844);
        if (z) {
            m47600(c7842, c7844);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47613() {
        C7841 c7841 = this.f67366;
        C7841 c7842 = this.f67358;
        c7842.m20938(c7841);
        this.f67361.m20940(c7842);
        C7841 c7843 = this.f67364;
        C7841 c7844 = this.f67363;
        c7844.m20938(c7843);
        this.f67351.m20940(c7844);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47608(C2609 c2609) {
        if (c2609 != null) {
            while (c2609.m8249()) {
                m47610((AbstractC5144) c2609.f8240);
                c2609 = c2609.f8241;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m47614(AbstractC5144 abstractC5144) {
        boolean zMo12942 = abstractC5144.f16086.mo12942();
        C10222 c10222 = this.f67359;
        C7841 c7841 = this.f67363;
        C7841 c7842 = this.f67358;
        C7841 c7843 = this.f67364;
        C7841 c7844 = this.f67366;
        C7841 c7845 = this.f67351;
        C7841 c7846 = this.f67361;
        if (zMo12942) {
            if (c7846.m20941()) {
                m47613();
            }
            c7844.m20940(c7846);
            c7844.m20937(this.f67360, this.f67365);
            c7843.m20940(c7845);
            c7843.m20937(this.f67360, this.f67365);
            c7842.m20940(c7846);
            c7841.m20940(c7845);
        } else if (!abstractC5144.f16086.mo12935()) {
            super.mo10758(abstractC5144);
            if (!c7846.m20941()) {
                m47606(abstractC5144.f16086 != c10222.f30704.f66519);
            }
        } else {
            if (c7846.m20941()) {
                m47613();
            }
            c7842.m20940(c7846);
            c7842.m20937(this.f67360, this.f67365);
            c7841.m20940(c7845);
            c7841.m20937(this.f67360, this.f67365);
            c7844.m20940(c7846);
            c7843.m20940(c7845);
        }
        if (abstractC5144.f16086 != c10222.f30704.f66519) {
            m47600(c7846, c7845);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1215(C5557 c5557) {
        if (c5557.f17186 == null) {
            return;
        }
        C10222 c10222 = this.f67359;
        C4824 c4824 = c10222.f30708;
        c10222.f30708 = c10222.f30708.m14053(c5557.f17186);
        try {
            if (c5557.f17186 != null) {
                C5557 c5558 = this.f67357;
                int i = this.f67360;
                int i2 = this.f67365;
                C18837 c18837 = this.f59097;
                this.f59097 = new C18837();
                if (c5557.f17180 != c10222.f30702.f18867) {
                    this.f67360 = this.f67365;
                }
                this.f67357 = c5557;
                try {
                    for (C2609 c2609 = c5557.f17179; c2609.m8249(); c2609 = c2609.f8241) {
                        if (((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57578)) {
                            C9378 c9378 = (C9378) c2609.f8240;
                            if ((8 & c9378.f28486.f7169) != 0 && mo35862(c9378.f28489)) {
                                m47611(c9378);
                            }
                        }
                    }
                    for (C2609 c26010 = c5557.f17179; c26010.m8249(); c26010 = c26010.f8241) {
                        if (!((AbstractC5144) c26010.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26010.f8240) & 8) != 0) {
                            super.mo10758((AbstractC5144) c26010.f8240);
                            m47601(false);
                        }
                    }
                    for (C2609 c26011 = c5557.f17179; c26011.m8249(); c26011 = c26011.f8241) {
                        if (((AbstractC5144) c26011.f8240).m14709(EnumC18550.f57578)) {
                            C9378 c9379 = (C9378) c26011.f8240;
                            if ((c9379.f28486.f7169 & 8) == 0 && mo35862(c9379.f28489)) {
                                m47611(c9379);
                            }
                        }
                    }
                    for (C2609 c26012 = c5557.f17179; c26012.m8249(); c26012 = c26012.f8241) {
                        if (!((AbstractC5144) c26012.f8240).m14709(EnumC18550.f57511) && (C7260.m19473((AbstractC5144) c26012.f8240) & 8) == 0) {
                            super.mo10758((AbstractC5144) c26012.f8240);
                            m47601(false);
                        }
                    }
                    for (C2609 c26013 = c5557.f17179; c26013.m8249(); c26013 = c26013.f8241) {
                        if (((AbstractC5144) c26013.f8240).m14709(EnumC18550.f57511)) {
                            super.mo10758((AbstractC5144) c26013.f8240);
                        }
                    }
                    this.f59097 = c18837;
                    this.f67365 = i2;
                    this.f67360 = i;
                    this.f67357 = c5558;
                    c10222.f30708 = c4824;
                    return;
                } catch (Throwable th) {
                    this.f59097 = c18837;
                    this.f67365 = i2;
                    this.f67360 = i;
                    this.f67357 = c5558;
                    throw th;
                }
            }
            c10222.f30708 = c4824;
        } catch (Throwable th2) {
            c10222.f30708 = c4824;
            throw th2;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) throws Throwable {
        C4824 c4824;
        C10222 c10222;
        boolean z;
        C10222 c10223;
        C4824 c4825;
        boolean z2;
        C7841 c7841 = this.f67351;
        C7841 c7842 = this.f67361;
        if (c8526.f26043 != null && (c8526.f26045.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            C10222 c10224 = this.f67359;
            C4824 c4826 = c10224.f30708;
            c10224.f30708 = c10224.f30708.m14053(c8526.f26045);
            try {
                if (c8526.f26043 == null) {
                    c10224.f30708 = c4826;
                    return;
                }
                if ((c8526.f26045.f17563 & 562949953425408L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    c10224.f30708 = c4826;
                    return;
                }
                C7841 c7843 = new C7841(c7842);
                C7841 c7844 = new C7841(c7841);
                int i = this.f67365;
                int i2 = this.f67360;
                int i3 = this.f67356;
                C12171.m29642(this.f59097.isEmpty());
                boolean z3 = this.f67354;
                try {
                    boolean zM19469 = C7260.m19469(c8526);
                    this.f67354 = zM19469;
                    if (!zM19469) {
                        this.f67360 = this.f67365;
                    }
                    for (C2609 c2609 = c8526.f26048; c2609.m8249(); c2609 = c2609.f8241) {
                        C9378 c9378 = (C9378) c2609.f8240;
                        super.mo10758((AbstractC5144) c9378);
                        C12171.m29641("Method parameter without PARAMETER flag", (c9378.f28489.f17563 & 8589934592L) != 0);
                        m47609(c9378);
                    }
                    super.mo10758(c8526.f26043);
                    long j = c8526.f26045.f17563;
                    boolean z4 = (j & 2251799813685248L) != 0;
                    if (this.f67354) {
                        boolean z5 = (j & 68719476736L) != 0;
                        try {
                            int i4 = this.f67360;
                            while (i4 < this.f67365) {
                                C9378 c9379 = this.f67353[i4];
                                C12048 c12048 = c9379.f28489;
                                c10223 = c10224;
                                try {
                                    c4825 = c4826;
                                    try {
                                        if (c12048.f17561 == this.f67357.f17186) {
                                            if (!z5 || z4) {
                                                z5 = z5;
                                                z2 = z3;
                                                if (!z4) {
                                                    m47603(C7260.m19464(c8526.f26043), c12048);
                                                } else if (!c12048.m16071().m33810() || (c12048.f17563 & 2305843009230471186L) == 0 || c12048.mo15572() || c12048.f17561.f17559 != EnumC1296.f4582) {
                                                    m47603(C7260.m19439(c12048, c9379, false), c12048);
                                                } else if (!c7842.m20950(c12048.f36038) && c7841.m20950(c12048.f36038) && c8526.f26050) {
                                                    c12048.f17563 |= 2251799813685248L;
                                                } else {
                                                    m47603(C7260.m19464(c8526.f26043), c12048);
                                                }
                                            } else {
                                                InterfaceC3109 interfaceC3109M19439 = C7260.m19439(c12048, c9379, false);
                                                try {
                                                    C12281 c12281 = C6241.f19132;
                                                    z2 = z3;
                                                    try {
                                                        m47604(interfaceC3109M19439, c12048, new C12281("compiler", "var.not.initialized.in.default.constructor", c12048));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c10222 = c10223;
                                                        c4824 = c4825;
                                                        z = z2;
                                                        try {
                                                            c7842.m20940(c7843);
                                                            c7841.m20940(c7844);
                                                            this.f67365 = i;
                                                            this.f67360 = i2;
                                                            this.f67356 = i3;
                                                            this.f67354 = z;
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z2 = z3;
                                                    c10222 = c10223;
                                                    c4824 = c4825;
                                                    z = z2;
                                                    c7842.m20940(c7843);
                                                    c7841.m20940(c7844);
                                                    this.f67365 = i;
                                                    this.f67360 = i2;
                                                    this.f67356 = i3;
                                                    this.f67354 = z;
                                                    throw th;
                                                }
                                            }
                                            i4++;
                                            c10224 = c10223;
                                            c4826 = c4825;
                                            z5 = z5;
                                            z3 = z2;
                                        } else {
                                            z2 = z3;
                                        }
                                        i4++;
                                        c10224 = c10223;
                                        c4826 = c4825;
                                        z5 = z5;
                                        z3 = z2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c4825 = c4826;
                                    z2 = z3;
                                    c10222 = c10223;
                                    c4824 = c4825;
                                    z = z2;
                                    c7842.m20940(c7843);
                                    c7841.m20940(c7844);
                                    this.f67365 = i;
                                    this.f67360 = i2;
                                    this.f67356 = i3;
                                    this.f67354 = z;
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c10223 = c10224;
                        }
                    }
                    c10223 = c10224;
                    c4825 = c4826;
                    z2 = z3;
                    m47601(true);
                    try {
                        c7842.m20940(c7843);
                        c7841.m20940(c7844);
                        this.f67365 = i;
                        this.f67360 = i2;
                        this.f67356 = i3;
                        this.f67354 = z2;
                        c10223.f30708 = c4825;
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        c10222 = c10223;
                        c4824 = c4825;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c4824 = c4826;
                    c10222 = c10224;
                    z = z3;
                }
            } catch (Throwable th9) {
                th = th9;
                c4824 = c4826;
                c10222 = c10224;
            }
            c10222.f30708 = c4824;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47601(boolean z) {
        boolean z2;
        C2609 c2609M43517 = this.f59097.m43517();
        this.f59097 = new C18837();
        while (c2609M43517.m8249()) {
            C3872 c3872 = (C3872) c2609M43517.f8240;
            c2609M43517 = c2609M43517.f8241;
            if (z && c3872.f12387.m14709(EnumC18550.f57530)) {
                z2 = true;
            } else {
                C22364 c22364 = this.f67359.f30706;
                AbstractC5144 abstractC5144 = c3872.f12387;
                abstractC5144.getClass();
                if (c22364.m50116(abstractC5144)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C12171.m29639(c3872.f12387, z2);
            if (z && this.f67354) {
                C12171.m29642(c3872 instanceof C6694);
                this.f67361.m20940(((C6694) c3872).f20802);
                for (int i = this.f67360; i < this.f67365; i++) {
                    AbstractC5144 abstractC5145 = c3872.f12387;
                    abstractC5145.getClass();
                    m47603((InterfaceC3109) abstractC5145, this.f67353[i].f28489);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m47609(C9378 c9378) {
        this.f67361.m20945(c9378.f28489.f36038);
        this.f67351.m20936(c9378.f28489.f36038);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1392(C9378 c9378) {
        EnumC1296 enumC1296;
        C10222 c10222 = this.f67359;
        C4824 c4824 = c10222.f30708;
        c10222.f30708 = c10222.f30708.m14053(c9378.f28489);
        try {
            boolean zMo35862 = mo35862(c9378.f28489);
            if (zMo35862 && ((enumC1296 = c9378.f28489.f17561.f17559) == EnumC1296.f4571 || enumC1296 == EnumC1296.f4567)) {
                m47611(c9378);
            }
            AbstractC12612 abstractC12612 = c9378.f28487;
            if (abstractC12612 != null) {
                m47610(abstractC12612);
                if (zMo35862) {
                    m47605((AbstractC5144) c9378, c9378.f28489);
                }
            }
        } finally {
            c10222.f30708 = c4824;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1372(C2735 c2735) {
        int i = this.f67365;
        m33860(c2735.f8521);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1421(C20374 c20374) {
        C7841 c7841;
        C7841 c7842;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        C7841 c7843 = new C7841(true);
        C7841 c7844 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        int i = c10222.f30706.f72454;
        while (true) {
            c7841 = this.f67351;
            C7841 c7845 = new C7841(c7841);
            c7845.m20939(this.f67365);
            super.mo10758(c20374.f65770);
            m43307(c20374);
            m47614(c20374.f65771);
            if (!this.f67362.m3617()) {
                c7843.m20940(this.f67358);
                c7844.m20940(this.f67363);
            }
            int i2 = c10222.f30706.f72454;
            c7842 = this.f67361;
            if (i2 != i || this.f67362.m3617()) {
                break;
            }
            C7841 c7846 = new C7841(c7845);
            C7841 c7847 = this.f67364;
            c7846.m20946(c7847);
            if (c7846.m20947(this.f67360) == -1) {
                break;
            }
            c7842.m20940(this.f67366);
            c7845.m20938(c7847);
            c7841.m20940(c7845);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7842.m20940(c7843);
        c7841.m20940(c7844);
        m43303(c20374, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1389(C8672 c8672) {
        C7841 c7841;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        C7841 c7842 = new C7841(true);
        C7841 c7843 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        int i = c10222.f30706.f72454;
        C7841 c7844 = this.f67351;
        C7841 c7845 = new C7841(c7844);
        c7845.m20939(this.f67365);
        while (true) {
            m47614(c8672.f26445);
            if (!this.f67362.m3617()) {
                c7842.m20940(this.f67358);
                c7843.m20940(this.f67363);
            }
            C7841 c7846 = this.f67366;
            c7841 = this.f67361;
            c7841.m20940(c7846);
            c7844.m20940(this.f67364);
            super.mo10758(c8672.f26444);
            m43307(c8672);
            if (c10222.f30706.f72454 != i || this.f67362.m3617()) {
                break;
            }
            C7841 c7847 = new C7841(c7845);
            c7847.m20946(c7844);
            if (c7847.m20947(this.f67360) == -1) {
                break;
            }
            c7845.m20938(c7844);
            c7844.m20940(c7845);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7841.m20940(c7842);
        c7844.m20940(c7843);
        m43303(c8672, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1397(C11907 c11907) {
        C7841 c7841;
        C7841 c7842;
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        int i = this.f67365;
        m33860(c11907.f35587);
        C7841 c7843 = new C7841(true);
        C7841 c7844 = new C7841(true);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        int i2 = c10222.f30706.f72454;
        while (true) {
            c7841 = this.f67351;
            C7841 c7845 = new C7841(c7841);
            c7845.m20939(this.f67365);
            AbstractC12612 abstractC12612 = c11907.f35588;
            c7842 = this.f67361;
            if (abstractC12612 != null) {
                m47614(abstractC12612);
                if (!this.f67362.m3617()) {
                    c7843.m20940(this.f67358);
                    c7844.m20940(this.f67363);
                }
                c7842.m20940(this.f67366);
                c7841.m20940(this.f67364);
            } else if (!this.f67362.m3617()) {
                c7843.m20940(c7842);
                c7843.m20937(this.f67360, this.f67365);
                c7844.m20940(c7841);
                c7844.m20937(this.f67360, this.f67365);
            }
            super.mo10758(c11907.f35585);
            m43307(c11907);
            m33860(c11907.f35586);
            if (c10222.f30706.f72454 != i2 || this.f67362.m3617()) {
                break;
            }
            C7841 c7846 = new C7841(c7845);
            c7846.m20946(c7841);
            if (c7846.m20947(this.f67360) == -1) {
                break;
            }
            c7845.m20938(c7841);
            c7841.m20940(c7845);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7842.m20940(c7843);
        c7841.m20940(c7844);
        m43303(c11907, c18837);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1378(C4851 c4851) {
        mo1392(c4851.f15325);
        C18837 c18837 = this.f59097;
        EnumC1049 enumC1049 = this.f67362;
        this.f67362 = EnumC1049.NORMAL;
        int i = this.f67365;
        super.mo10758(c4851.f15326);
        C7841 c7841 = this.f67361;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67351;
        C7841 c7844 = new C7841(c7843);
        m47605((AbstractC5144) c4851, c4851.f15325.f28489);
        this.f59097 = new C18837();
        C10222 c10222 = this.f67359;
        int i2 = c10222.f30706.f72454;
        while (true) {
            C7841 c7845 = new C7841(c7843);
            c7845.m20939(this.f67365);
            super.mo10758(c4851.f15324);
            m43307(c4851);
            if (c10222.f30706.f72454 != i2 || this.f67362.m3617()) {
                break;
            }
            C7841 c7846 = new C7841(c7845);
            c7846.m20946(c7843);
            if (c7846.m20947(this.f67360) == -1) {
                break;
            }
            c7845.m20938(c7843);
            c7843.m20940(c7845);
            this.f67362 = EnumC1049.SPECULATIVE_LOOP;
        }
        this.f67362 = enumC1049;
        c7841.m20940(c7842);
        c7844.m20938(c7843);
        c7843.m20940(c7844);
        m43303(c4851, c18837);
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1414(C17698 c17698) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        super.mo10758(c17698.f54159);
        m43303(c17698, c18837);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1426(C22637 c22637) {
        m47599(c22637, c22637.f73103, c22637.f73102, c22637.f73105);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m47599(c13464, c13464.f40197, c13464.f40199, c13464.f40196);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47599(AbstractC5144 abstractC5144, AbstractC12612 abstractC12612, C2609 c2609, boolean z) {
        C18837 c18837 = this.f59097;
        this.f59097 = new C18837();
        int i = this.f67365;
        m47610(abstractC12612);
        C7841 c7841 = this.f67361;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67351;
        C7841 c7844 = new C7841(c7843);
        while (c2609.m8249()) {
            c7841.m20940(c7842);
            c7843.m20938(c7844);
            c7843.m20940(c7843);
            C18963 c18963 = (C18963) c2609.f8240;
            Iterator it = c18963.f59815.iterator();
            while (it.hasNext()) {
                super.mo10758((AbstractC19669) it.next());
                if (c7841.m20941()) {
                    c7841.m20940(this.f67366);
                    c7843.m20940(this.f67364);
                }
            }
            if (((C18963) c2609.f8240).f59814.isEmpty() && c2609.f8241.m8249() && ((C18963) c2609.f8241.f8240).f59815.m8245() == 1 && ((AbstractC19669) ((C18963) c2609.f8241.f8240).f59815.f8240).mo30871() && C7260.m19429((AbstractC5144) ((C18963) c2609.f8241.f8240).f59815.f8240)) {
                c2609 = c2609.f8241;
                c18963 = (C18963) c2609.f8240;
            }
            m33860(c18963.f59814);
            if (c18963.f59816 && c18963.f59817 == C18963.f59811) {
                m43305(abstractC5144, this.f67359.f30711);
            }
            for (C2609 c26010 = c18963.f59814; c26010.m8249(); c26010 = c26010.f8241) {
                AbstractC5144 abstractC5145 = (AbstractC5144) c26010.f8240;
                if (abstractC5145.m14709(EnumC18550.f57578)) {
                    int i2 = ((C9378) abstractC5145).f28489.f36038;
                    c7842.m20936(i2);
                    c7844.m20945(i2);
                }
            }
            c2609 = c2609.f8241;
        }
        if (!z) {
            if (abstractC5144.m14709(EnumC18550.f57555)) {
                mo15215();
            } else {
                c7841.m20940(c7842);
                c7843.m20938(c7844);
                c7843.m20940(c7843);
            }
        }
        if (abstractC5144.m14709(EnumC18550.f57555)) {
            m43306(abstractC5144, c18837);
        } else {
            m43303(abstractC5144, c18837);
        }
        this.f67365 = i;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1396(C10789 c10789) {
        C18837 c18837 = new C18837();
        C7841 c7841 = this.f67352;
        C7841 c7842 = new C7841(c7841);
        C18837 c18838 = this.f59097;
        this.f59097 = new C18837();
        C7841 c7843 = this.f67361;
        C7841 c7844 = new C7841(c7843);
        C7841 c7845 = this.f67351;
        c7841.m20940(c7845);
        for (AbstractC5144 abstractC5144 : c10789.f32446) {
            if (abstractC5144 instanceof C9378) {
                C9378 c9378 = (C9378) abstractC5144;
                mo1392(c9378);
                this.f67350.mo26382(c9378.f28489);
                c18837.m43511(c9378);
            } else {
                if (!(abstractC5144 instanceof AbstractC12612)) {
                    throw new AssertionError(c10789);
                }
                m47610((AbstractC12612) abstractC5144);
            }
        }
        super.mo10758(c10789.f32445);
        c7841.m20938(c7845);
        C7841 c7846 = new C7841(c7843);
        C7841 c7847 = new C7841(c7845);
        int i = this.f67365;
        if (!c18837.isEmpty()) {
            C10222 c10222 = this.f67359;
            if (c10222.f30708.m14055(EnumC20347.TRY)) {
                Iterator it = c18837.iterator();
                while (it.hasNext()) {
                    C9378 c9379 = (C9378) it.next();
                    if (this.f67350.mo20482(c9379.f28489)) {
                        C22364 c22364 = c10222.f30706;
                        EnumC20347 enumC20347 = EnumC20347.TRY;
                        C12048 c12048 = c9379.f28489;
                        C11076 c11076 = C14001.f42334;
                        c22364.m7286(enumC20347, c9379, new C11076("compiler", "try.resource.not.referenced", c12048));
                        this.f67350.mo26384(c9379.f28489);
                    }
                    it = it;
                    c7842 = c7842;
                    c10222 = c10222;
                    c18838 = c18838;
                }
            }
        }
        C7841 c7848 = c7842;
        C18837 c18839 = c18838;
        C7841 c7849 = new C7841(c7844);
        C7841 c78410 = new C7841(c7841);
        for (C2609 c2609 = c10789.f32449; c2609.m8249(); c2609 = c2609.f8241) {
            C9378 c93710 = ((C0617) c2609.f8240).f2373;
            c7843.m20940(c7849);
            c7845.m20940(c78410);
            super.mo10758((AbstractC5144) c93710);
            m47609(c93710);
            super.mo10758(((C0617) c2609.f8240).f2372);
            c7846.m20938(c7843);
            c7847.m20938(c7845);
            this.f67365 = i;
        }
        if (c10789.f32448 != null) {
            c7843.m20940(c7844);
            c7845.m20940(c7841);
            C18837 c188310 = this.f59097;
            this.f59097 = c18839;
            super.mo10758(c10789.f32448);
            if (c10789.f32447) {
                c7845.m20938(c7847);
                while (c188310.m43518()) {
                    C3872 c3872 = (C3872) c188310.m43516();
                    if (c3872 instanceof C6694) {
                        C6694 c6694 = (C6694) c3872;
                        c6694.f20802.m20948(c7843);
                        c6694.f20803.m20938(c7845);
                    }
                    this.f59097.m43511(c3872);
                }
                c7843.m20948(c7846);
            }
        } else {
            c7843.m20940(c7846);
            c7845.m20940(c7847);
            C18837 c188311 = this.f59097;
            this.f59097 = c18839;
            while (c188311.m43518()) {
                this.f59097.m43511((C3872) c188311.m43516());
            }
        }
        c7841.m20938(c7848);
        c7841.m20938(c7845);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        m47614(c8379.f25701);
        C7841 c7841 = this.f67358;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67363;
        C7841 c7844 = new C7841(c7843);
        C7841 c7845 = this.f67361;
        C7841 c7846 = this.f67366;
        c7845.m20940(c7846);
        C7841 c7847 = this.f67351;
        C7841 c7848 = this.f67364;
        c7847.m20940(c7848);
        AbstractC4308 abstractC4308 = c8379.f25699.f16086;
        EnumC9454 enumC9454 = EnumC9454.BOOLEAN;
        if (abstractC4308.m12913(enumC9454) && c8379.f25700.f16086.m12913(enumC9454)) {
            m47614(c8379.f25699);
            C7841 c7849 = new C7841(c7846);
            C7841 c78410 = new C7841(c7841);
            C7841 c78411 = new C7841(c7848);
            C7841 c78412 = new C7841(c7843);
            c7845.m20940(c7842);
            c7847.m20940(c7844);
            m47614(c8379.f25700);
            c7846.m20938(c7849);
            c7841.m20938(c78410);
            c7848.m20938(c78411);
            c7843.m20938(c78412);
            return;
        }
        m47610(c8379.f25699);
        C7841 c78413 = new C7841(c7845);
        C7841 c78414 = new C7841(c7847);
        c7845.m20940(c7842);
        c7847.m20940(c7844);
        m47610(c8379.f25700);
        c7845.m20938(c78413);
        c7847.m20938(c78414);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1368(C1470 c1470) {
        m47614(c1470.f5225);
        C7841 c7841 = new C7841(this.f67358);
        C7841 c7842 = new C7841(this.f67363);
        C7841 c7843 = this.f67366;
        C7841 c7844 = this.f67361;
        c7844.m20940(c7843);
        C7841 c7845 = this.f67364;
        C7841 c7846 = this.f67351;
        c7846.m20940(c7845);
        super.mo10758(c1470.f5226);
        if (c1470.f5227 != null) {
            C7841 c7847 = new C7841(c7844);
            C7841 c7848 = new C7841(c7846);
            c7844.m20940(c7841);
            c7846.m20940(c7842);
            super.mo10758(c1470.f5227);
            c7844.m20938(c7847);
            c7846.m20938(c7848);
            return;
        }
        c7844.m20938(c7841);
        c7846.m20938(c7842);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1377(C4146 c4146) {
        m43304(new C6694(c4146, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1371(C2322 c2322) {
        C13464 c13464 = (C13464) c2322.f7455;
        if (c13464 != null && c13464.f16086.m12913(EnumC9454.BOOLEAN)) {
            m47614(c2322.f7456);
            C23627 c23627 = new C23627(this, c2322, new C7841(this.f67366), new C7841(this.f67358), new C7841(this.f67364), new C7841(this.f67363));
            m47613();
            m43304(c23627);
            return;
        }
        m47610(c2322.f7456);
        m43304(new C6694(c2322, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1406(C15433 c15433) {
        m43304(new C6694(c15433, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        m47610(c9938.f30017);
        m43304(new C6694(c9938, this.f67361, this.f67351));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1369(C1616 c1616) {
        m47610(c1616.f5680);
        mo15215();
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
        m47610(c15580.f48011);
        m47608(c15580.f48012);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        m47610(c19110.f60199);
        m47608(c19110.f60197);
        super.mo10758(c19110.f60195);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1217(C14169 c14169) {
        C7841 c7841 = this.f67351;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67361;
        C7841 c7844 = new C7841(c7843);
        int i = this.f67356;
        int i2 = this.f67365;
        C18837 c18837 = this.f59097;
        try {
            this.f67356 = i2;
            this.f59097 = new C18837();
            for (C2609 c2609 = c14169.f42775; c2609.m8249(); c2609 = c2609.f8241) {
                C9378 c9378 = (C9378) c2609.f8240;
                super.mo10758((AbstractC5144) c9378);
                c7843.m20945(c9378.f28489.f36038);
                c7841.m20936(c9378.f28489.f36038);
            }
            if (c14169.m33819() != EnumC13706.EXPRESSION) {
                super.mo10758(c14169.f42776);
            } else {
                m47610(c14169.f42776);
            }
        } finally {
            this.f67356 = i;
            c7841.m20940(c7842);
            c7843.m20940(c7844);
            this.f59097 = c18837;
            this.f67365 = i2;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1417(C18404 c18404) {
        m47608(c18404.f57140);
        m47608(c18404.f57139);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1383(C6968 c6968) {
        C7841 c7841 = this.f67361;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67351;
        C7841 c7844 = new C7841(c7843);
        m47614(c6968.f21475);
        c7844.m20938(this.f67364);
        if (c6968.f21476 != null) {
            c7841.m20940(this.f67358);
            c7843.m20940(this.f67363);
            m47610(c6968.f21476);
        }
        c7841.m20940(c7842);
        c7843.m20940(c7844);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1423(C21080 c21080) {
        if (!C7260.m19468(c21080.f67987)) {
            m47610(c21080.f67987);
        }
        m47610(c21080.f67988);
        m47615(c21080.f67987);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        m47610(c9791.f29619);
        m47610(c9791.f29618);
        m47615(c9791.f29619);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        int i = C10928.f32841[c6555.mo989().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                m47610(c6555.f20226);
                m47615(c6555.f20226);
                return;
            } else {
                m47610(c6555.f20226);
                return;
            }
        }
        m47614(c6555.f20226);
        C7841 c7841 = this.f67358;
        C7841 c7842 = new C7841(c7841);
        C7841 c7843 = this.f67366;
        c7841.m20940(c7843);
        c7843.m20940(c7842);
        C7841 c7844 = this.f67363;
        c7842.m20940(c7844);
        C7841 c7845 = this.f67364;
        c7844.m20940(c7845);
        c7845.m20940(c7842);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        int i = C10928.f32841[c9085.mo989().ordinal()];
        C7841 c7841 = this.f67351;
        C7841 c7842 = this.f67361;
        C7841 c7843 = this.f67363;
        C7841 c7844 = this.f67358;
        C7841 c7845 = this.f67364;
        C7841 c7846 = this.f67366;
        if (i == 6) {
            m47614(c9085.f27533);
            C7841 c7847 = new C7841(c7844);
            C7841 c7848 = new C7841(c7843);
            c7842.m20940(c7846);
            c7841.m20940(c7845);
            m47614(c9085.f27532);
            c7844.m20938(c7847);
            c7843.m20938(c7848);
            return;
        }
        if (i == 7) {
            m47614(c9085.f27533);
            C7841 c7849 = new C7841(c7846);
            C7841 c78410 = new C7841(c7845);
            c7842.m20940(c7844);
            c7841.m20940(c7843);
            m47614(c9085.f27532);
            c7846.m20938(c7849);
            c7845.m20938(c78410);
            return;
        }
        m47610(c9085.f27533);
        m47610(c9085.f27532);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        AbstractC5698 abstractC5698 = c7673.f23697;
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            m47603((InterfaceC3109) c7673, (C12048) abstractC5698);
            this.f67350.mo26384(c7673.f23697);
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1416(C18257 c18257) {
        c18257.f56779.mo988(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[LOOP:1: B:32:0x00c0->B:34:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[EDGE_INSN: B:44:0x00ca->B:35:0x00ca BREAK  A[LOOP:1: B:32:0x00c0->B:34:0x00c5], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47602(C1755 c1755, AbstractC5144 abstractC5144, C17013 c17013) {
        char c;
        char c2;
        int i;
        C9378[] c9378Arr;
        C7841 c7841 = this.f67363;
        C7841 c7842 = this.f67364;
        C7841 c7843 = this.f67358;
        C7841 c7844 = this.f67366;
        C7841 c7845 = this.f67352;
        C7841 c7846 = this.f67351;
        C7841 c7847 = this.f67361;
        C10222 c10222 = this.f67359;
        try {
            abstractC5144.getClass();
            this.f67355 = C7260.m19455(abstractC5144);
            if (this.f67353 == null) {
                this.f67353 = new C9378[32];
                c = 3;
                c2 = 2;
            } else {
                int i2 = 0;
                c = 3;
                while (true) {
                    try {
                        C9378[] c9378Arr2 = this.f67353;
                        c2 = 2;
                        try {
                            if (i2 >= c9378Arr2.length) {
                                break;
                            }
                            c9378Arr2[i2] = null;
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            this.f67355 = -1;
                            C7841[] c7841Arr = new C7841[7];
                            c7841Arr[0] = c7847;
                            c7841Arr[1] = c7846;
                            c7841Arr[c2] = c7845;
                            c7841Arr[c] = c7844;
                            c7841Arr[4] = c7843;
                            c7841Arr[5] = c7842;
                            c7841Arr[6] = c7841;
                            m47600(c7841Arr);
                            if (this.f67353 != null) {
                                i = 0;
                                while (true) {
                                    c9378Arr = this.f67353;
                                    if (i < c9378Arr.length) {
                                        break;
                                    }
                                    c9378Arr[i] = null;
                                    i++;
                                }
                            }
                            this.f67360 = 0;
                            this.f67365 = 0;
                            c10222.f30711 = null;
                            this.f59097 = null;
                            this.f67357 = null;
                            this.f67350 = null;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = 2;
                        this.f67355 = -1;
                        C7841[] c7841Arr2 = new C7841[7];
                        c7841Arr2[0] = c7847;
                        c7841Arr2[1] = c7846;
                        c7841Arr2[c2] = c7845;
                        c7841Arr2[c] = c7844;
                        c7841Arr2[4] = c7843;
                        c7841Arr2[5] = c7842;
                        c7841Arr2[6] = c7841;
                        m47600(c7841Arr2);
                        if (this.f67353 != null) {
                            i = 0;
                            while (true) {
                                c9378Arr = this.f67353;
                                if (i < c9378Arr.length) {
                                    break;
                                    break;
                                } else {
                                    c9378Arr[i] = null;
                                    i++;
                                }
                            }
                        }
                        this.f67360 = 0;
                        this.f67365 = 0;
                        c10222.f30711 = null;
                        this.f59097 = null;
                        this.f67357 = null;
                        this.f67350 = null;
                        throw th;
                    }
                }
            }
            this.f67360 = 0;
            this.f67365 = 0;
            c10222.f30711 = c17013;
            this.f59097 = new C18837();
            this.f67357 = null;
            this.f67350 = AbstractC14016.m33607(c1755.f6079.f17186);
            super.mo10758(abstractC5144);
            this.f67355 = -1;
            C7841[] c7841Arr3 = new C7841[7];
            c7841Arr3[0] = c7847;
            c7841Arr3[1] = c7846;
            c7841Arr3[c2] = c7845;
            c7841Arr3[c] = c7844;
            c7841Arr3[4] = c7843;
            c7841Arr3[5] = c7842;
            c7841Arr3[6] = c7841;
            m47600(c7841Arr3);
            if (this.f67353 != null) {
                int i3 = 0;
                while (true) {
                    C9378[] c9378Arr3 = this.f67353;
                    if (i3 >= c9378Arr3.length) {
                        break;
                    }
                    c9378Arr3[i3] = null;
                    i3++;
                }
            }
            this.f67360 = 0;
            this.f67365 = 0;
            c10222.f30711 = null;
            this.f59097 = null;
            this.f67357 = null;
            this.f67350 = null;
        } catch (Throwable th3) {
            th = th3;
            c = 3;
        }
    }

    public C20806(C10222 c10222) {
        this.f67359 = c10222;
    }
}
