package p067l;

/* JADX INFO: renamed from: l.᩺ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes.dex */
public final class C24059 extends AbstractC4337 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC6462[] f76423;

    /* JADX INFO: renamed from: ۧ */
    public final int f76424;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC6462[] f76425;

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final int mo8937() {
        return 255;
    }

    public C24059(int i, AbstractC6462[] abstractC6462Arr, AbstractC6462[] abstractC6462Arr2) {
        this.f76424 = i;
        this.f76423 = abstractC6462Arr;
        this.f76425 = abstractC6462Arr2;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final void mo8938(C18418 c18418) {
        super.mo8938(c18418);
        C16525 c16525 = c18418.f55019;
        int i = this.f76424;
        c16525.m37503(i);
        AbstractC6462[] abstractC6462Arr = this.f76423;
        c16525.m37503(abstractC6462Arr.length);
        if (c18418.f55021) {
            System.out.print(" offset_delta=" + i);
            System.out.print(" nlocals=" + abstractC6462Arr.length);
        }
        for (int i2 = 0; i2 < abstractC6462Arr.length; i2++) {
            if (c18418.f55021) {
                System.out.print(" locals[" + i2 + "]=");
            }
            c18418.m41952(abstractC6462Arr[i2]);
        }
        AbstractC6462[] abstractC6462Arr2 = this.f76425;
        c16525.m37503(abstractC6462Arr2.length);
        if (c18418.f55021) {
            System.out.print(" nstack=" + abstractC6462Arr2.length);
        }
        for (int i3 = 0; i3 < abstractC6462Arr2.length; i3++) {
            if (c18418.f55021) {
                System.out.print(" stack[" + i3 + "]=");
            }
            c18418.m41952(abstractC6462Arr2[i3]);
        }
    }
}
