package l;

/* JADX INFO: renamed from: l.ۤۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes3.dex */
public class C10200 implements InterfaceC13726 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 f30649;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 f30650;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 f30651;

    public C10200(InterfaceC5966 interfaceC5966, InterfaceC5966 interfaceC5967, InterfaceC5966 interfaceC5968) {
        this.f30649 = interfaceC5966;
        this.f30650 = interfaceC5967;
        this.f30651 = interfaceC5968;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10200)) {
            return false;
        }
        C10200 c10200 = (C10200) obj;
        return C11003.equals(this.f30649, c10200.f30649) && C11003.equals(this.f30650, c10200.f30650) && C11003.equals(this.f30651, c10200.f30651);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 m25605() {
        return this.f30649;
    }

    @Override // l.InterfaceC13726
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 mo25603() {
        return this.f30650;
    }

    @Override // l.InterfaceC13726
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5966 mo25604() {
        return this.f30651;
    }

    public final int hashCode() {
        return C11003.hash(this.f30649, this.f30650, this.f30651);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(((C11611) this.f30651).get()), Long.valueOf(((C11611) this.f30650).get()), Long.valueOf(((C11611) this.f30649).get()));
    }
}
