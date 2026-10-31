package l;

import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: l.֡ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0334 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* JADX INFO: renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        byte[] byteArray;
        try {
            byte[] bArr = (byte[]) ((C11955) c16040.m37919()).m29175();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.flush();
            gZIPOutputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            byteArray = new byte[0];
        }
        C11955 c11955 = new C11955();
        c11955.m29154(byteArray);
        c16040.m37918(c11955);
    }
}
