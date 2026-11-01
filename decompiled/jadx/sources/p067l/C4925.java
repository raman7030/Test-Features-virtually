package p067l;

import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 623X */
/* JADX INFO: loaded from: classes2.dex */
public class C4925 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public static final InterfaceC20348 f11210;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final InterfaceC20348 f11211;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final InterfaceC20348 f11212;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final InterfaceC20348 f11213;

    /* JADX INFO: renamed from: ۗ */
    public C16953 f11214;

    /* JADX INFO: renamed from: ۙ */
    public final long f11215;

    /* JADX INFO: renamed from: ۛ */
    public final long f11216;

    /* JADX INFO: renamed from: ۟ */
    public final long f11217;

    /* JADX INFO: renamed from: ۤ */
    public final int f11218;

    /* JADX INFO: renamed from: ۨ */
    public final C21019 f11219;

    /* JADX INFO: renamed from: ۫ */
    public final C18139 f11220;

    /* JADX INFO: renamed from: ۬ */
    public final long f11221;

    /* JADX INFO: renamed from: ܰ */
    public final int f11222;

    /* JADX INFO: renamed from: ᩶ */
    public final int f11223;

    /* JADX INFO: renamed from: ᩸ */
    public final EnumC23366 f11224;

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicBoolean f11225 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩺ */
    public final long f11226;

    static {
        new C13978(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
        f11213 = new C22360();
        f11212 = new C11631();
        f11211 = new C10960();
        f11210 = new C17664();
        new C10920();
    }

    public C4925(C18139 c18139, C21019 c21019) {
        this.f11220 = c18139;
        this.f11219 = c21019;
        C16953 c16953M47383 = c21019.m47383();
        this.f11214 = c16953M47383;
        C22164 c22164M47381 = c21019.m47381();
        this.f11224 = c22164M47381.m49973();
        C6485 c6485M47379 = c21019.m47379();
        this.f11223 = Math.min(c6485M47379.m14897(), c22164M47381.m49974());
        this.f11215 = c6485M47379.m14894();
        this.f11222 = Math.min(c6485M47379.m14899(), c22164M47381.m49976());
        this.f11217 = c6485M47379.m14900();
        this.f11218 = Math.min(c6485M47379.m14895(), c22164M47381.m49975());
        this.f11216 = c6485M47379.m14887();
        this.f11221 = c16953M47383.m38541();
        this.f11226 = c21019.m47380();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f11225.getAndSet(true)) {
            return;
        }
        this.f11219.m47378();
    }

    /* JADX INFO: renamed from: ֫ */
    private C12677 m10454(C18158 c18158) {
        if (!this.f11225.get()) {
            try {
                return this.f11214.m38535(c18158, false);
            } catch (C4630 e) {
                throw new C12776(e);
            }
        }
        throw new C12776(getClass().getSimpleName().concat(" has already been closed"));
    }

    /* JADX INFO: renamed from: ܳ */
    public final C18139 m10466() {
        return this.f11220;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C21019 m10469() {
        return this.f11219;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m10467() {
        return this.f11223;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m10468() {
        return this.f11215;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m10464() {
        return this.f11222;
    }

    /* JADX INFO: renamed from: ۖ */
    public final long m10463() {
        return this.f11217;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21512 m10460(C18139 c18139, Set set, Set set2, Set set3, EnumC9955 enumC9955, Set set4) {
        C23523 c23523 = new C23523(this.f11224, this.f11221, this.f11226, null, set, set2, set3, enumC9955, set4, c18139);
        return (C21512) m10455(m10454(c23523), "Create", c18139, mo10459(), this.f11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC20348 mo10459() {
        return f11213;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10461(C13978 c13978) throws Throwable {
        C22853 c22853 = new C22853(this.f11224, this.f11221, this.f11226, c13978);
        m10455(m10454(c22853), "Close", c13978, f11210, this.f11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10462(C13978 c13978, EnumC9087 enumC9087, EnumC12756 enumC12756, byte[] bArr) throws Throwable {
        C22499 c22499 = new C22499(this.f11224, this.f11221, this.f11226, enumC9087, c13978, enumC12756, bArr);
        m10455(m10454(c22499), "SetInfo", c13978, InterfaceC20348.f62836, this.f11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4393 m10456(C13978 c13978, EnumSet enumSet, EnumC12756 enumC12756) {
        C9441 c9441 = new C9441(this.f11224, this.f11221, this.f11226, c13978, enumC12756, enumSet, this.f11218);
        return (C4393) m10455(m10454(c9441), "Query directory", c13978, f11212, this.f11216);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12677 m10457(C13978 c13978, C22320 c22320) {
        return m10454(new C6405(this.f11224, c13978, this.f11221, this.f11226, c22320, this.f11222));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19816 m10458(C13978 c13978, long j, int i) {
        return (C19816) m10455(m10465(c13978, j, i), "Read", c13978, f11211, this.f11215);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12677 m10465(C13978 c13978, long j, int i) {
        return m10454(new C18474(this.f11224, c13978, this.f11221, this.f11226, j, Math.min(i, this.f11223)));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C18158 m10455(C12677 c12677, String str, Object obj, InterfaceC20348 interfaceC20348, long j) throws Throwable {
        C18158 c18158;
        try {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC18040 interfaceC18040 = C4630.f10377;
                c18158 = (C18158) C19382.m44125(j, c12677);
            } else {
                InterfaceC18040 interfaceC18041 = C4630.f10377;
                try {
                    c18158 = (C18158) c12677.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw interfaceC18041.mo8123(e);
                } catch (ExecutionException e2) {
                    throw interfaceC18041.mo8123(e2);
                }
            }
            if (interfaceC20348.mo14221(((C24864) c18158.mo5341()).m54605())) {
                return c18158;
            }
            throw new C3406((C24864) c18158.mo5341(), str + " failed for " + obj);
        } catch (C4630 e3) {
            throw new C12776(e3);
        }
    }

    public final int hashCode() {
        C18139 c18139 = this.f11220;
        return (c18139 == null ? 0 : c18139.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C18139 c18139 = ((C4925) obj).f11220;
        C18139 c181310 = this.f11220;
        if (c181310 == null) {
            if (c18139 != null) {
                return false;
            }
        } else if (!c181310.equals(c18139)) {
            return false;
        }
        return true;
    }
}
