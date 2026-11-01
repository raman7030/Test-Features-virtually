package p067l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15347 implements InterfaceC6631 {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC4343 f43804 = new C24065(this);

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f43805;

    public C15347(AbstractC17043 abstractC17043) {
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        this.f43805 = c24618M38671;
        c24618M38671.setLength(0L);
    }

    @Override // p067l.InterfaceC6631
    public final void write(byte[] bArr) {
        C24618 c24618 = this.f43805;
        c24618.getClass();
        c24618.write(bArr, 0, bArr.length);
    }

    @Override // p067l.InterfaceC6631
    public final void seek(long j) {
        this.f43805.seek(j);
    }

    @Override // p067l.InterfaceC6631
    public final long getPosition() {
        return this.f43805.getFilePointer();
    }

    @Override // p067l.InterfaceC6631
    public final void writeByte(int i) {
        this.f43805.write(i);
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ۡ */
    public final void mo15113(int i) {
        this.f43805.m54257(i);
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15109(char c) {
        this.f43805.m54255(c);
    }

    @Override // p067l.InterfaceC6631
    public final void writeInt(int i) {
        this.f43805.writeInt(i);
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15112(int[] iArr) {
        for (int i : iArr) {
            this.f43805.writeInt(i);
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15111(short s) {
        C24618 c24618 = this.f43805;
        c24618.write(s & 255);
        c24618.write((s >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34931(byte[] bArr) {
        int length = bArr.length;
        C24618 c24618 = this.f43805;
        c24618.writeInt(length);
        c24618.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34929(CharSequence charSequence) {
        C24618 c24618 = this.f43805;
        if (charSequence == null) {
            c24618.writeInt(0);
            return;
        }
        c24618.writeInt(C7855.m18152(charSequence));
        try {
            C7855.m18157(this.f43804, charSequence, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34930(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        C24618 c24618 = this.f43805;
        c24618.getClass();
        c24618.write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ֫ */
    public final void mo15110(int i, String str) {
        C24618 c24618;
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (true) {
            int length = charArray.length;
            c24618 = this.f43805;
            if (i2 >= length || i == 0) {
                break;
            }
            c24618.m54255(charArray[i2]);
            i--;
            i2++;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c24618.m54255((char) 0);
        }
    }

    @Override // p067l.InterfaceC6631
    public final void skipBytes(int i) {
        C24618 c24618 = this.f43805;
        int iSkipBytes = i - c24618.skipBytes(i);
        for (int i2 = 0; i2 < iSkipBytes; i2++) {
            c24618.write(0);
        }
    }

    @Override // p067l.InterfaceC6631
    /* JADX INFO: renamed from: ᩷ܽ */
    public final void mo15114() {
        skipBytes(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43805.close();
    }
}
