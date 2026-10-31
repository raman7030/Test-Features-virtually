package l;

/* JADX INFO: renamed from: l.ܶۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11V2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15000 implements InterfaceC14392, InterfaceC2343 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45754;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f45755;

    public /* synthetic */ C15000(int i, Object obj) {
        this.f45754 = i;
        this.f45755 = obj;
    }

    @Override // l.InterfaceC14392
    /* JADX INFO: renamed from: ֫ */
    public void mo14710(long j, C17714 c17714) {
        C7013.m18947(j, c17714, ((C14318) this.f45755).f43182);
    }

    @Override // l.InterfaceC2343
    /* JADX INFO: renamed from: ֫ */
    public void mo6264(int i) {
        switch (this.f45754) {
            case 0:
                ((InterfaceC22057) this.f45755).mo35995(((int) (i * 0.4f)) + 60);
                break;
            default:
                ((InterfaceC5880) this.f45755).mo16442(((int) (i * 0.9f)) + 10);
                break;
        }
    }
}
