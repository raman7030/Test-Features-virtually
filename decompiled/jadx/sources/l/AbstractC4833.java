package l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۙᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4833 implements InterfaceC7222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15269 = new ArrayDeque();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15270;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f15271;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22472 f15272;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f15273;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f15274;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15275;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14074(C18239 c18239);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC13571 mo14077();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public abstract boolean mo14078();

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ֫ */
    public final void mo4862(Object obj) {
        C18239 c18239 = (C18239) obj;
        C22632.m50631(c18239 == this.f15272);
        C22472 c22472 = (C22472) c18239;
        if (c22472.m12697()) {
            long j = this.f15271;
            this.f15271 = 1 + j;
            c22472.f72776 = j;
            this.f15275.add(c22472);
        } else {
            long j2 = c22472.f69997;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f15274;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f15271;
                    this.f15271 = 1 + j4;
                    c22472.f72776 = j4;
                    this.f15275.add(c22472);
                } else {
                    c22472.mo7();
                    this.f15269.add(c22472);
                }
            } else {
                long j5 = this.f15271;
                this.f15271 = 1 + j5;
                c22472.f72776 = j5;
                this.f15275.add(c22472);
            }
        }
        this.f15272 = null;
    }

    public AbstractC4833() {
        for (int i = 0; i < 10; i++) {
            this.f15269.add(new C22472(0));
        }
        this.f15270 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f15270.add(new C20356(new C21767(this)));
        }
        this.f15275 = new ArrayDeque();
        this.f15274 = -9223372036854775807L;
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ۧ */
    public final void mo4864(long j) {
        this.f15274 = j;
    }

    @Override // l.InterfaceC7222
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14072(long j) {
        this.f15273 = j;
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ܽ */
    public final Object mo4865() {
        C22632.m50634(this.f15272 == null);
        ArrayDeque arrayDeque = this.f15269;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C22472 c22472 = (C22472) arrayDeque.pollFirst();
        this.f15272 = c22472;
        return c22472;
    }

    @Override // l.InterfaceC1381
    /* JADX INFO: renamed from: ۧ */
    public AbstractC17533 mo4863() {
        AbstractC17533 abstractC17533;
        ArrayDeque arrayDeque = this.f15270;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f15275;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C22472 c22472 = (C22472) arrayDeque2.peek();
            String str = C3603.f11424;
            if (c22472.f69997 > this.f15273) {
                return null;
            }
            C22472 c22473 = (C22472) arrayDeque2.poll();
            boolean zM12697 = c22473.m12697();
            ArrayDeque arrayDeque3 = this.f15269;
            if (zM12697) {
                abstractC17533 = (AbstractC17533) arrayDeque.pollFirst();
                abstractC17533.m12691(4);
            } else {
                mo14074((C18239) c22473);
                if (mo14078()) {
                    InterfaceC13571 interfaceC13571Mo14077 = mo14077();
                    abstractC17533 = (AbstractC17533) arrayDeque.pollFirst();
                    abstractC17533.m40971(c22473.f69997, interfaceC13571Mo14077, C13132.FOREVER_NS);
                } else {
                    c22473.mo7();
                    arrayDeque3.add(c22473);
                }
            }
            c22473.mo7();
            arrayDeque3.add(c22473);
            return abstractC17533;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14073(AbstractC17533 abstractC17533) {
        abstractC17533.mo7();
        this.f15270.add(abstractC17533);
    }

    @Override // l.InterfaceC1381
    public void flush() {
        ArrayDeque arrayDeque;
        this.f15271 = 0L;
        this.f15273 = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f15275;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f15269;
            if (zIsEmpty) {
                break;
            }
            C22472 c22472 = (C22472) arrayDeque2.poll();
            String str = C3603.f11424;
            c22472.mo7();
            arrayDeque.add(c22472);
        }
        C22472 c22473 = this.f15272;
        if (c22473 != null) {
            c22473.mo7();
            arrayDeque.add(c22473);
            this.f15272 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC17533 m14076() {
        return (AbstractC17533) this.f15270.pollFirst();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m14075() {
        return this.f15273;
    }
}
