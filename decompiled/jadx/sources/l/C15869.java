package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CN */
/* JADX INFO: loaded from: classes5.dex */
public final class C15869 extends C6739 implements InterfaceC12218 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC2465 f49042;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC4457 f49043;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f49044;

    public C15869() {
        throw null;
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    public C15869(int i, AbstractC2465 abstractC2465) {
        this.f49043 = EnumC4457.NO;
        this.f20943 = i;
        this.f49042 = abstractC2465;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37606() {
        return this.f49044;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37604(int i) {
        this.f49044 = i;
    }

    @Override // l.C6739
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18355() {
        if (!super.mo18355()) {
            return false;
        }
        AbstractC2465 abstractC2465 = this.f49042;
        return !(abstractC2465 == null || abstractC2465.f7866 == null) || (abstractC2465 instanceof C19980);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC10932 m37607() {
        AbstractC2465 abstractC2465 = this.f49042;
        return abstractC2465 == null ? EnumC10932.f32931 : abstractC2465.f7865;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ((C6053) interfaceC0408).m16889(this.f20943);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15869)) {
            return false;
        }
        C15869 c15869 = (C15869) obj;
        return C11003.equals(this.f49042, c15869.f49042) && this.f49043 == c15869.f49043 && this.f20943 == c15869.f20943;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37605(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15869)) {
            return false;
        }
        AbstractC2465 abstractC2465 = this.f49042;
        AbstractC2465 abstractC2466 = ((C15869) obj).f49042;
        if (abstractC2465 == abstractC2466) {
            return true;
        }
        if (abstractC2465 == null) {
            return C11003.equals(abstractC2465, abstractC2466);
        }
        if (abstractC2466 != null) {
            return abstractC2465.mo7940(abstractC2466);
        }
        return false;
    }

    @Override // l.C6739
    public final int hashCode() {
        int iHashCode = super.hashCode();
        AbstractC2465 abstractC2465 = this.f49042;
        return (iHashCode + (abstractC2465 != null ? abstractC2465.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("#");
        int i = this.f20943;
        sb.append(i == -1 ? "?" : Integer.valueOf(i));
        sb.append("=");
        sb.append(this.f49042);
        return sb.toString();
    }

    @Override // l.InterfaceC12218
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1800 mo14394(C3046 c3046) {
        C12923.m31434(this, c3046);
        return this;
    }
}
