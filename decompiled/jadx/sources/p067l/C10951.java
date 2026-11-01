package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۡܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1VQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10951 implements InterfaceC2903 {

    /* JADX INFO: renamed from: ֫ */
    public byte[] f30333;

    /* JADX INFO: renamed from: ۧ */
    public int f30334;

    /* JADX INFO: renamed from: ܽ */
    public int f30335;

    /* JADX INFO: renamed from: ᩳ */
    public int f30336;

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4681(long j, C24618 c24618) {
        C6257.m14198(this, c24618, j);
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo4683(MessageDigest messageDigest, long j) {
        C6257.m14197(this, messageDigest, j);
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ InterfaceC2903 mo4685() {
        return C6257.m14195(this);
    }

    public C10951(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            throw new IllegalArgumentException();
        }
        this.f30333 = bArr;
        this.f30336 = i;
        this.f30335 = i2;
        this.f30334 = 0;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ۧ */
    public final long mo4684() {
        return size() - mo4680();
    }

    @Override // p067l.InterfaceC2903
    public final long size() {
        return this.f30335;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final long mo4680() {
        return this.f30334;
    }

    @Override // p067l.InterfaceC2903
    public final void reset() {
        this.f30334 = 0;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final void mo4682(OutputStream outputStream, long j) throws IOException {
        if (j > mo4684()) {
            throw new EOFException();
        }
        outputStream.write(this.f30333, this.f30336 + this.f30334, (int) j);
        this.f30334 = (int) (((long) this.f30334) + j);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m25233() {
        return this.f30333;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m25232() {
        return this.f30336;
    }
}
