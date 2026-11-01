package p067l;

/* JADX INFO: renamed from: l.ۘۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57TP */
/* JADX INFO: loaded from: classes2.dex */
public final class C6057 {

    /* JADX INFO: renamed from: ֫ */
    public volatile boolean f15208;

    /* JADX INFO: renamed from: ۧ */
    public volatile boolean f15209;

    /* JADX INFO: renamed from: ܽ */
    public final Object f15210;

    /* JADX INFO: renamed from: ܿ */
    public volatile Object f15211;

    /* JADX INFO: renamed from: ᩳ */
    public volatile boolean f15212;

    public /* synthetic */ C6057(int i) {
        this();
    }

    public C6057() {
        this.f15209 = false;
        this.f15208 = false;
        this.f15212 = false;
        this.f15210 = new Object();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m13647(Object obj) {
        synchronized (this.f15210) {
            if (this.f15208 || this.f15212) {
                return false;
            }
            this.f15211 = obj;
            this.f15209 = true;
            this.f15210.notifyAll();
            return true;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m13649() {
        Object obj;
        synchronized (this.f15210) {
            while (!this.f15209 && !this.f15208) {
                this.f15210.wait();
            }
            obj = this.f15209 ? this.f15211 : null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13646() {
        synchronized (this.f15210) {
            this.f15208 = true;
            this.f15210.notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m13648() {
        synchronized (this.f15210) {
            this.f15212 = true;
        }
    }
}
