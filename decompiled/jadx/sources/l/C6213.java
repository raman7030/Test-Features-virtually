package l;

/* JADX INFO: renamed from: l.ۛᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5T3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6213 extends C14658 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f19052;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f19053;

    public C6213(C13268 c13268, String str, String str2) {
        super(c13268);
        this.f19052 = str;
        this.f19053 = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedPredicateException(");
        sb.append(this.f19052);
        sb.append(",{");
        return C9045.m23341(sb, this.f19053, "}?)");
    }
}
