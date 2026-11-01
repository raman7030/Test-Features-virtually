package p067l;

/* JADX INFO: renamed from: l.ۙ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J7T3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6997 {

    /* JADX INFO: renamed from: ֫ */
    public final int f18222;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6997 f18223;

    public AbstractC6997(int i, AbstractC6997 abstractC6997) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            throw new IllegalArgumentException(C20778.m46922(i, "Unsupported api "));
        }
        if (i == 17432576) {
            C11692.m26858(this);
        }
        this.f18222 = i;
        this.f18223 = abstractC6997;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo12602(String str, boolean z) {
        AbstractC6997 abstractC6997 = this.f18223;
        if (abstractC6997 != null) {
            return abstractC6997.mo12602(str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC15773 mo12601(int i, C24431 c24431, String str, boolean z) {
        AbstractC6997 abstractC6997 = this.f18223;
        if (abstractC6997 != null) {
            return abstractC6997.mo12601(i, c24431, str, z);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12605(C18396 c18396) {
        AbstractC6997 abstractC6997 = this.f18223;
        if (abstractC6997 != null) {
            abstractC6997.mo12605(c18396);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12603() {
        AbstractC6997 abstractC6997 = this.f18223;
        if (abstractC6997 != null) {
            abstractC6997.mo12603();
        }
    }
}
