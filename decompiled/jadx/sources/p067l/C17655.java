package p067l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ܺܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1WM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17655 implements InterfaceC2903 {

    /* JADX INFO: renamed from: ֫ */
    public int f52732;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC2903 f52733;

    /* JADX INFO: renamed from: ܽ */
    public long f52734;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC2903[] f52735;

    /* JADX INFO: renamed from: ᩳ */
    public long f52736;

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

    public C17655(InterfaceC2903... interfaceC2903Arr) {
        if (interfaceC2903Arr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f52735 = interfaceC2903Arr;
        this.f52732 = 0;
        this.f52733 = interfaceC2903Arr[0];
        this.f52734 = 0L;
        this.f52736 = 0L;
        for (InterfaceC2903 interfaceC2903 : interfaceC2903Arr) {
            this.f52736 = interfaceC2903.size() + this.f52736;
        }
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ۧ */
    public final long mo4684() {
        return size() - mo4680();
    }

    @Override // p067l.InterfaceC2903
    public final long size() {
        return this.f52736;
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final long mo4680() {
        return this.f52734;
    }

    @Override // p067l.InterfaceC2903
    public final void reset() {
        this.f52732 = 0;
        InterfaceC2903[] interfaceC2903Arr = this.f52735;
        this.f52733 = interfaceC2903Arr[0];
        this.f52734 = 0L;
        for (InterfaceC2903 interfaceC2903 : interfaceC2903Arr) {
            interfaceC2903.reset();
        }
    }

    @Override // p067l.InterfaceC2903
    /* JADX INFO: renamed from: ֫ */
    public final void mo4682(OutputStream outputStream, long j) throws EOFException {
        if (j > mo4684()) {
            throw new EOFException();
        }
        while (j > 0) {
            long jMin = Math.min(j, this.f52733.mo4684());
            this.f52733.mo4682(outputStream, jMin);
            j -= jMin;
            this.f52734 += jMin;
            if (this.f52733.mo4684() == 0) {
                int i = this.f52732;
                InterfaceC2903[] interfaceC2903Arr = this.f52735;
                if (i < interfaceC2903Arr.length - 1) {
                    int i2 = i + 1;
                    this.f52732 = i2;
                    this.f52733 = interfaceC2903Arr[i2];
                }
            }
        }
    }
}
