package l;

import com.alipay.sdk.m.y.l;
import java.io.IOException;

/* JADX INFO: renamed from: l.ᩳۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K3OA */
/* JADX INFO: loaded from: classes5.dex */
public class C17863 extends AbstractC2465 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9582 f54546;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41838() {
        return (this.f7866 == null || this.f54546 == null) ? false : true;
    }

    public C17863(EnumC10932 enumC10932, C9582 c9582, C15869 c15869) {
        super(enumC10932, c15869);
        this.f54546 = c9582;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9582 m41837() {
        return this.f54546;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41836(C9582 c9582, int i) {
        this.f54546 = c9582;
        c9582.f20943 = i;
    }

    @Override // l.AbstractC2465
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C17863) && super.equals(obj)) {
            return this.f54546.equals(((C17863) obj).f54546);
        }
        return false;
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7940(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C17863) && super.mo7940(obj)) {
            return this.f54546.m24460(((C17863) obj).f54546);
        }
        return false;
    }

    @Override // l.AbstractC2465
    public final int hashCode() {
        return (super.hashCode() * 31) + this.f54546.hashCode();
    }

    @Override // l.AbstractC2465
    public final String toString() {
        return super.toString() + "{" + this.f54546 + "," + this.f7866 + l.d;
    }

    @Override // l.AbstractC2465
    /* JADX INFO: renamed from: ֫ */
    public final void mo7939(InterfaceC0408 interfaceC0408) throws IOException {
        super.mo7939(interfaceC0408);
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f54546.f20943);
        c6053.m16889(((C15869) this.f7866).f20943);
    }
}
