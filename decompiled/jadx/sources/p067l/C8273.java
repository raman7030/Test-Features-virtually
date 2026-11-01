package p067l;

/* JADX INFO: renamed from: l.ۛᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: P5T3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8273 extends C16299 {

    /* JADX INFO: renamed from: ۤ */
    public String f21915;

    /* JADX INFO: renamed from: ۫ */
    public String f21916;

    public C8273(C14978 c14978, String str, String str2) {
        super(c14978);
        this.f21915 = str;
        this.f21916 = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("FailedPredicateException(");
        sb.append(this.f21915);
        sb.append(",{");
        return C10965.m25286(sb, this.f21916, "}?)");
    }
}
