package p067l;

/* JADX INFO: renamed from: l.ۧᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBDP */
/* JADX INFO: loaded from: classes4.dex */
public final class C12980 implements InterfaceC3830 {

    /* JADX INFO: renamed from: ᩸ */
    public final int f36525;

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo7482() {
        return false;
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC3830 mo7483() {
        return this;
    }

    public C12980(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f36525 = i;
    }

    public final String toString() {
        return "<addr:" + C16351.m37153(this.f36525) + ">";
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return toString();
    }

    @Override // p067l.InterfaceC3830
    public final C9566 getType() {
        return C9566.f26334;
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ܿ */
    public final int mo7484() {
        return C9566.f26334.mo7484();
    }

    @Override // p067l.InterfaceC3830
    /* JADX INFO: renamed from: ᩷ */
    public final int mo7485() {
        return C9566.f26334.mo7485();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12980) {
            return this.f36525 == ((C12980) obj).f36525;
        }
        return false;
    }

    public final int hashCode() {
        return this.f36525;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29752() {
        return this.f36525;
    }
}
