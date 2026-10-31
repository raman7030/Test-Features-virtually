package l;

import com.google.android.material.motion.MotionUtils;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩵ᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E9JH */
/* JADX INFO: loaded from: classes4.dex */
public final class C19624 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17464 f63358;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4332 f63359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16594 f63360;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f63361;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15346 f63362;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20829 f63363;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f63364;

    public C19624(long j, C16594 c16594, C15346 c15346, EnumSet enumSet, C4332 c4332, C6717 c6717, C17464 c17464, EnumSet enumSet2, EnumSet enumSet3) {
        this.f63364 = j;
        this.f63360 = c16594;
        this.f63362 = c15346;
        C20829 c20829M18285 = c6717.m18285();
        this.f63363 = c20829M18285;
        this.f63359 = c4332;
        this.f63358 = c17464;
        this.f63361 = enumSet3.contains(EnumC9560.SMB2_SHAREFLAG_ENCRYPT_DATA) && c20829M18285.m47645().m49681() && c6717.m18282();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45082() {
        long j = this.f63364;
        C17464 c17464 = this.f63358;
        C15346 c15346 = this.f63362;
        try {
            C10847 c10847M36377 = c15346.m36377((C16614) new C2836(this.f63363.m47645(), c15346.m36383(), this.f63364), false);
            long jM13023 = this.f63359.m13023();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            InterfaceC16490 interfaceC16490 = C2380.f7586;
            C16614 c16614 = (C16614) C17902.m41878(jM13023, c10847M36377);
            if (!EnumC7462.m19987(((C23670) c16614.mo3028()).m52202())) {
                throw new C1092((C23670) c16614.mo3028(), "Error closing connection to " + this.f63360);
            }
            c17464.m40834(new C6881(c15346.m36383(), j));
        } catch (Throwable th) {
            c17464.m40834(new C6881(c15346.m36383(), j));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m45086() {
        return this.f63360.m39096();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m45084() {
        return this.f63364;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15346 m45087() {
        return this.f63362;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4332 m45083() {
        return this.f63359;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45088() {
        return this.f63361;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20829 m45085() {
        return this.f63363;
    }

    public final String toString() {
        return "TreeConnect[" + this.f63364 + "](" + this.f63360 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
