package p067l;

import android.media.Image;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۨܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C13564 {

    /* JADX INFO: renamed from: ֫ */
    public final int f38153;

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer f38154;

    /* JADX INFO: renamed from: ܽ */
    public final int f38155;

    /* JADX INFO: renamed from: ᩳ */
    public final int f38156;

    public C13564(Image.Plane plane) {
        ByteBuffer buffer = plane.getBuffer();
        this.f38154 = buffer;
        this.f38153 = buffer.position();
        this.f38156 = plane.getRowStride();
        this.f38155 = plane.getPixelStride();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m30870(C13564 c13564, int i, int i2) throws IOException {
        ByteBuffer byteBuffer = c13564.f38154;
        long j = c13564.f38153;
        long j2 = (((long) i) * ((long) c13564.f38155)) + (((long) i2) * ((long) c13564.f38156)) + j;
        if (j2 < j || j2 >= byteBuffer.limit()) {
            throw new IOException("MPEG-TS decoder plane is truncated");
        }
        return byteBuffer.get((int) j2) & 255;
    }
}
