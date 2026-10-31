package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۤۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10130 implements InterfaceC4485 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15859 f30487;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30488;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC2077 f30489;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f30490;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30491;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C10130() {
        this(1024);
    }

    public C10130(int i) {
        this.f30489 = new C12246(this);
        this.f30487 = new C15859();
        this.f30490 = new byte[i];
        this.f30491 = 0;
        this.f30488 = 0;
    }

    @Override // l.InterfaceC4485
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || (i + i2) - bArr.length > 0) {
            throw new IndexOutOfBoundsException();
        }
        m25417(this.f30488 + i2);
        System.arraycopy(bArr, i, this.f30490, this.f30488, i2);
        int i3 = this.f30488 + i2;
        this.f30488 = i3;
        if (i3 > this.f30491) {
            this.f30491 = i3;
        }
    }

    @Override // l.InterfaceC4485
    public final void seek(long j) {
        if (j == -1) {
            this.f30488 = this.f30491;
        } else {
            if (j < 0 || j > this.f30491) {
                throw new IndexOutOfBoundsException();
            }
            this.f30488 = (int) j;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25420(int i) {
        this.f30491 = i;
        if (this.f30488 > i) {
            this.f30488 = i;
        }
    }

    @Override // l.InterfaceC4485
    public final long getPosition() {
        return this.f30488;
    }

    @Override // l.InterfaceC4485
    public final void writeByte(int i) {
        m25417(this.f30488 + 1);
        byte[] bArr = this.f30490;
        int i2 = this.f30488;
        int i3 = i2 + 1;
        this.f30488 = i3;
        bArr[i2] = (byte) i;
        if (i3 > this.f30491) {
            this.f30491 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25424(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m25425(true);
            m25439(str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25425(boolean z) {
        writeByte(z ? 255 : 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25432(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m25425(true);
            m25423((CharSequence) str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25422(Boolean bool) {
        if (bool == null) {
            writeByte(0);
        } else if (bool.booleanValue()) {
            writeByte(1);
        } else {
            writeByte(2);
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13229(short s) {
        m25417(this.f30488 + 2);
        byte[] bArr = this.f30490;
        int i = this.f30488;
        int i2 = i + 1;
        this.f30488 = i2;
        bArr[i] = (byte) (s & 255);
        int i3 = i + 2;
        this.f30488 = i3;
        bArr[i2] = (byte) ((s >>> 8) & 255);
        if (i3 > this.f30491) {
            this.f30491 = i3;
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۡ */
    public final void mo13231(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException(C19370.m44628(i, "Data out of range (UShort): "));
        }
        m25417(this.f30488 + 2);
        byte[] bArr = this.f30490;
        int i2 = this.f30488;
        int i3 = i2 + 1;
        this.f30488 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f30488 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        if (i4 > this.f30491) {
            this.f30491 = i4;
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13227(char c) {
        m25417(this.f30488 + 2);
        byte[] bArr = this.f30490;
        int i = this.f30488;
        int i2 = i + 1;
        this.f30488 = i2;
        bArr[i] = (byte) (c & 255);
        int i3 = i + 2;
        this.f30488 = i3;
        bArr[i2] = (byte) ((c >>> '\b') & 255);
        if (i3 > this.f30491) {
            this.f30491 = i3;
        }
    }

    @Override // l.InterfaceC4485
    public final void writeInt(int i) {
        m25417(this.f30488 + 4);
        byte[] bArr = this.f30490;
        int i2 = this.f30488;
        int i3 = i2 + 1;
        this.f30488 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f30488 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i2 + 3;
        this.f30488 = i5;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        int i6 = i2 + 4;
        this.f30488 = i6;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        if (i6 > this.f30491) {
            this.f30491 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25430(int i) {
        m25417(this.f30488 + 4);
        byte[] bArr = this.f30490;
        int i2 = this.f30488;
        int i3 = i2 + 1;
        this.f30488 = i3;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i2 + 2;
        this.f30488 = i4;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i2 + 3;
        this.f30488 = i5;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i2 + 4;
        this.f30488 = i6;
        bArr[i5] = (byte) (i & 255);
        if (i6 > this.f30491) {
            this.f30491 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25431(long j) {
        m25417(this.f30488 + 8);
        byte[] bArr = this.f30490;
        int i = this.f30488;
        int i2 = i + 1;
        this.f30488 = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f30488 = i3;
        bArr[i2] = (byte) ((j >>> 8) & 255);
        int i4 = i + 3;
        this.f30488 = i4;
        bArr[i3] = (byte) ((j >>> 16) & 255);
        int i5 = i + 4;
        this.f30488 = i5;
        bArr[i4] = (byte) ((j >>> 24) & 255);
        int i6 = i + 5;
        this.f30488 = i6;
        bArr[i5] = (byte) ((j >>> 32) & 255);
        int i7 = i + 6;
        this.f30488 = i7;
        bArr[i6] = (byte) ((j >>> 40) & 255);
        int i8 = i + 7;
        this.f30488 = i8;
        bArr[i7] = (byte) ((j >>> 48) & 255);
        int i9 = i + 8;
        this.f30488 = i9;
        bArr[i8] = (byte) ((j >>> 56) & 255);
        if (i9 > this.f30491) {
            this.f30491 = i9;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25419(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13230(int[] iArr) {
        m25417((iArr.length * 4) + this.f30488);
        for (int i : iArr) {
            byte[] bArr = this.f30490;
            int i2 = this.f30488;
            int i3 = i2 + 1;
            this.f30488 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f30488 = i4;
            bArr[i3] = (byte) ((i >>> 8) & 255);
            int i5 = i2 + 3;
            this.f30488 = i5;
            bArr[i4] = (byte) ((i >>> 16) & 255);
            this.f30488 = i2 + 4;
            bArr[i5] = (byte) ((i >>> 24) & 255);
        }
        int i6 = this.f30488;
        if (i6 > this.f30491) {
            this.f30491 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25434(byte[] bArr) {
        writeInt(bArr.length);
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25435(int[] iArr) {
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25423(CharSequence charSequence) {
        if (charSequence == null) {
            writeInt(0);
            return;
        }
        int iM16233 = C5773.m16233(charSequence);
        writeInt(iM16233);
        m25417(this.f30488 + iM16233);
        try {
            C5773.m16238(this.f30489, charSequence, false);
            int i = this.f30488;
            if (i > this.f30491) {
                this.f30491 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25442(String str) {
        if (str == null) {
            mo13231(0);
            return;
        }
        int iM16233 = C5773.m16233(str);
        mo13231(iM16233);
        m25417(this.f30488 + iM16233);
        try {
            C5773.m16238(this.f30489, (CharSequence) str, false);
            int i = this.f30488;
            if (i > this.f30491) {
                this.f30491 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m25439(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13228(int i, String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length && i != 0; i2++) {
            mo13227(charArray[i2]);
            i--;
        }
        if (i > 0) {
            int i3 = i * 2;
            m25417(this.f30488 + i3);
            byte[] bArr = this.f30490;
            int i4 = this.f30488;
            Arrays.fill(bArr, i4, i4 + i3, (byte) 0);
            int i5 = this.f30488 + i3;
            this.f30488 = i5;
            if (i5 > this.f30491) {
                this.f30491 = i5;
            }
        }
    }

    @Override // l.InterfaceC4485
    public final void skipBytes(int i) {
        m25417(this.f30488 + i);
        int i2 = this.f30488 + i;
        this.f30488 = i2;
        if (i2 > this.f30491) {
            this.f30491 = i2;
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩷ܽ */
    public final void mo13232() {
        skipBytes(4);
    }

    public final long length() {
        return this.f30491;
    }

    public final int size() {
        return this.f30491;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25440() {
        this.f30491 = 0;
        this.f30488 = 0;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m25444() {
        return Arrays.copyOf(this.f30490, this.f30491);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m25438() {
        return this.f30490;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final byte[] m25429() {
        return C3878.m11707(this.f30490, this.f30491);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final byte[] m25427() {
        return C3878.m11704(0, this.f30491, this.f30490);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] m25428() {
        try {
            return C8152.m21624(this.f30490, this.f30491);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25421(OutputStream outputStream) throws IOException {
        outputStream.write(this.f30490, 0, this.f30491);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25433(MessageDigest messageDigest) {
        messageDigest.update(this.f30490, 0, this.f30491);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m25426(MessageDigest messageDigest) {
        messageDigest.update(this.f30490, 0, this.f30491);
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25417(int i) {
        byte[] bArr = this.f30490;
        if (i - bArr.length > 0) {
            int length = bArr.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                length = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f30490 = Arrays.copyOf(bArr, length);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m25436() {
        this.f30487.add(this.f30488);
        writeInt(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25418() {
        int iM26284 = this.f30487.m26284();
        C15972.m37746(iM26284, (this.f30488 - iM26284) - 4, this.f30490);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m25441(int i) {
        m25417(this.f30488 + 5);
        byte[] bArr = this.f30490;
        while ((((long) i) & 4294967295L) > 127) {
            int i2 = this.f30488;
            this.f30488 = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i3 = this.f30488;
        int i4 = i3 + 1;
        this.f30488 = i4;
        bArr[i3] = (byte) i;
        if (i4 > this.f30491) {
            this.f30491 = i4;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m25437(int i) {
        m25417(this.f30488 + 5);
        byte[] bArr = this.f30490;
        if (i >= 0) {
            while (i > 63) {
                int i2 = this.f30488;
                this.f30488 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        } else {
            while (i < -64) {
                int i3 = this.f30488;
                this.f30488 = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>= 7;
            }
        }
        int i4 = this.f30488;
        int i5 = i4 + 1;
        this.f30488 = i5;
        bArr[i4] = (byte) (i & 127);
        if (i5 > this.f30491) {
            this.f30491 = i5;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m25443() {
        byte[] bArr = this.f30490;
        int length = bArr.length;
        int i = this.f30491;
        if (length != i) {
            this.f30490 = Arrays.copyOf(bArr, i);
        }
    }
}
