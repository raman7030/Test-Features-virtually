package p067l;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ܶܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8FJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16899 extends AbstractC7054 {

    /* JADX INFO: renamed from: ֡֫ */
    public int f50018;

    /* JADX INFO: renamed from: ֨֫ */
    public final C21886 f50019;

    /* JADX INFO: renamed from: ֫ۧ */
    public C8454 f50020;

    /* JADX INFO: renamed from: ۖ֫ */
    public int f50021;

    /* JADX INFO: renamed from: ۗ֫ */
    public long f50022;

    /* JADX INFO: renamed from: ۘ֫ */
    public long f50023;

    /* JADX INFO: renamed from: ۙ֫ */
    public long f50024;

    /* JADX INFO: renamed from: ۚ֫ */
    public final C23128 f50025;

    /* JADX INFO: renamed from: ۛ֫ */
    public InterfaceC23195 f50026;

    /* JADX INFO: renamed from: ۜ֫ */
    public int f50027;

    /* JADX INFO: renamed from: ۟֫ */
    public Surface f50028;

    /* JADX INFO: renamed from: ۠֫ */
    public InterfaceC23865 f50029;

    /* JADX INFO: renamed from: ۡ֫ */
    public InterfaceC2577 f50030;

    /* JADX INFO: renamed from: ۢ֫ */
    public C5713 f50031;

    /* JADX INFO: renamed from: ۤ֫ */
    public C15080 f50032;

    /* JADX INFO: renamed from: ۧۧ */
    public InterfaceC2577 f50033;

    /* JADX INFO: renamed from: ۨ֫ */
    public C10307 f50034;

    /* JADX INFO: renamed from: ۫֫ */
    public Object f50035;

    /* JADX INFO: renamed from: ۬֫ */
    public final int f50036;

    /* JADX INFO: renamed from: ܰ֫ */
    public boolean f50037;

    /* JADX INFO: renamed from: ܳ֫ */
    public final long f50038;

    /* JADX INFO: renamed from: ܶ֫ */
    public long f50039;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f50040;

    /* JADX INFO: renamed from: ܽۧ */
    public boolean f50041;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f50042;

    /* JADX INFO: renamed from: ᩵֫ */
    public final C12664 f50043;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f50044;

    /* JADX INFO: renamed from: ᩷֫ */
    public InterfaceC3681 f50045;

    /* JADX INFO: renamed from: ᩸֫ */
    public C23128 f50046;

    /* JADX INFO: renamed from: ᩹֫ */
    public C10307 f50047;

    /* JADX INFO: renamed from: ᩺֫ */
    public int f50048;

    /* JADX INFO: renamed from: ᩻֫ */
    public int f50049;

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC3681 mo33026(C10307 c10307);

    public AbstractC16899(long j, Handler handler, InterfaceC18027 interfaceC18027, int i) {
        super(2);
        this.f50038 = j;
        this.f50036 = i;
        this.f50024 = -9223372036854775807L;
        this.f50019 = new C21886();
        this.f50025 = new C23128(0, 0);
        this.f50043 = new C12664(handler, interfaceC18027);
        this.f50021 = 0;
        this.f50048 = -1;
        this.f50018 = 0;
        this.f50031 = new C5713();
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) throws C19735 {
        if (this.f50037) {
            return;
        }
        if (this.f50047 == null) {
            C5221 c5221M16267 = m16267();
            this.f50025.mo7();
            int iM16252 = m16252(c5221M16267, this.f50025, 2);
            if (iM16252 != -5) {
                if (iM16252 == -4) {
                    C23877.m52960(this.f50025.m14573());
                    this.f50044 = true;
                    this.f50037 = true;
                    return;
                }
                return;
            }
            m38457(c5221M16267);
        }
        m38455();
        if (this.f50045 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m38453(j)) {
                }
                while (m38454()) {
                }
                Trace.endSection();
                synchronized (this.f50031) {
                }
            } catch (C10387 e) {
                C21334.m48348("Video codec error", e);
                this.f50043.m29130((Exception) e);
                throw m16253(e, this.f50047, 4003);
            }
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return this.f50037;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        if (this.f50047 != null && ((m16262() || this.f50032 != null) && (this.f50018 == 3 || this.f50048 == -1))) {
            this.f50024 = -9223372036854775807L;
            return true;
        }
        if (this.f50024 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f50024) {
            return true;
        }
        this.f50024 = -9223372036854775807L;
        return false;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15345(boolean z, boolean z2) {
        C5713 c5713 = new C5713();
        this.f50031 = c5713;
        this.f50043.m29138(c5713);
        this.f50018 = z2 ? 1 : 0;
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۜ */
    public final void mo8293() {
        if (this.f50018 == 0) {
            this.f50018 = 1;
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) throws C19735 {
        this.f50044 = false;
        this.f50037 = false;
        this.f50018 = Math.min(this.f50018, 1);
        this.f50039 = -9223372036854775807L;
        this.f50027 = 0;
        if (this.f50045 != null) {
            m38459();
        }
        if (!z) {
            this.f50024 = -9223372036854775807L;
        } else {
            long j2 = this.f50038;
            this.f50024 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
        this.f50019.m49348();
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ܰ */
    public final void mo15354() {
        this.f50042 = 0;
        this.f50023 = SystemClock.elapsedRealtime();
        this.f50022 = C5792.m12990(SystemClock.elapsedRealtime());
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۟ */
    public final void mo15350() {
        this.f50024 = -9223372036854775807L;
        if (this.f50042 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f50043.m29129(this.f50042, jElapsedRealtime - this.f50023);
            this.f50042 = 0;
            this.f50023 = jElapsedRealtime;
        }
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        C12664 c12664 = this.f50043;
        this.f50047 = null;
        this.f50020 = null;
        this.f50018 = Math.min(this.f50018, 0);
        try {
            C20013.m45384(this.f50033, (InterfaceC2577) null);
            this.f50033 = null;
            m38460();
        } finally {
            c12664.m29134(this.f50031);
        }
    }

    /* JADX INFO: renamed from: ֫֫ */
    public final void m38459() throws C19735 {
        this.f50049 = 0;
        if (this.f50021 != 0) {
            m38460();
            m38455();
            return;
        }
        this.f50046 = null;
        if (this.f50032 != null) {
            throw null;
        }
        InterfaceC3681 interfaceC3681 = this.f50045;
        interfaceC3681.getClass();
        interfaceC3681.flush();
        interfaceC3681.mo7102(m16268());
        this.f50040 = false;
    }

    /* JADX INFO: renamed from: ۧ֫ */
    public final void m38460() {
        this.f50046 = null;
        this.f50032 = null;
        this.f50021 = 0;
        this.f50040 = false;
        this.f50049 = 0;
        InterfaceC3681 interfaceC3681 = this.f50045;
        if (interfaceC3681 != null) {
            this.f50031.f13981++;
            interfaceC3681.mo12();
            this.f50043.m29132(this.f50045.getName());
            this.f50045 = null;
        }
        C20013.m45384(this.f50030, (InterfaceC2577) null);
        this.f50030 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38457(C5221 c5221) throws C19735 {
        C15100 c15100Mo33025;
        this.f50041 = true;
        C10307 c10307 = c5221.f12253;
        c10307.getClass();
        InterfaceC2577 interfaceC2577 = c5221.f12252;
        C20013.m45384(this.f50033, interfaceC2577);
        this.f50033 = interfaceC2577;
        C10307 c10308 = this.f50047;
        this.f50047 = c10307;
        InterfaceC3681 interfaceC3681 = this.f50045;
        C12664 c12664 = this.f50043;
        if (interfaceC3681 == null) {
            m38455();
            C10307 c10309 = this.f50047;
            c10309.getClass();
            c12664.m29136(c10309, (C15100) null);
            return;
        }
        if (interfaceC2577 != this.f50030) {
            String name = interfaceC3681.getName();
            c10308.getClass();
            c15100Mo33025 = new C15100(name, c10308, c10307, 0, 128);
        } else {
            String name2 = interfaceC3681.getName();
            c10308.getClass();
            c15100Mo33025 = mo33025(name2, c10308, c10307);
        }
        if (c15100Mo33025.f43118 == 0) {
            if (this.f50040) {
                this.f50021 = 1;
            } else {
                m38460();
                m38455();
            }
        }
        C10307 c103010 = this.f50047;
        c103010.getClass();
        c12664.m29136(c103010, c15100Mo33025);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38456(int i, int i2) {
        int i3;
        C5713 c5713 = this.f50031;
        c5713.f13986 += i;
        int i4 = i + i2;
        c5713.f13984 += i4;
        this.f50042 += i4;
        int i5 = this.f50027 + i4;
        this.f50027 = i5;
        c5713.f13982 = Math.max(i5, c5713.f13982);
        int i6 = this.f50036;
        if (i6 <= 0 || (i3 = this.f50042) < i6 || i3 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f50043.m29129(this.f50042, jElapsedRealtime - this.f50023);
        this.f50042 = 0;
        this.f50023 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38458(C15080 c15080, long j, C10307 c10307) {
        InterfaceC23865 interfaceC23865 = this.f50029;
        if (interfaceC23865 != null) {
            interfaceC23865.mo26158(j, m16259().mo35967(), c10307, null);
        }
        this.f50022 = C5792.m12990(SystemClock.elapsedRealtime());
        c15080.getClass();
        boolean z = this.f50026 != null;
        if (!z) {
            m38456(0, 1);
            throw null;
        }
        C8454 c8454 = this.f50020;
        C12664 c12664 = this.f50043;
        if (c8454 == null || c8454.f22687 != 0 || c8454.f22685 != 0) {
            C8454 c8455 = new C8454(0, 0);
            this.f50020 = c8455;
            c12664.m29135(c8455);
        }
        if (!z) {
            this.f50028.getClass();
        } else {
            InterfaceC23195 interfaceC23195 = this.f50026;
            interfaceC23195.getClass();
            interfaceC23195.mo38868(c15080);
        }
        this.f50027 = 0;
        this.f50031.f13978++;
        if (this.f50018 != 3) {
            this.f50018 = 3;
            Object obj = this.f50035;
            if (obj != null) {
                c12664.m29131(obj);
            }
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC7864
    /* JADX INFO: renamed from: ֫ */
    public final void mo15338(int i, Object obj) {
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.f50029 = (InterfaceC23865) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f50028 = (Surface) obj;
            this.f50026 = null;
            this.f50048 = 1;
        } else if (obj instanceof InterfaceC23195) {
            this.f50028 = null;
            this.f50026 = (InterfaceC23195) obj;
            this.f50048 = 0;
        } else {
            this.f50028 = null;
            this.f50026 = null;
            this.f50048 = -1;
            obj = null;
        }
        Object obj3 = this.f50035;
        C12664 c12664 = this.f50043;
        if (obj3 == obj) {
            if (obj != null) {
                C8454 c8454 = this.f50020;
                if (c8454 != null) {
                    c12664.m29135(c8454);
                }
                if (this.f50018 != 3 || (obj2 = this.f50035) == null) {
                    return;
                }
                c12664.m29131(obj2);
                return;
            }
            return;
        }
        this.f50035 = obj;
        if (obj == null) {
            this.f50020 = null;
            this.f50018 = Math.min(this.f50018, 1);
            return;
        }
        C8454 c8455 = this.f50020;
        if (c8455 != null) {
            c12664.m29135(c8455);
        }
        this.f50018 = Math.min(this.f50018, 1);
        if (getState() == 2) {
            long j = this.f50038;
            this.f50024 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C15100 mo33025(String str, C10307 c10307, C10307 c10308) {
        return new C15100(str, c10307, c10308, 0, 1);
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m38455() throws C19735 {
        if (this.f50045 != null) {
            return;
        }
        InterfaceC2577 interfaceC2577 = this.f50033;
        C20013.m45384(this.f50030, interfaceC2577);
        this.f50030 = interfaceC2577;
        if (interfaceC2577 != null && interfaceC2577.mo3887() == null && this.f50030.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            C10307 c10307 = this.f50047;
            c10307.getClass();
            mo33026(c10307);
            this.f50045 = null;
            throw null;
        } catch (OutOfMemoryError e) {
            throw m16253(e, this.f50047, OpenAuthTask.NOT_INSTALLED);
        } catch (C10387 e2) {
            C21334.m48348("Video codec error", e2);
            this.f50043.m29130((Exception) e2);
            throw m16253(e2, this.f50047, OpenAuthTask.NOT_INSTALLED);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX INFO: renamed from: ܽ֫ */
    private boolean m38454() throws C19735 {
        C23128 c23128;
        C5221 c5221M16267;
        int iM16252;
        InterfaceC3681 interfaceC3681 = this.f50045;
        if (interfaceC3681 != null && this.f50021 != 2 && !this.f50044) {
            if (this.f50046 == null) {
                C23128 c23129 = (C23128) interfaceC3681.mo7103();
                this.f50046 = c23129;
                if (c23129 != null) {
                    c23128 = this.f50046;
                    c23128.getClass();
                    if (this.f50021 == 1) {
                        c23128.m14569(4);
                        InterfaceC3681 interfaceC3682 = this.f50045;
                        interfaceC3682.getClass();
                        interfaceC3682.mo7100(c23128);
                        this.f50046 = null;
                        this.f50021 = 2;
                        return false;
                    }
                    c5221M16267 = m16267();
                    iM16252 = m16252(c5221M16267, c23128, 0);
                    if (iM16252 != -5) {
                        m38457(c5221M16267);
                        return true;
                    }
                    if (iM16252 != -4) {
                        if (c23128.m14573()) {
                            this.f50044 = true;
                            InterfaceC3681 interfaceC3683 = this.f50045;
                            interfaceC3683.getClass();
                            interfaceC3683.mo7100(c23128);
                            this.f50046 = null;
                            return false;
                        }
                        if (this.f50041) {
                            long j = c23128.f72706;
                            C10307 c10307 = this.f50047;
                            c10307.getClass();
                            this.f50019.m49349(j, c10307);
                            this.f50041 = false;
                        }
                        c23128.m51580();
                        c23128.f72703 = this.f50047;
                        InterfaceC3681 interfaceC3684 = this.f50045;
                        interfaceC3684.getClass();
                        interfaceC3684.mo7100(c23128);
                        this.f50049++;
                        this.f50040 = true;
                        this.f50031.f13988++;
                        this.f50046 = null;
                        return true;
                    }
                    if (iM16252 != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                c23128 = this.f50046;
                c23128.getClass();
                if (this.f50021 == 1) {
                    c23128.m14569(4);
                    InterfaceC3681 interfaceC3685 = this.f50045;
                    interfaceC3685.getClass();
                    interfaceC3685.mo7100(c23128);
                    this.f50046 = null;
                    this.f50021 = 2;
                    return false;
                }
                c5221M16267 = m16267();
                iM16252 = m16252(c5221M16267, c23128, 0);
                if (iM16252 != -5) {
                    m38457(c5221M16267);
                    return true;
                }
                if (iM16252 != -4) {
                    if (c23128.m14573()) {
                        this.f50044 = true;
                        InterfaceC3681 interfaceC3686 = this.f50045;
                        interfaceC3686.getClass();
                        interfaceC3686.mo7100(c23128);
                        this.f50046 = null;
                        return false;
                    }
                    if (this.f50041) {
                        long j2 = c23128.f72706;
                        C10307 c10308 = this.f50047;
                        c10308.getClass();
                        this.f50019.m49349(j2, c10308);
                        this.f50041 = false;
                    }
                    c23128.m51580();
                    c23128.f72703 = this.f50047;
                    InterfaceC3681 interfaceC3687 = this.f50045;
                    interfaceC3687.getClass();
                    interfaceC3687.mo7100(c23128);
                    this.f50049++;
                    this.f50040 = true;
                    this.f50031.f13988++;
                    this.f50046 = null;
                    return true;
                }
                if (iM16252 != -3) {
                    throw new IllegalStateException();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x010a  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:75:0x010f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x011f  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX INFO: renamed from: ܽ */
    private boolean m38453(long j) throws C19735 {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        if (this.f50032 == null) {
            InterfaceC3681 interfaceC3681 = this.f50045;
            interfaceC3681.getClass();
            C15080 c15080 = (C15080) interfaceC3681.mo7101();
            this.f50032 = c15080;
            if (c15080 == null) {
                return false;
            }
            C5713 c5713 = this.f50031;
            int i = c5713.f13980;
            int i2 = c15080.f68602;
            c5713.f13980 = i + i2;
            this.f50049 -= i2;
        }
        if (this.f50032.m14573()) {
            if (this.f50021 != 2) {
                this.f50032.getClass();
                throw null;
            }
            m38460();
            m38455();
            return false;
        }
        if (this.f50039 == -9223372036854775807L) {
            this.f50039 = j;
        }
        C15080 c15081 = this.f50032;
        c15081.getClass();
        long j4 = c15081.f68601;
        long j5 = j4 - j;
        if (this.f50048 != -1) {
            C21886 c21886 = this.f50019;
            C10307 c10307 = (C10307) c21886.m49351(j4);
            if (c10307 != null) {
                this.f50034 = c10307;
            } else if (this.f50034 == null) {
                this.f50034 = (C10307) c21886.m49350();
            }
            long jM16257 = j4 - m16257();
            boolean z4 = getState() == 2;
            int i3 = this.f50018;
            if (i3 != 0) {
                if (i3 != 1) {
                    j3 = -30000;
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    j2 = jM16257;
                    long jM12990 = C5792.m12990(SystemClock.elapsedRealtime()) - this.f50022;
                    if (!z4 || j5 >= -30000 || jM12990 <= 100000) {
                        z4 = false;
                    }
                } else {
                    j2 = jM16257;
                    j3 = -30000;
                }
                z4 = true;
            } else {
                j2 = jM16257;
                j3 = -30000;
            }
            if (z4) {
                C10307 c10308 = this.f50034;
                c10308.getClass();
                m38458(c15081, j2, c10308);
            } else {
                long j6 = j2;
                if ((getState() == 2) && j != this.f50039) {
                    if (!(j5 < -500000)) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m38456(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C10307 c10309 = this.f50034;
                            c10309.getClass();
                            m38458(c15081, j6, c10309);
                        }
                        if (z) {
                            this.f50032.getClass();
                            this.f50049--;
                            this.f50032 = null;
                        }
                        return z;
                    }
                    int iM16260 = m16260(j);
                    if (iM16260 == 0) {
                        z3 = false;
                    } else {
                        this.f50031.f13985++;
                        m38456(iM16260, this.f50049);
                        m38459();
                        z3 = true;
                    }
                    if (!z3) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m38456(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C10307 c103010 = this.f50034;
                            c103010.getClass();
                            m38458(c15081, j6, c103010);
                        }
                        if (z) {
                            this.f50032.getClass();
                            this.f50049--;
                            this.f50032 = null;
                        }
                        return z;
                    }
                }
            }
            z = true;
            if (z) {
                this.f50032.getClass();
                this.f50049--;
                this.f50032 = null;
            }
            return z;
        }
        if (j5 < -30000) {
            this.f50031.f13980++;
            throw null;
        }
        z = false;
        if (z) {
            this.f50032.getClass();
            this.f50049--;
            this.f50032 = null;
        }
        return z;
    }
}
