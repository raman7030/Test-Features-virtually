package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۬᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T8IW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13312 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353[] f39850;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f39851;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f39852;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f39853;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39854;

    public C13312(String str, C8353... c8353Arr) {
        C22632.m50631(c8353Arr.length > 0);
        this.f39852 = str;
        this.f39850 = c8353Arr;
        this.f39854 = c8353Arr.length;
        int iM24807 = C9786.m24807(c8353Arr[0].f25614);
        this.f39853 = iM24807 == -1 ? C9786.m24807(c8353Arr[0].f25606) : iM24807;
        String str2 = c8353Arr[0].f25603;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = c8353Arr[0].f25608 | 16384;
        for (int i2 = 1; i2 < c8353Arr.length; i2++) {
            String str3 = c8353Arr[i2].f25603;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m32293("languages", i2, c8353Arr[0].f25603, c8353Arr[i2].f25603);
                return;
            } else {
                if (i != (c8353Arr[i2].f25608 | 16384)) {
                    m32293("role flags", i2, Integer.toBinaryString(c8353Arr[0].f25608), Integer.toBinaryString(c8353Arr[i2].f25608));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m32295(int i) {
        return this.f39850[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32294(C8353 c8353) {
        int i = 0;
        while (true) {
            C8353[] c8353Arr = this.f39850;
            if (i >= c8353Arr.length) {
                return -1;
            }
            if (c8353 == c8353Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.f39851 == 0) {
            this.f39851 = Arrays.hashCode(this.f39850) + C11010.m27349(527, 31, this.f39852);
        }
        return this.f39851;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13312.class == obj.getClass()) {
            C13312 c13312 = (C13312) obj;
            if (this.f39852.equals(c13312.f39852) && Arrays.equals(this.f39850, c13312.f39850)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f39852 + ": " + Arrays.toString(this.f39850);
    }

    static {
        C3603.m11056(0);
        C3603.m11056(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32293(String str, int i, String str2, String str3) {
        StringBuilder sbM10501 = C3435.m10501("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM10501.append(str3);
        sbM10501.append("' (track ");
        sbM10501.append(i);
        sbM10501.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C19956.m46034("", new IllegalStateException(sbM10501.toString()));
    }
}
