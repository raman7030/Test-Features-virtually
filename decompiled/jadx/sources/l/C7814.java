package l;

import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۠֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes4.dex */
public class C7814 extends AbstractC19810 implements InterfaceC21164 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractC10370 f24143;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f24144;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f24145;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C14163 f24146;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C0052 f24147;

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 20;
    }

    public C7814(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        super(EnumC1296.f4579, 0L, abstractC10370, null, abstractC5698);
        this.f24145 = null;
        this.f24143 = AbstractC19810.m45553(abstractC10370, abstractC5698);
        this.f17560 = new C17713(this, C20743.f66779);
    }

    @Override // l.AbstractC5698
    public String toString() {
        return this.f24143.toString();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC10370 mo16076() {
        return this.f24143;
    }

    @Override // l.InterfaceC21164
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC10370 mo957() {
        return this.f24143;
    }

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final boolean m20880() {
        return this.f17562.isEmpty() && this.f17561 != null;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֨֫ */
    public final AbstractC14016 mo16064() {
        mo16101();
        return this.f24145;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۬ */
    public final long mo16084() {
        mo16101();
        return this.f17563;
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ֫֫ */
    public final C2609 mo16068() {
        mo16101();
        C14163 c14163 = this.f24146;
        if (c14163 != null) {
            c14163.mo16101();
            if (this.f17558 == null && this.f24146.f17558 != null) {
                C11343 c11343 = new C11343(this);
                this.f17558 = c11343;
                c11343.m28035(this.f24146.f17558);
            }
        }
        return super.mo16068();
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ۗ */
    public final boolean mo15574() {
        return (this.f17563 & X931RNG.BLOCK128_RESEED_MAX) != 0;
    }

    @Override // l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final EnumC23258 mo952() {
        return EnumC23258.PACKAGE;
    }

    @Override // l.AbstractC19810, l.AbstractC5698, l.InterfaceC11970
    /* JADX INFO: renamed from: ۜ */
    public final AbstractC5698 mo7176() {
        C0052 c0052 = this.f24147;
        if (c0052 == null) {
            return null;
        }
        c0052.getClass();
        if (c0052 instanceof C14309) {
            return null;
        }
        return this.f24147;
    }

    @Override // l.InterfaceC11970
    /* JADX INFO: renamed from: ֫ */
    public final Object mo951(AbstractC8463 abstractC8463, Object obj) {
        return abstractC8463.mo10390(this, obj);
    }

    @Override // l.AbstractC19810, l.AbstractC5698
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2899(InterfaceC9932 interfaceC9932, Locale locale) {
        return interfaceC9932.mo4020(this, (Object) locale);
    }

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final void m20879() {
        this.f17558 = null;
    }
}
