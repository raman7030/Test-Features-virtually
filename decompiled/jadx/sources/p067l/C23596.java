package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 7ARK */
/* JADX INFO: loaded from: classes.dex */
public class C23596 {

    /* JADX INFO: renamed from: ֫ */
    public final int f75116;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC18017 f75117;

    /* JADX INFO: renamed from: ܽ */
    public int f75118;

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC24266 f75119;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7289 f75120;

    public C23596(AbstractC24266 abstractC24266, int i, AbstractC18017 abstractC18017) {
        this(abstractC24266, i, abstractC18017, C4607.f10339);
    }

    public C23596(AbstractC24266 abstractC24266, int i, AbstractC18017 abstractC18017, AbstractC7289 abstractC7289) {
        this.f75119 = abstractC24266;
        this.f75116 = i;
        this.f75117 = abstractC18017;
        this.f75120 = abstractC7289;
    }

    public C23596(C23596 c23596, AbstractC24266 abstractC24266, AbstractC18017 abstractC18017, AbstractC7289 abstractC7289) {
        this.f75119 = abstractC24266;
        this.f75116 = c23596.f75116;
        this.f75117 = abstractC18017;
        this.f75120 = abstractC7289;
        this.f75118 = c23596.f75118;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23596) {
            return mo40444((C23596) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo40444(C23596 c23596) {
        if (this != c23596) {
            if (c23596 != null && this.f75119.f76895 == c23596.f75119.f76895 && this.f75116 == c23596.f75116 && C12826.equals(this.f75117, c23596.f75117) && this.f75120.equals(c23596.f75120)) {
                if (((this.f75118 & 1073741824) != 0) == ((c23596.f75118 & 1073741824) != 0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4358.m8999(C4358.m9000(C4358.m9000(C4358.m9002(C4358.m9002(7, this.f75119.f76895), this.f75116), this.f75117), this.f75120), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        sb.append(this.f75119);
        sb.append(",");
        sb.append(this.f75116);
        if (this.f75117 != null) {
            sb.append(",[");
            sb.append(this.f75117.toString());
            sb.append("]");
        }
        AbstractC7289 abstractC7289 = this.f75120;
        if (abstractC7289 != null && abstractC7289 != C4607.f10339) {
            sb.append(",");
            sb.append(abstractC7289);
        }
        if ((this.f75118 & (-1073741825)) > 0) {
            sb.append(",up=");
            sb.append(this.f75118 & (-1073741825));
        }
        sb.append(')');
        return sb.toString();
    }
}
