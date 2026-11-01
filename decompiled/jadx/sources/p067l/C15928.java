package p067l;

/* JADX INFO: renamed from: l.ܳۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public class C15928 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f46062;

    /* JADX INFO: renamed from: ۧ */
    public int f46063;

    /* JADX INFO: renamed from: ܽ */
    public boolean f46064;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f46065;

    /* JADX INFO: renamed from: ᩳ */
    public void mo11032() {
        throw null;
    }

    public C15928(Object obj) {
        this.f46062 = obj;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m36048() {
        if (this.f46065 || this.f46064) {
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f46062);
        }
        this.f46065 = true;
        mo11032();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m36049() {
        if (this.f46065 || this.f46064) {
            throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f46062);
        }
        this.f46064 = true;
        mo11031();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m36047() {
        return this.f46065 || this.f46064;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36046(int i) {
        this.f46063 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m36045() {
        return this.f46063;
    }

    /* JADX INFO: renamed from: ܽ */
    public void mo11031() {
        throw new UnsupportedOperationException("It is not supported to send an error for " + this.f46062);
    }
}
