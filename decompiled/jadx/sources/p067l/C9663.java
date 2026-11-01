package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.۟᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7BH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9663 {

    /* JADX INFO: renamed from: ۖ */
    public final boolean f26616;

    /* JADX INFO: renamed from: ۘ */
    public final String f26617;

    /* JADX INFO: renamed from: ۜ */
    public final long f26618;

    /* JADX INFO: renamed from: ۡ */
    public boolean f26619;

    /* JADX INFO: renamed from: ۢ */
    public boolean f26620;

    /* JADX INFO: renamed from: ܳ */
    public final String f26622;

    /* JADX INFO: renamed from: ܺ */
    public final long f26623;

    /* JADX INFO: renamed from: ܿ */
    public boolean f26625;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f26628;

    /* JADX INFO: renamed from: ۧ */
    public boolean f26621 = true;

    /* JADX INFO: renamed from: ܽ */
    public String f26624 = "";

    /* JADX INFO: renamed from: ᩷ */
    public String f26627 = "pending";

    /* JADX INFO: renamed from: ᩳ */
    public String f26626 = "";

    /* JADX INFO: renamed from: ֫ */
    public String f26615 = "";

    public C9663(String str, String str2, long j, long j2, boolean z) {
        this.f26622 = str;
        this.f26617 = str2;
        this.f26618 = j;
        this.f26623 = j2;
        this.f26616 = z;
    }

    /* JADX INFO: renamed from: ۚ */
    public static boolean m22518(C9663 c9663) {
        return TextUtils.equals(c9663.f26617, "file");
    }

    /* JADX INFO: renamed from: ֡ */
    public static boolean m22512(C9663 c9663) {
        return TextUtils.equals(c9663.f26617, "directory");
    }
}
