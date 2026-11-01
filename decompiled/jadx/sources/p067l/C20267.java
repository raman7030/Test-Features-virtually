package p067l;

/* JADX INFO: renamed from: l.ᩴܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20267 extends AbstractC25102 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ String f62638;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ AbstractC25102 f62639;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ String f62640;

    public C20267(AbstractC25102 abstractC25102, String str, String str2) {
        this.f62639 = abstractC25102;
        this.f62640 = str;
        this.f62638 = str2;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17054 mo20834(int i, String str, String str2, String str3, String[] strArr) {
        if (!C3502.f7077.contains(str)) {
            return super.mo20834(i, str, str2, str3, strArr);
        }
        return new C6185(this, this.f62639.mo20834(10, C24420.m53894(new StringBuilder(), this.f62640, "$", str), str2, str3, strArr));
    }
}
