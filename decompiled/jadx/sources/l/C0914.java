package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֨ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z72R */
/* JADX INFO: loaded from: classes3.dex */
public class C0914 extends AbstractC6138 implements InterfaceC3444 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile String f3499;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public volatile long f3500;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f3501 = new AtomicBoolean();

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final Semaphore f3498 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final C1769 f3497 = ConcurrentMapC10942.newKeySet();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo3270(AbstractActivityC3346 abstractActivityC3346, C17222 c17222, boolean z) {
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        String str = this.f3499;
        return str == null ? m11556("archiveName") : str;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        m11555(R.string.MT_Protector);
        mo11538(0);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() {
        C17222 c17222M40520;
        String strM14327;
        try {
            if (m11543().containsKey("sourceTempLease")) {
                this.f3500 = m11527("sourceTempLease");
            }
            AbstractC13921 abstractC13921M11526 = m11526();
            String strM39854 = C16996.m39854(abstractC13921M11526);
            C1769 c1769 = f3497;
            if (!c1769.add(strM39854)) {
                String strM14328 = C4925.m14327(R.string.MT_Protector);
                this.f3499 = strM14328;
                C17222 c17222M40518 = C17222.m40518(strM14328);
                m3269();
                return c17222M40518;
            }
            try {
                Semaphore semaphore = f3498;
                boolean zTryAcquire = semaphore.tryAcquire();
                if (!zTryAcquire) {
                    String strM14329 = C4925.m14327(R.string.MT_Protector);
                    this.f3499 = strM14329;
                    C17222 c17222M40519 = C17222.m40518(strM14329);
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c1769.remove(strM39854);
                    m3269();
                    return c17222M40519;
                }
                try {
                    C1474 c1474M39851 = C16996.m39851(abstractC13921M11526);
                    C6266 c6266M39839 = C16996.m39839(abstractC13921M11526, this);
                    if (c6266M39839.m17276() != EnumC10647.CANCELED && !m3271()) {
                        if (!c1474M39851.m5103(abstractC13921M11526)) {
                            String strM143210 = C4925.m14327(R.string.MT_Protector);
                            this.f3499 = strM143210;
                            C17222 c17222M405110 = C17222.m40518(strM143210);
                            if (zTryAcquire) {
                                semaphore.release();
                            }
                            c1769.remove(strM39854);
                            m3269();
                            return c17222M405110;
                        }
                        int i = C5148.f16089[c6266M39839.m17276().ordinal()];
                        if (i == 1) {
                            c17222M40520 = C17222.m40520();
                        } else if (i != 2) {
                            if (i == 3) {
                                strM14327 = c6266M39839.m17274() == null ? C4925.m14327(R.string.MT_Protector) : C4925.m14306(R.string.MT_Protector, c6266M39839.m17274());
                                this.f3499 = strM14327;
                            } else if (i == 4) {
                                strM14327 = C4925.m14327(R.string.MT_Protector);
                                this.f3499 = strM14327;
                            } else {
                                if (i != 5) {
                                    throw new IncompatibleClassChangeError();
                                }
                                Exception iOException = c6266M39839.m17275() == null ? new IOException("Archive test failed") : c6266M39839.m17275();
                                this.f3499 = iOException.getMessage();
                                c17222M40520 = C17222.m40517(iOException);
                            }
                            c17222M40520 = C17222.m40518(strM14327);
                        } else {
                            c17222M40520 = C17222.m40521();
                        }
                        if (zTryAcquire) {
                            semaphore.release();
                        }
                        c1769.remove(strM39854);
                        m3269();
                        return c17222M40520;
                    }
                    C17222 c17222M40521 = C17222.m40521();
                    if (zTryAcquire) {
                        semaphore.release();
                    }
                    c1769.remove(strM39854);
                    m3269();
                    return c17222M40521;
                } catch (IOException unused) {
                    String strM143211 = C4925.m14327(R.string.MT_Protector);
                    this.f3499 = strM143211;
                    C17222 c17222M405111 = C17222.m40518(strM143211);
                    if (zTryAcquire) {
                        f3498.release();
                    }
                    f3497.remove(strM39854);
                    m3269();
                    return c17222M405111;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    f3498.release();
                }
                f3497.remove(strM39854);
                throw th;
            }
        } catch (Throwable th2) {
            m3269();
            throw th2;
        }
    }

    @Override // l.AbstractC3817
    public final void cancel() {
        this.f3501.set(true);
        super.cancel();
    }

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final boolean m3271() {
        return this.f3501.get() || mo1526();
    }

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    private void m3269() {
        long j = this.f3500;
        if (j != 0) {
            this.f3500 = 0L;
            AbstractC16891.m39726(j);
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        m3269();
        if (c17222.m40526()) {
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
