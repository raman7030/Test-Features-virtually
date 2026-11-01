package p067l;

/* JADX INFO: renamed from: l.ܺܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes4.dex */
public final class C17557 {

    /* JADX INFO: renamed from: ֫ */
    public String[] f52485;

    /* JADX INFO: renamed from: ۧ */
    public boolean f52486;

    /* JADX INFO: renamed from: ܽ */
    public boolean f52487;

    /* JADX INFO: renamed from: ᩳ */
    public String[] f52488;

    public C17557(boolean z) {
        this.f52487 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39968(C22253... c22253Arr) {
        if (!this.f52487) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c22253Arr.length];
        for (int i = 0; i < c22253Arr.length; i++) {
            strArr[i] = c22253Arr[i].f70363;
        }
        m39966(strArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39966(String... strArr) {
        if (!this.f52487) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f52485 = (String[]) strArr.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39967(EnumC3301... enumC3301Arr) {
        if (!this.f52487) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC3301Arr.length];
        for (int i = 0; i < enumC3301Arr.length; i++) {
            strArr[i] = enumC3301Arr[i].f6453;
        }
        m39969(strArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39969(String... strArr) {
        if (!this.f52487) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f52488 = (String[]) strArr.clone();
    }
}
