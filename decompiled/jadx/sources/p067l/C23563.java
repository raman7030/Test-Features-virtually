package p067l;

/* JADX INFO: renamed from: l.᩹۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S7CF */
/* JADX INFO: loaded from: classes.dex */
public final class C23563 {

    /* JADX INFO: renamed from: ֫ */
    public int f75038;

    /* JADX INFO: renamed from: ۧ */
    public int f75039;

    /* JADX INFO: renamed from: ܽ */
    public int f75040;

    /* JADX INFO: renamed from: ᩳ */
    public int f75041;

    public C23563() {
        m52367(-1, -1);
        this.f75040 = -1;
        this.f75041 = -1;
        EnumC8140.m18864(EnumC21552.ORDINARY);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52367(int i, int i2) {
        this.f75038 = i;
        this.f75039 = i2;
        if (m52371()) {
            EnumC8140.m18864(EnumC21552.VALUE_OBJECTS);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52366(int i) {
        m52367(i, this.f75039);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52370(int i) {
        m52367(this.f75038, i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52372() {
        return (this.f75038 == -1 || this.f75039 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52365() {
        int i = this.f75038;
        Object objValueOf = i == -1 ? "(undef)" : Integer.valueOf(i);
        int i2 = this.f75039;
        return String.format("%s:%s", objValueOf, i2 != -1 ? Integer.valueOf(i2) : "(undef)");
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m52373() {
        return m52372() && this.f75038 >= 50;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52369() {
        if (m52372()) {
            return;
        }
        if (EnumC8140.m18889() == EnumC21552.VALUE_OBJECTS) {
            m52367(69, 65535);
        } else {
            m52367(45, 3);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23563 m52363(C23563 c23563) {
        C23563 c23564 = new C23563();
        c23564.m52367(c23563.f75038, c23563.f75039);
        c23564.f75040 = c23563.f75040;
        c23564.f75041 = c23563.f75041;
        if (c23564.m52371()) {
            EnumC8140.m18864(EnumC21552.VALUE_OBJECTS);
        } else {
            EnumC8140.m18864(EnumC21552.ORDINARY);
        }
        return c23564;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m52368() {
        return this.f75039;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m52375() {
        return this.f75038;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m52371() {
        int i = this.f75038;
        if (i <= 69) {
            return i == 69 && this.f75039 == 65535;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static C23563 m52364() {
        C23563 c23563 = new C23563();
        c23563.f75038 = 69;
        c23563.f75039 = 65535;
        if (c23563.m52371()) {
            EnumC8140.m18864(EnumC21552.VALUE_OBJECTS);
            return c23563;
        }
        EnumC8140.m18864(EnumC21552.ORDINARY);
        return c23563;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52374() {
        return this.f75038 <= 45;
    }
}
