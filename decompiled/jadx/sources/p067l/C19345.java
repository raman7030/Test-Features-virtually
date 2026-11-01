package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public class C19345 extends AbstractC4711 {

    /* JADX INFO: renamed from: ܽ */
    public C11475 f57744;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m44085() {
        return (this.f10654 == null || this.f57744 == null) ? false : true;
    }

    public C19345(EnumC12758 enumC12758, C11475 c11475, C17450 c17450) {
        super(enumC12758, c17450);
        this.f57744 = c11475;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C11475 m44084() {
        return this.f57744;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44083(C11475 c11475, int i) {
        this.f57744 = c11475;
        c11475.f23817 = i;
    }

    @Override // p067l.AbstractC4711
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19345) && super.equals(obj)) {
            return this.f57744.equals(((C19345) obj).f57744);
        }
        return false;
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo9988(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19345) && super.mo9988(obj)) {
            return this.f57744.m26472(((C19345) obj).f57744);
        }
        return false;
    }

    @Override // p067l.AbstractC4711
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f57744.hashCode();
    }

    @Override // p067l.AbstractC4711
    public final String toString() {
        return super.toString() + "{" + this.f57744 + "," + this.f10654 + C0249l.f1198d;
    }

    @Override // p067l.AbstractC4711
    /* JADX INFO: renamed from: ֫ */
    public final void mo9987(InterfaceC2756 interfaceC2756) throws IOException {
        super.mo9987(interfaceC2756);
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f57744.f23817);
        c8121.m18818(((C17450) this.f10654).f23817);
    }
}
