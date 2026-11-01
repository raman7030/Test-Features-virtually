package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.IInStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۘ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B5Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C6418 implements IInStream {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16615;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC9866 f16616;

    public C6418(AbstractC17043 abstractC17043) {
        this.f16616 = abstractC17043.m38671("r");
    }

    public C6418(InterfaceC9866 interfaceC9866) {
        this.f16616 = interfaceC9866;
    }

    @Override // net.p069sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        InterfaceC9866 interfaceC9866 = this.f16616;
        try {
            if (i == 0) {
                interfaceC9866.seek(j + ((long) 0));
            } else if (i == 1) {
                interfaceC9866.seek(interfaceC9866.getFilePointer() + j);
            } else if (i == 2) {
                interfaceC9866.seek(interfaceC9866.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return interfaceC9866.getFilePointer() - ((long) 0);
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            int i = this.f16616.read(byteBuffer);
            if (i == -1) {
                return 0;
            }
            return i;
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f16615) {
            return;
        }
        this.f16616.close();
        this.f16615 = true;
    }
}
