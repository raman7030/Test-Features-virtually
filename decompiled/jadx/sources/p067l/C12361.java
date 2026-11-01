package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۤ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3922 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12361 implements InterfaceC21749 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC23760 f34487;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f34488 = new HashMap();

    @Override // p067l.InterfaceC21749
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21749 mo28450(Class cls, InterfaceC6996 interfaceC6996) {
        this.f34488.put(cls, interfaceC6996);
        return this;
    }

    @Override // p067l.InterfaceC21749
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21749 mo28451(InterfaceC23760 interfaceC23760) {
        this.f34487 = interfaceC23760;
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5655 m28449(C20408 c20408, InterfaceC15712 interfaceC15712) {
        InterfaceC23760 c9008 = this.f34487;
        if (c9008 == null) {
            c9008 = new C9008();
        }
        return new C8337(c20408, interfaceC15712, new C19304(), C21562.unmodifiableMap(this.f34488), c9008);
    }
}
