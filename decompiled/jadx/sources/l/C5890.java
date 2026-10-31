package l;

/* JADX INFO: renamed from: l.ۛۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5890 extends AbstractC2071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18085;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308[] f18086;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f18087;

    public C5890(int i, int i2, AbstractC4308[] abstractC4308Arr) {
        this.f18085 = i;
        this.f18087 = i2;
        this.f18086 = abstractC4308Arr;
    }

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final int mo6811() {
        return this.f18085;
    }

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final void mo6812(C16887 c16887) {
        super.mo6812(c16887);
        C14896 c14896 = c16887.f51838;
        int i = this.f18087;
        c14896.m35351(i);
        if (c16887.f51840) {
            System.out.print(" offset_delta=" + i);
        }
        int i2 = 0;
        while (true) {
            AbstractC4308[] abstractC4308Arr = this.f18086;
            if (i2 >= abstractC4308Arr.length) {
                return;
            }
            if (c16887.f51840) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c16887.m39711(abstractC4308Arr[i2]);
            i2++;
        }
    }
}
