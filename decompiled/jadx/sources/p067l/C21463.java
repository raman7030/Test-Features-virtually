package p067l;

/* JADX INFO: renamed from: l.᩶ۢܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5RH */
/* JADX INFO: loaded from: classes4.dex */
public final class C21463 {

    /* JADX INFO: renamed from: ֫ */
    public C17613 f67695;

    /* JADX INFO: renamed from: ۧ */
    public boolean f67696 = true;

    public C21463(C17613 c17613) {
        this.f67695 = c17613;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48625() {
        synchronized (this) {
            this.f67695 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48626(String str) {
        synchronized (this) {
            if (this.f67695 != null) {
                C13731 c13731 = new C13731();
                c13731.m31209(str);
                this.f67695.m40105(c13731);
                this.f67696 = false;
                this.f67695 = null;
            }
        }
    }
}
