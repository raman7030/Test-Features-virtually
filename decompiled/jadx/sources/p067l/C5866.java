package p067l;

/* JADX INFO: renamed from: l.ۘۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes2.dex */
public final class C5866 {

    /* JADX INFO: renamed from: ֫ */
    public final Throwable f14427;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC24641 f14428;

    /* JADX INFO: renamed from: ܽ */
    public final Object f14429;

    /* JADX INFO: renamed from: ܿ */
    public final Object f14430;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC17797 f14431;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5866)) {
            return false;
        }
        C5866 c5866 = (C5866) obj;
        return C13045.m29864(this.f14430, c5866.f14430) && C13045.m29864(this.f14428, c5866.f14428) && C13045.m29864(this.f14431, c5866.f14431) && C13045.m29864(this.f14429, c5866.f14429) && C13045.m29864(this.f14427, c5866.f14427);
    }

    public final int hashCode() {
        Object obj = this.f14430;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC24641 abstractC24641 = this.f14428;
        int iHashCode2 = (iHashCode + (abstractC24641 == null ? 0 : abstractC24641.hashCode())) * 31;
        InterfaceC17797 interfaceC17797 = this.f14431;
        int iHashCode3 = (iHashCode2 + (interfaceC17797 == null ? 0 : interfaceC17797.hashCode())) * 31;
        Object obj2 = this.f14429;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f14427;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f14430 + ", cancelHandler=" + this.f14428 + ", onCancellation=" + this.f14431 + ", idempotentResume=" + this.f14429 + ", cancelCause=" + this.f14427 + ')';
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5866 m13171(C5866 c5866, AbstractC24641 abstractC24641, Throwable th, int i) {
        Object obj = c5866.f14430;
        if ((i & 2) != 0) {
            abstractC24641 = c5866.f14428;
        }
        AbstractC24641 abstractC24642 = abstractC24641;
        InterfaceC17797 interfaceC17797 = c5866.f14431;
        Object obj2 = c5866.f14429;
        if ((i & 16) != 0) {
            th = c5866.f14427;
        }
        c5866.getClass();
        return new C5866(obj, abstractC24642, interfaceC17797, obj2, th);
    }

    public C5866(Object obj, AbstractC24641 abstractC24641, InterfaceC17797 interfaceC17797, Object obj2, Throwable th) {
        this.f14430 = obj;
        this.f14428 = abstractC24641;
        this.f14431 = interfaceC17797;
        this.f14429 = obj2;
        this.f14427 = th;
    }

    public /* synthetic */ C5866(Object obj, AbstractC24641 abstractC24641, InterfaceC17797 interfaceC17797, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC24641, (i & 4) != 0 ? null : interfaceC17797, (Object) null, (i & 16) != 0 ? null : th);
    }
}
