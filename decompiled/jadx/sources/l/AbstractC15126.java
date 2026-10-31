package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ܶۡۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8K8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15126 {
    /* JADX INFO: renamed from: ֫ */
    public abstract C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 m35829(C8072 c8072) {
        ByteBuffer byteBuffer = c8072.f69995;
        byteBuffer.getClass();
        C22632.m50631(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo4059(c8072, byteBuffer);
    }
}
