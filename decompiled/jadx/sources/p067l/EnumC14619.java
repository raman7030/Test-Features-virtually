package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59CN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14619 {
    PREFER_SHOW_ALL(true, true, R.string.MT_Protector),
    PREFER_SHOW_TITLE_ONLY(true, false, R.string.MT_Protector),
    PREFER_SHOW_ICON_ONLY(false, true, R.string.MT_Protector);


    /* JADX INFO: renamed from: ᩶ */
    public final boolean f41736;

    /* JADX INFO: renamed from: ᩸ */
    public final int f41737;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f41738;

    EnumC14619(boolean z, boolean z2, int i) {
        this.f41736 = z;
        this.f41738 = z2;
        this.f41737 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C7050.m16224(this.f41737);
    }
}
