package l;

/* JADX INFO: renamed from: l.ۚ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5662 extends AbstractC4251 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f17489;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21393 f17490;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f17491;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f17492;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC1428 f17493;

    public C5662(AbstractC1428 abstractC1428, C21393 c21393) {
        this.f17493 = abstractC1428;
        this.f17490 = c21393;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ܽ */
    public final long mo12801() {
        return this.f17491;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ۧ */
    public final void mo12800(long j) {
        this.f17491 = j;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ֫ */
    public final long mo12797() {
        return this.f17489;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ֫ */
    public final void mo12798(long j) {
        this.f17489 = j;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ᩳ */
    public final long mo12803() {
        return this.f17492;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ܽ */
    public final void mo12802(long j) {
        this.f17492 = j;
    }

    @Override // l.AbstractC4251
    /* JADX INFO: renamed from: ۧ */
    public final Object mo12799() {
        String string = this.f17490.toString();
        AbstractC1428 abstractC1428 = this.f17493;
        Object objMo4940 = abstractC1428.mo4940(string);
        abstractC1428.mo4938(this.f17491, objMo4940);
        abstractC1428.mo4935(this.f17489, objMo4940);
        abstractC1428.mo4941(this.f17492, objMo4940);
        return objMo4940;
    }
}
