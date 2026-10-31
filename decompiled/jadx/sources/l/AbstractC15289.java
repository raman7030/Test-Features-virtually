package l;

import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import com.alipay.sdk.app.OpenAuthTask;

/* JADX INFO: renamed from: l.ܶܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8FJ */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15289 extends AbstractC4930 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f46891;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C20537 f46892;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C6404 f46893;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f46894;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public long f46895;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f46896;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f46897;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f46898;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21913 f46899;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f46900;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public Surface f46901;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f46902;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f46903;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C3519 f46904;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C13375 f46905;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f46906;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public C8353 f46907;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public Object f46908;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int f46909;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f46910;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final long f46911;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f46912;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f46913;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public boolean f46914;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f46915;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C10833 f46916;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f46917;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1381 f46918;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C21843 f46919;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C8353 f46920;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public int f46921;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f46922;

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
    }

    /* JADX INFO: renamed from: ۧ */
    public abstract InterfaceC1381 mo30948(C8353 c8353);

    public AbstractC15289(long j, Handler handler, InterfaceC16476 interfaceC16476, int i) {
        super(2);
        this.f46911 = j;
        this.f46909 = i;
        this.f46897 = -9223372036854775807L;
        this.f46892 = new C20537();
        this.f46898 = new C21843(0, 0);
        this.f46916 = new C10833(handler, interfaceC16476);
        this.f46894 = 0;
        this.f46921 = -1;
        this.f46891 = 0;
        this.f46904 = new C3519();
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) throws C18273 {
        if (this.f46910) {
            return;
        }
        if (this.f46920 == null) {
            C3002 c3002M14370 = m14370();
            this.f46898.mo7();
            int iM14355 = m14355(c3002M14370, this.f46898, 2);
            if (iM14355 != -5) {
                if (iM14355 == -4) {
                    C22632.m50634(this.f46898.m12697());
                    this.f46917 = true;
                    this.f46910 = true;
                    return;
                }
                return;
            }
            m36296(c3002M14370);
        }
        m36294();
        if (this.f46918 != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (m36292(j)) {
                }
                while (m36293()) {
                }
                Trace.endSection();
                synchronized (this.f46904) {
                }
            } catch (C8437 e) {
                C19956.m46034("Video codec error", e);
                this.f46916.m27085((Exception) e);
                throw m14356(e, this.f46920, 4003);
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return this.f46910;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        if (this.f46920 != null && ((m14365() || this.f46905 != null) && (this.f46891 == 3 || this.f46921 == -1))) {
            this.f46897 = -9223372036854775807L;
            return true;
        }
        if (this.f46897 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f46897) {
            return true;
        }
        this.f46897 = -9223372036854775807L;
        return false;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        C3519 c3519 = new C3519();
        this.f46904 = c3519;
        this.f46916.m27093(c3519);
        this.f46891 = z2 ? 1 : 0;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۜ */
    public final void mo6095() {
        if (this.f46891 == 0) {
            this.f46891 = 1;
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) throws C18273 {
        this.f46917 = false;
        this.f46910 = false;
        this.f46891 = Math.min(this.f46891, 1);
        this.f46912 = -9223372036854775807L;
        this.f46900 = 0;
        if (this.f46918 != null) {
            m36298();
        }
        if (!z) {
            this.f46897 = -9223372036854775807L;
        } else {
            long j2 = this.f46911;
            this.f46897 = j2 > 0 ? SystemClock.elapsedRealtime() + j2 : -9223372036854775807L;
        }
        this.f46892.m47025();
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ܰ */
    public final void mo13466() {
        this.f46915 = 0;
        this.f46896 = SystemClock.elapsedRealtime();
        this.f46895 = C3603.m11014(SystemClock.elapsedRealtime());
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۟ */
    public final void mo13462() {
        this.f46897 = -9223372036854775807L;
        if (this.f46915 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f46916.m27084(this.f46915, jElapsedRealtime - this.f46896);
            this.f46915 = 0;
            this.f46896 = jElapsedRealtime;
        }
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        C10833 c10833 = this.f46916;
        this.f46920 = null;
        this.f46893 = null;
        this.f46891 = Math.min(this.f46891, 0);
        try {
            C18566.m43106(this.f46906, (InterfaceC0220) null);
            this.f46906 = null;
            m36299();
        } finally {
            c10833.m27089(this.f46904);
        }
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m36298() throws C18273 {
        this.f46922 = 0;
        if (this.f46894 != 0) {
            m36299();
            m36294();
            return;
        }
        this.f46919 = null;
        if (this.f46905 != null) {
            throw null;
        }
        InterfaceC1381 interfaceC1381 = this.f46918;
        interfaceC1381.getClass();
        interfaceC1381.flush();
        interfaceC1381.mo4864(m14371());
        this.f46913 = false;
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m36299() {
        this.f46919 = null;
        this.f46905 = null;
        this.f46894 = 0;
        this.f46913 = false;
        this.f46922 = 0;
        InterfaceC1381 interfaceC1381 = this.f46918;
        if (interfaceC1381 != null) {
            this.f46904.f11175++;
            interfaceC1381.mo12();
            this.f46916.m27087(this.f46918.getName());
            this.f46918 = null;
        }
        C18566.m43106(this.f46903, (InterfaceC0220) null);
        this.f46903 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36296(C3002 c3002) throws C18273 {
        C13396 c13396Mo30947;
        this.f46914 = true;
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        InterfaceC0220 interfaceC0220 = c3002.f9454;
        C18566.m43106(this.f46906, interfaceC0220);
        this.f46906 = interfaceC0220;
        C8353 c8354 = this.f46920;
        this.f46920 = c8353;
        InterfaceC1381 interfaceC1381 = this.f46918;
        C10833 c10833 = this.f46916;
        if (interfaceC1381 == null) {
            m36294();
            C8353 c8355 = this.f46920;
            c8355.getClass();
            c10833.m27091(c8355, (C13396) null);
            return;
        }
        if (interfaceC0220 != this.f46903) {
            String name = interfaceC1381.getName();
            c8354.getClass();
            c13396Mo30947 = new C13396(name, c8354, c8353, 0, 128);
        } else {
            String name2 = interfaceC1381.getName();
            c8354.getClass();
            c13396Mo30947 = mo30947(name2, c8354, c8353);
        }
        if (c13396Mo30947.f40048 == 0) {
            if (this.f46913) {
                this.f46894 = 1;
            } else {
                m36299();
                m36294();
            }
        }
        C8353 c8356 = this.f46920;
        c8356.getClass();
        c10833.m27091(c8356, c13396Mo30947);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36295(int i, int i2) {
        int i3;
        C3519 c3519 = this.f46904;
        c3519.f11180 += i;
        int i4 = i + i2;
        c3519.f11178 += i4;
        this.f46915 += i4;
        int i5 = this.f46900 + i4;
        this.f46900 = i5;
        c3519.f11176 = Math.max(i5, c3519.f11176);
        int i6 = this.f46909;
        if (i6 <= 0 || (i3 = this.f46915) < i6 || i3 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f46916.m27084(this.f46915, jElapsedRealtime - this.f46896);
        this.f46915 = 0;
        this.f46896 = jElapsedRealtime;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36297(C13375 c13375, long j, C8353 c8353) {
        InterfaceC22618 interfaceC22618 = this.f46902;
        if (interfaceC22618 != null) {
            interfaceC22618.mo24148(j, m14362().mo33835(), c8353, null);
        }
        this.f46895 = C3603.m11014(SystemClock.elapsedRealtime());
        c13375.getClass();
        boolean z = this.f46899 != null;
        if (!z) {
            m36295(0, 1);
            throw null;
        }
        C6404 c6404 = this.f46893;
        C10833 c10833 = this.f46916;
        if (c6404 == null || c6404.f19815 != 0 || c6404.f19813 != 0) {
            C6404 c6405 = new C6404(0, 0);
            this.f46893 = c6405;
            c10833.m27090(c6405);
        }
        if (!z) {
            this.f46901.getClass();
        } else {
            InterfaceC21913 interfaceC21913 = this.f46899;
            interfaceC21913.getClass();
            interfaceC21913.mo36707(c13375);
        }
        this.f46900 = 0;
        this.f46904.f11172++;
        if (this.f46891 != 3) {
            this.f46891 = 3;
            Object obj = this.f46908;
            if (obj != null) {
                c10833.m27086(obj);
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* JADX INFO: renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        Object obj2;
        if (i != 1) {
            if (i == 7) {
                this.f46902 = (InterfaceC22618) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.f46901 = (Surface) obj;
            this.f46899 = null;
            this.f46921 = 1;
        } else if (obj instanceof InterfaceC21913) {
            this.f46901 = null;
            this.f46899 = (InterfaceC21913) obj;
            this.f46921 = 0;
        } else {
            this.f46901 = null;
            this.f46899 = null;
            this.f46921 = -1;
            obj = null;
        }
        Object obj3 = this.f46908;
        C10833 c10833 = this.f46916;
        if (obj3 == obj) {
            if (obj != null) {
                C6404 c6404 = this.f46893;
                if (c6404 != null) {
                    c10833.m27090(c6404);
                }
                if (this.f46891 != 3 || (obj2 = this.f46908) == null) {
                    return;
                }
                c10833.m27086(obj2);
                return;
            }
            return;
        }
        this.f46908 = obj;
        if (obj == null) {
            this.f46893 = null;
            this.f46891 = Math.min(this.f46891, 1);
            return;
        }
        C6404 c6405 = this.f46893;
        if (c6405 != null) {
            c10833.m27090(c6405);
        }
        this.f46891 = Math.min(this.f46891, 1);
        if (getState() == 2) {
            long j = this.f46911;
            this.f46897 = j > 0 ? SystemClock.elapsedRealtime() + j : -9223372036854775807L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C13396 mo30947(String str, C8353 c8353, C8353 c8354) {
        return new C13396(str, c8353, c8354, 0, 1);
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m36294() throws C18273 {
        if (this.f46918 != null) {
            return;
        }
        InterfaceC0220 interfaceC0220 = this.f46906;
        C18566.m43106(this.f46903, interfaceC0220);
        this.f46903 = interfaceC0220;
        if (interfaceC0220 != null && interfaceC0220.mo1474() == null && this.f46903.getError() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            C8353 c8353 = this.f46920;
            c8353.getClass();
            mo30948(c8353);
            this.f46918 = null;
            throw null;
        } catch (OutOfMemoryError e) {
            throw m14356(e, this.f46920, OpenAuthTask.NOT_INSTALLED);
        } catch (C8437 e2) {
            C19956.m46034("Video codec error", e2);
            this.f46916.m27085((Exception) e2);
            throw m14356(e2, this.f46920, OpenAuthTask.NOT_INSTALLED);
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
    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private boolean m36293() throws C18273 {
        C21843 c21843;
        C3002 c3002M14370;
        int iM14355;
        InterfaceC1381 interfaceC1381 = this.f46918;
        if (interfaceC1381 != null && this.f46894 != 2 && !this.f46917) {
            if (this.f46919 == null) {
                C21843 c21844 = (C21843) interfaceC1381.mo4865();
                this.f46919 = c21844;
                if (c21844 != null) {
                    c21843 = this.f46919;
                    c21843.getClass();
                    if (this.f46894 == 1) {
                        c21843.m12693(4);
                        InterfaceC1381 interfaceC1382 = this.f46918;
                        interfaceC1382.getClass();
                        interfaceC1382.mo4862(c21843);
                        this.f46919 = null;
                        this.f46894 = 2;
                        return false;
                    }
                    c3002M14370 = m14370();
                    iM14355 = m14355(c3002M14370, c21843, 0);
                    if (iM14355 != -5) {
                        m36296(c3002M14370);
                        return true;
                    }
                    if (iM14355 != -4) {
                        if (c21843.m12697()) {
                            this.f46917 = true;
                            InterfaceC1381 interfaceC1383 = this.f46918;
                            interfaceC1383.getClass();
                            interfaceC1383.mo4862(c21843);
                            this.f46919 = null;
                            return false;
                        }
                        if (this.f46914) {
                            long j = c21843.f69997;
                            C8353 c8353 = this.f46920;
                            c8353.getClass();
                            this.f46892.m47026(j, c8353);
                            this.f46914 = false;
                        }
                        c21843.m49229();
                        c21843.f69994 = this.f46920;
                        InterfaceC1381 interfaceC1384 = this.f46918;
                        interfaceC1384.getClass();
                        interfaceC1384.mo4862(c21843);
                        this.f46922++;
                        this.f46913 = true;
                        this.f46904.f11182++;
                        this.f46919 = null;
                        return true;
                    }
                    if (iM14355 != -3) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                c21843 = this.f46919;
                c21843.getClass();
                if (this.f46894 == 1) {
                    c21843.m12693(4);
                    InterfaceC1381 interfaceC1385 = this.f46918;
                    interfaceC1385.getClass();
                    interfaceC1385.mo4862(c21843);
                    this.f46919 = null;
                    this.f46894 = 2;
                    return false;
                }
                c3002M14370 = m14370();
                iM14355 = m14355(c3002M14370, c21843, 0);
                if (iM14355 != -5) {
                    m36296(c3002M14370);
                    return true;
                }
                if (iM14355 != -4) {
                    if (c21843.m12697()) {
                        this.f46917 = true;
                        InterfaceC1381 interfaceC1386 = this.f46918;
                        interfaceC1386.getClass();
                        interfaceC1386.mo4862(c21843);
                        this.f46919 = null;
                        return false;
                    }
                    if (this.f46914) {
                        long j2 = c21843.f69997;
                        C8353 c8354 = this.f46920;
                        c8354.getClass();
                        this.f46892.m47026(j2, c8354);
                        this.f46914 = false;
                    }
                    c21843.m49229();
                    c21843.f69994 = this.f46920;
                    InterfaceC1381 interfaceC1387 = this.f46918;
                    interfaceC1387.getClass();
                    interfaceC1387.mo4862(c21843);
                    this.f46922++;
                    this.f46913 = true;
                    this.f46904.f11182++;
                    this.f46919 = null;
                    return true;
                }
                if (iM14355 != -3) {
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
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m36292(long j) throws C18273 {
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        if (this.f46905 == null) {
            InterfaceC1381 interfaceC1381 = this.f46918;
            interfaceC1381.getClass();
            C13375 c13375 = (C13375) interfaceC1381.mo4863();
            this.f46905 = c13375;
            if (c13375 == null) {
                return false;
            }
            C3519 c3519 = this.f46904;
            int i = c3519.f11174;
            int i2 = c13375.f65927;
            c3519.f11174 = i + i2;
            this.f46922 -= i2;
        }
        if (this.f46905.m12697()) {
            if (this.f46894 != 2) {
                this.f46905.getClass();
                throw null;
            }
            m36299();
            m36294();
            return false;
        }
        if (this.f46912 == -9223372036854775807L) {
            this.f46912 = j;
        }
        C13375 c13376 = this.f46905;
        c13376.getClass();
        long j4 = c13376.f65926;
        long j5 = j4 - j;
        if (this.f46921 != -1) {
            C20537 c20537 = this.f46892;
            C8353 c8353 = (C8353) c20537.m47028(j4);
            if (c8353 != null) {
                this.f46907 = c8353;
            } else if (this.f46907 == null) {
                this.f46907 = (C8353) c20537.m47027();
            }
            long jM14360 = j4 - m14360();
            boolean z4 = getState() == 2;
            int i3 = this.f46891;
            if (i3 != 0) {
                if (i3 != 1) {
                    j3 = -30000;
                    if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                    j2 = jM14360;
                    long jM11014 = C3603.m11014(SystemClock.elapsedRealtime()) - this.f46895;
                    if (!z4 || j5 >= -30000 || jM11014 <= 100000) {
                        z4 = false;
                    }
                } else {
                    j2 = jM14360;
                    j3 = -30000;
                }
                z4 = true;
            } else {
                j2 = jM14360;
                j3 = -30000;
            }
            if (z4) {
                C8353 c8354 = this.f46907;
                c8354.getClass();
                m36297(c13376, j2, c8354);
            } else {
                long j6 = j2;
                if ((getState() == 2) && j != this.f46912) {
                    if (!(j5 < -500000)) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m36295(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C8353 c8355 = this.f46907;
                            c8355.getClass();
                            m36297(c13376, j6, c8355);
                        }
                        if (z) {
                            this.f46905.getClass();
                            this.f46922--;
                            this.f46905 = null;
                        }
                        return z;
                    }
                    int iM14363 = m14363(j);
                    if (iM14363 == 0) {
                        z3 = false;
                    } else {
                        this.f46904.f11179++;
                        m36295(iM14363, this.f46922);
                        m36298();
                        z3 = true;
                    }
                    if (!z3) {
                        if (j5 < j3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            m36295(0, 1);
                            throw null;
                        }
                        if (j5 < 30000) {
                            C8353 c8356 = this.f46907;
                            c8356.getClass();
                            m36297(c13376, j6, c8356);
                        }
                        if (z) {
                            this.f46905.getClass();
                            this.f46922--;
                            this.f46905 = null;
                        }
                        return z;
                    }
                }
            }
            z = true;
            if (z) {
                this.f46905.getClass();
                this.f46922--;
                this.f46905 = null;
            }
            return z;
        }
        if (j5 < -30000) {
            this.f46904.f11174++;
            throw null;
        }
        z = false;
        if (z) {
            this.f46905.getClass();
            this.f46922--;
            this.f46905 = null;
        }
        return z;
    }
}
