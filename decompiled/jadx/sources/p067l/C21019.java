package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9JH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21019 {

    /* JADX INFO: renamed from: ֫ */
    public final C18966 f65979;

    /* JADX INFO: renamed from: ۧ */
    public C6485 f65980;

    /* JADX INFO: renamed from: ܳ */
    public C18139 f65981;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f65982;

    /* JADX INFO: renamed from: ܿ */
    public C16953 f65983;

    /* JADX INFO: renamed from: ᩳ */
    public final C22164 f65984;

    /* JADX INFO: renamed from: ᩻ */
    public long f65985;

    public C21019(long j, C18139 c18139, C16953 c16953, EnumSet enumSet, C6485 c6485, C8752 c8752, C18966 c18966, EnumSet enumSet2, EnumSet enumSet3) {
        this.f65985 = j;
        this.f65981 = c18139;
        this.f65983 = c16953;
        C22164 c22164M20233 = c8752.m20233();
        this.f65984 = c22164M20233;
        this.f65980 = c6485;
        this.f65979 = c18966;
        this.f65982 = enumSet3.contains(EnumC11454.SMB2_SHAREFLAG_ENCRYPT_DATA) && c22164M20233.m49973().m52019() && c8752.m20230();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47378() {
        long j = this.f65985;
        C18966 c18966 = this.f65979;
        C16953 c16953 = this.f65983;
        try {
            C12677 c12677M38535 = c16953.m38535((C18158) new C5064(this.f65984.m49973(), c16953.m38541(), this.f65985), false);
            long jM14887 = this.f65980.m14887();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC18040 interfaceC18040 = C4630.f10377;
            C18158 c18158 = (C18158) C19382.m44125(jM14887, c12677M38535);
            if (!EnumC9460.m21962(((C24864) c18158.mo5341()).m54605())) {
                throw new C3406((C24864) c18158.mo5341(), "Error closing connection to " + this.f65981);
            }
            c18966.m43092(new C8908(c16953.m38541(), j));
        } catch (Throwable th) {
            c18966.m43092(new C8908(c16953.m38541(), j));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m47382() {
        return this.f65981.m41323();
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m47380() {
        return this.f65985;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C16953 m47383() {
        return this.f65983;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C6485 m47379() {
        return this.f65980;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m47384() {
        return this.f65982;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22164 m47381() {
        return this.f65984;
    }

    public final String toString() {
        return "TreeConnect[" + this.f65985 + "](" + this.f65981 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
