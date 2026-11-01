package p067l;

/* JADX INFO: renamed from: l.᩹ᩳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 97F2 */
/* JADX INFO: loaded from: classes.dex */
public class C23697 extends C3724 implements Comparable {
    /* JADX INFO: renamed from: ܿ */
    public boolean mo6581() {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((String) this.f22917).compareTo((String) ((C23697) obj).f22917);
    }

    public C23697(int i, String str) {
        super(Integer.valueOf(i), str);
    }

    @Override // p067l.C8537
    public int hashCode() {
        return (((String) this.f22917).hashCode() * 11) + m7172();
    }

    @Override // p067l.C8537
    public boolean equals(Object obj) {
        if (obj instanceof C23697) {
            return ((String) this.f22917).equals((String) ((C23697) obj).f22917);
        }
        return false;
    }

    @Override // p067l.C8537
    public String toString() {
        if (!C12949.m29678(EnumC4231.CP_INDEX)) {
            return (String) this.f22917;
        }
        return String.format("#%-4d /* %s */", Integer.valueOf(m7172()), (String) this.f22917);
    }
}
