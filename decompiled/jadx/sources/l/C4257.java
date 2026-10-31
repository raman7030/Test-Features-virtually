package l;

/* JADX INFO: renamed from: l.ۘ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4R6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4257 implements AutoCloseable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f13793;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f13794;

    public C4257(String str) {
        this.f13794 = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (C19780.f63862) {
            if (this.f13793) {
                return;
            }
            this.f13793 = true;
            Integer num = (Integer) C19780.f63861.get(this.f13794);
            if (num == null || num.intValue() <= 1) {
                C19780.f63861.remove(this.f13794);
                C19780.f63862.notifyAll();
            } else {
                C19780.f63861.put(this.f13794, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
