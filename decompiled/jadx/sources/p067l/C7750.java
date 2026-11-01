package p067l;

/* JADX INFO: renamed from: l.ۚ᩺ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 07T7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7750 extends AbstractC6409 {

    /* JADX INFO: renamed from: ֫ */
    public long f20336;

    /* JADX INFO: renamed from: ۧ */
    public final C22700 f20337;

    /* JADX INFO: renamed from: ܽ */
    public long f20338;

    /* JADX INFO: renamed from: ܿ */
    public long f20339;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ AbstractC3726 f20340;

    public C7750(AbstractC3726 abstractC3726, C22700 c22700) {
        this.f20340 = abstractC3726;
        this.f20337 = c22700;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ܽ */
    public final long mo14681() {
        return this.f20338;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ۧ */
    public final void mo14680(long j) {
        this.f20338 = j;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ֫ */
    public final long mo14677() {
        return this.f20336;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ֫ */
    public final void mo14678(long j) {
        this.f20336 = j;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ᩳ */
    public final long mo14683() {
        return this.f20339;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ܽ */
    public final void mo14682(long j) {
        this.f20339 = j;
    }

    @Override // p067l.AbstractC6409
    /* JADX INFO: renamed from: ۧ */
    public final Object mo14679() {
        String string = this.f20337.toString();
        AbstractC3726 abstractC3726 = this.f20340;
        Object objMo7183 = abstractC3726.mo7183(string);
        abstractC3726.mo7181(this.f20338, objMo7183);
        abstractC3726.mo7178(this.f20336, objMo7183);
        abstractC3726.mo7184(this.f20339, objMo7183);
        return objMo7183;
    }
}
