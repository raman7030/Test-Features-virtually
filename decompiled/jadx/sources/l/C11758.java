package l;

import java.util.Set;

/* JADX INFO: renamed from: l.ۨܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2RU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11758 extends AbstractC20886 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC0098 f35096;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23046 f35097;

    public C11758(C23046 c23046, InterfaceC0098 interfaceC0098) {
        this.f35097 = c23046;
        this.f35096 = interfaceC0098;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return (String) this.f35097.f74157.m39233().mo4329(this.f35096.getType());
    }

    @Override // l.InterfaceC0098
    public final Set getAnnotations() {
        return new C9208(this.f35096.getAnnotations(), this.f35097.f74157.m39240());
    }

    @Override // l.InterfaceC0098, l.InterfaceC21972
    public final String getName() {
        return this.f35096.getName();
    }

    @Override // l.AbstractC20886, l.InterfaceC0098, l.InterfaceC21972
    public final String getSignature() {
        return this.f35096.getSignature();
    }
}
