package l;

/* JADX INFO: renamed from: l.۫᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: I97X */
/* JADX INFO: loaded from: classes4.dex */
public final class C12687 extends C15688 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f38203;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C21234 f38204;

    public C12687(C21234 c21234) {
        super(c21234.m48194(), "/" + c21234.m48198() + "/", null, c21234.size(), c21234.m48200(), !c21234.m48202());
        this.f38204 = c21234;
        this.f38203 = C16999.m39866("$RECYCLE.BIN$/" + c21234.m48198() + "/" + c21234.m48194(), new String[0]);
    }

    public C12687(AbstractC15440 abstractC15440, String str) {
        super(abstractC15440.getName(), str, null, abstractC15440.mo23127(), abstractC15440.mo23117(), !abstractC15440.mo23113());
        this.f38204 = null;
        this.f38203 = abstractC15440;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21234 m30958() {
        return this.f38204;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21234 m30959() {
        C21234 c21234 = this.f38204;
        if (c21234 != null) {
            return c21234;
        }
        String parent = getParent();
        int iIndexOf = parent.indexOf(47, 1);
        if (iIndexOf != -1) {
            return C21939.m49413(parent.substring(1, iIndexOf));
        }
        return null;
    }

    @Override // l.C15688
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo28850() {
        return this.f38204 != null;
    }

    @Override // l.C15688, l.InterfaceC17889
    /* JADX INFO: renamed from: ܶۧ */
    public final AbstractC15440 mo24433() {
        return this.f38203;
    }
}
