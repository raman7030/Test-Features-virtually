package p067l;

/* JADX INFO: renamed from: l.֨᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5V7 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3728 extends AbstractC7752 {

    /* JADX INFO: renamed from: ֫ */
    public int f7898;

    /* JADX INFO: renamed from: ۧ */
    public C1703[] f7899;

    /* JADX INFO: renamed from: ܽ */
    public String f7900;

    public AbstractC3728() {
        super(0);
        this.f7899 = null;
        this.f7898 = 0;
    }

    public AbstractC3728(AbstractC3728 abstractC3728) {
        super(0);
        this.f7899 = null;
        this.f7898 = 0;
        this.f7900 = abstractC3728.f7900;
        this.f7899 = C1563.m36823(abstractC3728.f7899);
    }

    public String getPathName() {
        return this.f7900;
    }

    public C1703[] getPathData() {
        return this.f7899;
    }

    public void setPathData(C1703[] c1703Arr) {
        if (!C1563.m36820(this.f7899, c1703Arr)) {
            this.f7899 = C1563.m36823(c1703Arr);
        } else {
            C1563.m36825(this.f7899, c1703Arr);
        }
    }
}
