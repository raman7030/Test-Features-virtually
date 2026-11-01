package p067l;

/* JADX INFO: renamed from: l.ܽܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5AF */
/* JADX INFO: loaded from: classes5.dex */
public class C18316 implements InterfaceC18987, InterfaceC14943 {

    /* JADX INFO: renamed from: ᩸ */
    public final char f54720;

    @Override // p067l.InterfaceC12262
    /* JADX INFO: renamed from: ۖ */
    public final int mo4670() {
        return 3;
    }

    public C18316(char c) {
        this.f54720 = c;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC12262 interfaceC12262 = (InterfaceC12262) obj;
        int iCompare = Integer.compare(3, interfaceC12262.mo4670());
        if (iCompare != 0) {
            return iCompare;
        }
        return Character.compare(this.f54720, ((InterfaceC14943) interfaceC12262).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC14943) {
            return this.f54720 == ((InterfaceC14943) obj).getValue();
        }
        return false;
    }

    @Override // p067l.InterfaceC14943
    public final char getValue() {
        return this.f54720;
    }

    public final int hashCode() {
        return this.f54720;
    }
}
