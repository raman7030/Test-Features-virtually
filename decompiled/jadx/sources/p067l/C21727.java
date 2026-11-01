package p067l;

import android.net.Uri;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩶᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21727 {

    /* JADX INFO: renamed from: ֡ */
    public static final C13010 f68423;

    /* JADX INFO: renamed from: ۚ */
    public static final Object f68424 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public long f68425;

    /* JADX INFO: renamed from: ۖ */
    public long f68426;

    /* JADX INFO: renamed from: ۘ */
    @Deprecated
    public Object f68427;

    /* JADX INFO: renamed from: ۜ */
    public int f68428;

    /* JADX INFO: renamed from: ۢ */
    public Object f68430;

    /* JADX INFO: renamed from: ۧ */
    public long f68431;

    /* JADX INFO: renamed from: ܳ */
    public boolean f68432;

    /* JADX INFO: renamed from: ܺ */
    public long f68433;

    /* JADX INFO: renamed from: ܽ */
    public long f68434;

    /* JADX INFO: renamed from: ܿ */
    public boolean f68435;

    /* JADX INFO: renamed from: ᩳ */
    public int f68436;

    /* JADX INFO: renamed from: ᩵ */
    public long f68438;

    /* JADX INFO: renamed from: ᩷ */
    public C8295 f68439;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f68440;

    /* JADX INFO: renamed from: ᩴ */
    public Object f68437 = f68424;

    /* JADX INFO: renamed from: ۡ */
    public C13010 f68429 = f68423;

    static {
        C23718 c23718 = new C23718();
        c23718.m52738("androidx.media3.common.Timeline");
        c23718.m52736(Uri.EMPTY);
        f68423 = c23718.m52735();
        C7470.m17250(1, 2, 3, 4, 5);
        C7470.m17250(6, 7, 8, 9, 10);
        C5792.m13032(11);
        C5792.m13032(12);
        C5792.m13032(13);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49009(C13010 c13010, Object obj, long j, long j2, long j3, boolean z, boolean z2, C8295 c8295, long j4, long j5, long j6) {
        C13660 c13660;
        this.f68437 = f68424;
        this.f68429 = c13010 != null ? c13010 : f68423;
        this.f68427 = (c13010 == null || (c13660 = c13010.f36611) == null) ? null : c13660.f38432;
        this.f68430 = obj;
        this.f68426 = j;
        this.f68438 = j2;
        this.f68434 = j3;
        this.f68440 = z;
        this.f68435 = z2;
        this.f68439 = c8295;
        this.f68425 = j4;
        this.f68431 = j5;
        this.f68436 = 0;
        this.f68428 = 0;
        this.f68433 = j6;
        this.f68432 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49010() {
        return this.f68439 != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C21727.class.equals(obj.getClass())) {
            return false;
        }
        C21727 c21727 = (C21727) obj;
        return C12826.equals(this.f68437, c21727.f68437) && C12826.equals(this.f68429, c21727.f68429) && C12826.equals(this.f68430, c21727.f68430) && C12826.equals(this.f68439, c21727.f68439) && this.f68426 == c21727.f68426 && this.f68438 == c21727.f68438 && this.f68434 == c21727.f68434 && this.f68440 == c21727.f68440 && this.f68435 == c21727.f68435 && this.f68432 == c21727.f68432 && this.f68425 == c21727.f68425 && this.f68431 == c21727.f68431 && this.f68436 == c21727.f68436 && this.f68428 == c21727.f68428 && this.f68433 == c21727.f68433;
    }

    public final int hashCode() {
        int iHashCode = (this.f68429.hashCode() + ((this.f68437.hashCode() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31)) * 31;
        Object obj = this.f68430;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C8295 c8295 = this.f68439;
        int iHashCode3 = (iHashCode2 + (c8295 != null ? c8295.hashCode() : 0)) * 31;
        long j = this.f68426;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f68438;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f68434;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f68440 ? 1 : 0)) * 31) + (this.f68435 ? 1 : 0)) * 31) + (this.f68432 ? 1 : 0)) * 31;
        long j4 = this.f68425;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f68431;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f68436) * 31) + this.f68428) * 31;
        long j6 = this.f68433;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
