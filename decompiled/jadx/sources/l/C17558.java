package l;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import java.io.IOException;
import org.bouncycastle.math.ec.custom.sec.SecP521R1Field;

/* JADX INFO: renamed from: l.ܿ᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17558 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C18264 f53665;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11209 f53666 = new C11209();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53667;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11209 f53668;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18264 f53669;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41048(C18264 c18264) {
        this.f53669 = c18264;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18264 m41049() {
        return this.f53669;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41047() {
        this.f53667 = true;
    }

    public C17558(C18264 c18264) {
        this();
        this.f53669 = c18264;
        this.f53667 = true;
    }

    public C17558() {
        this.f53668 = f53666;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC16852 m41046(AbstractC15440 abstractC15440) {
        this.f53669 = null;
        if (abstractC15440.mo36530()) {
            try {
                C11209 c11209 = this.f53668;
                String strMo23554 = abstractC15440.mo23554();
                c11209.getClass();
                StructStat structStatStat = Os.stat(strMo23554);
                this.f53669 = new C18264(structStatStat.st_mode & 4095, structStatStat.st_uid, structStatStat.st_gid);
                return EnumC16852.SUCCESS;
            } catch (ErrnoException | SecurityException unused) {
                return EnumC16852.FAILED;
            }
        }
        if (abstractC15440 instanceof C13198) {
            C13198 c13198Mo32036 = abstractC15440.mo32036();
            if (!c13198Mo32036.m32033()) {
                return EnumC16852.FAILED;
            }
            C3321 c3321M32035 = c13198Mo32036.m32035();
            this.f53669 = new C18264(c3321M32035.m10171(), c3321M32035.m10169(), c3321M32035.m10167());
            return EnumC16852.SUCCESS;
        }
        C11293 c11293M41045 = m41045(abstractC15440);
        if (c11293M41045 == null || !C22518.m50492().mo2656()) {
            return EnumC16852.UNAVAILABLE;
        }
        C17642 c17642Mo27920 = c11293M41045.mo27920();
        if (c17642Mo27920 == null) {
            try {
                c17642Mo27920 = C20402.m46724(c11293M41045.mo23554());
            } catch (IOException unused2) {
                return EnumC16852.FAILED;
            }
        }
        this.f53669 = new C18264(c17642Mo27920);
        return EnumC16852.SUCCESS;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC16852 m41051(AbstractC15440 abstractC15440) {
        boolean z;
        boolean z2;
        C11209 c11209 = this.f53668;
        C18264 c18264 = this.f53669;
        if (c18264 == null) {
            return EnumC16852.UNAVAILABLE;
        }
        int i = c18264.f56796;
        int i2 = c18264.f56794;
        boolean z3 = true;
        if (!abstractC15440.mo36530()) {
            if (abstractC15440 instanceof C13198) {
                if (abstractC15440.mo32036().m32030(c18264.f56795)) {
                    return (i == -1 && i2 == -1) ? EnumC16852.SUCCESS : EnumC16852.PARTIAL;
                }
                return EnumC16852.FAILED;
            }
            C11293 c11293M41045 = m41045(abstractC15440);
            if (c11293M41045 == null || !C22518.m50492().mo2656()) {
                return EnumC16852.UNAVAILABLE;
            }
            String strMo23554 = c11293M41045.mo23554();
            if (i == -1 || i2 == -1) {
                z2 = i == -1 && i2 == -1;
            } else {
                if (!abstractC15440.mo27917() || !abstractC15440.mo27925().m27916()) {
                    try {
                        C20402.m46725(strMo23554, i, i2, false, false);
                    } catch (IOException unused) {
                    }
                }
            }
            try {
                C20402.m46726(strMo23554, c18264.f56795, false, false);
            } catch (IOException unused2) {
                z3 = false;
            }
            if (z3 && z2) {
                return EnumC16852.SUCCESS;
            }
            return (z3 || z2) ? EnumC16852.PARTIAL : EnumC16852.FAILED;
        }
        try {
            String strMo23555 = abstractC15440.mo23554();
            c11209.getClass();
            StructStat structStatStat = Os.stat(strMo23555);
            int i3 = structStatStat.st_mode & 4095;
            boolean z4 = (structStatStat.st_uid == i && structStatStat.st_gid == i2) ? false : true;
            if (z4) {
                try {
                    String strMo23556 = abstractC15440.mo23554();
                    c11209.getClass();
                    Os.chown(strMo23556, i, i2);
                } catch (ErrnoException | SecurityException unused3) {
                    z = false;
                }
            }
            z = true;
            if (z4 || i3 != c18264.f56795) {
                try {
                    String strMo23557 = abstractC15440.mo23554();
                    int i4 = c18264.f56795;
                    c11209.getClass();
                    Os.chmod(strMo23557, i4);
                } catch (ErrnoException | SecurityException unused4) {
                    z3 = false;
                }
            }
            if (z3 && z) {
                return EnumC16852.SUCCESS;
            }
            return (z3 || z) ? EnumC16852.PARTIAL : EnumC16852.FAILED;
        } catch (ErrnoException | SecurityException unused5) {
            return EnumC16852.FAILED;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C11293 m41045(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo27917()) {
            return abstractC15440.mo27925();
        }
        if (Build.VERSION.SDK_INT < 30 || !(abstractC15440 instanceof C12993)) {
            return null;
        }
        return abstractC15440.mo31566().m31569();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41050(AbstractC15440 abstractC15440) {
        C11293 c11293M31569;
        if (this.f53667) {
            return;
        }
        C17642 c17642Mo27920 = null;
        this.f53669 = null;
        if (abstractC15440.mo23126()) {
            if (abstractC15440 instanceof C13198) {
                C13198 c13198Mo32036 = abstractC15440.mo32036();
                if (c13198Mo32036.m32033()) {
                    C3321 c3321M32035 = c13198Mo32036.m32035();
                    this.f53669 = new C18264(c3321M32035.m10171(), c3321M32035.m10169(), c3321M32035.m10167());
                    return;
                }
                return;
            }
            return;
        }
        if (C22518.m50492().mo2656()) {
            boolean z = false;
            if (abstractC15440.mo27917()) {
                c17642Mo27920 = abstractC15440.mo27925().mo27920();
            } else if ((abstractC15440 instanceof C12993) && (c11293M31569 = abstractC15440.mo31566().m31569()) != null) {
                c17642Mo27920 = c11293M31569.mo27920();
                if (c17642Mo27920 == null) {
                    try {
                        c17642Mo27920 = C20402.m46724(c11293M31569.mo23554());
                    } catch (IOException unused) {
                    }
                }
            } else if (abstractC15440.mo36530() && abstractC15440.mo29016() && C16999.m39887(abstractC15440.mo23554())) {
                C18264 c18264 = f53665;
                if (c18264 != null) {
                    this.f53669 = c18264;
                    return;
                }
                z = true;
            }
            if (c17642Mo27920 == null) {
                try {
                    c17642Mo27920 = C20402.m46724(abstractC15440.mo23554());
                } catch (IOException unused2) {
                }
            }
            if (c17642Mo27920 != null) {
                C18264 c18265 = new C18264(c17642Mo27920);
                this.f53669 = c18265;
                if (z) {
                    c18265.f56795 = SecP521R1Field.P16;
                    f53665 = c18265;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41052(AbstractC15440 abstractC15440) {
        C18264 c18264;
        C11293 c11293M31569;
        if (!(abstractC15440.mo27917() || (abstractC15440 instanceof C13198) || ((abstractC15440 instanceof C12993) && C22518.m50492().mo2656())) || (c18264 = this.f53669) == null) {
            return;
        }
        int i = c18264.f56794;
        int i2 = c18264.f56796;
        if (abstractC15440 instanceof C13198) {
            abstractC15440.mo32036().m32030(c18264.f56795);
            return;
        }
        if (C22518.m50492().mo2656()) {
            String strMo23554 = (!(abstractC15440 instanceof C12993) || (c11293M31569 = abstractC15440.mo31566().m31569()) == null) ? abstractC15440.mo23554() : c11293M31569.mo23554();
            try {
                C20402.m46726(strMo23554, c18264.f56795, false, false);
            } catch (IOException unused) {
            }
            if (i2 == -1 || i == -1) {
                return;
            }
            if (abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) {
                return;
            }
            try {
                C20402.m46725(strMo23554, i2, i, false, false);
            } catch (IOException unused2) {
            }
        }
    }
}
