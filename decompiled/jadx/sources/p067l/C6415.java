package p067l;

/* JADX INFO: renamed from: l.ۘ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6415 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f16610;

    /* JADX INFO: renamed from: ᩹ */
    public final String f16611;

    public C6415(String str) {
        this.f16611 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (C21168.f66500) {
            if (this.f16610) {
                return;
            }
            this.f16610 = true;
            Integer num = (Integer) C21168.f66499.get(this.f16611);
            if (num == null || num.intValue() <= 1) {
                C21168.f66499.remove(this.f16611);
                C21168.f66500.notifyAll();
            } else {
                C21168.f66499.put(this.f16611, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
