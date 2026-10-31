package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59CN */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12890 {
    PREFER_SHOW_ALL(true, true, R.string.MT_Protector),
    PREFER_SHOW_TITLE_ONLY(true, false, R.string.MT_Protector),
    PREFER_SHOW_ICON_ONLY(false, true, R.string.MT_Protector);


    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f38693;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f38694;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f38695;

    EnumC12890(boolean z, boolean z2, int i) {
        this.f38693 = z;
        this.f38695 = z2;
        this.f38694 = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return C4925.m14327(this.f38694);
    }
}
