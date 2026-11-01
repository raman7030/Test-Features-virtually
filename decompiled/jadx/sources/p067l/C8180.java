package p067l;

/* JADX INFO: renamed from: l.ۛܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8180 extends AbstractC13545 {
    @Override // p067l.AbstractC13545, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f38099.compareTo(((AbstractC13545) obj).f38099);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8180 m18958(String str, EnumC18398 enumC18398) {
        return new C8180(str.toString().replace('.', '/') + enumC18398.f54934);
    }

    public C8180(String str) {
        super(str);
        if (str.endsWith("/")) {
            throw new IllegalArgumentException(str);
        }
    }

    public C8180(C12204 c12204, String str) {
        this(C10965.m25286(new StringBuilder(), c12204.f38099, str));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12204 m18959() {
        String str = this.f38099;
        return new C12204(str.substring(0, str.lastIndexOf(47) + 1));
    }

    @Override // p067l.AbstractC13545
    public final String toString() {
        return C10965.m25286(new StringBuilder("RelativeFile["), this.f38099, "]");
    }
}
