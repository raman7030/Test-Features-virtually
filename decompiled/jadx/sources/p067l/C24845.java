package p067l;

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
public final class C24845 extends C15201 implements Closeable, InterfaceC10665 {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final InterfaceC4410 f79352 = C13128.m30022(C24845.class);

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final C16127 f79353 = new C16127(new C20842(), new C4748(), new C18829(), new C20014());

    /* JADX INFO: renamed from: ֫֫ */
    public C23504 f79354;

    /* JADX INFO: renamed from: ۗ */
    public C8752 f79355;

    /* JADX INFO: renamed from: ۙ */
    public C6485 f79356;

    /* JADX INFO: renamed from: ۛ */
    public C4214 f79357;

    /* JADX INFO: renamed from: ۟ */
    public final C7567 f79358;

    /* JADX INFO: renamed from: ۤ */
    public C11435 f79359;

    /* JADX INFO: renamed from: ۧ֫ */
    public InterfaceC21493 f79360;

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC6226 f79361;

    /* JADX INFO: renamed from: ۫ */
    public final ReentrantLock f79362;

    /* JADX INFO: renamed from: ۬ */
    public C17468 f79363;

    /* JADX INFO: renamed from: ܰ */
    public C22834 f79364;

    /* JADX INFO: renamed from: ܽ֫ */
    public C3583 f79365;

    /* JADX INFO: renamed from: ᩶ */
    public final C23249 f79366;

    /* JADX INFO: renamed from: ᩹ */
    public final C18966 f79367;

    /* JADX INFO: renamed from: ᩺ */
    public C23504 f79368;

