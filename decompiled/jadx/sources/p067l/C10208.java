package p067l;

/* JADX INFO: renamed from: l.۠ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10208 extends AbstractC25102 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C16912 f28295;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C13561 f28296;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C9009 f28297;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10208(C16912 c16912, C13561 c13561, C13561 c13562, C9009 c9009) {
        super(c13561);
        this.f28295 = c16912;
        this.f28296 = c13562;
        this.f28297 = c9009;
    }

    @Override // p067l.AbstractC25102
    /* JADX INFO: renamed from: ֫ */
    public final void mo20836() {
        super.mo20836();
        String strM30861 = this.f28296.m30861();
        try {
            this.f28295.f50070[0] = this.f28297.m20845();
        } catch (Throwable th) {
            throw new C8001(C21466.m48631("ASM fail to generate .class file: ", strM30861), th);
        }
    }
}
