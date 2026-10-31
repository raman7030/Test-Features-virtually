package l;

/* JADX INFO: renamed from: l.ۘۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GANU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3680 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable f11623;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC23435 f11624;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f11625;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f11626;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16233 f11627;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3680)) {
            return false;
        }
        C3680 c3680 = (C3680) obj;
        return C11233.m27802(this.f11626, c3680.f11626) && C11233.m27802(this.f11624, c3680.f11624) && C11233.m27802(this.f11627, c3680.f11627) && C11233.m27802(this.f11625, c3680.f11625) && C11233.m27802(this.f11623, c3680.f11623);
    }

    public final int hashCode() {
        Object obj = this.f11626;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC23435 abstractC23435 = this.f11624;
        int iHashCode2 = (iHashCode + (abstractC23435 == null ? 0 : abstractC23435.hashCode())) * 31;
        InterfaceC16233 interfaceC16233 = this.f11627;
        int iHashCode3 = (iHashCode2 + (interfaceC16233 == null ? 0 : interfaceC16233.hashCode())) * 31;
        Object obj2 = this.f11625;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f11623;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f11626 + ", cancelHandler=" + this.f11624 + ", onCancellation=" + this.f11627 + ", idempotentResume=" + this.f11625 + ", cancelCause=" + this.f11623 + ')';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3680 m11209(C3680 c3680, AbstractC23435 abstractC23435, Throwable th, int i) {
        Object obj = c3680.f11626;
        if ((i & 2) != 0) {
            abstractC23435 = c3680.f11624;
        }
        AbstractC23435 abstractC23436 = abstractC23435;
        InterfaceC16233 interfaceC16233 = c3680.f11627;
        Object obj2 = c3680.f11625;
        if ((i & 16) != 0) {
            th = c3680.f11623;
        }
        c3680.getClass();
        return new C3680(obj, abstractC23436, interfaceC16233, obj2, th);
    }

    public C3680(Object obj, AbstractC23435 abstractC23435, InterfaceC16233 interfaceC16233, Object obj2, Throwable th) {
        this.f11626 = obj;
        this.f11624 = abstractC23435;
        this.f11627 = interfaceC16233;
        this.f11625 = obj2;
        this.f11623 = th;
    }

    public /* synthetic */ C3680(Object obj, AbstractC23435 abstractC23435, InterfaceC16233 interfaceC16233, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC23435, (i & 4) != 0 ? null : interfaceC16233, (Object) null, (i & 16) != 0 ? null : th);
    }
}
