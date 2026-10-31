package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public class C15817 implements InterfaceC17935 {
    @Override // l.InterfaceC17935
    public EnumC16523 preVisitDirectory(Object obj, InterfaceC15111 interfaceC15111) {
        C11003.requireNonNull(obj);
        C11003.requireNonNull(interfaceC15111);
        return EnumC16523.CONTINUE;
    }

    @Override // l.InterfaceC17935
    public EnumC16523 visitFile(Object obj, InterfaceC15111 interfaceC15111) {
        C11003.requireNonNull(obj);
        C11003.requireNonNull(interfaceC15111);
        return EnumC16523.CONTINUE;
    }

    @Override // l.InterfaceC17935
    public EnumC16523 visitFileFailed(Object obj, IOException iOException) throws IOException {
        C11003.requireNonNull(obj);
        throw iOException;
    }

    @Override // l.InterfaceC17935
    public EnumC16523 postVisitDirectory(Object obj, IOException iOException) throws IOException {
        C11003.requireNonNull(obj);
        if (iOException != null) {
            throw iOException;
        }
        return EnumC16523.CONTINUE;
    }
}
