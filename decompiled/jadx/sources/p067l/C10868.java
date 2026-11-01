package p067l;

/* JADX INFO: renamed from: l.ۡܳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBEJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10868 extends C11384 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f30121;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ int f30122;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean[] f30123;

    @Override // p067l.InterfaceC10713
    /* JADX INFO: renamed from: ֫ */
    public final void mo10254(C7360 c7360) {
        if (c7360.m39656().m11605() == 3) {
            int iMo4598 = ((C4873) c7360.m36587()).mo4598();
            boolean[] zArr = this.f30123;
            zArr[0] = zArr[0] && (this.f30121 - this.f30122) + iMo4598 == c7360.m39655().m50989();
        }
    }

    public C10868(boolean[] zArr, int i, int i2) {
        this.f30123 = zArr;
        this.f30121 = i;
        this.f30122 = i2;
    }
}
