package l;

/* JADX INFO: renamed from: l.᩺ܶ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E5GV */
/* JADX INFO: loaded from: classes.dex */
public final class C23062 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f74186;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18522 f74187;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51221(C23062 c23062, C1547 c1547, C23062 c23063) {
        c23062.getClass();
        c1547.m5301(c23062.f74187.f16032 - (c23063 == null ? 0 : c23063.f74187.f16032));
        c1547.m5301(c23062.f74186);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m51220(C23062 c23062, int i, C23062 c23063) {
        int i2;
        if (c23063 == null) {
            i2 = 0;
        } else {
            c23062.getClass();
            i2 = c23063.f74187.f16032;
        }
        return C11166.m27697(c23062.f74186) + C11166.m27697(c23062.f74187.f16032 - i2) + i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C18522 c18522 = ((C23062) obj).f74187;
        C18522 c18523 = this.f74187;
        int iCompareTo = c18523.f57394.compareTo(c18522.f57394);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = c18523.f57398.compareTo(c18522.f57398);
        return iCompareTo2 != 0 ? iCompareTo2 : c18523.f57397.compareTo(c18522.f57397);
    }

    public C23062(C18522 c18522, int i) {
        this.f74187 = c18522;
        this.f74186 = i;
    }

    public C23062(C3454 c3454, C10720 c10720, C23062 c23062) {
        this.f74187 = (C18522) c3454.f10937.m1314(c10720.m26903() + (c23062 == null ? 0 : c23062.f74187.f16032));
        this.f74186 = c10720.m26903();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51223() {
        return (EnumC7233.STATIC.getValue() & this.f74186) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51222() {
        return (EnumC7233.FINAL.getValue() & this.f74186) != 0;
    }
}
