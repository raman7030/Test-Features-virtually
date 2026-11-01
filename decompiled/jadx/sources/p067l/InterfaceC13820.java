package p067l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.۫֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 64JA */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC13820 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, C19283 c19283);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, C19283 c19283);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, C19283 c19283);

    Object parseFrom(AbstractC7962 abstractC7962);

    Object parseFrom(AbstractC7962 abstractC7962, C19283 c19283);

    Object parseFrom(AbstractC9303 abstractC9303);

    Object parseFrom(AbstractC9303 abstractC9303, C19283 c19283);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, C19283 c19283);

    Object parsePartialFrom(AbstractC9303 abstractC9303, C19283 c19283);
}
