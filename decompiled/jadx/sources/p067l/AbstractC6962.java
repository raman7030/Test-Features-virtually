package p067l;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: l.ۙᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6962 implements InterfaceC9232 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayDeque f18102 = new ArrayDeque();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayDeque f18103;

    /* JADX INFO: renamed from: ܳ */
    public long f18104;

    /* JADX INFO: renamed from: ܽ */
    public C23726 f18105;

    /* JADX INFO: renamed from: ܿ */
    public long f18106;

    /* JADX INFO: renamed from: ᩳ */
    public long f18107;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayDeque f18108;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo15954(C19703 c19703);

    /* JADX INFO: renamed from: ᩳ */
    public abstract InterfaceC15266 mo15957();

    /* JADX INFO: renamed from: ᩻ */
    public abstract boolean mo15958();

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ֫ */
    public final void mo7100(Object obj) {
        C19703 c19703 = (C19703) obj;
        C23877.m52957(c19703 == this.f18105);
        C23726 c23726 = (C23726) c19703;
        if (c23726.m14573()) {
            long j = this.f18104;
            this.f18104 = 1 + j;
            c23726.f75503 = j;
            this.f18108.add(c23726);
        } else {
            long j2 = c23726.f72706;
            if (j2 != Long.MIN_VALUE) {
                long j3 = this.f18107;
                if (j3 == -9223372036854775807L || j2 >= j3) {
                    long j4 = this.f18104;
                    this.f18104 = 1 + j4;
                    c23726.f75503 = j4;
                    this.f18108.add(c23726);
                } else {
                    c23726.mo7();
                    this.f18102.add(c23726);
                }
            } else {
                long j5 = this.f18104;
                this.f18104 = 1 + j5;
                c23726.f75503 = j5;
                this.f18108.add(c23726);
            }
        }
        this.f18105 = null;
    }

    public AbstractC6962() {
        for (int i = 0; i < 10; i++) {
            this.f18102.add(new C23726(0));
        }
        this.f18103 = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f18103.add(new C21715(new C23056(this)));
        }
        this.f18108 = new ArrayDeque();
        this.f18107 = -9223372036854775807L;
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ۧ */
    public final void mo7102(long j) {
        this.f18107 = j;
    }

    @Override // p067l.InterfaceC9232
    /* JADX INFO: renamed from: ֫ */
    public void mo15952(long j) {
        this.f18106 = j;
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ܽ */
    public final Object mo7103() {
        C23877.m52960(this.f18105 == null);
        ArrayDeque arrayDeque = this.f18102;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C23726 c23726 = (C23726) arrayDeque.pollFirst();
        this.f18105 = c23726;
        return c23726;
    }

    @Override // p067l.InterfaceC3681
    /* JADX INFO: renamed from: ۧ */
    public AbstractC19032 mo7101() {
        AbstractC19032 abstractC19032;
        ArrayDeque arrayDeque = this.f18103;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.f18108;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            C23726 c23726 = (C23726) arrayDeque2.peek();
            String str = C5792.f14228;
            if (c23726.f72706 > this.f18106) {
                return null;
            }
            C23726 c23727 = (C23726) arrayDeque2.poll();
            boolean zM14573 = c23727.m14573();
            ArrayDeque arrayDeque3 = this.f18102;
            if (zM14573) {
                abstractC19032 = (AbstractC19032) arrayDeque.pollFirst();
                abstractC19032.m14567(4);
            } else {
                mo15954((C19703) c23727);
                if (mo15958()) {
                    InterfaceC15266 interfaceC15266Mo15957 = mo15957();
                    abstractC19032 = (AbstractC19032) arrayDeque.pollFirst();
                    abstractC19032.m43231(c23727.f72706, interfaceC15266Mo15957, C14849.FOREVER_NS);
                } else {
                    c23727.mo7();
                    arrayDeque3.add(c23727);
                }
            }
            c23727.mo7();
            arrayDeque3.add(c23727);
            return abstractC19032;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15953(AbstractC19032 abstractC19032) {
        abstractC19032.mo7();
        this.f18103.add(abstractC19032);
    }

    @Override // p067l.InterfaceC3681
    public void flush() {
        ArrayDeque arrayDeque;
        this.f18104 = 0L;
        this.f18106 = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.f18108;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.f18102;
            if (zIsEmpty) {
                break;
            }
            C23726 c23726 = (C23726) arrayDeque2.poll();
            String str = C5792.f14228;
            c23726.mo7();
            arrayDeque.add(c23726);
        }
        C23726 c23727 = this.f18105;
        if (c23727 != null) {
            c23727.mo7();
            arrayDeque.add(c23727);
            this.f18105 = null;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC19032 m15956() {
        return (AbstractC19032) this.f18103.pollFirst();
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m15955() {
        return this.f18106;
    }
}
