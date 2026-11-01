package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: l.᩷ۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 13LV */
/* JADX INFO: loaded from: classes5.dex */
public final class C21955 extends AbstractC12093 implements Serializable {
    public static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final Comparator[] f69007;

    public C21955(AbstractC12093 abstractC12093, Comparator comparator) {
        this.f69007 = new Comparator[]{abstractC12093, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f69007;
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
        if (obj instanceof C21955) {
            return Arrays.equals(this.f69007, ((C21955) obj).f69007);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f69007);
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("Ordering.compound("), Arrays.toString(this.f69007), MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
