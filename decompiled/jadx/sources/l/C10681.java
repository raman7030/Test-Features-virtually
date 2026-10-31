package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10681 extends AbstractC17736 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22900 f32153;

    public C10681(InterfaceC22900 interfaceC22900) {
        this.f32153 = interfaceC22900;
    }

    @Override // l.AbstractC17736, l.AbstractC17299
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC22900 mo26811() {
        return this.f32153;
    }

    public final String toString() {
        return "AnnotationOrModifier{annotation=" + this.f32153 + l.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC17299) {
            AbstractC17299 abstractC17299 = (AbstractC17299) obj;
            if (EnumC18005.ANNOTATION == abstractC17299.mo26812() && this.f32153.equals(abstractC17299.mo26811())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32153.hashCode();
    }

    @Override // l.AbstractC17299
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC18005 mo26812() {
        return EnumC18005.ANNOTATION;
    }
}
