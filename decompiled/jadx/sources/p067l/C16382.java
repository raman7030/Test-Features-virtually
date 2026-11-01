package p067l;

/* JADX INFO: renamed from: l.ܳ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 157Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C16382 extends AbstractC7666 {

    /* JADX INFO: renamed from: ۫ */
    public int f48138;

    /* JADX INFO: renamed from: ۬ */
    public String f48139;

    public C16382(String str, int i, AbstractC10348[] abstractC10348Arr) {
        super(EnumC3642.NEW_MUTI_ARRAY, abstractC10348Arr);
        this.f48139 = str;
        this.f48138 = i;
    }

    @Override // p067l.AbstractC7666, p067l.AbstractC10348
    public final AbstractC10348 clone() {
        return new C16382(this.f48139, this.f48138, m17751());
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10348 mo8844(C3702 c3702) {
        return new C16382(this.f48139, this.f48138, m17752(c3702));
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܳ */
    public final String mo8845() {
        StringBuilder sb = new StringBuilder("new ");
        sb.append(C2805.m4425(this.f48139));
        for (AbstractC10348 abstractC10348 : this.f20109) {
            sb.append('[');
            sb.append(abstractC10348);
            sb.append(']');
        }
        for (int length = this.f20109.length; length < this.f48138; length++) {
            sb.append("[]");
        }
        return sb.toString();
    }
}
