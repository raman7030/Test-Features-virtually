package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۡۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P735 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10594 {
    CONTAINS(1, R.string.MT_Protector, R.string.MT_Protector),
    PREFIX(2, R.string.MT_Protector, R.string.MT_Protector),
    SUFFIX(3, R.string.MT_Protector, R.string.MT_Protector),
    EXACT(4, R.string.MT_Protector, R.string.MT_Protector),
    WILDCARD(0, R.string.MT_Protector, R.string.MT_Protector),
    REGEX(5, R.string.MT_Protector, R.string.MT_Protector);


    /* JADX INFO: renamed from: ᩶ */
    public final int f29337;

    /* JADX INFO: renamed from: ᩸ */
    public final int f29338;

    /* JADX INFO: renamed from: ᩹ */
    public final int f29339;

    EnumC10594(int i, int i2, int i3) {
        this.f29337 = i;
        this.f29338 = i2;
        this.f29339 = i3;
    }

    /* JADX INFO: renamed from: ܿ */
    public int m24387() {
        return this.f29337;
    }

    /* JADX INFO: renamed from: ֫ */
    public int m24385() {
        return this.f29338;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m24386() {
        return this.f29339;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC10594 m24383(int i) {
        for (EnumC10594 enumC10594 : values()) {
            if (enumC10594.f29337 == i) {
                return enumC10594;
            }
        }
        return WILDCARD;
    }
}
