package p067l;

/* JADX INFO: renamed from: l.᩺ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C24190 {

    /* JADX INFO: renamed from: ֫ */
    public final int f76679;

    /* JADX INFO: renamed from: ۧ */
    public final int f76680;

    /* JADX INFO: renamed from: ܽ */
    public final int f76681;

    /* JADX INFO: renamed from: ܿ */
    public final /* synthetic */ C15472 f76682;

    /* JADX INFO: renamed from: ᩳ */
    public final C14802 f76683;

    public C24190(C15472 c15472, AbstractC5415 abstractC5415) {
        this.f76682 = c15472;
        try {
            this.f76683 = new C14802(c15472, (AbstractC5415) ((C7427) c15472.m35221()).get(abstractC5415.mo11891()));
            int iMo11893 = abstractC5415.mo11893();
            this.f76681 = iMo11893;
            int iMo11890 = abstractC5415.mo11890();
            this.f76680 = iMo11890;
            int iMo11892 = abstractC5415.mo11892() / iMo11890;
            this.f76679 = iMo11892;
            if ((iMo11892 * iMo11890) + iMo11893 > c15472.length()) {
                throw new C10109("Symbol table extends past end of file");
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C10109("String table section index is invalid");
        }
    }
}
