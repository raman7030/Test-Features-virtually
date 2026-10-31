package l;

/* JADX INFO: renamed from: l.ۖۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC2420 implements Runnable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0302 f7702;

    public RunnableC2420(AbstractC0302 abstractC0302) {
        this.f7702 = abstractC0302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f7702.f1667) {
            obj = this.f7702.f1661;
            this.f7702.f1661 = AbstractC0302.f1659;
        }
        this.f7702.mo1669(obj);
    }
}
