package l;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import net.engio.mbassy.listener.Handler;

/* JADX INFO: renamed from: l.ܶܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes4.dex */
public final class C15346 implements AutoCloseable {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f47017 = C11321.m27961(C15346.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15888 f47019;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f47020;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC20123 f47022;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4059 f47023;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2921 f47025;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23650 f47026;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17464 f47027;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4332 f47028;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22403 f47029 = new C22403();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HashMap f47018 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f47024 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C21698 f47021 = new C21698();

    public C15346(C23650 c23650, C4332 c4332, C2921 c2921, C17464 c17464, InterfaceC4059 interfaceC4059, InterfaceC20123 interfaceC20123, C15888 c15888) {
        this.f47026 = c23650;
        this.f47028 = c4332;
        this.f47025 = c2921;
        this.f47027 = c17464;
        this.f47023 = interfaceC4059;
        this.f47022 = interfaceC20123;
        this.f47019 = c15888;
        if (c17464 != null) {
            c17464.m40833(this);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m36383() {
        return this.f47020;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36380(long j) {
        this.f47020 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2690 m36376(String str) {
        C2690 c17506;
        if (str.contains("\\")) {
            throw new IllegalArgumentException(C4860.m14172("Share name (", str, ") cannot contain '\\' characters."));
        }
        C22403 c22403 = this.f47029;
        C2690 c2690M50269 = c22403.m50269(str);
        InterfaceC2148 interfaceC2148 = f47017;
        if (c2690M50269 != null) {
            interfaceC2148.mo7082("Returning cached Share {} for {}", c2690M50269, str);
            return c2690M50269;
        }
        InterfaceC4059 interfaceC4059 = this.f47023;
        C23650 c23650 = this.f47026;
        C16594 c16594 = new C16594(c23650.m52160(), str, null);
        interfaceC2148.mo7105("Connecting to {} on session {}", c16594, Long.valueOf(this.f47020));
        try {
            C9186 c9186 = new C9186(c23650.m52161().m47645(), c16594, this.f47020);
            ((C23670) c9186.mo3028()).m52204(256);
            C10847 c10847M36377 = m36377((C16614) c9186, false);
            long jM13023 = this.f47028.m13023();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC16490 interfaceC16490 = C2380.f7586;
            C16240 c16240 = (C16240) C17902.m41878(jM13023, c10847M36377);
            try {
                C2690 c2690 = (C2690) interfaceC4059.mo12179(this, c16240, c16594, new C8292(this, c16594));
                if (c2690 != null) {
                    return c2690;
                }
            } catch (C16052 unused) {
            }
            if (EnumC7462.m19986(((C23670) c16240.mo3028()).m52202())) {
                interfaceC2148.mo7088(((C23670) c16240.mo3028()).toString());
                throw new C1092((C23670) c16240.mo3028(), "Could not connect to " + c16594);
            }
            if (c16240.m38206().contains(EnumC20849.SMB2_SHARE_CAP_ASYMMETRIC)) {
                throw new C10951("ASYMMETRIC capability unsupported");
            }
            C19624 c19624 = new C19624(((C23670) c16240.mo3028()).m52209(), c16594, this, (EnumSet) c16240.m38206(), this.f47028, c23650.m52167(), this.f47027, c16240.m38210(), c16240.m38208());
            if (c16240.m38207()) {
                c17506 = new C13935(c16594, c19624, interfaceC4059);
            } else if (c16240.m38209()) {
                c17506 = new C18212(c16594, c19624);
            } else {
                if (!c16240.m38205()) {
                    throw new C10951("Unknown ShareType returned in the TREE_CONNECT Response");
                }
                c17506 = new C17506(c16594, c19624);
            }
            c22403.m50271(c17506);
            return c17506;
        } catch (C2380 e) {
            throw new C10951(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m36378(C16594 c16594) {
        HashMap map = this.f47018;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f47024;
        reentrantReadWriteLock.readLock().lock();
        try {
            C15346 c15346 = (C15346) map.get(c16594.m39092());
            if (c15346 != null) {
                reentrantReadWriteLock.readLock().unlock();
                return c15346;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                C15346 c15346M36374 = (C15346) map.get(c16594.m39092());
                if (c15346M36374 == null) {
                    c15346M36374 = m36374(c16594);
                    map.put(c16594.m39092(), c15346M36374);
                }
                reentrantReadWriteLock.readLock().lock();
                reentrantReadWriteLock.writeLock().unlock();
                reentrantReadWriteLock.readLock().unlock();
                return c15346M36374;
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.readLock().unlock();
            throw th2;
        }
    }

    @Handler
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36372(C6881 c6881) {
        if (c6881.m34931() == this.f47020) {
            f47017.mo7100(Long.valueOf(c6881.m18653()), "Notified of TreeDisconnected <<{}>>");
            this.f47029.m50270(c6881.m18653());
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m36384() {
        C17464 c17464 = this.f47027;
        C23650 c23650 = this.f47026;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f47024;
        InterfaceC2148 interfaceC2148 = f47017;
        try {
            interfaceC2148.mo7105("Logging off session {} from host {}", Long.valueOf(this.f47020), c23650.m52160());
            for (C2690 c2690 : this.f47029.m50268()) {
                try {
                    c2690.close();
                } catch (IOException e) {
                    interfaceC2148.mo7102("Caught exception while closing TreeConnect with id: {}", Long.valueOf(c2690.m8423().m45084()), e);
                }
            }
            reentrantReadWriteLock.writeLock().lock();
            try {
                for (C15346 c15346 : this.f47018.values()) {
                    interfaceC2148.mo7105("Logging off nested session {} for session {}", Long.valueOf(c15346.f47020), Long.valueOf(this.f47020));
                    try {
                        c15346.m36384();
                    } catch (C2380 unused) {
                        interfaceC2148.mo7079(Long.valueOf(c15346.f47020), "Caught exception while logging off nested session {}");
                    }
                }
                reentrantReadWriteLock.writeLock().unlock();
                C10847 c10847M36377 = m36377((C16614) new C6031(c23650.m52161().m47645(), this.f47020), false);
                long jM13023 = this.f47028.m13023();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC16490 interfaceC16490 = C2380.f7586;
                C6031 c6031 = (C6031) C17902.m41878(jM13023, c10847M36377);
                if (!EnumC7462.m19987(((C23670) c6031.mo3028()).m52202())) {
                    throw new C1092((C23670) c6031.mo3028(), "Could not logoff session <<" + this.f47020 + ">>");
                }
                c17464.m40834(new C23814(this.f47020));
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            c17464.m40834(new C23814(this.f47020));
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36381() {
        return this.f47021.m48988();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m36384();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C15346 m36374(C16594 c16594) {
        try {
            return this.f47026.m52163().m49458(c16594.m39092()).m52154(this.f47025);
        } catch (IOException e) {
            throw new C1092(EnumC7462.STATUS_OTHER.getValue(), EnumC22799.SMB2_NEGOTIATE, "Could not connect to DFS root " + c16594, e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23650 m36379() {
        return this.f47026;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10847 m36377(C16614 c16614, boolean z) throws C2380 {
        SecretKey secretKeyM36375 = m36375((C23670) c16614.mo3028(), true);
        C21698 c21698 = this.f47021;
        if (c21698.m48988() && secretKeyM36375 == null) {
            throw new C2380("Message signing is required, but no signing key is negotiated");
        }
        C2690 c2690M50272 = this.f47029.m50272(((C23670) c16614.mo3028()).m52209());
        boolean z2 = c2690M50272 != null && c2690M50272.m8423().m45088();
        C23650 c23650 = this.f47026;
        boolean zM18280 = c23650.m52167().m18280();
        if ((c21698.m48982() || z2 || z) && c21698.m48980() == null) {
            throw new C2380("Message encryption is required, but no encryption key is negotiated");
        }
        if ((c21698.m48982() || z2 || z) | (c21698.m48980() != null && zM18280)) {
            return c23650.m52153(this.f47019.m37661(c16614, c21698.m48980()), true);
        }
        return c23650.m52153(this.f47022.mo8479(c16614, secretKeyM36375), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SecretKey m36375(C23670 c23670, boolean z) {
        boolean zM49681 = this.f47026.m52161().m47645().m49681();
        C21698 c21698 = this.f47021;
        if (zM49681) {
            if (c23670.m52217() == EnumC22799.SMB2_SESSION_SETUP) {
                if (z) {
                    return c21698.m48985();
                }
                if (c23670.m52202() != EnumC7462.STATUS_SUCCESS.getValue()) {
                    return c21698.m48985();
                }
            }
            return c21698.m48985();
        }
        return c21698.m48986();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21698 m36382() {
        return this.f47021;
    }
}
