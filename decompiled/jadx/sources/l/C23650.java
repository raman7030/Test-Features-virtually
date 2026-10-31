package l;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.᩻ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84DG */
/* JADX INFO: loaded from: classes.dex */
public final class C23650 extends C13503 implements Closeable, InterfaceC8730 {

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f76606 = C11321.m27961(C23650.class);

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final C14477 f76607 = new C14477(new C19438(), new C2504(), new C17320(), new C18567());

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C22239 f76608;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C6717 f76609;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4332 f76610;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C1942 f76611;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C5470 f76612;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9540 f76613;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20123 f76614;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC4059 f76615;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f76616;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15888 f76617;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21534 f76618;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C1278 f76619;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21971 f76620;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C17464 f76621;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22239 f76622;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52157(InterfaceC5386 interfaceC5386) {
        this.f76611.m13513((AbstractC7859) interfaceC5386);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21971 m52163() {
        return this.f76620;
    }

    public C23650(C4332 c4332, C21971 c21971, C17464 c17464, C5470 c5470) {
        C22239 c22239 = new C22239();
        this.f76608 = c22239;
        this.f76622 = new C22239();
        C9540 c9540 = new C9540();
        this.f76613 = c9540;
        C7277 c7277 = new C7277();
        this.f76616 = new ReentrantLock();
        this.f76610 = c4332;
        this.f76620 = c21971;
        C1814 c1814M13024 = c4332.m13024();
        C21336 c21336 = new C21336(new C13739(), this, f76607);
        c1814M13024.getClass();
        this.f76619 = new C1278(c4332.m13037(), c4332.m13026(), c21336);
        this.f76621 = c17464;
        this.f76612 = c5470;
        c17464.m40833(this);
        this.f76618 = new C21534();
        if (c4332.m13025()) {
            this.f76614 = new C3895(c4332.m13038());
        } else {
            f76606.mo7104("Signing is disabled for this connection.");
            this.f76614 = new C2732();
        }
        this.f76617 = new C15888(c4332.m13038());
        C1942 c1942 = new C1942(c22239, this.f76617);
        C10245 c10245 = new C10245();
        C11656 c11656 = new C11656(c9540);
        C7422 c7422 = new C7422(c22239, this.f76614);
        C6011 c6011 = new C6011(this.f76618);
        C12361 c12361 = new C12361(c9540);
        C13771 c13771 = new C13771(c7277, c9540);
        C13066 c13066 = new C13066();
        c13066.m13512(new C3189());
        c13771.m13512(c13066);
        c12361.m13512(c13771);
        c6011.m13512(c12361);
        c7422.m13512(c6011);
        c11656.m13512(c7422);
        c10245.m13512(c11656);
        c1942.m13512(c10245);
        this.f76611 = c1942;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m52158(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52158(boolean z) {
        if (z || m32532()) {
            C17464 c17464 = this.f76621;
            C1278 c1278 = this.f76619;
            InterfaceC2148 interfaceC2148 = f76606;
            if (!z) {
                try {
                    for (C15346 c15346 : this.f76608.m49947()) {
                        try {
                            c15346.m36384();
                        } catch (IOException e) {
                            interfaceC2148.mo7098("Exception while closing session {}", Long.valueOf(c15346.m36383()), e);
                        }
                    }
                } catch (Throwable th) {
                    c1278.m4339();
                    interfaceC2148.mo7087(m52160(), "Closed connection to {}");
                    c17464.m40834(new C11115(this.f76609.m18290().m2254(), this.f76609.m18290().m2252()));
                    throw th;
                }
            }
            c1278.m4339();
            interfaceC2148.mo7087(m52160(), "Closed connection to {}");
            c17464.m40834(new C11115(this.f76609.m18290().m2254(), this.f76609.m18290().m2252()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m52154(C2921 c2921) {
        return new C15182(this, this.f76610, new C18006(this)).m35909(c2921);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16614 m52155(C16614 c16614) {
        C10847 c10847M52153 = m52153(c16614, false);
        long jM13023 = this.f76610.m13023();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC16490 interfaceC16490 = C2380.f7586;
        return (C16614) C17902.m41878(jM13023, c10847M52153);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:5:0x000f, B:8:0x0025, B:10:0x002d, B:17:0x0042, B:19:0x004d, B:21:0x0060, B:24:0x00c9, B:15:0x003e, B:20:0x005c), top: B:33:0x000f, inners: #0 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10847 m52153(C16614 c16614, boolean z) {
        C10847 c10847M43334;
        C21534 c21534 = this.f76618;
        if (c16614.mo7973() instanceof C8148) {
            c10847M43334 = null;
        } else {
            ReentrantLock reentrantLock = this.f76616;
            reentrantLock.lock();
            try {
                int iM48692 = c21534.m48692();
                int iAbs = Math.abs((c16614.mo7975() - 1) / 65536) + 1;
                InterfaceC2148 interfaceC2148 = f76606;
                if (iAbs <= 1 || this.f76609.m18286()) {
                    if (iAbs >= iM48692) {
                        if (iAbs > 1 && iM48692 > 1) {
                            iAbs = iM48692 - 1;
                        }
                    }
                    ((C23670) c16614.mo3028()).m52196(iAbs);
                    if (iM48692 == 0) {
                        interfaceC2148.mo7103(((C23670) c16614.mo3028()).m52217(), "There are no credits left to send {}, will block until there are more credits available.");
                    }
                    ((C23670) c16614.mo3028()).m52205(c21534.m48694(iAbs)[0]);
                    ((C23670) c16614.mo3028()).m52204(Math.max((512 - iM48692) - iAbs, iAbs));
                    interfaceC2148.mo7092("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM48692), c16614);
                    reentrantLock.unlock();
                    C18712 c18712 = new C18712(c16614.mo7973(), ((C23670) c16614.mo3028()).m52201(), UUID.randomUUID(), z);
                    this.f76613.m24413(c18712);
                    c10847M43334 = c18712.m43334(new C17300(this, c18712, ((C23670) c16614.mo3028()).m52203()));
                } else {
                    interfaceC2148.mo7095(m52160(), "Connection to {} does not support multi-credit requests.");
                }
                iAbs = 1;
                ((C23670) c16614.mo3028()).m52196(iAbs);
                if (iM48692 == 0) {
                    interfaceC2148.mo7103(((C23670) c16614.mo3028()).m52217(), "There are no credits left to send {}, will block until there are more credits available.");
                }
                ((C23670) c16614.mo3028()).m52205(c21534.m48694(iAbs)[0]);
                ((C23670) c16614.mo3028()).m52204(Math.max((512 - iM48692) - iAbs, iAbs));
                interfaceC2148.mo7092("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM48692), c16614);
                reentrantLock.unlock();
                C18712 c18713 = new C18712(c16614.mo7973(), ((C23670) c16614.mo3028()).m52201(), UUID.randomUUID(), z);
                this.f76613.m24413(c18713);
                c10847M43334 = c18713.m43334(new C17300(this, c18713, ((C23670) c16614.mo3028()).m52203()));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f76619.m4341(c16614);
        return c10847M43334;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C20829 m52161() {
        return this.f76609.m18285();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52156(C2380 c2380) {
        this.f76613.m24412(c2380);
        try {
            m52158(false);
        } catch (Exception e) {
            f76606.mo7082("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m52160() {
        return this.f76609.m18290().m2254();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52162(int i, String str) {
        C1278 c1278 = this.f76619;
        if (c1278.m4342()) {
            throw new IllegalStateException(C20094.m46315("This connection is already connected to ", m52160()));
        }
        c1278.m4340(new InetSocketAddress(str, i));
        C4332 c4332 = this.f76610;
        this.f76609 = new C6717(c4332.m13029(), str, i, c4332);
        new C5306(this, c4332, this.f76609).m15225();
        this.f76617.m37662(this.f76609);
        this.f76615 = new C19582();
        f76606.mo7087(m52160(), "Successfully connected to: {}");
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m52166() {
        return this.f76619.m4342();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6717 m52167() {
        return this.f76609;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52164() {
        return this.f76618.m48692();
    }

    @Handler
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52146(C23814 c23814) {
        this.f76608.m49950(Long.valueOf(c23814.m34931()));
        f76606.mo7100(Long.valueOf(c23814.m34931()), "Session << {} >> logged off");
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C22239 m52165() {
        return this.f76608;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22239 m52159() {
        return this.f76622;
    }
}
