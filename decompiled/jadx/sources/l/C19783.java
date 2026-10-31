package l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.sf.sevenzipjbinding.IOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩵᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WB6R */
/* JADX INFO: loaded from: classes5.dex */
public final class C19783 implements IOutStream, Closeable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f63886;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f63887;

    public C19783(AbstractC15440 abstractC15440) {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        this.f63887 = c23411M36513;
        c23411M36513.setLength(0L);
    }

    public C19783(final AbstractC15440 abstractC15440, long j, final InterfaceC13041 interfaceC13041) {
        final C18683 c18683 = new C18683();
        this.f63887 = C0127.m1200(C19885.m45716(abstractC15440.getName(), j, new InterfaceC22001() { // from class: l.ᩴ᩺᩵
            @Override // l.InterfaceC22001
            /* JADX INFO: renamed from: ۧ */
            public final InterfaceC2245 mo17661(int i) {
                StringBuilder sb = new StringBuilder(abstractC15440.mo23554());
                sb.append('.');
                int i2 = i + 1;
                if (i2 < 100) {
                    sb.append('0');
                }
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                AbstractC15440 abstractC15440M39866 = C16999.m39866(sb.toString(), new String[0]);
                InterfaceC2245 interfaceC2245Mo23557 = abstractC15440M39866.mo23557("rw");
                if (c18683.add(i2)) {
                    interfaceC2245Mo23557.setLength(0L);
                    interfaceC13041.accept(abstractC15440M39866);
                }
                return interfaceC2245Mo23557;
            }
        }));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f63886) {
            return;
        }
        this.f63887.close();
        this.f63886 = true;
    }

    @Override // net.sf.sevenzipjbinding.IOutStream
    public final void setSize(long j) throws SevenZipException {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        try {
            this.f63887.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        C23411 c23411 = this.f63887;
        try {
            if (i == 0) {
                c23411.seek(j);
            } else if (i == 1) {
                c23411.seek(c23411.getFilePointer() + j);
            } else if (i == 2) {
                c23411.seek(c23411.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return c23411.getFilePointer();
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (this.f63886) {
            throw new SevenZipException("Closed");
        }
        try {
            return this.f63887.write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }
}
