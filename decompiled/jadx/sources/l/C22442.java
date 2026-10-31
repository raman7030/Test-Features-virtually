package l;

/* JADX INFO: renamed from: l.᩹ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes.dex */
public class C22442 extends C1426 implements Comparable {
    /* JADX INFO: renamed from: ܿ */
    public boolean mo4335() {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.f20043).compareTo((String) ((C22442) obj).f20043);
    }

    public C22442(int i, String str) {
        super(Integer.valueOf(i), str);
    }

    @Override // l.C6491
    public int hashCode() {
        return (((String) this.f20043).hashCode() * 11) + m4929();
    }

    @Override // l.C6491
    public boolean equals(Object obj) {
        if (obj instanceof C22442) {
            return ((String) this.f20043).equals((String) ((C22442) obj).f20043);
        }
        return false;
    }

    @Override // l.C6491
    public String toString() {
        if (!C11133.m27616(EnumC1960.CP_INDEX)) {
            return (String) this.f20043;
        }
        return String.format("#%-4d /* %s */", Integer.valueOf(m4929()), (String) this.f20043);
    }
}
