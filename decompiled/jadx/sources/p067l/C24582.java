package p067l;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.Subject;

/* JADX INFO: renamed from: l.᩻֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E9ZA */
/* JADX INFO: loaded from: classes.dex */
public final class C24582 implements InterfaceC8489 {

    /* JADX INFO: renamed from: ܿ֫ */
    public static final InterfaceC4410 f77822 = C13128.m30022(C24582.class);

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC20106 f77823;

    /* JADX INFO: renamed from: ۗ */
    public boolean f77824;

    /* JADX INFO: renamed from: ۙ */
    public long f77825;

    /* JADX INFO: renamed from: ۛ */
    public byte[] f77826;

    /* JADX INFO: renamed from: ۤ */
    public long f77828;

    /* JADX INFO: renamed from: ۧ֫ */
    public ArrayList f77829;

    /* JADX INFO: renamed from: ۨ */
    public final String f77830;

    /* JADX INFO: renamed from: ۫ */
    public byte[] f77831;

    /* JADX INFO: renamed from: ܰ */
    public final C21901 f77833;

    /* JADX INFO: renamed from: ܽ֫ */
    public int f77834;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC18587 f77836;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC7799 f77838;

    /* JADX INFO: renamed from: ᩺ */
    public final String f77839;

    /* JADX INFO: renamed from: ᩸ */
    public final AtomicInteger f77837 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬ */
    public String f77832 = null;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final AtomicLong f77835 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۟ */
    public final AtomicBoolean f77827 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8489 m54203() {
        if (InterfaceC8489.class.isAssignableFrom(C24582.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C24582(InterfaceC20106 interfaceC20106, String str, String str2, C21901 c21901) {
        this.f77823 = interfaceC20106;
        this.f77830 = str2;
        this.f77839 = str;
        c21901.m21107();
        this.f77833 = c21901;
        this.f77829 = new ArrayList();
        this.f77838 = interfaceC20106.mo8528().mo18055().clone();
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3341 m54206() {
        return this.f77823.mo29602();
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m54202() {
        return this.f77830;
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m54200() {
        return this.f77839;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m54192() {
        return this.f77835.get() > 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54197() {
        long jIncrementAndGet = this.f77835.incrementAndGet();
        InterfaceC4410 interfaceC4410 = f77822;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f77827.compareAndSet(false, true)) {
                    interfaceC4410.mo9183("Reacquire transport");
                    this.f77833.m21107();
                }
            }
        }
    }

    public final void finalize() {
        if (!m54208() || this.f77835.get() == 0) {
            return;
        }
        f77822.mo9199("Session was not properly released");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m54210();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final void m54210() {
        long jDecrementAndGet = this.f77835.decrementAndGet();
        InterfaceC4410 interfaceC4410 = f77822;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C14740("Usage count dropped below zero");
            }
            return;
        }
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Usage dropped to zero, release connection " + this.f77833);
        }
        synchronized (this) {
            if (this.f77827.compareAndSet(true, false)) {
                this.f77833.m21114();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20560 m54196(String str) {
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f77829) {
            for (C20560 c20560 : this.f77829) {
                if (c20560.m46494(str, (String) null)) {
                    c20560.m46492();
                    return c20560;
                }
            }
            C20560 c20561 = new C20560(this, str);
            c20561.m46492();
            this.f77829.add(c20561);
            return c20561;
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final C21901 m54201() {
        C21901 c21901 = this.f77833;
        c21901.m21107();
        return c21901;
    }

    /* JADX INFO: renamed from: ܶ */
    public final boolean m54205() {
        if (m54204() != null) {
            return false;
        }
        C21901 c21901 = this.f77833;
        if (c21901.m49434()) {
            return true;
        }
        return c21901.m49441().mo12574();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m54189(InterfaceC18587 interfaceC18587) {
        C21901 c21901 = this.f77833;
        if (c21901.m49436()) {
            this.f77836 = interfaceC18587;
        } else {
            c21901.m49428(interfaceC18587);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC18587 m54204() {
        InterfaceC18587 interfaceC18587 = this.f77836;
        return interfaceC18587 != null ? interfaceC18587 : this.f77833.m49439();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 m54193(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) {
        InterfaceC20106 interfaceC20106 = this.f77823;
        InterfaceC4410 interfaceC4410 = f77822;
        C21901 c21901 = this.f77833;
        c21901.m21107();
        if (interfaceC3835 != null) {
            try {
                interfaceC3835.mo30260();
                interfaceC3835.mo12476(this.f77824);
            } catch (Throwable th) {
                try {
                    c21901.m21114();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        try {
            if (set.contains(EnumC2572.NO_TIMEOUT)) {
                this.f77825 = -1L;
            } else {
                this.f77825 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35107());
            }
            try {
                InterfaceC3835 interfaceC3836 = (InterfaceC3835) m54194(interfaceC9571, interfaceC3835);
                if (interfaceC3836 != null && interfaceC3836.mo30257()) {
                    interfaceC9571.mo12475((InterfaceC18587) null);
                    this.f77825 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35107());
                    c21901.m21114();
                    return interfaceC3836;
                }
                if (interfaceC9571 instanceof C6557) {
                    C6557 c6557 = (C6557) interfaceC9571;
                    if (this.f77832 != null && c6557.getPath().endsWith("\\IPC$")) {
                        c6557.mo8756("\\\\" + this.f77832 + "\\IPC$");
                    }
                }
                interfaceC9571.mo12487(this.f77828);
                interfaceC9571.mo12486(this.f77834);
                if (interfaceC9571.getDigest() == null) {
                    interfaceC9571.mo12475(m54204());
                }
                boolean z = interfaceC9571 instanceof InterfaceC17916;
                String str = this.f77830;
                if (z) {
                    ((InterfaceC17916) interfaceC9571).mo8757(str, this.f77839, ((InterfaceC17916) interfaceC9571).mo8767());
                }
                try {
                    if (interfaceC4410.mo9194()) {
                        interfaceC4410.mo9196("Request " + interfaceC9571);
                    }
                    try {
                        InterfaceC3835 interfaceC3835M49435 = c21901.m49435(interfaceC9571, interfaceC3835, set);
                        if (interfaceC4410.mo9194()) {
                            interfaceC4410.mo9196("Response " + interfaceC3835M49435);
                        }
                        interfaceC9571.mo12475((InterfaceC18587) null);
                        this.f77825 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35107());
                        c21901.m21114();
                        return interfaceC3835M49435;
                    } catch (C5255 e) {
                        if ((e.m11333() != -1073740964 && e.m11333() != -1073741309) || !c21901.m49436()) {
                            throw e;
                        }
                        if (e.m11333() == -1073741309) {
                            try {
                                interfaceC4410.mo9199("Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport");
                                c21901.m21121();
                            } catch (IOException e2) {
                                interfaceC4410.mo9178("Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error", (Throwable) e2);
                            }
                        }
                        interfaceC4410.mo9176("Session expired, trying reauth", (Exception) e);
                        InterfaceC3835 interfaceC3835M54188 = m54188(c21901, str, interfaceC9571, set);
                        interfaceC9571.mo12475((InterfaceC18587) null);
                        this.f77825 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35107());
                        c21901.m21114();
                        return interfaceC3835M54188;
                    }
                } catch (C9140 e3) {
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Have referral " + e3);
                    }
                    throw e3;
                } catch (C5255 e4) {
                    if (interfaceC4410.mo9194()) {
                        interfaceC4410.mo9192("Send failed", e4);
                        interfaceC4410.mo9196("Request: " + interfaceC9571);
                        interfaceC4410.mo9196("Response: " + interfaceC3835);
                    }
                    throw e4;
                }
            } catch (GeneralSecurityException e5) {
                throw new C5255("Session setup failed", e5);
            }
        } catch (Throwable th3) {
            interfaceC9571.mo12475((InterfaceC18587) null);
            this.f77825 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35107());
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r25v0, types: [l.᩷֨᩵] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [l.֫ۖ᩵] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC3835 m54187(C21901 c21901, String str) throws C5255 {
        Subject subject;
        InterfaceC7799 interfaceC7799;
        ?? r9;
        C8330 c8330;
        C5648 c5648 = (C5648) c21901.m49441();
        byte[] bArrM12559 = c5648.m12559();
        int i = ((c5648.m12566() & 2) != 0 || c21901.m49434()) ? 2 : 1;
        InterfaceC7799 interfaceC77910 = this.f77838;
        boolean zMo18056 = interfaceC77910.mo18056();
        boolean zM50996 = c5648.mo12576().m50996(EnumC22788.SMB311);
        ?? r15 = 0;
        byte[] bArrM49440 = zM50996 ? c21901.m49440() : null;
        this.f77831 = bArrM49440;
        InterfaceC4410 interfaceC4410 = f77822;
        if (bArrM49440 != null && interfaceC4410.mo9181()) {
            byte[] bArr = this.f77831;
            interfaceC4410.mo9183("Initial session preauth hash ".concat(C13854.m31530(bArr, 0, bArr.length)));
        }
        boolean z = zMo18056;
        long jM12504 = 0;
        InterfaceC16653 interfaceC16653M54195 = null;
        C8330 c8331 = null;
        C5255 c5255 = null;
        while (true) {
            if (interfaceC16653M54195 == null) {
                interfaceC16653M54195 = m54195(c21901, str, c5648, !z, null);
                subject = null;
            } else {
                subject = null;
            }
            byte[] bArrM54191 = m54191(interfaceC16653M54195, bArrM12559, subject);
            if (bArrM54191 != null) {
                InterfaceC20106 context = this.f77833.getContext();
                int iM12558 = c5648.m12558();
                long j = jM12504;
                interfaceC7799 = interfaceC77910;
                ?? r10 = r15;
                C12354 c12354 = new C12354(context, i, iM12558, 0L, bArrM54191);
                c12354.mo12487(j);
                c12354.mo12468();
                try {
                    c8330 = (C8330) c21901.m49435(c12354, r10, EnumSet.of(EnumC2572.RETAIN_PAYLOAD));
                    jM12504 = c8330.m12504();
                } catch (C23360 e) {
                    throw e;
                } catch (C5255 e2) {
                    C8330 c8332 = (C8330) c12354.mo7658();
                    if (e2.m11333() == -1073741811) {
                        throw new C23360("Login failed", e2);
                    }
                    if (!c8332.mo30257() || c8332.mo30253() || (c8332.m12485() != 0 && c8332.m12485() != -1073741802)) {
                        throw e2;
                    }
                    c5255 = e2;
                    c8330 = c8332;
                    jM12504 = j;
                }
                this.f77823.mo29602().getClass();
                if (c8330.m19218() && !interfaceC7799.mo18054() && !interfaceC7799.mo18056()) {
                    throw new C23360(-1073741715);
                }
                if (!interfaceC7799.mo18056() && c8330.m19218()) {
                    z = true;
                }
                if ((c8330.m19217() & 4) != 0) {
                    throw new C2453("Server requires encryption, not yet supported.");
                }
                if (zM50996) {
                    byte[] bArrM12482 = c12354.m12482();
                    this.f77831 = c21901.m49431(bArrM12482.length, bArrM12482, this.f77831);
                    if (c8330.m12485() == -1073741802) {
                        byte[] bArrM12483 = c8330.m12482();
                        this.f77831 = c21901.m49431(bArrM12483.length, bArrM12483, this.f77831);
                    }
                }
                c8331 = c8330;
                bArrM12559 = c8330.m19219();
                r9 = r10;
            } else {
                interfaceC7799 = interfaceC77910;
                r9 = r15;
                bArrM12559 = bArrM54191;
            }
            boolean z2 = z;
            if (interfaceC16653M54195.mo16428()) {
                interfaceC4410.mo9183("Context is established");
                this.f77832 = r9;
                byte[] bArrMo16430 = interfaceC16653M54195.mo16430();
                if (bArrMo16430 != null) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArrMo16430, 0, bArr2, 0, Math.min(16, bArrMo16430.length));
                    this.f77826 = bArr2;
                }
                boolean z3 = (c8331 == null || (c8331.m12499() & 8) == 0) ? false : true;
                if (!z2 && (m54205() || z3)) {
                    if (interfaceC16653M54195.mo16430() != null && c8331 != null) {
                        if (this.f77831 != null && interfaceC4410.mo9181()) {
                            byte[] bArr3 = this.f77831;
                            interfaceC4410.mo9183("Final preauth integrity hash ".concat(C13854.m31530(bArr3, 0, bArr3.length)));
                        }
                        C8310 c8310 = new C8310(this.f77826, c5648.m12565(), this.f77831);
                        if (c5648.mo12576().m50996(EnumC22788.SMB300) || (c8331.m12499() & 8) != 0) {
                            c8331.mo12475(c8310);
                            byte[] bArrM12484 = c8331.m12482();
                            if (!c8331.m32944(0, bArrM12484.length, bArrM12484)) {
                                throw new C5255("Signature validation failed");
                            }
                        }
                        m54189(c8310);
                    } else {
                        c21901.getContext().mo29602().getClass();
                    }
                } else if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("No digest setup " + z2 + " B " + m54205());
                }
                this.f77824 = true;
                this.f77837.set(2);
                this.f77828 = c8331.m12504();
                if (c5255 != null) {
                    throw c5255;
                }
                return c8331.m12505();
            }
            z = z2;
            interfaceC77910 = interfaceC7799;
            interfaceC4410 = interfaceC4410;
            r15 = r9;
            c5648 = c5648;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m54191(InterfaceC16653 interfaceC16653, byte[] bArr, Subject subject) throws C5255 {
        if (subject == null) {
            return interfaceC16653.mo16429(bArr == null ? 0 : bArr.length, bArr);
        }
        try {
            return (byte[]) Subject.doAs(subject, new C18547(interfaceC16653, bArr));
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof C5255) {
                throw ((C5255) e.getException());
            }
            throw new C5255("Unexpected exception during context initialization", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC16653 m54195(C21901 c21901, String str, C5648 c5648, boolean z, Subject subject) throws C5255 {
        InterfaceC4410 interfaceC4410 = f77822;
        String strMo3408 = this.f77839;
        if (strMo3408 == null) {
            strMo3408 = c21901.m49433().mo3408();
            try {
                strMo3408 = c21901.m49433().mo3411();
            } catch (Exception e) {
                interfaceC4410.mo9176("Failed to resolve host name", e);
            }
        }
        String str2 = strMo3408;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Remote host is " + str2);
        }
        if (subject != null) {
            try {
                return (InterfaceC16653) Subject.doAs(subject, new C15864(this, str, str2, c5648, z));
            } catch (PrivilegedActionException e2) {
                if (e2.getException() instanceof C5255) {
                    throw ((C5255) e2.getException());
                }
                throw new C5255("Unexpected exception during context initialization", e2);
            }
        }
        return this.f77838.mo18053(this.f77833.getContext(), str2, c5648.m12559(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    private InterfaceC3835 m54188(C21901 c21901, String str, InterfaceC9571 interfaceC9571, Set set) {
        C8330 c8330;
        C5648 c5648 = (C5648) c21901.m49441();
        byte[] bArrM12559 = c5648.m12559();
        boolean z = (c5648.m12566() == 0 || this.f77838.mo18056()) ? false : true;
        long j = this.f77828;
        synchronized (c21901) {
            this.f77838.getClass();
            this.f77838.getClass();
            InterfaceC16653 interfaceC16653M54195 = m54195(c21901, str, c5648, z, null);
            C8330 c8331 = null;
            C5255 c5255 = null;
            do {
                byte[] bArrM54191 = m54191(interfaceC16653M54195, bArrM12559, (Subject) null);
                if (bArrM54191 != null) {
                    C12354 c12354 = new C12354(this.f77833.getContext(), c5648.m12566(), c5648.m12558(), j, bArrM54191);
                    if (interfaceC9571 != 0) {
                        c12354.mo12477((AbstractC5628) interfaceC9571);
                    }
                    c12354.mo12475(this.f77836);
                    c12354.mo12487(j);
                    try {
                        try {
                            try {
                                c8330 = (C8330) c21901.m49435(c12354, null, EnumSet.of(EnumC2572.RETAIN_PAYLOAD));
                                if (c8330.m12504() != j) {
                                    throw new C23360("Server did not reauthenticate after expiration");
                                }
                            } catch (C5255 e) {
                                e = e;
                                C8330 c8332 = (C8330) c12354.mo7658();
                                if (!c8332.mo30257() || c8332.mo30253() || (c8332.m12485() != 0 && c8332.m12485() != -1073741802)) {
                                    throw e;
                                }
                                c5255 = e;
                                c8330 = c8332;
                            }
                        } catch (C5255 e2) {
                            e = e2;
                        }
                        this.f77823.mo29602().getClass();
                        if (c8330.m19218() && !this.f77838.mo18054() && !this.f77838.mo18056()) {
                            throw new C23360(-1073741715);
                        }
                        this.f77838.mo18056();
                        if (c12354.getDigest() != null) {
                            f77822.mo9183("Setting digest");
                            m54189(c12354.getDigest());
                        }
                        c8331 = c8330;
                        bArrM12559 = c8330.m19219();
                    } catch (C23360 e3) {
                        throw e3;
                    }
                } else {
                    bArrM12559 = bArrM54191;
                }
                if (c5255 != null) {
                    throw c5255;
                }
            } while (!interfaceC16653M54195.mo16428());
            this.f77824 = true;
            this.f77837.set(2);
            this.f77828 = c8331.m12504();
            InterfaceC3835 interfaceC3835M12505 = c8331.m12505();
            if (interfaceC3835M12505 != null && interfaceC3835M12505.mo30257()) {
                return interfaceC3835M12505;
            }
            if (interfaceC9571 != 0) {
                return this.f77833.m49435(interfaceC9571, null, set);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0343 A[LOOP:0: B:3:0x001d->B:176:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0342 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    private void m54190(C21901 c21901, String str, AbstractC13224 abstractC13224, AbstractC13224 abstractC13225) throws C5255 {
        C22651 c22651;
        byte[] bArr;
        C5255 c23360;
        String str2;
        C10580 c10580 = (C10580) c21901.m49441();
        InterfaceC7799 interfaceC7799 = this.f77838;
        int i = 10;
        InterfaceC16653 interfaceC16653Mo18053 = null;
        C5255 c5255 = null;
        InterfaceC9571 interfaceC9571 = null;
        C22651 c22652 = null;
        boolean zMo18056 = interfaceC7799.mo18056();
        byte[] bArrM50711 = new byte[0];
        while (true) {
            AtomicInteger atomicInteger = this.f77837;
            InterfaceC20106 interfaceC20106 = this.f77823;
            int i2 = 20;
            C21901 c21902 = this.f77833;
            C5255 c5256 = c5255;
            InterfaceC4410 interfaceC4410 = f77822;
            if (i == 10) {
                InterfaceC9571 interfaceC9572 = interfaceC9571;
                if (c21901.m49441().mo12572(Integer.MIN_VALUE)) {
                    interfaceC4410.mo9183("Extended security negotiated");
                    c5255 = c5256;
                    interfaceC9571 = interfaceC9572;
                } else {
                    c21902.getContext().mo29602().getClass();
                    interfaceC4410.mo9183("Performing legacy session setup");
                    if (!(interfaceC7799 instanceof C20008)) {
                        throw new C23360("Incompatible credentials");
                    }
                    C20008 c20008 = (C20008) interfaceC7799;
                    InterfaceC9571 c16614 = new C16614(c21902.getContext(), c10580, abstractC13224, interfaceC7799);
                    c16614.mo12475(m54204());
                    byte[] bArr2 = bArrM50711;
                    C22651 c22653 = new C22651(c21902.getContext().mo29602(), abstractC13225);
                    c22653.mo12476(false);
                    if (!zMo18056 && m54205()) {
                        InterfaceC20106 context = c21902.getContext();
                        if ((c20008 instanceof C4585) && ((C4585) c20008).m9667()) {
                            context.mo29602().getClass();
                        }
                        interfaceC4410.mo9183("Initialize signing");
                        InterfaceC20106 context2 = c21902.getContext();
                        byte[] bArr3 = c10580.m24379().f43473;
                        int iM35103 = ((C15410) context2.mo29602()).m35103();
                        if (iM35103 == 0 || iM35103 == 1 || iM35103 == 2) {
                            byte[] bArr4 = new byte[40];
                            c20008.m45376(context2, bArr3, bArr4);
                            System.arraycopy(c20008.m45378(context2, bArr3), 0, bArr4, 16, 24);
                            bArr = bArr4;
                        } else {
                            if (iM35103 == 3 || iM35103 == 4 || iM35103 == 5) {
                                throw new C5255("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
                            }
                            bArr = null;
                        }
                        if (bArr == null) {
                            throw new C5255("Need a signature key but the server did not provide one");
                        }
                        c16614.mo12475(new C7859(bArr, 0));
                    }
                    try {
                        c21901.m49427(c16614, (AbstractC13224) c22653);
                        c5255 = c5256;
                    } catch (C23360 e) {
                        throw e;
                    } catch (C5255 e2) {
                        c5255 = e2;
                    }
                    interfaceC20106.mo29602().getClass();
                    if (c22653.m50710() && c10580.m24379().f43472 != 0 && !interfaceC7799.mo18054() && !interfaceC7799.mo18056()) {
                        throw new C23360(-1073741715);
                    }
                    if (!interfaceC7799.mo18056() && c22653.m50710()) {
                        zMo18056 = true;
                    }
                    if (c5255 != null) {
                        throw c5255;
                    }
                    this.f77834 = c22653.m30268();
                    if (c16614.getDigest() != null) {
                        m54189(c16614.getDigest());
                    } else if (!zMo18056 && m54205()) {
                        throw new C5255("Signing required but no session key available");
                    }
                    this.f77824 = c22653.m30265();
                    atomicInteger.set(2);
                    c22651 = c22653;
                    bArrM50711 = bArr2;
                    interfaceC9571 = c16614;
                    i = 0;
                }
                if (i == 0) {
                    return;
                } else {
                    c22652 = c22651;
                }
            } else {
                if (i != 20) {
                    throw new C5255(C20778.m46922(i, "Unexpected session setup state: "));
                }
                boolean z = (zMo18056 || (c10580.m24374() & 4) == 0) ? false : true;
                if (interfaceC16653Mo18053 == null) {
                    String strMo3411 = this.f77839;
                    if (strMo3411 == null) {
                        String strMo3408 = c21901.m49433().mo3408();
                        try {
                            strMo3411 = c21901.m49433().mo3411();
                            str2 = strMo3411;
                        } catch (Exception e3) {
                            interfaceC4410.mo9176("Failed to resolve host name", e3);
                            str2 = strMo3408;
                        }
                    } else {
                        str2 = strMo3411;
                    }
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Remote host is " + str2);
                    }
                    interfaceC16653Mo18053 = interfaceC7799.mo18053(c21902.getContext(), str2, c10580.m24379().f43473, z);
                } else {
                    interfaceC9571 = interfaceC9571;
                }
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196(interfaceC16653Mo18053.toString());
                }
                try {
                    byte[] bArrMo16429 = interfaceC16653Mo18053.mo16429(bArrM50711 == null ? 0 : bArrM50711.length, bArrM50711);
                    if (bArrMo16429 != null) {
                        InterfaceC9571 c16615 = new C16614(c21902.getContext(), c10580, null, bArrMo16429);
                        c16615.mo12475(m54204());
                        if (z && interfaceC16653Mo18053.mo16428() && m54205()) {
                            byte[] bArrMo16430 = interfaceC16653Mo18053.mo16430();
                            if (bArrMo16430 != null) {
                                c16615.mo12475(new C7859(bArrMo16430));
                            }
                            this.f77826 = bArrMo16430;
                        } else {
                            interfaceC4410.mo9196("Not yet initializing signing");
                        }
                        C22651 c22654 = new C22651(c21902.getContext().mo29602(), null);
                        c22654.mo12476(true);
                        c16615.mo12486(this.f77834);
                        this.f77834 = 0;
                        try {
                            c21901.m49427(c16615, (AbstractC13224) c22654);
                            c23360 = c5256;
                        } catch (C23360 e4) {
                            throw e4;
                        } catch (C5255 e5) {
                            c23360 = e5;
                            if (c23360.m11333() == -1073741811) {
                                c23360 = new C23360("Login failed", c23360);
                            }
                            try {
                                c21901.m21121();
                            } catch (Exception e6) {
                                interfaceC4410.mo9176("Failed to disconnect transport", e6);
                            }
                        }
                        interfaceC20106.mo29602().getClass();
                        if (c22654.m50710() && !interfaceC7799.mo18054() && !interfaceC7799.mo18056()) {
                            throw new C23360(-1073741715);
                        }
                        if (!interfaceC7799.mo18056() && c22654.m50710()) {
                            zMo18056 = true;
                        }
                        if (c23360 != null) {
                            throw c23360;
                        }
                        this.f77834 = c22654.m30268();
                        if (c16615.getDigest() != null) {
                            interfaceC4410.mo9183("Setting digest");
                            m54189(c16615.getDigest());
                        }
                        bArrM50711 = c22654.m50711();
                        c22651 = c22654;
                        interfaceC9571 = c16615;
                    } else {
                        bArrM50711 = bArrMo16429;
                        c22651 = c22652;
                        interfaceC9571 = interfaceC9571;
                        c23360 = c5256;
                    }
                    if (interfaceC16653Mo18053.mo16428()) {
                        interfaceC4410.mo9183("Context is established");
                        this.f77832 = null;
                        this.f77826 = interfaceC16653Mo18053.mo16430();
                        if (interfaceC9571 != null && interfaceC9571.getDigest() != null) {
                            m54189(interfaceC9571.getDigest());
                        } else if (!zMo18056 && m54205()) {
                            byte[] bArrMo16431 = interfaceC16653Mo18053.mo16430();
                            if (bArrMo16431 == null || c22651 == null) {
                                c21901.getContext().mo29602().getClass();
                            } else {
                                m54189(new C7859(bArrMo16431, (Object) null));
                            }
                            this.f77826 = bArrMo16431;
                        }
                        this.f77824 = c22651.m30265();
                        atomicInteger.set(2);
                        i2 = 0;
                        c5255 = c23360;
                        c22652 = c22651;
                    } else {
                        c5255 = c23360;
                    }
                    if (i == 0) {
                        return;
                    } else {
                        c22652 = c22651;
                    }
                } catch (C5255 e7) {
                    try {
                        interfaceC4410.mo9178("Exception during SSP authentication", (Throwable) e7);
                        c21901.m21121();
                    } catch (IOException unused) {
                        interfaceC4410.mo9183("Disconnect failed");
                    }
                    this.f77834 = 0;
                    throw e7;
                }
            }
            c22651 = c22652;
            i = i2;
            if (i == 0) {
                return;
            } else {
                c22652 = c22651;
            }
        }
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f77823.mo8528() + ",targetHost=" + this.f77839 + ",targetDomain=" + this.f77830 + ",uid=" + this.f77834 + ",connectionState=" + this.f77837 + ",usage=" + this.f77835.get() + "]";
    }

    public final InterfaceC20106 getContext() {
        return this.f77833.getContext();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC15605 m54194(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835) {
        C21901 c21901 = this.f77833;
        c21901.m21107();
        try {
            synchronized (c21901) {
                while (!this.f77837.compareAndSet(0, 1)) {
                    try {
                        int i = this.f77837.get();
                        if (i == 2 || i == 3) {
                            c21901.m21114();
                            return interfaceC3835;
                        }
                        try {
                            this.f77833.wait();
                        } catch (InterruptedException e) {
                            throw new C5255(e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        c21901.notifyAll();
                        throw th;
                    }
                }
                try {
                    c21901.m49438();
                    InterfaceC4410 interfaceC4410 = f77822;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("sessionSetup: " + this.f77838);
                    }
                    this.f77834 = 0;
                    if (!c21901.m49436()) {
                        m54190(c21901, this.f77830, (AbstractC13224) interfaceC9571, (AbstractC13224) interfaceC3835);
                        c21901.notifyAll();
                        c21901.m21114();
                        return interfaceC3835;
                    }
                    InterfaceC3835 interfaceC3835M54187 = m54187(c21901, this.f77830);
                    c21901.notifyAll();
                    c21901.m21114();
                    return interfaceC3835M54187;
                } catch (Exception e2) {
                    f77822.mo9176("Session setup failed", e2);
                    if (this.f77837.compareAndSet(1, 0)) {
                        m54199(true, true);
                    }
                    throw e2;
                }
            }
        } catch (Throwable th2) {
            try {
                c21901.m21114();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [l.᩻֨᩵] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [l.᩻֨᩵] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m54199(boolean z, boolean z2) throws Throwable {
        ?? r2;
        ?? r3 = "Logging off session while still in use ";
        try {
            try {
                try {
                    C21901 c21901 = this.f77833;
                    c21901.m21107();
                    try {
                        try {
                            synchronized (c21901) {
                                try {
                                    if (!this.f77837.compareAndSet(2, 3)) {
                                        c21901.m21114();
                                        this.f77837.set(0);
                                        this.f77836 = null;
                                        this.f77833.notifyAll();
                                        return false;
                                    }
                                    InterfaceC4410 interfaceC4410 = f77822;
                                    if (interfaceC4410.mo9181()) {
                                        interfaceC4410.mo9183("Logging off session on " + c21901);
                                    }
                                    this.f77832 = null;
                                    synchronized (this.f77829) {
                                        try {
                                            long j = this.f77835.get();
                                            if ((!z2 || j == 1) && (z2 || j <= 0)) {
                                                z2 = false;
                                            } else {
                                                interfaceC4410.mo9199("Logging off session while still in use " + this + ":" + this.f77829);
                                                z2 = true;
                                            }
                                            try {
                                                for (C20560 c20560 : this.f77829) {
                                                    try {
                                                        f77822.mo9183("Disconnect tree on logoff");
                                                        z2 |= c20560.m46495(z, false);
                                                    } catch (Exception e) {
                                                        f77822.mo9178("Failed to disconnect tree " + c20560, (Throwable) e);
                                                    }
                                                }
                                                if (z) {
                                                    if (!z) {
                                                        C24661 c24661 = new C24661(this.f77823.mo29602());
                                                        c24661.mo12475(m54204());
                                                        c24661.mo12486(this.f77834);
                                                        this.f77833.m49427((InterfaceC9571) c24661, (AbstractC13224) new C9200(this.f77823.mo29602()));
                                                        this.f77834 = 0;
                                                    }
                                                    c21901.m21114();
                                                    r2 = this;
                                                } else {
                                                    try {
                                                        if (c21901.m49436()) {
                                                            C15035 c15035 = new C15035(this.f77823.mo29602(), 2);
                                                            c15035.mo12475(m54204());
                                                            c15035.mo12487(this.f77828);
                                                            try {
                                                                this.f77833.m49427((InterfaceC9571) c15035, (AbstractC13224) null);
                                                            } catch (C5255 e2) {
                                                                f77822.mo9176("Smb2LogoffRequest failed", (Exception) e2);
                                                            }
                                                        } else if (!z && ((C10580) c21901.m49441()).m24379().f43472 != 0) {
                                                            C24661 c24662 = new C24661(this.f77823.mo29602());
                                                            c24662.mo12475(m54204());
                                                            c24662.mo12486(this.f77834);
                                                            try {
                                                                this.f77833.m49427((InterfaceC9571) c24662, (AbstractC13224) new C9200(this.f77823.mo29602()));
                                                            } catch (C5255 e3) {
                                                                f77822.mo9176("SmbComLogoffAndX failed", (Exception) e3);
                                                            }
                                                            this.f77834 = 0;
                                                        }
                                                        try {
                                                            c21901.m21114();
                                                            r2 = this;
                                                        } catch (C5255 e4) {
                                                            e = e4;
                                                            r3 = this;
                                                            f77822.mo9178("Error in logoff", (Throwable) e);
                                                            r2 = r3;
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        r3 = this;
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            try {
                                                                c21901.m21114();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    th.addSuppressed(th3);
                                                                } catch (C5255 e5) {
                                                                    e = e5;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                r2.f77837.set(0);
                                                r2.f77836 = null;
                                                r2.f77833.notifyAll();
                                                return z2;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                while (true) {
                                                    try {
                                                        throw th;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                    }
                                    r2.f77837.set(0);
                                    r2.f77836 = null;
                                    r2.f77833.notifyAll();
                                    return z2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    z2 = false;
                                }
                                r3 = this;
                                f77822.mo9178("Error in logoff", (Throwable) e);
                                r2 = r3;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z2 = false;
                        r3 = this;
                        c21901.m21114();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r3.f77837.set(0);
                    r3.f77836 = null;
                    r3.f77833.notifyAll();
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
                r3 = this;
                r3.f77837.set(0);
                r3.f77836 = null;
                r3.f77833.notifyAll();
                throw th;
            }
        } catch (C5255 e6) {
            e = e6;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Long m54211() {
        long j = this.f77825;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m54198(InterfaceC20106 interfaceC20106, String str, String str2) {
        return C12826.equals(this.f77838, interfaceC20106.mo8528()) && C12826.equals(this.f77839, str) && C12826.equals(this.f77830, str2);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC7799 m54207() {
        return this.f77838;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m54208() {
        return !this.f77833.mo21123() && this.f77837.get() == 2;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final boolean m54209() {
        return this.f77833.mo21115();
    }
}
