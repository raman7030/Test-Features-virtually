package l;

import com.google.android.material.motion.MotionUtils;
import java.util.List;

/* JADX INFO: renamed from: l.ܽۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16412 {
    public abstract boolean equals(Object obj);

    public abstract int hashCode();

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo5456();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16412 m38672(InterfaceC5471 interfaceC5471, C22016 c22016) {
        List listMo3565 = interfaceC5471.mo3565();
        int size = listMo3565.size() + 3;
        String[] strArr = new String[size];
        int i = 0;
        strArr[0] = MotionUtils.EASING_TYPE_FORMAT_START;
        int size2 = listMo3565.size();
        int i2 = 1;
        while (i < size2) {
            strArr[i2] = c22016.m49540(((CharSequence) listMo3565.get(i)).toString());
            i++;
            i2++;
        }
        strArr[i2] = MotionUtils.EASING_TYPE_FORMAT_END;
        strArr[i2 + 1] = c22016.m49540(interfaceC5471.mo3568());
        return new C1596(strArr, size);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC16412 m38673(InterfaceC18877 interfaceC18877, C22016 c22016) {
        return new C10769(c22016.m49540(interfaceC18877.getType()));
    }

    public final String toString() {
        throw new RuntimeException();
    }
}
