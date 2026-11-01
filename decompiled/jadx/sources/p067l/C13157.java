package p067l;

/* JADX INFO: renamed from: l.ۨ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38I8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13157 implements InterfaceC19330 {

    /* JADX INFO: renamed from: ֫ */
    public C10307 f36973;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC20790 f36974;

    /* JADX INFO: renamed from: ܽ */
    public C11157 f36975;

    public C13157(String str) {
        C3601 c3601 = new C3601();
        c3601.m6694("video/mp2t");
        c3601.m6697(str);
        this.f36973 = c3601.m6672();
    }

    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24431(C11157 c11157, InterfaceC23116 interfaceC23116, C20672 c20672) {
        this.f36975 = c11157;
        c20672.m46737();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 5);
        this.f36974 = interfaceC20790Mo5732;
        interfaceC20790Mo5732.mo10503(this.f36973);
    }

    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24432(C19203 c19203) {
        C23877.m52958(this.f36975);
        String str = C5792.f14228;
        long jM25734 = this.f36975.m25734();
        long jM25736 = this.f36975.m25736();
        if (jM25734 == -9223372036854775807L || jM25736 == -9223372036854775807L) {
            return;
        }
        C10307 c10307 = this.f36973;
        if (jM25736 != c10307.f28534) {
            C3601 c3601M23918 = c10307.m23918();
            c3601M23918.m6675(jM25736);
            C10307 c10307M6672 = c3601M23918.m6672();
            this.f36973 = c10307M6672;
            this.f36974.mo10503(c10307M6672);
        }
        int iM43703 = c19203.m43703();
        this.f36974.mo10500(iM43703, c19203);
        this.f36974.mo10502(jM25734, 1, iM43703, 0, null);
    }
}
