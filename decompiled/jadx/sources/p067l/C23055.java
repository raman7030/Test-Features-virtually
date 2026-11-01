package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩸ᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7AU */
/* JADX INFO: loaded from: classes.dex */
public final class C23055 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f72449;

    /* JADX INFO: renamed from: ۧ */
    public final C17018 f72450;

    /* JADX INFO: renamed from: ܳ */
    public final EnumC3490 f72451;

    /* JADX INFO: renamed from: ܽ */
    public final String f72452;

    /* JADX INFO: renamed from: ܿ */
    public final int f72453;

    /* JADX INFO: renamed from: ᩳ */
    public final Object[] f72454;

    public C23055(boolean z, EnumC3490 enumC3490, int i, String str, Object[] objArr, C17018 c17018) {
        this.f72449 = z;
        this.f72451 = enumC3490;
        this.f72453 = i;
        this.f72452 = str;
        this.f72454 = objArr;
        this.f72450 = c17018;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23055 m51442(C17018 c17018) {
        return new C23055(true, EnumC3490.OK, 0, "", new Object[0], c17018);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23055 m51441(EnumC3490 enumC3490, int i, Object... objArr) {
        return new C23055(false, enumC3490, i, "", objArr, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23055 m51440() {
        return new C23055(false, EnumC3490.UNAUTHORIZED, R.string.MT_Protector, "auth_clock_skew", new Object[0], null);
    }
}
