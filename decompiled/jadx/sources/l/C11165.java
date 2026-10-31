package l;

/* JADX INFO: renamed from: l.ۧᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BBDP */
/* JADX INFO: loaded from: classes4.dex */
public final class C11165 implements InterfaceC1538 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33525;

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ۡ */
    public final boolean mo5253() {
        return false;
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC1538 mo5254() {
        return this;
    }

    public C11165(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("subroutineAddress < 0");
        }
        this.f33525 = i;
    }

    public final String toString() {
        return "<addr:" + C14712.m35006(this.f33525) + ">";
    }

    @Override // l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return toString();
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23422;
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ܿ */
    public final int mo5255() {
        return C7573.f23422.mo5255();
    }

    @Override // l.InterfaceC1538
    /* JADX INFO: renamed from: ᩷ */
    public final int mo5256() {
        return C7573.f23422.mo5256();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11165) {
            return this.f33525 == ((C11165) obj).f33525;
        }
        return false;
    }

    public final int hashCode() {
        return this.f33525;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27690() {
        return this.f33525;
    }
}
