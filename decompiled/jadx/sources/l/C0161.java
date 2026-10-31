package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: renamed from: l.֡ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0161 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f1359;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f1360;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f1361;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f1362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1363;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream f1364;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharacterCodingException f1365;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f1366;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f1367;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f1368;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f1369;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharBuffer f1370;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f1371;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1368) {
            return;
        }
        this.f1368 = true;
        this.f1364.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
    public C0161(AbstractC15440 abstractC15440, C17095 c17095, long j, C0867 c0867) throws InterruptedIOException {
        InputStream inputStreamMo27926;
        C5101 c5101M3188;
        byte[] bArr;
        long j2;
        InputStream c3690;
        int i;
        Charset charset = c17095.f52402;
        this.f1369 = ByteBuffer.allocate(8192);
        this.f1370 = CharBuffer.allocate(2);
        this.f1371 = -1;
        m1279();
        if (j > 0) {
            C5101 c5101M3189 = null;
            try {
                C23411 c23411M36513 = abstractC15440.m36513("r");
                c5101M3189 = c0867.m3188(c23411M36513);
                c23411M36513.seek(j);
                c3690 = new C2279(c23411M36513, c5101M3189);
            } catch (IOException | UnsupportedOperationException unused) {
                if (c5101M3189 != null) {
                    try {
                        c5101M3189.close();
                    } catch (IOException unused2) {
                    }
                }
                if (c0867.m3191()) {
                    throw new InterruptedIOException("Text search canceled.");
                }
                m1279();
                inputStreamMo27926 = abstractC15440.mo27926();
                c5101M3188 = c0867.m3188(inputStreamMo27926);
                try {
                    bArr = new byte[8192];
                    j2 = j;
                    while (j2 > 0) {
                        m1279();
                        i = inputStreamMo27926.read(bArr, 0, (int) Math.min(j2, 8192));
                        if (i >= 0) {
                            throw new IOException("File ended before the search checkpoint.");
                        }
                        if (i != 0) {
                            if (inputStreamMo27926.read() >= 0) {
                                throw new IOException("File ended before the search checkpoint.");
                            }
                            i = 1;
                        }
                        j2 -= (long) i;
                    }
                    c3690 = new C3690(inputStreamMo27926, c5101M3188);
                } catch (Throwable th) {
                    try {
                        c5101M3188.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
        } else {
            inputStreamMo27926 = abstractC15440.mo27926();
            c5101M3188 = c0867.m3188(inputStreamMo27926);
            bArr = new byte[8192];
            j2 = j;
            while (j2 > 0) {
                m1279();
                i = inputStreamMo27926.read(bArr, 0, (int) Math.min(j2, 8192));
                if (i >= 0) {
                    throw new IOException("File ended before the search checkpoint.");
                }
                if (i != 0) {
                    if (inputStreamMo27926.read() >= 0) {
                        throw new IOException("File ended before the search checkpoint.");
                    }
                    i = 1;
                }
                j2 -= (long) i;
            }
            c3690 = new C3690(inputStreamMo27926, c5101M3188);
        }
        this.f1364 = c3690;
        this.f1360 = j;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.f1359 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f1362 = charset.name().equalsIgnoreCase(a.D);
        this.f1369.limit(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1279() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Text search canceled.");
        }
    }

    public final long position() {
        return this.f1371 >= 0 ? this.f1367 : this.f1360;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m1280() throws IOException {
        int i = this.f1371;
        if (i >= 0) {
            this.f1371 = -1;
            return i;
        }
        CharacterCodingException characterCodingException = this.f1365;
        if (characterCodingException != null) {
            throw characterCodingException;
        }
        while (true) {
            if (this.f1362 && this.f1369.hasRemaining()) {
                ByteBuffer byteBuffer = this.f1369;
                if (byteBuffer.get(byteBuffer.position()) >= 0) {
                    this.f1360++;
                    return this.f1369.get();
                }
            }
            this.f1370.clear().limit(1);
            if (!this.f1361) {
                int iPosition = this.f1369.position();
                CoderResult coderResultFlush = this.f1366 ? this.f1359.flush(this.f1370) : this.f1359.decode(this.f1369, this.f1370, this.f1363);
                if (coderResultFlush.isOverflow() && (this.f1370.position() == 0 || (this.f1370.position() == 1 && Character.isHighSurrogate(this.f1370.get(0))))) {
                    this.f1370.limit(2);
                    coderResultFlush = this.f1366 ? this.f1359.flush(this.f1370) : this.f1359.decode(this.f1369, this.f1370, this.f1363);
                }
                this.f1360 += (long) (this.f1369.position() - iPosition);
                if (coderResultFlush.isError()) {
                    try {
                        coderResultFlush.throwException();
                    } catch (CharacterCodingException e) {
                        if (this.f1370.position() == 0) {
                            throw e;
                        }
                        this.f1365 = e;
                    }
                }
                if (this.f1363 && coderResultFlush.isUnderflow()) {
                    if (this.f1366) {
                        this.f1361 = true;
                    }
                    this.f1366 = true;
                }
                if (this.f1370.position() > 0) {
                    char c = this.f1370.get(0);
                    if (this.f1370.position() == 2 && Character.isSurrogatePair(c, this.f1370.get(1))) {
                        return Character.toCodePoint(c, this.f1370.get(1));
                    }
                    if (this.f1370.position() != 1 || Character.isSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    return c;
                }
                if (!this.f1363) {
                    m1279();
                    if (this.f1368) {
                        throw new IOException("Text search reader is closed.");
                    }
                    this.f1369.compact();
                    int i2 = this.f1364.read(this.f1369.array(), this.f1369.position(), this.f1369.remaining());
                    if (i2 < 0) {
                        this.f1363 = true;
                    } else if (i2 == 0) {
                        int i3 = this.f1364.read();
                        if (i3 < 0) {
                            this.f1363 = true;
                        } else {
                            this.f1369.put((byte) i3);
                        }
                    } else {
                        ByteBuffer byteBuffer2 = this.f1369;
                        byteBuffer2.position(byteBuffer2.position() + i2);
                    }
                    this.f1369.flip();
                } else if (this.f1361) {
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18507 m1281(long j) throws IOException {
        int length;
        m1279();
        if (this.f1368) {
            throw new IOException("Text search reader is closed.");
        }
        long jPosition = position();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iM1280 = m1280();
            if (iM1280 < 0) {
                if (sb.length() != 0) {
                    length = sb.length();
                    break;
                }
                return null;
            }
            if (iM1280 == 13 || iM1280 == 10) {
                int length2 = sb.length();
                sb.append((char) iM1280);
                if (iM1280 == 13) {
                    long j2 = this.f1360;
                    try {
                        int iM1281 = m1280();
                        if (iM1281 == 10) {
                            sb.append('\n');
                        } else if (iM1281 >= 0) {
                            this.f1371 = iM1281;
                            this.f1367 = j2;
                        }
                    } catch (CharacterCodingException e) {
                        this.f1365 = e;
                        this.f1360 = j2;
                    }
                }
                length = length2;
                break;
            }
            if (Character.charCount(iM1280) + sb.length() > 1048576) {
                throw new C19213();
            }
            sb.appendCodePoint(iM1280);
            if ((sb.length() & 4095) == 0) {
                m1279();
            }
        }
        if (position() > 9007199254740991L) {
            throw new IOException("Text search offset exceeds the supported JSON integer range.");
        }
        return new C18507(j, jPosition, position(), sb.toString(), length, 0L);
    }
}
