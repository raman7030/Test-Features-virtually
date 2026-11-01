package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: SBBY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16271 extends C12920 {
    @Override // p067l.C12920, p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public final String mo10336() {
        return "call site";
    }

    @Override // p067l.C12920
    public final boolean equals(Object obj) {
        if (obj instanceof C16271) {
            return m29596().equals(((C16271) obj).m29596());
        }
        return false;
    }

    @Override // p067l.C12920
    public final int hashCode() {
        return m29596().hashCode();
    }

    @Override // p067l.C12920, p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public final int mo4595(AbstractC15405 abstractC15405) {
        return m29596().compareTo(((C16271) abstractC15405).m29596());
    }

    @Override // p067l.C12920
    public final String toString() {
        return m29596().m43239("call site{");
    }

    @Override // p067l.C12920, p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return m29596().m43240("{", C0249l.f1198d);
    }
}
