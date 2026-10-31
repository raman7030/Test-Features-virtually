package l;

/* JADX INFO: renamed from: l.ܺܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54GG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15981 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String[] f49322;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49323;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f49324;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String[] f49325;

    public C15981(boolean z) {
        this.f49324 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37783(C20922... c20922Arr) {
        if (!this.f49324) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        String[] strArr = new String[c20922Arr.length];
        for (int i = 0; i < c20922Arr.length; i++) {
            strArr[i] = c20922Arr[i].f67678;
        }
        m37781(strArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37781(String... strArr) {
        if (!this.f49324) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f49322 = (String[]) strArr.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37782(EnumC0981... enumC0981Arr) {
        if (!this.f49324) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        String[] strArr = new String[enumC0981Arr.length];
        for (int i = 0; i < enumC0981Arr.length; i++) {
            strArr[i] = enumC0981Arr[i].f3678;
        }
        m37784(strArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37784(String... strArr) {
        if (!this.f49324) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f49325 = (String[]) strArr.clone();
    }
}
