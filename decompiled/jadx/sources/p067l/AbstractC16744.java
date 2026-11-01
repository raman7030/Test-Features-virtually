package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16744 {
    /* JADX INFO: renamed from: ֫ */
    public abstract C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: ֫ */
    public final C25079 m37987(C10040 c10040) {
        ByteBuffer byteBuffer = c10040.f72704;
        byteBuffer.getClass();
        C23877.m52957(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo6303(c10040, byteBuffer);
    }
}
