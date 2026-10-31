package l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11072 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f33249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String[] f33250;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f33251;

    public C11072(String str, String[] strArr) {
        this.f33250 = strArr;
        this.f33251 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] m27468() {
        return this.f33250;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m27469() {
        return this.f33251;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27467() {
        if (this.f33249 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String[] strArr = this.f33250;
            if (strArr != null) {
                for (String str : strArr) {
                    sb.append(str);
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f33251);
            this.f33249 = sb.toString();
        }
        return this.f33249;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C11072.class == obj.getClass()) {
            C11072 c11072 = (C11072) obj;
            String str = c11072.f33251;
            if (!Arrays.equals(this.f33250, c11072.f33250)) {
                return false;
            }
            String str2 = this.f33251;
            if (str2 != null) {
                return str2.equals(str);
            }
            if (str == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f33250) * 31;
        String str = this.f33251;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
