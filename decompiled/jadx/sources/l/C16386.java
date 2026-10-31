package l;

/* JADX INFO: renamed from: l.ܽۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16386 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f50419;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f50420;

    public C16386(int i, InterfaceC8522 interfaceC8522) {
        this.f50420 = interfaceC8522;
        this.f50419 = i;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f50420) * 65535) + this.f50419;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16386)) {
            return false;
        }
        C16386 c16386 = (C16386) obj;
        return this.f50420 == c16386.f50420 && this.f50419 == c16386.f50419;
    }
}
