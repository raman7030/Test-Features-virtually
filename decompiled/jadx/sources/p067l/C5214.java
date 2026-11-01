package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۗۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5214 {
    /* JADX INFO: renamed from: ֫ */
    public static void m11184(InterfaceC22097 interfaceC22097, byte[] bArr) throws IOException {
        FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.CREATE_NEW, EnumC6003.WRITE);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                if (fileChannelOpen.write(byteBufferWrap) <= 0) {
                    throw new IOException("App migration write made no progress");
                }
            }
            fileChannelOpen.force(true);
            fileChannelOpen.close();
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m11183(InterfaceC22097 interfaceC22097) throws IOException {
        C11920.m27248(interfaceC22097);
        FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.WRITE, EnumC16060.NOFOLLOW_LINKS);
        try {
            fileChannelOpen.force(true);
            fileChannelOpen.close();
        } catch (Throwable th) {
            if (fileChannelOpen != null) {
                try {
                    fileChannelOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
