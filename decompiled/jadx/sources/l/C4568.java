package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ۙۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes3.dex */
public final class C4568 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        byte[] byteArray;
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) ((C11955) c16040.m37919()).m29175()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = gZIPInputStream.read(bArr);
                if (i <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            gZIPInputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C11955 c11955 = new C11955();
        c11955.m29154(byteArray);
        c16040.m37918(c11955);
    }
}
