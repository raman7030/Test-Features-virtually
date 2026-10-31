package l;

/* JADX INFO: renamed from: l.ۙ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 38PP */
/* JADX INFO: loaded from: classes2.dex */
public final class C4909 extends Thread {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3498 f15498;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4909(AbstractC3498 abstractC3498) {
        super("ExoPlayer:SimpleDecoder");
        this.f15498 = abstractC3498;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AbstractC3498.m10678(this.f15498);
    }
}
