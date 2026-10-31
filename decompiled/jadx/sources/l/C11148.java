package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۧܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPX */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11148 {
    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27666(InterfaceC16791 interfaceC16791, Consumer consumer) {
        InterfaceC4113 c18930;
        if (consumer instanceof InterfaceC4113) {
            c18930 = (InterfaceC4113) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c18930 = new C18930(consumer);
        }
        return interfaceC16791.tryAdvance((Object) c18930);
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27665(InterfaceC16791 interfaceC16791, Consumer consumer) {
        InterfaceC4113 c18930;
        if (consumer instanceof InterfaceC4113) {
            c18930 = (InterfaceC4113) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c18930 = new C18930(consumer);
        }
        interfaceC16791.forEachRemaining((Object) c18930);
    }
}
