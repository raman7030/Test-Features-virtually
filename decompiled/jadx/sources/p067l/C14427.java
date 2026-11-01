package p067l;

/* JADX INFO: renamed from: l.۫᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I97X */
/* JADX INFO: loaded from: classes4.dex */
public final class C14427 extends C17278 {

    /* JADX INFO: renamed from: ۧ֫ */
    public final AbstractC17043 f41231;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C22549 f41232;

    public C14427(C22549 c22549) {
        super(c22549.m50525(), "/" + c22549.m50529() + "/", null, c22549.size(), c22549.m50531(), !c22549.m50533());
        this.f41232 = c22549;
        this.f41231 = C18524.m42109("$RECYCLE.BIN$/" + c22549.m50529() + "/" + c22549.m50525(), new String[0]);
    }

    public C14427(AbstractC17043 abstractC17043, String str) {
        super(abstractC17043.getName(), str, null, abstractC17043.mo25101(), abstractC17043.mo25091(), !abstractC17043.mo25087());
        this.f41232 = null;
        this.f41231 = abstractC17043;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C22549 m33036() {
        return this.f41232;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C22549 m33037() {
        C22549 c22549 = this.f41232;
        if (c22549 != null) {
            return c22549;
        }
        String parent = getParent();
        int iIndexOf = parent.indexOf(47, 1);
        if (iIndexOf != -1) {
            return C23219.m51750(parent.substring(1, iIndexOf));
        }
        return null;
    }

    @Override // p067l.C17278
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo30899() {
        return this.f41232 != null;
    }

    @Override // p067l.C17278, p067l.InterfaceC19370
    /* JADX INFO: renamed from: ܶۧ */
    public final AbstractC17043 mo26445() {
        return this.f41231;
    }
}
