package l;

import java.util.Deque;

/* JADX INFO: renamed from: l.ܽۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: EAH2 */
/* JADX INFO: loaded from: classes4.dex */
public class C16383 implements InterfaceC9994 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC5760 f50409 = EnumC5760.IDLE;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f50410;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC9178 f50411;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C4239 f50412;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C4390 f50413;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C4239 f50414;

    @Override // l.InterfaceC9994
    public final synchronized EnumC5760 getState() {
        return this.f50409;
    }

    @Override // l.InterfaceC9994
    public final synchronized void invalidate() {
        this.f50409 = EnumC5760.INVALID;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean mo25151(Deque deque) {
        EnumC5760 enumC5760 = this.f50409;
        if (enumC5760 == EnumC5760.EVICTION) {
            this.f50409 = EnumC5760.IDLE;
            return true;
        }
        if (enumC5760 == EnumC5760.EVICTION_RETURN_TO_HEAD) {
            this.f50409 = EnumC5760.IDLE;
            deque.offerFirst(this);
        }
        return false;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ۖۧ */
    public final synchronized boolean mo25152() {
        if (this.f50409 != EnumC5760.IDLE) {
            return false;
        }
        this.f50409 = EnumC5760.EVICTION;
        return true;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ۬֫ */
    public final synchronized boolean mo25154() {
        EnumC5760 enumC5760 = this.f50409;
        if (enumC5760 != EnumC5760.ALLOCATED && enumC5760 != EnumC5760.RETURNING) {
            return false;
        }
        this.f50409 = EnumC5760.IDLE;
        this.f50412 = this.f50411.instant();
        this.f50413.getClass();
        return true;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ᩳ֫ */
    public final synchronized boolean mo25156() {
        EnumC5760 enumC5760 = this.f50409;
        if (enumC5760 == EnumC5760.IDLE) {
            this.f50409 = EnumC5760.ALLOCATED;
            this.f50414 = this.f50411.instant();
            return true;
        }
        if (enumC5760 == EnumC5760.EVICTION) {
            this.f50409 = EnumC5760.EVICTION_RETURN_TO_HEAD;
        }
        return false;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ᩷֫ */
    public final synchronized void mo25158() {
        this.f50409 = EnumC5760.RETURNING;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC9994 interfaceC9994 = (InterfaceC9994) obj;
        int iCompareTo = this.f50412.compareTo(interfaceC9994.mo25155());
        return iCompareTo == 0 ? System.identityHashCode(this) - System.identityHashCode(interfaceC9994) : iCompareTo;
    }

    public C16383(Object obj) {
        AbstractC9178 abstractC9178SystemUTC = AbstractC9178.systemUTC();
        this.f50411 = abstractC9178SystemUTC;
        C4239 c4239Instant = abstractC9178SystemUTC.instant();
        this.f50414 = c4239Instant;
        this.f50412 = c4239Instant;
        this.f50413 = C4390.f14074;
        this.f50410 = obj;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ᩴۧ */
    public final C2828 mo25157() {
        C2828 c2828Between = C2828.between(this.f50412, this.f50411.instant());
        return c2828Between.isNegative() ? C2828.ZERO : c2828Between;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ܶ֫ */
    public final C4239 mo25155() {
        return this.f50412;
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ᩹ۧ */
    public final C2828 mo25159() {
        C4239 c4239 = this.f50412;
        C4239 c42310 = this.f50414;
        if (c4239.isAfter(c42310)) {
            return C2828.between(c42310, c4239);
        }
        return C2828.between(c42310, C4239.now());
    }

    @Override // l.InterfaceC9994
    /* JADX INFO: renamed from: ۙۧ */
    public final Object mo25153() {
        return this.f50410;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Object: ");
        sb.append(this.f50410.toString());
        sb.append(", State: ");
        synchronized (this) {
            sb.append(this.f50409.toString());
        }
        return sb.toString();
    }
}
