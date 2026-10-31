package l;

/* JADX INFO: renamed from: l.۠ۜ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: XAQ5 */
/* JADX INFO: loaded from: classes3.dex */
public class C8000 extends AbstractC16466 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC16466 f24706;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24707;

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int mo21317() {
        return 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8000 m21314(AbstractC16466 abstractC16466, int i) {
        if (i == Integer.MAX_VALUE && abstractC16466 == null) {
            return C21198.f68319;
        }
        return new C8000(abstractC16466, i);
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC16466 mo21315(int i) {
        return this.f24706;
    }

    @Override // l.AbstractC16466
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo21316(int i) {
        return this.f24707;
    }

    @Override // l.AbstractC16466
    public boolean equals(Object obj) {
        AbstractC16466 abstractC16466;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8000)) {
            return false;
        }
        if (this.f50608 != ((AbstractC16466) obj).f50608) {
            return false;
        }
        C8000 c8000 = (C8000) obj;
        return this.f24707 == c8000.f24707 && (abstractC16466 = this.f24706) != null && abstractC16466.equals(c8000.f24706);
    }

    public String toString() {
        AbstractC16466 abstractC16466 = this.f24706;
        String string = abstractC16466 != null ? abstractC16466.toString() : "";
        int length = string.length();
        int i = this.f24707;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8000(AbstractC16466 abstractC16466, int i) {
        int iM6873;
        if (abstractC16466 == null) {
            iM6873 = C2093.m6873(1, 0);
        } else {
            iM6873 = C2093.m6873(C2093.m6876(C2093.m6874(1, abstractC16466), i), 2);
        }
        super(iM6873);
        this.f24706 = abstractC16466;
        this.f24707 = i;
    }
}
