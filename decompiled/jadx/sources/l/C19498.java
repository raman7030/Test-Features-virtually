package l;

/* JADX INFO: renamed from: l.᩵ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19498 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC3975 f63017;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC18792 f63018;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC2564 f63019;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63020;

    public C19498(EnumC3975 enumC3975, EnumC18792 enumC18792, EnumC2564 enumC2564) {
        this.f63017 = enumC3975;
        this.f63018 = enumC18792;
        this.f63020 = 7600;
        this.f63019 = enumC2564;
    }

    public C19498() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44909(C12441 c12441) throws C13146 {
        this.f63017 = (EnumC3975) C15262.m36279(c12441.m26095(), EnumC3975.class, null);
        this.f63018 = (EnumC18792) C15262.m36279(c12441.m26095(), EnumC18792.class, null);
        this.f63020 = c12441.m26100();
        c12441.m26096(3);
        this.f63019 = (EnumC2564) C15262.m36279(c12441.m26095(), EnumC2564.class, null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44910(C12441 c12441) {
        c12441.m26075((byte) this.f63017.f12617);
        c12441.m26075((byte) this.f63018.f59316);
        c12441.m26086(this.f63020);
        c12441.m26077(3, new byte[]{0, 0, 0});
        c12441.m26075((byte) this.f63019.getValue());
    }

    public final String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.f63017, this.f63018, Integer.valueOf(this.f63020), this.f63019);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19498.class == obj.getClass()) {
            C19498 c19498 = (C19498) obj;
            if (this.f63020 == c19498.f63020 && this.f63017 == c19498.f63017 && this.f63018 == c19498.f63018 && this.f63019 == c19498.f63019) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f63017, this.f63018, Integer.valueOf(this.f63020), this.f63019);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC2564 m44908() {
        return this.f63019;
    }
}
