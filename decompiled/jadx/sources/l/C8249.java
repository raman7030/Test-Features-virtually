package l;

/* JADX INFO: renamed from: l.۠ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S50A */
/* JADX INFO: loaded from: classes3.dex */
public final class C8249 extends AbstractC23920 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15303 f25385;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11777 f25386;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6987 f25387;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8249(C15303 c15303, C11777 c11777, C11777 c11778, C6987 c6987) {
        super(c11777);
        this.f25385 = c15303;
        this.f25386 = c11778;
        this.f25387 = c6987;
    }

    @Override // l.AbstractC23920
    /* JADX INFO: renamed from: ֫ */
    public final void mo18882() {
        super.mo18882();
        String strM28813 = this.f25386.m28813();
        try {
            this.f25385.f46944[0] = this.f25387.m18891();
        } catch (Throwable th) {
            throw new C5927(C20094.m46315("ASM fail to generate .class file: ", strM28813), th);
        }
    }
}
