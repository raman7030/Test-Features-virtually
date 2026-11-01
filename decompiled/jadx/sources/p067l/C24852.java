package p067l;

/* JADX INFO: renamed from: l.᩻ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes.dex */
public final class C24852 {

    /* JADX INFO: renamed from: ֫ */
    public final int f79390;

    /* JADX INFO: renamed from: ۧ */
    public final C19013 f79391;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC20315 f79392;

    /* JADX INFO: renamed from: ᩳ */
    public final int f79393;

    public C24852(C22367 c22367) {
        this.f79392 = c22367.f70581;
        this.f79393 = c22367.f70582;
        this.f79390 = c22367.f70579;
        this.f79391 = c22367.f70580;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C24852) {
            C24852 c24852 = (C24852) obj;
            if (this.f79392 == c24852.f79392 && this.f79393 == c24852.f79393 && this.f79390 == c24852.f79390 && this.f79391 == c24852.f79391) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f79391) + (((((System.identityHashCode(this.f79392) * 31) + this.f79393) * 31) + this.f79390) * 31);
    }
}
