package p067l;

import java.util.Deque;

/* JADX INFO: renamed from: l.ܽۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: EAH2 */
/* JADX INFO: loaded from: classes4.dex */
public class C17938 implements InterfaceC11866 {

    /* JADX INFO: renamed from: ۗ */
    public EnumC7842 f53581 = EnumC7842.IDLE;

    /* JADX INFO: renamed from: ۙ */
    public final Object f53582;

    /* JADX INFO: renamed from: ۬ */
    public final AbstractC11092 f53583;

    /* JADX INFO: renamed from: ᩶ */
    public volatile C6398 f53584;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C6540 f53585;

    /* JADX INFO: renamed from: ᩹ */
    public volatile C6398 f53586;

    @Override // p067l.InterfaceC11866
    public final synchronized EnumC7842 getState() {
        return this.f53581;
    }

    @Override // p067l.InterfaceC11866
    public final synchronized void invalidate() {
        this.f53581 = EnumC7842.INVALID;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean mo27168(Deque deque) {
        EnumC7842 enumC7842 = this.f53581;
        if (enumC7842 == EnumC7842.EVICTION) {
            this.f53581 = EnumC7842.IDLE;
            return true;
        }
        if (enumC7842 == EnumC7842.EVICTION_RETURN_TO_HEAD) {
            this.f53581 = EnumC7842.IDLE;
            deque.offerFirst(this);
        }
        return false;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ۖۧ */
    public final synchronized boolean mo27169() {
        if (this.f53581 != EnumC7842.IDLE) {
            return false;
        }
        this.f53581 = EnumC7842.EVICTION;
        return true;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ۬֫ */
    public final synchronized boolean mo27171() {
        EnumC7842 enumC7842 = this.f53581;
        if (enumC7842 != EnumC7842.ALLOCATED && enumC7842 != EnumC7842.RETURNING) {
            return false;
        }
        this.f53581 = EnumC7842.IDLE;
        this.f53584 = this.f53583.instant();
        this.f53585.getClass();
        return true;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ᩳ֫ */
    public final synchronized boolean mo27173() {
        EnumC7842 enumC7842 = this.f53581;
        if (enumC7842 == EnumC7842.IDLE) {
            this.f53581 = EnumC7842.ALLOCATED;
            this.f53586 = this.f53583.instant();
            return true;
        }
        if (enumC7842 == EnumC7842.EVICTION) {
            this.f53581 = EnumC7842.EVICTION_RETURN_TO_HEAD;
        }
        return false;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ᩷֫ */
    public final synchronized void mo27175() {
        this.f53581 = EnumC7842.RETURNING;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC11866 interfaceC11866 = (InterfaceC11866) obj;
        int iCompareTo = this.f53584.compareTo(interfaceC11866.mo27172());
        return iCompareTo == 0 ? System.identityHashCode(this) - System.identityHashCode(interfaceC11866) : iCompareTo;
    }

    public C17938(Object obj) {
        AbstractC11092 abstractC11092SystemUTC = AbstractC11092.systemUTC();
        this.f53583 = abstractC11092SystemUTC;
        C6398 c6398Instant = abstractC11092SystemUTC.instant();
        this.f53586 = c6398Instant;
        this.f53584 = c6398Instant;
        this.f53585 = C6540.f16890;
        this.f53582 = obj;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ᩴۧ */
    public final C5057 mo27174() {
        C5057 c5057Between = C5057.between(this.f53584, this.f53583.instant());
        return c5057Between.isNegative() ? C5057.ZERO : c5057Between;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ܶ֫ */
    public final C6398 mo27172() {
        return this.f53584;
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ᩹ۧ */
    public final C5057 mo27176() {
        C6398 c6398 = this.f53584;
        C6398 c6399 = this.f53586;
        if (c6398.isAfter(c6399)) {
            return C5057.between(c6399, c6398);
        }
        return C5057.between(c6399, C6398.now());
    }

    @Override // p067l.InterfaceC11866
    /* JADX INFO: renamed from: ۙۧ */
    public final Object mo27170() {
        return this.f53582;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Object: ");
        sb.append(this.f53582.toString());
        sb.append(", State: ");
        synchronized (this) {
            sb.append(this.f53581.toString());
        }
        return sb.toString();
    }
}
