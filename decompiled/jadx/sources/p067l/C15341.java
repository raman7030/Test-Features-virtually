package p067l;

/* JADX INFO: renamed from: l.ܰۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15341 extends AbstractC4337 {

    /* JADX INFO: renamed from: ֫ */
    public final int f43798;

    public C15341(int i) {
        this.f43798 = i;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final int mo8937() {
        int i = this.f43798;
        if (i < 64) {
            return i;
        }
        return 251;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final void mo8938(C18418 c18418) {
        super.mo8938(c18418);
        if (mo8937() == 251) {
            C16525 c16525 = c18418.f55019;
            int i = this.f43798;
            c16525.m37503(i);
            if (c18418.f55021) {
                System.out.print(" offset_delta=" + i);
            }
        }
    }
}
