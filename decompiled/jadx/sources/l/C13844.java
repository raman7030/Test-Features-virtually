package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ܰ۬᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C13844 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m33203(InterfaceC14801 interfaceC14801, CancellationException cancellationException) {
        C12434 c12434 = InterfaceC10318.f31060;
        InterfaceC10318 interfaceC10318 = (InterfaceC10318) interfaceC14801.mo9082(C12434.f37427);
        if (interfaceC10318 != null) {
            interfaceC10318.mo26069(cancellationException);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m33202(InterfaceC14801 interfaceC14801) {
        C12434 c12434 = InterfaceC10318.f31060;
        InterfaceC10318 interfaceC10318 = (InterfaceC10318) interfaceC14801.mo9082(C12434.f37427);
        if (interfaceC10318 != null && !interfaceC10318.mo26070()) {
            throw interfaceC10318.mo26071();
        }
    }
}
