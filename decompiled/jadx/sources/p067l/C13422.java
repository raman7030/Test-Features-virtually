package p067l;

/* JADX INFO: renamed from: l.ۨۢ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: TAIM */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13422 implements InterfaceC24263 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f37710;

    @Override // p067l.InterfaceC24263
    /* JADX INFO: renamed from: ֫ */
    public final C20066 mo9467(C9833 c9833) {
        switch (this.f37710) {
            case 0:
                C20066 c20066M23001 = c9833.m23001(c9833.m23010());
                if (!c20066M23001.m45439()) {
                    return c20066M23001;
                }
                C5984 c5984 = new C5984();
                c5984.m13415(c9833.m23010());
                c5984.m13418(EnumC16041.HTTP_1_1);
                c5984.m13411(403);
                c5984.m13422("");
                c5984.m13414(AbstractC2630.m4010());
                return c5984.m13410();
            default:
                int i = C9951.f27547;
                C20066 c20066M23002 = c9833.m23001(c9833.m23010());
                if (!c20066M23002.m45439()) {
                    return c20066M23002;
                }
                C5984 c5985 = new C5984();
                c5985.m13415(c9833.m23010());
                c5985.m13418(EnumC16041.HTTP_1_1);
                c5985.m13411(403);
                c5985.m13422("");
                c5985.m13414(AbstractC2630.m4010());
                return c5985.m13410();
        }
    }
}
