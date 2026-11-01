package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۬֨֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 63QR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14508 {

    /* JADX INFO: renamed from: ֫ */
    public final int f41421;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC13838 f41422;

    /* JADX INFO: renamed from: ܽ */
    public static final C14508 f41418 = new C14508(EnumC13838.ARRAY);

    /* JADX INFO: renamed from: ᩳ */
    public static final C14508 f41420 = new C14508(EnumC13838.INNER_TYPE);

    /* JADX INFO: renamed from: ܿ */
    public static final C14508 f41419 = new C14508(EnumC13838.WILDCARD);

    public C14508(EnumC13838 enumC13838) {
        C1446.m31704(enumC13838 == EnumC13838.ARRAY || enumC13838 == EnumC13838.INNER_TYPE || enumC13838 == EnumC13838.WILDCARD);
        this.f41422 = enumC13838;
        this.f41421 = 0;
    }

    public C14508(EnumC13838 enumC13838, int i) {
        C1446.m31704(enumC13838 == EnumC13838.TYPE_ARGUMENT);
        this.f41422 = enumC13838;
        this.f41421 = i;
    }

    public final String toString() {
        String strM11876;
        StringBuilder sb = new StringBuilder();
        EnumC13838 enumC13838 = this.f41422;
        sb.append(enumC13838.toString());
        if (enumC13838 == EnumC13838.TYPE_ARGUMENT) {
            strM11876 = C5410.m11876(this.f41421, MotionUtils.EASING_TYPE_FORMAT_END, new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START));
        } else {
            strM11876 = "";
        }
        sb.append(strM11876);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14508)) {
            return false;
        }
        C14508 c14508 = (C14508) obj;
        return this.f41422 == c14508.f41422 && this.f41421 == c14508.f41421;
    }

    public final int hashCode() {
        return (this.f41422.hashCode() * 17) + this.f41421;
    }
}
