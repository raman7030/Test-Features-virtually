package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۗۘᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2994 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9133(InterfaceC20758 interfaceC20758, byte[] bArr) throws IOException {
        FileChannel fileChannelOpen = C12084.open(interfaceC20758, EnumC3824.CREATE_NEW, EnumC3824.WRITE);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9132(InterfaceC20758 interfaceC20758) throws IOException {
        C10050.m25231(interfaceC20758);
        FileChannel fileChannelOpen = C12084.open(interfaceC20758, EnumC3824.WRITE, EnumC14406.NOFOLLOW_LINKS);
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
