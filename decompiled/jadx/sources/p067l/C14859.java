package p067l;

/* JADX INFO: renamed from: l.۬ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 65VW */
/* JADX INFO: loaded from: classes4.dex */
public final class C14859 extends AbstractC2770 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f42357;

    /* JADX INFO: renamed from: ᩹ */
    public final int f42358;

    public C14859(C14645 c14645, int i) {
        this.f42357 = c14645;
        this.f42358 = i;
    }

    @Override // p067l.InterfaceC16954
    public final String getString() {
        return this.f42357.m33508(this.f42358);
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f42358;
        if (i < 0 || i >= this.f42357.m33496()) {
            throw new C3544("string@" + i);
        }
    }
}
