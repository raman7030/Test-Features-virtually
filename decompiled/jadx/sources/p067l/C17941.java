package p067l;

/* JADX INFO: renamed from: l.ܽۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C17941 {

    /* JADX INFO: renamed from: ֫ */
    public final int f53591;

    /* JADX INFO: renamed from: ۧ */
    public final Object f53592;

    public C17941(int i, InterfaceC10467 interfaceC10467) {
        this.f53592 = interfaceC10467;
        this.f53591 = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f53592) * 65535) + this.f53591;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17941)) {
            return false;
        }
        C17941 c17941 = (C17941) obj;
        return this.f53592 == c17941.f53592 && this.f53591 == c17941.f53591;
    }
}
