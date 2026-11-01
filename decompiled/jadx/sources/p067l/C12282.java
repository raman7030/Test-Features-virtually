package p067l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12282 extends AbstractC7465 implements InterfaceC10509 {

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC10509 f34306;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C8258 f34307;

    public C12282(C8258 c8258, InterfaceC10509 interfaceC10509) {
        this.f34307 = c8258;
        this.f34306 = interfaceC10509;
    }

    @Override // p067l.InterfaceC22991
    public final String getType() {
        return (String) this.f34307.f21867.m41469().mo6575(this.f34306.getType());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܽ */
    public final int mo5039() {
        return this.f34306.mo5039();
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜܽ */
    public final String mo5034() {
        return (String) C23190.m51662(this.f34307.f21867.m41469(), this.f34306.mo5034());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܳ֫ */
    public final List mo5038() {
        return new C17824(this.f34307.f21867.m41469(), this.f34306.mo5038());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۜ */
    public final String mo5033() {
        return this.f34306.mo5033();
    }

    @Override // p067l.InterfaceC10509
    public final Set getAnnotations() {
        return new C11120(this.f34306.getAnnotations(), this.f34307.f21867.m41476());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۨ֫ */
    public final Iterable mo5036() {
        return new C6426(this.f34306.mo5036(), this.f34307.f21867.m41484());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܰۧ */
    public final Iterable mo5037() {
        return new C6426(this.f34306.mo5037(), this.f34307.f21867.m41484());
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getFields() {
        return new C14963(this);
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ۧܽ */
    public final Iterable mo5035() {
        return new C6426(this.f34306.mo5035(), this.f34307.f21867.m41472());
    }

    @Override // p067l.InterfaceC10509
    /* JADX INFO: renamed from: ܿܽ */
    public final Iterable mo5040() {
        return new C6426(this.f34306.mo5040(), this.f34307.f21867.m41472());
    }

    @Override // p067l.InterfaceC10509
    public final Iterable getMethods() {
        return new C14293(this);
    }
}
