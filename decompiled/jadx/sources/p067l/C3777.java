package p067l;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.֫֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3777 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f8087 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C20139 f8088 = new C20139(new C14367(), new C8192());

    /* JADX INFO: renamed from: ֫ */
    public static C6485 m7372(boolean z, EnumC9673 enumC9673, EnumC13697 enumC13697) {
        EnumC9673 enumC9674 = EnumC9673.DEFAULT_SIGNED;
        if (enumC9673 != enumC9674 && enumC13697 != EnumC13697.SMB2_ONLY) {
            throw new IllegalArgumentException("Unsigned SMB mode requires SMB2 dialects");
        }
        C21238 c21238M14872 = C6485.m14872();
        c21238M14872.m47996();
        if (enumC13697 == EnumC13697.SMB2_ONLY) {
            c21238M14872.m47987(false);
            c21238M14872.m47988(EnumC23366.SMB_2_1, EnumC23366.SMB_2_0_2);
        } else {
            c21238M14872.m47987(true);
            if (enumC13697 == EnumC13697.SMB3_ONLY) {
                c21238M14872.m47988(EnumC23366.SMB_3_1_1, EnumC23366.SMB_3_0_2, EnumC23366.SMB_3_0);
            }
        }
        if (enumC9673 != enumC9674) {
            c21238M14872.m47994(false);
            c21238M14872.m47992();
            if (enumC9673 == EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT) {
                c21238M14872.m47995();
            }
        }
        if (z) {
            c21238M14872.m47991(true);
        }
        return c21238M14872.m47979();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7384(C13836 c13836) {
        for (EnumC13697 enumC13697 : EnumC13697.values()) {
            for (EnumC9673 enumC9673 : EnumC9673.values()) {
                if (enumC9673 == EnumC9673.DEFAULT_SIGNED || enumC13697 == EnumC13697.SMB2_ONLY) {
                    f8088.m45584(new C8332(c13836, enumC9673, enumC13697));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12356 m7375(C13836 c13836, EnumC13697 enumC13697, boolean z, boolean z2) {
        IOException e;
        C20139 c20139 = f8088;
        if (!z2 || enumC13697 == EnumC13697.SMB3_ONLY) {
            e = null;
        } else {
            try {
                return m7374(new C8332(c13836, EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT, EnumC13697.SMB2_ONLY));
            } catch (IOException e2) {
                e = e2;
                c20139.m45584(new C8332(c13836, EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT, EnumC13697.SMB2_ONLY));
            }
        }
        if (z && enumC13697 != EnumC13697.SMB3_ONLY) {
            try {
                return m7374(new C8332(c13836, EnumC9673.SMB2_UNSIGNED, EnumC13697.SMB2_ONLY));
            } catch (IOException unused) {
                c20139.m45584(new C8332(c13836, EnumC9673.SMB2_UNSIGNED, EnumC13697.SMB2_ONLY));
            }
        }
        try {
            return m7374(new C8332(c13836, EnumC9673.DEFAULT_SIGNED, enumC13697));
        } catch (IOException e3) {
            if (enumC13697 == EnumC13697.SMB3_ONLY || !m7382(c13836, e3)) {
                throw e3;
            }
            try {
                return m7374(new C8332(c13836, EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT, EnumC13697.SMB2_ONLY));
            } catch (IOException e4) {
                m7377(e4, e3);
                if (e != null) {
                    m7377(e4, e);
                }
                throw e4;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12356 m7374(C8332 c8332) throws IOException {
        try {
            return (C12356) f8088.m45582(c8332);
        } catch (Exception e) {
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            throw new IOException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7380(C13836 c13836, C5144 c5144, EnumC13697 enumC13697, C24975 c24975) throws Exception {
        try {
            m7379(c13836, c5144, EnumC9673.DEFAULT_SIGNED, enumC13697, c24975);
        } catch (Exception e) {
            if (enumC13697 == EnumC13697.SMB3_ONLY || !m7382(c13836, e)) {
                throw e;
            }
            try {
                m7379(c13836, c5144, EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT, EnumC13697.SMB2_ONLY, c24975);
            } catch (Exception e2) {
                m7377(e2, e);
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7379(C13836 c13836, C5144 c5144, EnumC9673 enumC9673, EnumC13697 enumC13697, C24975 c24975) {
        C23249 c23249 = new C23249(m7372(false, enumC9673, enumC13697));
        C24845 c24845 = null;
        try {
            C24845 c24845M51796 = c23249.m51796(c13836.f39097, c13836.f39094);
            if ((enumC9673 == EnumC9673.SMB2_UNSIGNED) && c24845M51796.m54570().m20231()) {
                throw new IOException("SMB server requires signing");
            }
            new C5242(EnumC4453.f9988.m9327(c24845M51796.m54557(c5144))).m11314(((C13836) c24975.f79748).f39094);
            try {
                c24845M51796.m54561(true);
            } catch (IOException unused) {
            }
            C2700.m4192(c23249);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    c24845.m54561(true);
                } catch (IOException unused2) {
                }
            }
            C2700.m4192(c23249);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8471 m7373(C13836 c13836, EnumC13697 enumC13697, boolean z, EnumC17187 enumC17187) {
        C15707 c15707M7376;
        C21545 c21545 = new C21545();
        C6485 c6485M7372 = m7372(z, EnumC9673.DEFAULT_SIGNED, enumC13697);
        try {
            C5144 c5144M7385 = m7385(c13836);
            try {
                c15707M7376 = m7376(c13836, c6485M7372, c5144M7385, c21545);
            } catch (Exception e) {
                if (enumC13697 == EnumC13697.SMB3_ONLY || !m7382(c13836, e)) {
                    throw e;
                }
                try {
                    c15707M7376 = m7376(c13836, m7372(false, EnumC9673.SMB2_GUEST_UNSIGNED_COMPAT, EnumC13697.SMB2_ONLY), c5144M7385, c21545);
                } catch (Exception e2) {
                    m7377(e2, e);
                    throw e2;
                }
            }
            EnumC17187 enumC17188 = EnumC17187.SMB3_ONLY;
            if (enumC17187 == enumC17188) {
                return new C8471(enumC17188, null, false);
            }
            return new C8471(EnumC17187.SMB2_ONLY, null, c15707M7376.m35767());
        } catch (Exception e3) {
            return C21883.m49339(e3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15707 m7376(C13836 c13836, C6485 c6485, C5144 c5144, C21545 c21545) throws Exception {
        C23249 c23249 = new C23249(c6485);
        try {
            C24845 c24845M51796 = c23249.m51796(c13836.f39097, c13836.f39094);
            try {
                c24845M51796.m54557(c5144);
                C15707 c15707 = new C15707((c24845M51796.m54564().m49973().m52019() || c24845M51796.m54570().m20231()) ? false : true);
                try {
                    c24845M51796.m54561(true);
                } catch (IOException unused) {
                } finally {
                    C2700.m4192(c23249);
                }
                return c15707;
            } catch (Throwable th) {
                try {
                    try {
                        c24845M51796.m54561(true);
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                } catch (IOException unused2) {
                } finally {
                    C2700.m4192(c23249);
                }
                throw th;
            }
        } catch (Exception e) {
            C2700.m4192(c23249);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7383(C12356 c12356) {
        try {
            f8088.m45585(c12356.f34482, c12356);
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7378(C12356 c12356) {
        try {
            f8088.m45583(c12356.f34482, c12356);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7382(C13836 c13836, Exception exc) {
        String str = c13836.f39098;
        String str2 = c13836.f39095;
        if (TextUtils.isEmpty(str)) {
            return (TextUtils.isEmpty(str2) || str2.equals("guest")) && m7381(exc, Collections.newSetFromMap(new IdentityHashMap()));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7381(Throwable th, Set set) {
        if (th == null || !set.add(th)) {
            return false;
        }
        if (th instanceof C3543) {
            return true;
        }
        for (Throwable th2 : th.getSuppressed()) {
            if (m7381(th2, set)) {
                return true;
            }
        }
        return m7381(th.getCause(), set);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7377(Throwable th, Throwable th2) {
        if (th != th2) {
            th.addSuppressed(th2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static C5144 m7385(C13836 c13836) {
        String str = c13836.f39095;
        String str2 = c13836.f39098;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return new C5144("", new char[0], null);
        }
        if (str.equals("guest") && TextUtils.isEmpty(str2)) {
            return new C5144("Guest", new char[0], null);
        }
        return new C5144(str, str2.toCharArray(), c13836.f39093);
    }
}
