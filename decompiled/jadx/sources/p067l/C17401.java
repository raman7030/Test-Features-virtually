package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C17401 implements InterfaceC19414 {
    @Override // p067l.InterfaceC19414
    public EnumC18072 preVisitDirectory(Object obj, InterfaceC16730 interfaceC16730) {
        C12826.requireNonNull(obj);
        C12826.requireNonNull(interfaceC16730);
        return EnumC18072.CONTINUE;
    }

    @Override // p067l.InterfaceC19414
    public EnumC18072 visitFile(Object obj, InterfaceC16730 interfaceC16730) {
        C12826.requireNonNull(obj);
        C12826.requireNonNull(interfaceC16730);
        return EnumC18072.CONTINUE;
    }

    @Override // p067l.InterfaceC19414
    public EnumC18072 visitFileFailed(Object obj, IOException iOException) throws IOException {
        C12826.requireNonNull(obj);
        throw iOException;
    }

    @Override // p067l.InterfaceC19414
    public EnumC18072 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        C12826.requireNonNull(obj);
        if (iOException != null) {
            throw iOException;
        }
        return EnumC18072.CONTINUE;
    }
}
