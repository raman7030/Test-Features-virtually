package l;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ۨ᩵ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes3.dex */
public final class C11915 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35618;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23721 f35620;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35621;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C23888 f35622;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10483 f35623;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0813 f35624;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11789 f35625;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f35626;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22477 f35627;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13576 f35628;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35629;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4342 f35630;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35631;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f35619 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public FutureC3575 f35632 = FutureC3575.m10905(0L);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m29078(C22477 c22477) {
        if (this.f35627 != null || this.f35618 != null || this.f35629 != null) {
            throw new IllegalStateException("Session directory lease is already owned");
        }
        this.f35627 = c22477;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0170 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x018b */
    /* JADX WARN: Bottom block not found for handler: all -> 0x01a3 */
    /* JADX WARN: Code duplicated, block: B:133:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11915 m29053(InterfaceC20758 interfaceC20758, C1143 c1143, C4671 c4671, Executor executor, int i, InterfaceC17066 interfaceC17066, String str) throws Throwable {
        Throwable th;
        C23721 c23721M40712;
        C10483 c10483;
        C4342 c4342;
        Throwable th2;
        C4342 c4343;
        C23721 c23721;
        C10483 c10484;
        Throwable e;
        C12704 c12704;
        Throwable th3;
        C10483 c10485;
        C23721 c23722;
        C10483 c10483M17221;
        Throwable th4;
        C10483 c10486;
        C6249 c6249;
        Throwable th5;
        C4342 c4344;
        if (C17229.exists(interfaceC20758.resolve("app-pages"), EnumC14406.NOFOLLOW_LINKS)) {
            return C13576.m32640(interfaceC20758).m32648(new C6417(c1143, c4671, executor), i, interfaceC17066);
        }
        C11003.requireNonNull(c1143);
        C11003.requireNonNull(c4671);
        C11003.requireNonNull(executor);
        C11003.requireNonNull(interfaceC17066);
        if (i < 0) {
            throw new IllegalArgumentException("Negative fragment state limit");
        }
        m29059(interfaceC17066);
        try {
            C17371 c17371M52316 = C23721.m52316(interfaceC20758, c1143, c4671);
            try {
                m29059(interfaceC17066);
                if (str != null) {
                    C10050.m25225(interfaceC20758, str, c17371M52316.m40711());
                }
                try {
                    if (C7869.m21144(c17371M52316.m40711(), c17371M52316.m40710()) != null) {
                        c10483M17221 = C6249.m17214(c17371M52316, interfaceC20758, c1143, i).m17220();
                        try {
                            m29059(interfaceC17066);
                            c23721M40712 = c17371M52316.m40712();
                            try {
                                c23721M40712.m52365();
                                c4343 = new C4342(c23721M40712);
                                c10483M17221.f31452.m17225(c23721M40712);
                                m29059(interfaceC17066);
                                C11915 c11915 = new C11915(c23721M40712, c4343, c10483M17221, new C23888(c23721M40712, interfaceC20758, c1143, executor));
                                c11915.f35622.f77236 = new C6417(c1143, c4671, executor);
                                try {
                                    c17371M52316.close();
                                    return c11915;
                                } catch (IOException | Error | RuntimeException e2) {
                                    e = e2;
                                    c10483 = c10483M17221;
                                    th = e;
                                    c4342 = c4343;
                                    if (c10483 != null) {
                                        c10483.close();
                                    }
                                    if (c4342 != null) {
                                        try {
                                            c4342.close();
                                        } catch (Throwable th6) {
                                            th.addSuppressed(th6);
                                        }
                                    }
                                    if (c23721M40712 != null) {
                                        try {
                                            c23721M40712.m52331().m10930();
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
                                c4344 = null;
                                c4343 = c4344;
                                c23721 = c23721M40712;
                                c10484 = c10483M17221;
                                th2 = th;
                                try {
                                    c17371M52316.close();
                                    throw th2;
                                } catch (Throwable th9) {
                                    try {
                                        th2.addSuppressed(th9);
                                        throw th2;
                                    } catch (IOException | Error | RuntimeException e3) {
                                        e = e3;
                                        c23721M40712 = c23721;
                                        c10483 = c10484;
                                        th = e;
                                        c4342 = c4343;
                                        if (c10483 != null) {
                                            c10483.close();
                                        }
                                        if (c4342 != null) {
                                            c4342.close();
                                        }
                                        if (c23721M40712 != null) {
                                            c23721M40712.m52331().m10930();
                                            throw th;
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c4343 = null;
                            c23721 = null;
                            c10484 = c10483M17221;
                            th2 = th;
                            c17371M52316.close();
                            throw th2;
                        }
                    }
                    C18516 c18516M43037 = C18516.m43037(c17371M52316, interfaceC20758, c1143, i);
                    C6102 c6102 = c18516M43037.f57386;
                    C12704 c12704M40714 = c17371M52316.m40714();
                    try {
                        c12704 = c12704M40714;
                        try {
                            C12599 c12599M17216 = C6249.m17216(c12704M40714, c18516M43037.f57385.m44358(), c18516M43037.f57387, C2931.m8937(c6102), c18516M43037.f57384, c18516M43037.f57383, i);
                            try {
                                C6249 c6249M17218 = C6249.m17218(c12599M17216.m30864(), i, c12704);
                                try {
                                    m29059(interfaceC17066);
                                    c6249 = c6249M17218;
                                    try {
                                        C11481 c11481M28297 = C11481.m28297(interfaceC20758, c17371M52316.m40711(), new ByteArrayInputStream(c12599M17216.m30864()), c12599M17216.m30864().length, i, c1143);
                                        m29059(interfaceC17066);
                                        c23721M40712 = c17371M52316.m40712();
                                        try {
                                            c23721M40712.m52365();
                                            c4343 = new C4342(c23721M40712, c6102.m17021());
                                            try {
                                                C7206 c7206M52360 = c23721M40712.m52360();
                                                try {
                                                    c23721M40712.m52354(c7206M52360.m19286(C7869.m21145(c7206M52360.m19285(), c11481M28297, c23721M40712.m52352()))).m10930();
                                                    c7206M52360.close();
                                                    c10483M17221 = c6249.m17221(c23721M40712, c18516M43037.f57387);
                                                    try {
                                                        c6249.close();
                                                        try {
                                                            c12599M17216.close();
                                                            try {
                                                                c12704.close();
                                                                c10483M17221.f31452.m17225(c23721M40712);
                                                                m29059(interfaceC17066);
                                                                C11915 c11916 = new C11915(c23721M40712, c4343, c10483M17221, new C23888(c23721M40712, interfaceC20758, c1143, executor));
                                                                c11916.f35622.f77236 = new C6417(c1143, c4671, executor);
                                                                c17371M52316.close();
                                                                return c11916;
                                                            } catch (Throwable th11) {
                                                                th = th11;
                                                                c4344 = c4343;
                                                                c4343 = c4344;
                                                                c23721 = c23721M40712;
                                                                c10484 = c10483M17221;
                                                                th2 = th;
                                                                c17371M52316.close();
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            c23722 = c23721M40712;
                                                            c10485 = c10483M17221;
                                                            th3 = th;
                                                            try {
                                                                c12704.close();
                                                                throw th3;
                                                            } catch (Throwable th13) {
                                                                th3.addSuppressed(th13);
                                                                throw th3;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                        C10483 c10487 = c10483M17221;
                                                        th4 = th;
                                                        C10483 c10488 = c10487;
                                                        c23722 = c23721M40712;
                                                        c10486 = c10488;
                                                        try {
                                                            c12599M17216.close();
                                                            throw th4;
                                                        } catch (Throwable th15) {
                                                            th4.addSuppressed(th15);
                                                            throw th4;
                                                        }
                                                    }
                                                } catch (Throwable th16) {
                                                    try {
                                                        c7206M52360.close();
                                                        throw th16;
                                                    } catch (Throwable th17) {
                                                        th16.addSuppressed(th17);
                                                        throw th16;
                                                    }
                                                }
                                            } catch (Throwable th18) {
                                                th5 = th18;
                                                try {
                                                    c6249.close();
                                                    throw th5;
                                                } catch (Throwable th19) {
                                                    th5.addSuppressed(th19);
                                                    throw th5;
                                                }
                                            }
                                        } catch (Throwable th20) {
                                            th5 = th20;
                                            c4343 = null;
                                            c6249.close();
                                            throw th5;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        th5 = th;
                                        c23721M40712 = null;
                                        c4343 = null;
                                        c6249.close();
                                        throw th5;
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
                                    c6249 = c6249M17218;
                                }
                            } catch (Throwable th23) {
                                th4 = th23;
                                c10486 = null;
                                c4343 = null;
                                c23722 = null;
                            }
                        } catch (Throwable th24) {
                            th = th24;
                            th3 = th;
                            c10485 = null;
                            c4343 = null;
                            c23722 = null;
                            c12704.close();
                            throw th3;
                        }
                    } catch (Throwable th25) {
                        th = th25;
                        c12704 = c12704M40714;
                    }
                } catch (IllegalStateException e4) {
                    throw new IOException("Invalid fragment recovery metadata", e4);
                }
            } catch (Throwable th26) {
                th2 = th26;
                c4343 = null;
                c23721 = null;
                c10484 = null;
            }
        } catch (IOException | Error | RuntimeException e5) {
            th = e5;
            c23721M40712 = null;
            c10483 = null;
            c4342 = null;
        }
        if (c10483 != null) {
            c10483.close();
        }
        if (c4342 != null) {
            c4342.close();
        }
        if (c23721M40712 != null) {
            c23721M40712.m52331().m10930();
            throw th;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29056(Throwable th) {
        C22477 c22477;
        synchronized (this) {
            c22477 = this.f35627;
            this.f35627 = null;
        }
        if (c22477 != null) {
            c22477.m50428(th);
        }
    }

    public C11915(C23721 c23721, C4342 c4342, C10483 c10483, C23888 c23888) {
        this.f35620 = c23721;
        this.f35630 = c4342;
        this.f35623 = c10483;
        this.f35622 = c23888;
        this.f35624 = new C0813(c4342);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11915 m29054(InterfaceC20758 interfaceC20758, C6417 c6417) {
        C23721 c23721M52300 = C23721.m52300(interfaceC20758, c6417.f19851, c6417.f19853);
        c23721M52300.m52365();
        C11915 c11915 = new C11915(c23721M52300, new C4342(c23721M52300), null, new C23888(c23721M52300, interfaceC20758, c6417.f19851, c6417.f19852));
        c11915.f35622.f77236 = c6417;
        return c11915;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29073(int i, int i2, CharSequence charSequence) {
        C4342 c4342 = this.f35630;
        c4342.m13048(c4342.length(), c4342.length(), charSequence, i, i2);
        this.f35620.m52349();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29076(C6249 c6249, Bundle bundle, C23077 c23077, String str, C6417 c6417, InterfaceC17066 interfaceC17066, int i) {
        C23721 c23721 = this.f35620;
        c23721.m52369();
        C4342 c4342 = this.f35630;
        c4342.setSelection(i, i);
        c4342.mo1600(false);
        C12704 c12704M52357 = c23721.m52357();
        try {
            C12599 c12599M17223 = c6249.m17223(c12704M52357, bundle, c23077, str, 0, 0, true);
            c12704M52357.close();
            this.f35622.getClass();
            m29055(bundle, c23077, c12599M17223, c6417, 8388608, interfaceC17066, false);
        } catch (Throwable th) {
            try {
                c12704M52357.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29077(C13576 c13576, int i, int i2) {
        this.f35628 = c13576;
        this.f35631 = i;
        Bundle bundleM32653 = c13576.m32653();
        C23721 c23721 = this.f35620;
        C12704 c12704M52357 = c23721.m52357();
        try {
            C12599 c12599M17224 = this.f35623.f31452.m17224(c12704M52357, bundleM32653, c13576.m32656() == 1 ? this.f35623.f31451 : c13576.m32657(), c13576.m32658(), true, i2);
            c12704M52357.close();
            try {
                C12704 c12704M52358 = c23721.m52357();
                try {
                    C6249 c6249M17218 = C6249.m17218(c12599M17224.m30864(), i2, c12704M52358);
                    try {
                        C10483 c10483M17221 = c6249M17218.m17221(c23721, c13576.m32656() == 1 ? this.f35623.f31451 : c13576.m32657());
                        C10483 c10483 = this.f35623;
                        this.f35623 = c10483M17221;
                        if (c10483 != null) {
                            c10483.close();
                        }
                        c6249M17218.close();
                        c12704M52358.close();
                        c12599M17224.close();
                        C23888 c23888 = this.f35622;
                        c23888.f77242 = c13576;
                        c23888.f77240 = i;
                    } catch (Throwable th) {
                        try {
                            c6249M17218.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c12704M52358.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                try {
                    c12599M17224.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        } catch (Throwable th7) {
            try {
                c12704M52357.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29072(int i) {
        Bundle bundleM44358 = this.f35623.f31452.f19337.m44358();
        bundleM44358.putInt("textPageSize", i);
        C23721 c23721 = this.f35620;
        C12704 c12704M52357 = c23721.m52357();
        try {
            C10483 c10483 = this.f35623;
            C12599 c12599M17222 = c10483.f31452.m17222(c12704M52357, bundleM44358, c10483.f31451);
            try {
                C6249 c6249M17218 = C6249.m17218(c12599M17222.m30864(), 8388608, c12704M52357);
                try {
                    C10483 c10483M17221 = c6249M17218.m17221(c23721, this.f35623.f31451);
                    C10483 c10484 = this.f35623;
                    this.f35623 = c10483M17221;
                    if (c10484 != null) {
                        c10484.close();
                    }
                    c6249M17218.close();
                    c12599M17222.close();
                    c12704M52357.close();
                } catch (Throwable th) {
                    try {
                        c6249M17218.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c12599M17222.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c12704M52357.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29075(C2931 c2931, byte[] bArr, byte[] bArr2, C6417 c6417, int i) {
        Bundle bundleM44358 = this.f35623.f31452.f19337.m44358();
        C12704 c12704M52357 = this.f35620.m52357();
        try {
            C10483 c10483 = this.f35623;
            C12599 c12599M17216 = C6249.m17216(c12704M52357, bundleM44358, c10483.f31451, c10483.f31452.f19335.m8946(c2931), bArr, bArr2, i);
            c12704M52357.close();
            this.f35622.getClass();
            m29055(bundleM44358, this.f35623.f31451, c12599M17216, c6417, i, (InterfaceC17066) new C11461(), false);
        } catch (Throwable th) {
            try {
                c12704M52357.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m29070(InterfaceC20758 interfaceC20758, AbstractC3322 abstractC3322, boolean z, int i, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z2) throws IOException {
        C12599 c12599M17224;
        int i2;
        Bundle bundleM44358 = this.f35623.f31452.f19337.m44358();
        boolean z3 = bundleM44358.getBoolean("e2SourcePending");
        C23721 c23721 = this.f35620;
        if (!z3 && c23721.m52350().m14691()) {
            return this;
        }
        SystemClock.elapsedRealtime();
        if (z3) {
            C11273 c11273M41183 = C17622.m41183(abstractC3322, z, i, interfaceC17066);
            m29059(interfaceC17066);
            if (c11273M41183 != null) {
                m29057(abstractC3322, false, c11273M41183, 0, 0, c6417, interfaceC17066, z2);
                m29067();
                return this;
            }
            if (bundleM44358.getInt("textPageSize") <= 0 && this.f35628 == null) {
                this.f35625 = C11789.m28842(c23721, new C4838(abstractC3322), c6417.f19851, i, interfaceC17066);
            } else {
                return C13576.m32634(this, interfaceC20758, abstractC3322, i, c6417, interfaceC17066, -1L);
            }
        } else {
            InterfaceC20900 c4838 = new C4838(abstractC3322);
            if (interfaceC17066 instanceof C2037) {
                c4838 = new C23182(c4838, interfaceC17066);
            }
            this.f35625 = C11789.m28841(c23721, c4838, this.f35623.f31451.f74223);
        }
        m29067();
        String strM14686 = this.f35625.m28847().m14686();
        String strM8943 = z3 ? strM14686 : this.f35623.f31452.f19335.m8943(strM14686);
        C18495 c18495M28849 = this.f35625.m28849();
        try {
            m29059(interfaceC17066);
            C4342 c4342 = this.f35630;
            if (c18495M28849 != null) {
                InterfaceC0897 interfaceC0897M26561 = c4342.m26561();
                C11003.requireNonNull(interfaceC0897M26561);
                interfaceC0897M26561.mo3242(c18495M28849);
            }
            if (c18495M28849 != null) {
                c18495M28849.close();
            }
            if (!this.f35625.m28847().m14691() && this.f35625.m28847().m14689() != EnumC0191.LOADING) {
                throw new IOException("Cannot prepare source text", this.f35625.m28846());
            }
            C23077 c23077M28848 = z3 ? this.f35625.m28848() : this.f35623.f31451;
            if (z3) {
                c4342.setSelection(0, 0);
                c4342.mo1600(false);
            }
            bundleM44358.putBoolean("e2SourcePending", false);
            bundleM44358.putBoolean("changed", c4342.isChanged());
            bundleM44358.putBoolean(d.O, false);
            if (z3) {
                bundleM44358.putLong("fileTime", ((C4733) abstractC3322).f15019.mo23117());
                bundleM44358.putBoolean("checkFileExists", true);
            }
            String strM14687 = (z3 || strM8943.equals(strM14686)) ? this.f35625.m28847().m14686() : strM8943;
            C12704 c12704M52357 = c23721.m52357();
            try {
                if (z3) {
                    i2 = 8388608;
                    c12599M17224 = this.f35623.f31452.m17223(c12704M52357, bundleM44358, c23077M28848, strM14687, 0, 0, this.f35625.m28847().m14691());
                } else {
                    c12599M17224 = this.f35623.f31452.m17224(c12704M52357, bundleM44358, c23077M28848, strM14687, this.f35625.m28847().m14691(), 8388608);
                    i2 = 8388608;
                }
                c12704M52357.close();
                m29055(bundleM44358, c23077M28848, c12599M17224, c6417, i2, interfaceC17066, z2 && this.f35625.m28847().m14691());
                m29067();
                C11789 c11789 = this.f35625;
                boolean zM14691 = c11789.m28847().m14691();
                while (c11789.m28847().m14689() == EnumC0191.LOADING) {
                    m29059(interfaceC17066);
                    C18495 c18495M288410 = c11789.m28849();
                    try {
                        m29059(interfaceC17066);
                        if (c18495M288410 != null) {
                            InterfaceC0897 interfaceC0897M26562 = c4342.m26561();
                            C11003.requireNonNull(interfaceC0897M26562);
                            interfaceC0897M26562.mo3242(c18495M288410);
                        }
                        if (c18495M288410 != null) {
                            c18495M288410.close();
                        }
                    } catch (Throwable th) {
                        if (c18495M288410 == null) {
                            throw th;
                        }
                        try {
                            c18495M288410.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                m29059(interfaceC17066);
                if (!c11789.m28847().m14691()) {
                    throw new IOException("Cannot display incomplete source text", c11789.m28846());
                }
                String strM14688 = (z3 || strM8943.equals(strM14686)) ? c11789.m28847().m14686() : strM8943;
                c11789.close();
                this.f35625 = null;
                if (zM14691) {
                    m29067();
                    return this;
                }
                C12704 c12704M52358 = c23721.m52357();
                try {
                    C12599 c12599M17225 = this.f35623.f31452.m17224(c12704M52358, bundleM44358, c23077M28848, strM14688, true, 8388608);
                    c12704M52358.close();
                    m29055(bundleM44358, c23077M28848, c12599M17225, c6417, 8388608, interfaceC17066, z2);
                    m29067();
                    return this;
                } catch (Throwable th3) {
                    try {
                        c12704M52358.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                try {
                    c12704M52357.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            if (c18495M28849 == null) {
                throw th7;
            }
            try {
                c18495M28849.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29080() {
        return this.f35632.m10921((InterfaceC21423) new C13325(0));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29067() {
        SystemClock.elapsedRealtime();
        C23721 c23721 = this.f35620;
        c23721.length();
        Integer.toHexString(System.identityHashCode(c23721));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29074(Bundle bundle, C23077 c23077, C12599 c12599, C6417 c6417, C11461 c11461) {
        m29055(bundle, c23077, c12599, c6417, 8388608, (InterfaceC17066) c11461, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29055(Bundle bundle, C23077 c23077, C12599 c12599, C6417 c6417, int i, InterfaceC17066 interfaceC17066, boolean z) {
        C23721 c23721 = this.f35620;
        InterfaceC20758 interfaceC20758M52636 = this.f35622.m52636();
        try {
            C12704 c12704M52357 = c23721.m52357();
            try {
                C5377 c5377M30978 = c12704M52357.m30978((((long) c12599.m30864().length) * 4) + X931RNG.BLOCK64_RESEED_MAX);
                try {
                    C6249 c6249M17218 = C6249.m17218(c12599.m30864(), i, c12704M52357);
                    try {
                        m29059(interfaceC17066);
                        C11481 c11481M28297 = C11481.m28297(interfaceC20758M52636, c23721.m52352(), new ByteArrayInputStream(c12599.m30864()), c12599.m30864().length, i, c6417.f19851);
                        C7206 c7206M52360 = c23721.m52360();
                        try {
                            FutureC3575 futureC3575M52354 = c23721.m52354(c7206M52360.m19286(C7869.m21145(c7206M52360.m19285(), c11481M28297, c23721.m52352())));
                            this.f35632 = futureC3575M52354;
                            if (!z) {
                                futureC3575M52354.m10930();
                            }
                            c7206M52360.close();
                            C9240.m23681(interfaceC20758M52636, bundle);
                            if (this.f35628 != null) {
                                this.f35632.m10930();
                                this.f35628.m32650(this.f35631, bundle, this.f35630.isChanged(), c23077.f74223, c6249M17218.f19335.m8943(this.f35628.m32658()));
                            }
                            C10483 c10483M17221 = c6249M17218.m17221(c23721, c23077);
                            C10483 c10483 = this.f35623;
                            this.f35623 = c10483M17221;
                            if (c10483 != null) {
                                c10483.close();
                            }
                            c6249M17218.close();
                            if (c5377M30978 != null) {
                                c5377M30978.close();
                            }
                            c12704M52357.close();
                            c12599.close();
                        } catch (Throwable th) {
                            try {
                                c7206M52360.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            c6249M17218.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    if (c5377M30978 == null) {
                        throw th5;
                    }
                    try {
                        c5377M30978.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                    try {
                        c12599.close();
                        throw th;
                    } catch (Throwable th7) {
                        th.addSuppressed(th7);
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                try {
                    c12704M52357.close();
                    throw th8;
                } catch (Throwable th9) {
                    th8.addSuppressed(th9);
                    throw th8;
                }
            }
        } catch (Throwable th10) {
            c12599.close();
            throw th10;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29079() {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35621;
            if (futureC3575 == null) {
                C11789 c11789 = this.f35625;
                if (c11789 == null) {
                    return FutureC3575.m10905(null);
                }
                FutureC3575 futureC3575M10896 = FutureC3575.m10896(new RunnableC0625(c11789), C1802.f6209);
                this.f35621 = futureC3575M10896;
                this.f35625 = null;
                return futureC3575M10896.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11915 m29071(InterfaceC20758 interfaceC20758, C4733 c4733, boolean z, boolean z2, int i, int i2, int i3, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z3) throws IOException {
        long jMax;
        C23721 c23721 = this.f35620;
        if (z3) {
            jMax = Math.max(0, c23721.m52359().m14642());
            if (this.f35628 != null) {
                for (int i4 = 0; i4 < this.f35631; i4++) {
                    m29059(interfaceC17066);
                    C7744 c7744M32646 = this.f35628.m32646(i4, c6417);
                    try {
                        jMax += (long) c7744M32646.length();
                        c7744M32646.close();
                    } catch (Throwable th) {
                        try {
                            c7744M32646.close();
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
        C11273 c11273M41182 = z ? C17622.m41182() : C17622.m41183(c4733, z2, i, interfaceC17066);
        m29059(interfaceC17066);
        if (c11273M41182 == null && (this.f35628 != null || this.f35623.f31452.f19337.m44358().getInt("textPageSize") > 0)) {
            return C13576.m32634(this, interfaceC20758, c4733, i, c6417, interfaceC17066, j);
        }
        if (this.f35628 != null) {
            return C13576.m32633(this, c4733, z, c11273M41182, c6417, interfaceC17066, j);
        }
        if (c11273M41182 == null) {
            C4342 c4342 = this.f35630;
            c4342.replace(0, c4342.length(), (CharSequence) "");
            c23721.m52369();
            c4342.setSelection(0, 0);
            c4342.mo1600(false);
            Bundle bundleM44358 = this.f35623.f31452.f19337.m44358();
            bundleM44358.putBoolean("e2SourcePending", true);
            C12704 c12704M52357 = c23721.m52357();
            try {
                C12599 c12599M17223 = this.f35623.f31452.m17223(c12704M52357, bundleM44358, (C23077) null, "\n", i2, i3, false);
                try {
                    C6249 c6249M17218 = C6249.m17218(c12599M17223.m30864(), 8388608, c12704M52357);
                    try {
                        C10483 c10483M17221 = c6249M17218.m17221(c23721, (C23077) null);
                        C10483 c10483 = this.f35623;
                        this.f35623 = c10483M17221;
                        if (c10483 != null) {
                            c10483.close();
                        }
                        c6249M17218.close();
                        c12599M17223.close();
                        c12704M52357.close();
                        return m29070(interfaceC20758, (AbstractC3322) c4733, z2, i, c6417, interfaceC17066, true);
                    } catch (Throwable th3) {
                        try {
                            c6249M17218.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        c12599M17223.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                try {
                    c12704M52357.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        }
        m29057(c4733, z, c11273M41182, i2, i3, c6417, interfaceC17066, true);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29057(AbstractC3322 abstractC3322, boolean z, C11273 c11273, int i, int i2, C6417 c6417, InterfaceC17066 interfaceC17066, boolean z2) throws IOException {
        CharSequence charSequence = c11273.f33779;
        m29059(interfaceC17066);
        C4342 c4342 = this.f35630;
        c4342.replace(0, c4342.length(), (CharSequence) "");
        C23721 c23721 = this.f35620;
        c23721.m52349();
        int i3 = 0;
        while (i3 < charSequence.length()) {
            long j = i3;
            int iMin = (int) Math.min(charSequence.length(), ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF + j);
            CharSequence charSequence2 = c11273.f33779;
            m29059(interfaceC17066);
            if ((((long) c4342.length()) + ((long) iMin)) - j > 2147483647L) {
                throw new IOException("Reloaded text exceeds coordinate limit");
            }
            c4342.m13048(c4342.length(), c4342.length(), charSequence2, i3, iMin);
            c23721.m52349();
            i3 = iMin;
        }
        c23721.m52369();
        c4342.setSelection(0, 0);
        c4342.mo1600(false);
        Bundle bundleM44358 = this.f35623.f31452.f19337.m44358();
        bundleM44358.putBoolean("changed", false);
        bundleM44358.putBoolean(d.O, false);
        bundleM44358.putBoolean("e2SourcePending", false);
        if (!z) {
            bundleM44358.putLong("fileTime", ((C4733) abstractC3322).f15019.mo23117());
            bundleM44358.putBoolean("checkFileExists", true);
        }
        C12704 c12704M52357 = c23721.m52357();
        try {
            C12599 c12599M17223 = this.f35623.f31452.m17223(c12704M52357, bundleM44358, c11273.f33778, c11273.f33776, i, i2, true);
            c12704M52357.close();
            m29055(bundleM44358, c11273.f33778, c12599M17223, c6417, 8388608, interfaceC17066, z2);
        } catch (Throwable th) {
            try {
                c12704M52357.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bundle m29061(InterfaceC20758 interfaceC20758, C6417 c6417) throws Throwable {
        C23077 c23077;
        C11915 c11915M29053 = m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
        try {
            Bundle bundleM44358 = c11915M29053.f35623.f31452.f19337.m44358();
            String string = bundleM44358.getString("filePath");
            if (string == null || string.equals("untitled")) {
                throw new IOException("Untitled session requires an output path");
            }
            AbstractC15440 abstractC15440M39866 = C16999.m39866(string, new String[0]);
            C4733 c4733 = new C4733(abstractC15440M39866);
            c11915M29053 = c11915M29053.m29070(interfaceC20758, (AbstractC3322) c4733, bundleM44358.getBoolean("forceTryAXml") || bundleM44358.getBoolean("forceTryClass"), -1, c6417, (InterfaceC17066) new C11461(), false);
            C23721 c23721 = c11915M29053.f35620;
            String strM8943 = c11915M29053.f35623.f31452.f19335.m8943(c23721.m52350().m14686());
            if (!c23721.m52350().m14691() || (c23077 = c11915M29053.f35623.f31451) == null) {
                throw new IOException("Session text is not ready for saving");
            }
            C14799 c14799M35199 = C14799.m35199(c11915M29053, strM8943, c23077);
            try {
                c14799M35199.m35203(c4733);
                c14799M35199.m35202();
                c14799M35199.close();
                c11915M29053.f35630.mo1600(false);
                Bundle bundleM44359 = c11915M29053.f35623.f31452.f19337.m44358();
                bundleM44359.putBoolean("changed", false);
                bundleM44359.putBoolean(d.O, false);
                bundleM44359.putLong("fileTime", abstractC15440M39866.mo23117());
                bundleM44359.putBoolean("checkFileExists", true);
                C12704 c12704M52357 = c23721.m52357();
                try {
                    C10483 c10483 = c11915M29053.f35623;
                    C12599 c12599M17224 = c10483.f31452.m17224(c12704M52357, bundleM44359, c10483.f31451, strM8943, true, 8388608);
                    c12704M52357.close();
                    c11915M29053.m29055(bundleM44359, c11915M29053.f35623.f31451, c12599M17224, c6417, 8388608, (InterfaceC17066) new C11461(), false);
                    c11915M29053.m29069(c23721.m52371()).m10930();
                    return bundleM44359;
                } catch (Throwable th) {
                    try {
                        c12704M52357.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    c14799M35199.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            c11915M29053.m29068().m10930();
            throw th5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29059(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Fragment recovery is canceled");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29060(InterfaceC20758 interfaceC20758, C0604 c0604, C6417 c6417) {
        C11915 c11915M29053 = m29053(interfaceC20758, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, new C11461(), (String) null);
        C23721 c23721 = c11915M29053.f35620;
        Throwable th = null;
        try {
            try {
                Bundle bundleM44358 = c11915M29053.f35623.f31452.f19337.m44358();
                c0604.m2480(bundleM44358);
                C12704 c12704M52357 = c23721.m52357();
                try {
                    C10483 c10483 = c11915M29053.f35623;
                    C12599 c12599M17222 = c10483.f31452.m17222(c12704M52357, bundleM44358, c10483.f31451);
                    c12704M52357.close();
                    c11915M29053.m29055(bundleM44358, c11915M29053.f35623.f31451, c12599M17222, c6417, 8388608, (InterfaceC17066) new C11461(), false);
                    c11915M29053.m29069(c23721.m52371()).m10930();
                    c11915M29053.m29068().m10930();
                } catch (Throwable th2) {
                    try {
                        c12704M52357.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                try {
                    c11915M29053.m29068().m10930();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29069(long j) {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35629;
            if (futureC3575 == null) {
                FutureC3575 futureC3576 = this.f35618;
                if (futureC3576 == null) {
                    synchronized (this.f35620) {
                        if (this.f35620.m52371() != j || this.f35620.m52361() < j) {
                            throw new IllegalStateException("Fragment final checkpoint is not current and durable");
                        }
                    }
                    this.f35624.close();
                    this.f35630.close();
                    final FutureC3575 futureC3577 = new FutureC3575();
                    this.f35618 = futureC3577;
                    FutureC3575 futureC3575M52630 = this.f35622.m52630();
                    C23888 c23888 = this.f35622;
                    C11003.requireNonNull(c23888);
                    futureC3575M52630.m10920(new RunnableC0918(1, c23888), C1802.f6209).m10911((InterfaceC15071) new C20382()).m10927(new InterfaceC21423() { // from class: l.ۙ᩵ᩳ
                        @Override // l.InterfaceC21423
                        public final Object apply(Object obj) {
                            final Throwable th = (Throwable) obj;
                            final C11915 c11915 = this.f15362;
                            C13576 c13576 = c11915.f35628;
                            return (c13576 == null ? FutureC3575.m10905(null) : c13576.m32655()).m10927(new InterfaceC21423() { // from class: l.᩸᩵ᩳ
                                @Override // l.InterfaceC21423
                                public final Object apply(Object obj2) {
                                    return c11915.f35620.m52366();
                                }
                            }).m10911(new InterfaceC15071() { // from class: l.᩹᩵ᩳ
                                @Override // l.InterfaceC15071
                                /* JADX INFO: renamed from: ֫ */
                                public final Object mo25124(Object obj2, Throwable th2) {
                                    return C11915.m29066(th, th2);
                                }
                            });
                        }
                    }).m10910(new InterfaceC8017() { // from class: l.ۗ᩵ᩳ
                        @Override // l.InterfaceC8017
                        /* JADX INFO: renamed from: ۧ */
                        public final void mo4663(Object obj, Throwable th) {
                            C11915.m29058(this.f10900, futureC3577, (Throwable) obj, th);
                        }
                    });
                    return futureC3577.m10921((InterfaceC21423) new C5368());
                }
                return futureC3576.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29058(C11915 c11915, FutureC3575 futureC3575, Throwable th, Throwable th2) {
        C10483 c10483;
        Throwable thM29066 = m29066(th, th2);
        synchronized (c11915) {
            c10483 = c11915.f35623;
            c11915.f35623 = null;
        }
        if (c10483 != null) {
            c10483.close();
        }
        c11915.m29056(thM29066);
        if (thM29066 == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if ((thM29066 instanceof C13452) && thM29066.getCause() != null) {
            thM29066 = thM29066.getCause();
        }
        futureC3575.m10914(thM29066);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m29068() {
        synchronized (this) {
            FutureC3575 futureC3575 = this.f35629;
            if (futureC3575 == null) {
                FutureC3575 futureC3576 = this.f35618;
                this.f35624.close();
                final FutureC3575 futureC3577 = new FutureC3575();
                this.f35629 = futureC3577;
                (futureC3576 == null ? FutureC3575.m10905(null) : futureC3576.m10911((InterfaceC15071) new C23202(6))).m10927((InterfaceC21423) new C12620(0, this)).m10911((InterfaceC15071) new C10504(this)).m10927((InterfaceC21423) new C6270(this)).m10927(new InterfaceC21423() { // from class: l.ۚ᩵ᩳ
                    @Override // l.InterfaceC21423
                    public final Object apply(Object obj) {
                        Throwable th = (Throwable) obj;
                        final C11915 c11915 = this.f17245;
                        C13576 c13576 = c11915.f35628;
                        return (c13576 == null ? FutureC3575.m10905(null) : c13576.m32655()).m10927(new InterfaceC21423() { // from class: l.۠᩵ᩳ
                            @Override // l.InterfaceC21423
                            public final Object apply(Object obj2) {
                                return c11915.f35620.m52331();
                            }
                        }).m10911((InterfaceC15071) new C15441(th));
                    }
                }).m10910(new InterfaceC8017() { // from class: l.֨᩵ᩳ
                    @Override // l.InterfaceC8017
                    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
                    public final void mo4663(Object obj, Throwable th) {
                        C11915.m29064(this.f4794, futureC3577, (Throwable) obj, th);
                    }
                });
                return futureC3577.m10921((InterfaceC21423) new C5368());
            }
            return futureC3575.m10921((InterfaceC21423) new C5368());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Throwable m29051(C11915 c11915, Throwable th) {
        try {
            c11915.f35630.close();
            return th;
        } catch (Throwable th2) {
            return m29066(th, th2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29064(C11915 c11915, FutureC3575 futureC3575, Throwable th, Throwable th2) {
        C10483 c10483;
        Throwable thM29066 = m29066(th, th2);
        synchronized (c11915) {
            c10483 = c11915.f35623;
            c11915.f35623 = null;
        }
        if (c10483 != null) {
            c10483.close();
        }
        c11915.m29056(thM29066);
        if (thM29066 == null) {
            futureC3575.m10912((Object) null);
            return;
        }
        if ((thM29066 instanceof C13452) && thM29066.getCause() != null) {
            thM29066 = thM29066.getCause();
        }
        futureC3575.m10914(thM29066);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Throwable m29066(Throwable th, Throwable th2) {
        if (th == null) {
            return th2;
        }
        if (th2 != null && th != th2) {
            th.addSuppressed(th2);
        }
        return th;
    }
}
