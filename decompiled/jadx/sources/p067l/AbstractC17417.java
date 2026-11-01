package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBG4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17417 implements InterfaceC2940 {

    /* JADX INFO: renamed from: ۙ */
    public final C21442 f52067;

    /* JADX INFO: renamed from: ᩶ */
    public final C22783 f52068;

    /* JADX INFO: renamed from: ᩸ */
    public final C5348 f52069;

    /* JADX INFO: renamed from: ᩹ */
    public final C12054 f52070;

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC17417 mo5816(C9566 c9566);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC17417 mo5817(C22783 c22783, C21442 c21442);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5818(InterfaceC10713 interfaceC10713);

    /* JADX INFO: renamed from: ۘ */
    public AbstractC17417 mo5819() {
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract InterfaceC12548 mo5820();

    /* JADX INFO: renamed from: ᩳ */
    public String mo13526() {
        return null;
    }

    public AbstractC17417(C5348 c5348, C12054 c12054, C22783 c22783, C21442 c21442) {
        if (c5348 == null) {
            throw new NullPointerException("opcode == null");
        }
        if (c12054 == null) {
            throw new NullPointerException("position == null");
        }
        if (c21442 == null) {
            throw new NullPointerException("sources == null");
        }
        this.f52069 = c5348;
        this.f52070 = c12054;
        this.f52068 = c22783;
        this.f52067 = c21442;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        String strMo13526 = mo13526();
        StringBuilder sbM34407 = C15033.m34407(80, "Insn{");
        sbM34407.append(this.f52070);
        sbM34407.append(' ');
        sbM34407.append(this.f52069);
        if (strMo13526 != null) {
            sbM34407.append(' ');
            sbM34407.append(strMo13526);
        }
        sbM34407.append(" :: ");
        C22783 c22783 = this.f52068;
        if (c22783 != null) {
            sbM34407.append(c22783);
            sbM34407.append(" <- ");
        }
        sbM34407.append(this.f52067);
        sbM34407.append('}');
        return sbM34407.toString();
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        String strMo13526 = mo13526();
        StringBuilder sb = new StringBuilder(80);
        sb.append(this.f52070);
        sb.append(": ");
        sb.append(this.f52069.m11603());
        if (strMo13526 != null) {
            C21545.m48729(sb, MotionUtils.EASING_TYPE_FORMAT_START, strMo13526, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        C22783 c22783 = this.f52068;
        if (c22783 == null) {
            sb.append(" .");
        } else {
            sb.append(" ");
            sb.append(c22783.mo4819());
        }
        sb.append(" <-");
        C21442 c21442 = this.f52067;
        int size = c21442.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(" ");
                sb.append(c21442.m56524get(i).mo4819());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C5348 m39656() {
        return this.f52069;
    }

    /* JADX INFO: renamed from: ۜ */
    public final C12054 m39652() {
        return this.f52070;
    }

    /* JADX INFO: renamed from: ܺ */
    public final C22783 m39655() {
        return this.f52068;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C22783 m39654() {
        C22783 c22783M56524get;
        if (this.f52069.m11605() == 54) {
            c22783M56524get = this.f52067.m56524get(0);
        } else {
            c22783M56524get = this.f52068;
        }
        if (c22783M56524get == null || c22783M56524get.m50990() == null) {
            return null;
        }
        return c22783M56524get;
    }

    /* JADX INFO: renamed from: ۖ */
    public final C21442 m39651() {
        return this.f52067;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39653() {
        return this.f52069.m11599();
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo18607(AbstractC17417 abstractC17417) {
        Object obj;
        C22783 c22783;
        if (this.f52069 != abstractC17417.f52069 || !this.f52070.equals(abstractC17417.f52070) || getClass() != abstractC17417.getClass() || ((c22783 = this.f52068) != (obj = abstractC17417.f52068) && (c22783 == null || !c22783.equals(obj)))) {
            return false;
        }
        Object obj2 = abstractC17417.f52067;
        C21442 c21442 = this.f52067;
        if (c21442 != obj2 && (c21442 == null || !c21442.equals(obj2))) {
            return false;
        }
        InterfaceC12548 interfaceC12548Mo5820 = mo5820();
        InterfaceC12548 interfaceC12548Mo5821 = abstractC17417.mo5820();
        C15600 c15600 = C15600.f44675;
        int size = interfaceC12548Mo5820.size();
        if (interfaceC12548Mo5821.size() == size) {
            for (int i = 0; i < size; i++) {
                if (interfaceC12548Mo5820.getType(i).equals(interfaceC12548Mo5821.getType(i))) {
                }
            }
            return true;
        }
        return false;
    }
}
