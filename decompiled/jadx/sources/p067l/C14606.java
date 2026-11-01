package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۬ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P4QJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14606 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f41694;

    /* JADX INFO: renamed from: ۙ */
    public String f41695;

    /* JADX INFO: renamed from: ۤ */
    public C13266 f41696;

    /* JADX INFO: renamed from: ۫ */
    public C23994 f41697;

    /* JADX INFO: renamed from: ۬ */
    public C15276 f41698;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 12;
    }

    public C14606(C5651 c5651) {
        super(c5651);
        this.f41694 = 0;
        this.f41695 = null;
    }

    public C14606(C5651 c5651, C23994 c23994, C15276 c15276) {
        this(c5651);
        String strM53167 = c23994.m53167();
        if (c15276 != null) {
            StringBuilder sbM17248 = C7470.m17248(strM53167);
            StringBuilder sb = new StringBuilder();
            for (C23994 c23995 : c15276.f43597) {
                sb.append(c23995.m53167());
            }
            sbM17248.append(sb.toString());
            strM53167 = sbM17248.toString();
        }
        this.f41696 = C13266.m30314(strM53167, c5651);
        this.f41697 = c23994;
        this.f41698 = c15276;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14606 m33395(C5651 c5651, C23994 c23994, C15276 c15276) {
        return (C14606) c5651.f13732.m27254(new C14606(c5651, c23994, c15276));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14606 m33397(C5651 c5651) {
        C23994 c23994M53164 = C23994.m53164(this.f41697.m53168(), c5651);
        C15276 c15276 = this.f41698;
        return (C14606) c5651.f13732.m27254(new C14606(c5651, c23994M53164, c15276 != null ? c15276.m34778(c5651) : null));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        C5651 c5651 = this.f18865;
        this.f41696 = (C13266) c5651.f13748.m3722(c12556.m28944());
        this.f41697 = (C23994) c5651.f13727.m3722(c12556.m28944());
        this.f41698 = (C15276) c13936.m31713(EnumC16617.TYPE_TYPE_LIST, c12556.m28944());
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f41696.f18866);
        c3838.m7531(this.f41697.f18866);
        C15276 c15276 = this.f41698;
        c3838.m7531(c15276 == null ? 0 : c15276.f18864);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C14606 c14606) {
        int iCompareTo = this.f41697.compareTo(c14606.f41697);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        C15276 c15276 = this.f41698;
        if (c15276 == null) {
            return c14606.f41698 == null ? 0 : -1;
        }
        C15276 c15277 = c14606.f41698;
        if (c15277 == null) {
            return 1;
        }
        return c15276.compareTo(c15277);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "proto_id_item: " + m33398();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m33398() {
        if (this.f41695 == null) {
            StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
            C15276 c15276 = this.f41698;
            if (c15276 != null) {
                sb.append(c15276.m34777(""));
            }
            sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
            sb.append(this.f41697.m53168());
            this.f41695 = sb.toString();
        }
        return this.f41695;
    }

    public final int hashCode() {
        if (this.f41694 == 0) {
            int iHashCode = this.f41697.hashCode();
            this.f41694 = iHashCode;
            int i = iHashCode * 31;
            C15276 c15276 = this.f41698;
            this.f41694 = i + (c15276 == null ? 0 : c15276.hashCode());
        }
        return this.f41694;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14606.class.equals(obj.getClass())) {
            C14606 c14606 = (C14606) obj;
            if (this.f41697 == c14606.f41697 && this.f41698 == c14606.f41698) {
                return true;
            }
        }
        return false;
    }
}
