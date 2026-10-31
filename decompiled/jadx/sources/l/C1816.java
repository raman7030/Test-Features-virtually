package l;

/* JADX INFO: renamed from: l.֫۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1816 extends C21572 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16632 f6242;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4308 f6243;

    public C1816(C16632 c16632, AbstractC4308 abstractC4308) {
        this.f6242 = c16632;
        this.f6243 = abstractC4308;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        AbstractC12612 abstractC12612 = c9938.f30017;
        if (abstractC12612 != null) {
            C16632 c16632 = this.f6242;
            AbstractC4308 abstractC4308 = c16632.f51079;
            try {
                c16632.f51079 = this.f6243;
                c16632.mo10758(abstractC12612);
            } finally {
                c16632.f51079 = abstractC4308;
            }
        }
    }
}
