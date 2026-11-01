package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17966 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo7686();

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17966 m40888(InterfaceC7568 interfaceC7568, C23292 c23292) {
        List listMo5852 = interfaceC7568.mo5852();
        int size = listMo5852.size() + 3;
        String[] strArr = new String[size];
        int i = 0;
        strArr[0] = MotionUtils.EASING_TYPE_FORMAT_START;
        int size2 = listMo5852.size();
        int i2 = 1;
        while (i < size2) {
            strArr[i2] = c23292.m51876(((CharSequence) listMo5852.get(i)).toString());
            i++;
            i2++;
        }
        strArr[i2] = MotionUtils.EASING_TYPE_FORMAT_END;
        strArr[i2 + 1] = c23292.m51876(interfaceC7568.mo5855());
        return new C3885(strArr, size);
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17966 m40889(InterfaceC20309 interfaceC20309, C23292 c23292) {
        return new C12603(c23292.m51876(interfaceC20309.getType()));
    }

    public final String toString() {
        throw new RuntimeException();
    }
}
