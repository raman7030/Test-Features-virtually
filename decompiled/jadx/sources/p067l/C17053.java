package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17053 implements InterfaceC3643 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f50438 = new HashMap(3);

    @Override // p067l.InterfaceC3643
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3643 mo6909(Class cls, InterfaceC3881 interfaceC3881) {
        this.f50438.put(cls, interfaceC3881);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10349 m38703() {
        return new C23090(C21562.unmodifiableMap(this.f50438));
    }
}
