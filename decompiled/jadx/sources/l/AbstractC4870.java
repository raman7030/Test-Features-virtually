package l;

/* JADX INFO: renamed from: l.ۙ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7T3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4870 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f15391;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4870 f15392;

    public AbstractC4870(int i, AbstractC4870 abstractC4870) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C19370.m44628(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C9810.m24843(this);
        }
        this.f15391 = i;
        this.f15392 = abstractC4870;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo10594(String str, boolean z) {
        AbstractC4870 abstractC4870 = this.f15392;
        if (abstractC4870 != null) {
            return abstractC4870.mo10594(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC14104 mo10593(int i, C23214 c23214, String str, boolean z) {
        AbstractC4870 abstractC4870 = this.f15392;
        if (abstractC4870 != null) {
            return abstractC4870.mo10593(i, c23214, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10597(C16864 c16864) {
        AbstractC4870 abstractC4870 = this.f15392;
        if (abstractC4870 != null) {
            abstractC4870.mo10597(c16864);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10595() {
        AbstractC4870 abstractC4870 = this.f15392;
        if (abstractC4870 != null) {
            abstractC4870.mo10595();
        }
    }
}
