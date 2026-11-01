package p067l;

import java.io.ByteArrayInputStream;

/* JADX INFO: renamed from: l.۫ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes4.dex */
public final class C14086 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        try {
            c13731.m31208(new ByteArrayInputStream(bArr));
        } catch (Exception unused) {
        }
        c17613.m40105(c13731);
    }
}
