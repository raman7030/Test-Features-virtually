package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;

/* JADX INFO: renamed from: l.᩶֫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAPG */
/* JADX INFO: loaded from: classes5.dex */
public final class C21247 extends AbstractC23258 {

    /* JADX INFO: renamed from: ֫ */
    public final C2469 f66780;

    /* JADX INFO: renamed from: ۧ */
    public final String f66781;

    /* JADX INFO: renamed from: ܽ */
    public final Object f66782;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC22588 f66783;

    public C21247(Object obj, EnumC22588 enumC22588, C2469 c2469) {
        C13045.m29867(obj, C0226b.f1011d);
        this.f66782 = obj;
        this.f66781 = "SidecarAdapter";
        this.f66783 = enumC22588;
        this.f66780 = c2469;
    }

    @Override // p067l.AbstractC23258
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC23258 mo23107(String str, InterfaceC17797 interfaceC17797) {
        if (((Boolean) interfaceC17797.invoke(this.f66782)).booleanValue()) {
            return this;
        }
        return new C9846(this.f66782, this.f66781, str, this.f66780, this.f66783);
    }

    @Override // p067l.AbstractC23258
    /* JADX INFO: renamed from: ֫ */
    public final Object mo23106() {
        return this.f66782;
    }
}
