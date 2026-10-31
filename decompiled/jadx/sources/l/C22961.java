package l;

/* JADX INFO: renamed from: l.᩺ۨ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T65P */
/* JADX INFO: loaded from: classes.dex */
public final class C22961 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f73948;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f73949;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f73950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13788 f73951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13083 f73952;

    public C22961(C13788 c13788, AbstractC3206 abstractC3206) {
        this.f73951 = c13788;
        try {
            this.f73952 = new C13083(c13788, (AbstractC3206) ((C5323) c13788.m33105()).get(abstractC3206.mo9844()));
            int iMo9846 = abstractC3206.mo9846();
            this.f73950 = iMo9846;
            int iMo9843 = abstractC3206.mo9843();
            this.f73949 = iMo9843;
            int iMo9845 = abstractC3206.mo9845() / iMo9843;
            this.f73948 = iMo9845;
            if ((iMo9845 * iMo9843) + iMo9846 > c13788.length()) {
                throw new C8145("Symbol table extends past end of file");
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C8145("String table section index is invalid");
        }
    }
}
