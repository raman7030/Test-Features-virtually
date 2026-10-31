package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

/* JADX INFO: renamed from: l.ۙ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C4911 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Properties f15502;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f15503;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14281(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[2];
        byteBufferWrap.get(bArr2);
        if (!C3500.f11098.equals(new C14809(bArr2))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
        }
        if (bArr.length - 2 <= 2) {
            return;
        }
        byte[] bArr3 = new byte[2];
        byteBufferWrap.get(bArr3);
        int iM35213 = new C14809(bArr3).m35213();
        if (bArr.length - 4 < iM35213) {
            return;
        }
        byte[] bArr4 = new byte[iM35213];
        byteBufferWrap.get(bArr4);
        this.f15502.load(new ByteArrayInputStream(bArr4));
        int length = ((bArr.length - 2) - iM35213) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f15503 = bArr5;
            byteBufferWrap.get(bArr5);
        }
    }

    public final String toString() {
        return "ApkExternalInfo [p=" + this.f15502 + ", otherData=" + Arrays.toString(this.f15503) + "]";
    }
}
