package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC12050 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, C17798 c17798);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, C17798 c17798);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, C17798 c17798);

    Object parseFrom(AbstractC5886 abstractC5886);

    Object parseFrom(AbstractC5886 abstractC5886, C17798 c17798);

    Object parseFrom(AbstractC7297 abstractC7297);

    Object parseFrom(AbstractC7297 abstractC7297, C17798 c17798);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, C17798 c17798);

    Object parsePartialFrom(AbstractC7297 abstractC7297, C17798 c17798);
}
