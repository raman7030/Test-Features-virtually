package p067l;

/* JADX INFO: renamed from: l.᩷۠ */
/* JADX INFO: compiled from: E1CE */
/* JADX INFO: loaded from: classes4.dex */
public final class C1871 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1311 f69453;

    /* JADX INFO: renamed from: ᩹ */
    public C1626 f69454;

    public C1871(C1311 c1311) {
        this.f69453 = c1311;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f69454.f51881 - ((C1626) obj).f51881;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f69454 != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM17248 = C7470.m17248(string);
                sbM17248.append(this.f69454.f51879[i]);
                sbM17248.append(" ");
                string = sbM17248.toString();
            }
        }
        StringBuilder sbM21133 = C9179.m21133(string, "] ");
        sbM21133.append(this.f69454);
        return sbM21133.toString();
    }
}
