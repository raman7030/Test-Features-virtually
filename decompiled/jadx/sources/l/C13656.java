package l;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.ܰۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H9R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13656 implements InterfaceC4485 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC2077 f40723 = new C22829(this);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f40724;

    public C13656(AbstractC15440 abstractC15440) {
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        this.f40724 = c23411M36513;
        c23411M36513.setLength(0L);
    }

    @Override // l.InterfaceC4485
    public final void write(byte[] bArr) {
        C23411 c23411 = this.f40724;
        c23411.getClass();
        c23411.write(bArr, 0, bArr.length);
    }

    @Override // l.InterfaceC4485
    public final void seek(long j) {
        this.f40724.seek(j);
    }

    @Override // l.InterfaceC4485
    public final long getPosition() {
        return this.f40724.getFilePointer();
    }

    @Override // l.InterfaceC4485
    public final void writeByte(int i) {
        this.f40724.write(i);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ۡ */
    public final void mo13231(int i) {
        this.f40724.m51859(i);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13227(char c) {
        this.f40724.m51857(c);
    }

    @Override // l.InterfaceC4485
    public final void writeInt(int i) {
        this.f40724.writeInt(i);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13230(int[] iArr) {
        for (int i : iArr) {
            this.f40724.writeInt(i);
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13229(short s) {
        C23411 c23411 = this.f40724;
        c23411.write(s & 255);
        c23411.write((s >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32816(byte[] bArr) {
        int length = bArr.length;
        C23411 c23411 = this.f40724;
        c23411.writeInt(length);
        c23411.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32814(CharSequence charSequence) {
        C23411 c23411 = this.f40724;
        if (charSequence == null) {
            c23411.writeInt(0);
            return;
        }
        c23411.writeInt(C5773.m16233(charSequence));
        try {
            C5773.m16238(this.f40723, charSequence, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32815(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == 0) {
                bytes[i] = UTF8.S_CS3;
            }
        }
        C23411 c23411 = this.f40724;
        c23411.getClass();
        c23411.write(bytes, 0, bytes.length);
        writeByte(0);
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ֫ */
    public final void mo13228(int i, String str) {
        C23411 c23411;
        char[] charArray = str.toCharArray();
        int i2 = 0;
        while (true) {
            int length = charArray.length;
            c23411 = this.f40724;
            if (i2 >= length || i == 0) {
                break;
            }
            c23411.m51857(charArray[i2]);
            i--;
            i2++;
        }
        for (int i3 = 0; i3 < i; i3++) {
            c23411.m51857((char) 0);
        }
    }

    @Override // l.InterfaceC4485
    public final void skipBytes(int i) {
        C23411 c23411 = this.f40724;
        int iSkipBytes = i - c23411.skipBytes(i);
        for (int i2 = 0; i2 < iSkipBytes; i2++) {
            c23411.write(0);
        }
    }

    @Override // l.InterfaceC4485
    /* JADX INFO: renamed from: ᩷ܽ */
    public final void mo13232() {
        skipBytes(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40724.close();
    }
}
