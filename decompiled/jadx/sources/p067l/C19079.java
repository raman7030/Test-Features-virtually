package p067l;

/* JADX INFO: renamed from: l.ܿ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: WBYW */
/* JADX INFO: loaded from: classes5.dex */
public class C19079 extends AbstractC15115 implements InterfaceC24443, InterfaceC15725 {

    /* JADX INFO: renamed from: ۤ */
    public final boolean f56931;

    @Override // p067l.AbstractC15115
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC14385 mo8872() {
        C9021.m20894(this);
        return this;
    }

    public C19079(C22039 c22039) {
        super(c22039, C12846.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f56931 = false;
    }

    @Override // p067l.InterfaceC4387
    /* JADX INFO: renamed from: ֫ */
    public final Object mo6293() {
        return get();
    }

    @Override // p067l.AbstractC15115
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14385 mo34526() {
        return this.f56931 ? this : super.mo34526();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19079) {
            C19079 c19079 = (C19079) obj;
            return m34527().equals(c19079.m34527()) && m34528().equals(c19079.m34528()) && m34529().equals(c19079.m34529()) && C13045.m29864(this.f43150, c19079.f43150);
        }
        if (obj instanceof InterfaceC15725) {
            return obj.equals(mo34526());
        }
        return false;
    }

    public final int hashCode() {
        return m34529().hashCode() + ((m34528().hashCode() + (m34527().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC14385 interfaceC14385Mo34526 = mo34526();
        if (interfaceC14385Mo34526 != this) {
            return interfaceC14385Mo34526.toString();
        }
        return "property " + m34528() + " (Kotlin reflection is not available)";
    }
}
