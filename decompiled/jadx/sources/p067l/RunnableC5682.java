package p067l;

/* JADX INFO: renamed from: l.ۗ᩷ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5682 implements Runnable {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f13853;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C18107 f13854;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ int f13855;

    public RunnableC5682(C18107 c18107, int i, int i2) {
        this.f13854 = c18107;
        this.f13853 = i;
        this.f13855 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C18107 c18107 = this.f13854;
        if (this.f13853 != c18107.f54072.get()) {
            return;
        }
        if (c18107.m41266()) {
            C7050.m16212(this);
        } else {
            c18107.onItemClick(null, null, this.f13855, 0L);
        }
    }
}
