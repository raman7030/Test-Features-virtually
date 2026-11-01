package p067l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7BG */
/* JADX INFO: loaded from: classes5.dex */
public final class C19540 extends C4117 {

    /* JADX INFO: renamed from: ᩳ */
    public final InputStream f59490 = System.in;

    @Override // p067l.C4117, p067l.InterfaceC24904
    public final String getName() {
        return "stdin/stdin";
    }

    @Override // p067l.C4117
    /* JADX INFO: renamed from: ܽ */
    public final void mo8321() {
        if (this.f9074 != null) {
            return;
        }
        InputStream inputStream = this.f59490;
        try {
            byte[] bArr = new byte[32768];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    this.f9074 = byteArrayOutputStream.toByteArray();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
