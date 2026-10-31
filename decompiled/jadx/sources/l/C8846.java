package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8846 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Character m22854(InterfaceC15194 interfaceC15194) {
        return Character.valueOf(interfaceC15194.mo7691());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22856(InterfaceC15900 interfaceC15900, InterfaceC23662 interfaceC23662) {
        C11003.requireNonNull(interfaceC23662);
        while (interfaceC15900.hasNext()) {
            interfaceC23662.mo18328(interfaceC15900.mo7691());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22855(InterfaceC15900 interfaceC15900, Consumer consumer) {
        InterfaceC23662 c6729;
        if (consumer instanceof InterfaceC23662) {
            c6729 = (InterfaceC23662) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c6729 = new C6729(consumer);
        }
        interfaceC15900.forEachRemaining(c6729);
    }
}
