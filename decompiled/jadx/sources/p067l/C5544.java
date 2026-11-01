package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۗܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 954P */
/* JADX INFO: loaded from: classes2.dex */
public final class C5544 {

    /* JADX INFO: renamed from: ֫ */
    public final long f13369;

    /* JADX INFO: renamed from: ۧ */
    public final long f13370;

    /* JADX INFO: renamed from: ܽ */
    public final C15601 f13371;

    public C5544(C6885 c6885, C14261 c14261, int i) {
        ByteBuffer byteBuffer = c6885.f17898;
        C12250 c12250 = c14261.f34237.f17900[c14261.f34242];
        long j = c14261.f34241;
        this.f13371 = (C15601) c12250;
        if (c6885.f17899) {
            byteBuffer.getLong(i);
            this.f13370 = byteBuffer.getLong(i + 8);
            this.f13369 = j >= 24 ? byteBuffer.getLong(i + 16) : 0L;
        } else {
            byteBuffer.getInt(i);
            this.f13370 = byteBuffer.getInt(i + 4);
            this.f13369 = j >= 12 ? byteBuffer.getInt(i + 8) : 0L;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f13370;
        C13591 c13591M35478 = this.f13371.m35478((int) (j >>> 32));
        C8226 c8226 = c13591M35478.f38222;
        sb.append(c8226 == null ? null : c8226.m19000(c13591M35478.f38221));
        sb.append('(');
        sb.append((int) j);
        sb.append(')');
        sb.append(this.f13369);
        return sb.toString();
    }
}
