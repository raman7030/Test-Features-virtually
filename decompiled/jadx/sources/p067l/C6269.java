package p067l;

/* JADX INFO: renamed from: l.ۘᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes3.dex */
public final class C6269 extends C13956 {

    /* JADX INFO: renamed from: ܳ֫ */
    public final /* synthetic */ boolean f15861;

    /* JADX INFO: renamed from: ܽ֫ */
    public AbstractC6462 f15862;

    /* JADX INFO: renamed from: ܿ֫ */
    public final /* synthetic */ C4036 f15863;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ AbstractC7610 f15864;

    /* JADX INFO: renamed from: ᩻֫ */
    public final /* synthetic */ AbstractC14355 f15865;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6269(AbstractC7610 abstractC7610, AbstractC6462 abstractC6462, AbstractC21195 abstractC21195, C4036 c4036, boolean z, AbstractC14355 abstractC14355) {
        super(abstractC6462, abstractC21195);
        this.f15864 = abstractC7610;
        this.f15863 = c4036;
        this.f15861 = z;
        this.f15865 = abstractC14355;
    }

    @Override // p067l.AbstractC6462
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC6462 mo14235() {
        if (this.f15862 == null) {
            C2915 c2915 = new C2915(this.f15864, this.f15863.f8851.f7510, mo14811(), this.f15861);
            this.f15865.mo3382(c2915);
            this.f15862 = c2915.f5045;
        }
        return this.f15862;
    }
}
