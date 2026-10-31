package l;

import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۖᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 623X */
/* JADX INFO: loaded from: classes2.dex */
public class C2690 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f8416;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f8417;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f8418;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18918 f8419;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15346 f8420;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f8421;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f8422;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f8423;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f8424;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C19624 f8425;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C16594 f8426;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f8427;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f8429;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC22094 f8430;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f8431 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f8432;

    static {
        new C12216(new byte[]{-1, -1, -1, -1, -1, -1, -1, -1}, new byte[]{-1, -1, -1, -1, -1, -1, -1, -1});
        f8419 = new C21035();
        f8418 = new C9746();
        f8417 = new C9040();
        f8416 = new C16094();
        new C8998();
    }

    public C2690(C16594 c16594, C19624 c19624) {
        this.f8426 = c16594;
        this.f8425 = c19624;
        C15346 c15346M45087 = c19624.m45087();
        this.f8420 = c15346M45087;
        C20829 c20829M45085 = c19624.m45085();
        this.f8430 = c20829M45085.m47645();
        C4332 c4332M45083 = c19624.m45083();
        this.f8429 = Math.min(c4332M45083.m13033(), c20829M45085.m47646());
        this.f8421 = c4332M45083.m13030();
        this.f8428 = Math.min(c4332M45083.m13035(), c20829M45085.m47648());
        this.f8423 = c4332M45083.m13036();
        this.f8424 = Math.min(c4332M45083.m13031(), c20829M45085.m47647());
        this.f8422 = c4332M45083.m13023();
        this.f8427 = c15346M45087.m36383();
        this.f8432 = c19624.m45084();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f8431.getAndSet(true)) {
            return;
        }
        this.f8425.m45082();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10847 m8408(C16614 c16614) {
        if (!this.f8431.get()) {
            try {
                return this.f8420.m36377(c16614, false);
            } catch (C2380 e) {
                throw new C10951(e);
            }
        }
        throw new C10951(getClass().getSimpleName().concat(" has already been closed"));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16594 m8420() {
        return this.f8426;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19624 m8423() {
        return this.f8425;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m8421() {
        return this.f8429;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m8422() {
        return this.f8421;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m8418() {
        return this.f8428;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m8417() {
        return this.f8423;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20143 m8414(C16594 c16594, Set set, Set set2, Set set3, EnumC7983 enumC7983, Set set4) {
        C22259 c22259 = new C22259(this.f8430, this.f8427, this.f8432, null, set, set2, set3, enumC7983, set4, c16594);
        return (C20143) m8409(m8408(c22259), "Create", c16594, mo8413(), this.f8422);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18918 mo8413() {
        return f8419;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo8415(C12216 c12216) throws Throwable {
        C21554 c21554 = new C21554(this.f8430, this.f8427, this.f8432, c12216);
        m8409(m8408(c21554), "Close", c12216, f8416, this.f8422);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8416(C12216 c12216, EnumC7069 enumC7069, EnumC10930 enumC10930, byte[] bArr) throws Throwable {
        C21181 c21181 = new C21181(this.f8430, this.f8427, this.f8432, enumC7069, c12216, enumC10930, bArr);
        m8409(m8408(c21181), "SetInfo", c12216, InterfaceC18918.f59605, this.f8422);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2130 m8410(C12216 c12216, EnumSet enumSet, EnumC10930 enumC10930) {
        C7442 c7442 = new C7442(this.f8430, this.f8427, this.f8432, c12216, enumC10930, enumSet, this.f8424);
        return (C2130) m8409(m8408(c7442), "Query directory", c12216, f8418, this.f8422);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10847 m8411(C12216 c12216, C20993 c20993) {
        return m8408(new C4247(this.f8430, c12216, this.f8427, this.f8432, c20993, this.f8428));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18358 m8412(C12216 c12216, long j, int i) {
        return (C18358) m8409(m8419(c12216, j, i), "Read", c12216, f8417, this.f8421);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10847 m8419(C12216 c12216, long j, int i) {
        return m8408(new C16946(this.f8430, c12216, this.f8427, this.f8432, j, Math.min(i, this.f8429)));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16614 m8409(C10847 c10847, String str, Object obj, InterfaceC18918 interfaceC18918, long j) throws Throwable {
        C16614 c16614;
        try {
            if (j > 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC16490 interfaceC16490 = C2380.f7586;
                c16614 = (C16614) C17902.m41878(j, c10847);
            } else {
                InterfaceC16490 interfaceC16491 = C2380.f7586;
                try {
                    c16614 = (C16614) c10847.get();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw interfaceC16491.mo5928(e);
                } catch (ExecutionException e2) {
                    throw interfaceC16491.mo5928(e2);
                }
            }
            if (interfaceC18918.mo12316(((C23670) c16614.mo3028()).m52202())) {
                return c16614;
            }
            throw new C1092((C23670) c16614.mo3028(), str + " failed for " + obj);
        } catch (C2380 e3) {
            throw new C10951(e3);
        }
    }

    public final int hashCode() {
        C16594 c16594 = this.f8426;
        return (c16594 == null ? 0 : c16594.hashCode()) + 31;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C16594 c16594 = ((C2690) obj).f8426;
        C16594 c16595 = this.f8426;
        if (c16595 == null) {
            if (c16594 != null) {
                return false;
            }
        } else if (!c16595.equals(c16594)) {
            return false;
        }
        return true;
    }
}
