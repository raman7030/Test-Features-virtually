package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19578 extends AbstractC3441 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC23661 f59577;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11532 f59578;

    public C19578(C11532 c11532, InterfaceC23661 interfaceC23661) {
        this.f59578 = c11532;
        this.f59577 = interfaceC23661;
    }

    @Override // p067l.InterfaceC23661
    public final String getType() {
        return (String) this.f59578.f32166.m41469().mo6575(this.f59577.getType());
    }

    @Override // p067l.InterfaceC23661
    public final Set getElements() {
        return new C11120(this.f59577.getElements(), this.f59578.f32166.m41470());
    }
}
