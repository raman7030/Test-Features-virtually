package l;

/* JADX INFO: renamed from: l.ܳۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C14268 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f42969;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f42970;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42971;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f42972;

    /* JADX INFO: renamed from: ᩳ */
    public void mo8964() {
        throw null;
    }

    public C14268(Object obj) {
        this.f42969 = obj;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33915() {
        if (this.f42972 || this.f42971) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f42969);
        }
        this.f42972 = true;
        mo8964();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m33916() {
        if (this.f42972 || this.f42971) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f42969);
        }
        this.f42971 = true;
        mo8963();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33914() {
        return this.f42972 || this.f42971;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33913(int i) {
        this.f42970 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33912() {
        return this.f42970;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo8963() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f42969);
    }
}
