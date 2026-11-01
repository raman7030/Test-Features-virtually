package p067l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩹᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes.dex */
public final class C23738 {

    /* JADX INFO: renamed from: ֫ */
    public C9224 f75526 = C9224.f24953;

    /* JADX INFO: renamed from: ۧ */
    public long f75527;

    /* JADX INFO: renamed from: ܳ */
    public Object f75528;

    /* JADX INFO: renamed from: ܽ */
    public Object f75529;

    /* JADX INFO: renamed from: ܿ */
    public long f75530;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f75531;

    /* JADX INFO: renamed from: ᩻ */
    public int f75532;

    static {
        C7470.m17250(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52776(Object obj, Object obj2, int i, long j, long j2, C9224 c9224, boolean z) {
        this.f75529 = obj;
        this.f75528 = obj2;
        this.f75532 = i;
        this.f75527 = j;
        this.f75530 = j2;
        this.f75526 = c9224;
        this.f75531 = z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m52779(int i) {
        C9224 c9224 = this.f75526;
        int i2 = c9224.f24955;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c9224.m21246(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m52774(int i) {
        this.f75526.m21246(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52777(int i) {
        return this.f75526.m21246(i).m34717(-1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m52778(long j) {
        C9224 c9224 = this.f75526;
        int i = c9224.f24955;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c9224.m21246(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c9224.m21246(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            C15258 c15258M21246 = c9224.m21246(i2);
            int i3 = c15258M21246.f43549;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c15258M21246.f43551[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52773(long j) {
        C15258 c15258M21246;
        int i;
        C9224 c9224 = this.f75526;
        long j2 = this.f75527;
        int i2 = c9224.f24955;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c9224.m21246(i3).getClass();
                c9224.m21246(i3).getClass();
                if (0 > j && ((i = (c15258M21246 = c9224.m21246(i3)).f43549) == -1 || c15258M21246.m34717(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c9224.m21246(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m52775(int i, int i2) {
        C15258 c15258M21246 = this.f75526.m21246(i);
        if (c15258M21246.f43549 != -1) {
            return c15258M21246.f43550[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m52780(int i) {
        this.f75526.m21246(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C23738.class.equals(obj.getClass())) {
            return false;
        }
        C23738 c23738 = (C23738) obj;
        return C12826.equals(this.f75529, c23738.f75529) && C12826.equals(this.f75528, c23738.f75528) && this.f75532 == c23738.f75532 && this.f75527 == c23738.f75527 && this.f75530 == c23738.f75530 && this.f75531 == c23738.f75531 && C12826.equals(this.f75526, c23738.f75526);
    }

    public final int hashCode() {
        Object obj = this.f75529;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31;
        Object obj2 = this.f75528;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f75532) * 31;
        long j = this.f75527;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f75530;
        return this.f75526.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f75531 ? 1 : 0)) * 31);
    }
}
