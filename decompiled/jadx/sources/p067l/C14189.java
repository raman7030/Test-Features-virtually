package p067l;

/* JADX INFO: renamed from: l.۫ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D5ZX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14189 extends AbstractC7465 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f40449;

    /* JADX INFO: renamed from: ᩹ */
    public final int f40450;

    public C14189(C14645 c14645, int i) {
        this.f40449 = c14645;
        this.f40450 = i;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return this.f40449.m33487(this.f40450);
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f40450;
        if (i < 0 || i >= this.f40449.m33482()) {
            throw new C3544("type@" + i);
        }
    }
}
