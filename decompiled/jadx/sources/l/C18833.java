package l;

/* JADX INFO: renamed from: l.ᩴܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes5.dex */
public final class C18833 extends AbstractC23920 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59410;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC23920 f59411;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59412;

    public C18833(AbstractC23920 abstractC23920, String str, String str2) {
        this.f59411 = abstractC23920;
        this.f59412 = str;
        this.f59410 = str2;
    }

    @Override // l.AbstractC23920
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC15452 mo18880(int i, String str, String str2, String str3, String[] strArr) {
        if (!C1193.f4308.contains(str)) {
            return super.mo18880(i, str, str2, str3, strArr);
        }
        return new C4016(this, this.f59411.mo18880(10, C23202.m51498(new StringBuilder(), this.f59412, "$", str), str2, str3, strArr));
    }
}
