package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IInStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.ۘ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6B5Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C4260 implements IInStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13797;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f13798;

    public C4260(AbstractC15440 abstractC15440) {
        this.f13798 = abstractC15440.m36513("r");
    }

    public C4260(InterfaceC7889 interfaceC7889) {
        this.f13798 = interfaceC7889;
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        InterfaceC7889 interfaceC7889 = this.f13798;
        try {
            if (i == 0) {
                interfaceC7889.seek(j + ((long) 0));
            } else if (i == 1) {
                interfaceC7889.seek(interfaceC7889.getFilePointer() + j);
            } else if (i == 2) {
                interfaceC7889.seek(interfaceC7889.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return interfaceC7889.getFilePointer() - ((long) 0);
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialInStream
    public final int read(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            int i = this.f13798.read(byteBuffer);
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
        if (this.f13797) {
            return;
        }
        this.f13798.close();
        this.f13797 = true;
    }
}
