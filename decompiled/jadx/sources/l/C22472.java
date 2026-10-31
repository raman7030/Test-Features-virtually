package l;

/* JADX INFO: renamed from: l.᩹ᩴۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78QG */
/* JADX INFO: loaded from: classes2.dex */
public final class C22472 extends C18239 implements Comparable {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f72776;

    public /* synthetic */ C22472(int i) {
        this();
    }

    public C22472() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C22472 c22472 = (C22472) obj;
        if (m12697() != c22472.m12697()) {
            return m12697() ? 1 : -1;
        }
        long j = this.f69997 - c22472.f69997;
        if (j == 0) {
            j = this.f72776 - c22472.f72776;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
