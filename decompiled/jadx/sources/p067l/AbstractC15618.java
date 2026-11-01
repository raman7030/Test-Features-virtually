package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ܰܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 67MK */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15618 implements InterfaceC19683 {

    /* JADX INFO: renamed from: ۧ */
    public long f44703 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final long f44704;

    public AbstractC15618(long j) {
        this.f44704 = j;
    }

    @Override // p067l.InterfaceC19683
    public final boolean next() {
        long j = this.f44703 + 1;
        this.f44703 = j;
        return !(j > this.f44704);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m35501() {
        long j = this.f44703;
        if (j < 0 || j > this.f44704) {
            throw new NoSuchElementException();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m35502() {
        return this.f44703;
    }
}
