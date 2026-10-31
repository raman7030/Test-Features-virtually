package l;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۨۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69RK */
/* JADX INFO: loaded from: classes4.dex */
public final class C11541 implements InterfaceC20008 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0521 f34462;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f34463;

    public C11541(AbstractC15440 abstractC15440) {
        this.f34463 = abstractC15440.m36513("r");
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f34463.skipBytes(i) != i) {
            throw new EOFException();
        }
    }

    public final void seek(long j) {
        this.f34463.seek(j);
    }

    public final byte readByte() {
        return this.f34463.readByte();
    }

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final int m28419() {
        return this.f34463.mo21172();
    }

    @Override // l.InterfaceC20008
    public final int readInt() {
        return this.f34463.readInt();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28418() {
        C23411 c23411 = this.f34463;
        long filePointer = c23411.getFilePointer();
        int i = c23411.readInt();
        c23411.seek(filePointer);
        return i;
    }

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m28420() throws EOFException {
        C23411 c23411 = this.f34463;
        int i = c23411.readInt();
        byte[] bArr = new byte[i];
        c23411.m51858(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28422() {
        C23411 c23411 = this.f34463;
        int i = c23411.readInt();
        byte[] bArr = new byte[i];
        c23411.m51858(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m28421() {
        C0521 c0521 = this.f34462;
        if (c0521 == null) {
            c0521 = new C0521();
            this.f34462 = c0521;
        } else {
            c0521.m2232();
        }
        while (true) {
            int i = this.f34463.read();
            if (i > 0) {
                c0521.write(i);
            } else {
                return new String(c0521.f2176, 0, c0521.f2177, StandardCharsets.UTF_8);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34463.close();
    }
}
