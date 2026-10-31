package l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2TB */
/* JADX INFO: loaded from: classes.dex */
public final class C21720 extends AbstractC18063 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22425 f69682;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC20561 f69683;

    public C21720(C22425 c22425, InterfaceC20561 interfaceC20561) {
        this.f69682 = c22425;
        this.f69683 = interfaceC20561;
    }

    @Override // l.InterfaceC20561
    public final int getVisibility() {
        return this.f69683.getVisibility();
    }

    @Override // l.InterfaceC20561
    public final String getType() {
        return (String) this.f69682.f72662.m39233().mo4329(this.f69683.getType());
    }

    @Override // l.InterfaceC20561
    public final Set getElements() {
        return new C9208(this.f69683.getElements(), this.f69682.f72662.m39234());
    }
}
