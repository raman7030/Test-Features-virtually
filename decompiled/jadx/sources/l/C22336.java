package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ARK */
/* JADX INFO: loaded from: classes.dex */
public class C22336 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f72390;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16466 f72391;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f72392;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC23041 f72393;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC5178 f72394;

    public C22336(AbstractC23041 abstractC23041, int i, AbstractC16466 abstractC16466) {
        this(abstractC23041, i, abstractC16466, C2356.f7548);
    }

    public C22336(AbstractC23041 abstractC23041, int i, AbstractC16466 abstractC16466, AbstractC5178 abstractC5178) {
        this.f72393 = abstractC23041;
        this.f72390 = i;
        this.f72391 = abstractC16466;
        this.f72394 = abstractC5178;
    }

    public C22336(C22336 c22336, AbstractC23041 abstractC23041, AbstractC16466 abstractC16466, AbstractC5178 abstractC5178) {
        this.f72393 = abstractC23041;
        this.f72390 = c22336.f72390;
        this.f72391 = abstractC16466;
        this.f72394 = abstractC5178;
        this.f72392 = c22336.f72392;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22336) {
            return mo38230((C22336) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo38230(C22336 c22336) {
        if (this != c22336) {
            if (c22336 != null && this.f72393.f74153 == c22336.f72393.f74153 && this.f72390 == c22336.f72390 && C11003.equals(this.f72391, c22336.f72391) && this.f72394.equals(c22336.f72394)) {
                if (((this.f72392 & 1073741824) != 0) == ((c22336.f72392 & 1073741824) != 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2093.m6873(C2093.m6874(C2093.m6874(C2093.m6876(C2093.m6876(7, this.f72393.f74153), this.f72390), this.f72391), this.f72394), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f72393);
        sb.append(",");
        sb.append(this.f72390);
        if (this.f72391 != null) {
            sb.append(",[");
            sb.append(this.f72391.toString());
            sb.append("]");
        }
        AbstractC5178 abstractC5178 = this.f72394;
        if (abstractC5178 != null && abstractC5178 != C2356.f7548) {
            sb.append(",");
            sb.append(abstractC5178);
        }
        if ((this.f72392 & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.f72392 & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
