package l;

/* JADX INFO: renamed from: l.֨ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1263 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f4474;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f4475;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17359[] f4476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14017 f4477;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9731[] f4478;

    public C1263(C17359[] c17359Arr, InterfaceC9731[] interfaceC9731Arr, C14017 c14017, Object obj) {
        C22632.m50631(c17359Arr.length == interfaceC9731Arr.length);
        this.f4476 = c17359Arr;
        this.f4478 = (InterfaceC9731[]) interfaceC9731Arr.clone();
        this.f4477 = c14017;
        this.f4474 = obj;
        this.f4475 = c17359Arr.length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4319(int i) {
        return this.f4476[i] != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4320(C1263 c1263, int i) {
        return c1263 != null && C11003.equals(this.f4476[i], c1263.f4476[i]) && C11003.equals(this.f4478[i], c1263.f4478[i]);
    }
}
