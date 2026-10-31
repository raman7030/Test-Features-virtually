package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡۙܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P735 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8655 {
    CONTAINS(1, R.string.MT_Protector, R.string.MT_Protector),
    PREFIX(2, R.string.MT_Protector, R.string.MT_Protector),
    SUFFIX(3, R.string.MT_Protector, R.string.MT_Protector),
    EXACT(4, R.string.MT_Protector, R.string.MT_Protector),
    WILDCARD(0, R.string.MT_Protector, R.string.MT_Protector),
    REGEX(5, R.string.MT_Protector, R.string.MT_Protector);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f26419;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f26420;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f26421;

    EnumC8655(int i, int i2, int i3) {
        this.f26419 = i;
        this.f26420 = i2;
        this.f26421 = i3;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int m22418() {
        return this.f26419;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m22416() {
        return this.f26420;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m22417() {
        return this.f26421;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8655 m22414(int i) {
        for (EnumC8655 enumC8655 : values()) {
            if (enumC8655.f26419 == i) {
                return enumC8655;
            }
        }
        return WILDCARD;
    }
}
