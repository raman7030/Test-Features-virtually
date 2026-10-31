package l;

/* JADX INFO: renamed from: l.ۨܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11761 extends AbstractC9606 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f35101 = "//";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13876 f35102;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1178 f35103;

    public C11761(C13876 c13876, C1178 c1178) {
        this.f35102 = c13876;
        this.f35103 = c1178;
    }

    @Override // l.AbstractC9606
    public final void onScrolled(C13132 c13132, int i, int i2) {
        String strM33274 = this.f35102.m33274();
        if (C11003.equals(this.f35101, strM33274)) {
            return;
        }
        this.f35101 = strM33274;
        this.f35103.n(strM33274);
    }
}
