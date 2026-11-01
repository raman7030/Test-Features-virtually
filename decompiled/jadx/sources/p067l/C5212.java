package p067l;

/* JADX INFO: renamed from: l.ۗۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public final int f12235;

    /* JADX INFO: renamed from: ᩸ */
    public final int f12236;

    /* JADX INFO: renamed from: ᩹ */
    public final int f12237;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5212 c5212 = (C5212) obj;
        int iCompare = Integer.compare(this.f12235, c5212.f12235);
        return iCompare == 0 ? Integer.compare(this.f12237, c5212.f12237) : iCompare;
    }

    public C5212(int i, int i2, int i3) {
        this.f12237 = i;
        this.f12235 = i2;
        this.f12236 = i3;
    }

    public final String toString() {
        return "Group" + this.f12237 + " " + this.f12235 + "-" + this.f12236;
    }
}
