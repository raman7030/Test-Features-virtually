package l;

import android.net.Uri;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩶᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20369 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C11197 f65747;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f65748 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f65749;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f65750;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    @Deprecated
    public Object f65751;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f65752;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Object f65754;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f65755;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f65756;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f65757;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f65758;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f65759;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f65760;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f65762;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C6236 f65763;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f65764;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Object f65761 = f65748;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C11197 f65753 = f65747;

    static {
        C22464 c22464 = new C22464();
        c22464.m50397("androidx.media3.common.Timeline");
        c22464.m50395(Uri.EMPTY);
        f65747 = c22464.m50394();
        C5368.m15341(1, 2, 3, 4, 5);
        C5368.m15341(6, 7, 8, 9, 10);
        C3603.m11056(11);
        C3603.m11056(12);
        C3603.m11056(13);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46686(C11197 c11197, Object obj, long j, long j2, long j3, boolean z, boolean z2, C6236 c6236, long j4, long j5, long j6) {
        C11881 c11881;
        this.f65761 = f65748;
        this.f65753 = c11197 != null ? c11197 : f65747;
        this.f65751 = (c11197 == null || (c11881 = c11197.f33612) == null) ? null : c11881.f35422;
        this.f65754 = obj;
        this.f65750 = j;
        this.f65762 = j2;
        this.f65758 = j3;
        this.f65764 = z;
        this.f65759 = z2;
        this.f65763 = c6236;
        this.f65749 = j4;
        this.f65755 = j5;
        this.f65760 = 0;
        this.f65752 = 0;
        this.f65757 = j6;
        this.f65756 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m46687() {
        return this.f65763 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C20369.class.equals(obj.getClass())) {
            return false;
        }
        C20369 c20369 = (C20369) obj;
        return C11003.equals(this.f65761, c20369.f65761) && C11003.equals(this.f65753, c20369.f65753) && C11003.equals(this.f65754, c20369.f65754) && C11003.equals(this.f65763, c20369.f65763) && this.f65750 == c20369.f65750 && this.f65762 == c20369.f65762 && this.f65758 == c20369.f65758 && this.f65764 == c20369.f65764 && this.f65759 == c20369.f65759 && this.f65756 == c20369.f65756 && this.f65749 == c20369.f65749 && this.f65755 == c20369.f65755 && this.f65760 == c20369.f65760 && this.f65752 == c20369.f65752 && this.f65757 == c20369.f65757;
    }

    public final int hashCode() {
        int iHashCode = (this.f65753.hashCode() + ((this.f65761.hashCode() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31)) * 31;
        Object obj = this.f65754;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C6236 c6236 = this.f65763;
        int iHashCode3 = (iHashCode2 + (c6236 != null ? c6236.hashCode() : 0)) * 31;
        long j = this.f65750;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f65762;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f65758;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f65764 ? 1 : 0)) * 31) + (this.f65759 ? 1 : 0)) * 31) + (this.f65756 ? 1 : 0)) * 31;
        long j4 = this.f65749;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f65755;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f65760) * 31) + this.f65752) * 31;
        long j6 = this.f65757;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
