package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۗᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6AK */
/* JADX INFO: loaded from: classes3.dex */
public final class C5596 extends AbstractC6124 implements InterfaceC14313 {

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC16192 f13558;

    /* JADX INFO: renamed from: ᩹ */
    public final String f13559;

    public C5596(String str, List list) {
        this.f13558 = C24371.m53727(list);
        this.f13559 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5596 m12402(InterfaceC2873 interfaceC2873) {
        if (interfaceC2873 instanceof C5596) {
            return (C5596) interfaceC2873;
        }
        return new C5596(interfaceC2873.mo4625(), interfaceC2873.mo4624());
    }

    @Override // p067l.InterfaceC2873
    /* JADX INFO: renamed from: ۘ */
    public final List mo4624() {
        return this.f13558;
    }

    @Override // p067l.InterfaceC2873
    /* JADX INFO: renamed from: ᩳ */
    public final String mo4625() {
        return this.f13559;
    }
}
