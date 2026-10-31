package l;

/* JADX INFO: renamed from: l.ۡܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8943 extends C9486 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27186;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27187;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f27188;

    @Override // l.InterfaceC8780
    /* JADX INFO: renamed from: ֫ */
    public final void mo8215(C5252 c5252) {
        if (c5252.m37484().m9562() == 3) {
            int iMo2231 = ((C2635) c5252.m34454()).mo2231();
            boolean[] zArr = this.f27188;
            zArr[0] = zArr[0] && (this.f27186 - this.f27187) + iMo2231 == c5252.m37483().m48652();
        }
    }

    public C8943(boolean[] zArr, int i, int i2) {
        this.f27188 = zArr;
        this.f27186 = i;
        this.f27187 = i2;
    }
}
