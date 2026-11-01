package p067l;

/* JADX INFO: renamed from: l.ۗۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes2.dex */
public final class C5406 {

    /* JADX INFO: renamed from: ֫ */
    public int f12876;

    /* JADX INFO: renamed from: ۧ */
    public long f12877;

    /* JADX INFO: renamed from: ܽ */
    public int f12878;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C14793 f12879;

    /* JADX INFO: renamed from: ᩳ */
    public int f12880;

    public C5406(C14793 c14793, int i, int i2, long j, int i3) {
        this.f12879 = c14793;
        this.f12878 = i;
        this.f12876 = i2;
        this.f12877 = j;
        this.f12880 = i3;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m11871() {
        return this.f12877 < this.f12879.f42196;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m11872() {
        if (!m11871()) {
            throw new IndexOutOfBoundsException("Recipe cursor exhausted");
        }
        return this.f12880;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m11870() {
        if (m11871()) {
            long j = this.f12877 + 1;
            this.f12877 = j;
            C14793 c14793 = this.f12879;
            if (j >= c14793.f42196) {
                return;
            }
            AbstractC12979 abstractC12979 = c14793.f42194[this.f12878];
            int i = this.f12876 + 1;
            this.f12876 = i;
            if (i < abstractC12979.mo23868()) {
                this.f12880 = abstractC12979.mo23866(this.f12880);
                return;
            }
            this.f12878++;
            this.f12876 = 0;
            this.f12880 = c14793.f42194[this.f12878].mo23869(0);
        }
    }
}
