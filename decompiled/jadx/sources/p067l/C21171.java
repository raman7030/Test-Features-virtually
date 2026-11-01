package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import net.p069sf.sevenzipjbinding.IOutStream;
import net.p069sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.᩵᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WB6R */
/* JADX INFO: loaded from: classes5.dex */
public final class C21171 implements IOutStream, Closeable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f66524;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f66525;

    public C21171(AbstractC17043 abstractC17043) {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        this.f66525 = c24618M38671;
        c24618M38671.setLength(0L);
    }

    public C21171(final AbstractC17043 abstractC17043, long j, final InterfaceC1489 interfaceC1489) {
        final C20125 c20125 = new C20125();
        this.f66525 = C2489.m3601(C21267.m48027(abstractC17043.getName(), j, new InterfaceC23278() { // from class: l.ᩴ᩺᩵
            @Override // p067l.InterfaceC23278
            /* JADX INFO: renamed from: ۧ */
            public final InterfaceC4502 mo19606(int i) {
                StringBuilder sb = new StringBuilder(abstractC17043.mo25505());
                sb.append('.');
                int i2 = i + 1;
                if (i2 < 100) {
                    sb.append('0');
                }
                if (i2 < 10) {
                    sb.append('0');
                }
                sb.append(i2);
                AbstractC17043 abstractC17043M42109 = C18524.m42109(sb.toString(), new String[0]);
                InterfaceC4502 interfaceC4502Mo25508 = abstractC17043M42109.mo25508("rw");
                if (c20125.add(i2)) {
                    interfaceC4502Mo25508.setLength(0L);
                    interfaceC1489.accept(abstractC17043M42109);
                }
                return interfaceC4502Mo25508;
            }
        }));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f66524) {
            return;
        }
        this.f66525.close();
        this.f66524 = true;
    }

    @Override // net.p069sf.sevenzipjbinding.IOutStream
    public final void setSize(long j) throws SevenZipException {
        if (this.f66524) {
            throw new SevenZipException("Closed");
        }
        try {
            this.f66525.setLength(j);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // net.p069sf.sevenzipjbinding.ISeekableStream
    public final long seek(long j, int i) throws SevenZipException {
        if (this.f66524) {
            throw new SevenZipException("Closed");
        }
        C24618 c24618 = this.f66525;
        try {
            if (i == 0) {
                c24618.seek(j);
            } else if (i == 1) {
                c24618.seek(c24618.getFilePointer() + j);
            } else if (i == 2) {
                c24618.seek(c24618.length() + j);
            } else {
                throw new RuntimeException("Seek: unknown origin: " + i);
            }
            return c24618.getFilePointer();
        } catch (IOException e) {
            throw new SevenZipException("Error while seek operation", e);
        }
    }

    @Override // net.p069sf.sevenzipjbinding.ISequentialOutStream
    public final int write(ByteBuffer byteBuffer) throws SevenZipException {
        if (this.f66524) {
            throw new SevenZipException("Closed");
        }
        try {
            return this.f66525.write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }
}
