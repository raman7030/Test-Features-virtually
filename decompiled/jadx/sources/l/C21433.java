package l;

/* JADX INFO: renamed from: l.᩸۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes4.dex */
public final class C21433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f69007;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f69008;

    public C21433(long j, String str) {
        if (j <= 0) {
            throw new IllegalArgumentException("Expected library length must be positive");
        }
        if (!str.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("Expected library SHA-256 must be lowercase hex");
        }
        this.f69007 = j;
        this.f69008 = str;
    }
}
