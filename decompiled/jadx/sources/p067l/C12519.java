package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۧ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12519 extends AbstractC19224 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC24132 f35124;

    public C12519(InterfaceC24132 interfaceC24132) {
        this.f35124 = interfaceC24132;
    }

    @Override // p067l.AbstractC19224, p067l.AbstractC18809
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC24132 mo28850() {
        return this.f35124;
    }

    public final String toString() {
        return "AnnotationOrModifier{annotation=" + this.f35124 + C0249l.f1198d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC18809) {
            AbstractC18809 abstractC18809 = (AbstractC18809) obj;
            if (EnumC19480.ANNOTATION == abstractC18809.mo28851() && this.f35124.equals(abstractC18809.mo28850())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35124.hashCode();
    }

    @Override // p067l.AbstractC18809
    /* JADX INFO: renamed from: ۧ */
    public final EnumC19480 mo28851() {
        return EnumC19480.ANNOTATION;
    }
}
