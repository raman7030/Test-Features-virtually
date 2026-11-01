package p067l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֨ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1W6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3574 implements InterfaceC2903 {

    /* JADX INFO: renamed from: ֫ */
    public long f7256;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC9866 f7257;

    /* JADX INFO: renamed from: ܽ */
    public long f7258;

    /* JADX INFO: renamed from: ᩳ */
    public long f7259;

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
        return C6257.m14195((InterfaceC2903) this);
    }

    public C3574(InterfaceC9866 interfaceC9866, long j, long j2) {
        this.f7257 = interfaceC9866;
        this.f7259 = j;
        this.f7258 = j2;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ۧ */
    public final long mo4684() {
        return size() - mo4680();
    }

    @Override // p067l.InterfaceC2903
    public final long size() {
        return this.f7258;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final long mo4680() {
        return this.f7256;
    }

    @Override // p067l.InterfaceC2903
    public final void reset() {
        this.f7256 = 0L;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final void mo4682(OutputStream outputStream, long j) {
        int i;
        if (j > mo4684()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[4096];
        long j2 = this.f7259 + this.f7256;
        InterfaceC9866 interfaceC9866 = this.f7257;
        interfaceC9866.seek(j2);
        while (j > 0 && (i = interfaceC9866.read(bArr, 0, (int) Math.min(j, 4096))) != -1) {
            outputStream.write(bArr, 0, i);
            long j3 = i;
            j -= j3;
            this.f7256 += j3;
        }
        if (j != 0) {
            throw new IllegalStateException(C17588.m40051(j, "Remaining length: "));
        }
    }
}
