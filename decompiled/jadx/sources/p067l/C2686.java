package p067l;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.֡ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C2686 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        byte[] byteArray;
        try {
            byte[] bArr = (byte[]) ((C13731) c17613.m40106()).m31229();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C13731 c13731 = new C13731();
        c13731.m31208(byteArray);
        c17613.m40105(c13731);
    }
}
