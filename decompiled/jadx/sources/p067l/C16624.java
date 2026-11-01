package p067l;

/* JADX INFO: renamed from: l.ܶۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11V2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16624 implements InterfaceC16046, InterfaceC4595 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f48867;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f48868;

    public /* synthetic */ C16624(int i, Object obj) {
        this.f48867 = i;
        this.f48868 = obj;
    }

    @Override // p067l.InterfaceC16046
    /* JADX INFO: renamed from: ֫ */
    public void mo16618(long j, C19203 c19203) {
        C9034.m20904(j, c19203, ((C15976) this.f48868).f46274);
    }

    @Override // p067l.InterfaceC4595
    /* JADX INFO: renamed from: ֫ */
    public void mo8466(int i) {
        switch (this.f48867) {
            case 0:
                ((InterfaceC23331) this.f48868).mo38156(((int) (i * 0.4f)) + 60);
                break;
            default:
                ((InterfaceC7957) this.f48868).mo18368(((int) (i * 0.9f)) + 10);
                break;
        }
    }
}
