package p067l;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17525 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final C10330 f52384;

    public C17525(C10330 c10330, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f52384 = c10330;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39897(AbstractC7468 abstractC7468) throws IOException {
        AbstractC13503 abstractC13503M17239 = abstractC7468.m17239();
        write((byte) (abstractC13503M17239.m30660() | abstractC13503M17239.m30659().getValue() | abstractC13503M17239.m30657().getValue()));
        AbstractC20209 abstractC20209Mo6111 = abstractC7468.m17239().mo6111(this.f52384);
        int iMo15481 = abstractC20209Mo6111.mo15481(abstractC7468);
        if (iMo15481 < 127) {
            write(iMo15481);
        } else {
            int i = 1;
            for (int i2 = iMo15481; i2 > 255; i2 >>= 8) {
                i++;
            }
            write(i | 128);
            while (i > 0) {
                write(iMo15481 >> ((i - 1) * 8));
                i--;
            }
        }
        abstractC20209Mo6111.mo15482(abstractC7468, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
