package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11808 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35219;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6163 f35220;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f35221;

    public C11808(C4752 c4752, C6163 c6163, int i) {
        ByteBuffer byteBuffer = c4752.f15067;
        this.f35220 = c6163;
        this.f35219 = byteBuffer.getInt(i);
        if (c4752.f15068) {
            byteBuffer.get(i + 4);
            byteBuffer.get(i + 5);
            byteBuffer.getShort(i + 6);
            this.f35221 = byteBuffer.getLong(i + 8);
            byteBuffer.getInt(i + 16);
            return;
        }
        this.f35221 = ((long) byteBuffer.getInt(i + 4)) & 4294967295L;
        byteBuffer.getInt(i + 8);
        byteBuffer.get(i + 12);
        byteBuffer.get(i + 13);
        byteBuffer.getShort(i + 14);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C6163 c6163 = this.f35220;
        sb.append(c6163 == null ? null : c6163.m17068(this.f35219));
        sb.append('@');
        sb.append(Long.toHexString(this.f35221));
        return sb.toString();
    }
}
