package p067l;

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
public final class C16953 implements AutoCloseable {

    /* JADX INFO: renamed from: ۟ */
    public static final InterfaceC4410 f50142 = C13128.m30022(C16953.class);

    /* JADX INFO: renamed from: ۙ */
    public C17468 f50144;

    /* JADX INFO: renamed from: ۛ */
    public long f50145;

    /* JADX INFO: renamed from: ۨ */
    public InterfaceC21493 f50147;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC6226 f50148;

    /* JADX INFO: renamed from: ܰ */
    public C5144 f50150;

    /* JADX INFO: renamed from: ᩶ */
    public C24845 f50151;

    /* JADX INFO: renamed from: ᩸ */
    public C18966 f50152;

    /* JADX INFO: renamed from: ᩹ */
    public final C6485 f50153;

    /* JADX INFO: renamed from: ᩺ */
    public C23660 f50154 = new C23660();

    /* JADX INFO: renamed from: ۗ */
    public HashMap f50143 = new HashMap();

    /* JADX INFO: renamed from: ۬ */
    public ReentrantReadWriteLock f50149 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۤ */
    public C22990 f50146 = new C22990();

    public C16953(C24845 c24845, C6485 c6485, C5144 c5144, C18966 c18966, InterfaceC6226 interfaceC6226, InterfaceC21493 interfaceC21493, C17468 c17468) {
        this.f50151 = c24845;
        this.f50153 = c6485;
        this.f50150 = c5144;
        this.f50152 = c18966;
        this.f50148 = interfaceC6226;
        this.f50147 = interfaceC21493;
        this.f50144 = c17468;
        if (c18966 != null) {
            c18966.m43091(this);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m38541() {
        return this.f50145;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38538(long j) {
        this.f50145 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4925 m38534(String str) {
        C4925 c19006;
        if (str.contains("\\")) {
            throw new IllegalArgumentException(C6988.m16053("Share name (", str, ") cannot contain '\\' characters."));
        }
        C23660 c23660 = this.f50154;
        C4925 c4925M52609 = c23660.m52609(str);
        InterfaceC4410 interfaceC4410 = f50142;
        if (c4925M52609 != null) {
            interfaceC4410.mo9177("Returning cached Share {} for {}", c4925M52609, str);
            return c4925M52609;
        }
        InterfaceC6226 interfaceC6226 = this.f50148;
        C24845 c24845 = this.f50151;
        C18139 c18139 = new C18139(c24845.m54563(), str, null);
        interfaceC4410.mo9200("Connecting to {} on session {}", c18139, Long.valueOf(this.f50145));
        try {
            C11099 c11099 = new C11099(c24845.m54564().m49973(), c18139, this.f50145);
            ((C24864) c11099.mo5341()).m54607(256);
            C12677 c12677M38535 = m38535((C18158) c11099, false);
            long jM14887 = this.f50153.m14887();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC18040 interfaceC18040 = C4630.f10377;
            C17803 c17803 = (C17803) C19382.m44125(jM14887, c12677M38535);
            try {
                C4925 c4925 = (C4925) interfaceC6226.mo14100(this, c17803, c18139, new C10249(this, c18139));
                if (c4925 != null) {
                    return c4925;
                }
            } catch (C17624 unused) {
            }
            if (EnumC9460.m21961(((C24864) c17803.mo5341()).m54605())) {
                interfaceC4410.mo9183(((C24864) c17803.mo5341()).toString());
                throw new C3406((C24864) c17803.mo5341(), "Could not connect to " + c18139);
            }
            if (c17803.m40419().contains(EnumC22183.SMB2_SHARE_CAP_ASYMMETRIC)) {
                throw new C12776("ASYMMETRIC capability unsupported");
            }
            C21019 c21019 = new C21019(((C24864) c17803.mo5341()).m54612(), c18139, this, (EnumSet) c17803.m40419(), this.f50153, c24845.m54570(), this.f50152, c17803.m40423(), c17803.m40421());
            if (c17803.m40420()) {
                c19006 = new C15612(c18139, c21019, interfaceC6226);
            } else if (c17803.m40422()) {
                c19006 = new C19677(c18139, c21019);
            } else {
                if (!c17803.m40418()) {
                    throw new C12776("Unknown ShareType returned in the TREE_CONNECT Response");
                }
                c19006 = new C19006(c18139, c21019);
            }
            c23660.m52611(c19006);
            return c19006;
        } catch (C4630 e) {
            throw new C12776(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16953 m38536(C18139 c18139) {
        HashMap map = this.f50143;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50149;
        reentrantReadWriteLock.readLock().lock();
        try {
            C16953 c16953 = (C16953) map.get(c18139.m41319());
            if (c16953 != null) {
                reentrantReadWriteLock.readLock().unlock();
                return c16953;
            }
            reentrantReadWriteLock.readLock().unlock();
            reentrantReadWriteLock.writeLock().lock();
            try {
                C16953 c16953M38532 = (C16953) map.get(c18139.m41319());
                if (c16953M38532 == null) {
                    c16953M38532 = m38532(c18139);
                    map.put(c18139.m41319(), c16953M38532);
                }
                reentrantReadWriteLock.readLock().lock();
                reentrantReadWriteLock.writeLock().unlock();
                reentrantReadWriteLock.readLock().unlock();
                return c16953M38532;
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
    /* JADX INFO: renamed from: ֫ */
    private void m38530(C8908 c8908) {
        if (c8908.m37078() == this.f50145) {
            f50142.mo9195(Long.valueOf(c8908.m20602()), "Notified of TreeDisconnected <<{}>>");
            this.f50154.m52610(c8908.m20602());
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m38542() {
        C18966 c18966 = this.f50152;
        C24845 c24845 = this.f50151;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f50149;
        InterfaceC4410 interfaceC4410 = f50142;
        try {
            interfaceC4410.mo9200("Logging off session {} from host {}", Long.valueOf(this.f50145), c24845.m54563());
            for (C4925 c4925 : this.f50154.m52608()) {
                try {
                    c4925.close();
                } catch (IOException e) {
                    interfaceC4410.mo9197("Caught exception while closing TreeConnect with id: {}", Long.valueOf(c4925.m10469().m47380()), e);
                }
            }
            reentrantReadWriteLock.writeLock().lock();
            try {
                for (C16953 c16953 : this.f50143.values()) {
                    interfaceC4410.mo9200("Logging off nested session {} for session {}", Long.valueOf(c16953.f50145), Long.valueOf(this.f50145));
                    try {
                        c16953.m38542();
                    } catch (C4630 unused) {
                        interfaceC4410.mo9174(Long.valueOf(c16953.f50145), "Caught exception while logging off nested session {}");
                    }
                }
                reentrantReadWriteLock.writeLock().unlock();
                C12677 c12677M38535 = m38535((C18158) new C8100(c24845.m54564().m49973(), this.f50145), false);
                long jM14887 = this.f50153.m14887();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC18040 interfaceC18040 = C4630.f10377;
                C8100 c8100 = (C8100) C19382.m44125(jM14887, c12677M38535);
                if (!EnumC9460.m21962(((C24864) c8100.mo5341()).m54605())) {
                    throw new C3406((C24864) c8100.mo5341(), "Could not logoff session <<" + this.f50145 + ">>");
                }
                c18966.m43092(new C25001(this.f50145));
            } catch (Throwable th) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th;
            }
        } catch (Throwable th2) {
            c18966.m43092(new C25001(this.f50145));
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m38539() {
        return this.f50146.m51337();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m38542();
    }

    /* JADX INFO: renamed from: ۧ */
    private C16953 m38532(C18139 c18139) {
        try {
            return this.f50151.m54566().m51795(c18139.m41319()).m54557(this.f50150);
        } catch (IOException e) {
            throw new C3406(EnumC9460.STATUS_OTHER.getValue(), EnumC24036.SMB2_NEGOTIATE, "Could not connect to DFS root " + c18139, e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24845 m38537() {
        return this.f50151;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12677 m38535(C18158 c18158, boolean z) throws C4630 {
        SecretKey secretKeyM38533 = m38533((C24864) c18158.mo5341(), true);
        C22990 c22990 = this.f50146;
        if (c22990.m51337() && secretKeyM38533 == null) {
            throw new C4630("Message signing is required, but no signing key is negotiated");
        }
        C4925 c4925M52612 = this.f50154.m52612(((C24864) c18158.mo5341()).m54612());
        boolean z2 = c4925M52612 != null && c4925M52612.m10469().m47384();
        C24845 c24845 = this.f50151;
        boolean zM20228 = c24845.m54570().m20228();
        if ((c22990.m51331() || z2 || z) && c22990.m51329() == null) {
            throw new C4630("Message encryption is required, but no encryption key is negotiated");
        }
        if ((c22990.m51331() || z2 || z) | (c22990.m51329() != null && zM20228)) {
            return c24845.m54556(this.f50144.m39833(c18158, c22990.m51329()), true);
        }
        return c24845.m54556(this.f50147.mo10526(c18158, secretKeyM38533), false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final SecretKey m38533(C24864 c24864, boolean z) {
        boolean zM52019 = this.f50151.m54564().m49973().m52019();
        C22990 c22990 = this.f50146;
        if (zM52019) {
            if (c24864.m54620() == EnumC24036.SMB2_SESSION_SETUP) {
                if (z) {
                    return c22990.m51334();
                }
                if (c24864.m54605() != EnumC9460.STATUS_SUCCESS.getValue()) {
                    return c22990.m51334();
                }
            }
            return c22990.m51334();
        }
        return c22990.m51335();
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22990 m38540() {
        return this.f50146;
    }
}
