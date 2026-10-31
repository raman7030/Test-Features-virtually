package l;

/* JADX INFO: renamed from: l.᩺ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes.dex */
public final class C22823 extends AbstractC2071 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308[] f73691;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f73692;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308[] f73693;

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final int mo6811() {
        return 255;
    }

    public C22823(int i, AbstractC4308[] abstractC4308Arr, AbstractC4308[] abstractC4308Arr2) {
        this.f73692 = i;
        this.f73691 = abstractC4308Arr;
        this.f73693 = abstractC4308Arr2;
    }

    @Override // l.AbstractC2071
    /* JADX INFO: renamed from: ֫ */
    public final void mo6812(C16887 c16887) {
        super.mo6812(c16887);
        C14896 c14896 = c16887.f51838;
        int i = this.f73692;
        c14896.m35351(i);
        AbstractC4308[] abstractC4308Arr = this.f73691;
        c14896.m35351(abstractC4308Arr.length);
        if (c16887.f51840) {
            System.out.print(" offset_delta=" + i);
            System.out.print(" nlocals=" + abstractC4308Arr.length);
        }
        for (int i2 = 0; i2 < abstractC4308Arr.length; i2++) {
            if (c16887.f51840) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c16887.m39711(abstractC4308Arr[i2]);
        }
        AbstractC4308[] abstractC4308Arr2 = this.f73693;
        c14896.m35351(abstractC4308Arr2.length);
        if (c16887.f51840) {
            System.out.print(" nstack=" + abstractC4308Arr2.length);
        }
        for (int i3 = 0; i3 < abstractC4308Arr2.length; i3++) {
            if (c16887.f51840) {
                System.out.print(" stack[" + i3 + "]=");
            }
            c16887.m39711(abstractC4308Arr2[i3]);
        }
    }
}
