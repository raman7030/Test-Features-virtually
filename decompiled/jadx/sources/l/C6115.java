package l;

/* JADX INFO: renamed from: l.ۛܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 8412 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6115 extends AbstractC11760 {
    @Override // l.AbstractC11760, java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f35100.compareTo(((AbstractC11760) obj).f35100);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6115 m17027(String str, EnumC16866 enumC16866) {
        return new C6115(str.toString().replace('.', '/') + enumC16866.f51754);
    }

    public C6115(String str) {
        super(str);
        if (str.endsWith("/")) {
            throw new IllegalArgumentException(str);
        }
    }

    public C6115(C10349 c10349, String str) {
        this(C9045.m23341(new StringBuilder(), c10349.f35100, str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10349 m17028() {
        String str = this.f35100;
        return new C10349(str.substring(0, str.lastIndexOf(47) + 1));
    }

    @Override // l.AbstractC11760
    public final String toString() {
        return C9045.m23341(new StringBuilder("RelativeFile["), this.f35100, "]");
    }
}