    /* JADX INFO: renamed from: ֫ */
    public final void m54560(InterfaceC7487 interfaceC7487) {
        this.f79357.m15402((AbstractC9837) interfaceC7487);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C23249 m54566() {
        return this.f79366;
    }

    public C24845(C6485 c6485, C23249 c23249, C18966 c18966, C7567 c7567) {
        C23504 c23504 = new C23504();
        this.f79354 = c23504;
        this.f79368 = new C23504();
        C11435 c11435 = new C11435();
        this.f79359 = c11435;
        C9284 c9284 = new C9284();
        this.f79362 = new ReentrantLock();
        this.f79356 = c6485;
        this.f79366 = c23249;
        C0932 c0932M14888 = c6485.m14888();
        C22646 c22646 = new C22646(new C15426(), this, f79353);
        c0932M14888.getClass();
        this.f79365 = new C3583(c6485.m14901(), c6485.m14890(), c22646);
        this.f79367 = c18966;
        this.f79358 = c7567;
        c18966.m43091(this);
        this.f79364 = new C22834();
        if (c6485.m14889()) {
            this.f79360 = new C6070(c6485.m14902());
        } else {
            f79352.mo9199("Signing is disabled for this connection.");
            this.f79360 = new C4965();
        }
        this.f79363 = new C17468(c6485.m14902());
        C4214 c4214 = new C4214(c23504, this.f79363);
        C12105 c12105 = new C12105();
        C13446 c13446 = new C13446(c11435);
        C9422 c9422 = new C9422(c23504, this.f79360);
        C8081 c8081 = new C8081(this.f79364);
        C14116 c14116 = new C14116(c11435);
        C15456 c15456 = new C15456(c9284, c11435);
        C14786 c14786 = new C14786();
        c14786.m15401(new C5399());
        c15456.m15401(c14786);
        c14116.m15401(c15456);
        c8081.m15401(c14116);
        c9422.m15401(c8081);
        c13446.m15401(c9422);
        c12105.m15401(c13446);
        c4214.m15401(c12105);
        this.f79357 = c4214;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m54561(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54561(boolean z) {
        if (z || m34634()) {
            C18966 c18966 = this.f79367;
            C3583 c3583 = this.f79365;
            InterfaceC4410 interfaceC4410 = f79352;
            if (!z) {
                try {
                    for (C16953 c16953 : this.f79354.m52275()) {
                        try {
                            c16953.m38542();
                        } catch (IOException e) {
                            interfaceC4410.mo9193("Exception while closing session {}", Long.valueOf(c16953.m38541()), e);
                        }
                    }
                } catch (Throwable th) {
                    c3583.m6585();
                    interfaceC4410.mo9182(m54563(), "Closed connection to {}");
                    c18966.m43092(new C12932(this.f79355.m20238().m4621(), this.f79355.m20238().m4619()));
                    throw th;
                }
            }
            c3583.m6585();
            interfaceC4410.mo9182(m54563(), "Closed connection to {}");
            c18966.m43092(new C12932(this.f79355.m20238().m4621(), this.f79355.m20238().m4619()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16953 m54557(C5144 c5144) {
        return new C16797(this, this.f79356, new C19481(this)).m38069(c5144);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18158 m54558(C18158 c18158) {
        C12677 c12677M54556 = m54556(c18158, false);
        long jM14887 = this.f79356.m14887();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC18040 interfaceC18040 = C4630.f10377;
        return (C18158) C19382.m44125(jM14887, c12677M54556);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004d A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #1 {all -> 0x00ca, blocks: (B:5:0x000f, B:8:0x0025, B:10:0x002d, B:17:0x0042, B:19:0x004d, B:21:0x0060, B:24:0x00c9, B:15:0x003e, B:20:0x005c), top: B:33:0x000f, inners: #0 }] */
    /* JADX INFO: renamed from: ֫ */
    public final C12677 m54556(C18158 c18158, boolean z) {
        C12677 c12677M45601;
        C22834 c22834 = this.f79364;
        if (c18158.mo10021() instanceof C10112) {
            c12677M45601 = null;
        } else {
            ReentrantLock reentrantLock = this.f79362;
            reentrantLock.lock();
            try {
                int iM51037 = c22834.m51037();
                int iAbs = Math.abs((c18158.mo10023() - 1) / 65536) + 1;
                InterfaceC4410 interfaceC4410 = f79352;
                if (iAbs <= 1 || this.f79355.m20234()) {
                    if (iAbs >= iM51037) {
                        if (iAbs > 1 && iM51037 > 1) {
                            iAbs = iM51037 - 1;
                        }
                    }
                    ((C24864) c18158.mo5341()).m54599(iAbs);
                    if (iM51037 == 0) {
                        interfaceC4410.mo9198(((C24864) c18158.mo5341()).m54620(), "There are no credits left to send {}, will block until there are more credits available.");
                    }
                    ((C24864) c18158.mo5341()).m54608(c22834.m51039(iAbs)[0]);
                    ((C24864) c18158.mo5341()).m54607(Math.max((512 - iM51037) - iAbs, iAbs));
                    interfaceC4410.mo9187("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM51037), c18158);
                    reentrantLock.unlock();
                    C20152 c20152 = new C20152(c18158.mo10021(), ((C24864) c18158.mo5341()).m54604(), UUID.randomUUID(), z);
                    this.f79359.m26424(c20152);
                    c12677M45601 = c20152.m45601(new C18810(this, c20152, ((C24864) c18158.mo5341()).m54606()));
                } else {
                    interfaceC4410.mo9190(m54563(), "Connection to {} does not support multi-credit requests.");
                }
                iAbs = 1;
                ((C24864) c18158.mo5341()).m54599(iAbs);
                if (iM51037 == 0) {
                    interfaceC4410.mo9198(((C24864) c18158.mo5341()).m54620(), "There are no credits left to send {}, will block until there are more credits available.");
                }
                ((C24864) c18158.mo5341()).m54608(c22834.m51039(iAbs)[0]);
                ((C24864) c18158.mo5341()).m54607(Math.max((512 - iM51037) - iAbs, iAbs));
                interfaceC4410.mo9187("Granted {} (out of {}) credits to {}", Integer.valueOf(iAbs), Integer.valueOf(iM51037), c18158);
                reentrantLock.unlock();
                C20152 c20153 = new C20152(c18158.mo10021(), ((C24864) c18158.mo5341()).m54604(), UUID.randomUUID(), z);
                this.f79359.m26424(c20153);
                c12677M45601 = c20153.m45601(new C18810(this, c20153, ((C24864) c18158.mo5341()).m54606()));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        this.f79365.m6587(c18158);
        return c12677M45601;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C22164 m54564() {
        return this.f79355.m20233();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54559(C4630 c4630) {
        this.f79359.m26423(c4630);
        try {
            m54561(false);
        } catch (Exception e) {
            f79352.mo9177("{} while closing connection on error, ignoring: {}", e.getClass().getSimpleName(), e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final String m54563() {
        return this.f79355.m20238().m4621();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54565(int i, String str) {
        C3583 c3583 = this.f79365;
        if (c3583.m6588()) {
            throw new IllegalStateException(C21466.m48631("This connection is already connected to ", m54563()));
        }
        c3583.m6586(new InetSocketAddress(str, i));
        C6485 c6485 = this.f79356;
        this.f79355 = new C8752(c6485.m14893(), str, i, c6485);
        new C7411(this, c6485, this.f79355).m17129();
        this.f79363.m39834(this.f79355);
        this.f79361 = new C20979();
        f79352.mo9182(m54563(), "Successfully connected to: {}");
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m54569() {
        return this.f79365.m6588();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C8752 m54570() {
        return this.f79355;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m54567() {
        return this.f79364.m51037();
    }

    @Handler
    /* JADX INFO: renamed from: ֫ */
    private void m54549(C25001 c25001) {
        this.f79354.m52278(Long.valueOf(c25001.m37078()));
        f79352.mo9195(Long.valueOf(c25001.m37078()), "Session << {} >> logged off");
    }

    /* JADX INFO: renamed from: ᩴ */
    public final C23504 m54568() {
        return this.f79354;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C23504 m54562() {
        return this.f79368;
    }
}
