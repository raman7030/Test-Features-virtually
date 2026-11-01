package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ۤۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: M5I6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11996 implements InterfaceC6631 {

    /* JADX INFO: renamed from: ۗ */
    public final C17441 f33449;

    /* JADX INFO: renamed from: ۙ */
    public int f33450;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC4343 f33451;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f33452;

    /* JADX INFO: renamed from: ᩹ */
    public int f33453;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public C11996() {
        this(1024);
    }

    public C11996(int i) {
        this.f33451 = new C14007(this);
        this.f33449 = new C17441();
        this.f33452 = new byte[i];
        this.f33453 = 0;
        this.f33450 = 0;
    }

    @Override // p067l.InterfaceC6631
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i > bArr.length || i2 < 0 || (i + i2) - bArr.length > 0) {
            throw new IndexOutOfBoundsException();
        }
        m27437(this.f33450 + i2);
        System.arraycopy(bArr, i, this.f33452, this.f33450, i2);
        int i3 = this.f33450 + i2;
        this.f33450 = i3;
        if (i3 > this.f33453) {
            this.f33453 = i3;
        }
    }

    @Override // p067l.InterfaceC6631
    public final void seek(long j) {
        if (j == -1) {
            this.f33450 = this.f33453;
        } else {
            if (j < 0 || j > this.f33453) {
                throw new IndexOutOfBoundsException();
            }
            this.f33450 = (int) j;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27440(int i) {
        this.f33453 = i;
        if (this.f33450 > i) {
            this.f33450 = i;
        }
    }

    @Override // p067l.InterfaceC6631
    public final long getPosition() {
        return this.f33450;
    }

    @Override // p067l.InterfaceC6631
    public final void writeByte(int i) {
        m27437(this.f33450 + 1);
        byte[] bArr = this.f33452;
        int i2 = this.f33450;
        int i3 = i2 + 1;
        this.f33450 = i3;
        bArr[i2] = (byte) i;
        if (i3 > this.f33453) {
            this.f33453 = i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27444(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m27445(true);
            m27459(str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27445(boolean z) {
        writeByte(z ? 255 : 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27452(String str) {
        if (str == null) {
            writeByte(0);
        } else {
            m27445(true);
            m27443((CharSequence) str);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27442(Boolean bool) {
        if (bool == null) {
            writeByte(0);
        } else if (bool.booleanValue()) {
            writeByte(1);
        } else {
            writeByte(2);
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15111(short s) {
        m27437(this.f33450 + 2);
        byte[] bArr = this.f33452;
        int i = this.f33450;
        int i2 = i + 1;
        this.f33450 = i2;
        bArr[i] = (byte) (s & 255);
        int i3 = i + 2;
        this.f33450 = i3;
        bArr[i2] = (byte) ((s >>> 8) & 255);
        if (i3 > this.f33453) {
            this.f33453 = i3;
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ۡ */
    public final void mo15113(int i) {
        if (i < 0 || i > 65535) {
            throw new RuntimeException(C20778.m46922(i, "Data out of range (UShort): "));
        }
        m27437(this.f33450 + 2);
        byte[] bArr = this.f33452;
        int i2 = this.f33450;
        int i3 = i2 + 1;
        this.f33450 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f33450 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        if (i4 > this.f33453) {
            this.f33453 = i4;
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15109(char c) {
        m27437(this.f33450 + 2);
        byte[] bArr = this.f33452;
        int i = this.f33450;
        int i2 = i + 1;
        this.f33450 = i2;
        bArr[i] = (byte) (c & 255);
        int i3 = i + 2;
        this.f33450 = i3;
        bArr[i2] = (byte) ((c >>> '\b') & 255);
        if (i3 > this.f33453) {
            this.f33453 = i3;
        }
    }

    @Override // p067l.InterfaceC6631
    public final void writeInt(int i) {
        m27437(this.f33450 + 4);
        byte[] bArr = this.f33452;
        int i2 = this.f33450;
        int i3 = i2 + 1;
        this.f33450 = i3;
        bArr[i2] = (byte) (i & 255);
        int i4 = i2 + 2;
        this.f33450 = i4;
        bArr[i3] = (byte) ((i >>> 8) & 255);
        int i5 = i2 + 3;
        this.f33450 = i5;
        bArr[i4] = (byte) ((i >>> 16) & 255);
        int i6 = i2 + 4;
        this.f33450 = i6;
        bArr[i5] = (byte) ((i >>> 24) & 255);
        if (i6 > this.f33453) {
            this.f33453 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27450(int i) {
        m27437(this.f33450 + 4);
        byte[] bArr = this.f33452;
        int i2 = this.f33450;
        int i3 = i2 + 1;
        this.f33450 = i3;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i2 + 2;
        this.f33450 = i4;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i2 + 3;
        this.f33450 = i5;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i2 + 4;
        this.f33450 = i6;
        bArr[i5] = (byte) (i & 255);
        if (i6 > this.f33453) {
            this.f33453 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27451(long j) {
        m27437(this.f33450 + 8);
        byte[] bArr = this.f33452;
        int i = this.f33450;
        int i2 = i + 1;
        this.f33450 = i2;
        bArr[i] = (byte) (j & 255);
        int i3 = i + 2;
        this.f33450 = i3;
        bArr[i2] = (byte) ((j >>> 8) & 255);
        int i4 = i + 3;
        this.f33450 = i4;
        bArr[i3] = (byte) ((j >>> 16) & 255);
        int i5 = i + 4;
        this.f33450 = i5;
        bArr[i4] = (byte) ((j >>> 24) & 255);
        int i6 = i + 5;
        this.f33450 = i6;
        bArr[i5] = (byte) ((j >>> 32) & 255);
        int i7 = i + 6;
        this.f33450 = i7;
        bArr[i6] = (byte) ((j >>> 40) & 255);
        int i8 = i + 7;
        this.f33450 = i8;
        bArr[i7] = (byte) ((j >>> 48) & 255);
        int i9 = i + 8;
        this.f33450 = i9;
        bArr[i8] = (byte) ((j >>> 56) & 255);
        if (i9 > this.f33453) {
            this.f33453 = i9;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27439(float f) {
        writeInt(Float.floatToIntBits(f));
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15112(int[] iArr) {
        m27437((iArr.length * 4) + this.f33450);
        for (int i : iArr) {
            byte[] bArr = this.f33452;
            int i2 = this.f33450;
            int i3 = i2 + 1;
            this.f33450 = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.f33450 = i4;
            bArr[i3] = (byte) ((i >>> 8) & 255);
            int i5 = i2 + 3;
            this.f33450 = i5;
            bArr[i4] = (byte) ((i >>> 16) & 255);
            this.f33450 = i2 + 4;
            bArr[i5] = (byte) ((i >>> 24) & 255);
        }
        int i6 = this.f33450;
        if (i6 > this.f33453) {
            this.f33453 = i6;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27454(byte[] bArr) {
        writeInt(bArr.length);
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27455(int[] iArr) {
        writeInt(iArr.length);
        for (int i : iArr) {
            writeInt(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27443(CharSequence charSequence) {
        if (charSequence == null) {
            writeInt(0);
            return;
        }
        int iM18152 = C7855.m18152(charSequence);
        writeInt(iM18152);
        m27437(this.f33450 + iM18152);
        try {
            C7855.m18157(this.f33451, charSequence, false);
            int i = this.f33450;
            if (i > this.f33453) {
                this.f33453 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m27462(String str) {
        if (str == null) {
            mo15113(0);
            return;
        }
        int iM18152 = C7855.m18152(str);
        mo15113(iM18152);
        m27437(this.f33450 + iM18152);
        try {
            C7855.m18157(this.f33451, (CharSequence) str, false);
            int i = this.f33450;
            if (i > this.f33453) {
                this.f33453 = i;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m27459(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15110(int i, String str) {
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length && i != 0; i2++) {
            mo15109(charArray[i2]);
            i--;
        }
        if (i > 0) {
            int i3 = i * 2;
            m27437(this.f33450 + i3);
            byte[] bArr = this.f33452;
            int i4 = this.f33450;
            Arrays.fill(bArr, i4, i4 + i3, (byte) 0);
            int i5 = this.f33450 + i3;
            this.f33450 = i5;
            if (i5 > this.f33453) {
                this.f33453 = i5;
            }
        }
    }

    @Override // p067l.InterfaceC6631
    public final void skipBytes(int i) {
        m27437(this.f33450 + i);
        int i2 = this.f33450 + i;
        this.f33450 = i2;
        if (i2 > this.f33453) {
            this.f33453 = i2;
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ᩷ܽ */
    public final void mo15114() {
        skipBytes(4);
    }

    public final long length() {
        return this.f33453;
    }

    public final int size() {
        return this.f33453;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m27460() {
        this.f33453 = 0;
        this.f33450 = 0;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] m27464() {
        return Arrays.copyOf(this.f33452, this.f33453);
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m27458() {
        return this.f33452;
    }

    /* JADX INFO: renamed from: ۜ */
    public final byte[] m27449() {
        return C6054.m13643(this.f33452, this.f33453);
    }

    /* JADX INFO: renamed from: ۖ */
    public final byte[] m27447() {
        return C6054.m13640(0, this.f33453, this.f33452);
    }

    /* JADX INFO: renamed from: ۘ */
    public final byte[] m27448() {
        try {
            return C10116.m23593(this.f33452, this.f33453);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27441(OutputStream outputStream) throws IOException {
        outputStream.write(this.f33452, 0, this.f33453);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m27453(MessageDigest messageDigest) {
        messageDigest.update(this.f33452, 0, this.f33453);
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m27446(MessageDigest messageDigest) {
        messageDigest.update(this.f33452, 0, this.f33453);
        return messageDigest.digest();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m27437(int i) {
        byte[] bArr = this.f33452;
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
            this.f33452 = Arrays.copyOf(bArr, length);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m27456() {
        this.f33449.add(this.f33450);
        writeInt(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27438() {
        int iM28313 = this.f33449.m28313();
        C17548.m39930(iM28313, (this.f33450 - iM28313) - 4, this.f33452);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m27461(int i) {
        m27437(this.f33450 + 5);
        byte[] bArr = this.f33452;
        while ((((long) i) & 4294967295L) > 127) {
            int i2 = this.f33450;
            this.f33450 = i2 + 1;
            bArr[i2] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i3 = this.f33450;
        int i4 = i3 + 1;
        this.f33450 = i4;
        bArr[i3] = (byte) i;
        if (i4 > this.f33453) {
            this.f33453 = i4;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m27457(int i) {
        m27437(this.f33450 + 5);
        byte[] bArr = this.f33452;
        if (i >= 0) {
            while (i > 63) {
                int i2 = this.f33450;
                this.f33450 = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
        } else {
            while (i < -64) {
                int i3 = this.f33450;
                this.f33450 = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>= 7;
            }
        }
        int i4 = this.f33450;
        int i5 = i4 + 1;
        this.f33450 = i5;
        bArr[i4] = (byte) (i & 127);
        if (i5 > this.f33453) {
            this.f33453 = i5;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m27463() {
        byte[] bArr = this.f33452;
        int length = bArr.length;
        int i = this.f33453;
        if (length != i) {
            this.f33452 = Arrays.copyOf(bArr, i);
        }
    }
}
