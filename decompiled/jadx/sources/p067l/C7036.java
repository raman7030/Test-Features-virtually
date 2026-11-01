package p067l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;

/* JADX INFO: renamed from: l.ۙ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C7036 {

    /* JADX INFO: renamed from: ֫ */
    public Properties f18335;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f18336;

    /* JADX INFO: renamed from: ֫ */
    public final void m16178(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte[] bArr2 = new byte[2];
        byteBufferWrap.get(bArr2);
        if (!C5695.f13903.equals(new C16443(bArr2))) {
            throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + "]");
        }
        if (bArr.length - 2 <= 2) {
            return;
        }
        byte[] bArr3 = new byte[2];
        byteBufferWrap.get(bArr3);
        int iM37361 = new C16443(bArr3).m37361();
        if (bArr.length - 4 < iM37361) {
            return;
        }
        byte[] bArr4 = new byte[iM37361];
        byteBufferWrap.get(bArr4);
        this.f18335.load(new ByteArrayInputStream(bArr4));
        int length = ((bArr.length - 2) - iM37361) - 2;
        if (length > 0) {
            byte[] bArr5 = new byte[length];
            this.f18336 = bArr5;
            byteBufferWrap.get(bArr5);
        }
    }

    public final String toString() {
        return "ApkExternalInfo [p=" + this.f18335 + ", otherData=" + Arrays.toString(this.f18336) + "]";
    }
}
