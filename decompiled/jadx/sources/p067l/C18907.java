package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܿܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18907 extends AbstractC10147 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC21650 f56434;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C11532 f56435;

    public C18907(C11532 c11532, InterfaceC21650 interfaceC21650) {
        this.f56435 = c11532;
        this.f56434 = interfaceC21650;
    }

    @Override // p067l.InterfaceC21650
    public final List getValue() {
        return new C17824(this.f56435.f32166.m41477(), this.f56434.getValue());
    }
}
