package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܳܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AQ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16207 extends ThreadLocal {

    /* JADX INFO: renamed from: ֫ */
    public final C19561 f47697;

    public C16207(C19561 c19561) {
        this.f47697 = c19561;
    }

    @Override // java.lang.ThreadLocal
    @Deprecated
    public final Object get() {
        throw new RuntimeException("Use getZipFile() instead.");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19561 m36902() throws IOException {
        try {
            C19561 c19561 = (C19561) super.get();
            C12826.requireNonNull(c19561);
            return c19561;
        } catch (C18890 e) {
            throw ((IOException) e.getCause());
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return this.f47697.m44462();
        } catch (IOException e) {
            throw new C18890(e);
        }
    }
}
