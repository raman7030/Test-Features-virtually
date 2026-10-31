package l;

/* JADX INFO: renamed from: l.ܰۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13650 extends AbstractC2071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f40717;

    public C13650(int i) {
        this.f40717 = i;
    }

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final int mo6811() {
        int i = this.f40717;
        if (i < 64) {
            return i;
        }
        return 251;
    }

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final void mo6812(C16887 c16887) {
        super.mo6812(c16887);
        if (mo6811() == 251) {
            C14896 c14896 = c16887.f51838;
            int i = this.f40717;
            c14896.m35351(i);
            if (c16887.f51840) {
                System.out.print(" offset_delta=" + i);
            }
        }
    }
}
