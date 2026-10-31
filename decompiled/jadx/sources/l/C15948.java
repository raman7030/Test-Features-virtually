package l;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܺ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9HP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15948 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8377 f49237;

    public C15948(C8377 c8377, ByteArrayOutputStream byteArrayOutputStream) {
        super(byteArrayOutputStream);
        this.f49237 = c8377;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37722(AbstractC5366 abstractC5366) throws IOException {
        AbstractC11716 abstractC11716M15330 = abstractC5366.m15330();
        write((byte) (abstractC11716M15330.m28612() | abstractC11716M15330.m28611().getValue() | abstractC11716M15330.m28609().getValue()));
        AbstractC18772 abstractC18772Mo3870 = abstractC5366.m15330().mo3870(this.f49237);
        int iMo13606 = abstractC18772Mo3870.mo13606(abstractC5366);
        if (iMo13606 < 127) {
            write(iMo13606);
        } else {
            int i = 1;
            for (int i2 = iMo13606; i2 > 255; i2 >>= 8) {
                i++;
            }
            write(i | 128);
            while (i > 0) {
                write(iMo13606 >> ((i - 1) * 8));
                i--;
            }
        }
        abstractC18772Mo3870.mo13607(abstractC5366, this);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
