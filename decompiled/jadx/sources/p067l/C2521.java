package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class C2521 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final CharsetDecoder f4134;

    /* JADX INFO: renamed from: ۙ */
    public long f4135;

    /* JADX INFO: renamed from: ۛ */
    public boolean f4136;

    /* JADX INFO: renamed from: ۟ */
    public final boolean f4137;

    /* JADX INFO: renamed from: ۤ */
    public boolean f4138;

    /* JADX INFO: renamed from: ۨ */
    public final InputStream f4139;

    /* JADX INFO: renamed from: ۫ */
    public CharacterCodingException f4140;

    /* JADX INFO: renamed from: ۬ */
    public boolean f4141;

    /* JADX INFO: renamed from: ܰ */
    public long f4142;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f4143;

    /* JADX INFO: renamed from: ᩸ */
    public final ByteBuffer f4144;

    /* JADX INFO: renamed from: ᩹ */
    public final CharBuffer f4145;

    /* JADX INFO: renamed from: ᩺ */
    public int f4146;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4143) {
            return;
        }
        this.f4143 = true;
        this.f4139.close();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[Catch: all -> 0x00b3, TRY_ENTER, TryCatch #1 {all -> 0x00b3, blocks: (B:18:0x0057, B:21:0x005e, B:25:0x0071, B:28:0x0079, B:29:0x007e, B:30:0x007f, B:31:0x0082, B:32:0x0087, B:33:0x0088), top: B:42:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x007f A[SYNTHETIC] */
    public C2521(AbstractC17043 abstractC17043, C18615 c18615, long j, C3192 c3192) throws InterruptedIOException {
        InputStream inputStreamMo29987;
        C7216 c7216M5502;
        byte[] bArr;
        long j2;
        InputStream c5875;
        int i;
        Charset charset = c18615.f55585;
        this.f4144 = ByteBuffer.allocate(8192);
        this.f4145 = CharBuffer.allocate(2);
        this.f4146 = -1;
        m3687();
        if (j > 0) {
            C7216 c7216M5503 = null;
            try {
                C24618 c24618M38671 = abstractC17043.m38671("r");
                c7216M5503 = c3192.m5502(c24618M38671);
                c24618M38671.seek(j);
                c5875 = new C4534(c24618M38671, c7216M5503);
            } catch (IOException | UnsupportedOperationException unused) {
                if (c7216M5503 != null) {
                    try {
                        c7216M5503.close();
                    } catch (IOException unused2) {
                    }
                }
                if (c3192.m5505()) {
                    throw new InterruptedIOException("Text search canceled.");
                }
                m3687();
                inputStreamMo29987 = abstractC17043.mo29987();
                c7216M5502 = c3192.m5502(inputStreamMo29987);
                try {
                    bArr = new byte[8192];
                    j2 = j;
                    while (j2 > 0) {
                        m3687();
                        i = inputStreamMo29987.read(bArr, 0, (int) Math.min(j2, 8192));
                        if (i >= 0) {
                            throw new IOException("File ended before the search checkpoint.");
                        }
                        if (i != 0) {
                            if (inputStreamMo29987.read() >= 0) {
                                throw new IOException("File ended before the search checkpoint.");
                            }
                            i = 1;
                        }
                        j2 -= (long) i;
                    }
                    c5875 = new C5875(inputStreamMo29987, c7216M5502);
                } catch (Throwable th) {
                    try {
                        c7216M5502.close();
                    } catch (IOException unused3) {
                    }
                    throw th;
                }
            }
        } else {
            inputStreamMo29987 = abstractC17043.mo29987();
            c7216M5502 = c3192.m5502(inputStreamMo29987);
            bArr = new byte[8192];
            j2 = j;
            while (j2 > 0) {
                m3687();
                i = inputStreamMo29987.read(bArr, 0, (int) Math.min(j2, 8192));
                if (i >= 0) {
                    throw new IOException("File ended before the search checkpoint.");
                }
                if (i != 0) {
                    if (inputStreamMo29987.read() >= 0) {
                        throw new IOException("File ended before the search checkpoint.");
                    }
                    i = 1;
                }
                j2 -= (long) i;
            }
            c5875 = new C5875(inputStreamMo29987, c7216M5502);
        }
        this.f4139 = c5875;
        this.f4135 = j;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        this.f4134 = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.f4137 = charset.name().equalsIgnoreCase(C0233a.f1077D);
        this.f4144.limit(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m3687() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Text search canceled.");
        }
    }

    public final long position() {
        return this.f4146 >= 0 ? this.f4142 : this.f4135;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m3688() throws IOException {
        int i = this.f4146;
        if (i >= 0) {
            this.f4146 = -1;
            return i;
        }
        CharacterCodingException characterCodingException = this.f4140;
        if (characterCodingException != null) {
            throw characterCodingException;
        }
        while (true) {
            if (this.f4137 && this.f4144.hasRemaining()) {
                ByteBuffer byteBuffer = this.f4144;
                if (byteBuffer.get(byteBuffer.position()) >= 0) {
                    this.f4135++;
                    return this.f4144.get();
                }
            }
            this.f4145.clear().limit(1);
            if (!this.f4136) {
                int iPosition = this.f4144.position();
                CoderResult coderResultFlush = this.f4141 ? this.f4134.flush(this.f4145) : this.f4134.decode(this.f4144, this.f4145, this.f4138);
                if (coderResultFlush.isOverflow() && (this.f4145.position() == 0 || (this.f4145.position() == 1 && Character.isHighSurrogate(this.f4145.get(0))))) {
                    this.f4145.limit(2);
                    coderResultFlush = this.f4141 ? this.f4134.flush(this.f4145) : this.f4134.decode(this.f4144, this.f4145, this.f4138);
                }
                this.f4135 += (long) (this.f4144.position() - iPosition);
                if (coderResultFlush.isError()) {
                    try {
                        coderResultFlush.throwException();
                    } catch (CharacterCodingException e) {
                        if (this.f4145.position() == 0) {
                            throw e;
                        }
                        this.f4140 = e;
                    }
                }
                if (this.f4138 && coderResultFlush.isUnderflow()) {
                    if (this.f4141) {
                        this.f4136 = true;
                    }
                    this.f4141 = true;
                }
                if (this.f4145.position() > 0) {
                    char c = this.f4145.get(0);
                    if (this.f4145.position() == 2 && Character.isSurrogatePair(c, this.f4145.get(1))) {
                        return Character.toCodePoint(c, this.f4145.get(1));
                    }
                    if (this.f4145.position() != 1 || Character.isSurrogate(c)) {
                        throw new CharacterCodingException();
                    }
                    return c;
                }
                if (!this.f4138) {
                    m3687();
                    if (this.f4143) {
                        throw new IOException("Text search reader is closed.");
                    }
                    this.f4144.compact();
                    int i2 = this.f4139.read(this.f4144.array(), this.f4144.position(), this.f4144.remaining());
                    if (i2 < 0) {
                        this.f4138 = true;
                    } else if (i2 == 0) {
                        int i3 = this.f4139.read();
                        if (i3 < 0) {
                            this.f4138 = true;
                        } else {
                            this.f4144.put((byte) i3);
                        }
                    } else {
                        ByteBuffer byteBuffer2 = this.f4144;
                        byteBuffer2.position(byteBuffer2.position() + i2);
                    }
                    this.f4144.flip();
                } else if (this.f4136) {
                }
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19957 m3689(long j) throws IOException {
        int length;
        m3687();
        if (this.f4143) {
            throw new IOException("Text search reader is closed.");
        }
        long jPosition = position();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int iM3688 = m3688();
            if (iM3688 < 0) {
                if (sb.length() != 0) {
                    length = sb.length();
                    break;
                }
                return null;
            }
            if (iM3688 == 13 || iM3688 == 10) {
                int length2 = sb.length();
                sb.append((char) iM3688);
                if (iM3688 == 13) {
                    long j2 = this.f4135;
                    try {
                        int iM3689 = m3688();
                        if (iM3689 == 10) {
                            sb.append('\n');
                        } else if (iM3689 >= 0) {
                            this.f4146 = iM3689;
                            this.f4142 = j2;
                        }
                    } catch (CharacterCodingException e) {
                        this.f4140 = e;
                        this.f4135 = j2;
                    }
                }
                length = length2;
                break;
            }
            if (Character.charCount(iM3688) + sb.length() > 1048576) {
                throw new C20628();
            }
            sb.appendCodePoint(iM3688);
            if ((sb.length() & 4095) == 0) {
                m3687();
            }
        }
        if (position() > 9007199254740991L) {
            throw new IOException("Text search offset exceeds the supported JSON integer range.");
        }
        return new C19957(j, jPosition, position(), sb.toString(), length, 0L);
    }
}
