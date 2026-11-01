package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5T9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12891 {

    /* JADX INFO: renamed from: ֫ */
    public String f36251;

    /* JADX INFO: renamed from: ۧ */
    public String[] f36252;

    /* JADX INFO: renamed from: ܽ */
    public String f36253;

    public C12891(String str, String[] strArr) {
        this.f36252 = strArr;
        this.f36253 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String[] m29530() {
        return this.f36252;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m29531() {
        return this.f36253;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m29529() {
        if (this.f36251 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            String[] strArr = this.f36252;
            if (strArr != null) {
                for (String str : strArr) {
                    sb.append(str);
                }
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f36253);
            this.f36251 = sb.toString();
        }
        return this.f36251;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12891.class == obj.getClass()) {
            C12891 c12891 = (C12891) obj;
            String str = c12891.f36253;
            if (!Arrays.equals(this.f36252, c12891.f36252)) {
                return false;
            }
            String str2 = this.f36253;
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
        int iHashCode = Arrays.hashCode(this.f36252) * 31;
        String str = this.f36253;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
