package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۚᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5C37 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5524 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15661(InterfaceC1290 interfaceC1290, Consumer consumer) {
        InterfaceC4113 c18930;
        if (consumer instanceof InterfaceC4113) {
            c18930 = (InterfaceC4113) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c18930 = new C18930(consumer);
        }
        interfaceC1290.forEachRemaining(c18930);
    }
}
