package l;

/* JADX INFO: renamed from: l.֨᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8APP */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC1350 extends AbstractActivityC0772 {

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f4901;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public String f4902;

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo2944() {
        return ".mtd";
    }

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "DictionaryEditor";
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo2953() {
        try {
            int i = C16999.f52136;
            AbstractC15440 abstractC15440M39862 = C16999.m39862(getIntent());
            this.f4901 = abstractC15440M39862;
            this.f4902 = abstractC15440M39862.m36517();
            return true;
        } catch (Exception e) {
            m10224((Throwable) e, true);
            return false;
        }
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo2951() {
        return this.f4902;
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ᩺ */
    public final String mo2955() {
        return this.f4901.mo23554();
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ۨ */
    public final String mo2947() {
        return this.f4901.getName();
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo2952() {
        return this.f4901.m36489();
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ܽ */
    public final void mo2950(String str) throws C4343 {
        C19866.m45687((CharSequence) str);
        this.f4901.m36510(str);
    }

    @Override // l.AbstractActivityC0772
    /* JADX INFO: renamed from: ֫ */
    public final void mo2943(Exception exc) {
        if (exc instanceof C4343) {
            this.f2867.m30372(((C4343) exc).m13050() - 1);
        }
    }
}
