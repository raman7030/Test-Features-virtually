package p067l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۨܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C13543 extends AbstractC22218 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC2461 f38095;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C24271 f38096;

    public C13543(C24271 c24271, InterfaceC2461 interfaceC2461) {
        this.f38096 = c24271;
        this.f38095 = interfaceC2461;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return (String) this.f38096.f76899.m41469().mo6575(this.f38095.getType());
    }

    @Override // p067l.InterfaceC2461
    public final Set getAnnotations() {
        return new C11120(this.f38095.getAnnotations(), this.f38096.f76899.m41476());
    }

    @Override // p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getName() {
        return this.f38095.getName();
    }

    @Override // p067l.AbstractC22218, p067l.InterfaceC2461, p067l.InterfaceC23250
    public final String getSignature() {
        return this.f38095.getSignature();
    }
}
