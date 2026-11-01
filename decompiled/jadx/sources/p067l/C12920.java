package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۧܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C12920 extends AbstractC15405 {

    /* JADX INFO: renamed from: ᩸ */
    public final C4202 f36326;

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public boolean mo4596() {
        return false;
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ᩻ */
    public String mo10336() {
        return "array";
    }

    public C12920(C4202 c4202) {
        c4202.m45999();
        this.f36326 = c4202;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12920)) {
            return false;
        }
        return this.f36326.equals(((C12920) obj).f36326);
    }

    public int hashCode() {
        return this.f36326.hashCode();
    }

    @Override // p067l.AbstractC15405
    /* JADX INFO: renamed from: ۧ */
    public int mo4595(AbstractC15405 abstractC15405) {
        return this.f36326.compareTo(((C12920) abstractC15405).f36326);
    }

    public String toString() {
        return this.f36326.m43239("array{");
    }

    @Override // p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public String mo4819() {
        return this.f36326.m43240("{", C0249l.f1198d);
    }

    /* JADX INFO: renamed from: ܺ */
    public final C4202 m29596() {
        return this.f36326;
    }
}
