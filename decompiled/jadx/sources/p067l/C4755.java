package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ۖۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W73I */
/* JADX INFO: loaded from: classes2.dex */
public final class C4755 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public final PushbackInputStream f10768;

    /* JADX INFO: renamed from: ۤ */
    public long f10771;

    /* JADX INFO: renamed from: ۫ */
    public int f10772;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f10774;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f10775;

    /* JADX INFO: renamed from: ۙ */
    public final Inflater f10769 = new Inflater(true);

    /* JADX INFO: renamed from: ᩹ */
    public final CRC32 f10776 = new CRC32();

    /* JADX INFO: renamed from: ۬ */
    public final byte[] f10773 = new byte[65536];

    /* JADX INFO: renamed from: ۛ */
    public final byte[] f10770 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4755(InputStream inputStream) {
        this.f10768 = new PushbackInputStream(inputStream, 65536);
        try {
            m10059();
        } catch (Throwable th) {
            this.f10769.end();
            throw th;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f10770;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Inflater inflater = this.f10769;
        if (this.f10775) {
            throw new IOException("Stream closed");
        }
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if (i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        while (!this.f10774) {
            try {
                int iInflate = inflater.inflate(bArr, i, i2);
                CRC32 crc32 = this.f10776;
                if (iInflate > 0) {
                    crc32.update(bArr, i, iInflate);
                    this.f10771 = (this.f10771 + ((long) iInflate)) & 4294967295L;
                    return iInflate;
                }
                boolean zFinished = inflater.finished();
                byte[] bArr2 = this.f10773;
                PushbackInputStream pushbackInputStream = this.f10768;
                if (!zFinished) {
                    if (inflater.needsDictionary()) {
                        throw new ZipException("GZIP stream requires a preset dictionary");
                    }
                    if (!inflater.needsInput()) {
                        throw new ZipException("GZIP inflater made no progress");
                    }
                    int i3 = pushbackInputStream.read(bArr2);
                    this.f10772 = i3;
                    if (i3 == -1) {
                        throw new EOFException("Unexpected end of GZIP compressed data");
                    }
                    inflater.setInput(bArr2, 0, i3);
                } else {
                    int remaining = inflater.getRemaining();
                    if (remaining > 0) {
                        pushbackInputStream.unread(bArr2, this.f10772 - remaining, remaining);
                    }
                    long jM10060 = m10060();
                    long jM10061 = m10060();
                    if (jM10060 != crc32.getValue()) {
                        throw new ZipException("Corrupt GZIP trailer CRC");
                    }
                    if (jM10061 != this.f10771) {
                        throw new ZipException("Corrupt GZIP trailer size");
                    }
                    int i4 = pushbackInputStream.read();
                    if (i4 == -1) {
                        this.f10774 = true;
                    } else {
                        int i5 = pushbackInputStream.read();
                        if (i5 == -1 || i4 != 31 || i5 != 139) {
                            throw new ZipException("Trailing data after GZIP stream");
                        }
                        pushbackInputStream.unread(i5);
                        pushbackInputStream.unread(i4);
                        inflater.reset();
                        m10059();
                    }
                }
            } catch (DataFormatException e) {
                ZipException zipException = new ZipException("Invalid GZIP compressed data");
                zipException.initCause(e);
                throw zipException;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10059() throws IOException {
        CRC32 crc32 = new CRC32();
        if (m10058(crc32) != 31 || m10058(crc32) != 139) {
            throw new ZipException("Invalid GZIP header");
        }
        if (m10058(crc32) != 8) {
            throw new ZipException("Unsupported GZIP compression method");
        }
        int iM10058 = m10058(crc32);
        if ((iM10058 & BERTags.FLAGS) != 0) {
            throw new ZipException("Reserved GZIP flags are set");
        }
        for (int i = 0; i < 6; i++) {
            m10058(crc32);
        }
        if ((iM10058 & 4) != 0) {
            int iM10059 = m10058(crc32) | (m10058(crc32) << 8);
            for (int i2 = 0; i2 < iM10059; i2++) {
                m10058(crc32);
            }
        }
        if ((iM10058 & 8) != 0) {
            while (m10058(crc32) != 0) {
            }
        }
        if ((iM10058 & 16) != 0) {
            while (m10058(crc32) != 0) {
            }
        }
        if ((iM10058 & 2) != 0) {
            if (((m10057("Unexpected end of GZIP header CRC") << 8) | m10057("Unexpected end of GZIP header CRC")) != (((int) crc32.getValue()) & 65535)) {
                throw new ZipException("Corrupt GZIP header CRC");
            }
        }
        this.f10776.reset();
        this.f10771 = 0L;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m10058(CRC32 crc32) throws IOException {
        int iM10057 = m10057("Unexpected end of GZIP header");
        crc32.update(iM10057);
        return iM10057;
    }

    /* JADX INFO: renamed from: ܽ */
    private long m10060() {
        return ((long) m10057("Unexpected end of GZIP trailer")) | (((long) m10057("Unexpected end of GZIP trailer")) << 8) | (((long) m10057("Unexpected end of GZIP trailer")) << 16) | (((long) m10057("Unexpected end of GZIP trailer")) << 24);
    }

    /* JADX INFO: renamed from: ֫ */
    private int m10057(String str) throws IOException {
        int i = this.f10768.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException(str);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10775) {
            return;
        }
        this.f10775 = true;
        this.f10769.end();
        this.f10768.close();
    }
}
