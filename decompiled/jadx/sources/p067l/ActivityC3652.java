package p067l;

/* JADX INFO: renamed from: l.֨᩶ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8APP */
/* JADX INFO: loaded from: classes3.dex */
public class ActivityC3652 extends AbstractActivityC3102 {

    /* JADX INFO: renamed from: ᩴۧ */
    public AbstractC17043 f7671;

    /* JADX INFO: renamed from: ᩵ۧ */
    public String f7672;

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫֫ */
    public final String mo5273() {
        return ".mtd";
    }

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "DictionaryEditor";
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ᩳ֫ */
    public final boolean mo5282() {
        try {
            int i = C18524.f55316;
            AbstractC17043 abstractC17043M42105 = C18524.m42105(getIntent());
            this.f7671 = abstractC17043M42105;
            this.f7672 = abstractC17043M42105.m38675();
            return true;
        } catch (Exception e) {
            m12260((Throwable) e, true);
            return false;
        }
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ֫ */
    public final String mo5280() {
        return this.f7672;
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ᩺ */
    public final String mo5284() {
        return this.f7671.mo25505();
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ۨ */
    public final String mo5276() {
        return this.f7671.getName();
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܿ֫ */
    public final String mo5281() {
        return this.f7671.m38647();
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ܽ */
    public final void mo5279(String str) throws C6496 {
        C21249.m47998((CharSequence) str);
        this.f7671.m38668(str);
    }

    @Override // p067l.AbstractActivityC3102
    /* JADX INFO: renamed from: ֫ */
    public final void mo5272(Exception exc) {
        if (exc instanceof C6496) {
            this.f5639.m32436(((C6496) exc).m14914() - 1);
        }
    }
}
