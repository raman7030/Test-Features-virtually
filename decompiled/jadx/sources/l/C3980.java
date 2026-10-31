package l;

/* JADX INFO: renamed from: l.ۘܰۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes3.dex */
public final class C3980 implements InterfaceC23125 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2569 f12625;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f12626;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11837 f12627;

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final int mo6200() {
        return -1;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ܽ */
    public final void mo6207(int i) {
    }

    public C3980(C11837 c11837, C2569 c2569) {
        this.f12627 = c11837;
        this.f12625 = c2569;
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final void mo6204() {
        int i = this.f12626 + 1;
        this.f12626 = i;
        if ((i & 1023) == 0) {
            this.f12625.m8120();
        }
        this.f12627.mo6204();
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ۧ */
    public final int mo6203(int i) {
        int i2 = this.f12626 + 1;
        this.f12626 = i2;
        if ((i2 & 1023) == 0) {
            this.f12625.m8120();
        }
        return this.f12627.mo6203(i);
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f12627.index();
    }

    @Override // l.InterfaceC14574
    /* JADX INFO: renamed from: ֫ */
    public final void mo6201(int i) {
        this.f12627.mo6201(i);
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f12627.size();
    }

    @Override // l.InterfaceC23125
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo12025(C14763 c14763) {
        return this.f12627.mo12025(c14763);
    }
}
