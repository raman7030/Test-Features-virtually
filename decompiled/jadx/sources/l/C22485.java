package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩹᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22485 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7214 f72800 = C7214.f22068;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f72801;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f72802;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f72803;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f72804;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f72805;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f72806;

    static {
        C5368.m15341(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50435(Object obj, Object obj2, int i, long j, long j2, C7214 c7214, boolean z) {
        this.f72803 = obj;
        this.f72802 = obj2;
        this.f72806 = i;
        this.f72801 = j;
        this.f72804 = j2;
        this.f72800 = c7214;
        this.f72805 = z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m50438(int i) {
        C7214 c7214 = this.f72800;
        int i2 = c7214.f22070;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c7214.m19298(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50433(int i) {
        this.f72800.m19298(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50436(int i) {
        return this.f72800.m19298(i).m32606(-1);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50437(long j) {
        C7214 c7214 = this.f72800;
        int i = c7214.f22070;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c7214.m19298(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c7214.m19298(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            C13563 c13563M19298 = c7214.m19298(i2);
            int i3 = c13563M19298.f40471;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c13563M19298.f40473[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50432(long j) {
        C13563 c13563M19298;
        int i;
        C7214 c7214 = this.f72800;
        long j2 = this.f72801;
        int i2 = c7214.f22070;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c7214.m19298(i3).getClass();
                c7214.m19298(i3).getClass();
                if (0 > j && ((i = (c13563M19298 = c7214.m19298(i3)).f40471) == -1 || c13563M19298.m32606(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c7214.m19298(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m50434(int i, int i2) {
        C13563 c13563M19298 = this.f72800.m19298(i);
        if (c13563M19298.f40471 != -1) {
            return c13563M19298.f40472[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50439(int i) {
        this.f72800.m19298(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C22485.class.equals(obj.getClass())) {
            return false;
        }
        C22485 c22485 = (C22485) obj;
        return C11003.equals(this.f72803, c22485.f72803) && C11003.equals(this.f72802, c22485.f72802) && this.f72806 == c22485.f72806 && this.f72801 == c22485.f72801 && this.f72804 == c22485.f72804 && this.f72805 == c22485.f72805 && C11003.equals(this.f72800, c22485.f72800);
    }

    public final int hashCode() {
        Object obj = this.f72803;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31;
        Object obj2 = this.f72802;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f72806) * 31;
        long j = this.f72801;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f72804;
        return this.f72800.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f72805 ? 1 : 0)) * 31);
    }
}
