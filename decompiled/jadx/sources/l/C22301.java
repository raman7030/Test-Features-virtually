package l;

/* JADX INFO: renamed from: l.᩹۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CF */
/* JADX INFO: loaded from: classes.dex */
public final class C22301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72311;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72312;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72313;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72314;

    public C22301() {
        m50037(-1, -1);
        this.f72313 = -1;
        this.f72314 = -1;
        EnumC6073.m16935(EnumC20185.ORDINARY);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50037(int i, int i2) {
        this.f72311 = i;
        this.f72312 = i2;
        if (m50041()) {
            EnumC6073.m16935(EnumC20185.VALUE_OBJECTS);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50036(int i) {
        m50037(i, this.f72312);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50040(int i) {
        m50037(this.f72311, i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50042() {
        return (this.f72311 == -1 || this.f72312 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50035() {
        int i = this.f72311;
        Object objValueOf = i == -1 ? "(undef)" : Integer.valueOf(i);
        int i2 = this.f72312;
        return String.format("%s:%s", objValueOf, i2 != -1 ? Integer.valueOf(i2) : "(undef)");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m50043() {
        return m50042() && this.f72311 >= 50;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50039() {
        if (m50042()) {
            return;
        }
        if (EnumC6073.m16960() == EnumC20185.VALUE_OBJECTS) {
            m50037(69, 65535);
        } else {
            m50037(45, 3);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22301 m50033(C22301 c22301) {
        C22301 c22302 = new C22301();
        c22302.m50037(c22301.f72311, c22301.f72312);
        c22302.f72313 = c22301.f72313;
        c22302.f72314 = c22301.f72314;
        if (c22302.m50041()) {
            EnumC6073.m16935(EnumC20185.VALUE_OBJECTS);
        } else {
            EnumC6073.m16935(EnumC20185.ORDINARY);
        }
        return c22302;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m50038() {
        return this.f72312;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m50045() {
        return this.f72311;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m50041() {
        int i = this.f72311;
        if (i <= 69) {
            return i == 69 && this.f72312 == 65535;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C22301 m50034() {
        C22301 c22301 = new C22301();
        c22301.f72311 = 69;
        c22301.f72312 = 65535;
        if (c22301.m50041()) {
            EnumC6073.m16935(EnumC20185.VALUE_OBJECTS);
            return c22301;
        }
        EnumC6073.m16935(EnumC20185.ORDINARY);
        return c22301;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50044() {
        return this.f72311 <= 45;
    }
}
