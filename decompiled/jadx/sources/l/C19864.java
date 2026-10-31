package l;

import com.alipay.sdk.m.u0.b;

/* JADX INFO: renamed from: l.᩶֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19864 extends AbstractC21980 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0106 f64143;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f64144;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f64145;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC21275 f64146;

    public C19864(Object obj, EnumC21275 enumC21275, C0106 c0106) {
        C11233.m27805(obj, b.d);
        this.f64145 = obj;
        this.f64144 = "SidecarAdapter";
        this.f64146 = enumC21275;
        this.f64143 = c0106;
    }

    @Override // l.AbstractC21980
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC21980 mo21142(String str, InterfaceC16233 interfaceC16233) {
        if (((Boolean) interfaceC16233.invoke(this.f64145)).booleanValue()) {
            return this;
        }
        return new C7868(this.f64145, this.f64144, str, this.f64143, this.f64146);
    }

    @Override // l.AbstractC21980
    /* JADX INFO: renamed from: ֫ */
    public final Object mo21141() {
        return this.f64145;
    }
}
