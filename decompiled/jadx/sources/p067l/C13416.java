package p067l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes4.dex */
public final class C13416 implements InterfaceC4699 {
    @Override // p067l.InterfaceC4699
    /* JADX INFO: renamed from: ֫ */
    public final void mo4126(C17613 c17613) {
        InputStream inputStream = (InputStream) ((C13731) c17613.m40106()).m31229();
        C13731 c13731 = new C13731();
        try {
            byte[] bArr = new byte[10240];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            inputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            c13731.m31208(byteArray);
        } catch (Exception unused) {
        }
        c17613.m40105(c13731);
    }
}
