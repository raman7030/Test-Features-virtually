package l;

import java.io.InputStream;

/* JADX INFO: renamed from: l.ܿۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17054 implements InterfaceC15015, InterfaceC16348, InterfaceC23332 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52255;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f52256;

    public /* synthetic */ C17054(Object obj, Object obj2) {
        this.f52255 = obj;
        this.f52256 = obj2;
    }

    @Override // l.InterfaceC16348
    /* JADX INFO: renamed from: ֫ */
    public C3059 mo22666(String str, String str2, String str3) {
        return C12821.m31146((String) this.f52255, (String) this.f52256, str, str2, str3);
    }

    @Override // l.InterfaceC15015
    /* JADX INFO: renamed from: ֫ */
    public void mo19193(Object obj, C5531 c5531) {
        InterfaceC1131 interfaceC1131 = (InterfaceC1131) obj;
        interfaceC1131.mo3864((InterfaceC1318) this.f52256, new C5365(c5531, ((C20182) this.f52255).f65318));
    }

    @Override // l.InterfaceC23332
    /* JADX INFO: renamed from: ֫ */
    public InputStream mo35309(long j) {
        return ((AbstractC3163) this.f52255).mo9681(j, ((InterfaceC17889) this.f52256).getPath());
    }
}
