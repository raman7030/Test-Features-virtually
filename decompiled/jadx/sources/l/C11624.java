package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E67S */
/* JADX INFO: loaded from: classes4.dex */
public final class C11624 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        InputStream inputStream = (InputStream) ((C11955) c16040.m37919()).m29175();
        C11955 c11955 = new C11955();
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
            c11955.m29154(byteArray);
        } catch (Exception unused) {
        }
        c16040.m37918(c11955);
    }
}
