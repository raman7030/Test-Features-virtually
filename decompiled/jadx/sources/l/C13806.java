package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ܰۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N78B */
/* JADX INFO: loaded from: classes3.dex */
public final class C13806 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f41135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41136;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f41137;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f41138;

    public C13806(String str) {
        this.f41137 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13806 m33119(String str, byte[] bArr) throws IOException {
        if (bArr.length < 112 || bArr[0] != 100 || bArr[1] != 101 || bArr[2] != 120 || bArr[3] != 10 || bArr[7] != 0) {
            throw new IOException("Invalid dex header");
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        C13806 c13806 = new C13806(str);
        c13806.f41135 = true;
        c13806.f41138 = byteBufferOrder.getInt(56);
        byteBufferOrder.getInt(64);
        byteBufferOrder.getInt(72);
        byteBufferOrder.getInt(80);
        byteBufferOrder.getInt(88);
        c13806.f41136 = byteBufferOrder.getInt(96);
        return c13806;
    }
}
