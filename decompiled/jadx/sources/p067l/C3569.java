package p067l;

/* JADX INFO: renamed from: l.֨ܿۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3569 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f7244;

    /* JADX INFO: renamed from: ۧ */
    public final int f7245;

    /* JADX INFO: renamed from: ܽ */
    public final C18866[] f7246;

    /* JADX INFO: renamed from: ܿ */
    public final C15690 f7247;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11617[] f7248;

    public C3569(C18866[] c18866Arr, InterfaceC11617[] interfaceC11617Arr, C15690 c15690, Object obj) {
        C23877.m52957(c18866Arr.length == interfaceC11617Arr.length);
        this.f7246 = c18866Arr;
        this.f7248 = (InterfaceC11617[]) interfaceC11617Arr.clone();
        this.f7247 = c15690;
        this.f7244 = obj;
        this.f7245 = c18866Arr.length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6563(int i) {
        return this.f7246[i] != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m6564(C3569 c3569, int i) {
        return c3569 != null && C12826.equals(this.f7246[i], c3569.f7246[i]) && C12826.equals(this.f7248[i], c3569.f7248[i]);
    }
}
