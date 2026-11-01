package p067l;

import java.io.EOFException;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۨۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 69RK */
/* JADX INFO: loaded from: classes4.dex */
public final class C13337 implements InterfaceC21384 {

    /* JADX INFO: renamed from: ᩸ */
    public C2864 f37459;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f37460;

    public C13337(AbstractC17043 abstractC17043) {
        this.f37460 = abstractC17043.m38671("r");
    }

    public final void skipBytes(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (this.f37460.skipBytes(i) != i) {
            throw new EOFException();
        }
    }

    public final void seek(long j) {
        this.f37460.seek(j);
    }

    public final byte readByte() {
        return this.f37460.readByte();
    }

    /* JADX INFO: renamed from: ۛۧ */
    public final int m30465() {
        return this.f37460.mo23137();
    }

    @Override // p067l.InterfaceC21384
    public final int readInt() {
        return this.f37460.readInt();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30464() {
        C24618 c24618 = this.f37460;
        long filePointer = c24618.getFilePointer();
        int i = c24618.readInt();
        c24618.seek(filePointer);
        return i;
    }

    /* JADX INFO: renamed from: ۜۧ */
    public final byte[] m30466() throws EOFException {
        C24618 c24618 = this.f37460;
        int i = c24618.readInt();
        byte[] bArr = new byte[i];
        c24618.m54256(bArr, 0, i);
        return bArr;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m30468() {
        C24618 c24618 = this.f37460;
        int i = c24618.readInt();
        byte[] bArr = new byte[i];
        c24618.m54256(bArr, 0, i);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m30467() {
        C2864 c2864 = this.f37459;
        if (c2864 == null) {
            c2864 = new C2864();
            this.f37459 = c2864;
        } else {
            c2864.m4599();
        }
        while (true) {
            int i = this.f37460.read();
            if (i > 0) {
                c2864.write(i);
            } else {
                return new String(c2864.f4949, 0, c2864.f4950, StandardCharsets.UTF_8);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f37460.close();
    }
}
