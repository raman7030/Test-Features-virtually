package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C20609 extends AbstractC10232 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparator[] f66327;

    public C20609(AbstractC10232 abstractC10232, Comparator comparator) {
        this.f66327 = new Comparator[]{abstractC10232, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f66327;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20609) {
            return Arrays.equals(this.f66327, ((C20609) obj).f66327);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66327);
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("Ordering.compound("), Arrays.toString(this.f66327), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
