package l;

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
public final class C23373 implements InterfaceC6440 {

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f75075 = C11321.m27961(C23373.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f75076;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f75077;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f75078;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte[] f75079;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f75081;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f75082;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f75083;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte[] f75084;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20552 f75086;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f75087;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC17065 f75089;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC5714 f75091;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f75092;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f75090 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f75085 = null;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f75088 = new AtomicLong(1);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f75080 = new AtomicBoolean(true);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6440 m51806() {
        if (InterfaceC6440.class.isAssignableFrom(C23373.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    public C23373(InterfaceC18663 interfaceC18663, String str, String str2, C20552 c20552) {
        this.f75076 = interfaceC18663;
        this.f75083 = str2;
        this.f75092 = str;
        c20552.m19164();
        this.f75086 = c20552;
        this.f75082 = new ArrayList();
        this.f75091 = interfaceC18663.mo6355().mo16136().clone();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 m51809() {
        return this.f75076.mo27540();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m51805() {
        return this.f75083;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m51803() {
        return this.f75092;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m51795() {
        return this.f75088.get() > 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51800() {
        long jIncrementAndGet = this.f75088.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f75075;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Acquire session " + jIncrementAndGet + " " + this);
        }
        if (jIncrementAndGet == 1) {
            synchronized (this) {
                if (this.f75080.compareAndSet(false, true)) {
                    interfaceC2148.mo7088("Reacquire transport");
                    this.f75086.m19164();
                }
            }
        }
    }

    public final void finalize() {
        if (!m51811() || this.f75088.get() == 0) {
            return;
        }
        f75075.mo7104("Session was not properly released");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m51813();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m51813() {
        long jDecrementAndGet = this.f75088.decrementAndGet();
        InterfaceC2148 interfaceC2148 = f75075;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Release session " + jDecrementAndGet + " " + this);
        }
        if (jDecrementAndGet != 0) {
            if (jDecrementAndGet < 0) {
                throw new C13017("Usage count dropped below zero");
            }
            return;
        }
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Usage dropped to zero, release connection " + this.f75086);
        }
        synchronized (this) {
            if (this.f75080.compareAndSet(true, false)) {
                this.f75086.m19171();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19141 m51799(String str) {
        if (str == null) {
            str = "IPC$";
        }
        synchronized (this.f75082) {
            for (C19141 c19141 : this.f75082) {
                if (c19141.m44200(str, (String) null)) {
                    c19141.m44198();
                    return c19141;
                }
            }
            C19141 c19142 = new C19141(this, str);
            c19142.m44198();
            this.f75082.add(c19142);
            return c19142;
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20552 m51804() {
        C20552 c20552 = this.f75086;
        c20552.m19164();
        return c20552;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m51808() {
        if (m51807() != null) {
            return false;
        }
        C20552 c20552 = this.f75086;
        if (c20552.m47110()) {
            return true;
        }
        return c20552.m47117().mo10550();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51792(InterfaceC17065 interfaceC17065) {
        C20552 c20552 = this.f75086;
        if (c20552.m47112()) {
            this.f75089 = interfaceC17065;
        } else {
            c20552.m47104(interfaceC17065);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17065 m51807() {
        InterfaceC17065 interfaceC17065 = this.f75089;
        return interfaceC17065 != null ? interfaceC17065 : this.f75086.m47115();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m51796(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        InterfaceC18663 interfaceC18663 = this.f75076;
        InterfaceC2148 interfaceC2148 = f75075;
        C20552 c20552 = this.f75086;
        c20552.m19164();
        if (interfaceC1543 != null) {
            try {
                interfaceC1543.mo28216();
                interfaceC1543.mo10437(this.f75077);
            } catch (Throwable th) {
                try {
                    c20552.m19171();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        try {
            if (set.contains(EnumC0214.NO_TIMEOUT)) {
                this.f75078 = -1L;
            } else {
                this.f75078 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32993());
            }
            try {
                InterfaceC1543 interfaceC1544 = (InterfaceC1543) m51797(interfaceC7578, interfaceC1543);
                if (interfaceC1544 != null && interfaceC1544.mo28213()) {
                    interfaceC7578.mo10436((InterfaceC17065) null);
                    this.f75078 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32993());
                    c20552.m19171();
                    return interfaceC1544;
                }
                if (interfaceC7578 instanceof C4407) {
                    C4407 c4407 = (C4407) interfaceC7578;
                    if (this.f75085 != null && c4407.getPath().endsWith("\\IPC$")) {
                        c4407.mo6630("\\\\" + this.f75085 + "\\IPC$");
                    }
                }
                interfaceC7578.mo10448(this.f75081);
                interfaceC7578.mo10447(this.f75087);
                if (interfaceC7578.getDigest() == null) {
                    interfaceC7578.mo10436(m51807());
                }
                boolean z = interfaceC7578 instanceof InterfaceC16359;
                String str = this.f75083;
                if (z) {
                    ((InterfaceC16359) interfaceC7578).mo6631(str, this.f75092, ((InterfaceC16359) interfaceC7578).mo6641());
                }
                try {
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7101("Request " + interfaceC7578);
                    }
                    try {
                        InterfaceC1543 interfaceC1543M47111 = c20552.m47111(interfaceC7578, interfaceC1543, set);
                        if (interfaceC2148.mo7099()) {
                            interfaceC2148.mo7101("Response " + interfaceC1543M47111);
                        }
                        interfaceC7578.mo10436((InterfaceC17065) null);
                        this.f75078 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32993());
                        c20552.m19171();
                        return interfaceC1543M47111;
                    } catch (C3037 e) {
                        if ((e.m9291() != -1073740964 && e.m9291() != -1073741309) || !c20552.m47112()) {
                            throw e;
                        }
                        if (e.m9291() == -1073741309) {
                            try {
                                interfaceC2148.mo7104("Got NT_STATUS_USER_SESSION_DELETED, disconnecting transport");
                                c20552.m19178();
                            } catch (IOException e2) {
                                interfaceC2148.mo7083("Got NT_STATUS_USER_SESSION_DELETED, disconnected transport with error", (Throwable) e2);
                            }
                        }
                        interfaceC2148.mo7081("Session expired, trying reauth", (Exception) e);
                        InterfaceC1543 interfaceC1543M51791 = m51791(c20552, str, interfaceC7578, set);
                        interfaceC7578.mo10436((InterfaceC17065) null);
                        this.f75078 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32993());
                        c20552.m19171();
                        return interfaceC1543M51791;
                    }
                } catch (C7125 e3) {
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Have referral " + e3);
                    }
                    throw e3;
                } catch (C3037 e4) {
                    if (interfaceC2148.mo7099()) {
                        interfaceC2148.mo7097("Send failed", e4);
                        interfaceC2148.mo7101("Request: " + interfaceC7578);
                        interfaceC2148.mo7101("Response: " + interfaceC1543);
                    }
                    throw e4;
                }
            } catch (GeneralSecurityException e5) {
                throw new C3037("Session setup failed", e5);
            }
        } catch (Throwable th3) {
            interfaceC7578.mo10436((InterfaceC17065) null);
            this.f75078 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32993());
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC1543 m51790(C20552 c20552, String str) throws C3037 {
        Subject subject;
        InterfaceC5714 interfaceC5714;
        ?? r9;
        C6272 c6272;
        C3450 c3450 = (C3450) c20552.m47117();
        byte[] bArrM10535 = c3450.m10535();
        int i = ((c3450.m10542() & 2) != 0 || c20552.m47110()) ? 2 : 1;
        InterfaceC5714 interfaceC5715 = this.f75091;
        boolean zMo16137 = interfaceC5715.mo16137();
        boolean zM48659 = c3450.mo10552().m48659(EnumC21485.SMB311);
        ?? r15 = 0;
        byte[] bArrM47116 = zM48659 ? c20552.m47116() : null;
        this.f75084 = bArrM47116;
        InterfaceC2148 interfaceC2148 = f75075;
        if (bArrM47116 != null && interfaceC2148.mo7086()) {
            byte[] bArr = this.f75084;
            interfaceC2148.mo7088("Initial session preauth hash ".concat(C12085.m29468(bArr, 0, bArr.length)));
        }
        boolean z = zMo16137;
        long jM10465 = 0;
        InterfaceC15030 interfaceC15030M51798 = null;
        C6272 c6273 = null;
        C3037 c3037 = null;
        while (true) {
            if (interfaceC15030M51798 == null) {
                interfaceC15030M51798 = m51798(c20552, str, c3450, !z, null);
                subject = null;
            } else {
                subject = null;
            }
            byte[] bArrM51794 = m51794(interfaceC15030M51798, bArrM10535, subject);
            if (bArrM51794 != null) {
                InterfaceC18663 context = this.f75086.getContext();
                int iM10534 = c3450.m10534();
                long j = jM10465;
                interfaceC5714 = interfaceC5715;
                ?? r10 = r15;
                C10506 c10506 = new C10506(context, i, iM10534, 0L, bArrM51794);
                c10506.mo10448(j);
                c10506.mo10429();
                try {
                    c6272 = (C6272) c20552.m47111(c10506, r10, EnumSet.of(EnumC0214.RETAIN_PAYLOAD));
                    jM10465 = c6272.m10465();
                } catch (C22087 e) {
                    throw e;
                } catch (C3037 e2) {
                    C6272 c6274 = (C6272) c10506.mo5429();
                    if (e2.m9291() == -1073741811) {
                        throw new C22087("Login failed", e2);
                    }
                    if (!c6274.mo28213() || c6274.mo28209() || (c6274.m10446() != 0 && c6274.m10446() != -1073741802)) {
                        throw e2;
                    }
                    c3037 = e2;
                    c6272 = c6274;
                    jM10465 = j;
                }
                this.f75076.mo27540().getClass();
                if (c6272.m17280() && !interfaceC5714.mo16135() && !interfaceC5714.mo16137()) {
                    throw new C22087(-1073741715);
                }
                if (!interfaceC5714.mo16137() && c6272.m17280()) {
                    z = true;
                }
                if ((c6272.m17279() & 4) != 0) {
                    throw new C0089("Server requires encryption, not yet supported.");
                }
                if (zM48659) {
                    byte[] bArrM10443 = c10506.m10443();
                    this.f75084 = c20552.m47107(bArrM10443.length, bArrM10443, this.f75084);
                    if (c6272.m10446() == -1073741802) {
                        byte[] bArrM10444 = c6272.m10443();
                        this.f75084 = c20552.m47107(bArrM10444.length, bArrM10444, this.f75084);
                    }
                }
                c6273 = c6272;
                bArrM10535 = c6272.m17281();
                r9 = r10;
            } else {
                interfaceC5714 = interfaceC5715;
                r9 = r15;
                bArrM10535 = bArrM51794;
            }
            boolean z2 = z;
            if (interfaceC15030M51798.mo14524()) {
                interfaceC2148.mo7088("Context is established");
                this.f75085 = r9;
                byte[] bArrMo14526 = interfaceC15030M51798.mo14526();
                if (bArrMo14526 != null) {
                    byte[] bArr2 = new byte[16];
                    System.arraycopy(bArrMo14526, 0, bArr2, 0, Math.min(16, bArrMo14526.length));
                    this.f75079 = bArr2;
                }
                boolean z3 = (c6273 == null || (c6273.m10460() & 8) == 0) ? false : true;
                if (!z2 && (m51808() || z3)) {
                    if (interfaceC15030M51798.mo14526() != null && c6273 != null) {
                        if (this.f75084 != null && interfaceC2148.mo7086()) {
                            byte[] bArr3 = this.f75084;
                            interfaceC2148.mo7088("Final preauth integrity hash ".concat(C12085.m29468(bArr3, 0, bArr3.length)));
                        }
                        C6251 c6251 = new C6251(this.f75079, c3450.m10541(), this.f75084);
                        if (c3450.mo10552().m48659(EnumC21485.SMB300) || (c6273.m10460() & 8) != 0) {
                            c6273.mo10436(c6251);
                            byte[] bArrM10445 = c6273.m10443();
                            if (!c6273.m30867(0, bArrM10445.length, bArrM10445)) {
                                throw new C3037("Signature validation failed");
                            }
                        }
                        m51792(c6251);
                    } else {
                        c20552.getContext().mo27540().getClass();
                    }
                } else if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("No digest setup " + z2 + " B " + m51808());
                }
                this.f75077 = true;
                this.f75090.set(2);
                this.f75081 = c6273.m10465();
                if (c3037 != null) {
                    throw c3037;
                }
                return c6273.m10466();
            }
            z = z2;
            interfaceC5715 = interfaceC5714;
            interfaceC2148 = interfaceC2148;
            r15 = r9;
            c3450 = c3450;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m51794(InterfaceC15030 interfaceC15030, byte[] bArr, Subject subject) throws C3037 {
        if (subject == null) {
            return interfaceC15030.mo14525(bArr == null ? 0 : bArr.length, bArr);
        }
        try {
            return (byte[]) Subject.doAs(subject, new C17023(interfaceC15030, bArr));
        } catch (PrivilegedActionException e) {
            if (e.getException() instanceof C3037) {
                throw ((C3037) e.getException());
            }
            throw new C3037("Unexpected exception during context initialization", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15030 m51798(C20552 c20552, String str, C3450 c3450, boolean z, Subject subject) throws C3037 {
        InterfaceC2148 interfaceC2148 = f75075;
        String strMo1012 = this.f75092;
        if (strMo1012 == null) {
            strMo1012 = c20552.m47109().mo1012();
            try {
                strMo1012 = c20552.m47109().mo1015();
            } catch (Exception e) {
                interfaceC2148.mo7081("Failed to resolve host name", e);
            }
        }
        String str2 = strMo1012;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Remote host is " + str2);
        }
        if (subject != null) {
            try {
                return (InterfaceC15030) Subject.doAs(subject, new C14200(this, str, str2, c3450, z));
            } catch (PrivilegedActionException e2) {
                if (e2.getException() instanceof C3037) {
                    throw ((C3037) e2.getException());
                }
                throw new C3037("Unexpected exception during context initialization", e2);
            }
        }
        return this.f75091.mo16134(this.f75086.getContext(), str2, c3450.m10535(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private InterfaceC1543 m51791(C20552 c20552, String str, InterfaceC7578 interfaceC7578, Set set) {
        C6272 c6272;
        C3450 c3450 = (C3450) c20552.m47117();
        byte[] bArrM10535 = c3450.m10535();
        boolean z = (c3450.m10542() == 0 || this.f75091.mo16137()) ? false : true;
        long j = this.f75081;
        synchronized (c20552) {
            this.f75091.getClass();
            this.f75091.getClass();
            InterfaceC15030 interfaceC15030M51798 = m51798(c20552, str, c3450, z, null);
            C6272 c6273 = null;
            C3037 c3037 = null;
            do {
                byte[] bArrM51794 = m51794(interfaceC15030M51798, bArrM10535, (Subject) null);
                if (bArrM51794 != null) {
                    C10506 c10506 = new C10506(this.f75086.getContext(), c3450.m10542(), c3450.m10534(), j, bArrM51794);
                    if (interfaceC7578 != 0) {
                        c10506.mo10438((AbstractC3429) interfaceC7578);
                    }
                    c10506.mo10436(this.f75089);
                    c10506.mo10448(j);
                    try {
                        try {
                            try {
                                c6272 = (C6272) c20552.m47111(c10506, null, EnumSet.of(EnumC0214.RETAIN_PAYLOAD));
                                if (c6272.m10465() != j) {
                                    throw new C22087("Server did not reauthenticate after expiration");
                                }
                            } catch (C3037 e) {
                                e = e;
                                C6272 c6274 = (C6272) c10506.mo5429();
                                if (!c6274.mo28213() || c6274.mo28209() || (c6274.m10446() != 0 && c6274.m10446() != -1073741802)) {
                                    throw e;
                                }
                                c3037 = e;
                                c6272 = c6274;
                            }
                        } catch (C3037 e2) {
                            e = e2;
                        }
                        this.f75076.mo27540().getClass();
                        if (c6272.m17280() && !this.f75091.mo16135() && !this.f75091.mo16137()) {
                            throw new C22087(-1073741715);
                        }
                        this.f75091.mo16137();
                        if (c10506.getDigest() != null) {
                            f75075.mo7088("Setting digest");
                            m51792(c10506.getDigest());
                        }
                        c6273 = c6272;
                        bArrM10535 = c6272.m17281();
                    } catch (C22087 e3) {
                        throw e3;
                    }
                } else {
                    bArrM10535 = bArrM51794;
                }
                if (c3037 != null) {
                    throw c3037;
                }
            } while (!interfaceC15030M51798.mo14524());
            this.f75077 = true;
            this.f75090.set(2);
            this.f75081 = c6273.m10465();
            InterfaceC1543 interfaceC1543M10466 = c6273.m10466();
            if (interfaceC1543M10466 != null && interfaceC1543M10466.mo28213()) {
                return interfaceC1543M10466;
            }
            if (interfaceC7578 != 0) {
                return this.f75086.m47111(interfaceC7578, null, set);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0343 A[LOOP:0: B:3:0x001d->B:176:0x0343, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:206:0x0342 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51793(C20552 c20552, String str, AbstractC11422 abstractC11422, AbstractC11422 abstractC11423) throws C3037 {
        C21341 c21341;
        byte[] bArr;
        C3037 c22087;
        String str2;
        C8640 c8640 = (C8640) c20552.m47117();
        InterfaceC5714 interfaceC5714 = this.f75091;
        int i = 10;
        InterfaceC15030 interfaceC15030Mo16134 = null;
        C3037 c3037 = null;
        InterfaceC7578 interfaceC7578 = null;
        C21341 c21342 = null;
        boolean zMo16137 = interfaceC5714.mo16137();
        byte[] bArrM48376 = new byte[0];
        while (true) {
            AtomicInteger atomicInteger = this.f75090;
            InterfaceC18663 interfaceC18663 = this.f75076;
            int i2 = 20;
            C20552 c20553 = this.f75086;
            C3037 c3038 = c3037;
            InterfaceC2148 interfaceC2148 = f75075;
            if (i == 10) {
                InterfaceC7578 interfaceC7579 = interfaceC7578;
                if (c20552.m47117().mo10548(Integer.MIN_VALUE)) {
                    interfaceC2148.mo7088("Extended security negotiated");
                    c3037 = c3038;
                    interfaceC7578 = interfaceC7579;
                } else {
                    c20553.getContext().mo27540().getClass();
                    interfaceC2148.mo7088("Performing legacy session setup");
                    if (!(interfaceC5714 instanceof C18560)) {
                        throw new C22087("Incompatible credentials");
                    }
                    C18560 c18560 = (C18560) interfaceC5714;
                    InterfaceC7578 c14989 = new C14989(c20553.getContext(), c8640, abstractC11422, interfaceC5714);
                    c14989.mo10436(m51807());
                    byte[] bArr2 = bArrM48376;
                    C21341 c21343 = new C21341(c20553.getContext().mo27540(), abstractC11423);
                    c21343.mo10437(false);
                    if (!zMo16137 && m51808()) {
                        InterfaceC18663 context = c20553.getContext();
                        if ((c18560 instanceof C2332) && ((C2332) c18560).m7596()) {
                            context.mo27540().getClass();
                        }
                        interfaceC2148.mo7088("Initialize signing");
                        InterfaceC18663 context2 = c20553.getContext();
                        byte[] bArr3 = c8640.m22410().f40403;
                        int iM32989 = ((C13722) context2.mo27540()).m32989();
                        if (iM32989 == 0 || iM32989 == 1 || iM32989 == 2) {
                            byte[] bArr4 = new byte[40];
                            c18560.m43098(context2, bArr3, bArr4);
                            System.arraycopy(c18560.m43100(context2, bArr3), 0, bArr4, 16, 24);
                            bArr = bArr4;
                        } else {
                            if (iM32989 == 3 || iM32989 == 4 || iM32989 == 5) {
                                throw new C3037("NTLMv2 requires extended security (jcifs.smb.client.useExtendedSecurity must be true if jcifs.smb.lmCompatibility >= 3)");
                            }
                            bArr = null;
                        }
                        if (bArr == null) {
                            throw new C3037("Need a signature key but the server did not provide one");
                        }
                        c14989.mo10436(new C5777(bArr, 0));
                    }
                    try {
                        c20552.m47103(c14989, (AbstractC11422) c21343);
                        c3037 = c3038;
                    } catch (C22087 e) {
                        throw e;
                    } catch (C3037 e2) {
                        c3037 = e2;
                    }
                    interfaceC18663.mo27540().getClass();
                    if (c21343.m48375() && c8640.m22410().f40402 != 0 && !interfaceC5714.mo16135() && !interfaceC5714.mo16137()) {
                        throw new C22087(-1073741715);
                    }
                    if (!interfaceC5714.mo16137() && c21343.m48375()) {
                        zMo16137 = true;
                    }
                    if (c3037 != null) {
                        throw c3037;
                    }
                    this.f75087 = c21343.m28224();
                    if (c14989.getDigest() != null) {
                        m51792(c14989.getDigest());
                    } else if (!zMo16137 && m51808()) {
                        throw new C3037("Signing required but no session key available");
                    }
                    this.f75077 = c21343.m28221();
                    atomicInteger.set(2);
                    c21341 = c21343;
                    bArrM48376 = bArr2;
                    interfaceC7578 = c14989;
                    i = 0;
                }
                if (i == 0) {
                    return;
                } else {
                    c21342 = c21341;
                }
            } else {
                if (i != 20) {
                    throw new C3037(C19370.m44628(i, "Unexpected session setup state: "));
                }
                boolean z = (zMo16137 || (c8640.m22405() & 4) == 0) ? false : true;
                if (interfaceC15030Mo16134 == null) {
                    String strMo1015 = this.f75092;
                    if (strMo1015 == null) {
                        String strMo1012 = c20552.m47109().mo1012();
                        try {
                            strMo1015 = c20552.m47109().mo1015();
                            str2 = strMo1015;
                        } catch (Exception e3) {
                            interfaceC2148.mo7081("Failed to resolve host name", e3);
                            str2 = strMo1012;
                        }
                    } else {
                        str2 = strMo1015;
                    }
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Remote host is " + str2);
                    }
                    interfaceC15030Mo16134 = interfaceC5714.mo16134(c20553.getContext(), str2, c8640.m22410().f40403, z);
                } else {
                    interfaceC7578 = interfaceC7578;
                }
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101(interfaceC15030Mo16134.toString());
                }
                try {
                    byte[] bArrMo14525 = interfaceC15030Mo16134.mo14525(bArrM48376 == null ? 0 : bArrM48376.length, bArrM48376);
                    if (bArrMo14525 != null) {
                        InterfaceC7578 c149810 = new C14989(c20553.getContext(), c8640, null, bArrMo14525);
                        c149810.mo10436(m51807());
                        if (z && interfaceC15030Mo16134.mo14524() && m51808()) {
                            byte[] bArrMo14526 = interfaceC15030Mo16134.mo14526();
                            if (bArrMo14526 != null) {
                                c149810.mo10436(new C5777(bArrMo14526));
                            }
                            this.f75079 = bArrMo14526;
                        } else {
                            interfaceC2148.mo7101("Not yet initializing signing");
                        }
                        C21341 c21344 = new C21341(c20553.getContext().mo27540(), null);
                        c21344.mo10437(true);
                        c149810.mo10447(this.f75087);
                        this.f75087 = 0;
                        try {
                            c20552.m47103(c149810, (AbstractC11422) c21344);
                            c22087 = c3038;
                        } catch (C22087 e4) {
                            throw e4;
                        } catch (C3037 e5) {
                            c22087 = e5;
                            if (c22087.m9291() == -1073741811) {
                                c22087 = new C22087("Login failed", c22087);
                            }
                            try {
                                c20552.m19178();
                            } catch (Exception e6) {
                                interfaceC2148.mo7081("Failed to disconnect transport", e6);
                            }
                        }
                        interfaceC18663.mo27540().getClass();
                        if (c21344.m48375() && !interfaceC5714.mo16135() && !interfaceC5714.mo16137()) {
                            throw new C22087(-1073741715);
                        }
                        if (!interfaceC5714.mo16137() && c21344.m48375()) {
                            zMo16137 = true;
                        }
                        if (c22087 != null) {
                            throw c22087;
                        }
                        this.f75087 = c21344.m28224();
                        if (c149810.getDigest() != null) {
                            interfaceC2148.mo7088("Setting digest");
                            m51792(c149810.getDigest());
                        }
                        bArrM48376 = c21344.m48376();
                        c21341 = c21344;
                        interfaceC7578 = c149810;
                    } else {
                        bArrM48376 = bArrMo14525;
                        c21341 = c21342;
                        interfaceC7578 = interfaceC7578;
                        c22087 = c3038;
                    }
                    if (interfaceC15030Mo16134.mo14524()) {
                        interfaceC2148.mo7088("Context is established");
                        this.f75085 = null;
                        this.f75079 = interfaceC15030Mo16134.mo14526();
                        if (interfaceC7578 != null && interfaceC7578.getDigest() != null) {
                            m51792(interfaceC7578.getDigest());
                        } else if (!zMo16137 && m51808()) {
                            byte[] bArrMo14527 = interfaceC15030Mo16134.mo14526();
                            if (bArrMo14527 == null || c21341 == null) {
                                c20552.getContext().mo27540().getClass();
                            } else {
                                m51792(new C5777(bArrMo14527, (Object) null));
                            }
                            this.f75079 = bArrMo14527;
                        }
                        this.f75077 = c21341.m28221();
                        atomicInteger.set(2);
                        i2 = 0;
                        c3037 = c22087;
                        c21342 = c21341;
                    } else {
                        c3037 = c22087;
                    }
                    if (i == 0) {
                        return;
                    } else {
                        c21342 = c21341;
                    }
                } catch (C3037 e7) {
                    try {
                        interfaceC2148.mo7083("Exception during SSP authentication", (Throwable) e7);
                        c20552.m19178();
                    } catch (IOException unused) {
                        interfaceC2148.mo7088("Disconnect failed");
                    }
                    this.f75087 = 0;
                    throw e7;
                }
            }
            c21341 = c21342;
            i = i2;
            if (i == 0) {
                return;
            } else {
                c21342 = c21341;
            }
        }
    }

    public final String toString() {
        return "SmbSession[credentials=" + this.f75076.mo6355() + ",targetHost=" + this.f75092 + ",targetDomain=" + this.f75083 + ",uid=" + this.f75087 + ",connectionState=" + this.f75090 + ",usage=" + this.f75088.get() + "]";
    }

    public final InterfaceC18663 getContext() {
        return this.f75086.getContext();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13927 m51797(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543) {
        C20552 c20552 = this.f75086;
        c20552.m19164();
        try {
            synchronized (c20552) {
                while (!this.f75090.compareAndSet(0, 1)) {
                    try {
                        int i = this.f75090.get();
                        if (i == 2 || i == 3) {
                            c20552.m19171();
                            return interfaceC1543;
                        }
                        try {
                            this.f75086.wait();
                        } catch (InterruptedException e) {
                            throw new C3037(e.getMessage(), e);
                        }
                    } catch (Throwable th) {
                        c20552.notifyAll();
                        throw th;
                    }
                }
                try {
                    c20552.m47114();
                    InterfaceC2148 interfaceC2148 = f75075;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("sessionSetup: " + this.f75091);
                    }
                    this.f75087 = 0;
                    if (!c20552.m47112()) {
                        m51793(c20552, this.f75083, (AbstractC11422) interfaceC7578, (AbstractC11422) interfaceC1543);
                        c20552.notifyAll();
                        c20552.m19171();
                        return interfaceC1543;
                    }
                    InterfaceC1543 interfaceC1543M51790 = m51790(c20552, this.f75083);
                    c20552.notifyAll();
                    c20552.m19171();
                    return interfaceC1543M51790;
                } catch (Exception e2) {
                    f75075.mo7081("Session setup failed", e2);
                    if (this.f75090.compareAndSet(1, 0)) {
                        m51802(true, true);
                    }
                    throw e2;
                }
            }
        } catch (Throwable th2) {
            try {
                c20552.m19171();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51802(boolean z, boolean z2) throws Throwable {
        ?? r2;
        ?? r3 = "Logging off session while still in use ";
        try {
            try {
                try {
                    C20552 c20552 = this.f75086;
                    c20552.m19164();
                    try {
                        try {
                            synchronized (c20552) {
                                try {
                                    if (!this.f75090.compareAndSet(2, 3)) {
                                        c20552.m19171();
                                        this.f75090.set(0);
                                        this.f75089 = null;
                                        this.f75086.notifyAll();
                                        return false;
                                    }
                                    InterfaceC2148 interfaceC2148 = f75075;
                                    if (interfaceC2148.mo7086()) {
                                        interfaceC2148.mo7088("Logging off session on " + c20552);
                                    }
                                    this.f75085 = null;
                                    synchronized (this.f75082) {
                                        try {
                                            long j = this.f75088.get();
                                            if ((!z2 || j == 1) && (z2 || j <= 0)) {
                                                z2 = false;
                                            } else {
                                                interfaceC2148.mo7104("Logging off session while still in use " + this + ":" + this.f75082);
                                                z2 = true;
                                            }
                                            try {
                                                for (C19141 c19141 : this.f75082) {
                                                    try {
                                                        f75075.mo7088("Disconnect tree on logoff");
                                                        z2 |= c19141.m44201(z, false);
                                                    } catch (Exception e) {
                                                        f75075.mo7083("Failed to disconnect tree " + c19141, (Throwable) e);
                                                    }
                                                }
                                                if (z) {
                                                    if (!z) {
                                                        C23456 c23456 = new C23456(this.f75076.mo27540());
                                                        c23456.mo10436(m51807());
                                                        c23456.mo10447(this.f75087);
                                                        this.f75086.m47103((InterfaceC7578) c23456, (AbstractC11422) new C7188(this.f75076.mo27540()));
                                                        this.f75087 = 0;
                                                    }
                                                    c20552.m19171();
                                                    r2 = this;
                                                } else {
                                                    try {
                                                        if (c20552.m47112()) {
                                                            C13327 c13327 = new C13327(this.f75076.mo27540(), 2);
                                                            c13327.mo10436(m51807());
                                                            c13327.mo10448(this.f75081);
                                                            try {
                                                                this.f75086.m47103((InterfaceC7578) c13327, (AbstractC11422) null);
                                                            } catch (C3037 e2) {
                                                                f75075.mo7081("Smb2LogoffRequest failed", (Exception) e2);
                                                            }
                                                        } else if (!z && ((C8640) c20552.m47117()).m22410().f40402 != 0) {
                                                            C23456 c23457 = new C23456(this.f75076.mo27540());
                                                            c23457.mo10436(m51807());
                                                            c23457.mo10447(this.f75087);
                                                            try {
                                                                this.f75086.m47103((InterfaceC7578) c23457, (AbstractC11422) new C7188(this.f75076.mo27540()));
                                                            } catch (C3037 e3) {
                                                                f75075.mo7081("SmbComLogoffAndX failed", (Exception) e3);
                                                            }
                                                            this.f75087 = 0;
                                                        }
                                                        try {
                                                            c20552.m19171();
                                                            r2 = this;
                                                        } catch (C3037 e4) {
                                                            e = e4;
                                                            r3 = this;
                                                            f75075.mo7083("Error in logoff", (Throwable) e);
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
                                                                c20552.m19171();
                                                            } catch (Throwable th3) {
                                                                try {
                                                                    th.addSuppressed(th3);
                                                                } catch (C3037 e5) {
                                                                    e = e5;
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                }
                                                r2.f75090.set(0);
                                                r2.f75089 = null;
                                                r2.f75086.notifyAll();
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
                                    r2.f75090.set(0);
                                    r2.f75089 = null;
                                    r2.f75086.notifyAll();
                                    return z2;
                                } catch (Throwable th7) {
                                    th = th7;
                                    z2 = false;
                                }
                                r3 = this;
                                f75075.mo7083("Error in logoff", (Throwable) e);
                                r2 = r3;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        z2 = false;
                        r3 = this;
                        c20552.m19171();
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    r3.f75090.set(0);
                    r3.f75089 = null;
                    r3.f75086.notifyAll();
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
                r3 = this;
                r3.f75090.set(0);
                r3.f75089 = null;
                r3.f75086.notifyAll();
                throw th;
            }
        } catch (C3037 e6) {
            e = e6;
            z2 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Long m51814() {
        long j = this.f75078;
        if (j > 0) {
            return Long.valueOf(j);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51801(InterfaceC18663 interfaceC18663, String str, String str2) {
        return C11003.equals(this.f75091, interfaceC18663.mo6355()) && C11003.equals(this.f75092, str) && C11003.equals(this.f75083, str2);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5714 m51810() {
        return this.f75091;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m51811() {
        return !this.f75086.mo19180() && this.f75090.get() == 2;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m51812() {
        return this.f75086.mo19172();
    }
}
