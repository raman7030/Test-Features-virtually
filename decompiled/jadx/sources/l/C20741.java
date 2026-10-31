package l;

/* JADX INFO: renamed from: l.᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C20741 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9452 f66769;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15800 f66770;

    public C20741(C9452 c9452) {
        this.f66769 = c9452;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f66770.f48743 - ((C15800) obj).f48743;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f66770 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM15339 = C5368.m15339(string);
                sbM15339.append(this.f66770.f48741[i]);
                sbM15339.append(" ");
                string = sbM15339.toString();
            }
        }
        StringBuilder sbM19190 = C7166.m19190(string, "] ");
        sbM19190.append(this.f66770);
        return sbM19190.toString();
    }
}
