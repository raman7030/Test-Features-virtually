package p067l;

/* JADX INFO: renamed from: l.ۤۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L7IT */
/* JADX INFO: loaded from: classes3.dex */
public class C12062 implements InterfaceC15413 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8038 f33610;

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8038 f33611;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8038 f33612;

    public C12062(InterfaceC8038 interfaceC8038, InterfaceC8038 interfaceC8039, InterfaceC8038 interfaceC80310) {
        this.f33610 = interfaceC8038;
        this.f33611 = interfaceC8039;
        this.f33612 = interfaceC80310;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12062)) {
            return false;
        }
        C12062 c12062 = (C12062) obj;
        return C12826.equals(this.f33610, c12062.f33610) && C12826.equals(this.f33611, c12062.f33611) && C12826.equals(this.f33612, c12062.f33612);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC8038 m27627() {
        return this.f33610;
    }

    @Override // p067l.InterfaceC15413
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8038 mo27625() {
        return this.f33611;
    }

    @Override // p067l.InterfaceC15413
    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC8038 mo27626() {
        return this.f33612;
    }

    public final int hashCode() {
        return C12826.hash(this.f33610, this.f33611, this.f33612);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(((C13403) this.f33612).get()), Long.valueOf(((C13403) this.f33611).get()), Long.valueOf(((C13403) this.f33610).get()));
    }
}
