package p067l;

import java.io.IOException;
import java.util.function.LongSupplier;

/* JADX INFO: renamed from: l.۬ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: F70U */
/* JADX INFO: loaded from: classes4.dex */
public final class C14872 implements InterfaceC16134 {

    /* JADX INFO: renamed from: ֫ */
    public final int f42374;

    /* JADX INFO: renamed from: ۧ */
    public boolean f42375;

    /* JADX INFO: renamed from: ܳ */
    public final C5485 f42376;

    /* JADX INFO: renamed from: ܽ */
    public long f42377 = -1;

    /* JADX INFO: renamed from: ܿ */
    public int f42378;

    /* JADX INFO: renamed from: ᩳ */
    public final LongSupplier f42379;

    /* JADX INFO: renamed from: ᩻ */
    public final C14202 f42380;

    public C14872(C14202 c14202, C5485 c5485, C17142 c17142, int i) {
        this.f42380 = c14202;
        this.f42376 = c5485;
        this.f42379 = c17142;
        this.f42374 = i;
    }

    @Override // p067l.InterfaceC16134
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC20315 mo33975() {
        return this.f42376;
    }

    @Override // p067l.InterfaceC16134
    public final int position() {
        return this.f42378;
    }

    @Override // p067l.InterfaceC16134
    /* JADX INFO: renamed from: ֫ */
    public final void mo33976(int i, byte[] bArr) throws IOException {
        if (this.f42375) {
            throw new IllegalStateException("Hex restore delta entry is finished");
        }
        C14202.m32676(this.f42380);
        C10927.m25189(bArr.length, 0, i);
        if (i == 0) {
            return;
        }
        long j = i;
        if (((long) this.f42378) + j > this.f42374) {
            throw new IOException("Hex restore delta exceeds entry length");
        }
        long asLong = this.f42379.getAsLong();
        if (asLong < j) {
            throw new IOException("Invalid hex checkpoint delta offset");
        }
        long j2 = asLong - j;
        long j3 = this.f42377;
        if (j3 < 0) {
            this.f42377 = j2;
        } else {
            long j4 = this.f42378;
            if (j2 < j4 || j3 != j2 - j4) {
                throw new IOException("Non-contiguous hex checkpoint delta entry");
            }
        }
        this.f42378 += i;
    }

    @Override // p067l.InterfaceC16134
    public final void finish() throws IOException {
        if (this.f42375) {
            return;
        }
        C14202 c14202 = this.f42380;
        C14202.m32676(c14202);
        if (this.f42378 != this.f42374) {
            throw new IOException("Incomplete hex restore delta entry");
        }
        this.f42376.m12118(this.f42377);
        this.f42375 = true;
        C14202.m32675(c14202, this);
    }
}
