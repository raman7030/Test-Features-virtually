package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ܶ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8ZP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15451 implements InterfaceC1341 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f47309 = new HashMap(3);

    @Override // l.InterfaceC1341
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1341 mo4677(Class cls, InterfaceC1592 interfaceC1592) {
        this.f47309.put(cls, interfaceC1592);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8397 m36544() {
        return new C21803(C20195.unmodifiableMap(this.f47309));
    }
}
