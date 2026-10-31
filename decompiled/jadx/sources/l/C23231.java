package l;

/* JADX INFO: renamed from: l.᩺᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: K5JX */
/* JADX INFO: loaded from: classes.dex */
public final class C23231 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f74648;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m51532() {
        while (!this.f74648) {
            wait();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51533() {
        this.f74648 = false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m51534() {
        boolean z = this.f74648;
        this.f74648 = true;
        if (!z) {
            notify();
        }
    }
}
