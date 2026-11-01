package p067l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import java.io.IOException;
import org.bouncycastle.math.p080ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܿ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C19056 {

    /* JADX INFO: renamed from: ܿ */
    public static C19727 f56855;

    /* JADX INFO: renamed from: ᩳ */
    public static final C13022 f56856 = new C13022();

    /* JADX INFO: renamed from: ֫ */
    public boolean f56857;

    /* JADX INFO: renamed from: ۧ */
    public final C13022 f56858;

    /* JADX INFO: renamed from: ܽ */
    public C19727 f56859;

    /* JADX INFO: renamed from: ֫ */
    public final void m43294(C19727 c19727) {
        this.f56859 = c19727;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19727 m43295() {
        return this.f56859;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43293() {
        this.f56857 = true;
    }

    public C19056(C19727 c19727) {
        this();
        this.f56859 = c19727;
        this.f56857 = true;
    }

    public C19056() {
        this.f56858 = f56856;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC18385 m43292(AbstractC17043 abstractC17043) {
        this.f56859 = null;
        if (abstractC17043.mo38688()) {
            try {
                C13022 c13022 = this.f56858;
                String strMo25505 = abstractC17043.mo25505();
                c13022.getClass();
                StructStat structStatStat = Os.stat(strMo25505);
                this.f56859 = new C19727(structStatStat.st_mode & 4095, structStatStat.st_uid, structStatStat.st_gid);
                return EnumC18385.SUCCESS;
            } catch (ErrnoException | SecurityException unused) {
                return EnumC18385.FAILED;
            }
        }
        if (abstractC17043 instanceof C14912) {
            C14912 c14912Mo34134 = abstractC17043.mo34134();
            if (!c14912Mo34134.m34131()) {
                return EnumC18385.FAILED;
            }
            C5525 c5525M34133 = c14912Mo34134.m34133();
            this.f56859 = new C19727(c5525M34133.m12207(), c5525M34133.m12205(), c5525M34133.m12203());
            return EnumC18385.SUCCESS;
        }
        C13102 c13102M43291 = m43291(abstractC17043);
        if (c13102M43291 == null || !C23770.m52834().mo4996()) {
            return EnumC18385.UNAVAILABLE;
        }
        C19136 c19136Mo29981 = c13102M43291.mo29981();
        if (c19136Mo29981 == null) {
            try {
                c19136Mo29981 = C21759.m49047(c13102M43291.mo25505());
            } catch (IOException unused2) {
                return EnumC18385.FAILED;
            }
        }
        this.f56859 = new C19727(c19136Mo29981);
        return EnumC18385.SUCCESS;
    }

    /* JADX INFO: renamed from: ܽ */
    public final EnumC18385 m43297(AbstractC17043 abstractC17043) {
        boolean z;
        boolean z2;
        C13022 c13022 = this.f56858;
        C19727 c19727 = this.f56859;
        if (c19727 == null) {
            return EnumC18385.UNAVAILABLE;
        }
        int i = c19727.f60013;
        int i2 = c19727.f60011;
        boolean z3 = true;
        if (!abstractC17043.mo38688()) {
            if (abstractC17043 instanceof C14912) {
                if (abstractC17043.mo34134().m34128(c19727.f60012)) {
                    return (i == -1 && i2 == -1) ? EnumC18385.SUCCESS : EnumC18385.PARTIAL;
                }
                return EnumC18385.FAILED;
            }
            C13102 c13102M43291 = m43291(abstractC17043);
            if (c13102M43291 == null || !C23770.m52834().mo4996()) {
                return EnumC18385.UNAVAILABLE;
            }
            String strMo25505 = c13102M43291.mo25505();
            if (i == -1 || i2 == -1) {
                z2 = i == -1 && i2 == -1;
            } else {
                if (!abstractC17043.mo29978() || !abstractC17043.mo29986().m29977()) {
                    try {
                        C21759.m49048(strMo25505, i, i2, false, false);
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                C21759.m49049(strMo25505, c19727.f60012, false, false);
            } catch (IOException unused2) {
                z3 = false;
            }
            if (z3 && z2) {
                return EnumC18385.SUCCESS;
            }
            return (z3 || z2) ? EnumC18385.PARTIAL : EnumC18385.FAILED;
        }
        try {
            String strMo25506 = abstractC17043.mo25505();
            c13022.getClass();
            StructStat structStatStat = Os.stat(strMo25506);
            int i3 = structStatStat.st_mode & 4095;
            boolean z4 = (structStatStat.st_uid == i && structStatStat.st_gid == i2) ? false : true;
            if (z4) {
                try {
                    String strMo25507 = abstractC17043.mo25505();
                    c13022.getClass();
                    Os.chown(strMo25507, i, i2);
                } catch (ErrnoException | SecurityException unused3) {
                    z = false;
                }
            }
            z = true;
            if (z4 || i3 != c19727.f60012) {
                try {
                    String strMo25508 = abstractC17043.mo25505();
                    int i4 = c19727.f60012;
                    c13022.getClass();
                    Os.chmod(strMo25508, i4);
                } catch (ErrnoException | SecurityException unused4) {
                    z3 = false;
                }
            }
            if (z3 && z) {
                return EnumC18385.SUCCESS;
            }
            return (z3 || z) ? EnumC18385.PARTIAL : EnumC18385.FAILED;
        } catch (ErrnoException | SecurityException unused5) {
            return EnumC18385.FAILED;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static C13102 m43291(AbstractC17043 abstractC17043) {
        if (abstractC17043.mo29978()) {
            return abstractC17043.mo29986();
        }
        if (Build.VERSION.SDK_INT < 30 || !(abstractC17043 instanceof C14717)) {
            return null;
        }
        return abstractC17043.mo33651().m33654();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43296(AbstractC17043 abstractC17043) {
        C13102 c13102M33654;
        if (this.f56857) {
            return;
        }
        C19136 c19136Mo29981 = null;
        this.f56859 = null;
        if (abstractC17043.mo25100()) {
            if (abstractC17043 instanceof C14912) {
                C14912 c14912Mo34134 = abstractC17043.mo34134();
                if (c14912Mo34134.m34131()) {
                    C5525 c5525M34133 = c14912Mo34134.m34133();
                    this.f56859 = new C19727(c5525M34133.m12207(), c5525M34133.m12205(), c5525M34133.m12203());
                    return;
                }
                return;
            }
            return;
        }
        if (C23770.m52834().mo4996()) {
            boolean z = false;
            if (abstractC17043.mo29978()) {
                c19136Mo29981 = abstractC17043.mo29986().mo29981();
            } else if ((abstractC17043 instanceof C14717) && (c13102M33654 = abstractC17043.mo33651().m33654()) != null) {
                c19136Mo29981 = c13102M33654.mo29981();
                if (c19136Mo29981 == null) {
                    try {
                        c19136Mo29981 = C21759.m49047(c13102M33654.mo25505());
                    } catch (IOException unused) {
                    }
                }
            } else if (abstractC17043.mo38688() && abstractC17043.mo31068() && C18524.m42130(abstractC17043.mo25505())) {
                C19727 c19727 = f56855;
                if (c19727 != null) {
                    this.f56859 = c19727;
                    return;
                }
                z = true;
            }
            if (c19136Mo29981 == null) {
                try {
                    c19136Mo29981 = C21759.m49047(abstractC17043.mo25505());
                } catch (IOException unused2) {
                }
            }
            if (c19136Mo29981 != null) {
                C19727 c19728 = new C19727(c19136Mo29981);
                this.f56859 = c19728;
                if (z) {
                    c19728.f60012 = SecP521R1Field.P16;
                    f56855 = c19728;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m43298(AbstractC17043 abstractC17043) {
        C19727 c19727;
        C13102 c13102M33654;
        if (!(abstractC17043.mo29978() || (abstractC17043 instanceof C14912) || ((abstractC17043 instanceof C14717) && C23770.m52834().mo4996())) || (c19727 = this.f56859) == null) {
            return;
        }
        int i = c19727.f60011;
        int i2 = c19727.f60013;
        if (abstractC17043 instanceof C14912) {
            abstractC17043.mo34134().m34128(c19727.f60012);
            return;
        }
        if (C23770.m52834().mo4996()) {
            String strMo25505 = (!(abstractC17043 instanceof C14717) || (c13102M33654 = abstractC17043.mo33651().m33654()) == null) ? abstractC17043.mo25505() : c13102M33654.mo25505();
            try {
                C21759.m49049(strMo25505, c19727.f60012, false, false);
            } catch (IOException unused) {
            }
            if (i2 == -1 || i == -1) {
                return;
            }
            if (abstractC17043.mo29978() && abstractC17043.mo29986().m29977()) {
                return;
            }
            try {
                C21759.m49048(strMo25505, i2, i, false, false);
            } catch (IOException unused2) {
            }
        }
    }
}
