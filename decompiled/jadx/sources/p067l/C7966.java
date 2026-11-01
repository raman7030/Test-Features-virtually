package p067l;

/* JADX INFO: renamed from: l.ۛۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7966 extends AbstractC4337 {

    /* JADX INFO: renamed from: ֫ */
    public final int f20940;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462[] f20941;

    /* JADX INFO: renamed from: ܽ */
    public final int f20942;

    public C7966(int i, int i2, AbstractC6462[] abstractC6462Arr) {
        this.f20940 = i;
        this.f20942 = i2;
        this.f20941 = abstractC6462Arr;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final int mo8937() {
        return this.f20940;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final void mo8938(C18418 c18418) {
        super.mo8938(c18418);
        C16525 c16525 = c18418.f55019;
        int i = this.f20942;
        c16525.m37503(i);
        if (c18418.f55021) {
            System.out.print(" offset_delta=" + i);
        }
        int i2 = 0;
        while (true) {
            AbstractC6462[] abstractC6462Arr = this.f20941;
            if (i2 >= abstractC6462Arr.length) {
                return;
            }
            if (c18418.f55021) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c18418.m41952(abstractC6462Arr[i2]);
            i2++;
        }
    }
}
