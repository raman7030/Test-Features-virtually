package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C15020 {

    /* JADX INFO: renamed from: ֫ */
    public final C10307[] f42917;

    /* JADX INFO: renamed from: ۧ */
    public int f42918;

    /* JADX INFO: renamed from: ܽ */
    public final String f42919;

    /* JADX INFO: renamed from: ܿ */
    public final int f42920;

    /* JADX INFO: renamed from: ᩳ */
    public final int f42921;

    public C15020(String str, C10307... c10307Arr) {
        C23877.m52957(c10307Arr.length > 0);
        this.f42919 = str;
        this.f42917 = c10307Arr;
        this.f42921 = c10307Arr.length;
        int iM26822 = C11669.m26822(c10307Arr[0].f28528);
        this.f42920 = iM26822 == -1 ? C11669.m26822(c10307Arr[0].f28520) : iM26822;
        String str2 = c10307Arr[0].f28517;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c10307Arr[0].f28522 | 16384;
        for (int i2 = 1; i2 < c10307Arr.length; i2++) {
            String str3 = c10307Arr[i2].f28517;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m34393("languages", i2, c10307Arr[0].f28517, c10307Arr[i2].f28517);
                return;
            } else {
                if (i != (c10307Arr[i2].f28522 | 16384)) {
                    m34393("role flags", i2, Integer.toBinaryString(c10307Arr[0].f28522), Integer.toBinaryString(c10307Arr[i2].f28522));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10307 m34395(int i) {
        return this.f42917[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m34394(C10307 c10307) {
        int i = 0;
        while (true) {
            C10307[] c10307Arr = this.f42917;
            if (i >= c10307Arr.length) {
                return -1;
            }
            if (c10307 == c10307Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f42918 == 0) {
            this.f42918 = Arrays.hashCode(this.f42917) + C12832.m29411(527, 31, this.f42919);
        }
        return this.f42918;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15020.class == obj.getClass()) {
            C15020 c15020 = (C15020) obj;
            if (this.f42919.equals(c15020.f42919) && Arrays.equals(this.f42917, c15020.f42917)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f42919 + ": " + Arrays.toString(this.f42917);
    }

    static {
        C5792.m13032(0);
        C5792.m13032(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34393(String str, int i, String str2, String str3) {
        StringBuilder sbM12525 = C5633.m12525("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM12525.append(str3);
        sbM12525.append("' (track ");
        sbM12525.append(i);
        sbM12525.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C21334.m48348("", new IllegalStateException(sbM12525.toString()));
    }
}
