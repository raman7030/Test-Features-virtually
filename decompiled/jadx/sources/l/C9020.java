package l;

/* JADX INFO: renamed from: l.ۡܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5YB */
/* JADX INFO: loaded from: classes4.dex */
public class C9020 implements InterfaceC17486, InterfaceC13936 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f27383;

    @Override // l.InterfaceC10410
    /* JADX INFO: renamed from: ۖ */
    public final int mo2302() {
        return 4;
    }

    public C9020(int i) {
        this.f27383 = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC10410 interfaceC10410 = (InterfaceC10410) obj;
        int iCompare = Integer.compare(4, interfaceC10410.mo2302());
        if (iCompare != 0) {
            return iCompare;
        }
        return Integer.compare(this.f27383, ((InterfaceC13936) interfaceC10410).getValue());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC13936) {
            return this.f27383 == ((InterfaceC13936) obj).getValue();
        }
        return false;
    }

    @Override // l.InterfaceC13936
    public final int getValue() {
        return this.f27383;
    }

    public final int hashCode() {
        return this.f27383;
    }
}
