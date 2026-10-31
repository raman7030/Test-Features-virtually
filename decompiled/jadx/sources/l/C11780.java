package l;

import android.media.Image;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C11780 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f35154;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f35155;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f35156;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f35157;

    public C11780(Image.Plane plane) {
        ByteBuffer buffer = plane.getBuffer();
        this.f35155 = buffer;
        this.f35154 = buffer.position();
        this.f35157 = plane.getRowStride();
        this.f35156 = plane.getPixelStride();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28822(C11780 c11780, int i, int i2) throws IOException {
        ByteBuffer byteBuffer = c11780.f35155;
        long j = c11780.f35154;
        long j2 = (((long) i) * ((long) c11780.f35156)) + (((long) i2) * ((long) c11780.f35157)) + j;
        if (j2 < j || j2 >= byteBuffer.limit()) {
            throw new IOException("MPEG-TS decoder plane is truncated");
        }
        return byteBuffer.get((int) j2) & 255;
    }
}
