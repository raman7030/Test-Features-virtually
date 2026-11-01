package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5VW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13591 {

    /* JADX INFO: renamed from: ֫ */
    public final int f38221;

    /* JADX INFO: renamed from: ۧ */
    public final C8226 f38222;

    /* JADX INFO: renamed from: ܽ */
    public final long f38223;

    public C13591(C6885 c6885, C8226 c8226, int i) {
        ByteBuffer byteBuffer = c6885.f17898;
        this.f38222 = c8226;
        this.f38221 = byteBuffer.getInt(i);
        if (c6885.f17899) {
            byteBuffer.get(i + 4);
            byteBuffer.get(i + 5);
            byteBuffer.getShort(i + 6);
            this.f38223 = byteBuffer.getLong(i + 8);
            byteBuffer.getInt(i + 16);
            return;
        }
        this.f38223 = ((long) byteBuffer.getInt(i + 4)) & 4294967295L;
        byteBuffer.getInt(i + 8);
        byteBuffer.get(i + 12);
        byteBuffer.get(i + 13);
        byteBuffer.getShort(i + 14);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C8226 c8226 = this.f38222;
        sb.append(c8226 == null ? null : c8226.m19000(this.f38221));
        sb.append('@');
        sb.append(Long.toHexString(this.f38223));
        return sb.toString();
    }
}
