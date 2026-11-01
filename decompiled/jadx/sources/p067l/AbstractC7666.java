package p067l;

/* JADX INFO: renamed from: l.ۚ᩶ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7666 extends AbstractC10348 {

    /* JADX INFO: renamed from: ۗ */
    public AbstractC10348[] f20109;

    @Override // p067l.AbstractC10348
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ֫ */
    public final void mo17750(AbstractC10348[] abstractC10348Arr) {
        this.f20109 = abstractC10348Arr;
    }

    public AbstractC7666(EnumC3642 enumC3642, AbstractC10348[] abstractC10348Arr) {
        super(enumC3642, EnumC3031.En);
        this.f20109 = abstractC10348Arr;
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC10348[] m17751() {
        int length = this.f20109.length;
        AbstractC10348[] abstractC10348Arr = new AbstractC10348[length];
        for (int i = 0; i < length; i++) {
            AbstractC10348 abstractC10348 = this.f20109[i];
            abstractC10348.getClass();
            abstractC10348Arr[i] = abstractC10348.clone();
        }
        return abstractC10348Arr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10348[] m17752(C3702 c3702) {
        int length = this.f20109.length;
        AbstractC10348[] abstractC10348Arr = new AbstractC10348[length];
        for (int i = 0; i < length; i++) {
            abstractC10348Arr[i] = this.f20109[i].mo8844(c3702);
        }
        return abstractC10348Arr;
    }

    @Override // p067l.AbstractC10348
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC10348[] mo17753() {
        return this.f20109;
    }
}
