package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes.dex */
public final class C21766 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f69741;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15414 f69742;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC1180 f69743;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f69744;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f69745;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object[] f69746;

    public C21766(boolean z, EnumC1180 enumC1180, int i, String str, Object[] objArr, C15414 c15414) {
        this.f69741 = z;
        this.f69743 = enumC1180;
        this.f69745 = i;
        this.f69744 = str;
        this.f69746 = objArr;
        this.f69742 = c15414;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49092(C15414 c15414) {
        return new C21766(true, EnumC1180.OK, 0, "", new Object[0], c15414);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49091(EnumC1180 enumC1180, int i, Object... objArr) {
        return new C21766(false, enumC1180, i, "", objArr, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21766 m49090() {
        return new C21766(false, EnumC1180.UNAUTHORIZED, R.string.MT_Protector, "auth_clock_skew", new Object[0], null);
    }
}
