package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ᩳܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P2S7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18108 extends AbstractC1129 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC22404 f56364;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9642 f56365;

    public C18108(C9642 c9642, InterfaceC22404 interfaceC22404) {
        this.f56365 = c9642;
        this.f56364 = interfaceC22404;
    }

    @Override // l.InterfaceC22404
    public final String getType() {
        return (String) this.f56365.f29217.m39233().mo4329(this.f56364.getType());
    }

    @Override // l.InterfaceC22404
    public final Set getElements() {
        return new C9208(this.f56364.getElements(), this.f56365.f29217.m39234());
    }
}
