package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: renamed from: l.ܰۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AQN */
/* JADX INFO: loaded from: classes3.dex */
public final class C15230 extends Writer {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f43456;

    /* JADX INFO: renamed from: ᩸ */
    public char f43457;

    /* JADX INFO: renamed from: ᩹ */
    public final OutputStream f43458;

    @Override // java.io.Writer, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        append(charSequence);
        return this;
    }

    public C15230(OutputStream outputStream) {
        this.f43458 = outputStream;
    }

    @Override // java.io.Writer
    public final void write(int i) throws IOException {
        boolean z = this.f43456;
        OutputStream outputStream = this.f43458;
        if (z) {
            this.f43456 = false;
            char c = (char) i;
            int codePoint = Character.isLowSurrogate(c) ? Character.toCodePoint(this.f43457, c) : -1;
            if (codePoint < 0) {
                outputStream.write(63);
            } else {
                outputStream.write((codePoint >> 18) | 240);
                outputStream.write(((codePoint >> 12) & 63) | 128);
                outputStream.write(((codePoint >> 6) & 63) | 128);
                outputStream.write((codePoint & 63) | 128);
                return;
            }
        }
        if (i < 128) {
            outputStream.write((byte) i);
            return;
        }
        if (i < 2048) {
            outputStream.write(((i >> 6) & 31) | 192);
            outputStream.write((i & 63) | 128);
            return;
        }
        if (i >= 55296 && i <= 57343) {
            char c2 = (char) i;
            if (Character.isHighSurrogate(c2)) {
                this.f43457 = c2;
                this.f43456 = true;
                return;
            } else {
                outputStream.write(63);
                return;
            }
        }
        outputStream.write(((i >> 12) & 15) | BERTags.FLAGS);
        outputStream.write(((i >> 6) & 63) | 128);
        outputStream.write((i & 63) | 128);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) throws IOException {
        int codePoint;
        boolean z = this.f43456;
        int i3 = 0;
        OutputStream outputStream = this.f43458;
        if (z && i2 > 0) {
            this.f43456 = false;
            char c = this.f43457;
            char c2 = cArr[i];
            int codePoint2 = Character.isLowSurrogate(c2) ? Character.toCodePoint(c, c2) : -1;
            if (codePoint2 < 0) {
                outputStream.write(63);
            } else {
                outputStream.write((codePoint2 >> 18) | 240);
                outputStream.write(((codePoint2 >> 12) & 63) | 128);
                outputStream.write(((codePoint2 >> 6) & 63) | 128);
                outputStream.write((codePoint2 & 63) | 128);
                i++;
                i2--;
            }
        }
        while (i3 < i2) {
            int i4 = i + i3;
            char c3 = cArr[i4];
            if (c3 < 128) {
                outputStream.write((byte) c3);
            } else if (c3 < 2048) {
                outputStream.write(((c3 >> 6) & 31) | 192);
                outputStream.write((c3 & '?') | 128);
            } else if (c3 < 55296 || c3 > 57343) {
                outputStream.write(((c3 >> '\f') & 15) | BERTags.FLAGS);
                outputStream.write(((c3 >> 6) & 63) | 128);
                outputStream.write((c3 & '?') | 128);
            } else {
                int i5 = i3 + 1;
                if (i5 < i2) {
                    char c4 = cArr[i4 + 1];
                    if (Character.isHighSurrogate(c3) && Character.isLowSurrogate(c4)) {
                        codePoint = Character.toCodePoint(c3, c4);
                    }
                    if (codePoint < 0) {
                        outputStream.write(63);
                    } else {
                        outputStream.write((codePoint >> 18) | 240);
                        outputStream.write(((codePoint >> 12) & 63) | 128);
                        outputStream.write(((codePoint >> 6) & 63) | 128);
                        outputStream.write((codePoint & 63) | 128);
                        i3 = i5;
                    }
                } else if (Character.isHighSurrogate(c3)) {
                    this.f43457 = c3;
                    this.f43456 = true;
                    return;
                }
                codePoint = -1;
                if (codePoint < 0) {
                    outputStream.write(63);
                } else {
                    outputStream.write((codePoint >> 18) | 240);
                    outputStream.write(((codePoint >> 12) & 63) | 128);
                    outputStream.write(((codePoint >> 6) & 63) | 128);
                    outputStream.write((codePoint & 63) | 128);
                    i3 = i5;
                }
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1  */
    /* JADX INFO: renamed from: ֫ */
    private void m34678(int i, int i2, CharSequence charSequence) throws IOException {
        int codePoint;
        boolean z = this.f43456;
        int i3 = 0;
        OutputStream outputStream = this.f43458;
        if (z && i2 > 0) {
            this.f43456 = false;
            char c = this.f43457;
            char cCharAt = charSequence.charAt(i);
            int codePoint2 = Character.isLowSurrogate(cCharAt) ? Character.toCodePoint(c, cCharAt) : -1;
            if (codePoint2 < 0) {
                outputStream.write(63);
            } else {
                outputStream.write((codePoint2 >> 18) | 240);
                outputStream.write(((codePoint2 >> 12) & 63) | 128);
                outputStream.write(((codePoint2 >> 6) & 63) | 128);
                outputStream.write((codePoint2 & 63) | 128);
                i++;
                i2--;
            }
        }
        while (i3 < i2) {
            int i4 = i + i3;
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 < 128) {
                outputStream.write((byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                outputStream.write(((cCharAt2 >> 6) & 31) | 192);
                outputStream.write((cCharAt2 & '?') | 128);
            } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                outputStream.write(((cCharAt2 >> '\f') & 15) | BERTags.FLAGS);
                outputStream.write(((cCharAt2 >> 6) & 63) | 128);
                outputStream.write((cCharAt2 & '?') | 128);
            } else {
                int i5 = i3 + 1;
                if (i5 < i2) {
                    char cCharAt3 = charSequence.charAt(i4 + 1);
                    if (Character.isHighSurrogate(cCharAt2) && Character.isLowSurrogate(cCharAt3)) {
                        codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                    }
                    if (codePoint < 0) {
                        outputStream.write(63);
                    } else {
                        outputStream.write((codePoint >> 18) | 240);
                        outputStream.write(((codePoint >> 12) & 63) | 128);
                        outputStream.write(((codePoint >> 6) & 63) | 128);
                        outputStream.write((codePoint & 63) | 128);
                        i3 = i5;
                    }
                } else if (Character.isHighSurrogate(cCharAt2)) {
                    this.f43457 = cCharAt2;
                    this.f43456 = true;
                    return;
                }
                codePoint = -1;
                if (codePoint < 0) {
                    outputStream.write(63);
                } else {
                    outputStream.write((codePoint >> 18) | 240);
                    outputStream.write(((codePoint >> 12) & 63) | 128);
                    outputStream.write(((codePoint >> 6) & 63) | 128);
                    outputStream.write((codePoint & 63) | 128);
                    i3 = i5;
                }
            }
            i3++;
        }
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) throws IOException {
        m34678(i, i2, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) throws IOException {
        m34678(0, charSequence.length(), charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        m34678(i, i2 - i, charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        m34678(i, i2 - i, charSequence);
        return this;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() throws IOException {
        this.f43458.flush();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean z = this.f43456;
        OutputStream outputStream = this.f43458;
        if (z) {
            this.f43456 = false;
            outputStream.write(63);
        }
        outputStream.close();
    }
}
