package l;

/* JADX INFO: renamed from: l.֨᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1430 extends AbstractC5664 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f5125;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17356[] f5126;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f5127;

    public AbstractC1430() {
        super(0);
        this.f5126 = null;
        this.f5125 = 0;
    }

    public AbstractC1430(AbstractC1430 abstractC1430) {
        super(0);
        this.f5126 = null;
        this.f5125 = 0;
        this.f5127 = abstractC1430.f5127;
        this.f5126 = C14533.m34680(abstractC1430.f5126);
    }

    public String getPathName() {
        return this.f5127;
    }

    public C17356[] getPathData() {
        return this.f5126;
    }

    public void setPathData(C17356[] c17356Arr) {
        if (!C14533.m34677(this.f5126, c17356Arr)) {
            this.f5126 = C14533.m34680(c17356Arr);
        } else {
            C14533.m34682(this.f5126, c17356Arr);
        }
    }
}
