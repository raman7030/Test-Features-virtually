package l;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ᩳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7BG */
/* JADX INFO: loaded from: classes5.dex */
public final class C18068 extends C1840 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InputStream f56285 = System.in;

    @Override // l.C1840, l.InterfaceC23712
    public final String getName() {
        return "stdin/stdin";
    }

    @Override // l.C1840
    /* JADX INFO: renamed from: ܽ */
    public final void mo6123() {
        if (this.f6295 != null) {
            return;
        }
        InputStream inputStream = this.f56285;
        try {
            byte[] bArr = new byte[32768];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    this.f6295 = byteArrayOutputStream.toByteArray();
                    return;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
