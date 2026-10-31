package l;

/* JADX INFO: renamed from: l.֨ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C1092 extends C10951 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f3989;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC22799 f3990;

    public C1092(C23670 c23670, String str) {
        super(str);
        this.f3989 = c23670.m52202();
        this.f3990 = c23670.m52217();
    }

    public C1092(long j, EnumC22799 enumC22799, String str, Exception exc) {
        super(str, exc);
        this.f3989 = j;
        this.f3990 = enumC22799;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long j = this.f3989;
        return String.format("%s (0x%08x): %s", EnumC7462.m19988(j).name(), Long.valueOf(j), super.getMessage());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m3762() {
        return this.f3989;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC22799 m3761() {
        return this.f3990;
    }
}
