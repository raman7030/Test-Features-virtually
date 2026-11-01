package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: l.᩷ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KP */
/* JADX INFO: loaded from: classes4.dex */
public final class C22378 {

    /* JADX INFO: renamed from: ۜ */
    public static final C22378 f70597;

    /* JADX INFO: renamed from: ֫ */
    public final int f70598;

    /* JADX INFO: renamed from: ۧ */
    public final int f70599;

    /* JADX INFO: renamed from: ܳ */
    public final byte[] f70600;

    /* JADX INFO: renamed from: ܽ */
    public final int f70601;

    /* JADX INFO: renamed from: ܿ */
    public int f70602;

    /* JADX INFO: renamed from: ᩳ */
    public final int f70603;

    /* JADX INFO: renamed from: ᩻ */
    public final int f70604;

    /* JADX INFO: renamed from: ֫ */
    public static String m50223(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? C20778.m46922(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m50225(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? C20778.m46922(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m50226(int i) {
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
            return i != 7 ? C20778.m46922(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    @Pure
    /* JADX INFO: renamed from: ܿ */
    public static int m50227(int i) {
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
    /* JADX INFO: renamed from: ᩳ */
    public static int m50228(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    static {
        C8966 c8966 = new C8966();
        c8966.m20709(1);
        c8966.m20708(2);
        c8966.m20711(3);
        f70597 = c8966.m20705();
        C8966 c8967 = new C8966();
        c8967.m20709(1);
        c8967.m20708(1);
        c8967.m20711(2);
        c8967.m20705();
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
        C5792.m13032(3);
        C5792.m13032(4);
        C5792.m13032(5);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = false)
    /* JADX INFO: renamed from: ֫ */
    public static boolean m50224(C22378 c22378) {
        if (c22378 == null) {
            return true;
        }
        int i = c22378.f70601;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c22378.f70599;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c22378.f70603;
        if ((i3 != -1 && i3 != 3) || c22378.f70600 != null) {
            return false;
        }
        int i4 = c22378.f70598;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c22378.f70604;
        return i5 == -1 || i5 == 8;
    }

    public C22378(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f70601 = i;
        this.f70599 = i2;
        this.f70603 = i3;
        this.f70600 = bArr;
        this.f70604 = i4;
        this.f70598 = i5;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8966 m50229() {
        return new C8966(this);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m50230() {
        return (this.f70601 == -1 || this.f70599 == -1 || this.f70603 == -1) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m50231() {
        String str;
        String str2;
        int i;
        if (m50230()) {
            String strM50225 = m50225(this.f70601);
            String strM50223 = m50223(this.f70599);
            String strM50226 = m50226(this.f70603);
            Locale locale = Locale.US;
            str = strM50225 + "/" + strM50223 + "/" + strM50226;
        } else {
            str = "NA/NA/NA";
        }
        int i2 = this.f70604;
        if (i2 == -1 || (i = this.f70598) == -1) {
            str2 = "NA/NA";
        } else {
            str2 = i2 + "/" + i;
        }
        return C24104.m53357(str, "/", str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22378.class == obj.getClass()) {
            C22378 c22378 = (C22378) obj;
            if (this.f70601 == c22378.f70601 && this.f70599 == c22378.f70599 && this.f70603 == c22378.f70603 && Arrays.equals(this.f70600, c22378.f70600) && this.f70604 == c22378.f70604 && this.f70598 == c22378.f70598) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f70602 == 0) {
            this.f70602 = ((((Arrays.hashCode(this.f70600) + ((((((this.f70601 + 527) * 31) + this.f70599) * 31) + this.f70603) * 31)) * 31) + this.f70604) * 31) + this.f70598;
        }
        return this.f70602;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(m50225(this.f70601));
        sb.append(", ");
        sb.append(m50223(this.f70599));
        sb.append(", ");
        sb.append(m50226(this.f70603));
        sb.append(", ");
        sb.append(this.f70600 != null);
        sb.append(", ");
        String str2 = "NA";
        int i = this.f70604;
        if (i != -1) {
            str = i + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i2 = this.f70598;
        if (i2 != -1) {
            str2 = i2 + "bit Chroma";
        }
        return C10965.m25286(sb, str2, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
