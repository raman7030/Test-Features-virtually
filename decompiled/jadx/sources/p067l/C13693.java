package p067l;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.C0708d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۨ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C13693 {

    /* JADX INFO: renamed from: ֫ */
    public FutureC5767 f38627;

    /* JADX INFO: renamed from: ۘ */
    public final C24913 f38629;

    /* JADX INFO: renamed from: ۜ */
    public FutureC5767 f38630;

    /* JADX INFO: renamed from: ۡ */
    public final C25072 f38631;

    /* JADX INFO: renamed from: ۢ */
    public C12332 f38632;

    /* JADX INFO: renamed from: ۧ */
    public final C3141 f38633;

    /* JADX INFO: renamed from: ܳ */
    public C13573 f38634;

    /* JADX INFO: renamed from: ܺ */
    public boolean f38635;

    /* JADX INFO: renamed from: ܽ */
    public C23731 f38636;

    /* JADX INFO: renamed from: ܿ */
    public C15271 f38637;

    /* JADX INFO: renamed from: ᩳ */
    public FutureC5767 f38638;

    /* JADX INFO: renamed from: ᩴ */
    public final C6495 f38639;

    /* JADX INFO: renamed from: ᩷ */
    public int f38640;

    /* JADX INFO: renamed from: ۖ */
    public int f38628 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public FutureC5767 f38641 = FutureC5767.m12882(0L);

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m31130(C23731 c23731) {
        if (this.f38636 != null || this.f38627 != null || this.f38638 != null) {
            throw new IllegalStateException("Session directory lease is already owned");
        }
        this.f38636 = c23731;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0170 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x018b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01a3 */
    /* JADX WARN: Code duplicated, block: B:133:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C13693 m31105(InterfaceC22097 interfaceC22097, C3455 c3455, C6808 c6808, Executor executor, int i, InterfaceC18588 interfaceC18588, String str) throws Throwable {
        Throwable th;
        C24913 c24913M42963;
        C12332 c12332;
        C6495 c6495;
        Throwable th2;
        C6495 c6496;
        C24913 c24913;
        C12332 c12333;
        Throwable e;
        C14443 c14443;
        Throwable th3;
        C12332 c12334;
        C24913 c24914;
        C12332 c12332M19159;
        Throwable th4;
        C12332 c12335;
        C8308 c8308;
        Throwable th5;
        C6495 c6497;
        if (C18743.exists(interfaceC22097.resolve("app-pages"), EnumC16060.NOFOLLOW_LINKS)) {
            return C15271.m34752(interfaceC22097).m34760(new C8467(c3455, c6808, executor), i, interfaceC18588);
        }
        C12826.requireNonNull(c3455);
        C12826.requireNonNull(c6808);
        C12826.requireNonNull(executor);
        C12826.requireNonNull(interfaceC18588);
        if (i < 0) {
            throw new IllegalArgumentException("Negative fragment state limit");
        }
        m31111(interfaceC18588);
        try {
            C18878 c18878M54719 = C24913.m54719(interfaceC22097, c3455, c6808);
            try {
                m31111(interfaceC18588);
                if (str != null) {
                    C11920.m27242(interfaceC22097, str, c18878M54719.m42962());
                }
                try {
                    if (C9847.m23109(c18878M54719.m42962(), c18878M54719.m42961()) != null) {
                        c12332M19159 = C8308.m19152(c18878M54719, interfaceC22097, c3455, i).m19158();
                        try {
                            m31111(interfaceC18588);
                            c24913M42963 = c18878M54719.m42963();
                            try {
                                c24913M42963.m54768();
                                c6496 = new C6495(c24913M42963);
                                c12332M19159.f34416.m19163(c24913M42963);
                                m31111(interfaceC18588);
                                C13693 c13693 = new C13693(c24913M42963, c6496, c12332M19159, new C25072(c24913M42963, interfaceC22097, c3455, executor));
                                c13693.f38631.f79987 = new C8467(c3455, c6808, executor);
                                try {
                                    c18878M54719.close();
                                    return c13693;
                                } catch (IOException | Error | RuntimeException e2) {
                                    e = e2;
                                    c12332 = c12332M19159;
                                    th = e;
                                    c6495 = c6496;
                                    if (c12332 != null) {
                                        c12332.close();
                                    }
                                    if (c6495 != null) {
                                        try {
                                            c6495.close();
                                        } catch (Throwable th6) {
                                            th.addSuppressed(th6);
                                        }
                                    }
                                    if (c24913M42963 != null) {
                                        try {
                                            c24913M42963.m54734().m12907();
                                            throw th;
                                        } catch (Throwable th7) {
                                            th.addSuppressed(th7);
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                c6497 = null;
                                c6496 = c6497;
                                c24913 = c24913M42963;
                                c12333 = c12332M19159;
                                th2 = th;
                                try {
                                    c18878M54719.close();
                                    throw th2;
                                } catch (Throwable th9) {
                                    try {
                                        th2.addSuppressed(th9);
                                        throw th2;
                                    } catch (IOException | Error | RuntimeException e3) {
                                        e = e3;
                                        c24913M42963 = c24913;
                                        c12332 = c12333;
                                        th = e;
                                        c6495 = c6496;
                                        if (c12332 != null) {
                                            c12332.close();
                                        }
                                        if (c6495 != null) {
                                            c6495.close();
                                        }
                                        if (c24913M42963 != null) {
                                            c24913M42963.m54734().m12907();
                                            throw th;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c6496 = null;
                            c24913 = null;
                            c12333 = c12332M19159;
                            th2 = th;
                            c18878M54719.close();
                            throw th2;
                        }
                    }
                    C19966 c19966M45315 = C19966.m45315(c18878M54719, interfaceC22097, c3455, i);
                    C8168 c8168 = c19966M45315.f60607;
                    C14443 c14443M42965 = c18878M54719.m42965();
                    try {
                        c14443 = c14443M42965;
                        try {
                            C14343 c14343M19154 = C8308.m19154(c14443M42965, c19966M45315.f60606.m46652(), c19966M45315.f60608, C5154.m11005(c8168), c19966M45315.f60605, c19966M45315.f60604, i);
                            try {
                                C8308 c8308M19156 = C8308.m19156(c14343M19154.m32941(), i, c14443);
                                try {
                                    m31111(interfaceC18588);
                                    c8308 = c8308M19156;
                                    try {
                                        C13280 c13280M30341 = C13280.m30341(interfaceC22097, c18878M54719.m42962(), new ByteArrayInputStream(c14343M19154.m32941()), c14343M19154.m32941().length, i, c3455);
                                        m31111(interfaceC18588);
                                        c24913M42963 = c18878M54719.m42963();
                                        try {
                                            c24913M42963.m54768();
                                            c6496 = new C6495(c24913M42963, c8168.m18952());
                                            try {
                                                C9217 c9217M54763 = c24913M42963.m54763();
                                                try {
                                                    c24913M42963.m54757(c9217M54763.m21233(C9847.m23110(c9217M54763.m21232(), c13280M30341, c24913M42963.m54755()))).m12907();
                                                    c9217M54763.close();
                                                    c12332M19159 = c8308.m19159(c24913M42963, c19966M45315.f60608);
                                                    try {
                                                        c8308.close();
                                                        try {
                                                            c14343M19154.close();
                                                            try {
                                                                c14443.close();
                                                                c12332M19159.f34416.m19163(c24913M42963);
                                                                m31111(interfaceC18588);
                                                                C13693 c13694 = new C13693(c24913M42963, c6496, c12332M19159, new C25072(c24913M42963, interfaceC22097, c3455, executor));
                                                                c13694.f38631.f79987 = new C8467(c3455, c6808, executor);
                                                                c18878M54719.close();
                                                                return c13694;
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                c6497 = c6496;
                                                                c6496 = c6497;
                                                                c24913 = c24913M42963;
                                                                c12333 = c12332M19159;
                                                                th2 = th;
                                                                c18878M54719.close();
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            c24914 = c24913M42963;
                                                            c12334 = c12332M19159;
                                                            th3 = th;
                                                            try {
                                                                c14443.close();
                                                                throw th3;
                                                            } catch (Throwable th13) {
                                                                th3.addSuppressed(th13);
                                                                throw th3;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        C12332 c12336 = c12332M19159;
                                                        th4 = th;
                                                        C12332 c12337 = c12336;
                                                        c24914 = c24913M42963;
                                                        c12335 = c12337;
                                                        try {
                                                            c14343M19154.close();
                                                            throw th4;
                                                        } catch (Throwable th15) {
                                                            th4.addSuppressed(th15);
                                                            throw th4;
                                                        }
                                                    }
                                                } catch (Throwable th16) {
                                                    try {
                                                        c9217M54763.close();
                                                        throw th16;
                                                    } catch (Throwable th17) {
                                                        th16.addSuppressed(th17);
                                                        throw th16;
                                                    }
                                                }
                                            } catch (Throwable th18) {
                                                th5 = th18;
                                                try {
                                                    c8308.close();
                                                    throw th5;
                                                } catch (Throwable th19) {
                                                    th5.addSuppressed(th19);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th20) {
                                            th5 = th20;
                                            c6496 = null;
                                            c8308.close();
                                            throw th5;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        th5 = th;
                                        c24913M42963 = null;
                                        c6496 = null;
                                        c8308.close();
                                        throw th5;
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
                                    c8308 = c8308M19156;
                                }
                            } catch (Throwable th23) {
                                th4 = th23;
                                c12335 = null;
                                c6496 = null;
                                c24914 = null;
                            }
                        } catch (Throwable th24) {
                            th = th24;
                            th3 = th;
                            c12334 = null;
                            c6496 = null;
                            c24914 = null;
                            c14443.close();
                            throw th3;
                        }
                    } catch (Throwable th25) {
                        th = th25;
                        c14443 = c14443M42965;
                    }
                } catch (IllegalStateException e4) {
                    throw new IOException("Invalid fragment recovery metadata", e4);
                }
            } catch (Throwable th26) {
                th2 = th26;
                c6496 = null;
                c24913 = null;
                c12333 = null;
            }
        } catch (IOException | Error | RuntimeException e5) {
            th = e5;
            c24913M42963 = null;
            c12332 = null;
            c6495 = null;
        }
        if (c12332 != null) {
            c12332.close();
        }
        if (c6495 != null) {
            c6495.close();
        }
        if (c24913M42963 != null) {
            c24913M42963.m54734().m12907();
            throw th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31108(Throwable th) {
        C23731 c23731;
        synchronized (this) {
            c23731 = this.f38636;
            this.f38636 = null;
        }
        if (c23731 != null) {
            c23731.m52769(th);
        }
    }

    public C13693(C24913 c24913, C6495 c6495, C12332 c12332, C25072 c25072) {
        this.f38629 = c24913;
        this.f38639 = c6495;
        this.f38632 = c12332;
        this.f38631 = c25072;
        this.f38633 = new C3141(c6495);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13693 m31106(InterfaceC22097 interfaceC22097, C8467 c8467) {
        C24913 c24913M54703 = C24913.m54703(interfaceC22097, c8467.f22723, c8467.f22725);
        c24913M54703.m54768();
        C13693 c13693 = new C13693(c24913M54703, new C6495(c24913M54703), null, new C25072(c24913M54703, interfaceC22097, c8467.f22723, c8467.f22724));
        c13693.f38631.f79987 = c8467;
        return c13693;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31125(int i, int i2, CharSequence charSequence) {
        C6495 c6495 = this.f38639;
        c6495.m14912(c6495.length(), c6495.length(), charSequence, i, i2);
        this.f38629.m54752();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31128(C8308 c8308, Bundle bundle, C24301 c24301, String str, C8467 c8467, InterfaceC18588 interfaceC18588, int i) {
        C24913 c24913 = this.f38629;
        c24913.m54772();
        C6495 c6495 = this.f38639;
        c6495.setSelection(i, i);
        c6495.mo3998(false);
        C14443 c14443M54760 = c24913.m54760();
        try {
            C14343 c14343M19161 = c8308.m19161(c14443M54760, bundle, c24301, str, 0, 0, true);
            c14443M54760.close();
            this.f38631.getClass();
            m31107(bundle, c24301, c14343M19161, c8467, 8388608, interfaceC18588, false);
        } catch (Throwable th) {
            try {
                c14443M54760.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31129(C15271 c15271, int i, int i2) {
        this.f38637 = c15271;
        this.f38640 = i;
        Bundle bundleM34765 = c15271.m34765();
        C24913 c24913 = this.f38629;
        C14443 c14443M54760 = c24913.m54760();
        try {
            C14343 c14343M19162 = this.f38632.f34416.m19162(c14443M54760, bundleM34765, c15271.m34768() == 1 ? this.f38632.f34415 : c15271.m34769(), c15271.m34770(), true, i2);
            c14443M54760.close();
            try {
                C14443 c14443M54761 = c24913.m54760();
                try {
                    C8308 c8308M19156 = C8308.m19156(c14343M19162.m32941(), i2, c14443M54761);
                    try {
                        C12332 c12332M19159 = c8308M19156.m19159(c24913, c15271.m34768() == 1 ? this.f38632.f34415 : c15271.m34769());
                        C12332 c12332 = this.f38632;
                        this.f38632 = c12332M19159;
                        if (c12332 != null) {
                            c12332.close();
                        }
                        c8308M19156.close();
                        c14443M54761.close();
                        c14343M19162.close();
                        C25072 c25072 = this.f38631;
                        c25072.f79993 = c15271;
                        c25072.f79991 = i;
                    } catch (Throwable th) {
                        try {
                            c8308M19156.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c14443M54761.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    c14343M19162.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c14443M54760.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31124(int i) {
        Bundle bundleM46652 = this.f38632.f34416.f22201.m46652();
        bundleM46652.putInt("textPageSize", i);
        C24913 c24913 = this.f38629;
        C14443 c14443M54760 = c24913.m54760();
        try {
            C12332 c12332 = this.f38632;
            C14343 c14343M19160 = c12332.f34416.m19160(c14443M54760, bundleM46652, c12332.f34415);
            try {
                C8308 c8308M19156 = C8308.m19156(c14343M19160.m32941(), 8388608, c14443M54760);
                try {
                    C12332 c12332M19159 = c8308M19156.m19159(c24913, this.f38632.f34415);
                    C12332 c12333 = this.f38632;
                    this.f38632 = c12332M19159;
                    if (c12333 != null) {
                        c12333.close();
                    }
                    c8308M19156.close();
                    c14343M19160.close();
                    c14443M54760.close();
                } catch (Throwable th) {
                    try {
                        c8308M19156.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c14343M19160.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c14443M54760.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31127(C5154 c5154, byte[] bArr, byte[] bArr2, C8467 c8467, int i) {
        Bundle bundleM46652 = this.f38632.f34416.f22201.m46652();
        C14443 c14443M54760 = this.f38629.m54760();
        try {
            C12332 c12332 = this.f38632;
            C14343 c14343M19154 = C8308.m19154(c14443M54760, bundleM46652, c12332.f34415, c12332.f34416.f22199.m11014(c5154), bArr, bArr2, i);
            c14443M54760.close();
            this.f38631.getClass();
            m31107(bundleM46652, this.f38632.f34415, c14343M19154, c8467, i, (InterfaceC18588) new C13261(), false);
        } catch (Throwable th) {
            try {
                c14443M54760.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13693 m31122(InterfaceC22097 interfaceC22097, AbstractC5526 abstractC5526, boolean z, int i, C8467 c8467, InterfaceC18588 interfaceC18588, boolean z2) throws IOException {
        C14343 c14343M19162;
        int i2;
        Bundle bundleM46652 = this.f38632.f34416.f22201.m46652();
        boolean z3 = bundleM46652.getBoolean("e2SourcePending");
        C24913 c24913 = this.f38629;
        if (!z3 && c24913.m54753().m16599()) {
            return this;
        }
        SystemClock.elapsedRealtime();
        if (z3) {
            C13083 c13083M43429 = C19117.m43429(abstractC5526, z, i, interfaceC18588);
            m31111(interfaceC18588);
            if (c13083M43429 != null) {
                m31109(abstractC5526, false, c13083M43429, 0, 0, c8467, interfaceC18588, z2);
                m31119();
                return this;
            }
            if (bundleM46652.getInt("textPageSize") <= 0 && this.f38637 == null) {
                this.f38634 = C13573.m30891(c24913, new C6967(abstractC5526), c8467.f22723, i, interfaceC18588);
            } else {
                return C15271.m34746(this, interfaceC22097, abstractC5526, i, c8467, interfaceC18588, -1L);
            }
        } else {
            InterfaceC22232 c6967 = new C6967(abstractC5526);
            if (interfaceC18588 instanceof C4305) {
                c6967 = new C24401(c6967, interfaceC18588);
            }
            this.f38634 = C13573.m30890(c24913, c6967, this.f38632.f34415.f76968);
        }
        m31119();
        String strM16594 = this.f38634.m30896().m16594();
        String strM11011 = z3 ? strM16594 : this.f38632.f34416.f22199.m11011(strM16594);
        C19946 c19946M30898 = this.f38634.m30898();
        try {
            m31111(interfaceC18588);
            C6495 c6495 = this.f38639;
            if (c19946M30898 != null) {
                InterfaceC3221 interfaceC3221M28594 = c6495.m28594();
                C12826.requireNonNull(interfaceC3221M28594);
                interfaceC3221M28594.mo5556(c19946M30898);
            }
            if (c19946M30898 != null) {
                c19946M30898.close();
            }
            if (!this.f38634.m30896().m16599() && this.f38634.m30896().m16597() != EnumC2550.LOADING) {
                throw new IOException("Cannot prepare source text", this.f38634.m30895());
            }
            C24301 c24301M30897 = z3 ? this.f38634.m30897() : this.f38632.f34415;
            if (z3) {
                c6495.setSelection(0, 0);
                c6495.mo3998(false);
            }
            bundleM46652.putBoolean("e2SourcePending", false);
            bundleM46652.putBoolean("changed", c6495.isChanged());
            bundleM46652.putBoolean(C0708d.f2599O, false);
            if (z3) {
                bundleM46652.putLong("fileTime", ((C6867) abstractC5526).f17850.mo25091());
                bundleM46652.putBoolean("checkFileExists", true);
            }
            String strM16595 = (z3 || strM11011.equals(strM16594)) ? this.f38634.m30896().m16594() : strM11011;
            C14443 c14443M54760 = c24913.m54760();
            try {
                if (z3) {
                    i2 = 8388608;
                    c14343M19162 = this.f38632.f34416.m19161(c14443M54760, bundleM46652, c24301M30897, strM16595, 0, 0, this.f38634.m30896().m16599());
                } else {
                    c14343M19162 = this.f38632.f34416.m19162(c14443M54760, bundleM46652, c24301M30897, strM16595, this.f38634.m30896().m16599(), 8388608);
                    i2 = 8388608;
                }
                c14443M54760.close();
                m31107(bundleM46652, c24301M30897, c14343M19162, c8467, i2, interfaceC18588, z2 && this.f38634.m30896().m16599());
                m31119();
                C13573 c13573 = this.f38634;
                boolean zM16599 = c13573.m30896().m16599();
                while (c13573.m30896().m16597() == EnumC2550.LOADING) {
                    m31111(interfaceC18588);
                    C19946 c19946M30899 = c13573.m30898();
                    try {
                        m31111(interfaceC18588);
                        if (c19946M30899 != null) {
                            InterfaceC3221 interfaceC3221M28595 = c6495.m28594();
                            C12826.requireNonNull(interfaceC3221M28595);
                            interfaceC3221M28595.mo5556(c19946M30899);
                        }
                        if (c19946M30899 != null) {
                            c19946M30899.close();
                        }
                    } catch (Throwable th) {
                        if (c19946M30899 == null) {
                            throw th;
                        }
                        try {
                            c19946M30899.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m31111(interfaceC18588);
                if (!c13573.m30896().m16599()) {
                    throw new IOException("Cannot display incomplete source text", c13573.m30895());
                }
                String strM16596 = (z3 || strM11011.equals(strM16594)) ? c13573.m30896().m16594() : strM11011;
                c13573.close();
                this.f38634 = null;
                if (zM16599) {
                    m31119();
                    return this;
                }
                C14443 c14443M54761 = c24913.m54760();
                try {
                    C14343 c14343M19163 = this.f38632.f34416.m19162(c14443M54761, bundleM46652, c24301M30897, strM16596, true, 8388608);
                    c14443M54761.close();
                    m31107(bundleM46652, c24301M30897, c14343M19163, c8467, 8388608, interfaceC18588, z2);
                    m31119();
                    return this;
                } catch (Throwable th3) {
                    try {
                        c14443M54761.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c14443M54760.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            if (c19946M30898 == null) {
                throw th7;
            }
            try {
                c19946M30898.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 m31132() {
        return this.f38641.m12898((InterfaceC22729) new C15033(0));
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m31119() {
        SystemClock.elapsedRealtime();
        C24913 c24913 = this.f38629;
        c24913.length();
        Integer.toHexString(System.identityHashCode(c24913));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31126(Bundle bundle, C24301 c24301, C14343 c14343, C8467 c8467, C13261 c13261) {
        m31107(bundle, c24301, c14343, c8467, 8388608, (InterfaceC18588) c13261, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31107(Bundle bundle, C24301 c24301, C14343 c14343, C8467 c8467, int i, InterfaceC18588 interfaceC18588, boolean z) {
        C24913 c24913 = this.f38629;
        InterfaceC22097 interfaceC22097M55045 = this.f38631.m55045();
        try {
            C14443 c14443M54760 = c24913.m54760();
            try {
                C7479 c7479M33056 = c14443M54760.m33056((((long) c14343.m32941().length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
                try {
                    C8308 c8308M19156 = C8308.m19156(c14343.m32941(), i, c14443M54760);
                    try {
                        m31111(interfaceC18588);
                        C13280 c13280M30341 = C13280.m30341(interfaceC22097M55045, c24913.m54755(), new ByteArrayInputStream(c14343.m32941()), c14343.m32941().length, i, c8467.f22723);
                        C9217 c9217M54763 = c24913.m54763();
                        try {
                            FutureC5767 futureC5767M54757 = c24913.m54757(c9217M54763.m21233(C9847.m23110(c9217M54763.m21232(), c13280M30341, c24913.m54755())));
                            this.f38641 = futureC5767M54757;
                            if (!z) {
                                futureC5767M54757.m12907();
                            }
                            c9217M54763.close();
                            C11150.m25681(interfaceC22097M55045, bundle);
                            if (this.f38637 != null) {
                                this.f38641.m12907();
                                this.f38637.m34762(this.f38640, bundle, this.f38639.isChanged(), c24301.f76968, c8308M19156.f22199.m11011(this.f38637.m34770()));
                            }
                            C12332 c12332M19159 = c8308M19156.m19159(c24913, c24301);
                            C12332 c12332 = this.f38632;
                            this.f38632 = c12332M19159;
                            if (c12332 != null) {
                                c12332.close();
                            }
                            c8308M19156.close();
                            if (c7479M33056 != null) {
                                c7479M33056.close();
                            }
                            c14443M54760.close();
                            c14343.close();
                        } catch (Throwable th) {
                            try {
                                c9217M54763.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c8308M19156.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    if (c7479M33056 == null) {
                        throw th5;
                    }
                    try {
                        c7479M33056.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                    try {
                        c14343.close();
                        throw th;
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                try {
                    c14443M54760.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (Throwable th10) {
            c14343.close();
            throw th10;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m31131() {
        synchronized (this) {
            FutureC5767 futureC5767 = this.f38630;
            if (futureC5767 == null) {
                C13573 c13573 = this.f38634;
                if (c13573 == null) {
                    return FutureC5767.m12882(null);
                }
                FutureC5767 futureC5767M12873 = FutureC5767.m12873(new RunnableC2963(c13573), C4081.f8988);
                this.f38630 = futureC5767M12873;
                this.f38634 = null;
                return futureC5767M12873.m12898((InterfaceC22729) new C7470());
            }
            return futureC5767.m12898((InterfaceC22729) new C7470());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13693 m31123(InterfaceC22097 interfaceC22097, C6867 c6867, boolean z, boolean z2, int i, int i2, int i3, C8467 c8467, InterfaceC18588 interfaceC18588, boolean z3) throws IOException {
        long jMax;
        C24913 c24913 = this.f38629;
        if (z3) {
            jMax = Math.max(0, c24913.m54762().m16550());
            if (this.f38637 != null) {
                for (int i4 = 0; i4 < this.f38640; i4++) {
                    m31111(interfaceC18588);
                    C9729 c9729M34758 = this.f38637.m34758(i4, c8467);
                    try {
                        jMax += (long) c9729M34758.length();
                        c9729M34758.close();
                    } catch (Throwable th) {
                        try {
                            c9729M34758.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
        } else {
            jMax = -1;
        }
        long j = jMax;
        C13083 c13083M43428 = z ? C19117.m43428() : C19117.m43429(c6867, z2, i, interfaceC18588);
        m31111(interfaceC18588);
        if (c13083M43428 == null && (this.f38637 != null || this.f38632.f34416.f22201.m46652().getInt("textPageSize") > 0)) {
            return C15271.m34746(this, interfaceC22097, c6867, i, c8467, interfaceC18588, j);
        }
        if (this.f38637 != null) {
            return C15271.m34745(this, c6867, z, c13083M43428, c8467, interfaceC18588, j);
        }
        if (c13083M43428 == null) {
            C6495 c6495 = this.f38639;
            c6495.replace(0, c6495.length(), (CharSequence) "");
            c24913.m54772();
            c6495.setSelection(0, 0);
            c6495.mo3998(false);
            Bundle bundleM46652 = this.f38632.f34416.f22201.m46652();
            bundleM46652.putBoolean("e2SourcePending", true);
            C14443 c14443M54760 = c24913.m54760();
            try {
                C14343 c14343M19161 = this.f38632.f34416.m19161(c14443M54760, bundleM46652, (C24301) null, "\n", i2, i3, false);
                try {
                    C8308 c8308M19156 = C8308.m19156(c14343M19161.m32941(), 8388608, c14443M54760);
                    try {
                        C12332 c12332M19159 = c8308M19156.m19159(c24913, (C24301) null);
                        C12332 c12332 = this.f38632;
                        this.f38632 = c12332M19159;
                        if (c12332 != null) {
                            c12332.close();
                        }
                        c8308M19156.close();
                        c14343M19161.close();
                        c14443M54760.close();
                        return m31122(interfaceC22097, (AbstractC5526) c6867, z2, i, c8467, interfaceC18588, true);
                    } catch (Throwable th3) {
                        try {
                            c8308M19156.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        c14343M19161.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                try {
                    c14443M54760.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        }
        m31109(c6867, z, c13083M43428, i2, i3, c8467, interfaceC18588, true);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m31109(AbstractC5526 abstractC5526, boolean z, C13083 c13083, int i, int i2, C8467 c8467, InterfaceC18588 interfaceC18588, boolean z2) throws IOException {
        CharSequence charSequence = c13083.f36779;
        m31111(interfaceC18588);
        C6495 c6495 = this.f38639;
        c6495.replace(0, c6495.length(), (CharSequence) "");
        C24913 c24913 = this.f38629;
        c24913.m54752();
        int i3 = 0;
        while (i3 < charSequence.length()) {
            long j = i3;
            int iMin = (int) Math.min(charSequence.length(), ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF + j);
            CharSequence charSequence2 = c13083.f36779;
            m31111(interfaceC18588);
            if ((((long) c6495.length()) + ((long) iMin)) - j > 2147483647L) {
                throw new IOException("Reloaded text exceeds coordinate limit");
            }
            c6495.m14912(c6495.length(), c6495.length(), charSequence2, i3, iMin);
            c24913.m54752();
            i3 = iMin;
        }
        c24913.m54772();
        c6495.setSelection(0, 0);
        c6495.mo3998(false);
        Bundle bundleM46652 = this.f38632.f34416.f22201.m46652();
        bundleM46652.putBoolean("changed", false);
        bundleM46652.putBoolean(C0708d.f2599O, false);
        bundleM46652.putBoolean("e2SourcePending", false);
        if (!z) {
            bundleM46652.putLong("fileTime", ((C6867) abstractC5526).f17850.mo25091());
            bundleM46652.putBoolean("checkFileExists", true);
        }
        C14443 c14443M54760 = c24913.m54760();
        try {
            C14343 c14343M19161 = this.f38632.f34416.m19161(c14443M54760, bundleM46652, c13083.f36778, c13083.f36776, i, i2, true);
            c14443M54760.close();
            m31107(bundleM46652, c13083.f36778, c14343M19161, c8467, 8388608, interfaceC18588, z2);
        } catch (Throwable th) {
            try {
                c14443M54760.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bundle m31113(InterfaceC22097 interfaceC22097, C8467 c8467) throws Throwable {
        C24301 c24301;
        C13693 c13693M31105 = m31105(interfaceC22097, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, new C13261(), (String) null);
        try {
            Bundle bundleM46652 = c13693M31105.f38632.f34416.f22201.m46652();
            String string = bundleM46652.getString("filePath");
            if (string == null || string.equals("untitled")) {
                throw new IOException("Untitled session requires an output path");
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(string, new String[0]);
            C6867 c6867 = new C6867(abstractC17043M42109);
            c13693M31105 = c13693M31105.m31122(interfaceC22097, (AbstractC5526) c6867, bundleM46652.getBoolean("forceTryAXml") || bundleM46652.getBoolean("forceTryClass"), -1, c8467, (InterfaceC18588) new C13261(), false);
            C24913 c24913 = c13693M31105.f38629;
            String strM11011 = c13693M31105.f38632.f34416.f22199.m11011(c24913.m54753().m16594());
            if (!c24913.m54753().m16599() || (c24301 = c13693M31105.f38632.f34415) == null) {
                throw new IOException("Session text is not ready for saving");
            }
            C16434 c16434M37346 = C16434.m37346(c13693M31105, strM11011, c24301);
            try {
                c16434M37346.m37350(c6867);
                c16434M37346.m37349();
                c16434M37346.close();
                c13693M31105.f38639.mo3998(false);
                Bundle bundleM46653 = c13693M31105.f38632.f34416.f22201.m46652();
                bundleM46653.putBoolean("changed", false);
                bundleM46653.putBoolean(C0708d.f2599O, false);
                bundleM46653.putLong("fileTime", abstractC17043M42109.mo25091());
                bundleM46653.putBoolean("checkFileExists", true);
                C14443 c14443M54760 = c24913.m54760();
                try {
                    C12332 c12332 = c13693M31105.f38632;
                    C14343 c14343M19162 = c12332.f34416.m19162(c14443M54760, bundleM46653, c12332.f34415, strM11011, true, 8388608);
                    c14443M54760.close();
                    c13693M31105.m31107(bundleM46653, c13693M31105.f38632.f34415, c14343M19162, c8467, 8388608, (InterfaceC18588) new C13261(), false);
                    c13693M31105.m31121(c24913.m54774()).m12907();
                    return bundleM46653;
                } catch (Throwable th) {
                    try {
                        c14443M54760.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c16434M37346.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            c13693M31105.m31120().m12907();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31111(InterfaceC18588 interfaceC18588) {
        if (interfaceC18588.mo3924()) {
            throw new CancellationException("Fragment recovery is canceled");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31112(InterfaceC22097 interfaceC22097, C2943 c2943, C8467 c8467) {
        C13693 c13693M31105 = m31105(interfaceC22097, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, new C13261(), (String) null);
        C24913 c24913 = c13693M31105.f38629;
        Throwable th = null;
        try {
            try {
                Bundle bundleM46652 = c13693M31105.f38632.f34416.f22201.m46652();
                c2943.m4836(bundleM46652);
                C14443 c14443M54760 = c24913.m54760();
                try {
                    C12332 c12332 = c13693M31105.f38632;
                    C14343 c14343M19160 = c12332.f34416.m19160(c14443M54760, bundleM46652, c12332.f34415);
                    c14443M54760.close();
                    c13693M31105.m31107(bundleM46652, c13693M31105.f38632.f34415, c14343M19160, c8467, 8388608, (InterfaceC18588) new C13261(), false);
                    c13693M31105.m31121(c24913.m54774()).m12907();
                    c13693M31105.m31120().m12907();
                } catch (Throwable th2) {
                    try {
                        c14443M54760.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c13693M31105.m31120().m12907();
                    throw th4;
                } catch (Error | RuntimeException e) {
                    if (0 == 0) {
                        throw e;
                    }
                    th.addSuppressed(e);
                    throw th4;
                }
            }
        } catch (IOException | Error | RuntimeException e2) {
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m31121(long j) {
        synchronized (this) {
            FutureC5767 futureC5767 = this.f38638;
            if (futureC5767 == null) {
                FutureC5767 futureC5768 = this.f38627;
                if (futureC5768 == null) {
                    synchronized (this.f38629) {
                        if (this.f38629.m54774() != j || this.f38629.m54764() < j) {
                            throw new IllegalStateException("Fragment final checkpoint is not current and durable");
                        }
                    }
                    this.f38633.close();
                    this.f38639.close();
                    final FutureC5767 futureC5769 = new FutureC5767();
                    this.f38627 = futureC5769;
                    FutureC5767 futureC5767M55039 = this.f38631.m55039();
                    C25072 c25072 = this.f38631;
                    C12826.requireNonNull(c25072);
                    futureC5767M55039.m12897(new RunnableC3241(1, c25072), C4081.f8988).m12888((InterfaceC16692) new C21740()).m12904(new InterfaceC22729() { // from class: l.ۙ᩵ᩳ
                        @Override // p067l.InterfaceC22729
                        public final Object apply(Object obj) {
                            final Throwable th = (Throwable) obj;
                            final C13693 c13693 = this.f18193;
                            C15271 c15271 = c13693.f38637;
                            return (c15271 == null ? FutureC5767.m12882(null) : c15271.m34767()).m12904(new InterfaceC22729() { // from class: l.᩸᩵ᩳ
                                @Override // p067l.InterfaceC22729
                                public final Object apply(Object obj2) {
                                    return c13693.f38629.m54769();
                                }
                            }).m12888(new InterfaceC16692() { // from class: l.᩹᩵ᩳ
                                @Override // p067l.InterfaceC16692
                                /* JADX INFO: renamed from: ֫ */
                                public final Object mo27141(Object obj2, Throwable th2) {
                                    return C13693.m31118(th, th2);
                                }
                            });
                        }
                    }).m12887(new InterfaceC9988() { // from class: l.ۗ᩵ᩳ
                        @Override // p067l.InterfaceC9988
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo6895(Object obj, Throwable th) {
                            C13693.m31110(this.f13702, futureC5769, (Throwable) obj, th);
                        }
                    });
                    return futureC5769.m12898((InterfaceC22729) new C7470());
                }
                return futureC5768.m12898((InterfaceC22729) new C7470());
            }
            return futureC5767.m12898((InterfaceC22729) new C7470());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31110(C13693 c13693, FutureC5767 futureC5767, Throwable th, Throwable th2) {
        C12332 c12332;
        Throwable thM31118 = m31118(th, th2);
        synchronized (c13693) {
            c12332 = c13693.f38632;
            c13693.f38632 = null;
        }
        if (c12332 != null) {
            c12332.close();
        }
        c13693.m31108(thM31118);
        if (thM31118 == null) {
            futureC5767.m12889((Object) null);
            return;
        }
        if ((thM31118 instanceof C15154) && thM31118.getCause() != null) {
            thM31118 = thM31118.getCause();
        }
        futureC5767.m12891(thM31118);
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m31120() {
        synchronized (this) {
            FutureC5767 futureC5767 = this.f38638;
            if (futureC5767 == null) {
                FutureC5767 futureC5768 = this.f38627;
                this.f38633.close();
                final FutureC5767 futureC5769 = new FutureC5767();
                this.f38638 = futureC5769;
                (futureC5768 == null ? FutureC5767.m12882(null) : futureC5768.m12888((InterfaceC16692) new C24420(6))).m12904((InterfaceC22729) new C14363(0, this)).m12888((InterfaceC16692) new C12352(this)).m12904((InterfaceC22729) new C8328(this)).m12904(new InterfaceC22729() { // from class: l.ۚ᩵ᩳ
                    @Override // p067l.InterfaceC22729
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        final C13693 c13693 = this.f20085;
                        C15271 c15271 = c13693.f38637;
                        return (c15271 == null ? FutureC5767.m12882(null) : c15271.m34767()).m12904(new InterfaceC22729() { // from class: l.۠᩵ᩳ
                            @Override // p067l.InterfaceC22729
                            public final Object apply(Object obj2) {
                                return c13693.f38629.m54734();
                            }
                        }).m12888((InterfaceC16692) new C17044(th));
                    }
                }).m12887(new InterfaceC9988() { // from class: l.֨᩵ᩳ
                    @Override // p067l.InterfaceC9988
                    /* JADX INFO: renamed from: ۧ */
                    public final void mo6895(Object obj, Throwable th) {
                        C13693.m31116(this.f7564, futureC5769, (Throwable) obj, th);
                    }
                });
                return futureC5769.m12898((InterfaceC22729) new C7470());
            }
            return futureC5767.m12898((InterfaceC22729) new C7470());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Throwable m31103(C13693 c13693, Throwable th) {
        try {
            c13693.f38639.close();
            return th;
        } catch (Throwable th2) {
            return m31118(th, th2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31116(C13693 c13693, FutureC5767 futureC5767, Throwable th, Throwable th2) {
        C12332 c12332;
        Throwable thM31118 = m31118(th, th2);
        synchronized (c13693) {
            c12332 = c13693.f38632;
            c13693.f38632 = null;
        }
        if (c12332 != null) {
            c12332.close();
        }
        c13693.m31108(thM31118);
        if (thM31118 == null) {
            futureC5767.m12889((Object) null);
            return;
        }
        if ((thM31118 instanceof C15154) && thM31118.getCause() != null) {
            thM31118 = thM31118.getCause();
        }
        futureC5767.m12891(thM31118);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Throwable m31118(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        if (th2 != null && th != th2) {
            th.addSuppressed(th2);
        }
        return th;
    }
}
