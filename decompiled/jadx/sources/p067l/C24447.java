package p067l;

/* JADX INFO: renamed from: l.᩺᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes.dex */
public final class C24447 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f77391;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m53929() {
        while (!this.f77391) {
            wait();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m53930() {
        this.f77391 = false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m53931() {
        boolean z = this.f77391;
        this.f77391 = true;
        if (!z) {
            notify();
        }
    }
}
