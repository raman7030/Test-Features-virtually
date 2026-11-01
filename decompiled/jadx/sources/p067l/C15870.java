package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܳ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M7NB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15870 extends AbstractC9836 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f45962;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f45963;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC3130 f45964;

    @Override // p067l.AbstractC9836
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo23022() {
        return this.f45962;
    }

    public C15870(boolean z, boolean z2, EnumC3130 enumC3130) {
        this.f45962 = z;
        this.f45963 = z2;
        this.f45964 = enumC3130;
    }

    @Override // p067l.AbstractC9836
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo23023() {
        return this.f45963;
    }

    @Override // p067l.AbstractC9836
    /* JADX INFO: renamed from: ܽ */
    public final EnumC3130 mo23024() {
        return this.f45964;
    }

    public final String toString() {
        return "JavaFormatterOptions{formatJavadoc=" + this.f45962 + ", reorderModifiers=" + this.f45963 + ", style=" + this.f45964 + C0249l.f1198d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9836)) {
            return false;
        }
        AbstractC9836 abstractC9836 = (AbstractC9836) obj;
        return this.f45962 == abstractC9836.mo23022() && this.f45963 == abstractC9836.mo23023() && this.f45964.equals(abstractC9836.mo23024());
    }

    public final int hashCode() {
        return (((((this.f45962 ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.f45963 ? 1231 : 1237)) * 1000003) ^ this.f45964.hashCode();
    }
}
