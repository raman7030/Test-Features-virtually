package p067l;

/* JADX INFO: renamed from: l.֨ۨۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 29JK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3406 extends C12776 {

    /* JADX INFO: renamed from: ᩶ */
    public long f6760;

    /* JADX INFO: renamed from: ᩹ */
    public final EnumC24036 f6761;

    public C3406(C24864 c24864, String str) {
        super(str);
        this.f6760 = c24864.m54605();
        this.f6761 = c24864.m54620();
    }

    public C3406(long j, EnumC24036 enumC24036, String str, Exception exc) {
        super(str, exc);
        this.f6760 = j;
        this.f6761 = enumC24036;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        long j = this.f6760;
        return String.format("%s (0x%08x): %s", EnumC9460.m21963(j).name(), Long.valueOf(j), super.getMessage());
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m6034() {
        return this.f6760;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC24036 m6033() {
        return this.f6761;
    }
}
