package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes5.dex */
public final class C16324 extends AbstractC17736 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15086 f50271;

    public C16324(InterfaceC15086 interfaceC15086) {
        this.f50271 = interfaceC15086;
    }

    @Override // l.AbstractC17736, l.AbstractC17299
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15086 mo38472() {
        return this.f50271;
    }

    public final String toString() {
        return "AnnotationOrModifier{modifier=" + this.f50271 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC17299) {
            AbstractC17299 abstractC17299 = (AbstractC17299) obj;
            if (EnumC18005.MODIFIER == abstractC17299.mo26812() && this.f50271.equals(abstractC17299.mo38472())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f50271.hashCode();
    }

    @Override // l.AbstractC17299
    /* JADX INFO: renamed from: ۧ */
    public final EnumC18005 mo26812() {
        return EnumC18005.MODIFIER;
    }
}
