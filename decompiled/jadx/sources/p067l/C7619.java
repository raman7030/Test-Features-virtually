package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5C37 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7619 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static void m17576(InterfaceC3595 interfaceC3595, Consumer consumer) {
        InterfaceC6278 c20360;
        if (consumer instanceof InterfaceC6278) {
            c20360 = (InterfaceC6278) consumer;
        } else {
            C12826.requireNonNull(consumer);
            c20360 = new C20360(consumer);
        }
        interfaceC3595.forEachRemaining(c20360);
    }
}
