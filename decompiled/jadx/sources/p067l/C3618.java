package p067l;

/* JADX INFO: renamed from: l.֨ᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M7HK */
/* JADX INFO: loaded from: classes2.dex */
public final class C3618 implements InterfaceC20093, InterfaceC22105 {

    /* JADX INFO: renamed from: ֫ */
    public final String f7489;

    /* JADX INFO: renamed from: ۧ */
    public final String f7490;

    public C3618(String str, String str2) {
        this.f7490 = str;
        this.f7489 = str2;
    }

    @Override // p067l.InterfaceC20093
    /* JADX INFO: renamed from: ֫ */
    public final String mo6780() {
        return this.f7489;
    }

    @Override // p067l.InterfaceC20093
    public final String getPassword() {
        return this.f7490;
    }

    @Override // p067l.InterfaceC20093
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6782() {
        return this.f7490 != null;
    }

    @Override // p067l.InterfaceC20093
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo6783() {
        return this.f7489 != null;
    }

    @Override // p067l.InterfaceC22105
    /* JADX INFO: renamed from: ֫ */
    public final String[] mo6781(String[] strArr) {
        String str = this.f7490;
        if (str == null || strArr.length <= 0) {
            return null;
        }
        return new String[]{str};
    }
}
