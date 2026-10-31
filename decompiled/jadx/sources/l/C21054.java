package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩷ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C21054 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C21054 f67913;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f67914;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f67915;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] f67916;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f67917;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f67918;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f67919;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f67920;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47893(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? C19370.m44628(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m47895(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? C19370.m44628(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m47896(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? C19370.m44628(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    @Pure
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m47897(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    @Pure
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m47898(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    static {
        C6942 c6942 = new C6942();
        c6942.m18755(1);
        c6942.m18754(2);
        c6942.m18757(3);
        f67913 = c6942.m18751();
        C6942 c6943 = new C6942();
        c6943.m18755(1);
        c6943.m18754(1);
        c6943.m18757(2);
        c6943.m18751();
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
        C3603.m11056(3);
        C3603.m11056(4);
        C3603.m11056(5);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47894(C21054 c21054) {
        if (c21054 == null) {
            return true;
        }
        int i = c21054.f67917;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c21054.f67915;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c21054.f67919;
        if ((i3 != -1 && i3 != 3) || c21054.f67916 != null) {
            return false;
        }
        int i4 = c21054.f67914;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c21054.f67920;
        return i5 == -1 || i5 == 8;
    }

    public C21054(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f67917 = i;
        this.f67915 = i2;
        this.f67919 = i3;
        this.f67916 = bArr;
        this.f67920 = i4;
        this.f67914 = i5;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6942 m47899() {
        return new C6942(this);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m47900() {
        return (this.f67917 == -1 || this.f67915 == -1 || this.f67919 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m47901() {
        String str;
        String str2;
        int i;
        if (m47900()) {
            String strM47895 = m47895(this.f67917);
            String strM47893 = m47893(this.f67915);
            String strM47896 = m47896(this.f67919);
            Locale locale = Locale.US;
            str = strM47895 + "/" + strM47893 + "/" + strM47896;
        } else {
            str = "NA/NA/NA";
        }
        int i2 = this.f67920;
        if (i2 == -1 || (i = this.f67914) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i2 + "/" + i;
        }
        return C22870.m50967(str, "/", str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21054.class == obj.getClass()) {
            C21054 c21054 = (C21054) obj;
            if (this.f67917 == c21054.f67917 && this.f67915 == c21054.f67915 && this.f67919 == c21054.f67919 && Arrays.equals(this.f67916, c21054.f67916) && this.f67920 == c21054.f67920 && this.f67914 == c21054.f67914) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f67918 == 0) {
            this.f67918 = ((((Arrays.hashCode(this.f67916) + ((((((this.f67917 + 527) * 31) + this.f67915) * 31) + this.f67919) * 31)) * 31) + this.f67920) * 31) + this.f67914;
        }
        return this.f67918;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m47895(this.f67917));
        sb.append(", ");
        sb.append(m47893(this.f67915));
        sb.append(", ");
        sb.append(m47896(this.f67919));
        sb.append(", ");
        sb.append(this.f67916 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f67920;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f67914;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return C9045.m23341(sb, str2, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
