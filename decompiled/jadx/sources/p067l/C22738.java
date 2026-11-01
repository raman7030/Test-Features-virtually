package p067l;

/* JADX INFO: renamed from: l.᩸۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: H72R */
/* JADX INFO: loaded from: classes4.dex */
public final class C22738 {

    /* JADX INFO: renamed from: ֫ */
    public final long f71705;

    /* JADX INFO: renamed from: ۧ */
    public final String f71706;

    public C22738(long j, String str) {
        if (j <= 0) {
            throw new IllegalArgumentException("Expected library length must be positive");
        }
        if (!str.matches("[0-9a-f]{64}")) {
            throw new IllegalArgumentException("Expected library SHA-256 must be lowercase hex");
        }
        this.f71705 = j;
        this.f71706 = str;
    }
}
