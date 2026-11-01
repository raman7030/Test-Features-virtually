package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E2TB */
/* JADX INFO: loaded from: classes.dex */
public final class C23011 extends AbstractC19535 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C23681 f72387;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC21909 f72388;

    public C23011(C23681 c23681, InterfaceC21909 interfaceC21909) {
        this.f72387 = c23681;
        this.f72388 = interfaceC21909;
    }

    @Override // p067l.InterfaceC21909
    public final int getVisibility() {
        return this.f72388.getVisibility();
    }

    @Override // p067l.InterfaceC21909
    public final String getType() {
        return (String) this.f72387.f75389.m41469().mo6575(this.f72388.getType());
    }

    @Override // p067l.InterfaceC21909
    public final Set getElements() {
        return new C11120(this.f72388.getElements(), this.f72387.f75389.m41470());
    }
}
