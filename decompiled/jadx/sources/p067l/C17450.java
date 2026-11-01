package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7CN */
/* JADX INFO: loaded from: classes5.dex */
public final class C17450 extends C8773 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ۙ */
    public AbstractC4711 f52180;

    /* JADX INFO: renamed from: ᩶ */
    public EnumC6604 f52181;

    /* JADX INFO: renamed from: ᩹ */
    public int f52182;

    public C17450() {
        throw null;
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 2;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C17450(int i, AbstractC4711 abstractC4711) {
        this.f52181 = EnumC6604.NO;
        this.f23817 = i;
        this.f52180 = abstractC4711;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39778() {
        return this.f52182;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39776(int i) {
        this.f52182 = i;
    }

    @Override // p067l.C8773
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20303() {
        if (!super.mo20303()) {
            return false;
        }
        AbstractC4711 abstractC4711 = this.f52180;
        return !(abstractC4711 == null || abstractC4711.f10654 == null) || (abstractC4711 instanceof C21357);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC12758 m39779() {
        AbstractC4711 abstractC4711 = this.f52180;
        return abstractC4711 == null ? EnumC12758.f35909 : abstractC4711.f10653;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ((C8121) interfaceC2756).m18818(this.f23817);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17450)) {
            return false;
        }
        C17450 c17450 = (C17450) obj;
        return C12826.equals(this.f52180, c17450.f52180) && this.f52181 == c17450.f52181 && this.f23817 == c17450.f23817;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39777(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17450)) {
            return false;
        }
        AbstractC4711 abstractC4711 = this.f52180;
        AbstractC4711 abstractC4712 = ((C17450) obj).f52180;
        if (abstractC4711 == abstractC4712) {
            return true;
        }
        if (abstractC4711 == null) {
            return C12826.equals(abstractC4711, abstractC4712);
        }
        if (abstractC4712 != null) {
            return abstractC4711.mo9988(abstractC4712);
        }
        return false;
    }

    @Override // p067l.C8773
    public final int hashCode() {
        int iHashCode = super.hashCode();
        AbstractC4711 abstractC4711 = this.f52180;
        return (iHashCode + (abstractC4711 != null ? abstractC4711.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("#");
        int i = this.f23817;
        sb.append(i == -1 ? "?" : Integer.valueOf(i));
        sb.append("=");
        sb.append(this.f52180);
        return sb.toString();
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        C14650.m33520(this, c5263);
        return this;
    }
}
