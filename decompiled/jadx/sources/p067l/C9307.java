package p067l;

/* JADX INFO: renamed from: l.۟ۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9307 extends AbstractC4337 {

    /* JADX INFO: renamed from: ֫ */
    public final int f25301;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 f25302;

    public C9307(int i, AbstractC6462 abstractC6462) {
        this.f25301 = i;
        this.f25302 = abstractC6462;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final int mo8937() {
        int i = this.f25301;
        if (i < 64) {
            return i + 64;
        }
        return 247;
    }

    @Override // p067l.AbstractC4337
    /* JADX INFO: renamed from: ֫ */
    public final void mo8938(C18418 c18418) {
        super.mo8938(c18418);
        if (mo8937() == 247) {
            C16525 c16525 = c18418.f55019;
            int i = this.f25301;
            c16525.m37503(i);
            if (c18418.f55021) {
                System.out.print(" offset_delta=" + i);
            }
        }
        if (c18418.f55021) {
            System.out.print(" stack[0]=");
        }
        c18418.m41952(this.f25302);
    }
}
