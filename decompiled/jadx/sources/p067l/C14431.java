package p067l;

/* JADX INFO: renamed from: l.۫᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y50P */
/* JADX INFO: loaded from: classes4.dex */
public final class C14431 extends AbstractC2971 {

    /* JADX INFO: renamed from: ۫ */
    public String f41239;

    public C14431() {
        super(EnumC3642.ARRAY, null, null);
    }

    public C14431(AbstractC10348 abstractC10348, AbstractC10348 abstractC10349, String str) {
        super(EnumC3642.ARRAY, abstractC10348, abstractC10349);
        this.f41239 = str;
    }

    @Override // p067l.AbstractC2971, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f5200;
        abstractC10348.getClass();
        AbstractC10348 abstractC10348Clone = abstractC10348.clone();
        AbstractC10348 abstractC10349 = this.f5201;
        abstractC10349.getClass();
        return new C14431(abstractC10348Clone, abstractC10349.clone(), this.f41239);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C14431(this.f5200.mo8844(c3702), this.f5201.mo8844(c3702), this.f41239);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return this.f5200 + "[" + this.f5201 + "]";
    }
}
