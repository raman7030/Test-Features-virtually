package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩷ۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public class C22142 extends AbstractC20130 {

    /* JADX INFO: renamed from: ֡ */
    public AbstractC15689 f70033;

    /* JADX INFO: renamed from: ۚ */
    public C11281[] f70036;

    /* JADX INFO: renamed from: ۡ */
    public int f70038;

    /* JADX INFO: renamed from: ۢ */
    public int f70039;

    /* JADX INFO: renamed from: ۧ */
    public C7650 f70040;

    /* JADX INFO: renamed from: ܺ */
    public final /* synthetic */ C12083 f70042;

    /* JADX INFO: renamed from: ܽ */
    public int f70043;

    /* JADX INFO: renamed from: ᩷ */
    public int f70048;

    /* JADX INFO: renamed from: ᩳ */
    public EnumC3365 f70045 = EnumC3365.NORMAL;

    /* JADX INFO: renamed from: ۜ */
    public boolean f70037 = false;

    /* JADX INFO: renamed from: ܿ */
    public final C9820 f70044 = new C9820(false);

    /* JADX INFO: renamed from: ۖ */
    public final C9820 f70034 = new C9820(false);

    /* JADX INFO: renamed from: ۘ */
    public final C9820 f70035 = new C9820(false);

    /* JADX INFO: renamed from: ᩻ */
    public final C9820 f70049 = new C9820(true);

    /* JADX INFO: renamed from: ܳ */
    public final C9820 f70041 = new C9820(true);

    /* JADX INFO: renamed from: ᩵ */
    public final C9820 f70047 = new C9820(true);

    /* JADX INFO: renamed from: ᩴ */
    public final C9820 f70046 = new C9820(true);

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3788(C5777 c5777) {
    }

    @Override // p067l.AbstractC20130, p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo3799(C9800 c9800) {
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3822(C17707 c17707) {
        mo12739((AbstractC7257) c17707.f52887);
        m49937(c17707.f52887);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3794(C8320 c8320) {
        mo12739(c8320.f22261);
        if (C9268.m21419(c8320.f22261)) {
            AbstractC7783 abstractC7783 = c8320.f22260;
            if (abstractC7783.f20405 == EnumC3600.f7339) {
                m49931((InterfaceC5323) c8320, (C13818) abstractC7783);
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m49938(AbstractC7257 abstractC7257) {
        if (abstractC7257 != null) {
            super.mo12739(abstractC7257);
            if (this.f70044.m22906()) {
                m49941();
            }
        }
    }

    @Override // p067l.AbstractC20130
    /* JADX INFO: renamed from: ᩳ */
    public final void mo17118() {
        boolean z = this.f70037;
        C9820 c9820 = this.f70044;
        if (!z) {
            c9820.m22902(this.f70039, this.f70048);
        } else {
            for (int i = this.f70039; i < this.f70048; i++) {
                C13818 c13818 = this.f70036[i].f31438;
                if (!m49935(c13818) || !c13818.mo17483()) {
                    c9820.m22910(i);
                }
            }
        }
        this.f70034.m22902(this.f70039, this.f70048);
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo38020(C13818 c13818) {
        if (c13818.f39051 < this.f70038) {
            return false;
        }
        EnumC3600 enumC3600 = c13818.f20407.f20405;
        return enumC3600 == EnumC3600.f7343 || enumC3600 == EnumC3600.f7339 || m49935(c13818);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49935(C13818 c13818) {
        AbstractC7783 abstractC7783 = c13818.f20407;
        if (abstractC7783.f20405 != EnumC3600.f7354 || (c13818.f20409 & 8590196752L) != 16) {
            return false;
        }
        AbstractC7783 abstractC7784 = this.f70040.f20027;
        C15828 c15828 = (C15828) abstractC7783;
        abstractC7784.getClass();
        while (abstractC7784.f20405 != EnumC3600.f7351) {
            if (abstractC7784 == c15828) {
                return true;
            }
            abstractC7784 = abstractC7784.f20407;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49939(C11281 c11281) {
        C13818 c13818 = c11281.f31438;
        C11281[] c11281Arr = (C11281[]) C8377.m19515(this.f70048, this.f70036);
        this.f70036 = c11281Arr;
        long j = c13818.f20409;
        if ((16 & j) == 0) {
            c13818.f20409 = j | 2199023255552L;
        }
        int i = this.f70048;
        c13818.f39049 = i;
        c11281Arr[i] = c11281;
        this.f70044.m22901(i);
        this.f70034.m22910(this.f70048);
        this.f70048++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49933(AbstractC7257 abstractC7257, C13818 c13818) {
        int i = c13818.f39049;
        int i2 = this.f70043;
        C12083 c12083 = this.f70042;
        if (i < i2 || !mo38020(c13818)) {
            if ((c13818.f20409 & 16) != 0) {
                C23623 c23623 = c12083.f33667;
                C14040 c14040 = C8300.f21997;
                c23623.m9352(abstractC7257, new C14040("compiler", "var.might.already.be.assigned", c13818));
                return;
            }
            return;
        }
        long j = c13818.f20409;
        long j2 = 2199023255552L & j;
        C9820 c9820 = this.f70034;
        if (j2 != 0) {
            if (!c9820.m22915(c13818.f39049)) {
                c13818.f20409 &= -2199023255553L;
            } else {
                m49940(c13818);
            }
        } else if ((16 & j) != 0) {
            if ((8589934592L & j) != 0) {
                if ((j & 549755813888L) != 0) {
                    C23623 c23624 = c12083.f33667;
                    C14040 c14041 = C8300.f21997;
                    c23624.m9352(abstractC7257, new C14040("compiler", "multicatch.parameter.may.not.be.assigned", c13818));
                } else {
                    C23623 c23625 = c12083.f33667;
                    C14040 c14042 = C8300.f21997;
                    c23625.m9352(abstractC7257, new C14040("compiler", "final.parameter.may.not.be.assigned", c13818));
                }
            } else if (!c9820.m22915(c13818.f39049)) {
                c12083.f33667.m9352(abstractC7257, c12083.f33670.m18542(this.f70045.f6650, c13818));
            } else {
                m49940(c13818);
            }
        }
        this.f70044.m22910(c13818.f39049);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m49940(C13818 c13818) {
        boolean zM22915 = this.f70044.m22915(c13818.f39049);
        C9820 c9820 = this.f70034;
        if (!zM22915) {
            c9820.m22901(c13818.f39049);
            this.f70035.m22901(c13818.f39049);
        } else {
            c9820.m22901(c13818.f39049);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m49943(AbstractC7257 abstractC7257) {
        AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC7257);
        if (abstractC7257M21437.m16617(EnumC19998.f60790) || abstractC7257M21437.m16617(EnumC19998.f60805)) {
            AbstractC7783 abstractC7783M21438 = C9268.m21438(abstractC7257M21437);
            if (abstractC7783M21438.f20405 == EnumC3600.f7339) {
                m49933(abstractC7257M21437, (C13818) abstractC7783M21438);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49931(InterfaceC5323 interfaceC5323, C13818 c13818) {
        C14040 c14040 = C8300.f21997;
        m49932(interfaceC5323, c13818, new C14040("compiler", "var.might.not.have.been.initialized", c13818));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49932(InterfaceC5323 interfaceC5323, C13818 c13818, C14040 c14040) {
        if ((c13818.f39049 >= this.f70043 || c13818.f20407.f20405 != EnumC3600.f7354) && mo38020(c13818)) {
            int i = c13818.f39049;
            C9820 c9820 = this.f70044;
            if (c9820.m22915(i) || (c13818.f20409 & 4398046511104L) != 0) {
                return;
            }
            this.f70042.f33667.m9352(interfaceC5323, c14040);
            c9820.m22910(c13818.f39049);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49928(C9820... c9820Arr) {
        for (C9820 c9820 : c9820Arr) {
            c9820.m22909();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49934(boolean z) {
        C9820 c9820 = this.f70041;
        C9820 c9821 = this.f70044;
        c9820.m22905(c9821);
        C9820 c9822 = this.f70046;
        C9820 c9823 = this.f70034;
        c9822.m22905(c9823);
        this.f70049.m22905(c9821);
        this.f70047.m22905(c9823);
        if (z) {
            m49928(c9821, c9823);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49941() {
        C9820 c9820 = this.f70049;
        C9820 c9821 = this.f70041;
        c9821.m22903(c9820);
        this.f70044.m22905(c9821);
        C9820 c9822 = this.f70047;
        C9820 c9823 = this.f70046;
        c9823.m22903(c9822);
        this.f70034.m22905(c9823);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49936(C4848 c4848) {
        if (c4848 != null) {
            while (c4848.m10293()) {
                m49938((AbstractC7257) c4848.f11034);
                c4848 = c4848.f11035;
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m49942(AbstractC7257 abstractC7257) {
        boolean zMo14806 = abstractC7257.f18925.mo14806();
        C12083 c12083 = this.f70042;
        C9820 c9820 = this.f70046;
        C9820 c9821 = this.f70041;
        C9820 c9822 = this.f70047;
        C9820 c9823 = this.f70049;
        C9820 c9824 = this.f70034;
        C9820 c9825 = this.f70044;
        if (zMo14806) {
            if (c9825.m22906()) {
                m49941();
            }
            c9823.m22905(c9825);
            c9823.m22902(this.f70043, this.f70048);
            c9822.m22905(c9824);
            c9822.m22902(this.f70043, this.f70048);
            c9821.m22905(c9825);
            c9820.m22905(c9824);
        } else if (!abstractC7257.f18925.mo14799()) {
            super.mo12739(abstractC7257);
            if (!c9825.m22906()) {
                m49934(abstractC7257.f18925 != c12083.f33665.f69201);
            }
        } else {
            if (c9825.m22906()) {
                m49941();
            }
            c9821.m22905(c9825);
            c9821.m22902(this.f70043, this.f70048);
            c9820.m22905(c9824);
            c9820.m22902(this.f70043, this.f70048);
            c9823.m22905(c9825);
            c9822.m22905(c9824);
        }
        if (abstractC7257.f18925 != c12083.f33665.f69201) {
            m49928(c9825, c9824);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3617(C7650 c7650) {
        if (c7650.f20027 == null) {
            return;
        }
        C12083 c12083 = this.f70042;
        C6953 c6953 = c12083.f33669;
        c12083.f33669 = c12083.f33669.m15933(c7650.f20027);
        try {
            if (c7650.f20027 != null) {
                C7650 c7651 = this.f70040;
                int i = this.f70043;
                int i2 = this.f70048;
                C20271 c20271 = this.f62320;
                this.f62320 = new C20271();
                if (c7650.f20021 != c12083.f33663.f21725) {
                    this.f70043 = this.f70048;
                }
                this.f70040 = c7650;
                try {
                    for (C4848 c4848 = c7650.f20020; c4848.m10293(); c4848 = c4848.f11035) {
                        if (((AbstractC7257) c4848.f11034).m16617(EnumC19998.f60802)) {
                            C11281 c11281 = (C11281) c4848.f11034;
                            if ((8 & c11281.f31435.f9954) != 0 && mo38020(c11281.f31438)) {
                                m49939(c11281);
                            }
                        }
                    }
                    for (C4848 c4849 = c7650.f20020; c4849.m10293(); c4849 = c4849.f11035) {
                        if (!((AbstractC7257) c4849.f11034).m16617(EnumC19998.f60735) && (C9268.m21439((AbstractC7257) c4849.f11034) & 8) != 0) {
                            super.mo12739((AbstractC7257) c4849.f11034);
                            m49929(false);
                        }
                    }
                    for (C4848 c48410 = c7650.f20020; c48410.m10293(); c48410 = c48410.f11035) {
                        if (((AbstractC7257) c48410.f11034).m16617(EnumC19998.f60802)) {
                            C11281 c11282 = (C11281) c48410.f11034;
                            if ((c11282.f31435.f9954 & 8) == 0 && mo38020(c11282.f31438)) {
                                m49939(c11282);
                            }
                        }
                    }
                    for (C4848 c48411 = c7650.f20020; c48411.m10293(); c48411 = c48411.f11035) {
                        if (!((AbstractC7257) c48411.f11034).m16617(EnumC19998.f60735) && (C9268.m21439((AbstractC7257) c48411.f11034) & 8) == 0) {
                            super.mo12739((AbstractC7257) c48411.f11034);
                            m49929(false);
                        }
                    }
                    for (C4848 c48412 = c7650.f20020; c48412.m10293(); c48412 = c48412.f11035) {
                        if (((AbstractC7257) c48412.f11034).m16617(EnumC19998.f60735)) {
                            super.mo12739((AbstractC7257) c48412.f11034);
                        }
                    }
                    this.f62320 = c20271;
                    this.f70048 = i2;
                    this.f70043 = i;
                    this.f70040 = c7651;
                    c12083.f33669 = c6953;
                    return;
                } catch (Throwable th) {
                    this.f62320 = c20271;
                    this.f70048 = i2;
                    this.f70043 = i;
                    this.f70040 = c7651;
                    throw th;
                }
            }
            c12083.f33669 = c6953;
        } catch (Throwable th2) {
            c12083.f33669 = c6953;
            throw th2;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3801(C10471 c10471) throws Throwable {
        C6953 c6953;
        C12083 c12083;
        boolean z;
        C12083 c12084;
        C6953 c6954;
        boolean z2;
        C9820 c9820 = this.f70034;
        C9820 c9821 = this.f70044;
        if (c10471.f28958 != null && (c10471.f28960.f20409 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0) {
            C12083 c12085 = this.f70042;
            C6953 c6955 = c12085.f33669;
            c12085.f33669 = c12085.f33669.m15933(c10471.f28960);
            try {
                if (c10471.f28958 == null) {
                    c12085.f33669 = c6955;
                    return;
                }
                if ((c10471.f28960.f20409 & 562949953425408L) == ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    c12085.f33669 = c6955;
                    return;
                }
                C9820 c9822 = new C9820(c9821);
                C9820 c9823 = new C9820(c9820);
                int i = this.f70048;
                int i2 = this.f70043;
                int i3 = this.f70039;
                C1446.m31704(this.f62320.isEmpty());
                boolean z3 = this.f70037;
                try {
                    boolean zM21435 = C9268.m21435(c10471);
                    this.f70037 = zM21435;
                    if (!zM21435) {
                        this.f70043 = this.f70048;
                    }
                    for (C4848 c4848 = c10471.f28963; c4848.m10293(); c4848 = c4848.f11035) {
                        C11281 c11281 = (C11281) c4848.f11034;
                        super.mo12739((AbstractC7257) c11281);
                        C1446.m31703("Method parameter without PARAMETER flag", (c11281.f31438.f20409 & 8589934592L) != 0);
                        m49937(c11281);
                    }
                    super.mo12739(c10471.f28958);
                    long j = c10471.f28960.f20409;
                    boolean z4 = (j & 2251799813685248L) != 0;
                    if (this.f70037) {
                        boolean z5 = (j & 68719476736L) != 0;
                        try {
                            int i4 = this.f70043;
                            while (i4 < this.f70048) {
                                C11281 c11282 = this.f70036[i4];
                                C13818 c13818 = c11282.f31438;
                                c12084 = c12085;
                                try {
                                    c6954 = c6955;
                                    try {
                                        if (c13818.f20407 == this.f70040.f20027) {
                                            if (!z5 || z4) {
                                                z5 = z5;
                                                z2 = z3;
                                                if (!z4) {
                                                    m49931(C9268.m21430(c10471.f28958), c13818);
                                                } else if (!c13818.m17990().m35942() || (c13818.f20409 & 2305843009230471186L) == 0 || c13818.mo17483() || c13818.f20407.f20405 != EnumC3600.f7354) {
                                                    m49931(C9268.m21405(c13818, c11282, false), c13818);
                                                } else if (!c9821.m22915(c13818.f39049) && c9820.m22915(c13818.f39049) && c10471.f28965) {
                                                    c13818.f20409 |= 2251799813685248L;
                                                } else {
                                                    m49931(C9268.m21430(c10471.f28958), c13818);
                                                }
                                            } else {
                                                InterfaceC5323 interfaceC5323M21405 = C9268.m21405(c13818, c11282, false);
                                                try {
                                                    C14040 c14040 = C8300.f21997;
                                                    z2 = z3;
                                                    try {
                                                        m49932(interfaceC5323M21405, c13818, new C14040("compiler", "var.not.initialized.in.default.constructor", c13818));
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        c12083 = c12084;
                                                        c6953 = c6954;
                                                        z = z2;
                                                        try {
                                                            c9821.m22905(c9822);
                                                            c9820.m22905(c9823);
                                                            this.f70048 = i;
                                                            this.f70043 = i2;
                                                            this.f70039 = i3;
                                                            this.f70037 = z;
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    z2 = z3;
                                                    c12083 = c12084;
                                                    c6953 = c6954;
                                                    z = z2;
                                                    c9821.m22905(c9822);
                                                    c9820.m22905(c9823);
                                                    this.f70048 = i;
                                                    this.f70043 = i2;
                                                    this.f70039 = i3;
                                                    this.f70037 = z;
                                                    throw th;
                                                }
                                            }
                                            i4++;
                                            c12085 = c12084;
                                            c6955 = c6954;
                                            z5 = z5;
                                            z3 = z2;
                                        } else {
                                            z2 = z3;
                                        }
                                        i4++;
                                        c12085 = c12084;
                                        c6955 = c6954;
                                        z5 = z5;
                                        z3 = z2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    c6954 = c6955;
                                    z2 = z3;
                                    c12083 = c12084;
                                    c6953 = c6954;
                                    z = z2;
                                    c9821.m22905(c9822);
                                    c9820.m22905(c9823);
                                    this.f70048 = i;
                                    this.f70043 = i2;
                                    this.f70039 = i3;
                                    this.f70037 = z;
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c12084 = c12085;
                        }
                    }
                    c12084 = c12085;
                    c6954 = c6955;
                    z2 = z3;
                    m49929(true);
                    try {
                        c9821.m22905(c9822);
                        c9820.m22905(c9823);
                        this.f70048 = i;
                        this.f70043 = i2;
                        this.f70039 = i3;
                        this.f70037 = z2;
                        c12084.f33669 = c6954;
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        c12083 = c12084;
                        c6953 = c6954;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c6953 = c6955;
                    c12083 = c12085;
                    z = z3;
                }
            } catch (Throwable th9) {
                th = th9;
                c6953 = c6955;
                c12083 = c12085;
            }
            c12083.f33669 = c6953;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036  */
    /* JADX INFO: renamed from: ۧ */
    private void m49929(boolean z) {
        boolean z2;
        C4848 c4848M45783 = this.f62320.m45783();
        this.f62320 = new C20271();
        while (c4848M45783.m10293()) {
            C6048 c6048 = (C6048) c4848M45783.f11034;
            c4848M45783 = c4848M45783.f11035;
            if (z && c6048.f15194.m16617(EnumC19998.f60754)) {
                z2 = true;
            } else {
                C23623 c23623 = this.f70042.f33667;
                AbstractC7257 abstractC7257 = c6048.f15194;
                abstractC7257.getClass();
                if (c23623.m52456(abstractC7257)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            C1446.m31701(c6048.f15194, z2);
            if (z && this.f70037) {
                C1446.m31704(c6048 instanceof C8730);
                this.f70044.m22905(((C8730) c6048).f23677);
                for (int i = this.f70043; i < this.f70048; i++) {
                    AbstractC7257 abstractC7258 = c6048.f15194;
                    abstractC7258.getClass();
                    m49931((InterfaceC5323) abstractC7258, this.f70036[i].f31438);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m49937(C11281 c11281) {
        this.f70044.m22910(c11281.f31438.f39049);
        this.f70034.m22901(c11281.f31438.f39049);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3805(C11281 c11281) {
        EnumC3600 enumC3600;
        C12083 c12083 = this.f70042;
        C6953 c6953 = c12083.f33669;
        c12083.f33669 = c12083.f33669.m15933(c11281.f31438);
        try {
            boolean zMo38020 = mo38020(c11281.f31438);
            if (zMo38020 && ((enumC3600 = c11281.f31438.f20407.f20405) == EnumC3600.f7343 || enumC3600 == EnumC3600.f7339)) {
                m49939(c11281);
            }
            AbstractC14355 abstractC14355 = c11281.f31436;
            if (abstractC14355 != null) {
                m49938(abstractC14355);
                if (zMo38020) {
                    m49933((AbstractC7257) c11281, c11281.f31438);
                }
            }
        } finally {
            c12083.f33669 = c6953;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3785(C4968 c4968) {
        int i = this.f70048;
        m35992(c4968.f11316);
        this.f70048 = i;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3834(C21732 c21732) {
        C9820 c9820;
        C9820 c9821;
        C20271 c20271 = this.f62320;
        EnumC3365 enumC3365 = this.f70045;
        this.f70045 = EnumC3365.NORMAL;
        C9820 c9822 = new C9820(true);
        C9820 c9823 = new C9820(true);
        this.f62320 = new C20271();
        C12083 c12083 = this.f70042;
        int i = c12083.f33667.f75180;
        while (true) {
            c9820 = this.f70034;
            C9820 c9824 = new C9820(c9820);
            c9824.m22904(this.f70048);
            super.mo12739(c21732.f68446);
            m45573(c21732);
            m49942(c21732.f68447);
            if (!this.f70045.m5888()) {
                c9822.m22905(this.f70041);
                c9823.m22905(this.f70046);
            }
            int i2 = c12083.f33667.f75180;
            c9821 = this.f70044;
            if (i2 != i || this.f70045.m5888()) {
                break;
            }
            C9820 c9825 = new C9820(c9824);
            C9820 c9826 = this.f70047;
            c9825.m22911(c9826);
            if (c9825.m22912(this.f70043) == -1) {
                break;
            }
            c9821.m22905(this.f70049);
            c9824.m22903(c9826);
            c9820.m22905(c9824);
            this.f70045 = EnumC3365.SPECULATIVE_LOOP;
        }
        this.f70045 = enumC3365;
        c9821.m22905(c9822);
        c9820.m22905(c9823);
        m45569(c21732, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3802(C10610 c10610) {
        C9820 c9820;
        C20271 c20271 = this.f62320;
        EnumC3365 enumC3365 = this.f70045;
        this.f70045 = EnumC3365.NORMAL;
        C9820 c9821 = new C9820(true);
        C9820 c9822 = new C9820(true);
        this.f62320 = new C20271();
        C12083 c12083 = this.f70042;
        int i = c12083.f33667.f75180;
        C9820 c9823 = this.f70034;
        C9820 c9824 = new C9820(c9823);
        c9824.m22904(this.f70048);
        while (true) {
            m49942(c10610.f29370);
            if (!this.f70045.m5888()) {
                c9821.m22905(this.f70041);
                c9822.m22905(this.f70046);
            }
            C9820 c9825 = this.f70049;
            c9820 = this.f70044;
            c9820.m22905(c9825);
            c9823.m22905(this.f70047);
            super.mo12739(c10610.f29369);
            m45573(c10610);
            if (c12083.f33667.f75180 != i || this.f70045.m5888()) {
                break;
            }
            C9820 c9826 = new C9820(c9824);
            c9826.m22911(c9823);
            if (c9826.m22912(this.f70043) == -1) {
                break;
            }
            c9824.m22903(c9823);
            c9823.m22905(c9824);
            this.f70045 = EnumC3365.SPECULATIVE_LOOP;
        }
        this.f70045 = enumC3365;
        c9820.m22905(c9821);
        c9823.m22905(c9822);
        m45569(c10610, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3810(C13685 c13685) {
        C9820 c9820;
        C9820 c9821;
        C20271 c20271 = this.f62320;
        EnumC3365 enumC3365 = this.f70045;
        this.f70045 = EnumC3365.NORMAL;
        int i = this.f70048;
        m35992(c13685.f38597);
        C9820 c9822 = new C9820(true);
        C9820 c9823 = new C9820(true);
        this.f62320 = new C20271();
        C12083 c12083 = this.f70042;
        int i2 = c12083.f33667.f75180;
        while (true) {
            c9820 = this.f70034;
            C9820 c9824 = new C9820(c9820);
            c9824.m22904(this.f70048);
            AbstractC14355 abstractC14355 = c13685.f38598;
            c9821 = this.f70044;
            if (abstractC14355 != null) {
                m49942(abstractC14355);
                if (!this.f70045.m5888()) {
                    c9822.m22905(this.f70041);
                    c9823.m22905(this.f70046);
                }
                c9821.m22905(this.f70049);
                c9820.m22905(this.f70047);
            } else if (!this.f70045.m5888()) {
                c9822.m22905(c9821);
                c9822.m22902(this.f70043, this.f70048);
                c9823.m22905(c9820);
                c9823.m22902(this.f70043, this.f70048);
            }
            super.mo12739(c13685.f38595);
            m45573(c13685);
            m35992(c13685.f38596);
            if (c12083.f33667.f75180 != i2 || this.f70045.m5888()) {
                break;
            }
            C9820 c9825 = new C9820(c9824);
            c9825.m22911(c9820);
            if (c9825.m22912(this.f70043) == -1) {
                break;
            }
            c9824.m22903(c9820);
            c9820.m22905(c9824);
            this.f70045 = EnumC3365.SPECULATIVE_LOOP;
        }
        this.f70045 = enumC3365;
        c9821.m22905(c9822);
        c9820.m22905(c9823);
        m45569(c13685, c20271);
        this.f70048 = i;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3791(C6979 c6979) {
        mo3805(c6979.f18157);
        C20271 c20271 = this.f62320;
        EnumC3365 enumC3365 = this.f70045;
        this.f70045 = EnumC3365.NORMAL;
        int i = this.f70048;
        super.mo12739(c6979.f18158);
        C9820 c9820 = this.f70044;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70034;
        C9820 c9823 = new C9820(c9822);
        m49933((AbstractC7257) c6979, c6979.f18157.f31438);
        this.f62320 = new C20271();
        C12083 c12083 = this.f70042;
        int i2 = c12083.f33667.f75180;
        while (true) {
            C9820 c9824 = new C9820(c9822);
            c9824.m22904(this.f70048);
            super.mo12739(c6979.f18156);
            m45573(c6979);
            if (c12083.f33667.f75180 != i2 || this.f70045.m5888()) {
                break;
            }
            C9820 c9825 = new C9820(c9824);
            c9825.m22911(c9822);
            if (c9825.m22912(this.f70043) == -1) {
                break;
            }
            c9824.m22903(c9822);
            c9822.m22905(c9824);
            this.f70045 = EnumC3365.SPECULATIVE_LOOP;
        }
        this.f70045 = enumC3365;
        c9820.m22905(c9821);
        c9823.m22903(c9822);
        c9822.m22905(c9823);
        m45569(c6979, c20271);
        this.f70048 = i;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3827(C19188 c19188) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        super.mo12739(c19188.f57351);
        m45569(c19188, c20271);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3839(C23882 c23882) {
        m49927(c23882, c23882.f75829, c23882.f75828, c23882.f75831);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3814(C15164 c15164) {
        m49927(c15164, c15164.f43267, c15164.f43269, c15164.f43266);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49927(AbstractC7257 abstractC7257, AbstractC14355 abstractC14355, C4848 c4848, boolean z) {
        C20271 c20271 = this.f62320;
        this.f62320 = new C20271();
        int i = this.f70048;
        m49938(abstractC14355);
        C9820 c9820 = this.f70044;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70034;
        C9820 c9823 = new C9820(c9822);
        while (c4848.m10293()) {
            c9820.m22905(c9821);
            c9822.m22903(c9823);
            c9822.m22905(c9822);
            C20391 c20391 = (C20391) c4848.f11034;
            Iterator it = c20391.f63044.iterator();
            while (it.hasNext()) {
                super.mo12739((AbstractC21062) it.next());
                if (c9820.m22906()) {
                    c9820.m22905(this.f70049);
                    c9822.m22905(this.f70047);
                }
            }
            if (((C20391) c4848.f11034).f63043.isEmpty() && c4848.f11035.m10293() && ((C20391) c4848.f11035.f11034).f63044.m10289() == 1 && ((AbstractC21062) ((C20391) c4848.f11035.f11034).f63044.f11034).mo32948() && C9268.m21395((AbstractC7257) ((C20391) c4848.f11035.f11034).f63044.f11034)) {
                c4848 = c4848.f11035;
                c20391 = (C20391) c4848.f11034;
            }
            m35992(c20391.f63043);
            if (c20391.f63045 && c20391.f63046 == C20391.f63040) {
                m45571(abstractC7257, this.f70042.f33672);
            }
            for (C4848 c4849 = c20391.f63043; c4849.m10293(); c4849 = c4849.f11035) {
                AbstractC7257 abstractC7258 = (AbstractC7257) c4849.f11034;
                if (abstractC7258.m16617(EnumC19998.f60802)) {
                    int i2 = ((C11281) abstractC7258).f31438.f39049;
                    c9821.m22901(i2);
                    c9823.m22910(i2);
                }
            }
            c4848 = c4848.f11035;
        }
        if (!z) {
            if (abstractC7257.m16617(EnumC19998.f60779)) {
                mo17118();
            } else {
                c9820.m22905(c9821);
                c9822.m22903(c9823);
                c9822.m22905(c9822);
            }
        }
        if (abstractC7257.m16617(EnumC19998.f60779)) {
            m45572(abstractC7257, c20271);
        } else {
            m45569(abstractC7257, c20271);
        }
        this.f70048 = i;
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3809(C12622 c12622) {
        C20271 c20271 = new C20271();
        C9820 c9820 = this.f70035;
        C9820 c9821 = new C9820(c9820);
        C20271 c20272 = this.f62320;
        this.f62320 = new C20271();
        C9820 c9822 = this.f70044;
        C9820 c9823 = new C9820(c9822);
        C9820 c9824 = this.f70034;
        c9820.m22905(c9824);
        for (AbstractC7257 abstractC7257 : c12622.f35422) {
            if (abstractC7257 instanceof C11281) {
                C11281 c11281 = (C11281) abstractC7257;
                mo3805(c11281);
                this.f70033.mo28415(c11281.f31438);
                c20271.m45777(c11281);
            } else {
                if (!(abstractC7257 instanceof AbstractC14355)) {
                    throw new AssertionError(c12622);
                }
                m49938((AbstractC14355) abstractC7257);
            }
        }
        super.mo12739(c12622.f35421);
        c9820.m22903(c9824);
        C9820 c9825 = new C9820(c9822);
        C9820 c9826 = new C9820(c9824);
        int i = this.f70048;
        if (!c20271.isEmpty()) {
            C12083 c12083 = this.f70042;
            if (c12083.f33669.m15935(EnumC21706.TRY)) {
                Iterator it = c20271.iterator();
                while (it.hasNext()) {
                    C11281 c11282 = (C11281) it.next();
                    if (this.f70033.mo22462(c11282.f31438)) {
                        C23623 c23623 = c12083.f33667;
                        EnumC21706 enumC21706 = EnumC21706.TRY;
                        C13818 c13818 = c11282.f31438;
                        C12895 c12895 = C15675.f45417;
                        c23623.m9365(enumC21706, c11282, new C12895("compiler", "try.resource.not.referenced", c13818));
                        this.f70033.mo28417(c11282.f31438);
                    }
                    it = it;
                    c9821 = c9821;
                    c12083 = c12083;
                    c20272 = c20272;
                }
            }
        }
        C9820 c9827 = c9821;
        C20271 c20273 = c20272;
        C9820 c9828 = new C9820(c9823);
        C9820 c9829 = new C9820(c9820);
        for (C4848 c4848 = c12622.f35425; c4848.m10293(); c4848 = c4848.f11035) {
            C11281 c11283 = ((C2955) c4848.f11034).f5147;
            c9822.m22905(c9828);
            c9824.m22905(c9829);
            super.mo12739((AbstractC7257) c11283);
            m49937(c11283);
            super.mo12739(((C2955) c4848.f11034).f5146);
            c9825.m22903(c9822);
            c9826.m22903(c9824);
            this.f70048 = i;
        }
        if (c12622.f35424 != null) {
            c9822.m22905(c9823);
            c9824.m22905(c9820);
            C20271 c20274 = this.f62320;
            this.f62320 = c20273;
            super.mo12739(c12622.f35424);
            if (c12622.f35423) {
                c9824.m22903(c9826);
                while (c20274.m45784()) {
                    C6048 c6048 = (C6048) c20274.m45782();
                    if (c6048 instanceof C8730) {
                        C8730 c8730 = (C8730) c6048;
                        c8730.f23677.m22913(c9822);
                        c8730.f23678.m22903(c9824);
                    }
                    this.f62320.m45777(c6048);
                }
                c9822.m22913(c9825);
            }
        } else {
            c9822.m22905(c9825);
            c9824.m22905(c9826);
            C20271 c20275 = this.f62320;
            this.f62320 = c20273;
            while (c20275.m45784()) {
                this.f62320.m45777((C6048) c20275.m45782());
            }
        }
        c9820.m22903(c9827);
        c9820.m22903(c9824);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3800(C10332 c10332) {
        m49942(c10332.f28614);
        C9820 c9820 = this.f70041;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70046;
        C9820 c9823 = new C9820(c9822);
        C9820 c9824 = this.f70044;
        C9820 c9825 = this.f70049;
        c9824.m22905(c9825);
        C9820 c9826 = this.f70034;
        C9820 c9827 = this.f70047;
        c9826.m22905(c9827);
        AbstractC6462 abstractC6462 = c10332.f28612.f18925;
        EnumC11353 enumC11353 = EnumC11353.BOOLEAN;
        if (abstractC6462.m14777(enumC11353) && c10332.f28613.f18925.m14777(enumC11353)) {
            m49942(c10332.f28612);
            C9820 c9828 = new C9820(c9825);
            C9820 c9829 = new C9820(c9820);
            C9820 c98210 = new C9820(c9827);
            C9820 c98211 = new C9820(c9822);
            c9824.m22905(c9821);
            c9826.m22905(c9823);
            m49942(c10332.f28613);
            c9825.m22903(c9828);
            c9820.m22903(c9829);
            c9827.m22903(c98210);
            c9822.m22903(c98211);
            return;
        }
        m49938(c10332.f28612);
        C9820 c98212 = new C9820(c9824);
        C9820 c98213 = new C9820(c9826);
        c9824.m22905(c9821);
        c9826.m22905(c9823);
        m49938(c10332.f28613);
        c9824.m22903(c98212);
        c9826.m22903(c98213);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3781(C3765 c3765) {
        m49942(c3765.f7998);
        C9820 c9820 = new C9820(this.f70041);
        C9820 c9821 = new C9820(this.f70046);
        C9820 c9822 = this.f70049;
        C9820 c9823 = this.f70044;
        c9823.m22905(c9822);
        C9820 c9824 = this.f70047;
        C9820 c9825 = this.f70034;
        c9825.m22905(c9824);
        super.mo12739(c3765.f7999);
        if (c3765.f8000 != null) {
            C9820 c9826 = new C9820(c9823);
            C9820 c9827 = new C9820(c9825);
            c9823.m22905(c9820);
            c9825.m22905(c9821);
            super.mo12739(c3765.f8000);
            c9823.m22903(c9826);
            c9825.m22903(c9827);
            return;
        }
        c9823.m22903(c9820);
        c9825.m22903(c9821);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3790(C6309 c6309) {
        m45570(new C8730(c6309, this.f70044, this.f70034));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3784(C4575 c4575) {
        C15164 c15164 = (C15164) c4575.f10247;
        if (c15164 != null && c15164.f18925.m14777(EnumC11353.BOOLEAN)) {
            m49942(c4575.f10248);
            C24823 c24823 = new C24823(this, c4575, new C9820(this.f70049), new C9820(this.f70041), new C9820(this.f70047), new C9820(this.f70046));
            m49941();
            m45570(c24823);
            return;
        }
        m49938(c4575.f10248);
        m45570(new C8730(c4575, this.f70044, this.f70034));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3819(C17036 c17036) {
        m45570(new C8730(c17036, this.f70044, this.f70034));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3618(C11813 c11813) {
        m49938(c11813.f32975);
        m45570(new C8730(c11813, this.f70044, this.f70034));
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3782(C3904 c3904) {
        m49938(c3904.f8460);
        mo17118();
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3820(C17175 c17175) {
        m49938(c17175.f51143);
        m49936(c17175.f51144);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3832(C20530 c20530) {
        m49938(c20530.f63432);
        m49936(c20530.f63430);
        super.mo12739(c20530.f63428);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public void mo3619(C15834 c15834) {
        C9820 c9820 = this.f70034;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70044;
        C9820 c9823 = new C9820(c9822);
        int i = this.f70039;
        int i2 = this.f70048;
        C20271 c20271 = this.f62320;
        try {
            this.f70039 = i2;
            this.f62320 = new C20271();
            for (C4848 c4848 = c15834.f45863; c4848.m10293(); c4848 = c4848.f11035) {
                C11281 c11281 = (C11281) c4848.f11034;
                super.mo12739((AbstractC7257) c11281);
                c9822.m22910(c11281.f31438.f39049);
                c9820.m22901(c11281.f31438.f39049);
            }
            if (c15834.m35951() != EnumC15394.EXPRESSION) {
                super.mo12739(c15834.f45864);
            } else {
                m49938(c15834.f45864);
            }
        } finally {
            this.f70039 = i;
            c9820.m22905(c9821);
            c9822.m22905(c9823);
            this.f62320 = c20271;
            this.f70048 = i2;
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3830(C19859 c19859) {
        m49936(c19859.f60360);
        m49936(c19859.f60359);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3796(C8991 c8991) {
        C9820 c9820 = this.f70044;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70034;
        C9820 c9823 = new C9820(c9822);
        m49942(c8991.f24356);
        c9823.m22903(this.f70047);
        if (c8991.f24357 != null) {
            c9820.m22905(this.f70041);
            c9822.m22905(this.f70046);
            m49938(c8991.f24357);
        }
        c9820.m22905(c9821);
        c9822.m22905(c9823);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3836(C22403 c22403) {
        if (!C9268.m21434(c22403.f70670)) {
            m49938(c22403.f70670);
        }
        m49938(c22403.f70671);
        m49943(c22403.f70670);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3806(C11674 c11674) {
        m49938(c11674.f32571);
        m49938(c11674.f32570);
        m49943(c11674.f32571);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3795(C8598 c8598) {
        int i = C12754.f35819[c8598.mo3383().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                m49938(c8598.f23105);
                m49943(c8598.f23105);
                return;
            } else {
                m49938(c8598.f23105);
                return;
            }
        }
        m49942(c8598.f23105);
        C9820 c9820 = this.f70041;
        C9820 c9821 = new C9820(c9820);
        C9820 c9822 = this.f70049;
        c9820.m22905(c9822);
        c9822.m22905(c9821);
        C9820 c9823 = this.f70046;
        c9821.m22905(c9823);
        C9820 c9824 = this.f70047;
        c9823.m22905(c9824);
        c9824.m22905(c9821);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3803(C11003 c11003) {
        int i = C12754.f35819[c11003.mo3383().ordinal()];
        C9820 c9820 = this.f70034;
        C9820 c9821 = this.f70044;
        C9820 c9822 = this.f70046;
        C9820 c9823 = this.f70041;
        C9820 c9824 = this.f70047;
        C9820 c9825 = this.f70049;
        if (i == 6) {
            m49942(c11003.f30470);
            C9820 c9826 = new C9820(c9823);
            C9820 c9827 = new C9820(c9822);
            c9821.m22905(c9825);
            c9820.m22905(c9824);
            m49942(c11003.f30469);
            c9823.m22903(c9826);
            c9822.m22903(c9827);
            return;
        }
        if (i == 7) {
            m49942(c11003.f30470);
            C9820 c9828 = new C9820(c9825);
            C9820 c9829 = new C9820(c9824);
            c9821.m22905(c9823);
            c9820.m22905(c9822);
            m49942(c11003.f30469);
            c9825.m22903(c9828);
            c9824.m22903(c9829);
            return;
        }
        m49938(c11003.f30470);
        m49938(c11003.f30469);
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3798(C9661 c9661) {
        AbstractC7783 abstractC7783 = c9661.f26611;
        if (abstractC7783.f20405 == EnumC3600.f7339) {
            m49931((InterfaceC5323) c9661, (C13818) abstractC7783);
            this.f70033.mo28417(c9661.f26611);
        }
    }

    @Override // p067l.C15854, p067l.AbstractC2562
    /* JADX INFO: renamed from: ֫ */
    public final void mo3829(C19720 c19720) {
        c19720.f59996.mo3382(this);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[LOOP:1: B:32:0x00c0->B:34:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca A[EDGE_INSN: B:44:0x00ca->B:35:0x00ca BREAK  A[LOOP:1: B:32:0x00c0->B:34:0x00c5], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m49930(C4036 c4036, AbstractC7257 abstractC7257, C18537 c18537) {
        char c;
        char c2;
        int i;
        C11281[] c11281Arr;
        C9820 c9820 = this.f70046;
        C9820 c9821 = this.f70047;
        C9820 c9822 = this.f70041;
        C9820 c9823 = this.f70049;
        C9820 c9824 = this.f70035;
        C9820 c9825 = this.f70034;
        C9820 c9826 = this.f70044;
        C12083 c12083 = this.f70042;
        try {
            abstractC7257.getClass();
            this.f70038 = C9268.m21421(abstractC7257);
            if (this.f70036 == null) {
                this.f70036 = new C11281[32];
                c = 3;
                c2 = 2;
            } else {
                int i2 = 0;
                c = 3;
                while (true) {
                    try {
                        C11281[] c11281Arr2 = this.f70036;
                        c2 = 2;
                        try {
                            if (i2 >= c11281Arr2.length) {
                                break;
                            }
                            c11281Arr2[i2] = null;
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            this.f70038 = -1;
                            C9820[] c9820Arr = new C9820[7];
                            c9820Arr[0] = c9826;
                            c9820Arr[1] = c9825;
                            c9820Arr[c2] = c9824;
                            c9820Arr[c] = c9823;
                            c9820Arr[4] = c9822;
                            c9820Arr[5] = c9821;
                            c9820Arr[6] = c9820;
                            m49928(c9820Arr);
                            if (this.f70036 != null) {
                                i = 0;
                                while (true) {
                                    c11281Arr = this.f70036;
                                    if (i < c11281Arr.length) {
                                        break;
                                    }
                                    c11281Arr[i] = null;
                                    i++;
                                }
                            }
                            this.f70043 = 0;
                            this.f70048 = 0;
                            c12083.f33672 = null;
                            this.f62320 = null;
                            this.f70040 = null;
                            this.f70033 = null;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c2 = 2;
                        this.f70038 = -1;
                        C9820[] c9820Arr2 = new C9820[7];
                        c9820Arr2[0] = c9826;
                        c9820Arr2[1] = c9825;
                        c9820Arr2[c2] = c9824;
                        c9820Arr2[c] = c9823;
                        c9820Arr2[4] = c9822;
                        c9820Arr2[5] = c9821;
                        c9820Arr2[6] = c9820;
                        m49928(c9820Arr2);
                        if (this.f70036 != null) {
                            i = 0;
                            while (true) {
                                c11281Arr = this.f70036;
                                if (i < c11281Arr.length) {
                                    break;
                                    break;
                                } else {
                                    c11281Arr[i] = null;
                                    i++;
                                }
                            }
                        }
                        this.f70043 = 0;
                        this.f70048 = 0;
                        c12083.f33672 = null;
                        this.f62320 = null;
                        this.f70040 = null;
                        this.f70033 = null;
                        throw th;
                    }
                }
            }
            this.f70043 = 0;
            this.f70048 = 0;
            c12083.f33672 = c18537;
            this.f62320 = new C20271();
            this.f70040 = null;
            this.f70033 = AbstractC15689.m35727(c4036.f8855.f20027);
            super.mo12739(abstractC7257);
            this.f70038 = -1;
            C9820[] c9820Arr3 = new C9820[7];
            c9820Arr3[0] = c9826;
            c9820Arr3[1] = c9825;
            c9820Arr3[c2] = c9824;
            c9820Arr3[c] = c9823;
            c9820Arr3[4] = c9822;
            c9820Arr3[5] = c9821;
            c9820Arr3[6] = c9820;
            m49928(c9820Arr3);
            if (this.f70036 != null) {
                int i3 = 0;
                while (true) {
                    C11281[] c11281Arr3 = this.f70036;
                    if (i3 >= c11281Arr3.length) {
                        break;
                    }
                    c11281Arr3[i3] = null;
                    i3++;
                }
            }
            this.f70043 = 0;
            this.f70048 = 0;
            c12083.f33672 = null;
            this.f62320 = null;
            this.f70040 = null;
            this.f70033 = null;
        } catch (Throwable th3) {
            th = th3;
            c = 3;
        }
    }

    public C22142(C12083 c12083) {
        this.f70042 = c12083;
    }
}
