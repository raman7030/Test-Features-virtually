package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: C6L */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10776 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Character m24824(InterfaceC16809 interfaceC16809) {
        return Character.valueOf(interfaceC16809.mo9752());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24826(InterfaceC17480 interfaceC17480, InterfaceC24857 interfaceC24857) {
        C12826.requireNonNull(interfaceC24857);
        while (interfaceC17480.hasNext()) {
            interfaceC24857.mo20276(interfaceC17480.mo9752());
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m24825(InterfaceC17480 interfaceC17480, Consumer consumer) {
        InterfaceC24857 c8764;
        if (consumer instanceof InterfaceC24857) {
            c8764 = (InterfaceC24857) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c8764 = new C8764(consumer);
        }
        interfaceC17480.forEachRemaining(c8764);
    }
}
