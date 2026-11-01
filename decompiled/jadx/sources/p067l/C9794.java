package p067l;

import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۠֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C9794 extends AbstractC21195 implements InterfaceC22483 {

    /* JADX INFO: renamed from: ۛ */
    public AbstractC12224 f27059;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC19740 f27060;

    /* JADX INFO: renamed from: ۨ */
    public AbstractC15689 f27061;

    /* JADX INFO: renamed from: ܰ */
    public C15828 f27062;

    /* JADX INFO: renamed from: ᩺ */
    public C2417 f27063;

    @Override // p067l.AbstractC7783, p067l.InterfaceC22798
    /* JADX INFO: renamed from: ۘ */
    public final int mo3348() {
        return 20;
    }

    public C9794(AbstractC12224 abstractC12224, AbstractC7783 abstractC7783) {
        super(EnumC3600.f7351, 0L, abstractC12224, null, abstractC7783);
        this.f27061 = null;
        this.f27059 = AbstractC21195.m47864(abstractC12224, abstractC7783);
        this.f20406 = new C19202(this, C22082.f69463);
    }

    @Override // p067l.AbstractC7783
    public String toString() {
        return this.f27059.toString();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC12224 mo17995() {
        return this.f27059;
    }

    @Override // p067l.InterfaceC22483
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC12224 mo3352() {
        return this.f27059;
    }

    /* JADX INFO: renamed from: ۙ֫ */
    public final boolean m22845() {
        return this.f20408.isEmpty() && this.f20407 != null;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֨֫ */
    public final AbstractC15689 mo17983() {
        mo18020();
        return this.f27061;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۬ */
    public final long mo18003() {
        mo18020();
        return this.f20409;
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫֫ */
    public final C4848 mo17987() {
        mo18020();
        C15828 c15828 = this.f27062;
        if (c15828 != null) {
            c15828.mo18020();
            if (this.f20404 == null && this.f27062.f20404 != null) {
                C13148 c13148 = new C13148(this);
                this.f20404 = c13148;
                c13148.m30080(this.f27062.f20404);
            }
        }
        return super.mo17987();
    }

    @Override // p067l.AbstractC7783
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo17485() {
        return (this.f20409 & X931RNG.BLOCK128_RESEED_MAX) != 0;
    }

    @Override // p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final EnumC24473 mo3347() {
        return EnumC24473.PACKAGE;
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783, p067l.InterfaceC13745
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC7783 mo9255() {
        C2417 c2417 = this.f27063;
        if (c2417 == null) {
            return null;
        }
        c2417.getClass();
        if (c2417 instanceof C15967) {
            return null;
        }
        return this.f27063;
    }

    @Override // p067l.InterfaceC13745
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3346(AbstractC10412 abstractC10412, Object obj) {
        return abstractC10412.mo12429(this, obj);
    }

    @Override // p067l.AbstractC21195, p067l.AbstractC7783
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5228(InterfaceC11807 interfaceC11807, Locale locale) {
        return interfaceC11807.mo6262(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public final void m22844() {
        this.f20404 = null;
    }
}
