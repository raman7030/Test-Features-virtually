package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܽ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17MV */
/* JADX INFO: loaded from: classes5.dex */
public final class C17882 extends AbstractC19224 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC16706 f53443;

    public C17882(InterfaceC16706 interfaceC16706) {
        this.f53443 = interfaceC16706;
    }

    @Override // p067l.AbstractC19224, p067l.AbstractC18809
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC16706 mo40687() {
        return this.f53443;
    }

    public final String toString() {
        return "AnnotationOrModifier{modifier=" + this.f53443 + C0249l.f1198d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC18809) {
            AbstractC18809 abstractC18809 = (AbstractC18809) obj;
            if (EnumC19480.MODIFIER == abstractC18809.mo28851() && this.f53443.equals(abstractC18809.mo40687())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f53443.hashCode();
    }

    @Override // p067l.AbstractC18809
    /* JADX INFO: renamed from: ۧ */
    public final EnumC19480 mo28851() {
        return EnumC19480.MODIFIER;
    }
}
