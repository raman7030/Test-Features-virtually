package p067l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܿۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18576 implements InterfaceC16638, InterfaceC17905, InterfaceC24544 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Object f55437;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f55438;

    public /* synthetic */ C18576(Object obj, Object obj2) {
        this.f55437 = obj;
        this.f55438 = obj2;
    }

    @Override // p067l.InterfaceC17905
    /* JADX INFO: renamed from: ֫ */
    public C5276 mo24636(String str, String str2, String str3) {
        return C14553.m33232((String) this.f55437, (String) this.f55438, str, str2, str3);
    }

    @Override // p067l.InterfaceC16638
    /* JADX INFO: renamed from: ֫ */
    public void mo21136(Object obj, C7625 c7625) {
        InterfaceC3443 interfaceC3443 = (InterfaceC3443) obj;
        interfaceC3443.mo6105((InterfaceC3621) this.f55438, new C7467(c7625, ((C21549) this.f55437).f67966));
    }

    @Override // p067l.InterfaceC24544
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo37461(long j) {
        return ((AbstractC5375) this.f55437).mo11725(j, ((InterfaceC19370) this.f55438).getPath());
    }
}
