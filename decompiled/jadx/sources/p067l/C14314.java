package p067l;

/* JADX INFO: renamed from: l.۫ᩳۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S776 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14314 extends C12210 {

    /* JADX INFO: renamed from: ܳ */
    public final C23662 f40905;

    /* JADX INFO: renamed from: ᩻ */
    public final C17666 f40906;

    public C14314(C23662 c23662, C17666 c17666) {
        super(c23662.m52618());
        this.f40905 = c23662;
        this.f40906 = c17666;
    }

    @Override // p067l.C12210
    /* JADX INFO: renamed from: ۧ */
    public final C19015 mo28190() {
        return this.f40905.m52619();
    }

    @Override // p067l.C12210
    /* JADX INFO: renamed from: ֫ */
    public final int mo28184(String str) {
        return this.f40905.m52616(str);
    }

    @Override // p067l.C12210
    /* JADX INFO: renamed from: ֫ */
    public final int mo28183(int i, String str) {
        Integer numM35578 = C15654.m35578(str);
        if (numM35578 != null) {
            return numM35578.intValue();
        }
        if (!this.f40906.f52753 || str.startsWith("android:")) {
            return this.f40905.m52615(i, str);
        }
        return -1;
    }
}
