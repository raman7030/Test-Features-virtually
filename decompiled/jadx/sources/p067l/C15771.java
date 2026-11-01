package p067l;

/* JADX INFO: renamed from: l.ܰ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15771 extends AbstractC21078 {

    /* JADX INFO: renamed from: ۤ */
    public String f45664;

    /* JADX INFO: renamed from: ۫ */
    public String f45665;

    /* JADX INFO: renamed from: ۬ */
    public String f45666;

    public C15771(AbstractC10348 abstractC10348, String str, String str2, String str3) {
        super(EnumC3642.FIELD, abstractC10348);
        this.f45664 = str3;
        this.f45666 = str2;
        this.f45665 = str;
    }

    @Override // p067l.AbstractC21078, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        AbstractC10348 abstractC10348 = this.f66218;
        abstractC10348.getClass();
        return new C15771(abstractC10348.clone(), this.f45665, this.f45666, this.f45664);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C15771(this.f66218.mo8844(c3702), this.f45665, this.f45666, this.f45664);
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        return this.f66218 + "." + this.f45666;
    }
}
