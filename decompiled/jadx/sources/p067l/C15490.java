package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ܰۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N78B */
/* JADX INFO: loaded from: classes3.dex */
public final class C15490 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f44213;

    /* JADX INFO: renamed from: ۧ */
    public int f44214;

    /* JADX INFO: renamed from: ܽ */
    public final String f44215;

    /* JADX INFO: renamed from: ᩳ */
    public int f44216;

    public C15490(String str) {
        this.f44215 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15490 m35236(String str, byte[] bArr) throws IOException {
        if (bArr.length < 112 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            throw new IOException("Invalid dex header");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C15490 c15490 = new C15490(str);
        c15490.f44213 = true;
        c15490.f44216 = byteBufferOrder.getInt(56);
        byteBufferOrder.getInt(64);
        byteBufferOrder.getInt(72);
        byteBufferOrder.getInt(80);
        byteBufferOrder.getInt(88);
        c15490.f44214 = byteBufferOrder.getInt(96);
        return c15490;
    }
}
