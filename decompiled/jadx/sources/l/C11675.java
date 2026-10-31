package l;

/* JADX INFO: renamed from: l.ۨۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47NE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11675 implements InterfaceC18882 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34785 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17651 f34786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f34787;

    public C11675(C17651 c17651, int i) {
        this.f34786 = c17651;
        this.f34787 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28560() {
        C22632.m50631(this.f34785 == -1);
        this.f34785 = this.f34786.m41357(this.f34787);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28561() {
        if (this.f34785 != -1) {
            this.f34786.m41377(this.f34787);
            this.f34785 = -1;
        }
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6412() {
        if (this.f34785 != -3) {
            return m28559() && this.f34786.m41371(this.f34785);
        }
        return true;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final void mo6411() throws C7068 {
        int i = this.f34785;
        C17651 c17651 = this.f34786;
        if (i == -2) {
            throw new C7068(C4860.m14172("Unable to bind a sample queue to TrackGroup with MIME type ", c17651.m41379().m17102(this.f34787).m32295(0).f25614, "."));
        }
        if (i == -1) {
            c17651.m41373();
        } else if (i != -3) {
            c17651.m41374(i);
        }
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6410(C3002 c3002, C21843 c21843, int i) {
        if (this.f34785 == -3) {
            c21843.m12691(4);
            return -4;
        }
        if (m28559()) {
            return this.f34786.m41359(this.f34785, c3002, c21843, i);
        }
        return -3;
    }

    @Override // l.InterfaceC18882
    /* JADX INFO: renamed from: ֫ */
    public final int mo6409(long j) {
        if (m28559()) {
            return this.f34786.m41358(this.f34785, j);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m28559() {
        int i = this.f34785;
        return (i == -1 || i == -3 || i == -2) ? false : true;
    }
}
