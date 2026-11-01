package p067l;

/* JADX INFO: renamed from: l.ܰۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBIO */
/* JADX INFO: loaded from: classes3.dex */
public final class C15300 {

    /* JADX INFO: renamed from: ֫ */
    public String f43676;

    /* JADX INFO: renamed from: ۧ */
    public String f43677;

    public final String toString() {
        return C20865.m47154("<", this.f43676, ">: ", this.f43677);
    }

    public C15300(C19325 c19325, String str) {
        c19325.getClass();
        this.f43676 = c19325.m44030();
        this.f43677 = str;
    }

    public C15300(C19325 c19325, String str, Object... objArr) {
        c19325.getClass();
        this.f43676 = c19325.m44030();
        this.f43677 = String.format(str, objArr);
    }
}
