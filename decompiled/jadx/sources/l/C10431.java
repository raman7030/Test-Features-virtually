package l;

import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10431 extends AbstractC5363 implements InterfaceC8566 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC8566 f31342;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6197 f31343;

    public C10431(C6197 c6197, InterfaceC8566 interfaceC8566) {
        this.f31343 = c6197;
        this.f31342 = interfaceC8566;
    }

    @Override // l.InterfaceC21699
    public final String getType() {
        return (String) this.f31343.f19006.m39233().mo4329(this.f31342.getType());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܽ */
    public final int mo2700() {
        return this.f31342.mo2700();
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜܽ */
    public final String mo2695() {
        return (String) C21908.m49309(this.f31343.f19006.m39233(), this.f31342.mo2695());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܳ֫ */
    public final List mo2699() {
        return new C16262(this.f31343.f19006.m39233(), this.f31342.mo2699());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۜ */
    public final String mo2694() {
        return this.f31342.mo2694();
    }

    @Override // l.InterfaceC8566
    public final Set getAnnotations() {
        return new C9208(this.f31342.getAnnotations(), this.f31343.f19006.m39240());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۨ֫ */
    public final Iterable mo2697() {
        return new C4269(this.f31342.mo2697(), this.f31343.f19006.m39248());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܰۧ */
    public final Iterable mo2698() {
        return new C4269(this.f31342.mo2698(), this.f31343.f19006.m39248());
    }

    @Override // l.InterfaceC8566
    public final Iterable getFields() {
        return new C13252(this);
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ۧܽ */
    public final Iterable mo2696() {
        return new C4269(this.f31342.mo2696(), this.f31343.f19006.m39236());
    }

    @Override // l.InterfaceC8566
    /* JADX INFO: renamed from: ܿܽ */
    public final Iterable mo2701() {
        return new C4269(this.f31342.mo2701(), this.f31343.f19006.m39236());
    }

    @Override // l.InterfaceC8566
    public final Iterable getMethods() {
        return new C12547(this);
    }
}
