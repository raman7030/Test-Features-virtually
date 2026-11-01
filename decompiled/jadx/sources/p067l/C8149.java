package p067l;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۛ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QB */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8149 {
    /* JADX INFO: renamed from: ֫ */
    public static void m18929(InterfaceC22097 interfaceC22097, byte[] bArr) throws IOException {
        FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.CREATE_NEW, EnumC6003.WRITE);
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            while (byteBufferWrap.hasRemaining()) {
                if (fileChannelOpen.write(byteBufferWrap) <= 0) {
                    throw new IOException("Recovery entry write made no progress");
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
    public static void m18928(InterfaceC22097 interfaceC22097) throws Throwable {
        if (!"Dalvik".equals(System.getProperty("java.vm.name"))) {
            FileChannel fileChannelOpen = C13853.open(interfaceC22097, EnumC6003.READ);
            try {
                fileChannelOpen.force(true);
                fileChannelOpen.close();
                return;
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
        try {
            FileDescriptor fileDescriptorOpen = Os.open(interfaceC22097.toString(), OsConstants.O_RDONLY, 0);
            IOException iOException = null;
            try {
                try {
                    Os.fsync(fileDescriptorOpen);
                    try {
                        Os.close(fileDescriptorOpen);
                    } catch (ErrnoException e) {
                        throw new IOException("Failed to close recovery directory: " + interfaceC22097, e);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        Os.close(fileDescriptorOpen);
                    } catch (ErrnoException e2) {
                        IOException iOException2 = new IOException("Failed to close recovery directory: " + interfaceC22097, e2);
                        if (iOException != null) {
                            iOException.addSuppressed(iOException2);
                        } else {
                            throw iOException2;
                        }
                    }
                    throw th;
                }
            } catch (ErrnoException e3) {
                IOException iOException3 = new IOException("Failed to sync recovery directory: " + interfaceC22097, e3);
                try {
                    throw iOException3;
                } catch (Throwable th4) {
                    th = th4;
                    iOException = iOException3;
                    Os.close(fileDescriptorOpen);
                    throw th;
                }
            }
        } catch (ErrnoException e4) {
            throw new IOException("Failed to open recovery directory: " + interfaceC22097, e4);
        }
    }
}
