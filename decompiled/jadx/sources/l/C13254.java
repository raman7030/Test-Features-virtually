package l;

/* JADX INFO: renamed from: l.۬ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: X44P */
/* JADX INFO: loaded from: classes3.dex */
public final class C13254 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f39682;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4788 f39683;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f39684;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f39684 - ((C13254) obj).f39684;
    }

    public C13254(InterfaceC20758 interfaceC20758, InterfaceC4788 interfaceC4788, int i) {
        this.f39682 = interfaceC20758;
        this.f39683 = interfaceC4788;
        this.f39684 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13254)) {
            return false;
        }
        C13254 c13254 = (C13254) obj;
        return this.f39682.equals(c13254.f39682) && this.f39683.equals(c13254.f39683) && this.f39684 == c13254.f39684;
    }

    public final int hashCode() {
        return C11003.hash(this.f39682, this.f39683, Integer.valueOf(this.f39684));
    }
}
